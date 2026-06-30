package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p000A.AbstractC0000a;
import p000A.C0001b;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.E */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0561E extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f1838b = 0;

    /* JADX INFO: renamed from: a */
    public C0001b f1839a;

    /* JADX INFO: renamed from: androidx.lifecycle.E$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0560D Companion = new C0560D();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC0451c.m1146e(activity, "activity");
            AbstractC0000a.m14k(activity, new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0451c.m1146e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC0451c.m1146e(activity, "activity");
            int i2 = FragmentC0561E.f1838b;
            AbstractC0559C.m1469a(activity, EnumC0580l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            int i2 = FragmentC0561E.f1838b;
            AbstractC0559C.m1469a(activity, EnumC0580l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            int i2 = FragmentC0561E.f1838b;
            AbstractC0559C.m1469a(activity, EnumC0580l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            int i2 = FragmentC0561E.f1838b;
            AbstractC0559C.m1469a(activity, EnumC0580l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            int i2 = FragmentC0561E.f1838b;
            AbstractC0559C.m1469a(activity, EnumC0580l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
            int i2 = FragmentC0561E.f1838b;
            AbstractC0559C.m1469a(activity, EnumC0580l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC0451c.m1146e(activity, "activity");
            AbstractC0451c.m1146e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC0451c.m1146e(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1471a(EnumC0580l enumC0580l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0451c.m1145d(activity, "activity");
            AbstractC0559C.m1469a(activity, enumC0580l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1471a(EnumC0580l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1471a(EnumC0580l.ON_DESTROY);
        this.f1839a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1471a(EnumC0580l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0001b c0001b = this.f1839a;
        if (c0001b != null) {
            ((C0558B) c0001b.f1b).m1468a();
        }
        m1471a(EnumC0580l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0001b c0001b = this.f1839a;
        if (c0001b != null) {
            C0558B c0558b = (C0558B) c0001b.f1b;
            int i2 = c0558b.f1827a + 1;
            c0558b.f1827a = i2;
            if (i2 == 1 && c0558b.f1830d) {
                c0558b.f1832f.m1484d(EnumC0580l.ON_START);
                c0558b.f1830d = false;
            }
        }
        m1471a(EnumC0580l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1471a(EnumC0580l.ON_STOP);
    }
}
