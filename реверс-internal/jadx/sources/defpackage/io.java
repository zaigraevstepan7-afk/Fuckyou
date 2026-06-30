package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class io extends m2 implements wa0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.l;
        t32 t32Var = t32.a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((jo) obj3).e((ob0) obj, ((Number) obj2).intValue());
                break;
            case 1:
                uj1 uj1Var = (uj1) obj3;
                nu0.A(uj1Var.P.f(), null, null, new sj1(uj1Var, ((o52) obj).a, null, 2), 3);
                break;
            default:
                uj1 uj1Var2 = (uj1) obj3;
                nu0.A(uj1Var2.P.f(), null, null, new sj1(uj1Var2, ((o52) obj).a, null, 1), 3);
                break;
        }
        return t32Var;
    }
}
