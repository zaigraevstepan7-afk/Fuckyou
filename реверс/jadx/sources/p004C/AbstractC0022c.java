package p004C;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: C.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0022c {
    /* JADX INFO: renamed from: a */
    public static void m231a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* JADX INFO: renamed from: b */
    public static void m232b(Activity activity, String[] strArr, int i2) {
        activity.requestPermissions(strArr, i2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m233c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
