package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nr extends sv0 implements i22 {
    public k72 s;
    public k72 t;
    public sa0 u;

    @Override // defpackage.sv0
    public final void D0() {
        pd1.t(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new fh0(this, 1));
        k72 k72Var = this.s;
        this.u.i(k72Var);
        this.t = k72Var;
        pd1.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new fh0(this, 0));
    }

    @Override // defpackage.sv0
    public final void E0() {
        this.t = this.s;
        pd1.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new fh0(this, 0));
    }

    @Override // defpackage.sv0
    public final void F0() {
        this.s = pv.D;
    }

    @Override // defpackage.i22
    public final Object p() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
