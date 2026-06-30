package p004C;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: C.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0025f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public Object f60a;

    /* JADX INFO: renamed from: b */
    public Activity f61b;

    /* JADX INFO: renamed from: c */
    public final int f62c;

    /* JADX INFO: renamed from: d */
    public boolean f63d = false;

    /* JADX INFO: renamed from: e */
    public boolean f64e = false;

    /* JADX INFO: renamed from: f */
    public boolean f65f = false;

    public C0025f(Activity activity) {
        this.f61b = activity;
        this.f62c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f61b == activity) {
            this.f61b = null;
            this.f64e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f64e || this.f65f || this.f63d) {
            return;
        }
        Object obj = this.f60a;
        try {
            Object obj2 = AbstractC0026g.f68c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f62c) {
                AbstractC0026g.f72g.postAtFrontOfQueue(new RunnableC0024e(AbstractC0026g.f67b.get(activity), obj2, 2, false));
                this.f65f = true;
                this.f60a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f61b == activity) {
            this.f63d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
