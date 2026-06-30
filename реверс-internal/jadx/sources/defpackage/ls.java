package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ls extends ye {
    public final lt f;
    public transient ks g;

    public ls(ks ksVar) {
        this(ksVar, ksVar != null ? ksVar.e() : null);
    }

    @Override // defpackage.ks
    public lt e() {
        lt ltVar = this.f;
        ltVar.getClass();
        return ltVar;
    }

    @Override // defpackage.ye
    public void r() {
        ks ksVar = this.g;
        if (ksVar != null && ksVar != this) {
            jt jtVarL = e().l(v20.z);
            jtVarL.getClass();
            my myVar = (my) ksVar;
            myVar.l();
            xi xiVarO = myVar.o();
            if (xiVarO != null) {
                xiVarO.p();
            }
        }
        this.g = nn.f;
    }

    public ls(ks ksVar, lt ltVar) {
        super(ksVar);
        this.f = ltVar;
    }
}
