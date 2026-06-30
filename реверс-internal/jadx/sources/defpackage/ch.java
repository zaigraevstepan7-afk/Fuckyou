package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ch extends zu1 implements wa0 {
    public /* synthetic */ Object i;
    public final /* synthetic */ dh j;
    public final /* synthetic */ c01 k;
    public final /* synthetic */ y3 l;
    public final /* synthetic */ ke m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(dh dhVar, c01 c01Var, y3 y3Var, ke keVar, ks ksVar) {
        super(2, ksVar);
        this.j = dhVar;
        this.k = c01Var;
        this.l = y3Var;
        this.m = keVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((ch) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        ch chVar = new ch(this.j, this.k, this.l, this.m, ksVar);
        chVar.i = obj;
        return chVar;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        xc.G(obj);
        vt vtVar = (vt) this.i;
        y3 y3Var = this.l;
        dh dhVar = this.j;
        nu0.A(vtVar, null, null, new g(dhVar, this.k, y3Var, null, 2), 3);
        return nu0.A(vtVar, null, null, new e(dhVar, this.m, null, 5), 3);
    }
}
