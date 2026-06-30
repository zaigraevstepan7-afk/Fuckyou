package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh1 implements ha0 {
    public final /* synthetic */ int e;

    public /* synthetic */ lh1(int i) {
        this.e = i;
    }

    @Override // defpackage.ha0
    public final Object a() {
        switch (this.e) {
            case 0:
                ys1 ys1Var = mh1.a;
                return null;
            case 1:
                return new hj1(0);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                bq bqVar = ll1.a;
                return null;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new pn1();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new tz(0.0f);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                bq bqVar2 = uw1.a;
                return null;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return j32.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return rw.a;
            default:
                return new f32();
        }
    }
}
