package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class mu0 {
    public static final ys1 a = new ys1(new e2(23));
    public static final ys1 b = new ys1(new e2(24));

    public static final void a(bm bmVar, iw0 iw0Var, f32 f32Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        bm bmVar2;
        iw0 iw0Var2;
        f32 f32Var2;
        ob0Var.X(1317329884);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(bmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(iw0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= ob0Var.f(f32Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var.h(joVar) ? 16384 : 8192;
        }
        if (ob0Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ys1 ys1Var = a;
            if (((Boolean) ob0Var.j(ys1Var)).booleanValue()) {
                ob0Var.W(1458663246);
                ys1 ys1Var2 = b;
                if (bmVar == null) {
                    ob0Var.W(-1061323065);
                    bmVar2 = ((ju0) ob0Var.j(ys1Var2)).a;
                    ob0Var.p(false);
                } else {
                    ob0Var.W(-1061323964);
                    ob0Var.p(false);
                    bmVar2 = bmVar;
                }
                if (iw0Var == null) {
                    ob0Var.W(-1061320824);
                    iw0Var2 = ((ju0) ob0Var.j(ys1Var2)).d;
                    ob0Var.p(false);
                } else {
                    ob0Var.W(-1061321754);
                    ob0Var.p(false);
                    iw0Var2 = iw0Var;
                }
                if (f32Var == null) {
                    ob0Var.W(-1061318682);
                    f32Var2 = ((ju0) ob0Var.j(ys1Var2)).b;
                    ob0Var.p(false);
                } else {
                    ob0Var.W(-1061319550);
                    ob0Var.p(false);
                    f32Var2 = f32Var;
                }
                ob0Var.W(-1061316862);
                pn1 pn1Var = ((ju0) ob0Var.j(ys1Var2)).c;
                ob0Var.p(false);
                b(bmVar2, iw0Var2, pn1Var, f32Var2, joVar, ob0Var, i3 & 57344);
                ob0Var.p(false);
            } else {
                ob0Var.W(1458990389);
                lk.i(ys1Var.a(Boolean.TRUE), lk.d0(1535649272, new jf(bmVar, iw0Var, f32Var, joVar), ob0Var), ob0Var, 56);
                ob0Var.p(false);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fo(bmVar, iw0Var, f32Var, joVar, i);
        }
    }

    public static final void b(bm bmVar, iw0 iw0Var, pn1 pn1Var, f32 f32Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(904511636);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(bmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(iw0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.f(pn1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.f(f32Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ob0Var.h(joVar) ? 16384 : 8192;
        }
        int i3 = 0;
        if (ob0Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ob0Var.S();
            if ((i & 1) != 0 && !ob0Var.x()) {
                ob0Var.Q();
            }
            ob0Var.q();
            ju0 ju0Var = new ju0(bmVar, f32Var, pn1Var, iw0Var);
            vf1 vf1VarA = jf1.a(0.0f, null, 255);
            long j = bmVar.a;
            boolean zE = ob0Var.e(j);
            Object objK = ob0Var.K();
            if (zE || objK == kp.a) {
                objK = new xz1(j, vl.b(0.4f, j));
                ob0Var.f0(objK);
            }
            lk.j(new pb1[]{b.a(ju0Var), mf0.a.a(vf1VarA), yz1.a.a((xz1) objK)}, lk.d0(-1750539308, new ku0(f32Var, joVar, i3), ob0Var), ob0Var, 56);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new lu0(bmVar, iw0Var, pn1Var, f32Var, joVar, i, 0);
        }
    }
}
