package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln0 extends kb1 implements ck0, ha0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.l = i2;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.l;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ns1) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }

    @Override // defpackage.oi
    public final xj0 d() {
        ad1.a.getClass();
        return this;
    }
}
