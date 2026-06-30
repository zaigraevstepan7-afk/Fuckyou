package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class ui1 extends s implements xt {
    public final ks j;

    public ui1(ks ksVar, lt ltVar) {
        super(ltVar, true);
        this.j = ksVar;
    }

    @Override // defpackage.vj0
    public void A(Object obj) {
        this.j.g(hk.Q(obj));
    }

    @Override // defpackage.vj0
    public final boolean U() {
        return true;
    }

    @Override // defpackage.xt
    public final xt d() {
        ks ksVar = this.j;
        if (ksVar instanceof xt) {
            return (xt) ksVar;
        }
        return null;
    }

    @Override // defpackage.vj0
    public void y(Object obj) throws ly {
        s22.H(bl.E(this.j), hk.Q(obj));
    }

    public void p0() {
    }
}
