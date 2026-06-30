package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h80 {
    public final m80 a;
    public final h4 b;
    public final ay0 c;
    public final ay0 d;
    public boolean e;

    public h80(m80 m80Var, h4 h4Var) {
        this.a = m80Var;
        this.b = h4Var;
        ay0 ay0Var = qi1.a;
        this.c = new ay0();
        this.d = new ay0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        w3 w3Var = new w3(0, this, h80.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 6);
        sx0 sx0Var = this.b.r0;
        if (sx0Var.g(w3Var) < 0) {
            sx0Var.a(w3Var);
        }
        this.e = true;
    }
}
