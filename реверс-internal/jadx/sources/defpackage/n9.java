package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n9 implements yy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n9(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.yy
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((mq1) obj3).remove(obj2);
                ((ba) obj).c.k(obj2);
                break;
            case 1:
                ((xo0) obj3).g().f((to0) obj2);
                te teVar = (te) ((zc1) obj).e;
                if (teVar != null) {
                    teVar.a();
                }
                break;
            default:
                ih1 ih1Var = (ih1) obj3;
                nh1 nh1Var = (nh1) obj;
                if (ih1Var.f.k(obj2) == nh1Var) {
                    Map map = ih1Var.e;
                    Map mapE = nh1Var.e();
                    if (!mapE.isEmpty()) {
                        map.put(obj2, mapE);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
