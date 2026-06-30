package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb1 {
    public final bo0 a;

    public nb1(ha0 ha0Var) {
        this.a = new bo0(ha0Var);
    }

    public abstract pb1 a(Object obj);

    public s42 b() {
        return this.a;
    }

    public final pb1 c(sa0 sa0Var) {
        return new pb1(this, null, false, null, sa0Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 s42) = (r4v6 s42), (r4v7 s42) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s42 d(pb1 pb1Var, s42 s42Var) {
        s42 s42Var2;
        s42 s42Var3 = null;
        s42Var3 = null;
        s42Var3 = null;
        s42Var3 = null;
        s42Var3 = null;
        s42Var3 = null;
        if (s42Var instanceof i20) {
            if (pb1Var.e) {
                i20 i20Var = (i20) s42Var;
                i20Var.a.setValue(pb1Var.a());
                s42Var3 = i20Var;
            }
        } else if (s42Var instanceof zs1) {
            if ((pb1Var.b || pb1Var.f != null) && !pb1Var.e) {
                zs1 zs1Var = (zs1) s42Var;
                boolean zO = xi0.o(pb1Var.a(), zs1Var.a);
                s42Var2 = zs1Var;
                if (zO) {
                    s42Var3 = s42Var2;
                }
            }
        } else if (s42Var instanceof cq) {
            sa0 sa0Var = pb1Var.d;
            cq cqVar = (cq) s42Var;
            sa0 sa0Var2 = cqVar.a;
            s42Var2 = cqVar;
            if (sa0Var == sa0Var2) {
            }
        }
        if (s42Var3 != null) {
            return s42Var3;
        }
        if (!pb1Var.e) {
            sa0 sa0Var3 = pb1Var.d;
            return sa0Var3 != null ? new cq(sa0Var3) : new zs1(pb1Var.a());
        }
        Object obj = pb1Var.f;
        hq1 hq1Var = pb1Var.c;
        if (hq1Var == null) {
            hq1Var = l91.p;
        }
        return new i20(new v41(obj, hq1Var));
    }
}
