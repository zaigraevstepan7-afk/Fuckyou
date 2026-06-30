package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq1 {
    public static final fi1 a = new fi1(10);
    public static final oc b = new oc(15);
    public static final Object c = new Object();
    public static yp1 d;
    public static long e;
    public static final wp1 f;
    public static final g6 g;
    public static List h;
    public static List i;
    public static final gc0 j;
    public static final xd k;

    static {
        yp1 yp1Var = yp1.i;
        d = yp1Var;
        e = 2L;
        wp1 wp1Var = new wp1();
        wp1Var.b = new long[16];
        wp1Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        wp1Var.d = iArr;
        f = wp1Var;
        g6 g6Var = new g6();
        g6Var.b = new int[16];
        g6Var.c = new g72[16];
        g = g6Var;
        f40 f40Var = f40.e;
        h = f40Var;
        i = f40Var;
        long j2 = e;
        e = 1 + j2;
        gc0 gc0Var = new gc0(j2, yp1Var, null, new mt(6));
        d = d.f(gc0Var.b);
        j = gc0Var;
        k = new xd(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, ey0 ey0Var, yp1 yp1Var) {
        long[] jArr;
        yp1 yp1Var2;
        long[] jArr2;
        yp1 yp1Var3;
        int i2;
        int i3;
        xs1 xs1VarS;
        ay0 ay0VarX = ey0Var.x();
        if (ay0VarX != null) {
            long jG = ey0Var.g();
            yp1 yp1VarE = ey0Var.d().f(jG).e(ey0Var.j);
            Object[] objArr = ay0VarX.b;
            long[] jArr3 = ay0VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                vs1 vs1Var = (vs1) objArr[(i4 << 3) + i7];
                                xs1 xs1VarA = vs1Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                xs1 xs1VarS2 = s(xs1VarA, j2, yp1Var);
                                if (xs1VarS2 == null || (xs1VarS = s(xs1VarA, jG, yp1VarE)) == null || xs1VarS2.equals(xs1VarS)) {
                                    yp1Var3 = yp1VarE;
                                } else {
                                    yp1Var3 = yp1VarE;
                                    xs1 xs1VarS3 = s(xs1VarA, jG, ey0Var.d());
                                    if (xs1VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    xs1 xs1VarB = vs1Var.b(xs1VarS, xs1VarS2, xs1VarS3);
                                    if (xs1VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(xs1VarS2, xs1VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                yp1Var3 = yp1VarE;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            yp1VarE = yp1Var3;
                        }
                        jArr = jArr3;
                        yp1Var2 = yp1VarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        yp1Var2 = yp1VarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    yp1VarE = yp1Var2;
                }
            }
        }
        return null;
    }

    public static final void c(sp1 sp1Var) {
        Long lValueOf;
        if (d.c(sp1Var.g())) {
            return;
        }
        long jG = sp1Var.g();
        boolean z = sp1Var.c;
        ey0 ey0Var = sp1Var instanceof ey0 ? (ey0) sp1Var : null;
        String strValueOf = ey0Var != null ? Boolean.valueOf(ey0Var.m) : "read-only";
        synchronized (c) {
            wp1 wp1Var = f;
            lValueOf = Long.valueOf(wp1Var.a > 0 ? wp1Var.b[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + strValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final yp1 d(yp1 yp1Var, long j2, long j3) {
        while (xi0.u(j2, j3) < 0) {
            yp1Var = yp1Var.f(j2);
            j2++;
        }
        return yp1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(sa0 sa0Var) {
        ay0 ay0Var;
        Object objV;
        gc0 gc0Var = j;
        synchronized (c) {
            try {
                ay0Var = gc0Var.h;
                if (ay0Var != null) {
                    k.addAndGet(1);
                }
                objV = v(gc0Var, sa0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ay0Var != null) {
            try {
                List list = h;
                ri1 ri1Var = new ri1(ay0Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((wa0) list.get(i2)).h(ri1Var, gc0Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (ay0Var != null) {
                Object[] objArr = ay0Var.b;
                long[] jArr = ay0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((vs1) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objV;
    }

    public static final void f() {
        g6 g6Var = g;
        int i2 = g6Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            g72 g72Var = ((g72[]) g6Var.c)[i3];
            Object obj = g72Var != null ? g72Var.get() : null;
            if (obj != null && p((vs1) obj)) {
                if (i4 != i3) {
                    ((g72[]) g6Var.c)[i4] = g72Var;
                    int[] iArr = (int[]) g6Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((g72[]) g6Var.c)[i5] = null;
            ((int[]) g6Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            g6Var.a = i4;
        }
    }

    public static final sp1 g(sp1 sp1Var, sa0 sa0Var, boolean z) {
        boolean z2 = sp1Var instanceof ey0;
        if (z2 || sp1Var == null) {
            return new f22(z2 ? (ey0) sp1Var : null, sa0Var, null, false, z);
        }
        return new g22(sp1Var, sa0Var, false, z);
    }

    public static final xs1 h(xs1 xs1Var) {
        xs1 xs1VarS;
        sp1 sp1VarJ = j();
        xs1 xs1VarS2 = s(xs1Var, sp1VarJ.g(), sp1VarJ.d());
        if (xs1VarS2 != null) {
            return xs1VarS2;
        }
        synchronized (c) {
            sp1 sp1VarJ2 = j();
            xs1VarS = s(xs1Var, sp1VarJ2.g(), sp1VarJ2.d());
        }
        if (xs1VarS != null) {
            return xs1VarS;
        }
        r();
        throw null;
    }

    public static final xs1 i(xs1 xs1Var, sp1 sp1Var) {
        xs1 xs1VarS;
        xs1 xs1VarS2 = s(xs1Var, sp1Var.g(), sp1Var.d());
        if (xs1VarS2 != null) {
            return xs1VarS2;
        }
        synchronized (c) {
            xs1VarS = s(xs1Var, sp1Var.g(), sp1Var.d());
        }
        if (xs1VarS != null) {
            return xs1VarS;
        }
        r();
        throw null;
    }

    public static final sp1 j() {
        sp1 sp1Var = (sp1) b.h();
        return sp1Var == null ? j : sp1Var;
    }

    public static final sa0 k(sa0 sa0Var, sa0 sa0Var2, boolean z) {
        if (!z) {
            sa0Var2 = null;
        }
        return (sa0Var == null || sa0Var2 == null || sa0Var == sa0Var2) ? sa0Var == null ? sa0Var2 : sa0Var : new zp1(sa0Var, sa0Var2, 0);
    }

    public static final sa0 l(sa0 sa0Var, sa0 sa0Var2) {
        return (sa0Var == null || sa0Var2 == null || sa0Var == sa0Var2) ? sa0Var == null ? sa0Var2 : sa0Var : new zp1(sa0Var, sa0Var2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xs1 m(xs1 xs1Var, vs1 vs1Var) {
        xs1 xs1VarA = vs1Var.a();
        long j2 = e;
        wp1 wp1Var = f;
        if (wp1Var.a > 0) {
            j2 = wp1Var.b[0];
        }
        long j3 = j2 - 1;
        xs1 xs1Var2 = null;
        xs1 xs1Var3 = null;
        while (true) {
            if (xs1VarA == null) {
                break;
            }
            long j4 = xs1VarA.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && xi0.u(j4, j3) <= 0 && !yp1.i.c(j4)) {
                if (xs1Var3 == null) {
                    xs1Var3 = xs1VarA;
                } else {
                    if (xi0.u(xs1VarA.a, xs1Var3.a) < 0) {
                        break;
                    }
                    xs1Var2 = xs1Var3;
                }
            }
            xs1VarA = xs1VarA.b;
        }
        if (xs1Var2 != null) {
            xs1Var2.a = Long.MAX_VALUE;
            return xs1Var2;
        }
        xs1 xs1VarB = xs1Var.b(Long.MAX_VALUE);
        xs1VarB.b = vs1Var.a();
        vs1Var.c(xs1VarB);
        return xs1VarB;
    }

    public static final void n(sp1 sp1Var, vs1 vs1Var) {
        sp1Var.t(sp1Var.h() + 1);
        sa0 sa0VarI = sp1Var.i();
        if (sa0VarI != null) {
            sa0VarI.i(vs1Var);
        }
    }

    public static final xs1 o(xs1 xs1Var, ws1 ws1Var, sp1 sp1Var, xs1 xs1Var2) {
        xs1 xs1VarM;
        if (sp1Var.f()) {
            sp1Var.n(ws1Var);
        }
        long jG = sp1Var.g();
        if (xs1Var2.a == jG) {
            return xs1Var2;
        }
        synchronized (c) {
            xs1VarM = m(xs1Var, ws1Var);
        }
        xs1VarM.a = jG;
        if (xs1Var2.a != 1) {
            sp1Var.n(ws1Var);
        }
        return xs1VarM;
    }

    public static final boolean p(vs1 vs1Var) {
        xs1 xs1Var;
        long j2 = e;
        wp1 wp1Var = f;
        if (wp1Var.a > 0) {
            j2 = wp1Var.b[0];
        }
        xs1 xs1Var2 = null;
        xs1 xs1VarA = null;
        int i2 = 0;
        for (xs1 xs1VarA2 = vs1Var.a(); xs1VarA2 != null; xs1VarA2 = xs1VarA2.b) {
            long j3 = xs1VarA2.a;
            if (j3 != 0) {
                if (xi0.u(j3, j2) >= 0) {
                    i2++;
                } else if (xs1Var2 == null) {
                    i2++;
                    xs1Var2 = xs1VarA2;
                } else {
                    if (xi0.u(xs1VarA2.a, xs1Var2.a) < 0) {
                        xs1Var = xs1Var2;
                        xs1Var2 = xs1VarA2;
                    } else {
                        xs1Var = xs1VarA2;
                    }
                    if (xs1VarA == null) {
                        xs1VarA = vs1Var.a();
                        xs1 xs1Var3 = xs1VarA;
                        while (true) {
                            if (xs1VarA == null) {
                                xs1VarA = xs1Var3;
                                break;
                            }
                            if (xi0.u(xs1VarA.a, j2) >= 0) {
                                break;
                            }
                            if (xi0.u(xs1Var3.a, xs1VarA.a) < 0) {
                                xs1Var3 = xs1VarA;
                            }
                            xs1VarA = xs1VarA.b;
                        }
                    }
                    xs1Var2.a = 0L;
                    xs1Var2.a(xs1VarA);
                    xs1Var2 = xs1Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(vs1 vs1Var) {
        if (p(vs1Var)) {
            g6 g6Var = g;
            int i2 = g6Var.a;
            int iIdentityHashCode = System.identityHashCode(vs1Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = g6Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) g6Var.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        g72 g72Var = ((g72[]) g6Var.c)[i6];
                        if (vs1Var == (g72Var != null ? g72Var.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) g6Var.b)[i8] == iIdentityHashCode; i8--) {
                                g72 g72Var2 = ((g72[]) g6Var.c)[i8];
                                if ((g72Var2 != null ? g72Var2.get() : null) == vs1Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = g6Var.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(g6Var.a + 1);
                                    break;
                                } else {
                                    if (((int[]) g6Var.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    g72 g72Var3 = ((g72[]) g6Var.c)[i6];
                                    if ((g72Var3 != null ? g72Var3.get() : null) == vs1Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            g72[] g72VarArr = (g72[]) g6Var.c;
            int length = g72VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                g72[] g72VarArr2 = new g72[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(g72VarArr, i10, g72VarArr2, i12, i2 - i10);
                System.arraycopy((g72[]) g6Var.c, 0, g72VarArr2, 0, i10);
                nd.K(i12, i10, i2, (int[]) g6Var.b, iArr);
                nd.N(0, i10, 6, (int[]) g6Var.b, iArr);
                g6Var.c = g72VarArr2;
                g6Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(g72VarArr, i10, g72VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) g6Var.b;
                nd.K(i13, i10, i2, iArr2, iArr2);
            }
            ((g72[]) g6Var.c)[i10] = new g72(vs1Var);
            ((int[]) g6Var.b)[i10] = iIdentityHashCode;
            g6Var.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final xs1 s(xs1 xs1Var, long j2, yp1 yp1Var) {
        xs1 xs1Var2 = null;
        while (xs1Var != null) {
            long j3 = xs1Var.a;
            if (j3 != 0 && xi0.u(j3, j2) <= 0 && !yp1Var.c(j3) && (xs1Var2 == null || xi0.u(xs1Var2.a, xs1Var.a) < 0)) {
                xs1Var2 = xs1Var;
            }
            xs1Var = xs1Var.b;
        }
        if (xs1Var2 != null) {
            return xs1Var2;
        }
        return null;
    }

    public static final xs1 t(xs1 xs1Var, vs1 vs1Var) {
        xs1 xs1VarS;
        sp1 sp1VarJ = j();
        sa0 sa0VarE = sp1VarJ.e();
        if (sa0VarE != null) {
            sa0VarE.i(vs1Var);
        }
        xs1 xs1VarS2 = s(xs1Var, sp1VarJ.g(), sp1VarJ.d());
        if (xs1VarS2 != null) {
            return xs1VarS2;
        }
        synchronized (c) {
            sp1 sp1VarJ2 = j();
            xs1 xs1VarA = vs1Var.a();
            xs1VarA.getClass();
            xs1VarS = s(xs1VarA, sp1VarJ2.g(), sp1VarJ2.d());
            if (xs1VarS == null) {
                r();
                throw null;
            }
        }
        return xs1VarS;
    }

    public static final void u(int i2) {
        wp1 wp1Var = f;
        int i3 = wp1Var.d[i2];
        wp1Var.b(i3, wp1Var.a - 1);
        wp1Var.a--;
        long[] jArr = wp1Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (xi0.u(jArr[i5], j2) <= 0) {
                break;
            }
            wp1Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = wp1Var.b;
        int i6 = wp1Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < wp1Var.a && xi0.u(jArr2[i7], jArr2[i8]) < 0) {
                if (xi0.u(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                wp1Var.b(i7, i3);
                i3 = i7;
            } else {
                if (xi0.u(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                wp1Var.b(i8, i3);
                i3 = i8;
            }
        }
        wp1Var.d[i2] = wp1Var.e;
        wp1Var.e = i2;
    }

    public static final Object v(gc0 gc0Var, sa0 sa0Var) {
        long j2 = gc0Var.b;
        Object objI = sa0Var.i(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        yp1 yp1VarB = d.b(j2);
        d = yp1VarB;
        gc0Var.b = j3;
        gc0Var.a = yp1VarB;
        gc0Var.g = 0;
        gc0Var.h = null;
        gc0Var.o();
        d = d.f(j3);
        return objI;
    }

    public static final xs1 w(xs1 xs1Var, vs1 vs1Var, sp1 sp1Var) {
        xs1 xs1VarS;
        xs1 xs1VarS2;
        if (sp1Var.f()) {
            sp1Var.n(vs1Var);
        }
        long jG = sp1Var.g();
        xs1 xs1VarS3 = s(xs1Var, jG, sp1Var.d());
        if (xs1VarS3 == null) {
            synchronized (c) {
                sp1 sp1VarJ = j();
                xs1 xs1VarA = vs1Var.a();
                xs1VarA.getClass();
                xs1VarS2 = s(xs1VarA, sp1VarJ.g(), sp1VarJ.d());
                if (xs1VarS2 == null) {
                    r();
                    throw null;
                }
            }
            xs1VarS3 = xs1VarS2;
        }
        if (xs1VarS3.a == sp1Var.g()) {
            return xs1VarS3;
        }
        synchronized (c) {
            xs1VarS = s(vs1Var.a(), jG, sp1Var.d());
            if (xs1VarS == null) {
                r();
                throw null;
            }
            if (xs1VarS.a != jG) {
                xs1 xs1VarM = m(xs1VarS, vs1Var);
                xs1VarM.a(xs1VarS);
                xs1VarM.a = sp1Var.g();
                xs1VarS = xs1VarM;
            }
        }
        if (xs1VarS3.a != 1) {
            sp1Var.n(vs1Var);
        }
        return xs1VarS;
    }
}
