package p004C;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: C.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0028i {
    /* JADX INFO: renamed from: a */
    public static <T> T m239a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: b */
    public static int m240b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m241c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m242d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
