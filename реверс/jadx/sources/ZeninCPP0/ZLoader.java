package ZeninCPP0;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public class ZLoader {
    public static native void registerNativesForClass(int i2, Class<?> cls);

    static {
        System.loadLibrary("ZeninCPP");
    }
}
