package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 {
    public sv0 a;
    public int b;
    public iy0 c;
    public iy0 d;
    public boolean e;
    public final /* synthetic */ xz0 f;

    public vz0(xz0 xz0Var, sv0 sv0Var, int i, iy0 iy0Var, iy0 iy0Var2, boolean z) {
        this.f = xz0Var;
        this.a = sv0Var;
        this.b = i;
        this.c = iy0Var;
        this.d = iy0Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        iy0 iy0Var = this.c;
        int i3 = this.b;
        rv0 rv0Var = (rv0) iy0Var.e[i + i3];
        rv0 rv0Var2 = (rv0) this.d.e[i3 + i2];
        return xi0.o(rv0Var, rv0Var2) || rv0Var.getClass() == rv0Var2.getClass();
    }
}
