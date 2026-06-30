package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class kl1 {
    public static final za a = new za(Float.NaN, Float.NaN);
    public static final r22 b = new r22(new fi1(8), new fi1(9));
    public static final long c;
    public static final gr1 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new gr1(new w01(jFloatToRawIntBits));
    }
}
