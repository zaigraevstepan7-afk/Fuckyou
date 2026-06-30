package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v40 extends si0 {
    public ha0 A;
    public m40 B;
    public long C;
    public b3 D;
    public final u40 E;
    public final u40 F;
    public d22 t;
    public z12 u;
    public z12 v;
    public z12 w;
    public w40 x;
    public j50 y;
    public vn1 z;

    public v40(d22 d22Var, z12 z12Var, z12 z12Var2, z12 z12Var3, w40 w40Var, j50 j50Var, vn1 vn1Var, ha0 ha0Var, m40 m40Var) {
        super(1);
        this.t = d22Var;
        this.u = z12Var;
        this.v = z12Var2;
        this.w = z12Var3;
        this.x = w40Var;
        this.y = j50Var;
        this.z = vn1Var;
        this.A = ha0Var;
        this.B = m40Var;
        this.C = -9223372034707292160L;
        lr.b(0, 0, 0, 0, 15);
        this.E = new u40(this, 1);
        this.F = new u40(this, 2);
    }

    @Override // defpackage.sv0
    public final void D0() {
        this.C = -9223372034707292160L;
    }

    public final b3 N0() {
        if (this.t.f().a(k40.e, k40.f)) {
            e22 e22Var = this.y.a;
            return null;
        }
        e22 e22Var2 = this.y.a;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    @Override // defpackage.si0, defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        long j2;
        y12 y12VarA;
        y12 y12VarA2;
        u12 u12Var;
        y12 y12VarA3;
        long j3;
        long j4;
        long j5;
        long j6;
        y12 y12VarA4;
        za zaVar;
        float fFloatValue;
        ya yaVar;
        Float fValueOf;
        v40 v40Var = this;
        if (v40Var.t.c() == v40Var.t.d.getValue()) {
            v40Var.D = null;
        } else if (v40Var.D == null) {
            b3 b3VarN0 = v40Var.N0();
            if (b3VarN0 == null) {
                b3VarN0 = v20.f;
            }
            v40Var.D = b3VarN0;
        }
        boolean zS = xu0Var.s();
        g40 g40Var = g40.e;
        if (zS) {
            z61 z61VarE = pu0Var.e(j);
            long j7 = (((long) z61VarE.e) << 32) | (((long) z61VarE.f) & 4294967295L);
            v40Var.C = j7;
            return xu0Var.f0((int) (j7 >> 32), (int) (j7 & 4294967295L), g40Var, new u3(z61VarE, 3));
        }
        if (!((Boolean) v40Var.A.a()).booleanValue()) {
            z61 z61VarE2 = pu0Var.e(j);
            return xu0Var.f0(z61VarE2.e, z61VarE2.f, g40Var, new u3(z61VarE2, 4));
        }
        m40 m40Var = v40Var.B;
        z12 z12Var = m40Var.a;
        vn1 vn1Var = m40Var.b;
        z12 z12Var2 = m40Var.c;
        d22 d22Var = m40Var.d;
        w40 w40Var = m40Var.e;
        e22 e22Var = w40Var.a;
        j50 j50Var = m40Var.f;
        z12 z12Var3 = m40Var.g;
        if (z12Var != null) {
            n40 n40Var = new n40(w40Var, j50Var, 0);
            if (vn1Var.a()) {
                j2 = 4294967295L;
                fValueOf = Float.valueOf(vn1Var.f);
            } else {
                j2 = 4294967295L;
                fValueOf = null;
            }
            y12VarA = z12Var.a(n40Var, fValueOf, null, new o40(w40Var, j50Var, vn1Var, 0));
        } else {
            j2 = 4294967295L;
            y12VarA = null;
        }
        if (z12Var2 != null) {
            n40 n40Var2 = new n40(w40Var, j50Var, 1);
            Float fValueOf2 = vn1Var.a() ? Float.valueOf(vn1Var.g) : null;
            if (vn1Var.a()) {
                q52 q52Var = vn1Var.j;
                if (q52Var != null) {
                    float fB = q52Var.b();
                    Float fValueOf3 = Float.valueOf(fB);
                    if (Float.isNaN(fB)) {
                        fValueOf3 = null;
                    }
                    float fFloatValue2 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
                    yaVar = new ya(fFloatValue2);
                }
            } else {
                yaVar = null;
            }
            y12VarA2 = z12Var2.a(n40Var2, fValueOf2, yaVar, new o40(w40Var, j50Var, vn1Var, 1));
        } else {
            y12VarA2 = null;
        }
        if (d22Var.c() == k40.e) {
            mi1 mi1Var = e22Var.b;
            if (mi1Var != null) {
                u12Var = new u12(mi1Var.b);
            } else {
                mi1 mi1Var2 = j50Var.a.b;
                u12Var = mi1Var2 != null ? new u12(mi1Var2.b) : null;
            }
        } else {
            mi1 mi1Var3 = j50Var.a.b;
            if (mi1Var3 != null) {
                u12Var = new u12(mi1Var3.b);
            } else {
                mi1 mi1Var4 = e22Var.b;
                if (mi1Var4 != null) {
                    u12Var = new u12(mi1Var4.b);
                }
            }
        }
        if (z12Var3 != null) {
            y12VarA3 = z12Var3.a(a4.C, vn1Var.a() ? new u12(vn1Var.h) : null, null, new p40(u12Var, w40Var, j50Var, vn1Var));
        } else {
            y12VarA3 = null;
        }
        p40 p40Var = new p40(vn1Var, y12VarA, y12VarA2, y12VarA3);
        z61 z61VarE3 = pu0Var.e(j);
        long j8 = (((long) z61VarE3.e) << 32) | (((long) z61VarE3.f) & j2);
        long j9 = !vh0.a(v40Var.C, -9223372034707292160L) ? v40Var.C : j8;
        z12 z12Var4 = v40Var.u;
        y12 y12VarA5 = z12Var4 != null ? z12Var4.a(v40Var.E, null, null, new t40(v40Var, j9, 0)) : null;
        long j10 = j9;
        long jD = lr.d(j, y12VarA5 != null ? ((vh0) y12VarA5.getValue()).a : j8);
        z12 z12Var5 = v40Var.v;
        if (z12Var5 != null) {
            j3 = j10;
            j4 = 0;
            j5 = ((oh0) z12Var5.a(a4.D, null, null, new t40(v40Var, j3, 1)).getValue()).a;
        } else {
            j3 = j10;
            j4 = 0;
            j5 = 0;
        }
        z12 z12Var6 = v40Var.w;
        if (z12Var6 != null) {
            vn1 vn1Var2 = v40Var.z;
            oh0 oh0Var = vn1Var2.a() ? new oh0(vn1Var2.i) : null;
            v40Var = this;
            if (v40Var.z.a()) {
                float fB2 = o52.b(j4);
                Float fValueOf4 = Float.valueOf(fB2);
                if (Float.isNaN(fB2)) {
                    fValueOf4 = null;
                }
                float fFloatValue3 = fValueOf4 != null ? fValueOf4.floatValue() : 0.0f;
                float fC = o52.c(j4);
                Float fValueOf5 = !Float.isNaN(fC) ? Float.valueOf(fC) : null;
                if (fValueOf5 != null) {
                    j6 = j8;
                    fFloatValue = fValueOf5.floatValue();
                } else {
                    j6 = j8;
                    fFloatValue = 0.0f;
                }
                zaVar = new za(fFloatValue3, fFloatValue);
            } else {
                j6 = j8;
                zaVar = null;
            }
            y12VarA4 = z12Var6.a(v40Var.F, oh0Var, zaVar, new u40(v40Var, j3));
        } else {
            j6 = j8;
            y12VarA4 = null;
        }
        return xu0Var.f0((int) (jD >> 32), (int) (jD & j2), g40Var, new s40(v40Var, y12VarA4, j6, j3, jD, z61VarE3, j5, p40Var));
    }
}
