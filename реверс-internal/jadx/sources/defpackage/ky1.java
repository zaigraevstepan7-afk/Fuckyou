package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 {
    public static final n81 g;
    public final r41 a;
    public final r41 b = new r41(0.0f);
    public final s41 c = new s41(0);
    public pc1 d = pc1.e;
    public long e = wz1.b;
    public final v41 f;

    static {
        gi1 gi1Var = new gi1(8);
        fi1 fi1Var = new fi1(21);
        uq0 uq0Var = new uq0(0, gi1Var);
        s22.i(1, fi1Var);
        g = new n81(4, uq0Var, fi1Var);
    }

    public ky1(k31 k31Var, float f) {
        this.a = new r41(f);
        this.f = new v41(k31Var, l91.p);
    }

    public final void a(k31 k31Var, pc1 pc1Var, int i, int i2) {
        float f = i2 - i;
        this.b.h(f);
        float f2 = pc1Var.a;
        float f3 = pc1Var.b;
        pc1 pc1Var2 = this.d;
        float f4 = pc1Var2.a;
        r41 r41Var = this.a;
        if (f2 != f4 || f3 != pc1Var2.b) {
            boolean z = k31Var == k31.e;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? pc1Var.d : pc1Var.c;
            float fG = r41Var.g();
            float f6 = i;
            float f7 = fG + f6;
            r41Var.h(r41Var.g() + ((f5 <= f7 && (f2 >= fG || f5 - f2 <= f6)) ? (f2 >= fG || f5 - f2 > f6) ? 0.0f : f2 - fG : f5 - f7));
            this.d = pc1Var;
        }
        r41Var.h(lk.z(r41Var.g(), 0.0f, f));
        this.c.h(i);
    }
}
