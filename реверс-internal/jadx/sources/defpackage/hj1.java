package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 implements vj1 {
    public static final n81 k = new n81(4, new gi1(3), new fi1(4));
    public final s41 a;
    public float g;
    public final qx i;
    public final qx j;
    public final s41 b = new s41(0);
    public final s41 c = new s41(0);
    public final v41 d = xc.B(Boolean.FALSE);
    public final jx0 e = new jx0();
    public final s41 f = new s41(Integer.MAX_VALUE);
    public final nw h = new nw(new n(23, this));

    public hj1(int i) {
        this.a = new s41(i);
        final int i2 = 0;
        this.i = xc.s(new ha0(this) { // from class: gj1
            public final /* synthetic */ hj1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int i3 = i2;
                hj1 hj1Var = this.f;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(hj1Var.a.g() < hj1Var.f.g());
                    default:
                        return Boolean.valueOf(hj1Var.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.j = xc.s(new ha0(this) { // from class: gj1
            public final /* synthetic */ hj1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() {
                int i32 = i3;
                hj1 hj1Var = this.f;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(hj1Var.a.g() < hj1Var.f.g());
                    default:
                        return Boolean.valueOf(hj1Var.a.g() > 0);
                }
            }
        });
    }

    @Override // defpackage.vj1
    public final boolean a() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.vj1
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.vj1
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.vj1
    public final Object d(ly0 ly0Var, wa0 wa0Var, ls lsVar) {
        Object objD = this.h.d(ly0Var, wa0Var, lsVar);
        return objD == wt.e ? objD : t32.a;
    }

    @Override // defpackage.vj1
    public final float e(float f) {
        return this.h.e(f);
    }
}
