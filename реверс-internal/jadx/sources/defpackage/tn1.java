package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class tn1 extends p0 implements dy0, f70, ib0 {
    public final int i;
    public final int j;
    public final ph k;
    public Object[] l;
    public long m;
    public long n;
    public int o;
    public int p;

    public tn1(int i, int i2, ph phVar) {
        this.i = i;
        this.j = i2;
        this.k = phVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:53)|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|55|25|26))(1:29)|51|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0076, B:35:0x0080, B:39:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x009f, B:22:0x0047), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [g70] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [tn1] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [g70] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [q0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [un1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [un1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(tn1 tn1Var, g70 g70Var, ks ksVar) throws Throwable {
        sn1 sn1Var;
        ?? r4;
        ?? r10;
        tn1 tn1Var2;
        oj0 oj0Var;
        oj0 oj0Var2;
        ?? r1;
        Object objU;
        s30 s30Var;
        wt wtVar;
        ?? r102;
        ?? r9;
        ?? r8;
        if (ksVar instanceof sn1) {
            sn1Var = (sn1) ksVar;
            int i = sn1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn1Var.n = i - Integer.MIN_VALUE;
            } else {
                sn1Var = new sn1(tn1Var, ksVar);
            }
        }
        Object obj = sn1Var.l;
        int i2 = sn1Var.n;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            xc.G(obj);
            r10 = g70Var;
            g70Var = (un1) tn1Var.a();
            tn1Var2 = tn1Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    oj0Var2 = sn1Var.k;
                    un1 un1Var = sn1Var.j;
                    g70 g70Var2 = sn1Var.i;
                    tn1 tn1Var3 = sn1Var.h;
                    xc.G(obj);
                    r1 = g70Var2;
                    r4 = tn1Var3;
                    g70Var = un1Var;
                    do {
                        objU = r4.u(g70Var);
                        s30Var = s22.k0;
                        wtVar = wt.e;
                        if (objU == s30Var) {
                        }
                        r4.f(g70Var);
                        throw th;
                    } while (r4.h(g70Var, sn1Var) != wtVar);
                }
                if (i2 != 3) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                oj0Var2 = sn1Var.k;
                un1 un1Var2 = sn1Var.j;
                g70 g70Var3 = sn1Var.i;
                tn1 tn1Var4 = sn1Var.h;
                xc.G(obj);
                ?? r12 = g70Var3;
                ?? r42 = tn1Var4;
                ?? r92 = un1Var2;
                r102 = r12;
                oj0Var = oj0Var2;
                r8 = r42;
                r9 = r92;
                r4 = r8;
                oj0Var2 = oj0Var;
                r1 = r102;
                g70Var = r9;
                do {
                    objU = r4.u(g70Var);
                    s30Var = s22.k0;
                    wtVar = wt.e;
                    if (objU == s30Var) {
                        if (oj0Var2 != null && !oj0Var2.b()) {
                            throw oj0Var2.p();
                        }
                        sn1Var.h = r4;
                        sn1Var.i = r1;
                        sn1Var.j = g70Var;
                        sn1Var.k = oj0Var2;
                        sn1Var.n = 3;
                        Object objL = r1.l(objU, sn1Var);
                        r12 = r1;
                        r42 = r4;
                        r92 = g70Var;
                        if (objL == wtVar) {
                            return;
                        }
                        r102 = r12;
                        oj0Var = oj0Var2;
                        r8 = r42;
                        r9 = r92;
                        r4 = r8;
                        oj0Var2 = oj0Var;
                        r1 = r102;
                        g70Var = r9;
                        objU = r4.u(g70Var);
                        s30Var = s22.k0;
                        wtVar = wt.e;
                        if (objU == s30Var) {
                            sn1Var.h = r4;
                            sn1Var.i = r1;
                            sn1Var.j = g70Var;
                            sn1Var.k = oj0Var2;
                            sn1Var.n = 2;
                        }
                    }
                    r4.f(g70Var);
                    throw th;
                } while (r4.h(g70Var, sn1Var) != wtVar);
            }
            g70Var = sn1Var.j;
            g70 g70Var4 = sn1Var.i;
            tn1 tn1Var5 = sn1Var.h;
            try {
                xc.G(obj);
                r10 = g70Var4;
                tn1Var2 = tn1Var5;
                g70Var = g70Var;
            } catch (Throwable th2) {
                th = th2;
                r4 = tn1Var5;
            }
        }
        lt ltVar = sn1Var.f;
        ltVar.getClass();
        oj0Var = (oj0) ltVar.l(v20.O);
        r8 = tn1Var2;
        r9 = g70Var;
        r102 = r10;
        r4 = r8;
        oj0Var2 = oj0Var;
        r1 = r102;
        g70Var = r9;
        do {
            objU = r4.u(g70Var);
            s30Var = s22.k0;
            wtVar = wt.e;
            if (objU == s30Var) {
            }
            r4.f(g70Var);
            throw th;
        } while (r4.h(g70Var, sn1Var) != wtVar);
    }

    @Override // defpackage.p0
    public final q0 b() {
        un1 un1Var = new un1();
        un1Var.a = -1L;
        return un1Var;
    }

    @Override // defpackage.f70
    public final Object c(g70 g70Var, ks ksVar) throws Throwable {
        k(this, g70Var, ksVar);
        return wt.e;
    }

    @Override // defpackage.p0
    public final q0[] d() {
        return new un1[2];
    }

    @Override // defpackage.ib0
    public final f70 e(lt ltVar, int i, ph phVar) {
        return ((i == 0 || i == -3) && phVar == ph.e) ? this : new rj(this, ltVar, i, phVar);
    }

    public final Object h(un1 un1Var, sn1 sn1Var) {
        xi xiVar = new xi(1, bl.E(sn1Var));
        xiVar.v();
        synchronized (this) {
            try {
                if (t(un1Var) < 0) {
                    un1Var.b = xiVar;
                } else {
                    xiVar.g(t32.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objT = xiVar.t();
        return objT == wt.e ? objT : t32.a;
    }

    public final void j() {
        if (this.j != 0 || this.p > 1) {
            Object[] objArr = this.l;
            objArr.getClass();
            while (this.p > 0) {
                long jP = p();
                int i = this.o;
                int i2 = this.p;
                if (objArr[((int) ((jP + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != s22.k0) {
                    return;
                }
                this.p = i2 - 1;
                s22.g(objArr, p() + ((long) (this.o + this.p)), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // defpackage.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, ks ksVar) throws Throwable {
        tn1 tn1Var;
        Throwable th;
        ks[] ksVarArrO;
        rn1 rn1Var;
        Object objT;
        wt wtVar;
        if (r(obj)) {
            return t32.a;
        }
        int i = 1;
        xi xiVar = new xi(1, bl.E(ksVar));
        xiVar.v();
        ks[] ksVarArrO2 = pv.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        xiVar.g(t32.a);
                        ksVarArrO = o(ksVarArrO2);
                        rn1Var = null;
                        tn1Var = this;
                        if (rn1Var != null) {
                            xiVar.y(new si(i, rn1Var));
                        }
                        for (ks ksVar2 : ksVarArrO) {
                            if (ksVar2 != null) {
                                ksVar2.g(t32.a);
                            }
                        }
                        objT = xiVar.t();
                        wtVar = wt.e;
                        if (objT != wtVar) {
                            objT = t32.a;
                        }
                        return objT != wtVar ? objT : t32.a;
                    } catch (Throwable th2) {
                        th = th2;
                        tn1Var = this;
                    }
                } else {
                    try {
                        tn1Var = this;
                        try {
                            rn1 rn1Var2 = new rn1(tn1Var, p() + ((long) (this.o + this.p)), obj, xiVar);
                            tn1Var.n(rn1Var2);
                            tn1Var.p++;
                            if (tn1Var.j == 0) {
                                ksVarArrO2 = tn1Var.o(ksVarArrO2);
                            }
                            ksVarArrO = ksVarArrO2;
                            rn1Var = rn1Var2;
                            if (rn1Var != null) {
                            }
                            while (i < r7) {
                            }
                            objT = xiVar.t();
                            wtVar = wt.e;
                            if (objT != wtVar) {
                            }
                            if (objT != wtVar) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        tn1Var = this;
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                tn1Var = this;
            }
            th = th;
            throw th;
        }
    }

    public final void m() {
        q0[] q0VarArr;
        Object[] objArr = this.l;
        objArr.getClass();
        s22.g(objArr, p(), null);
        this.o--;
        long jP = p() + 1;
        if (this.m < jP) {
            this.m = jP;
        }
        if (this.n < jP) {
            if (this.f != 0 && (q0VarArr = this.e) != null) {
                for (q0 q0Var : q0VarArr) {
                    if (q0Var != null) {
                        un1 un1Var = (un1) q0Var;
                        long j = un1Var.a;
                        if (0 <= j && j < jP) {
                            un1Var.a = jP;
                        }
                    }
                }
            }
            this.n = jP;
        }
    }

    public final void n(Object obj) {
        int i = this.o + this.p;
        Object[] objArrQ = this.l;
        if (objArrQ == null) {
            objArrQ = q(null, 0, 2);
        } else if (i >= objArrQ.length) {
            objArrQ = q(objArrQ, i, objArrQ.length * 2);
        }
        s22.g(objArrQ, p() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ks[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final ks[] o(ks[] ksVarArr) {
        q0[] q0VarArr;
        un1 un1Var;
        xi xiVar;
        int length = ksVarArr.length;
        if (this.f != 0 && (q0VarArr = this.e) != null) {
            int length2 = q0VarArr.length;
            int i = 0;
            ksVarArr = ksVarArr;
            while (i < length2) {
                q0 q0Var = q0VarArr[i];
                if (q0Var != null && (xiVar = (un1Var = (un1) q0Var).b) != null && t(un1Var) >= 0) {
                    int length3 = ksVarArr.length;
                    ksVarArr = ksVarArr;
                    if (length >= length3) {
                        ksVarArr = Arrays.copyOf((Object[]) ksVarArr, Math.max(2, ksVarArr.length * 2));
                    }
                    ((ks[]) ksVarArr)[length] = xiVar;
                    un1Var.b = null;
                    length++;
                }
                i++;
                ksVarArr = ksVarArr;
            }
        }
        return (ks[]) ksVarArr;
    }

    public final long p() {
        return Math.min(this.n, this.m);
    }

    public final Object[] q(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            yc.l("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.l = objArr2;
        if (objArr != null) {
            long jP = p();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jP;
                s22.g(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean r(Object obj) {
        int i;
        boolean z;
        ks[] ksVarArrO = pv.a;
        synchronized (this) {
            if (s(obj)) {
                ksVarArrO = o(ksVarArrO);
                z = true;
            } else {
                z = false;
            }
        }
        for (ks ksVar : ksVarArrO) {
            if (ksVar != null) {
                ksVar.g(t32.a);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Object obj) {
        int i = this.f;
        int i2 = this.i;
        if (i != 0) {
            int i3 = this.o;
            int i4 = this.j;
            if (i3 >= i4 && this.n <= this.m) {
                int iOrdinal = this.k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            ez1.a();
                        }
                    }
                }
                return false;
            }
            n(obj);
            int i5 = this.o + 1;
            this.o = i5;
            if (i5 > i4) {
                m();
            }
            long jP = p() + ((long) this.o);
            long j = this.m;
            if (((int) (jP - j)) > i2) {
                v(1 + j, this.n, p() + ((long) this.o), p() + ((long) this.o) + ((long) this.p));
            }
        } else if (i2 != 0) {
            n(obj);
            int i6 = this.o + 1;
            this.o = i6;
            if (i6 > i2) {
                m();
            }
            this.n = p() + ((long) this.o);
            return true;
        }
        return true;
    }

    public final long t(un1 un1Var) {
        long j = un1Var.a;
        if (j >= p() + ((long) this.o) && (this.j > 0 || j > p() || this.p == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(un1 un1Var) {
        Object obj;
        ks[] ksVarArrW = pv.a;
        synchronized (this) {
            try {
                long jT = t(un1Var);
                if (jT < 0) {
                    obj = s22.k0;
                } else {
                    long j = un1Var.a;
                    Object[] objArr = this.l;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj2 instanceof rn1) {
                        obj2 = ((rn1) obj2).g;
                    }
                    un1Var.a = jT + 1;
                    Object obj3 = obj2;
                    ksVarArrW = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ks ksVar : ksVarArrW) {
            if (ksVar != null) {
                ksVar.g(t32.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jP = p(); jP < jMin; jP++) {
            Object[] objArr = this.l;
            objArr.getClass();
            s22.g(objArr, jP, null);
        }
        this.m = j;
        this.n = j2;
        this.o = (int) (j3 - jMin);
        this.p = (int) (j4 - j3);
    }

    public final ks[] w(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        ks[] ksVarArr;
        ks[] ksVarArr2;
        q0[] q0VarArr;
        s30 s30Var = s22.k0;
        ks[] ksVarArr3 = pv.a;
        if (j <= this.n) {
            long jP = p();
            long j5 = ((long) this.o) + jP;
            int i2 = this.j;
            if (i2 == 0 && this.p > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.f != 0 && (q0VarArr = this.e) != null) {
                for (q0 q0Var : q0VarArr) {
                    if (q0Var != null) {
                        long j6 = ((un1) q0Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.n) {
                long jP2 = p() + ((long) this.o);
                int i4 = this.f;
                int iMin = this.p;
                if (i4 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i2 - ((int) (jP2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.p) + jP2;
                if (iMin > 0) {
                    ks[] ksVarArr4 = new ks[iMin];
                    Object[] objArr = this.l;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = jP2;
                    while (true) {
                        if (jP2 >= j7) {
                            ksVarArr2 = ksVarArr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        ksVarArr2 = ksVarArr4;
                        Object obj = objArr[((int) jP2) & (objArr.length - 1)];
                        if (obj != s30Var) {
                            obj.getClass();
                            rn1 rn1Var = (rn1) obj;
                            i = i2;
                            int i5 = i3 + 1;
                            j4 = j7;
                            ksVarArr2[i3] = rn1Var.h;
                            s22.g(objArr, jP2, s30Var);
                            s22.g(objArr, j8, rn1Var.g);
                            j8 += j2;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        jP2 += j2;
                        ksVarArr4 = ksVarArr2;
                        i2 = i;
                        j7 = j4;
                    }
                    jP2 = j8;
                    ksVarArr = ksVarArr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    ksVarArr = ksVarArr3;
                }
                long jMax = Math.max(this.m, Math.max(jP, jP2 - ((long) this.i)));
                if (i == 0 && jMax < j4) {
                    Object[] objArr2 = this.l;
                    objArr2.getClass();
                    if (xi0.o(objArr2[((int) jMax) & (objArr2.length - 1)], s30Var)) {
                        jP2 += j2;
                        jMax += j2;
                    }
                }
                long j9 = jP2;
                v(jMax, this.f == 0 ? j9 : j3, j9, j4);
                j();
                return ksVarArr.length == 0 ? ksVarArr : o(ksVarArr);
            }
        }
        return ksVarArr3;
    }
}
