package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.ExtractedText;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class bk {
    public static ye0 a;
    public static ye0 b;
    public static ye0 c;

    public bk(uc1 uc1Var) {
        new Rect();
    }

    public static final String[] A(as asVar) {
        asVar.getClass();
        return (String[]) ((c5) asVar).b.toArray(new String[0]);
    }

    public static final ye0 C() {
        ye0 ye0Var = b;
        if (ye0Var != null) {
            return ye0Var;
        }
        xe0 xe0Var = new xe0("Rounded.Image", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = a52.a;
        uq1 uq1Var = new uq1(vl.b);
        y41 y41Var = new y41(0);
        y41Var.y(21.0f, 19.0f);
        y41Var.E(5.0f);
        y41Var.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        y41Var.u(5.0f);
        y41Var.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y41Var.F(14.0f);
        y41Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y41Var.v(14.0f);
        y41Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y41Var.m();
        y41Var.y(8.9f, 13.98f);
        y41Var.x(2.1f, 2.53f);
        y41Var.x(3.1f, -3.99f);
        y41Var.r(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f);
        y41Var.x(3.51f, 4.68f);
        y41Var.r(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        y41Var.u(6.02f);
        y41Var.r(-0.42f, 0.0f, -0.65f, -0.48f, -0.39f, -0.81f);
        y41Var.w(8.12f, 14.0f);
        y41Var.r(0.19f, -0.26f, 0.57f, -0.27f, 0.78f, -0.02f);
        y41Var.m();
        xe0.a(xe0Var, (ArrayList) y41Var.f, uq1Var);
        ye0 ye0VarB = xe0Var.b();
        b = ye0VarB;
        return ye0VarB;
    }

    public static final oj0 D(lt ltVar) {
        oj0 oj0Var = (oj0) ltVar.l(v20.O);
        if (oj0Var != null) {
            return oj0Var;
        }
        yc.g(ltVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final int E(vw0 vw0Var, long j, j62 j62Var) {
        float f = j62Var != null ? j62Var.f() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = vw0Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < vw0Var.f(iE) - f || Float.intBitsToFloat(i) > vw0Var.b(iE) + f) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-f) || Float.intBitsToFloat(i2) > vw0Var.d + f) {
            return -1;
        }
        return iE;
    }

    public static final int F(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final ye0 G() {
        ye0 ye0Var = c;
        if (ye0Var != null) {
            return ye0Var;
        }
        xe0 xe0Var = new xe0("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = a52.a;
        uq1 uq1Var = new uq1(vl.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new f51(8.0f, 6.82f));
        arrayList.add(new r51(10.36f));
        arrayList.add(new k51(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f));
        arrayList.add(new m51(8.14f, -5.18f));
        arrayList.add(new k51(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f));
        arrayList.add(new e51(9.54f, 5.98f));
        arrayList.add(new c51(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f));
        arrayList.add(b51.c);
        xe0.a(xe0Var, arrayList, uq1Var);
        ye0 ye0VarB = xe0Var.b();
        c = ye0VarB;
        return ye0VarB;
    }

    public static final long H(jo0 jo0Var, pc1 pc1Var, int i) {
        ez1 ez1Var = l91.t;
        qz1 qz1VarD = jo0Var.d();
        vw0 vw0Var = qz1VarD != null ? qz1VarD.a.b : null;
        zk0 zk0VarC = jo0Var.c();
        return (vw0Var == null || zk0VarC == null) ? wz1.b : vw0Var.h(pc1Var.i(zk0VarC.t(0L)), i, ez1Var);
    }

    public static final az I(oj0 oj0Var, boolean z, rj0 rj0Var) {
        if (oj0Var instanceof vj0) {
            return ((vj0) oj0Var).T(z, rj0Var);
        }
        return oj0Var.x(rj0Var.r(), z, new f(1, rj0Var, rj0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 27));
    }

    public static final boolean J(lt ltVar) {
        oj0 oj0Var = (oj0) ltVar.l(v20.O);
        if (oj0Var != null) {
            return oj0Var.b();
        }
        return true;
    }

    public static final boolean K(ql0 ql0Var) {
        if (ql0Var.l == null) {
            return false;
        }
        ql0 ql0VarU = ql0Var.u();
        return (ql0VarU != null ? ql0VarU.l : null) == null || ql0Var.J.b;
    }

    public static final boolean L(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean M(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean N(int i) {
        int type;
        return (!M(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final tv0 O(ob0 ob0Var, tv0 tv0Var) {
        if (tv0Var.b(a4.w)) {
            return tv0Var;
        }
        ob0Var.R(1219399079, 0, null, null);
        tv0 tv0Var2 = (tv0) tv0Var.a(new q(5, ob0Var), qv0.a);
        ob0Var.p(false);
        return tv0Var2;
    }

    public static final tv0 P(ob0 ob0Var, tv0 tv0Var) {
        ob0Var.W(439770924);
        tv0 tv0VarO = O(ob0Var, tv0Var);
        ob0Var.p(false);
        return tv0VarO;
    }

    public static zu0 Q(wr wrVar, pg1 pg1Var) {
        List listG;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = pg1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v50 v50Var = (v50) list.get(i);
            List list2 = v50Var.a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((v50Var instanceof t50) && i2 == list2.size() / 2) {
                    arrayList2.add(new j41(v50Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i2));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iY = ql.Y(arrayList, 9);
        if (iY == 0) {
            listG = hk.G(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iY + 1);
            arrayList3.add(fValueOf);
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                fu fuVar = (fu) obj;
                float fFloatValue = fValueOf.floatValue();
                fuVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (wr.j(fuVar, Float.POSITIVE_INFINITY) & 4294967295L));
                if (fIntBitsToFloat < 0.0f) {
                    yc.p("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
                fValueOf = Float.valueOf(fFloatValue + fIntBitsToFloat);
                arrayList3.add(fValueOf);
            }
            listG = arrayList3;
        }
        float fFloatValue2 = ((Number) pl.i0(listG)).floatValue();
        ex0 ex0Var = new ex0(listG.size());
        int size4 = listG.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ex0Var.a(((Number) listG.get(i4)).floatValue() / fFloatValue2);
        }
        aq0 aq0VarN = hk.n();
        int size5 = arrayList2.size();
        for (int i5 = 0; i5 < size5; i5++) {
            int iIntValue = ((Number) ((j41) arrayList2.get(i5)).f).intValue();
            aq0VarN.add(new jb1(q42.c((ex0Var.b(iIntValue + 1) + ex0Var.b(iIntValue)) / 2.0f), (v50) ((j41) arrayList2.get(i5)).e));
        }
        return new zu0(wrVar, hk.k(aq0VarN), arrayList, ex0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void R(sv0 sv0Var, ha0 ha0Var) {
        v01 v01Var = sv0Var.k;
        if (v01Var == null) {
            v01Var = new v01((u01) sv0Var);
            sv0Var.k = v01Var;
        }
        y31 snapshotObserver = ((h4) bl.Q(sv0Var)).getSnapshotObserver();
        snapshotObserver.a.c(v01Var, zz0.i, ha0Var);
    }

    public static final ju U(w80 w80Var) {
        int iOrdinal = w80Var.Q0().ordinal();
        ju juVar = ju.e;
        if (iOrdinal != 0) {
            ju juVar2 = ju.f;
            if (iOrdinal == 1) {
                w80 w80VarW = hk.w(w80Var);
                if (w80VarW == null) {
                    yc.p("ActiveParent with no focused child");
                    return null;
                }
                ju juVarU = U(w80VarW);
                ju juVar3 = juVarU != juVar ? juVarU : null;
                if (juVar3 != null) {
                    return juVar3;
                }
                if (w80Var.t) {
                    return juVar;
                }
                w80Var.t = true;
                try {
                    n80 n80VarN0 = w80Var.N0();
                    m80 m80Var = (m80) ((h4) bl.Q(w80Var)).getFocusOwner();
                    w80 w80VarF = m80Var.f();
                    n80VarN0.k.getClass();
                    w80 w80VarF2 = m80Var.f();
                    return (w80VarF == w80VarF2 || w80VarF2 == null) ? juVar : o80.d == o80.c ? juVar2 : ju.g;
                } finally {
                    w80Var.t = false;
                }
            }
            if (iOrdinal == 2) {
                return juVar2;
            }
            if (iOrdinal != 3) {
                ez1.a();
                return null;
            }
        }
        return juVar;
    }

    public static final ju V(w80 w80Var) {
        if (!w80Var.u) {
            w80Var.u = true;
            try {
                n80 n80VarN0 = w80Var.N0();
                m80 m80Var = (m80) ((h4) bl.Q(w80Var)).getFocusOwner();
                w80 w80VarF = m80Var.f();
                n80VarN0.j.getClass();
                w80 w80VarF2 = m80Var.f();
                if (w80VarF != w80VarF2 && w80VarF2 != null) {
                    return o80.d == o80.c ? ju.f : ju.g;
                }
            } finally {
                w80Var.u = false;
            }
        }
        return ju.e;
    }

    public static final ju W(w80 w80Var) {
        sv0 sv0VarK;
        xz0 xz0Var;
        int iOrdinal = w80Var.Q0().ordinal();
        ju juVar = ju.e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                w80 w80VarW = hk.w(w80Var);
                if (w80VarW != null) {
                    return U(w80VarW);
                }
                yc.p("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    ez1.a();
                    return null;
                }
                if (!w80Var.e.r) {
                    ng0.b("visitAncestors called on an unattached node");
                }
                sv0 sv0Var = w80Var.e.i;
                ql0 ql0VarP = bl.P(w80Var);
                loop0: while (true) {
                    if (ql0VarP == null) {
                        sv0VarK = null;
                        break;
                    }
                    if ((ql0VarP.I.f.h & 1024) != 0) {
                        while (sv0Var != null) {
                            if ((sv0Var.g & 1024) != 0) {
                                sv0VarK = sv0Var;
                                iy0 iy0Var = null;
                                while (sv0VarK != null) {
                                    if (sv0VarK instanceof w80) {
                                        break loop0;
                                    }
                                    if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                        int i = 0;
                                        for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                            if ((sv0Var2.g & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    sv0VarK = sv0Var2;
                                                } else {
                                                    if (iy0Var == null) {
                                                        iy0Var = new iy0(new sv0[16]);
                                                    }
                                                    if (sv0VarK != null) {
                                                        iy0Var.b(sv0VarK);
                                                        sv0VarK = null;
                                                    }
                                                    iy0Var.b(sv0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    sv0VarK = bl.k(iy0Var);
                                }
                            }
                            sv0Var = sv0Var.i;
                        }
                    }
                    ql0VarP = ql0VarP.u();
                    sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
                }
                w80 w80Var2 = (w80) sv0VarK;
                if (w80Var2 == null) {
                    return juVar;
                }
                int iOrdinal2 = w80Var2.Q0().ordinal();
                if (iOrdinal2 == 0) {
                    return V(w80Var2);
                }
                if (iOrdinal2 == 1) {
                    return W(w80Var2);
                }
                if (iOrdinal2 == 2) {
                    return ju.f;
                }
                if (iOrdinal2 != 3) {
                    ez1.a();
                    return null;
                }
                ju juVarW = W(w80Var2);
                ju juVar2 = juVarW != juVar ? juVarW : null;
                return juVar2 == null ? V(w80Var2) : juVar2;
            }
        }
        return juVar;
    }

    public static final boolean X(w80 w80Var, boolean z) {
        int iOrdinal = w80Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                w80 w80VarW = hk.w(w80Var);
                if (!(w80VarW != null ? X(w80VarW, z) : true)) {
                    return false;
                }
                w80Var.M0(v80.f, v80.g);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                ez1.a();
                return false;
            }
        }
        return true;
    }

    public static final void Y(m1 m1Var, rl1 rl1Var) {
        Object objG = rl1Var.k().e.g(vl1.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            yc.d();
            return;
        }
        rl1 rl1VarL = rl1Var.l();
        if (rl1VarL == null) {
            return;
        }
        Object objG2 = rl1VarL.k().e.g(vl1.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = rl1VarL.k().e.g(vl1.f);
            ol olVar = (ol) (objG3 != null ? objG3 : null);
            if (olVar == null || (olVar.a >= 0 && olVar.b >= 0)) {
                if (rl1Var.k().e.c(vl1.J)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = rl1.j(4, rl1VarL);
                    int size = listJ.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        rl1 rl1Var2 = (rl1) listJ.get(i2);
                        if (rl1Var2.k().e.c(vl1.J)) {
                            arrayList.add(rl1Var2);
                            if (rl1Var2.c.v() < rl1Var.c.v()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM = m(arrayList);
                    int i3 = zM ? 0 : i;
                    int i4 = zM ? i : 0;
                    Object objG4 = rl1Var.k().e.g(vl1.J);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    m1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static final ExtractedText Z(az1 az1Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = az1Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = az1Var.b;
        extractedText.selectionStart = wz1.f(j);
        extractedText.selectionEnd = wz1.e(j);
        extractedText.flags = !ct1.L(az1Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static ln a() {
        ln lnVar = new ln(true);
        lnVar.S(null);
        return lnVar;
    }

    public static final c5 b(String str) {
        Set setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        return new c5(setSingleton);
    }

    public static final long c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void d(ha0 ha0Var, tv0 tv0Var, bn0 bn0Var, on0 on0Var, ob0 ob0Var, int i) {
        on0 on0Var2;
        bn0 bn0Var2;
        tv0 tv0Var2;
        ob0Var.X(1055276397);
        int i2 = (ob0Var.h(ha0Var) ? 4 : 2) | i | (ob0Var.f(tv0Var) ? 32 : 16) | (ob0Var.f(bn0Var) ? 256 : 128) | (ob0Var.f(on0Var) ? 2048 : 1024);
        if (ob0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            on0Var2 = on0Var;
            um0 um0Var = new um0(bn0Var, tv0Var, on0Var2, xc.D(ha0Var, ob0Var), 0);
            bn0Var2 = bn0Var;
            tv0Var2 = tv0Var;
            xk.c(lk.d0(-933153643, um0Var, ob0Var), ob0Var, 6);
        } else {
            on0Var2 = on0Var;
            bn0Var2 = bn0Var;
            tv0Var2 = tv0Var;
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new jf(ha0Var, tv0Var2, bn0Var2, on0Var2, i);
        }
    }

    public static final void e(long j, d02 d02Var, wa0 wa0Var, ob0 ob0Var, int i) {
        ob0Var.X(-684938728);
        int i2 = (ob0Var.e(j) ? 4 : 2) | i | (ob0Var.f(d02Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(wa0Var) ? 256 : 128;
        }
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            bq bqVar = mz1.a;
            lk.j(new pb1[]{rr.a.a(new vl(j)), bqVar.a(((d02) ob0Var.j(bqVar)).d(d02Var))}, wa0Var, ob0Var, ((i2 >> 3) & 112) | 8);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ob1(j, d02Var, wa0Var, i, 0);
        }
    }

    public static final void f(long j, d02 d02Var, pb1[] pb1VarArr, wa0 wa0Var, ob0 ob0Var, int i) {
        ob0Var.X(-1730739611);
        int i2 = ((i & 6) == 0 ? (ob0Var.e(j) ? 4 : 2) | i : i) | (ob0Var.f(d02Var) ? 32 : 16) | (ob0Var.h(wa0Var) ? 2048 : 1024);
        ob0Var.U(-1088419735, Integer.valueOf(pb1VarArr.length));
        int i3 = i2 | (ob0Var.d(pb1VarArr.length) ? 256 : 0);
        for (pb1 pb1Var : pb1VarArr) {
            i3 |= ob0Var.h(pb1Var) ? 256 : 0;
        }
        ob0Var.p(false);
        if ((i3 & 896) == 0) {
            i3 |= 128;
        }
        if (ob0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            bq bqVar = mz1.a;
            d02 d02VarD = ((d02) ob0Var.j(bqVar)).d(d02Var);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(rr.a.a(new vl(j)));
            arrayList.add(bqVar.a(d02VarD));
            if (pb1VarArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + pb1VarArr.length);
                Collections.addAll(arrayList, pb1VarArr);
            }
            lk.j((pb1[]) arrayList.toArray(new pb1[arrayList.size()]), wa0Var, ob0Var, ((i3 >> 6) & 112) | 8);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new te0(j, d02Var, pb1VarArr, wa0Var, i);
        }
    }

    public static final int g(jo0 jo0Var, long j, j62 j62Var) {
        long jT;
        int iE;
        qz1 qz1VarD = jo0Var.d();
        if (qz1VarD != null) {
            vw0 vw0Var = qz1VarD.a.b;
            zk0 zk0VarC = jo0Var.c();
            if (zk0VarC != null && (iE = E(vw0Var, (jT = zk0VarC.t(j)), j62Var)) != -1) {
                return vw0Var.g(w01.a(jT, (vw0Var.b(iE) + vw0Var.f(iE)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long h(jo0 jo0Var, pc1 pc1Var, pc1 pc1Var2, int i) {
        long jH = H(jo0Var, pc1Var, i);
        if (wz1.c(jH)) {
            return wz1.b;
        }
        long jH2 = H(jo0Var, pc1Var2, i);
        if (wz1.c(jH2)) {
            return wz1.b;
        }
        int i2 = (int) (jH >> 32);
        int i3 = (int) (jH2 & 4294967295L);
        return af1.g(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean i(pz1 pz1Var, int i) {
        vw0 vw0Var = pz1Var.b;
        int iD = vw0Var.d(i);
        return i == pz1Var.f(iD) || i == vw0Var.c(iD, false) ? pz1Var.g(i) != pz1Var.a(i) : pz1Var.a(i) != pz1Var.a(i - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(File file, sa0 sa0Var, ls lsVar) throws IOException {
        f60 f60Var;
        if (lsVar instanceof f60) {
            f60Var = (f60) lsVar;
            int i = f60Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                f60Var.j = i - Integer.MIN_VALUE;
            } else {
                f60Var = new f60(lsVar);
            }
        }
        Object obj = f60Var.i;
        int i2 = f60Var.j;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = f60Var.h;
                xc.G(obj);
                return obj;
            }
            xc.G(obj);
            f60Var.h = file;
            f60Var.j = 1;
            Object objI = sa0Var.i(f60Var);
            Object obj2 = wt.e;
            return objI == obj2 ? obj2 : objI;
        } catch (IOException e) {
            if (e instanceof au) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw el.m(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw el.m(file, e);
                    }
                    throw el.m(file, e);
                }
                if (file.canWrite()) {
                    throw el.m(file, e);
                }
                throw el.m(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw el.m(file, e);
                }
                throw el.m(file, e);
            }
            if (file.canWrite()) {
                throw el.m(file, e);
            }
            throw el.m(file, e);
        }
    }

    public static final long k(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final jb0 l(jb0 jb0Var) {
        if (jb0Var == null) {
            jb0Var = null;
        }
        if (jb0Var != null) {
            return jb0Var;
        }
        mp.b("Inconsistent composition");
        yc.j();
        return null;
    }

    public static final boolean m(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = f40.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    rl1 rl1Var = (rl1) obj2;
                    rl1 rl1Var2 = (rl1) obj;
                    arrayList2.add(new w01((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (rl1Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (rl1Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (rl1Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (rl1Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((w01) pl.c0(list)).a;
            } else {
                if (list.isEmpty()) {
                    vq0.c("Empty collection can't be reduced.");
                }
                Object objC0 = pl.c0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objC0 = new w01(w01.e(((w01) objC0).a, ((w01) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((w01) objC0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void o(int i) {
        if (i >= 1) {
            return;
        }
        yc.e(s91.i("Expected positive parallelism level, but got ", i));
    }

    public static final void p(long j, k31 k31Var) {
        if (k31Var == k31.e) {
            if (kr.g(j) != Integer.MAX_VALUE) {
                return;
            }
            qg0.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (kr.h(j) != Integer.MAX_VALUE) {
                return;
            }
            qg0.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static tv0 q(tv0 tv0Var, xa0 xa0Var) {
        return tv0Var.c(new jp(xa0Var));
    }

    public static final boolean r(pc1 pc1Var, float f, float f2) {
        float f3 = pc1Var.a;
        if (f > pc1Var.c || f3 > f) {
            return false;
        }
        return f2 <= pc1Var.d && pc1Var.b <= f2;
    }

    public static bk s(uc1 uc1Var, int i) {
        if (i == 0) {
            return new l31(uc1Var);
        }
        if (i == 1) {
            return new l31(uc1Var);
        }
        yc.p("invalid orientation");
        return null;
    }

    public static final void t(lt ltVar) {
        oj0 oj0Var = (oj0) ltVar.l(v20.O);
        if (oj0Var != null && !oj0Var.b()) {
            throw oj0Var.p();
        }
    }

    public static final int u(int i, List list) {
        int i2;
        int i3 = ((l41) pl.i0(list)).c;
        if (i > ((l41) pl.i0(list)).c) {
            og0.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            l41 l41Var = (l41) list.get(i2);
            byte b2 = l41Var.b > i ? (byte) 1 : l41Var.c <= i ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strA = vq0.a(list, null, new mt(18), 31);
        StringBuilder sbN = s91.n("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
        sbN.append(i);
        sbN.append(", paragraphs=[");
        sbN.append(strA);
        sbN.append("]");
        og0.a(sbN.toString());
        return i2;
    }

    public static final int v(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            l41 l41Var = (l41) list.get(i3);
            byte b2 = l41Var.d > i ? (byte) 1 : l41Var.e <= i ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int w(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((l41) pl.i0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            l41 l41Var = (l41) arrayList.get(i2);
            byte b2 = l41Var.f > f ? (byte) 1 : l41Var.g <= f ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void x(ArrayList arrayList, long j, sa0 sa0Var) {
        int size = arrayList.size();
        for (int iU = u(wz1.f(j), arrayList); iU < size; iU++) {
            l41 l41Var = (l41) arrayList.get(iU);
            if (l41Var.b >= wz1.e(j)) {
                return;
            }
            if (l41Var.b != l41Var.c) {
                sa0Var.i(l41Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double y(double d, double d2) {
        double dC = xk.C(d, d2);
        if (dC < 0.0d) {
            dC = 100.0d;
        }
        double dMax = Math.max(0.0d, xk.m(d, d2));
        double dG = xk.G(dC, d);
        double dG2 = xk.G(dMax, d);
        if (Math.rint(d) < 60.0d) {
            return (dG >= d2 || dG >= dG2 || ((Math.abs(dG - dG2) > 0.1d ? 1 : (Math.abs(dG - dG2) == 0.1d ? 0 : -1)) < 0 && (dG > d2 ? 1 : (dG == d2 ? 0 : -1)) < 0 && (dG2 > d2 ? 1 : (dG2 == d2 ? 0 : -1)) < 0)) ? dC : dMax;
        }
        if (dG2 >= d2 || dG2 >= dG) {
        }
    }

    public static int z(Context context, int i) {
        Integer numValueOf;
        TypedValue typedValueM = el.M(context.getTheme(), i);
        if (typedValueM != null) {
            int i2 = typedValueM.resourceId;
            numValueOf = Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValueM.data);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public abstract void B(nn1 nn1Var, float f, float f2);

    public abstract void S(Throwable th);

    public abstract void T(vu vuVar);
}
