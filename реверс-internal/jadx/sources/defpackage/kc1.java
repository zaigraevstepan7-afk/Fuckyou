package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 implements vc {
    public final gx0 e = new gx0();
    public final sx0 f = new sx0();
    public final Object g;

    public kc1(Object obj) {
        this.g = obj;
    }

    public final void a(k32 k32Var, hd1 hd1Var) {
        Exception exc;
        gx0 gx0Var = this.e;
        int i = gx0Var.b;
        sx0 sx0Var = new sx0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            sx0 sx0Var2 = this.f;
            if (i2 >= i) {
                if (i3 != sx0Var2.b) {
                    mp.a("Applier operation size mismatch");
                }
                sx0Var2.d();
                gx0Var.b = 0;
                k32Var.g();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (gx0Var.c(i2)) {
                        case 0:
                            k32Var.q();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            k32Var.d(sx0Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case t91.FLOAT_FIELD_NUMBER /* 2 */:
                            int i6 = i2 + 2;
                            i2 += 3;
                            k32Var.j(gx0Var.c(i4), gx0Var.c(i6));
                            break;
                        case t91.INTEGER_FIELD_NUMBER /* 3 */:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    k32Var.h(gx0Var.c(i4), gx0Var.c(i7), gx0Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case t91.LONG_FIELD_NUMBER /* 4 */:
                            k32Var.a();
                            i2 = i4;
                            break;
                        case t91.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            k32Var.c(gx0Var.c(i4), sx0Var2.f(i3));
                            i3 = i9;
                            break;
                        case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                gx0Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object objF = sx0Var2.f(i3);
                            objF.getClass();
                            s22.i(2, objF);
                            i3 += 2;
                            k32Var.m((wa0) objF, sx0Var2.f(i11));
                            i2 = i4;
                            break;
                        case t91.BYTES_FIELD_NUMBER /* 8 */:
                            Object obj = k32Var.g;
                            if (obj instanceof to) {
                                to toVar = (to) obj;
                                if (hd1Var.f.j(toVar)) {
                                    toVar.b();
                                }
                            }
                            sx0Var.a(obj);
                            k32Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    k32Var.g();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new vo(sx0Var2, sx0Var, gx0Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.vc
    public final void c(int i, Object obj) {
        gx0 gx0Var = this.e;
        gx0Var.a(5);
        gx0Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.vc
    public final void d(Object obj) {
        this.e.a(1);
        this.f.a(obj);
    }

    @Override // defpackage.vc
    public final void e() {
        this.e.a(8);
    }

    @Override // defpackage.vc
    public final void f(int i, Object obj) {
        gx0 gx0Var = this.e;
        gx0Var.a(6);
        gx0Var.a(i);
        this.f.a(obj);
    }

    @Override // defpackage.vc
    public final void h(int i, int i2, int i3) {
        gx0 gx0Var = this.e;
        gx0Var.a(3);
        gx0Var.a(i);
        gx0Var.a(i2);
        gx0Var.a(i3);
    }

    @Override // defpackage.vc
    public final Object i() {
        return this.g;
    }

    @Override // defpackage.vc
    public final void j(int i, int i2) {
        gx0 gx0Var = this.e;
        gx0Var.a(2);
        gx0Var.a(i);
        gx0Var.a(i2);
    }

    @Override // defpackage.vc
    public final void m(wa0 wa0Var, Object obj) {
        this.e.a(7);
        sx0 sx0Var = this.f;
        sx0Var.a(wa0Var);
        sx0Var.a(obj);
    }

    @Override // defpackage.vc
    public final void q() {
        this.e.a(0);
    }
}
