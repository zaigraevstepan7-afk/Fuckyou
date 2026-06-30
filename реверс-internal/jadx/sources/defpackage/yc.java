package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc implements zi, iz, j20, yn1 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int e;

    public /* synthetic */ yc(int i) {
        this.e = i;
    }

    public static /* synthetic */ void d() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void j() {
        throw new pn();
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void l(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void m() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void o(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // defpackage.yn1
    public boolean a() {
        return false;
    }

    @Override // defpackage.iz
    public double c(double d) {
        switch (this.e) {
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                float[] fArr = gm.a;
                return gm.b(gm.c, d);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                float[] fArr2 = gm.a;
                return gm.a(gm.c, d);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                float[] fArr3 = gm.a;
                return gm.d(gm.d, d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                float[] fArr4 = gm.a;
                return gm.c(gm.d, d);
            default:
                return d;
        }
    }

    @Override // defpackage.zi
    public void cancel() {
    }

    @Override // defpackage.j20
    public float b(float f2) {
        return f2;
    }
}
