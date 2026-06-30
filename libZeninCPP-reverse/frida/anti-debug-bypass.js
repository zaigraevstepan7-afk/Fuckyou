/*
 * anti-debug-bypass.js — типовые обходы анти-отладки Dex2C/VMP для Frida.
 * Грузить ПЕРЕД основным скриптом:  frida -U -f com.reddit.frontpage -l anti-debug-bypass.js -l dump-secrets.js --no-pause
 */
function log(m){ console.log('[anti-dbg] ' + m); }

// Frida 17-совместимый поиск экспорта (старый Module.findExportByName удалён).
function gexp(name){
  try { if (Module.findGlobalExportByName) return Module.findGlobalExportByName(name); } catch(e){}
  try { if (Module.getGlobalExportByName) return Module.getGlobalExportByName(name); } catch(e){}
  try { if (Module.findExportByName) return Module.findExportByName(null, name); } catch(e){}
  return null;
}

// 1) ptrace(PTR_TRACEME) — частый трюк защиты; возвращаем 0.
try {
  var ptrace = gexp('ptrace');
  if (ptrace) Interceptor.replace(ptrace, new NativeCallback(function(){ return 0; }, 'long',
    ['int','pointer','pointer','pointer']));
  log('ptrace neutralized: ' + !!ptrace);
} catch(e){ log('ptrace: ' + e); }

// 2) Детект по строкам: strstr/strcmp ищут "frida", "gum-js", "/proc/self/maps", TracerPid.
['strstr','strcmp','strcasestr'].forEach(function(fn){
  var p = gexp(fn);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter: function(a){
      try {
        var s = a[1].readCString() || '';
        if (/frida|gum-js|gmain|linjector/.test(s) || /tracerpid/i.test(s)) { this.fake = true; }
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
    var p = gexp(fn); if(!p) return;
    Interceptor.attach(p, { onEnter: function(a){
      try { var path = a[0].readCString() || '';
        if (path.indexOf('/proc/') >=0 && (path.indexOf('maps')>=0 || path.indexOf('status')>=0))
          log('proc read: ' + path);
      } catch(e){}
    }});
  });
} catch(e){}

// 4) Java: Debug.isDebuggerConnected (ждём готовности Java-машины)
var _at = 150;
(function jdbg(){
  if (typeof Java === 'undefined' || !Java.available){ if(_at-- <= 0) return; setTimeout(jdbg,200); return; }
  try { Java.perform(function(){
    var D = Java.use('android.os.Debug');
    D.isDebuggerConnected.implementation = function(){ return false; };
    log('Debug.isDebuggerConnected -> false');
  }); } catch(e){ if(_at-- > 0) setTimeout(jdbg,200); else log('java anti-dbg: ' + e); }
})();
