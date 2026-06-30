/* probe.js — минимальная проверка: НИЧЕГО не подменяем в нативе.
 * Цель: понять, что крашит приложение — наши анти-отладочные хуки или анти-Frida детект.
 * Только ждём Java и вешаем пару безобидных Java-хуков.
 */
console.log('[probe] загружен, жду Java-машину…');
var t = 200;
(function j(){
  if (typeof Java === 'undefined' || !Java.available){
    if (t-- <= 0){ console.log('[probe] Java VM так и не появилась (заморожен/свёрнут?)'); return; }
    setTimeout(j, 200); return;
  }
  try {
    Java.perform(function(){
      console.log('[probe] Java готова, ставлю Java-хуки…');
      try {
        var URL = Java.use('java.net.URL');
        URL.$init.overload('java.lang.String').implementation = function(u){
          console.log('[URL] ' + u); return this.$init(u);
        };
      } catch(e){ console.log('[probe] url: ' + e); }
      try {
        var S = Java.use('java.lang.String');
        var C = Java.use('javax.crypto.Cipher');
        C.doFinal.overload('[B').implementation = function(x){
          var r = this.doFinal(x);
          try { console.log('[Cipher] out="' + S.$new(r) + '"'); } catch(e){}
          return r;
        };
      } catch(e){ console.log('[probe] cipher: ' + e); }
      try {
        var PM = Java.use('android.app.ApplicationPackageManager');
        PM.getLaunchIntentForPackage.implementation = function(p){
          console.log('[PKG] ' + p); return this.getLaunchIntentForPackage(p);
        };
      } catch(e){ console.log('[probe] pm: ' + e); }
      console.log('[probe] ХУКИ ПОСТАВЛЕНЫ. Тыкай в приложении (ключ ZE-, вход).');
    });
  } catch(e){ if (t-- > 0) setTimeout(j, 200); else console.log('[probe] perform: ' + e); }
})();
