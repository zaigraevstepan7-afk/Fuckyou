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
