package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jy1 implements vj1 {
    public final /* synthetic */ vj1 a;
    public final qx b;
    public final qx c;

    public jy1(vj1 vj1Var, final ky1 ky1Var) {
        this.a = vj1Var;
        final int i = 0;
        this.b = xc.s(new ha0() { // from class: iy1
            @Override // defpackage.ha0
            public final Object a() {
                int i2 = i;
                ky1 ky1Var2 = ky1Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(ky1Var2.a.g() < ky1Var2.b.g());
                    default:
                        return Boolean.valueOf(ky1Var2.a.g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = xc.s(new ha0() { // from class: iy1
            @Override // defpackage.ha0
            public final Object a() {
                int i22 = i2;
                ky1 ky1Var2 = ky1Var;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(ky1Var2.a.g() < ky1Var2.b.g());
                    default:
                        return Boolean.valueOf(ky1Var2.a.g() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.vj1
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.vj1
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.vj1
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.vj1
    public final Object d(ly0 ly0Var, wa0 wa0Var, ls lsVar) {
        return this.a.d(ly0Var, wa0Var, lsVar);
    }

    @Override // defpackage.vj1
    public final float e(float f) {
        return this.a.e(f);
    }
}
