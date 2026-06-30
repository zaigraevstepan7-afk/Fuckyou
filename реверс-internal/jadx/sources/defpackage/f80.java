package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f80 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ jx0 k;
    public final /* synthetic */ fy0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f80(jx0 jx0Var, fy0 fy0Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = jx0Var;
        this.l = fy0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((f80) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new f80(this.k, this.l, ksVar, 0);
            default:
                return new f80(this.k, this.l, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        int i = this.i;
        fy0 fy0Var = this.l;
        jx0 jx0Var = this.k;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    ArrayList arrayList = new ArrayList();
                    tn1 tn1Var = jx0Var.a;
                    e80 e80Var = new e80(arrayList, fy0Var, 0);
                    this.j = 1;
                    tn1Var.getClass();
                    tn1.k(tn1Var, e80Var, this);
                } else if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    ArrayList arrayList2 = new ArrayList();
                    tn1 tn1Var2 = jx0Var.a;
                    e80 e80Var2 = new e80(arrayList2, fy0Var, 1);
                    this.j = 1;
                    tn1Var2.getClass();
                    tn1.k(tn1Var2, e80Var2, this);
                } else if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xc.G(obj);
                }
                break;
        }
        return wtVar;
    }
}
