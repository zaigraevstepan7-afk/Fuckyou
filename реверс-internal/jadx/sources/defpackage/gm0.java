package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gm0 extends sv0 implements w41 {
    public float s;
    public boolean t;

    @Override // defpackage.w41
    public final Object n0(Object obj) {
        rg1 rg1Var = obj instanceof rg1 ? (rg1) obj : null;
        if (rg1Var == null) {
            rg1Var = new rg1();
            rg1Var.a = 0.0f;
            rg1Var.b = true;
        }
        rg1Var.a = this.s;
        rg1Var.b = this.t;
        return rg1Var;
    }
}
