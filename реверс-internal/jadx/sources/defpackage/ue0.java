package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue0 {
    public static final tv0 a = ko1.e(qv0.a, pv.z);

    public static final void a(final ye0 ye0Var, String str, tv0 tv0Var, long j, ob0 ob0Var, final int i, final int i2) {
        int i3;
        String str2;
        ob0 ob0Var2;
        final long j2;
        final tv0 tv0Var2;
        ob0Var.X(-126890956);
        if ((i & 6) == 0) {
            i3 = (ob0Var.f(ye0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && ob0Var.e(j)) ? 2048 : 1024;
        }
        if (ob0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                if (i4 != 0) {
                    tv0Var = qv0.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((vl) ob0Var.j(rr.a)).a;
                    i3 &= -7169;
                }
                tv0 tv0Var3 = tv0Var;
                long j3 = j;
                ob0Var.q();
                str2 = str;
                ob0Var2 = ob0Var;
                b(uc1.z(ye0Var, ob0Var), str2, tv0Var3, j3, ob0Var2, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                tv0Var2 = tv0Var3;
                j2 = j3;
            } else {
                ob0Var.Q();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                tv0 tv0Var32 = tv0Var;
                long j32 = j;
                ob0Var.q();
                str2 = str;
                ob0Var2 = ob0Var;
                b(uc1.z(ye0Var, ob0Var), str2, tv0Var32, j32, ob0Var2, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                tv0Var2 = tv0Var32;
                j2 = j32;
            }
        } else {
            str2 = str;
            ob0Var2 = ob0Var;
            ob0Var2.Q();
            j2 = j;
            tv0Var2 = tv0Var;
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            final String str3 = str2;
            dc1VarR.d = new wa0() { // from class: se0
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ue0.a(ye0Var, str3, tv0Var2, j2, (ob0) obj, al.V(i | 1), i2);
                    return t32.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(g41 g41Var, String str, tv0 tv0Var, long j, ob0 ob0Var, int i) {
        int i2;
        Object wfVar;
        tv0 tv0VarA;
        ob0Var.X(-2142239481);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ob0Var.f(g41Var) : ob0Var.h(g41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.f(tv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.e(j) ? 2048 : 1024;
        }
        if (ob0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ob0Var.S();
            if ((i & 1) != 0 && !ob0Var.x()) {
                ob0Var.Q();
            }
            ob0Var.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && ob0Var.e(j)) || (i2 & 3072) == 2048;
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (z || objK == l91Var) {
                wfVar = vl.c(j, vl.g) ? null : new wf(5, j);
                ob0Var.f0(wfVar);
            } else {
                wfVar = objK;
            }
            wl wlVar = (wl) wfVar;
            tv0 tv0Var2 = qv0.a;
            if (str != null) {
                ob0Var.W(-537002883);
                boolean z2 = (i2 & 112) == 32;
                Object objK2 = ob0Var.K();
                if (z2 || objK2 == l91Var) {
                    objK2 = new kq(str, i3);
                    ob0Var.f0(objK2);
                }
                tv0VarA = ol1.a(tv0Var2, false, (sa0) objK2);
                ob0Var.p(false);
            } else {
                ob0Var.W(-536844101);
                ob0Var.p(false);
                tv0VarA = tv0Var2;
            }
            if (!io1.a(g41Var.e(), 9205357640488583168L)) {
                long jE = g41Var.e();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jE >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jE & 4294967295L)))) {
                    tv0Var2 = a;
                }
                sg.a(nu0.E(tv0Var.c(tv0Var2), g41Var, xr.b, wlVar, 22).c(tv0VarA), ob0Var, 0);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new te0(g41Var, str, tv0Var, j, i);
        }
    }
}
