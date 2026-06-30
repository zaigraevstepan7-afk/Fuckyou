package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ m j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.j = mVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
            case 0:
                ((l) o(ksVar, vtVar)).q(t32Var);
                break;
            default:
                ((l) o(ksVar, vtVar)).q(t32Var);
                break;
        }
        return t32Var;
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        m mVar = this.j;
        switch (i) {
            case 0:
                return new l(mVar, ksVar, 0);
            default:
                return new l(mVar, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        ks ksVar = null;
        m mVar = this.j;
        switch (i) {
            case 0:
                xc.G(obj);
                if (mVar.H == null) {
                    ce0 ce0Var = new ce0();
                    jx0 jx0Var = mVar.u;
                    if (jx0Var != null) {
                        nu0.A(mVar.z0(), null, null, new e(jx0Var, ce0Var, ksVar, 0), 3);
                    }
                    mVar.H = ce0Var;
                }
                break;
            default:
                xc.G(obj);
                ce0 ce0Var2 = mVar.H;
                if (ce0Var2 != null) {
                    de0 de0Var = new de0(ce0Var2);
                    jx0 jx0Var2 = mVar.u;
                    if (jx0Var2 != null) {
                        nu0.A(mVar.z0(), null, null, new e(jx0Var2, de0Var, ksVar, 1), 3);
                    }
                    mVar.H = null;
                }
                break;
        }
        return t32Var;
    }
}
