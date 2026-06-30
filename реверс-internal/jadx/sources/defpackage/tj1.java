package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tj1 extends zu1 implements wa0 {
    public int i;
    public final /* synthetic */ uj1 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj1(uj1 uj1Var, float f, float f2, ks ksVar) {
        super(2, ksVar);
        this.j = uj1Var;
        this.k = f;
        this.l = f2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((tj1) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        return new tj1(this.j, this.k, this.l, ksVar);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        if (i == 0) {
            xc.G(obj);
            bk1 bk1Var = this.j.R;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.k)) << 32) | (((long) Float.floatToRawIntBits(this.l)) & 4294967295L);
            this.i = 1;
            Object objA = oj1.a(bk1Var, jFloatToRawIntBits, this);
            wt wtVar = wt.e;
            if (objA == wtVar) {
                return wtVar;
            }
        } else {
            if (i != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
        }
        return t32.a;
    }
}
