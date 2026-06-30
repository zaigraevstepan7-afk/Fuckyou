package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s91 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int e(d02 d02Var, int i, int i2) {
        return (d02Var.hashCode() + i) * i2;
    }

    public static long f(e20 e20Var, f20 f20Var, h20 h20Var) {
        return hk.y(e20Var.a().b().b(f20Var).a(), h20Var);
    }

    public static pn g(String str) {
        ng0.c(str);
        return new pn();
    }

    public static String h(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String i(String str, int i) {
        return str + i;
    }

    public static String j(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String k(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder m(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void p(int i, int i2, int i3, int i4, int i5) {
        hk.d(i);
        hk.d(i2);
        hk.d(i3);
        hk.d(i4);
        hk.d(i5);
    }

    public static void q(int i, ob0 ob0Var, r9 r9Var, ob0 ob0Var2, a4 a4Var) {
        xc.E(r9Var, ob0Var, Integer.valueOf(i));
        xc.C(ob0Var2, a4Var);
    }

    public static void r(oc ocVar, long j) {
        ocVar.i().i();
        ocVar.B(j);
    }

    public static /* synthetic */ void s(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj == null) {
            return;
        }
        yc.d();
    }

    public static void u(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static pn v(String str) {
        qg0.b(str);
        return new pn();
    }

    public static /* synthetic */ int w(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
