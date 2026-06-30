package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nu extends zu1 implements sa0 {
    public int i;

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        nu nuVar = new nu(1, (ks) obj);
        t32 t32Var = t32.a;
        nuVar.q(t32Var);
        return t32Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        if (i == 0) {
            xc.G(obj);
            this.i = 1;
            throw null;
        }
        if (i == 1) {
            xc.G(obj);
            return t32.a;
        }
        yc.l("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
