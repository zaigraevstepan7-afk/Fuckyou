package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 implements ym1 {
    public static final zd0 b = new zd0(0);
    public static final zd0 c = new zd0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zd0(int i) {
        this.a = i;
    }

    @Override // defpackage.ym1
    public final hk a(long j, al0 al0Var, hx hxVar) {
        switch (this.a) {
            case 0:
                float fN = hxVar.N(30.0f);
                return new o31(new pc1(0.0f, -fN, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fN));
            case 1:
                float fN2 = hxVar.N(30.0f);
                return new o31(new pc1(-fN2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fN2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new o31(qc1.a(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
