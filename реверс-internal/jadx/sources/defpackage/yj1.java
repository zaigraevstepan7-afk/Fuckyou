package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yj1 implements fj1 {
    public final /* synthetic */ bk1 a;
    public final /* synthetic */ zj1 b;

    public yj1(bk1 bk1Var, zj1 zj1Var) {
        this.a = bk1Var;
        this.b = zj1Var;
    }

    @Override // defpackage.fj1
    public final float a(float f) {
        float fAbs = Math.abs(f);
        bk1 bk1Var = this.a;
        if (fAbs != 0.0f && !((Boolean) bk1Var.h.a()).booleanValue()) {
            throw new w60("The fling animation was cancelled", 0);
        }
        return bk1Var.e(bk1Var.h(this.b.a(2, bk1Var.f(bk1Var.i(f)))));
    }
}
