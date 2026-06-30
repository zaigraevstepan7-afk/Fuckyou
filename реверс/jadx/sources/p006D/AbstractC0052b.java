package p006D;

import android.content.Context;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052b {
    /* JADX INFO: renamed from: a */
    public static int m317a(Context context, int i2) {
        return context.getColor(i2);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m318b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    public static String m319c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
