package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z9 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ aa g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(aa aaVar, long j, int i) {
        super(1);
        this.f = i;
        this.g = aaVar;
        this.h = j;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        p60 p60Var;
        int i = this.f;
        long j = this.h;
        aa aaVar = this.g;
        switch (i) {
            case 0:
                a22 a22Var = (a22) obj;
                if (!xi0.o(a22Var.b(), aaVar.v.b())) {
                    ns1 ns1Var = (ns1) aaVar.v.c.g(a22Var.b());
                    j = ns1Var != null ? ((vh0) ns1Var.getValue()).a : 0L;
                } else if (!vh0.a(aaVar.w, -9223372034707292160L)) {
                    j = aaVar.w;
                }
                ns1 ns1Var2 = (ns1) aaVar.v.c.g(a22Var.c());
                j = ns1Var2 != null ? ((vh0) ns1Var2.getValue()).a : 0L;
                mo1 mo1Var = (mo1) aaVar.u.getValue();
                return (mo1Var == null || (p60Var = (p60) mo1Var.a.h(new vh0(j), new vh0(j))) == null) ? pv.D(0.0f, 400.0f, null, 5) : p60Var;
            default:
                if (xi0.o(obj, aaVar.v.b())) {
                    j = vh0.a(aaVar.w, -9223372034707292160L) ? j : aaVar.w;
                } else {
                    ns1 ns1Var3 = (ns1) aaVar.v.c.g(obj);
                    if (ns1Var3 != null) {
                        j = ((vh0) ns1Var3.getValue()).a;
                    }
                }
                return new vh0(j);
        }
    }
}
