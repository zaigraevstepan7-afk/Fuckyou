package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zs extends zu1 implements wa0 {
    public /* synthetic */ Object i;
    public final /* synthetic */ q81 j;
    public final /* synthetic */ ex1 k;
    public final /* synthetic */ ry1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(q81 q81Var, ex1 ex1Var, ry1 ry1Var, ks ksVar) {
        super(2, ksVar);
        this.j = q81Var;
        this.k = ex1Var;
        this.l = ry1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        zs zsVar = (zs) o((ks) obj2, (vt) obj);
        t32 t32Var = t32.a;
        zsVar.q(t32Var);
        return t32Var;
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        zs zsVar = new zs(this.j, this.k, this.l, ksVar);
        zsVar.i = obj;
        return zsVar;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        xc.G(obj);
        vt vtVar = (vt) this.i;
        q81 q81Var = this.j;
        ks ksVar = null;
        ys ysVar = new ys(q81Var, this.k, ksVar, 0);
        yt ytVar = yt.h;
        nu0.A(vtVar, null, ytVar, ysVar, 1);
        nu0.A(vtVar, null, ytVar, new e(q81Var, this.l, ksVar, 12), 1);
        return t32.a;
    }
}
