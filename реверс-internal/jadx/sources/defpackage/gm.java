package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gm {
    public static final float[] a;
    public static final float[] b;
    public static final t12 c;
    public static final t12 d;
    public static final cf1 e;
    public static final cf1 f;
    public static final cf1 g;
    public static final cf1 h;
    public static final cf1 i;
    public static final cf1 j;
    public static final cf1 k;
    public static final cf1 l;
    public static final cf1 m;
    public static final cf1 n;
    public static final cf1 o;
    public static final cf1 p;
    public static final cf1 q;
    public static final cf1 r;
    public static final rk0 s;
    public static final rk0 t;
    public static final cf1 u;
    public static final cf1 v;
    public static final cf1 w;
    public static final b11 x;
    public static final em[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        t12 t12Var = new t12(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t12 t12Var2 = new t12(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t12 t12Var3 = new t12(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = t12Var3;
        t12 t12Var4 = new t12(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = t12Var4;
        h72 h72Var = xi0.t;
        cf1 cf1Var = new cf1("sRGB IEC61966-2.1", fArr, h72Var, t12Var, 0);
        e = cf1Var;
        cf1 cf1Var2 = new cf1("sRGB IEC61966-2.1 (Linear)", fArr, h72Var, 1.0d, 0.0f, 1.0f, 1);
        f = cf1Var2;
        cf1 cf1Var3 = new cf1("scRGB-nl IEC 61966-2-2:2003", fArr, h72Var, null, new yc(3), new yc(4), -0.799f, 2.399f, t12Var, 2);
        g = cf1Var3;
        cf1 cf1Var4 = new cf1("scRGB IEC 61966-2-2:2003", fArr, h72Var, 1.0d, -0.5f, 7.499f, 3);
        h = cf1Var4;
        cf1 cf1Var5 = new cf1("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, h72Var, new t12(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = cf1Var5;
        cf1 cf1Var6 = new cf1("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, h72Var, new t12(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = cf1Var6;
        cf1 cf1Var7 = new cf1("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new h72(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = cf1Var7;
        cf1 cf1Var8 = new cf1("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, h72Var, t12Var, 7);
        l = cf1Var8;
        cf1 cf1Var9 = new cf1("NTSC (1953)", fArr2, xi0.q, new t12(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = cf1Var9;
        cf1 cf1Var10 = new cf1("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, h72Var, new t12(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = cf1Var10;
        cf1 cf1Var11 = new cf1("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, h72Var, 2.2d, 0.0f, 1.0f, 10);
        o = cf1Var11;
        cf1 cf1Var12 = new cf1("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, xi0.r, new t12(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = cf1Var12;
        h72 h72Var2 = xi0.s;
        cf1 cf1Var13 = new cf1("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, h72Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = cf1Var13;
        cf1 cf1Var14 = new cf1("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, h72Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = cf1Var14;
        rk0 rk0Var = new rk0(14, 1, 12884901889L, "Generic XYZ");
        s = rk0Var;
        rk0 rk0Var2 = new rk0(15, 0, 12884901890L, "Generic L*a*b*");
        t = rk0Var2;
        cf1 cf1Var15 = new cf1("None", fArr, h72Var, t12Var2, 16);
        u = cf1Var15;
        cf1 cf1Var16 = new cf1("Hybrid Log Gamma encoding", fArr3, h72Var, null, new yc(5), new yc(6), 0.0f, 1.0f, t12Var3, 17);
        v = cf1Var16;
        cf1 cf1Var17 = new cf1("Perceptual Quantizer encoding", fArr3, h72Var, null, new yc(7), new yc(8), 0.0f, 1.0f, t12Var4, 18);
        w = cf1Var17;
        b11 b11Var = new b11("Oklab", 12884901890L, 19);
        x = b11Var;
        y = new em[]{cf1Var, cf1Var2, cf1Var3, cf1Var4, cf1Var5, cf1Var6, cf1Var7, cf1Var8, cf1Var9, cf1Var10, cf1Var11, cf1Var12, cf1Var13, cf1Var14, rk0Var, rk0Var2, cf1Var15, cf1Var16, cf1Var17, b11Var};
    }

    public static double a(t12 t12Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = t12Var.b;
        double d6 = t12Var.c;
        double d7 = t12Var.d;
        double d8 = t12Var.e;
        double d9 = t12Var.f;
        double d10 = d5 * d4;
        return (t12Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(t12 t12Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / t12Var.b;
        double d5 = 1.0d / t12Var.c;
        double d6 = 1.0d / t12Var.d;
        double d7 = t12Var.e;
        double d8 = t12Var.f;
        double d9 = (d2 * d3) / (t12Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(t12 t12Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = t12Var.b;
        double d6 = t12Var.d;
        double dPow = (Math.pow(d4, d6) * t12Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * t12Var.f) + t12Var.e), t12Var.g) * d3;
    }

    public static double d(t12 t12Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -t12Var.b;
        double d6 = t12Var.e;
        double d7 = 1.0d / t12Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-t12Var.f)) + t12Var.c), 1.0d / t12Var.d) * d3;
    }
}
