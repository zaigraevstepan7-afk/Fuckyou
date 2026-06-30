package p061e0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p015I0.C0109e;
import p087s.AbstractFutureC1041g;
import p087s.C1042h;

/* JADX INFO: renamed from: e0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0694j {

    /* JADX INFO: renamed from: a */
    public static final C1042h f2768a = new C1042h();

    /* JADX INFO: renamed from: b */
    public static final Object f2769b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0109e f2770c = null;

    /* JADX INFO: renamed from: a */
    public static long m1947a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0692h.m1944a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static C0109e m1948b() {
        C0109e c0109e = new C0109e(21);
        f2770c = c0109e;
        C1042h c1042h = f2768a;
        c1042h.getClass();
        if (AbstractFutureC1041g.f4128f.mo1076j(c1042h, null, c0109e)) {
            AbstractFutureC1041g.m2501b(c1042h);
        }
        return f2770c;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1949c(Context context, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        long length;
        long length2;
        File file;
        C0693i c0693iM1945a;
        C0693i c0693i;
        int i4;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z2 || f2770c == null) {
            synchronized (f2769b) {
                if (z2) {
                    i2 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length2 = file3.length();
                            if (file3.exists()) {
                                long jM1947a = m1947a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (c0693iM1945a == null) {
                                    if (z3) {
                                    }
                                }
                                if (z2) {
                                    i2 = 2;
                                }
                                c0693i = new C0693i(1, (c0693iM1945a == null && c0693iM1945a.f2765b == 2 && i2 == 1 && length < c0693iM1945a.f2767d) ? 3 : i2, jM1947a, length2);
                                if (c0693iM1945a != null) {
                                    c0693i.m1946b(file);
                                }
                                m1948b();
                                return;
                            }
                        }
                    }
                    m1948b();
                    return;
                }
                if (f2770c != null) {
                    return;
                }
                i2 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z3 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z3 = false;
                }
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    length = file22.length();
                    boolean z4 = !file22.exists() && length > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length2 = file32.length();
                    boolean z5 = !file32.exists() && length2 > 0;
                    try {
                        long jM1947a2 = m1947a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            c0693iM1945a = null;
                        } else {
                            try {
                                c0693iM1945a = C0693i.m1945a(file);
                            } catch (IOException unused2) {
                                m1948b();
                                return;
                            }
                        }
                        if (c0693iM1945a == null && c0693iM1945a.f2766c == jM1947a2 && (i4 = c0693iM1945a.f2765b) != 2) {
                            i2 = i4;
                        } else if (z3) {
                            i2 = 327680;
                        } else if (z4) {
                            i2 = 1;
                        } else if (z5) {
                            i2 = 2;
                        }
                        if (z2 && z5 && i2 != 1) {
                            i2 = 2;
                        }
                        c0693i = new C0693i(1, (c0693iM1945a == null && c0693iM1945a.f2765b == 2 && i2 == 1 && length < c0693iM1945a.f2767d) ? 3 : i2, jM1947a2, length2);
                        if (c0693iM1945a != null || !c0693iM1945a.equals(c0693i)) {
                            try {
                                c0693i.m1946b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m1948b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m1948b();
                        return;
                    }
                }
                m1948b();
                return;
            }
        }
    }
}
