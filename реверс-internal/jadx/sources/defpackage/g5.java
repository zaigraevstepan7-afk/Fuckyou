package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g5 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ g5(int i, long j) {
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        xi xiVar;
        Object oe1Var;
        int i = this.e;
        long j = this.f;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                li liVar = (li) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (liVar.e.d() >> 32)) / 2.0f;
                break;
            case 1:
                jh jhVar = (jh) obj;
                sa0 sa0Var = jhVar.b;
                if (sa0Var != null && (xiVar = jhVar.a) != null) {
                    try {
                        oe1Var = sa0Var.i(Long.valueOf(j));
                    } catch (Throwable th) {
                        oe1Var = new oe1(th);
                    }
                    xiVar.g(oe1Var);
                }
                break;
            default:
                ((am1) obj).a(hl1.a, new gl1(ad0.e, this.f, fl1.f, true));
                break;
        }
        return t32Var;
    }
}
