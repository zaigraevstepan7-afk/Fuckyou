package internal0;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public class Internal {
    public static native void registerNativesForClass(int i, Class<?> cls);

    static {
        System.loadLibrary("internal");
    }
}
