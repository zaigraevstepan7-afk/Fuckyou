package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.fragment.app.AbstractC0529T;
import androidx.lifecycle.FragmentC0561E;
import p000A.AbstractC0000a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0559C {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1469a(Activity activity, EnumC0580l enumC0580l) {
        AbstractC0451c.m1146e(enumC0580l, "event");
        if (activity instanceof InterfaceC0586r) {
            C0588t c0588tMo1164d = ((InterfaceC0586r) activity).mo1164d();
            if (AbstractC0529T.m1418g(c0588tMo1164d)) {
                c0588tMo1164d.m1484d(enumC0580l);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1470b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0561E.a.Companion.getClass();
            AbstractC0000a.m14k(activity, new FragmentC0561E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0561E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
