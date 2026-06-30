/* combined.js = anti-debug-bypass.js + dump-secrets.js (для frida-inject) */

/*
 * anti-debug-bypass.js — типовые обходы анти-отладки Dex2C/VMP для Frida.
 * Грузить ПЕРЕД основным скриптом:  frida -U -f com.reddit.frontpage -l anti-debug-bypass.js -l dump-secrets.js --no-pause
 */
function log(m){ console.log('[anti-dbg] ' + m); }

// 1) ptrace(PTR_TRACEME) — частый трюк защиты; возвращаем 0.
try {
  var ptrace = Module.findExportByName(null, 'ptrace');
  if (ptrace) Interceptor.replace(ptrace, new NativeCallback(function(){ return 0; }, 'long',
    ['int','pointer','pointer','pointer']));
  log('ptrace neutralized: ' + !!ptrace);
} catch(e){ log('ptrace: ' + e); }

// 2) Детект по строкам: strstr/strcmp ищут "frida", "gum-js", "/proc/self/maps", TracerPid.
['strstr','strcmp','strcasestr'].forEach(function(fn){
  var p = Module.findExportByName(null, fn);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter: function(a){
      try {
        var s = a[1].readCString() || '';
        if (/frida|gum-js|gmain|linjector|/.test(s) ||
            /tracerpid|/i.test(s)) { this.fake = true; }
      } catch(e){}
    },
    onLeave: function(r){ if (this.fake) r.replace(ptr(fn==='strcmp'?1:0)); }
  });
});
log('string-detect hooks set');

// 3) /proc/self/status (TracerPid) и /proc/self/maps — прячем frida.
try {
  var openFns = ['open','open64','fopen'];
  openFns.forEach(function(fn){
    var p = Module.findExportByName(null, fn); if(!p) return;
    Interceptor.attach(p, { onEnter: function(a){
      try { var path = a[0].readCString() || '';
        if (path.indexOf('/proc/') >=0 && (path.indexOf('maps')>=0 || path.indexOf('status')>=0))
          log('proc read: ' + path);
      } catch(e){}
    }});
  });
} catch(e){}

// 4) Java: Debug.isDebuggerConnected / ApplicationInfo.FLAG_DEBUGGABLE
setTimeout(function(){
  try { Java.perform(function(){
    var D = Java.use('android.os.Debug');
    D.isDebuggerConnected.implementation = function(){ return false; };
    log('Debug.isDebuggerConnected -> false');
  }); } catch(e){ log('java anti-dbg: ' + e); }
}, 0);

/* ==================== dump-secrets.js ==================== */
/*
 * dump-secrets.js — Frida-инструментарий для libZeninCPP.so (Zenin External, Dex2C/VMP)
 * --------------------------------------------------------------------------------------
 * Цель: вытащить то, что зашифровано и расшифровывается ТОЛЬКО в нативном коде:
 *   - адрес сервера авторизации и тело/заголовки запроса проверки ключа ZE-********
 *   - целевой пакет игры (через PackageManager / ComponentName / запуск Intent)
 *   - криптоключи (AES) и расшифрованные строки
 *
 * Почему именно так: логика вынесена в libZeninCPP.so, но нативный код ВЫНУЖДЕН
 * обращаться к Android-классам (URL, HttpURLConnection, Cipher, ...) и к JNI-функциям
 * (NewStringUTF, RegisterNatives) — на этой границе всё видно.
 *
 * Запуск (рутованный телефон/эмулятор с frida-server):
 *   frida -U -f com.reddit.frontpage -l dump-secrets.js --no-pause
 * либо attach:
 *   frida -U -n "Zenin External" -l dump-secrets.js
 *
 * Настройки ниже — включай/выключай нужные группы хуков.
 */

const CFG = {
  hookNetwork:   true,   // URL / HttpURLConnection / заголовки / тело
  hookCrypto:    true,   // Cipher / SecretKeySpec / IvParameterSpec / Mac
  hookBase64:    true,   // android.util.Base64
  hookFiles:     true,   // java.io.File (пути /sdcard/Zenin/cfg ...)
  hookPkg:       true,   // PackageManager / ComponentName / Intent (целевая игра)
  hookJavaDecoders: true,// XOR-декодеры строк m####(short[],int,int,int)
  hookJNIStrings:true,   // NewStringUTF/NewString в libart (строки из натива)
  hookRegisterNatives: true, // карта «нативный адрес ↔ Java-метод»
  hookDlopen:    true,   // дождаться загрузки libZeninCPP.so
  maxBytesHex:   256,    // сколько байт буфера печатать
};

function ts() { return '[' + new Date().toISOString().substr(11, 12) + ']'; }
function log(tag, msg) { console.log(ts() + ' ' + tag + ' ' + msg); }
function hex(bytes) {
  try {
    if (!bytes) return 'null';
    var arr = Java.array('byte', bytes);
    var n = Math.min(arr.length, CFG.maxBytesHex), s = '';
    for (var i = 0; i < n; i++) { var b = (arr[i] & 0xff).toString(16); s += (b.length<2?'0':'')+b; }
    return s + (arr.length > n ? '…(' + arr.length + 'B)' : '');
  } catch (e) { return '<hex err ' + e + '>'; }
}
function utf8(bytes) {
  try { return Java.use('java.lang.String').$new(bytes, 'UTF-8'); } catch (e) { return '<bin>'; }
}
function bt() {
  try {
    return Java.use('android.util.Log').getStackTraceString(
      Java.use('java.lang.Exception').$new());
  } catch (e) { return ''; }
}

/* ----------------------------- JAVA-СЛОЙ ----------------------------- */
function javaHooks() {
  Java.perform(function () {

    if (CFG.hookNetwork) {
      try {
        var URL = Java.use('java.net.URL');
        URL.$init.overload('java.lang.String').implementation = function (u) {
          log('[NET][URL]', u);                       // <-- адрес сервера авторизации
          return this.$init(u);
        };
      } catch (e) { log('[!]', 'URL hook: ' + e); }

      ['java.net.HttpURLConnection', 'javax.net.ssl.HttpsURLConnection',
       'com.android.okhttp.internal.huc.HttpURLConnectionImpl',
       'com.android.okhttp.internal.huc.DelegatingHttpsURLConnection'].forEach(function (cn) {
        try {
          var C = Java.use(cn);
          if (C.setRequestMethod) C.setRequestMethod.implementation = function (m) {
            log('[NET][method]', cn + ' ' + m); return this.setRequestMethod(m);
          };
          if (C.setRequestProperty) C.setRequestProperty.implementation = function (k, v) {
            log('[NET][header]', k + ': ' + v);        // <-- токены/авторизация
            return this.setRequestProperty(k, v);
          };
        } catch (e) {}
      });

      // тело запроса/ответа
      try {
        var OS = Java.use('java.io.OutputStream');
        OS.write.overload('[B', 'int', 'int').implementation = function (b, off, len) {
          try { log('[NET][body→]', utf8(b)); } catch (e) {}
          return this.write(b, off, len);
        };
      } catch (e) {}
    }

    if (CFG.hookCrypto) {
      try {
        var SKS = Java.use('javax.crypto.spec.SecretKeySpec');
        SKS.$init.overload('[B', 'java.lang.String').implementation = function (k, alg) {
          log('[CRYPTO][key]', alg + ' = ' + hex(k) + '  ("' + utf8(k) + '")');
          return this.$init(k, alg);
        };
      } catch (e) {}
      try {
        var IV = Java.use('javax.crypto.spec.IvParameterSpec');
        IV.$init.overload('[B').implementation = function (iv) {
          log('[CRYPTO][iv]', hex(iv)); return this.$init(iv);
        };
      } catch (e) {}
      try {
        var Cipher = Java.use('javax.crypto.Cipher');
        Cipher.doFinal.overload('[B').implementation = function (inp) {
          var out = this.doFinal(inp);
          log('[CRYPTO][doFinal]', this.getAlgorithm() +
            '\n   in : ' + hex(inp) + '  ("' + utf8(inp) + '")' +
            '\n   out: ' + hex(out) + '  ("' + utf8(out) + '")');
          return out;
        };
      } catch (e) {}
    }

    if (CFG.hookBase64) {
      try {
        var B64 = Java.use('android.util.Base64');
        B64.decode.overload('java.lang.String', 'int').implementation = function (s, f) {
          var r = this.decode(s, f); log('[B64][dec]', s + ' -> "' + utf8(r) + '"'); return r;
        };
        B64.encodeToString.overload('[B', 'int').implementation = function (d, f) {
          var r = this.encodeToString(d, f); log('[B64][enc]', '"' + utf8(d) + '" -> ' + r); return r;
        };
      } catch (e) {}
    }

    if (CFG.hookFiles) {
      try {
        var File = Java.use('java.io.File');
        File.$init.overload('java.lang.String').implementation = function (p) {
          if (p && (p.indexOf('Zenin') >= 0 || p.indexOf('.cfg') >= 0 || p.indexOf('/sdcard') >= 0))
            log('[FILE]', p);
          return this.$init(p);
        };
      } catch (e) {}
    }

    if (CFG.hookPkg) {
      try {
        var PM = Java.use('android.app.ApplicationPackageManager');
        ['getPackageInfo', 'getApplicationInfo', 'getLaunchIntentForPackage'].forEach(function (m) {
          if (PM[m]) PM[m].overloads.forEach(function (ov) {
            ov.implementation = function () {
              if (arguments.length && typeof arguments[0] === 'string')
                log('[PKG][' + m + ']', arguments[0]);  // <-- целевой пакет игры
              return ov.apply(this, arguments);
            };
          });
        });
      } catch (e) {}
      try {
        var CN = Java.use('android.content.ComponentName');
        CN.$init.overload('java.lang.String', 'java.lang.String').implementation = function (p, c) {
          log('[PKG][Component]', p + ' / ' + c); return this.$init(p, c);
        };
      } catch (e) {}
    }

    if (CFG.hookJavaDecoders) {
      // массово хукаем XOR-декодеры строк: static String f(short[],int,int,int)
      var hooked = 0;
      Java.enumerateLoadedClassesSync().forEach(function (cn) {
        try {
          if (cn.indexOf('[') === 0) return;
          var C = Java.use(cn);
          var ms = C.class.getDeclaredMethods();
          for (var i = 0; i < ms.length; i++) {
            var m = ms[i], ps = m.getParameterTypes();
            if (ps.length === 4 && ps[0].getName() === '[S' &&
                m.getReturnType().getName() === 'java.lang.String') {
              var name = m.getName();
              C[name].overload('[S', 'int', 'int', 'int').implementation =
                function () {
                  var r = this[name].apply(this, arguments);
                  log('[STR]', cn + '.' + name + ' -> "' + r + '"');
                  return r;
                };
              hooked++;
            }
          }
        } catch (e) {}
      });
      log('[*]', 'XOR-декодеров строк захукано: ' + hooked);
    }

    log('[*]', 'Java-хуки установлены.');
  });
}

/* ----------------------------- НАТИВНЫЙ СЛОЙ ----------------------------- */
function nativeJNIHooks() {
  // libart экспортирует символы JNI-функций — ловим строки и регистрацию нативов.
  var art = Process.findModuleByName('libart.so');
  if (!art) { log('[!]', 'libart.so не найден'); return; }

  function findExp(re) {
    var hit = null;
    art.enumerateExports().forEach(function (e) {
      if (!hit && e.type === 'function' && re.test(e.name)) hit = e;
    });
    return hit;
  }

  if (CFG.hookJNIStrings) {
    var nsu = findExp(/NewStringUTF/);
    if (nsu) Interceptor.attach(nsu.address, {
      onEnter: function (a) {
        try { var s = a[1].readUtf8String();
          if (s && s.length > 2) log('[JNI][NewStringUTF]', s);
        } catch (e) {}
      }
    });
    var gsu = findExp(/GetStringUTFChars/);
    if (gsu) Interceptor.attach(gsu.address, {
      onLeave: function (r) {
        try { var s = r.readUtf8String();
          if (s && s.length > 2) log('[JNI][GetStringUTFChars]', s);
        } catch (e) {}
      }
    });
    log('[*]', 'JNI-строковые хуки: NewStringUTF=' + !!nsu + ' GetStringUTFChars=' + !!gsu);
  }

  if (CFG.hookRegisterNatives) {
    var rn = findExp(/RegisterNatives/);
    if (rn) Interceptor.attach(rn.address, {
      onEnter: function (a) {
        try {
          var env = a[0], clazz = a[1], methods = a[2], n = a[3].toInt32();
          // имя класса
          var cname = '?';
          try {
            var GetEnv = Java.vm.getEnv();
            cname = GetEnv.getClassName(clazz);
          } catch (e) {}
          log('[JNI][RegisterNatives]', cname + '  count=' + n);
          var STRIDE = Process.pointerSize * 3; // {name*, sig*, fnPtr*}
          for (var i = 0; i < n; i++) {
            var base = methods.add(i * STRIDE);
            var nm = base.readPointer().readUtf8String();
            var sg = base.add(Process.pointerSize).readPointer().readUtf8String();
            var fn = base.add(Process.pointerSize * 2).readPointer();
            var mod = Process.findModuleByAddress(fn);
            var off = mod ? (fn.sub(mod.base)) : fn;
            log('   ', nm + ' ' + sg + '  ->  ' +
                (mod ? mod.name + '!0x' + off.toString(16) : fn));
          }
        } catch (e) { log('[!]', 'RegisterNatives parse: ' + e); }
      }
    });
    log('[*]', 'RegisterNatives хук: ' + !!rn);
  }
}

/* --- дождаться загрузки libZeninCPP.so, чтобы хукать нативный дешифратор по offset --- */
function waitForLib() {
  if (!CFG.hookDlopen) return;
  var dlopen = Module.findExportByName(null, 'android_dlopen_ext') ||
               Module.findExportByName(null, 'dlopen');
  if (!dlopen) return;
  Interceptor.attach(dlopen, {
    onEnter: function (a) { try { this.p = a[0].readCString(); } catch (e) {} },
    onLeave: function () {
      if (this.p && this.p.indexOf('libZeninCPP.so') >= 0) {
        var m = Process.findModuleByName('libZeninCPP.so');
        if (m) {
          log('[*]', 'libZeninCPP.so загружена @ ' + m.base + ' (size 0x' + m.size.toString(16) + ')');
          // Дешифратор строк живёт в нативе. Когда определишь его offset из Ghidra,
          // раскомментируй и подставь (пример для функции из таблицы DAT_006c45xx):
          //   var dec = m.base.add(0xXXXXX);
          //   Interceptor.attach(dec, { onLeave: function (r) {
          //       try { log('[NATIVE][str]', r.readUtf8String()); } catch (e) {} } });
        }
      }
    }
  });
}

/* ----------------------------- ЗАПУСК ----------------------------- */
log('[*]', 'dump-secrets.js загружен. Ставлю хуки…');
try { nativeJNIHooks(); } catch (e) { log('[!]', 'native hooks: ' + e); }
try { waitForLib(); } catch (e) { log('[!]', 'dlopen hook: ' + e); }
setTimeout(javaHooks, 0);
