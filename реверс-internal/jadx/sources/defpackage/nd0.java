package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd0 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ od0 f;

    public /* synthetic */ nd0(od0 od0Var, int i) {
        this.e = i;
        this.f = od0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        t32 t32Var = t32.a;
        od0 od0Var = this.f;
        switch (i) {
            case 0:
                if (od0Var.z != null) {
                    return t32Var;
                }
                throw s91.v("Font resolution state is not set.");
            default:
                if (od0Var.z != null) {
                    return t32Var;
                }
                throw s91.v("Font resolution state is not set.");
        }
    }
}
