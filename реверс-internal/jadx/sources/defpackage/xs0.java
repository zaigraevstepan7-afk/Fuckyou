package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends y61 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ xs0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.hx
    public final float b() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ws0) obj).b();
            default:
                return ((h4) obj).getDensity().b();
        }
    }

    @Override // defpackage.y61
    public float c(xd0 xd0Var) {
        sa0 sa0Var;
        int iV;
        y31 snapshotObserver;
        int iV2;
        switch (this.f) {
            case 0:
                wa0 wa0Var = xd0Var.a;
                if (wa0Var != null) {
                    return ((Number) wa0Var.h(this, Float.valueOf(Float.NaN))).floatValue();
                }
                ws0 ws0Var = (ws0) this.g;
                if (ws0Var.s) {
                    return Float.NaN;
                }
                zc1 zc1Var = new zc1();
                zc1Var.e = ws0Var;
                while (true) {
                    ub ubVar = ((ws0) zc1Var.e).u;
                    float f = (ubVar == null || (iV2 = nd.V((xd0[]) ubVar.b, xd0Var)) < 0) ? Float.NaN : ((float[]) ubVar.c)[iV2];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = zc1Var.e;
                    if (!zIsNaN) {
                        ((ws0) obj).q0(ws0Var.C0(), xd0Var);
                        return xd0Var.a(f, ((ws0) zc1Var.e).A0(), ws0Var.A0());
                    }
                    ws0 ws0Var2 = (ws0) obj;
                    wa0 wa0Var2 = ws0Var2.l;
                    if (wa0Var2 != null && (sa0Var = ws0Var2.m) != null && ((Boolean) sa0Var.i(xd0Var)).booleanValue()) {
                        ws0 ws0Var3 = (ws0) zc1Var.e;
                        zx0 zx0Var = ws0Var3.o;
                        if (zx0Var == null) {
                            long[] jArr = pi1.a;
                            zx0Var = new zx0();
                            ws0Var3.o = zx0Var;
                        }
                        Object objG = zx0Var.g(xd0Var);
                        if (objG == null) {
                            objG = new b71(ws0Var3.D0(), ws0Var3, xd0Var);
                            zx0Var.m(xd0Var, objG);
                        }
                        b71 b71Var = (b71) objG;
                        b71Var.e = ws0Var3.D0();
                        w31 w31Var = ws0Var.C0().r;
                        if (w31Var != null && (snapshotObserver = ((h4) w31Var).getSnapshotObserver()) != null) {
                            snapshotObserver.a.c(b71Var, a4.J, new ts0(wa0Var2, zc1Var, xd0Var, 0));
                        }
                        ((ws0) zc1Var.e).q0(ws0Var.C0(), xd0Var);
                        ub ubVar2 = ((ws0) zc1Var.e).u;
                        float f2 = (ubVar2 == null || (iV = nd.V((xd0[]) ubVar2.b, xd0Var)) < 0) ? Float.NaN : ((float[]) ubVar2.c)[iV];
                        if (!Float.isNaN(f2)) {
                            return xd0Var.a(f2, ((ws0) zc1Var.e).A0(), ws0Var.A0());
                        }
                    }
                    ws0 ws0VarE0 = ((ws0) zc1Var.e).E0();
                    if (ws0VarE0 == null) {
                        ((ws0) zc1Var.e).q0(ws0Var.C0(), xd0Var);
                        return Float.NaN;
                    }
                    zc1Var.e = ws0VarE0;
                }
                break;
            default:
                return super.c(xd0Var);
        }
    }

    @Override // defpackage.y61
    public final al0 e() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ws0) obj).getLayoutDirection();
            default:
                return ((h4) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.y61
    public final int f() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ws0) obj).h0();
            default:
                return ((h4) obj).getRoot().J.p.e;
        }
    }

    @Override // defpackage.hx
    public final float l() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ws0) obj).l();
            default:
                return ((h4) obj).getDensity().l();
        }
    }
}
