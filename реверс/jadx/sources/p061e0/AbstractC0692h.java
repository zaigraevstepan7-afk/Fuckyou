package p061e0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: e0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0692h {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m1944a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
