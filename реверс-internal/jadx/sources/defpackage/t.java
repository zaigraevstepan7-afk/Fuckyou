package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements jt {
    public final kt e;

    public t(kt ktVar) {
        this.e = ktVar;
    }

    @Override // defpackage.jt
    public final kt getKey() {
        return this.e;
    }

    @Override // defpackage.lt
    public final /* bridge */ lt j(lt ltVar) {
        return hk.L(this, ltVar);
    }

    @Override // defpackage.lt
    public /* bridge */ jt l(kt ktVar) {
        return hk.v(this, ktVar);
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.lt
    public /* bridge */ lt u(kt ktVar) {
        return hk.J(this, ktVar);
    }
}
