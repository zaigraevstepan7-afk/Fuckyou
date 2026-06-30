package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hp1 {
    public ha0 a;
    public final fl b;
    public final r41 c;
    public sa0 d;
    public final boolean e = true;
    public final float[] f = new float[0];
    public final s41 g = new s41(0);
    public final s41 h = new s41(0);
    public boolean i;
    public final v41 j;
    public final s41 k;
    public final s41 l;
    public final k31 m;
    public final v41 n;
    public final p7 o;
    public final r41 p;
    public final r41 q;
    public final gp1 r;
    public final qy0 s;

    public hp1(float f, ha0 ha0Var, fl flVar) {
        this.a = ha0Var;
        this.b = flVar;
        this.c = new r41(f);
        Boolean bool = Boolean.FALSE;
        this.j = xc.B(bool);
        this.k = new s41(0);
        this.l = new s41(0);
        this.m = k31.f;
        this.n = xc.B(bool);
        this.o = new p7(21, this);
        float f2 = flVar.a;
        float f3 = flVar.b - f2;
        this.p = new r41(xk.A(0.0f, 0.0f, lk.z(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.q = new r41(0.0f);
        this.r = new gp1(this);
        this.s = new qy0();
    }

    public final void a(float f) {
        float fMax;
        float fMin;
        if (this.m == k31.e) {
            float fG = this.h.g();
            s41 s41Var = this.l;
            fMax = Math.max(fG - (s41Var.g() / 2.0f), 0.0f);
            fMin = Math.min(s41Var.g() / 2.0f, fMax);
        } else {
            float fG2 = this.g.g();
            s41 s41Var2 = this.k;
            fMax = Math.max(fG2 - (s41Var2.g() / 2.0f), 0.0f);
            fMin = Math.min(s41Var2.g() / 2.0f, fMax);
        }
        r41 r41Var = this.p;
        float fG3 = r41Var.g() + f;
        r41 r41Var2 = this.q;
        r41Var.h(r41Var2.g() + fG3);
        r41Var2.h(0.0f);
        float f2 = fp1.f(r41Var.g(), this.f, fMin, fMax);
        fl flVar = this.b;
        float f3 = fMax - fMin;
        float fA = xk.A(flVar.a, flVar.b, lk.z(f3 == 0.0f ? 0.0f : (f2 - fMin) / f3, 0.0f, 1.0f));
        if (fA == this.c.g()) {
            return;
        }
        sa0 sa0Var = this.d;
        if (sa0Var != null) {
            sa0Var.i(Float.valueOf(fA));
        } else {
            c(fA);
        }
    }

    public final float b() {
        fl flVar = this.b;
        float f = flVar.a;
        float f2 = flVar.b;
        float fZ = lk.z(this.c.g(), f, f2);
        float f3 = f2 - f;
        return lk.z(f3 == 0.0f ? 0.0f : (fZ - f) / f3, 0.0f, 1.0f);
    }

    public final void c(float f) {
        if (this.e) {
            fl flVar = this.b;
            float f2 = flVar.a;
            float f3 = flVar.b;
            f = fp1.f(lk.z(f, f2, f3), this.f, f2, f3);
        }
        this.c.h(f);
    }
}
