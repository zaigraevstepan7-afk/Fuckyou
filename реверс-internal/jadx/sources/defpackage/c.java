package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ m f;

    public /* synthetic */ c(m mVar, int i) {
        this.e = i;
        this.f = mVar;
    }

    @Override // defpackage.ha0
    public final Object a() {
        xw xwVar;
        int i = this.e;
        m mVar = this.f;
        switch (i) {
            case 0:
                pf0 pf0Var = (pf0) hk.o(mVar, mf0.a);
                if (pf0Var == null) {
                    qg0.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + pf0Var);
                }
                pf0 pf0Var2 = mVar.C;
                mVar.C = pf0Var;
                if (pf0Var2 != null && !xi0.o(pf0Var, pf0Var2) && ((xwVar = mVar.F) != null || !mVar.M)) {
                    if (xwVar != null) {
                        mVar.M0(xwVar);
                    }
                    mVar.F = null;
                    mVar.W0();
                }
                return t32.a;
            default:
                mVar.a1();
                return Boolean.TRUE;
        }
    }
}
