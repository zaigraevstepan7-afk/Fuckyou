package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n40 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ w40 g;
    public final /* synthetic */ j50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n40(w40 w40Var, j50 j50Var, int i) {
        super(1);
        this.f = i;
        this.g = w40Var;
        this.h = j50Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        j50 j50Var = this.h;
        k40 k40Var = k40.g;
        w40 w40Var = this.g;
        k40 k40Var2 = k40.f;
        k40 k40Var3 = k40.e;
        switch (i) {
            case 0:
                a22 a22Var = (a22) obj;
                if (a22Var.a(k40Var3, k40Var2)) {
                    p50 p50Var = w40Var.a.a;
                    if (p50Var == null || (r5 = p50Var.a) == null) {
                    }
                } else if (a22Var.a(k40Var2, k40Var)) {
                    p50 p50Var2 = j50Var.a.a;
                    if (p50Var2 == null || (r5 = p50Var2.a) == null) {
                    }
                }
                break;
            default:
                a22 a22Var2 = (a22) obj;
                if (a22Var2.a(k40Var3, k40Var2)) {
                    mi1 mi1Var = w40Var.a.b;
                    if (mi1Var == null || (r5 = mi1Var.c) == null) {
                    }
                } else if (a22Var2.a(k40Var2, k40Var)) {
                    mi1 mi1Var2 = j50Var.a.b;
                    if (mi1Var2 == null || (r5 = mi1Var2.c) == null) {
                    }
                }
                break;
        }
        return r40.b;
    }
}
