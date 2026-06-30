package p016J;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: J.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0139k {

    /* JADX INFO: renamed from: a */
    public static final long f444a;

    /* JADX INFO: renamed from: b */
    public static final Method f445b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f444a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f445b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m545a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0138j.m543c();
        }
        try {
            return ((Boolean) f445b.invoke(null, Long.valueOf(f444a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
