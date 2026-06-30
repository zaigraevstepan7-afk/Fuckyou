package p016J;

import android.os.Trace;

/* JADX INFO: renamed from: J.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0138j {
    /* JADX INFO: renamed from: a */
    public static void m541a(String str, int i2) {
        Trace.beginAsyncSection(str, i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m542b(String str, int i2) {
        Trace.endAsyncSection(str, i2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m543c() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: d */
    public static void m544d(String str, long j2) {
        Trace.setCounter(str, j2);
    }
}
