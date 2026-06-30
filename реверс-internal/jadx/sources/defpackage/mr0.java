package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class mr0 {
    public static final float a;
    public static final float b;
    public static final List c;
    public static final float d;

    static {
        float f;
        char c2;
        long j;
        char c3;
        int i;
        pg1 pg1Var;
        float f2 = u4.d0;
        a = f2;
        float f3 = u4.b0;
        b = f3;
        float f4 = u4.a0;
        wr wrVar = hu0.a;
        pg1 pg1VarO = wrVar.o();
        pg1 pg1VarB = hu0.l;
        int i2 = 2;
        if (pg1VarB == null) {
            pg1VarB = xc.F(9, hu0.c).c(new l2(hu0.e, i2)).b();
            hu0.l = pg1VarB;
        }
        pg1 pg1VarB2 = hu0.i;
        if (pg1VarB2 == null) {
            f = 0.5f;
            j = 4294967295L;
            c2 = ' ';
            pg1VarB2 = wr.l(wrVar, hk.H(new gu0((((long) Float.floatToRawIntBits(-0.009f)) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new ft(2, 0.172f)), new gu0((((long) Float.floatToRawIntBits(1.03f)) << 32) | (((long) Float.floatToRawIntBits(0.365f)) & 4294967295L), new ft(2, 0.164f)), new gu0((((long) Float.floatToRawIntBits(0.828f)) << 32) | (((long) Float.floatToRawIntBits(0.97f)) & 4294967295L), new ft(2, 0.169f))), 1, 4).b();
            hu0.i = pg1VarB2;
        } else {
            f = 0.5f;
            c2 = ' ';
            j = 4294967295L;
        }
        pg1 pg1VarB3 = hu0.h;
        if (pg1VarB3 == null) {
            c3 = c2;
            pg1VarB3 = wr.l(wrVar, hk.H(new gu0((((long) Float.floatToRawIntBits(0.039f)) & j) | (Float.floatToRawIntBits(0.961f) << c2), new ft(2, 0.426f)), new gu0((((long) Float.floatToRawIntBits(1.001f)) << c3) | (((long) Float.floatToRawIntBits(0.428f)) & j), ft.b), new gu0((((long) Float.floatToRawIntBits(1.0f)) << c3) | (((long) Float.floatToRawIntBits(0.609f)) & j), new ft(2, 1.0f))), 2, 4).b();
            hu0.h = pg1VarB3;
        } else {
            c3 = c2;
        }
        pg1 pg1VarB4 = hu0.j;
        if (pg1VarB4 == null) {
            pg1VarB4 = xc.F(8, hu0.b).b();
            hu0.j = pg1VarB4;
        }
        pg1 pg1VarB5 = hu0.k;
        if (pg1VarB5 == null) {
            pg1Var = pg1VarB3;
            i = 4;
            pg1VarB5 = wr.l(wrVar, hk.H(new gu0((((long) Float.floatToRawIntBits(1.237f)) << c3) | (((long) Float.floatToRawIntBits(1.236f)) & j), new ft(2, 0.258f)), new gu0((((long) Float.floatToRawIntBits(0.918f)) & j) | (Float.floatToRawIntBits(f) << c3), new ft(2, 0.233f))), 4, 12).b();
            hu0.k = pg1VarB5;
        } else {
            i = 4;
            pg1Var = pg1VarB3;
        }
        pg1 pg1VarB6 = hu0.g;
        if (pg1VarB6 == null) {
            float[] fArrA = ou0.a();
            ou0.g(fArrA, 1.0f, 0.64f, i);
            pg1VarB6 = xc.m(15).c(new l2(fArrA, i2)).c(new l2(hu0.d, i2)).b();
            hu0.g = pg1VarB6;
        }
        c = hk.H(pg1VarO, pg1VarB, pg1VarB2, pg1Var, pg1VarB4, pg1VarB5, pg1VarB6);
        pg1 pg1VarB7 = hu0.f;
        if (pg1VarB7 == null) {
            pg1VarB7 = xc.m(14).b();
            hu0.f = pg1VarB7;
        }
        float[] fArrA2 = ou0.a();
        ou0.e(fArrA2, 18.0f);
        hk.H(pg1VarB7.c(new l2(fArrA2, i2)), wrVar.o());
        d = f4 / Math.min(f2, f3);
    }
}
