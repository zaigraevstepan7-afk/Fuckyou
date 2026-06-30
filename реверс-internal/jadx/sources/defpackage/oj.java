package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class oj extends nj {
    public final wa0 h;

    public oj(wa0 wa0Var, lt ltVar, int i, ph phVar) {
        super(ltVar, i, phVar);
        this.h = wa0Var;
    }

    @Override // defpackage.nj
    public Object a(ya1 ya1Var, ks ksVar) {
        Object objH = this.h.h(ya1Var, ksVar);
        return objH == wt.e ? objH : t32.a;
    }

    @Override // defpackage.nj
    public nj b(lt ltVar, int i, ph phVar) {
        return new oj(this.h, ltVar, i, phVar);
    }

    @Override // defpackage.nj
    public final String toString() {
        return "block[" + this.h + "] -> " + super.toString();
    }
}
