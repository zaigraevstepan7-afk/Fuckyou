package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.vd1;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class td1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, po0 po0Var) {
        po0Var.getClass();
        if (activity instanceof xo0) {
            zo0 zo0VarG = ((xo0) activity).g();
            if (zo0VarG instanceof zo0) {
                zo0VarG.d(po0Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            vd1.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new vd1.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new vd1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
