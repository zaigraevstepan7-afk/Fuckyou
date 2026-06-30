package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {
    public static final bq a;

    static {
        xi0.g(16.0f);
        xi0.g(16.0f);
        a = new bq(new e2(2));
    }

    public static final void a(final ha0 ha0Var, tv0 tv0Var, dy dyVar, final jo joVar, ob0 ob0Var, final int i, final int i2) {
        int i3;
        ob0Var.X(24925658);
        if ((i & 6) == 0) {
            i3 = (ob0Var.h(ha0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & 384) == 0) {
            i4 |= ob0Var.f(dyVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ob0Var.h(joVar) ? 2048 : 1024;
        }
        if (ob0Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            if (i5 != 0) {
                dyVar = new dy(7);
            }
            sv svVar = (sv) ob0Var.j(a);
            oc ocVar = new oc();
            ocVar.a = ha0Var;
            ocVar.b = dyVar;
            ocVar.c = joVar;
            svVar.a(ocVar, ob0Var, 0);
            tv0Var = qv0.a;
        } else {
            ob0Var.Q();
        }
        final tv0 tv0Var2 = tv0Var;
        final dy dyVar2 = dyVar;
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: s2
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t2.a(ha0Var, tv0Var2, dyVar2, joVar, (ob0) obj, al.V(i | 1), i2);
                    return t32.a;
                }
            };
        }
    }
}
