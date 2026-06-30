package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends zu1 implements wa0 {
    public /* synthetic */ Object i;
    public final /* synthetic */ h9 j;
    public final /* synthetic */ List k;
    public final /* synthetic */ s41 l;
    public final /* synthetic */ r41 m;
    public final /* synthetic */ h9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(h9 h9Var, List list, s41 s41Var, r41 r41Var, h9 h9Var2, ks ksVar) {
        super(2, ksVar);
        this.j = h9Var;
        this.k = list;
        this.l = s41Var;
        this.m = r41Var;
        this.n = h9Var2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        qr0 qr0Var = (qr0) o((ks) obj2, (vt) obj);
        t32 t32Var = t32.a;
        qr0Var.q(t32Var);
        return t32Var;
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        qr0 qr0Var = new qr0(this.j, this.k, this.l, this.m, this.n, ksVar);
        qr0Var.i = obj;
        return qr0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        xc.G(obj);
        vt vtVar = (vt) this.i;
        ks ksVar = null;
        if (vtVar.f().l(v20.N) != null) {
            yc.d();
            return null;
        }
        nu0.A(vtVar, null, null, new pr0(this.j, this.k, this.l, this.m, null), 3);
        nu0.A(vtVar, null, null, new tv(this.n, ksVar, 7), 3);
        return t32.a;
    }
}
