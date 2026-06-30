package p004C;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: C.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0029j {
    /* JADX INFO: renamed from: a */
    public static int m243a(AppOpsManager appOpsManager, String str, int i2, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i2, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m244b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static AppOpsManager m245c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
