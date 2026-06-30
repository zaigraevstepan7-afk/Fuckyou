package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ w80 g;
    public final /* synthetic */ w80 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ o9 j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u11(w80 w80Var, w80 w80Var2, Object obj, int i, o9 o9Var, int i2) {
        super(1);
        this.f = i2;
        this.g = w80Var;
        this.h = w80Var2;
        this.k = obj;
        this.i = i;
        this.j = o9Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        o9 o9Var = this.j;
        int i2 = this.i;
        Object obj2 = this.k;
        w80 w80Var = this.h;
        w80 w80Var2 = this.g;
        switch (i) {
            case 0:
                qf qfVar = (qf) obj;
                if (w80Var2 != ((m80) ((h4) bl.Q(w80Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zF0 = lk.f0(w80Var, (w80) obj2, i2, o9Var);
                Boolean boolValueOf = Boolean.valueOf(zF0);
                if (zF0 || !qfVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                qf qfVar2 = (qf) obj;
                if (w80Var2 != ((m80) ((h4) bl.Q(w80Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean z = af1.z(i2, o9Var, w80Var, (pc1) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                if (z || !qfVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
