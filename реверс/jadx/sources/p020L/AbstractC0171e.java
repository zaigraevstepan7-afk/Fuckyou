package p020L;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171e {

    /* JADX INFO: renamed from: a */
    public static final Method f588a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f588a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m610a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC0170d.m609c(AbstractC0170d.m607a(AbstractC0170d.m608b(locale)));
        }
        try {
            return AbstractC0169c.m606a((Locale) f588a.invoke(null, locale));
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
            return AbstractC0169c.m606a(locale);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
            return AbstractC0169c.m606a(locale);
        }
    }
}
