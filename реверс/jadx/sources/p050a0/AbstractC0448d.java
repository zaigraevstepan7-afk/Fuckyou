package p050a0;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0548r;
import androidx.fragment.app.C0518H;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0448d {

    /* JADX INFO: renamed from: a */
    public static final C0447c f1144a = C0447c.f1143a;

    /* JADX INFO: renamed from: a */
    public static C0447c m1138a(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        while (abstractComponentCallbacksC0548r != null) {
            if (abstractComponentCallbacksC0548r.f1795s != null && abstractComponentCallbacksC0548r.f1787k) {
                abstractComponentCallbacksC0548r.m1461j();
            }
            abstractComponentCallbacksC0548r = abstractComponentCallbacksC0548r.f1797u;
        }
        return f1144a;
    }

    /* JADX INFO: renamed from: b */
    public static void m1139b(C0445a c0445a) {
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0445a.f1138a.getClass().getName()), c0445a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1140c(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r, String str) {
        AbstractC0451c.m1146e(str, "previousFragmentId");
        m1139b(new C0445a(abstractComponentCallbacksC0548r, "Attempting to reuse fragment " + abstractComponentCallbacksC0548r + " with previous ID " + str));
        m1138a(abstractComponentCallbacksC0548r).getClass();
    }
}
