package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z4 extends sk0 implements wa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(int i, Object obj, Object obj2) {
        super(2);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.f;
        t32 t32Var = t32.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                rl1 rl1Var = (rl1) obj2;
                a5 a5Var = (a5) obj3;
                if (!((sl1) obj4).b.b(rl1Var.f)) {
                    a5Var.k(iIntValue, rl1Var);
                    a5Var.h();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                r40.a((d22) obj4, (ha0) obj3, (ob0) obj, al.V(1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ob0 ob0Var = (ob0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ob0Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    Boolean bool = (Boolean) ((wl0) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    wa0 wa0Var = (wa0) obj3;
                    ob0Var.Y(bool);
                    boolean zG = ob0Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        wa0Var.h(ob0Var, 0);
                    } else {
                        if (ob0Var.l != 0) {
                            mp.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!ob0Var.S) {
                            if (zG) {
                                ip1 ip1Var = ob0Var.G;
                                int i2 = ip1Var.g;
                                int i3 = ip1Var.h;
                                lp lpVar = ob0Var.M;
                                lpVar.getClass();
                                lpVar.d(false);
                                lpVar.b.b.b0(c21.c);
                                s22.f(ob0Var.s, i2, i3);
                                ob0Var.G.t();
                            } else {
                                ob0Var.P();
                            }
                        }
                    }
                    if (ob0Var.y && ob0Var.G.i == ob0Var.z) {
                        ob0Var.z = -1;
                        ob0Var.y = false;
                    }
                    ob0Var.p(false);
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                cj cjVar = (cj) obj;
                nc0 nc0Var = (nc0) obj2;
                c01 c01Var = (c01) obj4;
                ql0 ql0Var = c01Var.w;
                if (!ql0Var.K()) {
                    c01Var.S = true;
                } else {
                    c01Var.P = cjVar;
                    c01Var.O = nc0Var;
                    y31 snapshotObserver = ((h4) tl0.a(ql0Var)).getSnapshotObserver();
                    ue1 ue1Var = c01.U;
                    snapshotObserver.a.c(c01Var, zz0.g, (b01) obj3);
                    c01Var.S = false;
                }
                break;
            default:
                ((Number) obj2).intValue();
                pv.c((tv0) obj4, (wa0) obj3, (ob0) obj, al.V(1));
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(Object obj, eb0 eb0Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = obj;
        this.h = eb0Var;
    }
}
