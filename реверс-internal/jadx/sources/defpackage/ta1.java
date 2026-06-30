package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends b40 {
    final /* synthetic */ ua1 this$0;

    /* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
    public static final class a extends b40 {
        final /* synthetic */ ua1 this$0;

        public a(ua1 ua1Var) {
            this.this$0 = ua1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ua1 ua1Var = this.this$0;
            int i = ua1Var.e + 1;
            ua1Var.e = i;
            if (i == 1 && ua1Var.h) {
                ua1Var.j.d(po0.ON_START);
                ua1Var.h = false;
            }
        }
    }

    public ta1(ua1 ua1Var) {
        this.this$0 = ua1Var;
    }

    @Override // defpackage.b40, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = vd1.f;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((vd1) fragmentFindFragmentByTag).e = this.this$0.l;
        }
    }

    @Override // defpackage.b40, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ua1 ua1Var = this.this$0;
        int i = ua1Var.f - 1;
        ua1Var.f = i;
        if (i == 0) {
            Handler handler = ua1Var.i;
            handler.getClass();
            handler.postDelayed(ua1Var.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        qr.i(activity, new a(this.this$0));
    }

    @Override // defpackage.b40, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ua1 ua1Var = this.this$0;
        int i = ua1Var.e - 1;
        ua1Var.e = i;
        if (i == 0 && ua1Var.g) {
            ua1Var.j.d(po0.ON_STOP);
            ua1Var.h = true;
        }
    }
}
