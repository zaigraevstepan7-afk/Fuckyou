package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te0 implements wa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Serializable i;
    public final /* synthetic */ Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ te0(long j, d02 d02Var, pb1[] pb1VarArr, wa0 wa0Var, int i) {
        this.f = j;
        this.h = d02Var;
        this.i = pb1VarArr;
        this.j = wa0Var;
        this.g = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.g;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(i2 | 1);
                ue0.b((g41) obj5, (String) obj4, (tv0) obj3, this.f, (ob0) obj, iV);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = al.V(i2 | 1);
                bk.f(this.f, (d02) obj5, (pb1[]) obj4, (wa0) obj3, (ob0) obj, iV2);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ te0(g41 g41Var, String str, tv0 tv0Var, long j, int i) {
        this.h = g41Var;
        this.i = str;
        this.j = tv0Var;
        this.f = j;
        this.g = i;
    }
}
