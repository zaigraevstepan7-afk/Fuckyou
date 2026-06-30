package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ob0 {
    public int A;
    public int B;
    public boolean C;
    public final nb0 D;
    public final ArrayList E;
    public boolean F;
    public ip1 G;
    public jp1 H;
    public mp1 I;
    public boolean J;
    public b61 K;
    public kj L;
    public final lp M;
    public jb0 N;
    public s60 O;
    public yn1 P;
    public final rp Q;
    public final lt R;
    public boolean S;
    public long T;
    public pb0 U;
    public final k32 a;
    public final op b;
    public final jp1 c;
    public final cy0 d;
    public final kj e;
    public final kj f;
    public final qt0 g;
    public final tp h;
    public rb0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public fx0 p;
    public boolean q;
    public boolean r;
    public hx0 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final wh0 n = new wh0();
    public final ArrayList s = new ArrayList();
    public final wh0 t = new wh0();
    public b61 u = b61.h;
    public final wh0 x = new wh0();
    public int z = -1;

    public ob0(k32 k32Var, op opVar, jp1 jp1Var, cy0 cy0Var, kj kjVar, kj kjVar2, qt0 qt0Var, tp tpVar) {
        this.a = k32Var;
        this.b = opVar;
        this.c = jp1Var;
        this.d = cy0Var;
        this.e = kjVar;
        this.f = kjVar2;
        this.g = qt0Var;
        this.h = tpVar;
        this.C = opVar.f() || opVar.d();
        this.D = new nb0(0, this);
        this.E = new ArrayList();
        ip1 ip1VarC = jp1Var.c();
        ip1VarC.c();
        this.G = ip1VarC;
        jp1 jp1Var2 = new jp1();
        if (opVar.f()) {
            jp1Var2.b();
        }
        if (opVar.d()) {
            jp1Var2.o = new hx0();
        }
        this.H = jp1Var2;
        mp1 mp1VarE = jp1Var2.e();
        mp1VarE.e(true);
        this.I = mp1VarE;
        this.M = new lp(this, kjVar);
        ip1 ip1VarC2 = this.H.c();
        try {
            jb0 jb0VarA = ip1VarC2.a(0);
            ip1VarC2.c();
            this.N = jb0VarA;
            this.O = new s60();
            this.Q = new rp(this);
            lt ltVarJ = opVar.j();
            lt ltVarY = y();
            this.R = ltVarJ.j(ltVarY == null ? d40.e : ltVarY);
        } catch (Throwable th) {
            ip1VarC2.c();
            throw th;
        }
    }

    public static final int M(ob0 ob0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        ip1 ip1Var;
        ip1 ip1Var2 = ob0Var.G;
        int i7 = 0;
        if (ip1Var2.j(i)) {
            int i8 = ip1Var2.i(i);
            Object objP = ip1Var2.p(ip1Var2.b, i);
            if (i8 == 206 && xi0.o(objP, mp.e)) {
                Object objH = ip1Var2.h(i, 0);
                sb0 sb0Var = objH instanceof sb0 ? (sb0) objH : null;
                id1 id1Var = sb0Var != null ? sb0Var.a : null;
                lb0 lb0Var = id1Var instanceof lb0 ? (lb0) id1Var : null;
                if (lb0Var != null) {
                    ay0 ay0Var = lb0Var.e.e;
                    Object[] objArr = ay0Var.b;
                    long[] jArr3 = ay0Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr3[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        ob0 ob0Var2 = (ob0) objArr[(i9 << 3) + i12];
                                        jp1 jp1Var = ob0Var2.c;
                                        if (jp1Var.f <= 0 || (jp1Var.e[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i10;
                                        } else {
                                            tp tpVar = ob0Var2.h;
                                            synchronized (tpVar.h) {
                                                tpVar.p();
                                                i6 = i10;
                                                zx0 zx0Var = tpVar.r;
                                                tpVar.r = qc1.g();
                                                try {
                                                    tpVar.z.c0(zx0Var);
                                                } finally {
                                                }
                                            }
                                            kj kjVar = new kj();
                                            ob0Var2.L = kjVar;
                                            ip1 ip1VarC = ob0Var2.c.c();
                                            try {
                                                ob0Var2.G = ip1VarC;
                                                lp lpVar = ob0Var2.M;
                                                kj kjVar2 = lpVar.b;
                                                try {
                                                    lpVar.b = kjVar;
                                                    ob0Var2.L(0);
                                                    lp lpVar2 = ob0Var2.M;
                                                    lpVar2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (lpVar2.c) {
                                                            ip1Var = ip1VarC;
                                                            try {
                                                                lpVar2.b.b.b0(w21.c);
                                                                if (lpVar2.c) {
                                                                    lpVar2.d(false);
                                                                    lpVar2.d(false);
                                                                    lpVar2.b.b.b0(g21.c);
                                                                    i5 = 0;
                                                                    lpVar2.c = false;
                                                                }
                                                                lpVar.b = kjVar2;
                                                                ip1Var.c();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                lpVar.b = kjVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            ip1Var = ip1VarC;
                                                        }
                                                        lpVar.b = kjVar2;
                                                        ip1Var.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        ip1Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    ip1Var = ip1VarC;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                ip1Var = ip1VarC;
                                            }
                                        }
                                        ob0Var.b.r(ob0Var2.h);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i10;
                                    }
                                    j >>= i6;
                                    i12++;
                                    i10 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return ip1Var2.o(i);
            }
            i3 = 1;
            if (!ip1Var2.l(i)) {
                return ip1Var2.o(i);
            }
        } else {
            i3 = 1;
            if (ip1Var2.d(i)) {
                int i13 = ip1Var2.b[(i * 5) + 3] + i;
                int iM = 0;
                for (int i14 = i + 1; i14 < i13; i14 += ip1Var2.b[(i14 * 5) + 3]) {
                    boolean zL = ip1Var2.l(i14);
                    if (zL) {
                        ob0Var.M.c();
                        lp lpVar3 = ob0Var.M;
                        Object objN = ip1Var2.n(i14);
                        lpVar3.c();
                        lpVar3.h.add(objN);
                    }
                    iM += M(ob0Var, i14, zL || z, zL ? 0 : i2 + iM);
                    if (zL) {
                        ob0Var.M.c();
                        ob0Var.M.a();
                    }
                }
                if (!ip1Var2.l(i)) {
                    return iM;
                }
            } else if (!ip1Var2.l(i)) {
                return ip1Var2.o(i);
            }
        }
        return i3;
    }

    public final void A(ArrayList arrayList) {
        ob0 ob0Var = this;
        kj kjVar = ob0Var.f;
        lp lpVar = ob0Var.M;
        kj kjVar2 = lpVar.b;
        try {
            lpVar.b = kjVar;
            kjVar.b.b0(u21.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                j41 j41Var = (j41) arrayList.get(i);
                sw0 sw0Var = (sw0) j41Var.e;
                sw0Var.getClass();
                jb0 jb0VarL = bk.l(null);
                jp1 jp1VarD = lp1.d(null);
                int iA = jp1VarD.a(jb0VarL);
                th0 th0Var = new th0();
                lpVar.b();
                f31 f31Var = lpVar.b.b;
                f31Var.b0(d21.c);
                al.P(f31Var, 0, th0Var, 1, jb0VarL);
                if (jp1VarD == ob0Var.H) {
                    if (!ob0Var.I.w) {
                        mp.a("Check failed");
                    }
                    ob0Var.u();
                }
                ip1 ip1VarC = jp1VarD.c();
                try {
                    ip1VarC.r(iA);
                    lpVar.f = iA;
                    kj kjVar3 = new kj();
                    ob0Var.F(null, null, null, f40.e, new ke(ob0Var, kjVar3, ip1VarC, sw0Var));
                    kj kjVar4 = lpVar.b;
                    kjVar4.getClass();
                    if (!kjVar3.b.a0()) {
                        f31 f31Var2 = kjVar4.b;
                        f31Var2.b0(z11.c);
                        al.P(f31Var2, 0, kjVar3, 1, th0Var);
                    }
                    ip1VarC.c();
                    lpVar.b.b.b0(w21.c);
                    i++;
                    ob0Var = this;
                } catch (Throwable th) {
                    ip1VarC.c();
                    throw th;
                }
            }
            lpVar.b();
            lpVar.b.b.b0(h21.c);
            lpVar.f = 0;
            lpVar.b = kjVar2;
        } catch (Throwable th2) {
            lpVar.b = kjVar2;
            throw th2;
        }
    }

    public final void B(b61 b61Var, Object obj) {
        U(126665345, null);
        C();
        g0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                mp1.z(this.I);
            }
            boolean z = (this.S || xi0.o(this.G.f(), b61Var)) ? false : true;
            if (z) {
                I(b61Var);
            }
            R(202, 0, mp.c, b61Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            bl.F(this, new jo(-59194059, true, new ud(8, obj)));
            this.w = z2;
        } finally {
        }
    }

    public final Object C() {
        boolean z = this.S;
        l91 l91Var = kp.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof te1)) {
                return objM;
            }
        } else if (this.r) {
            mp.a("A call to createNode(), emitNode() or useNode() expected");
            return l91Var;
        }
        return l91Var;
    }

    public final List D() {
        op opVar = this.b;
        np npVarH = opVar.h();
        tp tpVar = npVarH != null ? (tp) npVarH : null;
        if (tpVar != null) {
            jp1 jp1Var = tpVar.j;
            ip1 ip1VarC = lp1.d(jp1Var).c();
            try {
                Integer numX = al.x(ip1VarC, opVar, 0, ip1VarC.c);
                if (numX != null) {
                    ip1VarC = lp1.d(jp1Var).c();
                    try {
                        ArrayList arrayListU = al.U(ip1VarC, numX.intValue(), 0);
                        ip1VarC.c();
                        return pl.l0(arrayListU, tpVar.z.D());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return f40.e;
    }

    public final int E(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(tp tpVar, tp tpVar2, Integer num, List list, ha0 ha0Var) {
        Object objA;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                j41 j41Var = (j41) list.get(i2);
                dc1 dc1Var = (dc1) j41Var.e;
                Object obj = j41Var.f;
                if (obj != null) {
                    b0(dc1Var, obj);
                } else {
                    b0(dc1Var, null);
                }
            }
            if (tpVar == null) {
                objA = ha0Var.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (tpVar2 == null || tpVar2 == tpVar || iIntValue < 0) {
                    objA = ha0Var.a();
                } else {
                    tpVar.v = tpVar2;
                    tpVar.w = iIntValue;
                    try {
                        objA = ha0Var.a();
                        tpVar.v = null;
                        tpVar.w = 0;
                    } catch (Throwable th) {
                        tpVar.v = null;
                        tpVar.w = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                }
            }
            this.F = z;
            this.k = i;
            return objA;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        hj0 hj0Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        ox0 ox0Var;
        long j2;
        int iR;
        int i8;
        int iHashCode;
        Object objB;
        l91 l91Var = l91.p;
        boolean z2 = this.F;
        this.F = true;
        ip1 ip1Var = this.G;
        int i9 = ip1Var.i;
        int i10 = (i9 * 5) + 3;
        int i11 = ip1Var.b[i10] + i9;
        int i12 = this.k;
        long j3 = this.T;
        int i13 = this.l;
        int i14 = this.m;
        int i15 = ip1Var.g;
        ArrayList arrayList = this.s;
        int iR2 = s22.r(i15, arrayList);
        if (iR2 < 0) {
            iR2 = -(iR2 + 1);
        }
        if (iR2 < arrayList.size()) {
            hj0Var = (hj0) arrayList.get(iR2);
            if (hj0Var.b >= i11) {
                hj0Var = null;
            }
        }
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (hj0Var != null) {
            dc1 dc1Var = hj0Var.a;
            int i19 = hj0Var.b;
            l91 l91Var2 = l91Var;
            int iR3 = s22.r(i19, arrayList);
            if (iR3 >= 0) {
            }
            Object obj = hj0Var.c;
            if (obj == null) {
                dc1Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                zx0 zx0Var = dc1Var.g;
                if (zx0Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof qx) {
                        qx qxVar = (qx) obj;
                        hq1 hq1Var = qxVar.g;
                        if (hq1Var == null) {
                            hq1Var = l91Var2;
                        }
                        i2 = i12;
                        i6 = !hq1Var.c(qxVar.h().f, zx0Var.g(qxVar)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof ay0) {
                            ay0 ay0Var = (ay0) obj;
                            if (ay0Var.h()) {
                                Object[] objArr = ay0Var.b;
                                long[] jArr = ay0Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof qx)) {
                                                        break;
                                                    }
                                                    qx qxVar2 = (qx) obj2;
                                                    hq1 hq1Var2 = qxVar2.g;
                                                    if (hq1Var2 == null) {
                                                        hq1Var2 = l91Var2;
                                                    }
                                                    if (!hq1Var2.c(qxVar2.h().f, zx0Var.g(qxVar2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                            if (i21 == length) {
                                                break;
                                            }
                                            i21++;
                                            i11 = i3;
                                            objArr = objArr2;
                                            i20 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i11;
                                    i4 = i13;
                                    i5 = i14;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.G.r(i19);
                        int i24 = this.G.g;
                        J(i17, i24, i9);
                        int iQ = this.G.q(i24);
                        while (iQ != i9 && !this.G.l(iQ)) {
                            iQ = this.G.q(iQ);
                        }
                        int iH0 = this.G.l(iQ) ? 0 : i2;
                        if (iQ != i24) {
                            int iH02 = (h0(iQ) - this.G.o(i24)) + iH0;
                            while (iH0 < iH02 && iQ != i19) {
                                iQ++;
                                while (iQ < i19) {
                                    ip1 ip1Var2 = this.G;
                                    int i25 = ip1Var2.b[(iQ * 5) + 3] + iQ;
                                    if (i19 >= i25) {
                                        iH0 += ip1Var2.l(iQ) ? i16 : h0(iQ);
                                        iQ = i25;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = iH0;
                        this.m = E(i24);
                        int iQ2 = this.G.q(i24);
                        long jRotateLeft = 0;
                        int i26 = 3;
                        int i27 = 0;
                        while (true) {
                            if (iQ2 < 0) {
                                break;
                            }
                            if (iQ2 == i9) {
                                jRotateLeft ^= Long.rotateLeft(j3, i27);
                                break;
                            }
                            ip1 ip1Var3 = this.G;
                            boolean zK = ip1Var3.k(iQ2);
                            int[] iArr = ip1Var3.b;
                            if (zK) {
                                Object objP = ip1Var3.p(iArr, iQ2);
                                if (objP != null) {
                                    iHashCode = objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    iHashCode = 0;
                                }
                            } else {
                                int i28 = ip1Var3.i(iQ2);
                                i8 = i24;
                                iHashCode = (i28 != 207 || (objB = ip1Var3.b(iArr, iQ2)) == null || objB.equals(kp.a)) ? i28 : objB.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i27);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i26)) ^ Long.rotateLeft(this.G.k(iQ2) ? 0 : E(iQ2), i27);
                            i26 = (i26 + 6) % 64;
                            i27 = (i27 + 6) % 64;
                            iQ2 = this.G.q(iQ2);
                            i24 = i8;
                        }
                        this.T = jRotateLeft;
                        this.K = null;
                        wa0 wa0Var = dc1Var.d;
                        if (wa0Var == null) {
                            yc.l("Invalid restart scope");
                            return;
                        }
                        wa0Var.h(this, Integer.valueOf(i16));
                        this.K = null;
                        ip1 ip1Var4 = this.G;
                        int i29 = ip1Var4.b[i] + i9;
                        int i30 = ip1Var4.g;
                        if (i30 < i9 || i30 > i29) {
                            mp.a("Index " + i9 + " is not a parent of " + i30);
                        }
                        ip1Var4.i = i9;
                        ip1Var4.h = i29;
                        ip1Var4.l = 0;
                        ip1Var4.m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(dc1Var);
                        this.g.l();
                        tp tpVar = dc1Var.a;
                        if (tpVar == null || (ox0Var = dc1Var.f) == null) {
                            z = z2;
                        } else {
                            dc1Var.d(i16);
                            try {
                                Object[] objArr3 = ox0Var.b;
                                int[] iArr2 = ox0Var.c;
                                long[] jArr2 = ox0Var.a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j5 = jArr2[i31];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j5 & 255) < 128) {
                                                    int i34 = (i31 << 3) + i33;
                                                    j2 = j5;
                                                    Object obj3 = objArr4[i34];
                                                    int i35 = iArr2[i34];
                                                    tpVar.z(obj3);
                                                } else {
                                                    j2 = j5;
                                                }
                                                i33++;
                                                j5 = j2 >> 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                        }
                                        if (i31 == length2) {
                                            break;
                                        }
                                        i31++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                dc1Var.d(false);
                            } catch (Throwable th) {
                                dc1Var.d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    iR = s22.r(this.G.g, arrayList);
                    if (iR < 0) {
                        iR = -(iR + 1);
                    }
                    if (iR >= arrayList.size()) {
                        hj0 hj0Var2 = (hj0) arrayList.get(iR);
                        i11 = i3;
                        hj0Var = hj0Var2.b < i11 ? hj0Var2 : null;
                        z2 = z;
                        l91Var = l91Var2;
                        i10 = i;
                        i12 = i2;
                        i13 = i4;
                        i14 = i5;
                    } else {
                        i11 = i3;
                    }
                    z2 = z;
                    l91Var = l91Var2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            iR = s22.r(this.G.g, arrayList);
            if (iR < 0) {
            }
            if (iR >= arrayList.size()) {
            }
            z2 = z;
            l91Var = l91Var2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i36 = i12;
        int i37 = i13;
        int i38 = i14;
        if (i18 != 0) {
            J(i17, i9, i9);
            this.G.t();
            int iH03 = h0(i9);
            this.k = i36 + iH03;
            this.l = i37 + iH03;
            this.m = i38;
        } else {
            P();
        }
        this.T = j3;
        this.F = z3;
    }

    public final void H() throws Throwable {
        int i;
        L(this.G.g);
        lp lpVar = this.M;
        lpVar.d(false);
        wh0 wh0Var = lpVar.d;
        ob0 ob0Var = lpVar.a;
        ip1 ip1Var = ob0Var.G;
        if (ip1Var.c > 0 && wh0Var.a(-2) != (i = ip1Var.i)) {
            if (!lpVar.c && lpVar.e) {
                lpVar.d(false);
                lpVar.b.b.b0(k21.c);
                lpVar.c = true;
            }
            if (i > 0) {
                jb0 jb0VarA = ip1Var.a(i);
                wh0Var.c(i);
                lpVar.d(false);
                f31 f31Var = lpVar.b.b;
                f31Var.b0(j21.c);
                al.O(f31Var, 0, jb0VarA);
                lpVar.c = true;
            }
        }
        lpVar.b.b.b0(s21.c);
        int i2 = lpVar.f;
        ip1 ip1Var2 = ob0Var.G;
        lpVar.f = ip1Var2.b[(ip1Var2.g * 5) + 3] + i2;
    }

    public final void I(b61 b61Var) {
        hx0 hx0Var = this.v;
        if (hx0Var == null) {
            hx0Var = new hx0();
            this.v = hx0Var;
        }
        hx0Var.i(this.G.g, b61Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i, int i2, int i3) {
        ip1 ip1Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (ip1Var.q(i) == i2) {
                    i3 = i2;
                } else if (ip1Var.q(i2) == i) {
                    i3 = i;
                } else if (ip1Var.q(i) == ip1Var.q(i2)) {
                    i3 = ip1Var.q(i);
                } else {
                    int iQ = i;
                    int i4 = 0;
                    while (iQ > 0 && iQ != i3) {
                        iQ = ip1Var.q(iQ);
                        i4++;
                    }
                    int iQ2 = i2;
                    int i5 = 0;
                    while (iQ2 > 0 && iQ2 != i3) {
                        iQ2 = ip1Var.q(iQ2);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iQ3 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iQ3 = ip1Var.q(iQ3);
                    }
                    int i8 = i5 - i4;
                    int iQ4 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iQ4 = ip1Var.q(iQ4);
                    }
                    i3 = iQ3;
                    for (int iQ5 = iQ4; i3 != iQ5; iQ5 = ip1Var.q(iQ5)) {
                        i3 = ip1Var.q(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (ip1Var.l(i)) {
                this.M.a();
            }
            i = ip1Var.q(i);
        }
        o(i2, i3);
    }

    public final Object K() {
        boolean z = this.S;
        l91 l91Var = kp.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof te1)) {
                return objM instanceof sb0 ? ((sb0) objM).a : objM;
            }
        } else if (this.r) {
            mp.a("A call to createNode(), emitNode() or useNode() expected");
            return l91Var;
        }
        return l91Var;
    }

    public final void L(int i) throws Throwable {
        boolean zL = this.G.l(i);
        lp lpVar = this.M;
        if (zL) {
            lpVar.c();
            Object objN = this.G.n(i);
            lpVar.c();
            lpVar.h.add(objN);
        }
        M(this, i, zL, 0);
        lpVar.c();
        if (zL) {
            lpVar.a();
        }
    }

    public final boolean N(int i, boolean z) {
        dc1 dc1VarW;
        if ((i & 1) == 0 && (this.S || this.y)) {
            yn1 yn1Var = this.P;
            if (yn1Var != null && (dc1VarW = w()) != null && yn1Var.a()) {
                int i2 = dc1VarW.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                dc1VarW.b = i3;
                dc1VarW.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                f31 f31Var = this.M.b.b;
                f31Var.b0(r21.c);
                al.O(f31Var, 0, dc1VarW);
                this.b.q(dc1VarW);
                return false;
            }
        } else if (!z && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        ip1 ip1Var = this.G;
        int iG = ip1Var.g();
        int[] iArr = ip1Var.b;
        int i = ip1Var.g;
        Object objP = i < ip1Var.h ? ip1Var.p(iArr, i) : null;
        Object objF = ip1Var.f();
        int i2 = this.m;
        l91 l91Var = kp.a;
        if (objP != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        } else {
            if (objF != null && iG == 207 && !objF.equals(l91Var)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
                V(null, (iArr[(ip1Var.g * 5) + 1] & 1073741824) != 0);
                G();
                ip1Var.e();
                if (objP == null) {
                    if (objP instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                        return;
                    }
                }
                if (objF == null || iG != 207 || objF.equals(l91Var)) {
                    this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
        }
        this.T = jRotateLeft;
        V(null, (iArr[(ip1Var.g * 5) + 1] & 1073741824) != 0);
        G();
        ip1Var.e();
        if (objP == null) {
        }
    }

    public final void P() {
        ip1 ip1Var = this.G;
        int i = ip1Var.i;
        this.l = i >= 0 ? ip1Var.b[(i * 5) + 1] & 67108863 : 0;
        ip1Var.t();
    }

    public final void Q() {
        if (this.l != 0) {
            mp.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        dc1 dc1VarW = w();
        if (dc1VarW != null) {
            int i = dc1VarW.b;
            if ((i & 128) == 0) {
                dc1VarW.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        rb0 rb0Var;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.r) {
            mp.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.m;
        Object obj4 = kp.a;
        if (obj3 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode())), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i9);
                if (obj3 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    mp1 mp1Var = this.I;
                    int i10 = mp1Var.t;
                    if (z3) {
                        mp1Var.Q(i, obj4, true, obj4);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        mp1Var.Q(i, obj3, false, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        mp1Var.Q(i, obj3, false, obj4);
                    }
                    rb0 rb0Var2 = this.j;
                    if (rb0Var2 != null) {
                        int i11 = (-2) - i10;
                        hk0 hk0Var = new hk0(-1, i, i11, -1);
                        rb0Var2.e.i(i11, new yc0(-1, this.k - rb0Var2.b, 0));
                        rb0Var2.d.add(hk0Var);
                    }
                    t(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int iG = this.G.g();
                    if (!z4 && iG == i) {
                        ip1 ip1Var = this.G;
                        int i12 = ip1Var.g;
                        if (xi0.o(obj3, i12 < ip1Var.h ? ip1Var.p(ip1Var.b, i12) : null)) {
                            V(obj2, z3);
                            z = z4;
                        }
                    }
                    ip1 ip1Var2 = this.G;
                    int[] iArr = ip1Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (ip1Var2.k <= 0) {
                        int i13 = ip1Var2.g;
                        while (i13 < ip1Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objP = ip1Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new hk0(objP, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new rb0(this.k, arrayList);
                } else {
                    z = z4;
                }
                rb0 rb0Var3 = this.j;
                if (rb0Var3 != null) {
                    ArrayList arrayList2 = rb0Var3.d;
                    hx0 hx0Var = rb0Var3.e;
                    int i17 = rb0Var3.b;
                    Object wj0Var = obj3 != null ? new wj0(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                    zx0 zx0Var = ((bx0) rb0Var3.f.getValue()).a;
                    Object objG = zx0Var.g(wj0Var);
                    if (objG == null) {
                        objG = null;
                    } else if (objG instanceof sx0) {
                        sx0 sx0Var = (sx0) objG;
                        Object objK = sx0Var.k(0);
                        if (sx0Var.h()) {
                            zx0Var.k(wj0Var);
                        }
                        if (sx0Var.b == 1) {
                            zx0Var.m(wj0Var, sx0Var.e());
                        }
                        objG = objK;
                    } else {
                        zx0Var.k(wj0Var);
                    }
                    hk0 hk0Var2 = (hk0) objG;
                    if (z || hk0Var2 == null) {
                        this.G.k++;
                        this.S = true;
                        this.K = null;
                        if (this.I.w) {
                            mp1 mp1VarE = this.H.e();
                            this.I = mp1VarE;
                            mp1VarE.M();
                            this.J = false;
                            this.K = null;
                        }
                        this.I.d();
                        mp1 mp1Var2 = this.I;
                        int i18 = mp1Var2.t;
                        if (z3) {
                            mp1Var2.Q(i, obj4, true, obj4);
                            i3 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i3 = 0;
                            mp1Var2.Q(i, obj4, false, obj2);
                        } else {
                            i3 = 0;
                            mp1Var2.Q(i, obj == null ? obj4 : obj, false, obj4);
                        }
                        this.N = this.I.b(i18);
                        int i19 = (-2) - i18;
                        hk0 hk0Var3 = new hk0(-1, i, i19, -1);
                        hx0Var.i(i19, new yc0(-1, this.k - i17, i3));
                        arrayList2.add(hk0Var3);
                        rb0Var = new rb0(z3 ? i3 : this.k, new ArrayList());
                    } else {
                        int i20 = hk0Var2.c;
                        arrayList2.add(hk0Var2);
                        yc0 yc0Var = (yc0) hx0Var.b(i20);
                        this.k = (yc0Var != null ? yc0Var.b : -1) + i17;
                        yc0 yc0Var2 = (yc0) hx0Var.b(i20);
                        int i21 = yc0Var2 != null ? yc0Var2.a : -1;
                        int i22 = rb0Var3.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = hx0Var.c;
                            long[] jArr = hx0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                yc0 yc0Var3 = (yc0) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = yc0Var3.a;
                                                if (i28 == i21) {
                                                    yc0Var3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    yc0Var3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = hx0Var.c;
                                long[] jArr2 = hx0Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    yc0 yc0Var4 = (yc0) objArr4[(i29 << 3) + i31];
                                                    int i32 = yc0Var4.a;
                                                    if (i32 == i21) {
                                                        yc0Var4.a = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            yc0Var4.a = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        lp lpVar = this.M;
                        int i33 = lpVar.f;
                        ob0 ob0Var = lpVar.a;
                        lpVar.f = (i20 - ob0Var.G.g) + i33;
                        this.G.r(i20);
                        if (i4 > 0) {
                            lpVar.d(false);
                            wh0 wh0Var = lpVar.d;
                            ip1 ip1Var3 = ob0Var.G;
                            if (ip1Var3.c > 0 && wh0Var.a(-2) != (i5 = ip1Var3.i)) {
                                if (!lpVar.c && lpVar.e) {
                                    lpVar.d(false);
                                    lpVar.b.b.b0(k21.c);
                                    lpVar.c = true;
                                }
                                if (i5 > 0) {
                                    jb0 jb0VarA = ip1Var3.a(i5);
                                    wh0Var.c(i5);
                                    lpVar.d(false);
                                    f31 f31Var = lpVar.b.b;
                                    f31Var.b0(j21.c);
                                    al.O(f31Var, 0, jb0VarA);
                                    lpVar.c = true;
                                }
                            }
                            f31 f31Var2 = lpVar.b.b;
                            f31Var2.b0(o21.c);
                            f31Var2.f[f31Var2.g - f31Var2.d[f31Var2.e - 1].a] = i4;
                        }
                        V(obj2, z3);
                        rb0Var = null;
                    }
                } else {
                    rb0Var = null;
                }
                t(z3, rb0Var);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i9);
        }
        this.T = jRotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, w11 w11Var) {
        R(i, 0, w11Var, null);
    }

    public final void U(int i, Object obj) {
        R(i, 0, obj, null);
    }

    public final void V(Object obj, boolean z) {
        if (z) {
            ip1 ip1Var = this.G;
            if (ip1Var.k <= 0) {
                if ((ip1Var.b[(ip1Var.g * 5) + 1] & 1073741824) == 0) {
                    e91.a("Expected a node group");
                }
                ip1Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            lp lpVar = this.M;
            lpVar.getClass();
            lpVar.d(false);
            f31 f31Var = lpVar.b.b;
            f31Var.b0(z21.c);
            al.O(f31Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.r) {
            mp.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        ip1 ip1Var = this.G;
        boolean z = this.S;
        l91 l91Var = kp.a;
        if (z) {
            ip1Var.k++;
            this.I.Q(i, l91Var, false, l91Var);
            t(false, null);
            return;
        }
        if (ip1Var.g() == i && ((i3 = ip1Var.g) >= ip1Var.h || (ip1Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            ip1Var.u();
            t(false, null);
            return;
        }
        if (ip1Var.k <= 0 && (i2 = ip1Var.g) != ip1Var.h) {
            int i4 = this.k;
            H();
            this.M.e(i4, ip1Var.s());
            s22.f(this.s, i2, ip1Var.g);
        }
        ip1Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            mp1 mp1VarE = this.H.e();
            this.I = mp1VarE;
            mp1VarE.M();
            this.J = false;
            this.K = null;
        }
        mp1 mp1Var = this.I;
        mp1Var.d();
        int i5 = mp1Var.t;
        mp1Var.Q(i, l91Var, false, l91Var);
        this.N = mp1Var.b(i5);
        t(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ob0 X(int i) {
        dc1 dc1Var;
        boolean z;
        W(i);
        boolean z2 = this.S;
        qt0 qt0Var = this.g;
        ArrayList arrayList = this.E;
        tp tpVar = this.h;
        if (z2) {
            dc1 dc1Var2 = new dc1(tpVar);
            arrayList.add(dc1Var2);
            g0(dc1Var2);
            dc1Var2.e = this.B;
            dc1Var2.b &= -17;
            qt0Var.l();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iR = s22.r(i2, arrayList2);
        hj0 hj0Var = iR >= 0 ? (hj0) arrayList2.remove(iR) : null;
        Object objM = this.G.m();
        if (xi0.o(objM, kp.a)) {
            dc1Var = new dc1(tpVar);
            g0(dc1Var);
        } else {
            objM.getClass();
            dc1Var = (dc1) objM;
        }
        if (hj0Var == null) {
            int i3 = dc1Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                dc1Var.b = i3 & (-65);
            }
            z = z3;
        }
        int i4 = dc1Var.b;
        dc1Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(dc1Var);
        dc1Var.e = this.B;
        dc1Var.b &= -17;
        qt0Var.l();
        int i5 = dc1Var.b;
        if ((i5 & 256) != 0) {
            dc1Var.b = (i5 & (-257)) | 512;
            f31 f31Var = this.M.b.b;
            f31Var.b0(x21.c);
            al.O(f31Var, 0, dc1Var);
            if (!this.y) {
                int i6 = dc1Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    dc1Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void Y(Object obj) {
        if (!this.S && this.G.g() == 207 && !xi0.o(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        R(207, 0, null, obj);
    }

    public final void Z() {
        R(125, 2, null, null);
        this.r = true;
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        s60 s60Var = this.O;
        s60Var.e.Y();
        s60Var.d.Y();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        ip1 ip1Var = this.G;
        if (!ip1Var.f) {
            ip1Var.c();
        }
        if (this.I.w) {
            return;
        }
        u();
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
    public final void a0() {
        this.m = 0;
        this.G = this.c.c();
        R(100, 0, null, null);
        op opVar = this.b;
        opVar.t();
        b61 b61VarI = opVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(b61VarI);
        this.K = null;
        if (!this.q) {
            this.q = opVar.e();
        }
        if (!this.C) {
            this.C = opVar.f();
        }
        if (this.C) {
            ys1 ys1Var = sp.a;
            ys1Var.getClass();
            b61VarI = b61VarI.d(ys1Var, new zs1(y()));
        }
        this.u = b61VarI;
        Set set = (Set) xk.I(b61VarI, jh0.a);
        if (set != null) {
            set.add(v());
            opVar.o(set);
        }
        R(Long.hashCode(opVar.g()), 0, null, null);
    }

    public final void b(wa0 wa0Var, Object obj) {
        if (this.S) {
            f31 f31Var = this.O.d;
            f31Var.b0(a31.c);
            al.O(f31Var, 0, obj);
            wa0Var.getClass();
            s22.i(2, wa0Var);
            al.O(f31Var, 1, wa0Var);
            return;
        }
        lp lpVar = this.M;
        lpVar.b();
        f31 f31Var2 = lpVar.b.b;
        f31Var2.b0(a31.c);
        wa0Var.getClass();
        s22.i(2, wa0Var);
        al.P(f31Var2, 0, obj, 1, wa0Var);
    }

    public final boolean b0(dc1 dc1Var, Object obj) {
        jb0 jb0Var = dc1Var.c;
        if (jb0Var == null) {
            return false;
        }
        int iA = this.G.a.a(bk.l(jb0Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iR = s22.r(iA, arrayList);
        if (iR < 0) {
            int i = -(iR + 1);
            if (!(obj instanceof qx)) {
                obj = null;
            }
            arrayList.add(i, new hj0(dc1Var, iA, obj));
            return true;
        }
        hj0 hj0Var = (hj0) arrayList.get(iR);
        if (!(obj instanceof qx)) {
            hj0Var.c = null;
            return true;
        }
        Object obj2 = hj0Var.c;
        if (obj2 == null) {
            hj0Var.c = obj;
            return true;
        }
        if (obj2 instanceof ay0) {
            ((ay0) obj2).a(obj);
            return true;
        }
        ay0 ay0Var = qi1.a;
        ay0 ay0Var2 = new ay0(2);
        ay0Var2.k(obj2);
        ay0Var2.k(obj);
        hj0Var.c = ay0Var2;
        return true;
    }

    public final boolean c(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        g0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(zx0 zx0Var) {
        ArrayList arrayList = this.s;
        for (int iB = hk.B(arrayList); -1 < iB; iB--) {
            hj0 hj0Var = (hj0) arrayList.get(iB);
            jb0 jb0Var = hj0Var.a.c;
            jb0 jb0VarL = jb0Var != null ? bk.l(jb0Var) : null;
            if (jb0VarL == null || !jb0VarL.a()) {
                arrayList.remove(iB);
            } else {
                int i = hj0Var.b;
                int i2 = jb0VarL.a;
                if (i != i2) {
                    hj0Var.b = i2;
                }
            }
        }
        Object[] objArr = zx0Var.b;
        Object[] objArr2 = zx0Var.c;
        long[] jArr = zx0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            dc1 dc1Var = (dc1) obj;
                            jb0 jb0Var2 = dc1Var.c;
                            if (jb0Var2 != null) {
                                int i7 = bk.l(jb0Var2).a;
                                if (obj2 == l91.i) {
                                    obj2 = null;
                                }
                                arrayList.add(new hj0(dc1Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        tl.Z(arrayList, s22.h);
    }

    public final boolean d(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        g0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i, int i2) {
        if (h0(i) != i2) {
            if (i < 0) {
                fx0 fx0Var = this.p;
                if (fx0Var == null) {
                    fx0Var = new fx0();
                    this.p = fx0Var;
                }
                fx0Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean e(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        g0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        int iH0 = h0(i);
        if (iH0 != i2) {
            int i3 = i2 - iH0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iH02 = h0(i) + i3;
                d0(i, iH02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        rb0 rb0Var = (rb0) arrayList.get(i4);
                        if (rb0Var != null && rb0Var.a(i, iH02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                ip1 ip1Var = this.G;
                if (i < 0) {
                    i = ip1Var.i;
                } else if (ip1Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean f(Object obj) {
        if (xi0.o(C(), obj)) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final void f0(Object obj) {
        if (obj instanceof id1) {
            sb0 sb0Var = new sb0((id1) obj, this.m - 1);
            if (this.S) {
                f31 f31Var = this.M.b.b;
                f31Var.b0(q21.c);
                al.O(f31Var, 0, sb0Var);
            }
            this.d.add(obj);
            obj = sb0Var;
        }
        g0(obj);
    }

    public final boolean g(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        g0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (this.S) {
            mp1 mp1Var = this.I;
            if (mp1Var.n <= 0 || mp1Var.i == mp1Var.k) {
                mp1Var.F(obj);
                return;
            }
            hx0 hx0Var = mp1Var.s;
            if (hx0Var == null) {
                hx0Var = new hx0();
            }
            mp1Var.s = hx0Var;
            int i = mp1Var.v;
            Object objB = hx0Var.b(i);
            if (objB == null) {
                objB = new sx0();
                hx0Var.i(i, objB);
            }
            ((sx0) objB).a(obj);
            return;
        }
        ip1 ip1Var = this.G;
        boolean z = ip1Var.n;
        lp lpVar = this.M;
        if (!z) {
            jb0 jb0VarA = ip1Var.a(ip1Var.i);
            f31 f31Var = lpVar.b.b;
            f31Var.b0(y11.c);
            al.P(f31Var, 0, jb0VarA, 1, obj);
            return;
        }
        int iB = (ip1Var.l - lp1.b(ip1Var.b, ip1Var.i)) - 1;
        if (lpVar.a.G.i - lpVar.f >= 0) {
            lpVar.d(true);
            f31 f31Var2 = lpVar.b.b;
            f31Var2.b0(l21.g);
            al.O(f31Var2, 0, obj);
            f31Var2.f[f31Var2.g - f31Var2.d[f31Var2.e - 1].a] = iB;
            return;
        }
        ip1 ip1Var2 = this.G;
        jb0 jb0VarA2 = ip1Var2.a(ip1Var2.i);
        f31 f31Var3 = lpVar.b.b;
        f31Var3.b0(l21.f);
        al.P(f31Var3, 0, obj, 1, jb0VarA2);
        f31Var3.f[f31Var3.g - f31Var3.d[f31Var3.e - 1].a] = iB;
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final int h0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        fx0 fx0Var = this.p;
        if (fx0Var != null && fx0Var.c(i) >= 0) {
            int iC = fx0Var.c(i);
            if (iC >= 0) {
                return fx0Var.c[iC];
            }
            yc.h(s91.i("Cannot find value for key ", i));
        }
        return 0;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        lp lpVar = this.M;
        lpVar.c = false;
        lpVar.d.b = 0;
        lpVar.f = 0;
        lpVar.e = true;
        lpVar.g = 0;
        lpVar.h.clear();
        lpVar.i = -1;
        lpVar.j = -1;
        lpVar.k = -1;
        lpVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0() {
        if (!this.r) {
            mp.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            mp.a("useNode() called while inserting");
        }
        ip1 ip1Var = this.G;
        Object objN = ip1Var.n(ip1Var.i);
        lp lpVar = this.M;
        lpVar.c();
        lpVar.h.add(objN);
        if (this.y && (objN instanceof to)) {
            lpVar.b();
            lpVar.b.b.b0(c31.c);
        }
    }

    public final Object j(nb1 nb1Var) {
        return xk.I(l(), nb1Var);
    }

    public final void k(ha0 ha0Var) {
        if (!this.r) {
            mp.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            mp.a("createNode() can only be called when inserting");
        }
        wh0 wh0Var = this.n;
        int i = wh0Var.a[wh0Var.b - 1];
        mp1 mp1Var = this.I;
        jb0 jb0VarB = mp1Var.b(mp1Var.v);
        this.l++;
        s60 s60Var = this.O;
        f31 f31Var = s60Var.d;
        f31Var.b0(l21.d);
        al.O(f31Var, 0, ha0Var);
        f31Var.f[f31Var.g - f31Var.d[f31Var.e - 1].a] = i;
        al.O(f31Var, 1, jb0VarB);
        f31 f31Var2 = s60Var.e;
        f31Var2.b0(l21.e);
        f31Var2.f[f31Var2.g - f31Var2.d[f31Var2.e - 1].a] = i;
        al.O(f31Var2, 0, jb0VarB);
    }

    public final b61 l() {
        b61 b61Var;
        b61 b61Var2 = this.K;
        if (b61Var2 != null) {
            return b61Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        w11 w11Var = mp.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && xi0.o(this.I.t(iE), w11Var)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    b61 b61Var3 = (b61) objQ;
                    this.K = b61Var3;
                    return b61Var3;
                }
                mp1 mp1Var = this.I;
                iE = mp1Var.E(mp1Var.b, iE);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    ip1 ip1Var = this.G;
                    if (xi0.o(ip1Var.p(ip1Var.b, iQ), w11Var)) {
                        hx0 hx0Var = this.v;
                        if (hx0Var == null || (b61Var = (b61) hx0Var.b(iQ)) == null) {
                            ip1 ip1Var2 = this.G;
                            Object objB = ip1Var2.b(ip1Var2.b, iQ);
                            objB.getClass();
                            b61Var = (b61) objB;
                        }
                        this.K = b61Var;
                        return b61Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        b61 b61Var4 = this.u;
        this.K = b61Var4;
        return b61Var4;
    }

    public final ap m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        aq0 aq0VarN = hk.n();
        mp1 mp1Var = this.I;
        aq0VarN.addAll(al.l(mp1Var, null, mp1Var.t, null));
        ip1 ip1Var = this.G;
        boolean z = ip1Var.f;
        int[] iArr = ip1Var.b;
        if (z || ip1Var.c == 0) {
            collection = f40.e;
        } else {
            zb1 zb1Var = new zb1(ip1Var);
            int iQ = ip1Var.i;
            Object objValueOf = Integer.valueOf(ip1Var.l - lp1.b(iArr, iQ));
            while (iQ >= 0) {
                zb1Var.f(ip1Var.i(iQ), ip1Var.k(iQ) ? ip1Var.p(iArr, iQ) : kp.a, ip1Var.a.g(iQ), objValueOf);
                objValueOf = ip1Var.a(iQ);
                iQ = ip1Var.q(iQ);
            }
            collection = (ArrayList) zb1Var.a;
        }
        aq0VarN.addAll(collection);
        aq0VarN.addAll(D());
        return new ap(hk.k(aq0VarN), this.C);
    }

    public final void n(zx0 zx0Var, wa0 wa0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            mp.a("Reentrant composition is not supported");
        }
        this.g.l();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(aq1.j().g());
            this.v = null;
            c0(zx0Var);
            this.k = 0;
            this.F = true;
            try {
                a0();
                Object objC = C();
                if (objC != wa0Var && wa0Var != null) {
                    g0(wa0Var);
                }
                nb0 nb0Var = this.D;
                iy0 iy0VarR = xc.r();
                try {
                    iy0VarR.b(nb0Var);
                    w11 w11Var = mp.a;
                    if (wa0Var != null) {
                        T(200, w11Var);
                        bl.F(this, wa0Var);
                        p(false);
                    } else if (!this.w || objC == null || objC.equals(kp.a)) {
                        O();
                    } else {
                        T(200, w11Var);
                        s22.i(2, objC);
                        bl.F(this, (wa0) objC);
                        p(false);
                    }
                    iy0VarR.k(iy0VarR.g - 1);
                    s();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        mp.a("Check failed");
                    }
                    u();
                } catch (Throwable th) {
                    iy0VarR.k(iy0VarR.g - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            lp lpVar = this.M;
            lpVar.c();
            lpVar.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z) {
        long jRotateRight;
        wh0 wh0Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        wh0 wh0Var2;
        int i7;
        int i8;
        ArrayList arrayList2;
        ay0 ay0Var;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        rb0 rb0Var;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        wh0 wh0Var3 = this.n;
        int i16 = wh0Var3.a[wh0Var3.b - 2] - 1;
        boolean z2 = this.S;
        l91 l91Var = kp.a;
        if (z2) {
            mp1 mp1Var = this.I;
            int i17 = mp1Var.v;
            int iS = mp1Var.s(i17);
            Object objT = this.I.t(i17);
            Object objQ = this.I.q(i17);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(l91Var)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            ip1 ip1Var = this.G;
            int i18 = ip1Var.i;
            int i19 = ip1Var.i(i18);
            ip1 ip1Var2 = this.G;
            Object objP = ip1Var2.p(ip1Var2.b, i18);
            ip1 ip1Var3 = this.G;
            Object objB = ip1Var3.b(ip1Var3.b, i18);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i19 != 207 || objB.equals(l91Var)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) i19);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i20 = this.l;
        rb0 rb0Var2 = this.j;
        ArrayList arrayList5 = this.s;
        lp lpVar = this.M;
        if (rb0Var2 != null) {
            hx0 hx0Var = rb0Var2.e;
            int i21 = rb0Var2.b;
            ArrayList arrayList6 = rb0Var2.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = rb0Var2.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i22 = 0; i22 < size; i22++) {
                    hashSet2.add(arrayList7.get(i22));
                }
                i = -1;
                ay0 ay0Var2 = qi1.a;
                ay0 ay0Var3 = new ay0();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < size3) {
                    hk0 hk0Var = (hk0) arrayList6.get(i23);
                    if (hashSet2.contains(hk0Var)) {
                        wh0Var2 = wh0Var3;
                        i7 = i23;
                        if (!ay0Var3.c(hk0Var)) {
                            int i26 = i24;
                            if (i26 < size2) {
                                hk0 hk0Var2 = (hk0) arrayList7.get(i26);
                                if (hk0Var2 != hk0Var) {
                                    yc0 yc0Var = (yc0) hx0Var.b(hk0Var2.c);
                                    int i27 = yc0Var != null ? yc0Var.b : -1;
                                    ay0Var3.a(hk0Var2);
                                    i8 = i26;
                                    i11 = i25;
                                    rb0Var = rb0Var2;
                                    if (i27 != i11) {
                                        yc0 yc0Var2 = (yc0) hx0Var.b(hk0Var2.c);
                                        int i28 = yc0Var2 != null ? yc0Var2.c : hk0Var2.d;
                                        ay0Var = ay0Var3;
                                        int i29 = i27 + i21;
                                        i9 = size2;
                                        int i30 = i11 + i21;
                                        if (i28 > 0) {
                                            i10 = i21;
                                            int i31 = lpVar.l;
                                            if (i31 > 0) {
                                                arrayList3 = arrayList6;
                                                if (lpVar.j == i29 - i31 && lpVar.k == i30 - i31) {
                                                    lpVar.l = i31 + i28;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            lpVar.c();
                                            lpVar.j = i29;
                                            lpVar.k = i30;
                                            lpVar.l = i28;
                                        } else {
                                            i10 = i21;
                                            arrayList3 = arrayList6;
                                            lpVar.getClass();
                                        }
                                        if (i27 > i11) {
                                            Object[] objArr5 = hx0Var.c;
                                            long[] jArr5 = hx0Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i32 = 0;
                                                while (true) {
                                                    long j = jArr5[i32];
                                                    int i33 = i28;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i34 = 8 - ((~(i32 - length)) >>> 31);
                                                        int i35 = 0;
                                                        while (i35 < i34) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i35;
                                                                yc0 yc0Var3 = (yc0) objArr5[(i32 << 3) + i35];
                                                                objArr4 = objArr5;
                                                                int i36 = yc0Var3.b;
                                                                jArr4 = jArr5;
                                                                if (i27 <= i36 && i36 < i27 + i33) {
                                                                    yc0Var3.b = (i36 - i27) + i11;
                                                                } else if (i11 <= i36 && i36 < i27) {
                                                                    yc0Var3.b = i36 + i33;
                                                                }
                                                            } else {
                                                                i15 = i35;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i35 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i34 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i32 == length) {
                                                        break;
                                                    }
                                                    i32++;
                                                    arrayList5 = arrayList2;
                                                    i28 = i33;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i37 = i28;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i27) {
                                                Object[] objArr6 = hx0Var.c;
                                                long[] jArr6 = hx0Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i38 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i38];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                                            int i40 = 0;
                                                            while (i40 < i39) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    yc0 yc0Var4 = (yc0) objArr6[(i38 << 3) + i40];
                                                                    jArr2 = jArr6;
                                                                    int i41 = yc0Var4.b;
                                                                    i14 = i27;
                                                                    if (i27 <= i41 && i41 < i14 + i37) {
                                                                        yc0Var4.b = (i41 - i14) + i11;
                                                                    } else if (i14 + 1 <= i41 && i41 < i11) {
                                                                        yc0Var4.b = i41 - i37;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i27;
                                                                }
                                                                j2 >>= 8;
                                                                i40++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i27 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i27;
                                                            if (i39 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i27;
                                                        }
                                                        if (i38 == length2) {
                                                            break;
                                                        }
                                                        i38++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i27 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        ay0Var = ay0Var3;
                                        i9 = size2;
                                        i10 = i21;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i26;
                                    arrayList2 = arrayList5;
                                    ay0Var = ay0Var3;
                                    i9 = size2;
                                    i10 = i21;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i25;
                                    rb0Var = rb0Var2;
                                    i12 = i7 + 1;
                                }
                                i24 = i8 + 1;
                                yc0 yc0Var5 = (yc0) hx0Var.b(hk0Var2.c);
                                int i42 = i11 + (yc0Var5 != null ? yc0Var5.c : hk0Var2.d);
                                i23 = i12;
                                rb0Var2 = rb0Var;
                                ay0Var3 = ay0Var;
                                size2 = i9;
                                i21 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i25 = i42;
                                wh0Var3 = wh0Var2;
                            } else {
                                i24 = i26;
                                wh0Var3 = wh0Var2;
                                i23 = i7;
                            }
                        }
                    } else {
                        wh0Var2 = wh0Var3;
                        yc0 yc0Var6 = (yc0) hx0Var.b(hk0Var.c);
                        int i43 = yc0Var6 != null ? yc0Var6.b : -1;
                        int i44 = hk0Var.c;
                        i7 = i23;
                        lpVar.e(i43 + i21, hk0Var.d);
                        rb0Var2.a(i44, 0);
                        lpVar.f = (i44 - lpVar.a.G.g) + lpVar.f;
                        this.G.r(i44);
                        H();
                        this.G.s();
                        s22.f(arrayList5, i44, this.G.b[(i44 * 5) + 3] + i44);
                    }
                    i23 = i7 + 1;
                    wh0Var3 = wh0Var2;
                }
                wh0Var = wh0Var3;
                arrayList = arrayList5;
                lpVar.c();
                if (arrayList6.size() > 0) {
                    ip1 ip1Var4 = this.G;
                    lpVar.f = (ip1Var4.h - lpVar.a.G.g) + lpVar.f;
                    ip1Var4.t();
                }
            } else {
                wh0Var = wh0Var3;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.S;
        if (!z3) {
            ip1 ip1Var5 = this.G;
            int i45 = ip1Var5.m - ip1Var5.l;
            if (i45 > 0) {
                if (i45 > 0) {
                    lpVar.d(false);
                    wh0 wh0Var4 = lpVar.d;
                    ip1 ip1Var6 = lpVar.a.G;
                    if (ip1Var6.c > 0 && wh0Var4.a(-2) != (i6 = ip1Var6.i)) {
                        if (!lpVar.c && lpVar.e) {
                            lpVar.d(false);
                            lpVar.b.b.b0(k21.c);
                            lpVar.c = true;
                        }
                        if (i6 > 0) {
                            jb0 jb0VarA = ip1Var6.a(i6);
                            wh0Var4.c(i6);
                            lpVar.d(false);
                            f31 f31Var = lpVar.b.b;
                            f31Var.b0(j21.c);
                            al.O(f31Var, 0, jb0VarA);
                            lpVar.c = true;
                        }
                    }
                    f31 f31Var2 = lpVar.b.b;
                    f31Var2.b0(y21.c);
                    f31Var2.f[f31Var2.g - f31Var2.d[f31Var2.e - 1].a] = i45;
                } else {
                    lpVar.getClass();
                }
            }
        }
        int i46 = this.k;
        while (true) {
            ip1 ip1Var7 = this.G;
            if (ip1Var7.k > 0 || (i5 = ip1Var7.g) == ip1Var7.h) {
                break;
            }
            H();
            lpVar.e(i46, this.G.s());
            s22.f(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                s60 s60Var = this.O;
                f31 f31Var3 = s60Var.e;
                if (f31Var3.e == 0) {
                    mp.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                f31 f31Var4 = s60Var.d;
                d31[] d31VarArr = f31Var3.d;
                int i47 = f31Var3.e - 1;
                f31Var3.e = i47;
                d31 d31Var = d31VarArr[i47];
                d31VarArr[i47] = null;
                f31Var4.b0(d31Var);
                Object[] objArr7 = f31Var3.h;
                Object[] objArr8 = f31Var4.h;
                int i48 = f31Var4.i;
                int i49 = d31Var.b;
                int i50 = f31Var3.i;
                int i51 = i50 - i49;
                System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                Object[] objArr9 = f31Var3.h;
                int i52 = f31Var3.i;
                Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                int[] iArr = f31Var3.f;
                int[] iArr2 = f31Var4.f;
                int i53 = f31Var4.g;
                int i54 = d31Var.a;
                int i55 = f31Var3.g;
                nd.K(i53 - i54, i55 - i54, i55, iArr, iArr2);
                f31Var3.i -= i49;
                f31Var3.g -= i54;
                i20 = 1;
            }
            if (this.G.k <= 0) {
                e91.a("Unbalanced begin/end empty");
            }
            r4.k--;
            mp1 mp1Var2 = this.I;
            int i56 = mp1Var2.v;
            mp1Var2.j();
            if (this.G.k <= 0) {
                int i57 = (-2) - i56;
                this.I.k();
                this.I.e(true);
                jb0 jb0Var = this.N;
                boolean zA0 = this.O.d.a0();
                jp1 jp1Var = this.H;
                if (zA0) {
                    lpVar.b();
                    lpVar.d(false);
                    wh0 wh0Var5 = lpVar.d;
                    ip1 ip1Var8 = lpVar.a.G;
                    if (ip1Var8.c <= 0 || wh0Var5.a(-2) == (i4 = ip1Var8.i)) {
                        i3 = 1;
                        lpVar.c();
                        f31 f31Var5 = lpVar.b.b;
                        f31Var5.b0(m21.c);
                        al.P(f31Var5, 0, jb0Var, i3, jp1Var);
                        r3 = 0;
                    } else {
                        if (!lpVar.c && lpVar.e) {
                            lpVar.d(false);
                            lpVar.b.b.b0(k21.c);
                            lpVar.c = true;
                        }
                        if (i4 > 0) {
                            jb0 jb0VarA2 = ip1Var8.a(i4);
                            wh0Var5.c(i4);
                            lpVar.d(false);
                            f31 f31Var6 = lpVar.b.b;
                            f31Var6.b0(j21.c);
                            al.O(f31Var6, 0, jb0VarA2);
                            i3 = 1;
                            lpVar.c = true;
                        }
                        lpVar.c();
                        f31 f31Var52 = lpVar.b.b;
                        f31Var52.b0(m21.c);
                        al.P(f31Var52, 0, jb0Var, i3, jp1Var);
                        r3 = 0;
                    }
                } else {
                    s60 s60Var2 = this.O;
                    lpVar.b();
                    lpVar.d(false);
                    wh0 wh0Var6 = lpVar.d;
                    ip1 ip1Var9 = lpVar.a.G;
                    if (ip1Var9.c > 0 && wh0Var6.a(-2) != (i2 = ip1Var9.i)) {
                        if (!lpVar.c && lpVar.e) {
                            lpVar.d(false);
                            lpVar.b.b.b0(k21.c);
                            lpVar.c = true;
                        }
                        if (i2 > 0) {
                            jb0 jb0VarA3 = ip1Var9.a(i2);
                            wh0Var6.c(i2);
                            lpVar.d(false);
                            f31 f31Var7 = lpVar.b.b;
                            f31Var7.b0(j21.c);
                            al.O(f31Var7, 0, jb0VarA3);
                            lpVar.c = true;
                        }
                    }
                    lpVar.c();
                    f31 f31Var8 = lpVar.b.b;
                    f31Var8.b0(n21.c);
                    int i58 = f31Var8.i - f31Var8.d[f31Var8.e - 1].b;
                    Object[] objArr10 = f31Var8.h;
                    objArr10[i58] = jb0Var;
                    objArr10[i58 + 1] = jp1Var;
                    objArr10[i58 + 2] = s60Var2;
                    this.O = new s60();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.f != 0) {
                    d0(i57, r3);
                    e0(i57, i20);
                }
            }
        } else {
            if (z) {
                lpVar.a();
            }
            int i59 = lpVar.a.G.i;
            wh0 wh0Var7 = lpVar.d;
            int i60 = i;
            if (wh0Var7.a(i60) > i59) {
                mp.a("Missed recording an endGroup");
            }
            if (wh0Var7.a(i60) == i59) {
                lpVar.d(false);
                wh0Var7.b();
                lpVar.b.b.b0(g21.c);
            }
            int i61 = this.G.i;
            if (i20 != h0(i61)) {
                e0(i61, i20);
            }
            if (z) {
                i20 = 1;
            }
            this.G.e();
            lpVar.c();
        }
        rb0 rb0Var3 = (rb0) this.i.remove(r3.size() - 1);
        if (rb0Var3 != null && !z3) {
            rb0Var3.c++;
        }
        this.j = rb0Var3;
        this.k = wh0Var.b() + i20;
        this.m = wh0Var.b();
        this.l = wh0Var.b() + i20;
    }

    public final void q() {
        p(false);
        dc1 dc1VarW = w();
        if (dc1VarW != null) {
            int i = dc1VarW.b;
            if ((i & 1) != 0) {
                dc1VarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[EDGE_INSN: B:61:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081], EDGE_INSN: B:62:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dc1 r() {
        dc1 dc1Var;
        jb0 jb0VarA;
        cc1 cc1Var;
        int i;
        ArrayList arrayList = this.E;
        dc1 dc1Var2 = !arrayList.isEmpty() ? (dc1) arrayList.remove(arrayList.size() - 1) : null;
        int i2 = 0;
        if (dc1Var2 != null) {
            dc1Var2.b &= -9;
            this.g.l();
            int i3 = this.B;
            ox0 ox0Var = dc1Var2.f;
            if (ox0Var == null || (dc1Var2.b & 16) != 0) {
                cc1Var = null;
                lp lpVar = this.M;
                if (cc1Var != null) {
                    f31 f31Var = lpVar.b.b;
                    f31Var.b0(f21.c);
                    al.P(f31Var, 0, cc1Var, 1, this.h);
                }
                i = dc1Var2.b;
                if ((i & 512) != 0) {
                    dc1Var2.b = i & (-513);
                    f31 f31Var2 = lpVar.b.b;
                    f31Var2.b0(i21.c);
                    al.O(f31Var2, 0, dc1Var2);
                    int i4 = dc1Var2.b;
                    dc1Var2.b = i4 & (-129);
                    if ((i4 & 1024) != 0) {
                        dc1Var2.b = i4 & (-1153);
                        if (this.z == this.G.i) {
                            this.y = false;
                            this.z = -1;
                        }
                    }
                }
            } else {
                Object[] objArr = ox0Var.b;
                int[] iArr = ox0Var.c;
                long[] jArr = ox0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i3) {
                                        cc1Var = new cc1(i3, i2, dc1Var2, ox0Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    cc1Var = null;
                    lp lpVar2 = this.M;
                    if (cc1Var != null) {
                    }
                    i = dc1Var2.b;
                    if ((i & 512) != 0) {
                    }
                }
            }
        }
        if (dc1Var2 != null) {
            int i9 = dc1Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (dc1Var2.c == null) {
                    if (this.S) {
                        mp1 mp1Var = this.I;
                        jb0VarA = mp1Var.b(mp1Var.v);
                    } else {
                        ip1 ip1Var = this.G;
                        jb0VarA = ip1Var.a(ip1Var.i);
                    }
                    dc1Var2.c = jb0VarA;
                }
                dc1Var2.b &= -5;
                dc1Var = dc1Var2;
            } else {
                dc1Var = null;
            }
        }
        p(false);
        return dc1Var;
    }

    public final void s() {
        p(false);
        this.b.c();
        p(false);
        lp lpVar = this.M;
        if (lpVar.c) {
            lpVar.d(false);
            lpVar.d(false);
            lpVar.b.b.b0(g21.c);
            lpVar.c = false;
        }
        lpVar.b();
        if (lpVar.d.b != 0) {
            mp.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            mp.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void t(boolean z, rb0 rb0Var) {
        this.i.add(this.j);
        this.j = rb0Var;
        int i = this.l;
        wh0 wh0Var = this.n;
        wh0Var.c(i);
        wh0Var.c(this.m);
        wh0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void u() {
        jp1 jp1Var = new jp1();
        if (this.C) {
            jp1Var.b();
        }
        if (this.b.d()) {
            jp1Var.o = new hx0();
        }
        this.H = jp1Var;
        mp1 mp1VarE = jp1Var.e();
        mp1VarE.e(true);
        this.I = mp1VarE;
    }

    public final qp v() {
        pb0 pb0Var = this.U;
        if (pb0Var != null) {
            return pb0Var;
        }
        pb0 pb0Var2 = new pb0(this.h);
        this.U = pb0Var2;
        return pb0Var2;
    }

    public final dc1 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (dc1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.w) {
            return true;
        }
        dc1 dc1VarW = w();
        return (dc1VarW == null || (dc1VarW.b & 4) == 0) ? false : true;
    }

    public final rp y() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        dc1 dc1VarW;
        return (this.S || this.y || this.w || (dc1VarW = w()) == null || (dc1VarW.b & 8) != 0) ? false : true;
    }
}
