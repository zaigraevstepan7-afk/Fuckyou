package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ym1 h;
    public final /* synthetic */ List i;
    public final /* synthetic */ int j;

    public /* synthetic */ or0(long j, long j2, ym1 ym1Var, List list, int i, int i2) {
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = ym1Var;
        this.i = list;
        this.j = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = al.V(i2 | 1);
                c2.f(this.f, this.g, this.h, this.i, (ob0) obj, iV);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV2 = al.V(i2 | 1);
                c2.e(this.f, this.g, this.h, this.i, (ob0) obj, iV2);
                break;
        }
        return t32Var;
    }
}
