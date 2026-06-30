package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x12 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ d22 f;

    public /* synthetic */ x12(d22 d22Var, int i) {
        this.e = i;
        this.f = d22Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        d22 d22Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf((xi0.o(d22Var.d.getValue(), d22Var.c()) && d22Var.h.g() == Long.MIN_VALUE && !((Boolean) d22Var.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(d22Var.b());
        }
    }
}
