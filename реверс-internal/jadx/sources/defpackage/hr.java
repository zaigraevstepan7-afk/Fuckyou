package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class hr {
    public final em a;
    public final em b;
    public final em c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hr(em emVar, em emVar2, int i) {
        float[] fArr;
        em emVarF = xk.p(emVar.b, 12884901888L) ? al.f(emVar) : emVar;
        em emVarF2 = xk.p(emVar2.b, 12884901888L) ? al.f(emVar2) : emVar2;
        float[] fArrA = xi0.u;
        if (i == 3) {
            boolean zP = xk.p(emVar.b, 12884901888L);
            boolean zP2 = xk.p(emVar2.b, 12884901888L);
            if (!(zP && zP2) && (zP || zP2)) {
                h72 h72Var = ((cf1) (zP ? emVar : emVar2)).d;
                float[] fArrA2 = zP ? h72Var.a() : fArrA;
                fArrA = zP2 ? h72Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        }
        this(emVar2, emVarF, emVarF2, fArr);
    }

    public long a(long j) {
        float fH = vl.h(j);
        float fG = vl.g(j);
        float fE = vl.e(j);
        float fD = vl.d(j);
        em emVar = this.b;
        long jD = emVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = emVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public hr(em emVar, em emVar2, em emVar3, float[] fArr) {
        this.a = emVar;
        this.b = emVar2;
        this.c = emVar3;
        this.d = fArr;
    }
}
