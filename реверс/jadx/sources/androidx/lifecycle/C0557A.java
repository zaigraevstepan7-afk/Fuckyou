package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0557A extends AbstractC0574f {
    final /* synthetic */ C0558B this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.A$a */
    public static final class a extends AbstractC0574f {
        final /* synthetic */ C0558B this$0;

        public a(C0558B c0558b) {
            this.this$0 = c0558b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            this.this$0.m1468a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            C0558B c0558b = this.this$0;
            int i2 = c0558b.f1827a + 1;
            c0558b.f1827a = i2;
            if (i2 == 1 && c0558b.f1830d) {
                c0558b.f1832f.m1484d(EnumC0580l.ON_START);
                c0558b.f1830d = false;
            }
        }
    }

    public C0557A(C0558B c0558b) {
        this.this$0 = c0558b;
    }

    @Override // androidx.lifecycle.AbstractC0574f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0451c.m1146e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = FragmentC0561E.f1838b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0451c.m1144c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0561E) fragmentFindFragmentByTag).f1839a = this.this$0.f1834h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0574f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0451c.m1146e(activity, "activity");
        C0558B c0558b = this.this$0;
        int i2 = c0558b.f1828b - 1;
        c0558b.f1828b = i2;
        if (i2 == 0) {
            Handler handler = c0558b.f1831e;
            AbstractC0451c.m1143b(handler);
            handler.postDelayed(c0558b.f1833g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0451c.m1146e(activity, "activity");
        AbstractC0594z.m1497a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0574f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0451c.m1146e(activity, "activity");
        C0558B c0558b = this.this$0;
        int i2 = c0558b.f1827a - 1;
        c0558b.f1827a = i2;
        if (i2 == 0 && c0558b.f1829c) {
            c0558b.f1832f.m1484d(EnumC0580l.ON_STOP);
            c0558b.f1830d = true;
        }
    }
}
