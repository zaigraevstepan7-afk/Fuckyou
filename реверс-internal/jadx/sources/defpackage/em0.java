package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class em0 implements to {
    public final ql0 e;
    public op f;
    public nu1 g;
    public int h;
    public int i;
    public final zx0 j;
    public final zx0 k;
    public final yl0 l;
    public final vl0 m;
    public final zx0 n;
    public final mu1 o;
    public final zx0 p;
    public final iy0 q;
    public int r;
    public int s;
    public final String t;

    public em0(ql0 ql0Var, nu1 nu1Var) {
        this.e = ql0Var;
        this.g = nu1Var;
        long[] jArr = pi1.a;
        this.j = new zx0();
        this.k = new zx0();
        this.l = new yl0(this);
        this.m = new vl0(this);
        this.n = new zx0();
        this.o = new mu1();
        this.p = new zx0();
        this.q = new iy0(new Object[16]);
        this.t = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(em0 em0Var, Object obj) {
        ql0 ql0Var = em0Var.e;
        em0Var.h();
        ql0 ql0Var2 = (ql0) em0Var.n.k(obj);
        if (ql0Var2 != null) {
            if (em0Var.s <= 0) {
                ng0.b("No pre-composed items to dispose");
            }
            int i = ((iy0) ((qx0) ql0Var.o()).f).i(ql0Var2);
            if (i < ((iy0) ((qx0) ql0Var.o()).f).g - em0Var.s) {
                ng0.b("Item is not in pre-composed item range");
            }
            em0Var.r++;
            em0Var.s--;
            wl0 wl0Var = (wl0) em0Var.j.g(ql0Var2);
            if (wl0Var != null) {
                e(wl0Var);
            }
            int i2 = (((iy0) ((qx0) ql0Var.o()).f).g - em0Var.s) - em0Var.r;
            em0Var.j(i, i2);
            em0Var.g(i2);
        }
        if (em0Var.q.h(obj)) {
            ql0.Z(ql0Var, true, 6);
        }
    }

    public static void e(wl0 wl0Var) {
        ay0 ay0Var;
        v51 v51Var = wl0Var.f;
        if (v51Var != null) {
            v51Var.h.set(x51.f);
            hd1 hd1Var = v51Var.k;
            if (hd1Var.d.h()) {
                ay0Var = hd1Var.d;
                ay0 ay0Var2 = qi1.a;
                hd1Var.d = new ay0();
                hd1Var.c.g();
            } else {
                ay0Var = null;
            }
            hd1Var.b();
            tp tpVar = v51Var.a;
            tpVar.u = null;
            if (ay0Var != null) {
                tpVar.y.k = ay0Var;
                tpVar.A = 2;
            }
            wl0Var.f = null;
            tp tpVar2 = wl0Var.c;
            if (tpVar2 != null) {
                tpVar2.m();
            }
            wl0Var.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.to
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        tp tpVar;
        ql0 ql0Var = this.e;
        ql0Var.t = true;
        zx0 zx0Var = this.j;
        Object[] objArr = zx0Var.c;
        long[] jArr = zx0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (tpVar = ((wl0) objArr[(i << 3) + i3]).c) != null) {
                            tpVar.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ql0Var.T();
        ql0Var.t = false;
        zx0Var.a();
        this.k.a();
        this.s = 0;
        this.r = 0;
        this.n.a();
        h();
    }

    @Override // defpackage.to
    public final void b() {
        i(true);
    }

    public final void d(wl0 wl0Var, boolean z) {
        v51 v51Var = wl0Var.f;
        if (v51Var != null) {
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            try {
                ql0 ql0Var = this.e;
                ql0Var.t = true;
                if (z) {
                    while (!v51Var.c()) {
                        try {
                            v51Var.e(new yc(18));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                v51Var.a();
                wl0Var.f = null;
                ql0Var.t = false;
            } finally {
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
            }
        }
    }

    public final iu1 f(Object obj) {
        return !this.e.J() ? new bm0() : new cm0(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.r = 0;
        List listO = this.e.o();
        qx0 qx0Var = (qx0) listO;
        int i2 = (((iy0) qx0Var.f).g - this.s) - 1;
        if (i <= i2) {
            this.o.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.j.g((ql0) qx0Var.get(i3));
                    objG.getClass();
                    ((tx0) this.o.f).a(((wl0) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.g.f(this.o);
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            z = false;
            while (i2 >= i) {
                try {
                    ql0 ql0Var = (ql0) ((qx0) listO).get(i2);
                    Object objG2 = this.j.g(ql0Var);
                    objG2.getClass();
                    wl0 wl0Var = (wl0) objG2;
                    Object obj = wl0Var.a;
                    if (((tx0) this.o.f).c(obj)) {
                        this.r++;
                        if (((Boolean) wl0Var.g.getValue()).booleanValue()) {
                            ul0 ul0Var = ql0Var.J;
                            tu0 tu0Var = ul0Var.p;
                            ol0 ol0Var = ol0.g;
                            tu0Var.p = ol0Var;
                            ct0 ct0Var = ul0Var.q;
                            if (ct0Var != null) {
                                ct0Var.n = ol0Var;
                            }
                            l(wl0Var, false);
                            if (wl0Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        ql0 ql0Var2 = this.e;
                        ql0Var2.t = true;
                        this.j.k(ql0Var);
                        tp tpVar = wl0Var.c;
                        if (tpVar != null) {
                            tpVar.m();
                        }
                        this.e.U(i2, 1);
                        ql0Var2.t = false;
                    }
                    this.k.k(obj);
                    i2--;
                } catch (Throwable th) {
                    uc1.B(sp1VarL, sp1VarU, sa0VarE);
                    throw th;
                }
            }
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (aq1.c) {
                ay0 ay0Var = aq1.j.h;
                if (ay0Var != null) {
                    if (ay0Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                aq1.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((iy0) ((qx0) this.e.o()).f).g;
        int i2 = this.j.e;
        if (i2 != i) {
            ng0.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.r;
        int i4 = this.s;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbN = s91.n("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            sbN.append(i4);
            ng0.a(sbN.toString());
        }
        int i5 = this.n.e;
        int i6 = this.s;
        if (i5 == i6) {
            return;
        }
        ng0.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.s = 0;
        this.n.a();
        List listO = this.e.o();
        int i = ((iy0) ((qx0) listO).f).g;
        if (this.r != i) {
            this.r = i;
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    ql0 ql0Var = (ql0) ((qx0) listO).get(i2);
                    wl0 wl0Var = (wl0) this.j.g(ql0Var);
                    if (wl0Var != null && ((Boolean) wl0Var.g.getValue()).booleanValue()) {
                        ul0 ul0Var = ql0Var.J;
                        tu0 tu0Var = ul0Var.p;
                        ol0 ol0Var = ol0.g;
                        tu0Var.p = ol0Var;
                        ct0 ct0Var = ul0Var.q;
                        if (ct0Var != null) {
                            ct0Var.n = ol0Var;
                        }
                        l(wl0Var, z);
                        wl0Var.a = pv.B;
                    }
                } catch (Throwable th) {
                    uc1.B(sp1VarL, sp1VarU, sa0VarE);
                    throw th;
                }
            }
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
            this.k.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        ql0 ql0Var = this.e;
        ql0Var.t = true;
        ql0Var.N(i, i2, 1);
        ql0Var.t = false;
    }

    public final void k(Object obj, wa0 wa0Var, boolean z) {
        ql0 ql0Var = this.e;
        if (ql0Var.J()) {
            h();
            if (this.k.c(obj)) {
                return;
            }
            this.p.k(obj);
            zx0 zx0Var = this.n;
            Object objG = zx0Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((iy0) ((qx0) ql0Var.o()).f).i(objG), ((iy0) ((qx0) ql0Var.o()).f).g);
                    this.s++;
                } else {
                    int i = ((iy0) ((qx0) ql0Var.o()).f).g;
                    ql0 ql0Var2 = new ql0(2);
                    ql0Var.t = true;
                    ql0Var.B(i, ql0Var2);
                    ql0Var.t = false;
                    this.s++;
                    objG = ql0Var2;
                }
                zx0Var.m(obj, objG);
            }
            m((ql0) objG, obj, z, wa0Var);
        }
    }

    public final void l(wl0 wl0Var, boolean z) {
        tp tpVar;
        if (z || !wl0Var.h) {
            wl0Var.g = xc.B(Boolean.FALSE);
        } else {
            wl0Var.g.setValue(Boolean.FALSE);
        }
        if (wl0Var.f != null) {
            e(wl0Var);
            return;
        }
        if (z) {
            tp tpVar2 = wl0Var.c;
            if (tpVar2 != null) {
                tpVar2.l();
                return;
            }
            return;
        }
        m31 m31VarM1915getOutOfFrameExecutor = ((h4) tl0.a(this.e)).m1915getOutOfFrameExecutor();
        if (m31VarM1915getOutOfFrameExecutor != null) {
            ((h4) m31VarM1915getOutOfFrameExecutor).C(new a7(8, wl0Var));
        } else {
            if (wl0Var.h || (tpVar = wl0Var.c) == null) {
                return;
            }
            tpVar.l();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(ql0 ql0Var, Object obj, boolean z, wa0 wa0Var) {
        boolean z2;
        tp tpVar;
        zx0 zx0Var = this.j;
        Object objG = zx0Var.g(ql0Var);
        Object obj2 = objG;
        if (objG == null) {
            jo joVar = po.a;
            wl0 wl0Var = new wl0();
            wl0Var.a = obj;
            wl0Var.b = joVar;
            wl0Var.c = null;
            wl0Var.g = xc.B(Boolean.TRUE);
            zx0Var.m(ql0Var, wl0Var);
            obj2 = wl0Var;
        }
        wl0 wl0Var2 = (wl0) obj2;
        boolean z3 = wl0Var2.b != wa0Var;
        if (wl0Var2.f != null) {
            if (z3) {
                e(wl0Var2);
            } else if (z) {
                return;
            } else {
                d(wl0Var2, true);
            }
        }
        tp tpVar2 = wl0Var2.c;
        if (tpVar2 != null) {
            synchronized (tpVar2.h) {
                z2 = tpVar2.r.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || wl0Var2.d) {
            wl0Var2.b = wa0Var;
            if (wl0Var2.f != null) {
                ng0.a("new subcompose call while paused composition is still active");
            }
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            try {
                ql0 ql0Var2 = this.e;
                ql0Var2.t = true;
                tp tpVar3 = wl0Var2.c;
                op opVar = this.f;
                if (opVar == null) {
                    ng0.c("parent composition reference not set");
                    throw new pn();
                }
                if (tpVar3 == null || tpVar3.v()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = y92.a;
                        tpVar = new tp(opVar, new k32(ql0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = y92.a;
                        tpVar = new tp(opVar, new k32(ql0Var));
                    }
                    tpVar3 = tpVar;
                }
                wl0Var2.c = tpVar3;
                wa0 joVar2 = wl0Var2.b;
                if (((h4) tl0.a(this.e)).m1915getOutOfFrameExecutor() != null) {
                    wl0Var2.h = false;
                } else {
                    wl0Var2.h = true;
                    joVar2 = new jo(1524156494, true, new z4(2, wl0Var2, joVar2));
                }
                if (z) {
                    if (wl0Var2.e) {
                        tpVar3.i();
                        tpVar3.q();
                        wl0Var2.f = tpVar3.k(true, joVar2);
                    } else {
                        wl0Var2.f = tpVar3.k(tpVar3.i(), joVar2);
                    }
                } else if (wl0Var2.e) {
                    tpVar3.i();
                    tpVar3.q();
                    ob0 ob0Var = tpVar3.z;
                    ob0Var.z = 0;
                    ob0Var.y = true;
                    tpVar3.e.a(tpVar3, joVar2);
                    if (ob0Var.F || ob0Var.z != 0) {
                        e91.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    ob0Var.z = -1;
                    ob0Var.y = false;
                } else {
                    tpVar3.B(joVar2);
                }
                wl0Var2.e = false;
                ql0Var2.t = false;
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                wl0Var2.d = false;
            } catch (Throwable th) {
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                throw th;
            }
        }
    }

    public final ql0 n(Object obj) {
        zx0 zx0Var;
        int i;
        if (this.r == 0) {
            return null;
        }
        qx0 qx0Var = (qx0) this.e.o();
        int i2 = ((iy0) qx0Var.f).g - this.s;
        int i3 = i2 - this.r;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            zx0Var = this.j;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = zx0Var.g((ql0) qx0Var.get(i5));
            objG.getClass();
            if (((wl0) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objG2 = zx0Var.g((ql0) qx0Var.get(i4));
                objG2.getClass();
                wl0 wl0Var = (wl0) objG2;
                Object obj2 = wl0Var.a;
                if (obj2 == pv.B || this.g.h(obj, obj2)) {
                    wl0Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.r--;
        ql0 ql0Var = (ql0) qx0Var.get(i3);
        Object objG3 = zx0Var.g(ql0Var);
        objG3.getClass();
        wl0 wl0Var2 = (wl0) objG3;
        wl0Var2.g = xc.B(Boolean.TRUE);
        wl0Var2.e = true;
        wl0Var2.d = true;
        return ql0Var;
    }
}
