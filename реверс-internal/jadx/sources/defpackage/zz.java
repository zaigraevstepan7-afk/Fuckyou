package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zz extends sk0 implements sa0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ vc1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(qt0 qt0Var, a00 a00Var, vc1 vc1Var) {
        super(1);
        this.g = vc1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        h22 h22Var = h22.e;
        vc1 vc1Var = this.g;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if (!a00Var.r) {
                    return h22.f;
                }
                if (a00Var.t != null) {
                    ng0.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                a00Var.t = null;
                vc1Var.e = vc1Var.e;
                return h22Var;
            default:
                if (!((be0) obj).u) {
                    return h22Var;
                }
                vc1Var.e = false;
                return h22.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(vc1 vc1Var) {
        super(1);
        this.g = vc1Var;
    }
}
