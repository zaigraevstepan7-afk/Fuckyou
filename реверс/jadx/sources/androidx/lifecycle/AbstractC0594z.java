package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0594z {
    /* JADX INFO: renamed from: a */
    public static final void m1497a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0451c.m1146e(activity, "activity");
        AbstractC0451c.m1146e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
