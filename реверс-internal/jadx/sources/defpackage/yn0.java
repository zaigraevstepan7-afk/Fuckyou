package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 extends jr1 {
    public final ks j;

    public yn0(lt ltVar, wa0 wa0Var) {
        super(ltVar, false);
        this.j = bl.t(this, this, wa0Var);
    }

    @Override // defpackage.vj0
    public final void b0() throws Throwable {
        try {
            s22.H(bl.E(this.j), t32.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof ly) {
                th = ((ly) th).e;
            }
            g(xc.p(th));
            throw th;
        }
    }
}
