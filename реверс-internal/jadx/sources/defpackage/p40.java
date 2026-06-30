package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p40 extends sk0 implements sa0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ vn1 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(vn1 vn1Var, y12 y12Var, y12 y12Var2, y12 y12Var3) {
        super(1);
        this.g = vn1Var;
        this.h = y12Var;
        this.i = y12Var2;
        this.j = y12Var3;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long jN;
        int i = this.f;
        Object obj2 = this.i;
        Object obj3 = this.h;
        vn1 vn1Var = this.g;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ue1 ue1Var = (ue1) obj;
                ns1 ns1Var = (ns1) obj3;
                float fFloatValue = ns1Var != null ? ((Number) ns1Var.getValue()).floatValue() : 1.0f;
                qm0 qm0Var = vn1Var.c;
                float fG = fFloatValue * ((vn1Var.b() && ((Boolean) ((v41) qm0Var.a).getValue()).booleanValue()) ? ((r41) qm0Var.b).g() : 1.0f);
                if (vn1Var.b()) {
                    vn1Var.f = fG;
                }
                ue1Var.c(fG);
                ns1 ns1Var2 = (ns1) obj2;
                float fFloatValue2 = ns1Var2 != null ? ((Number) ns1Var2.getValue()).floatValue() : 1.0f;
                boolean z = vn1Var.b() && ((Boolean) ((v41) qm0Var.c).getValue()).booleanValue();
                float fG2 = fFloatValue2 * (z ? ((r41) qm0Var.d).g() : 1.0f);
                if (vn1Var.b()) {
                    vn1Var.g = fG2;
                    if (z) {
                        if (vn1Var.j == null) {
                            vn1Var.j = new q52(false);
                        }
                        q52 q52Var = vn1Var.j;
                        if (q52Var != null) {
                            long j = vn1Var.d;
                            long jA = yv0.a();
                            if ((1 | (j - 1)) == Long.MAX_VALUE) {
                                long jZ = xk.z(j);
                                wr wrVar = z10.e;
                                jN = ((-(jZ >> 1)) << 1) + ((long) (((int) jZ) & 1));
                                int i2 = b20.a;
                            } else {
                                jN = xk.N(jA, j);
                            }
                            q52Var.a(fG2, z10.b(jN));
                        }
                    }
                }
                ue1Var.k(fG2);
                ue1Var.m(fG2);
                ns1 ns1Var3 = (ns1) obj4;
                long j2 = ns1Var3 != null ? ((u12) ns1Var3.getValue()).a : u12.b;
                if (vn1Var.b() && ((Boolean) ((v41) qm0Var.e).getValue()).booleanValue()) {
                    j2 = ((u12) ((v41) qm0Var.f).getValue()).a;
                }
                if (vn1Var.b()) {
                    vn1Var.h = j2;
                }
                ue1Var.r(j2);
                return t32.a;
            default:
                j50 j50Var = (j50) obj4;
                int iOrdinal = ((k40) obj).ordinal();
                u12 u12Var = null;
                if (iOrdinal == 0) {
                    mi1 mi1Var = ((w40) obj2).a.b;
                    if (mi1Var != null) {
                        u12Var = new u12(mi1Var.b);
                    } else {
                        mi1 mi1Var2 = j50Var.a.b;
                        if (mi1Var2 != null) {
                            u12Var = new u12(mi1Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    u12Var = (u12) obj3;
                } else {
                    if (iOrdinal != 2) {
                        ez1.a();
                        return null;
                    }
                    mi1 mi1Var3 = j50Var.a.b;
                    u12Var = new u12(mi1Var3 != null ? mi1Var3.b : vn1Var.h);
                }
                return new u12(u12Var != null ? u12Var.a : u12.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(u12 u12Var, w40 w40Var, j50 j50Var, vn1 vn1Var) {
        super(1);
        this.h = u12Var;
        this.i = w40Var;
        this.j = j50Var;
        this.g = vn1Var;
    }
}
