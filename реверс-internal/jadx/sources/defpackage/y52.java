package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y52 extends sk0 implements wa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xd0[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y52(xd0[] xd0VarArr, int i) {
        super(2);
        this.f = i;
        this.g = xd0VarArr;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        xd0[] xd0VarArr = this.g;
        switch (i) {
            case 0:
                return Float.valueOf(uc1.g((y61) obj, true, xd0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(uc1.g((y61) obj, false, xd0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
