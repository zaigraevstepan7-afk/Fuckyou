package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class ey0 extends sp1 {
    public static final int[] n = new int[0];
    public final sa0 e;
    public final sa0 f;
    public int g;
    public ay0 h;
    public ArrayList i;
    public yp1 j;
    public int[] k;
    public int l;
    public boolean m;

    public ey0(long j, yp1 yp1Var, sa0 sa0Var, sa0 sa0Var2) {
        super(j, yp1Var);
        this.e = sa0Var;
        this.f = sa0Var2;
        this.j = yp1.i;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (aq1.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(ay0 ay0Var) {
        this.h = ay0Var;
    }

    public ey0 C(sa0 sa0Var, sa0 sa0Var2) {
        gz0 gz0Var;
        if (this.c) {
            e91.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            e91.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = aq1.c;
        synchronized (obj) {
            long j = aq1.e;
            aq1.e = j + 1;
            aq1.d = aq1.d.f(j);
            yp1 yp1VarD = d();
            r(yp1VarD.f(j));
            gz0Var = new gz0(j, aq1.d(yp1VarD, g() + 1, j), aq1.k(sa0Var, e(), true), aq1.l(sa0Var2, i()), this);
        }
        if (this.m || this.c) {
            return gz0Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = aq1.e;
            aq1.e = j2 + 1;
            s(j2);
            aq1.d = aq1.d.f(g());
        }
        r(aq1.d(d(), jG + 1, g()));
        return gz0Var;
    }

    @Override // defpackage.sp1
    public final void b() {
        aq1.d = aq1.d.b(g()).a(this.j);
    }

    @Override // defpackage.sp1
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (aq1.c) {
            o();
        }
        l();
    }

    @Override // defpackage.sp1
    public boolean f() {
        return false;
    }

    @Override // defpackage.sp1
    public int h() {
        return this.g;
    }

    @Override // defpackage.sp1
    public sa0 i() {
        return this.f;
    }

    @Override // defpackage.sp1
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.sp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        if (this.l <= 0) {
            e91.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        ay0 ay0VarX = x();
        if (ay0VarX != null) {
            if (this.m) {
                e91.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = ay0VarX.b;
            long[] jArr = ay0VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (xs1 xs1VarA = ((vs1) objArr[(i2 << 3) + i4]).a(); xs1VarA != null; xs1VarA = xs1VarA.b) {
                                    long j2 = xs1VarA.a;
                                    if (j2 == jG || pl.b0(this.j, Long.valueOf(j2))) {
                                        fi1 fi1Var = aq1.a;
                                        xs1VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.sp1
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.sp1
    public void n(vs1 vs1Var) {
        ay0 ay0VarX = x();
        if (ay0VarX == null) {
            ay0 ay0Var = qi1.a;
            ay0VarX = new ay0();
            B(ay0VarX);
        }
        ay0VarX.a(vs1Var);
    }

    @Override // defpackage.sp1
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            aq1.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.sp1
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.sp1
    public sp1 u(sa0 sa0Var) {
        hz0 hz0Var;
        if (this.c) {
            e91.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            e91.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = aq1.c;
        synchronized (obj) {
            long j = aq1.e;
            aq1.e = j + 1;
            aq1.d = aq1.d.f(j);
            hz0Var = new hz0(j, aq1.d(d(), jG + 1, j), aq1.k(sa0Var, e(), true), this);
        }
        if (this.m || this.c) {
            return hz0Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = aq1.e;
            aq1.e = j2 + 1;
            s(j2);
            aq1.d = aq1.d.f(g());
        }
        r(aq1.d(d(), jG2 + 1, g()));
        return hz0Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (aq1.c) {
            long j = aq1.e;
            aq1.e = j + 1;
            s(j);
            aq1.d = aq1.d.f(g());
        }
        r(aq1.d(d(), jG + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kd1 w() {
        HashMap mapB;
        List list;
        ay0 ay0Var;
        long j;
        long j2;
        ay0 ay0VarX = x();
        if (ay0VarX != null) {
            long j3 = aq1.j.b;
            mapB = aq1.b(j3, this, aq1.d.b(j3));
        } else {
            mapB = null;
        }
        f40 f40Var = f40.e;
        synchronized (aq1.c) {
            try {
                aq1.c(this);
                if (ay0VarX == null || ay0VarX.d == 0) {
                    b();
                    gc0 gc0Var = aq1.j;
                    ay0 ay0Var2 = gc0Var.h;
                    aq1.v(gc0Var, aq1.a);
                    if (ay0Var2 == null || !ay0Var2.h()) {
                        list = f40Var;
                        ay0Var = null;
                    } else {
                        list = aq1.h;
                        ay0Var = ay0Var2;
                    }
                } else {
                    gc0 gc0Var2 = aq1.j;
                    kd1 kd1VarZ = z(aq1.e, ay0VarX, mapB, aq1.d.b(gc0Var2.b));
                    if (!kd1VarZ.equals(vp1.c)) {
                        return kd1VarZ;
                    }
                    b();
                    ay0Var = gc0Var2.h;
                    aq1.v(gc0Var2, aq1.a);
                    B(null);
                    gc0Var2.h = null;
                    list = aq1.h;
                }
                this.m = true;
                if (ay0Var != null) {
                    ri1 ri1Var = new ri1(ay0Var);
                    if (!ay0Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((wa0) list.get(i)).h(ri1Var, this);
                        }
                    }
                }
                if (ay0VarX != null && ay0VarX.h()) {
                    ri1 ri1Var2 = new ri1(ay0VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((wa0) list.get(i2)).h(ri1Var2, this);
                    }
                }
                synchronized (aq1.c) {
                    try {
                        p();
                        aq1.f();
                        if (ay0Var != null) {
                            Object[] objArr = ay0Var.b;
                            long[] jArr = ay0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                aq1.q((vs1) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        }
                        if (ay0VarX != null) {
                            Object[] objArr2 = ay0VarX.b;
                            long[] jArr2 = ay0VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                aq1.q((vs1) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                aq1.q((vs1) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return vp1.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ay0 x() {
        return this.h;
    }

    @Override // defpackage.sp1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public sa0 e() {
        return this.e;
    }

    public final kd1 z(long j, ay0 ay0Var, HashMap map, yp1 yp1Var) {
        ArrayList arrayList;
        ArrayList arrayListL0;
        ArrayList arrayList2;
        yp1 yp1Var2;
        Object[] objArr;
        long[] jArr;
        yp1 yp1Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        xs1 xs1VarB;
        yp1 yp1VarE = d().f(g()).e(this.j);
        Object[] objArr3 = ay0Var.b;
        long[] jArr3 = ay0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListL0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            vs1 vs1Var = (vs1) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            xs1 xs1VarA = vs1Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            xs1 xs1VarS = aq1.s(xs1VarA, j, yp1Var);
                            if (xs1VarS == null) {
                                arrayList3 = arrayListL0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListL0;
                                j2 = j3;
                                xs1 xs1VarS2 = aq1.s(xs1VarA, g(), yp1VarE);
                                if (xs1VarS2 != null && xs1VarS2.a != 1 && !xs1VarS.equals(xs1VarS2)) {
                                    yp1Var3 = yp1VarE;
                                    xs1 xs1VarS3 = aq1.s(xs1VarA, g(), d());
                                    if (xs1VarS3 == null) {
                                        aq1.r();
                                        throw null;
                                    }
                                    if (map == null || (xs1VarB = (xs1) map.get(xs1VarS)) == null) {
                                        xs1VarB = vs1Var.b(xs1VarS2, xs1VarS, xs1VarS3);
                                    }
                                    if (xs1VarB == null) {
                                        return new up1(this);
                                    }
                                    if (!xs1VarB.equals(xs1VarS3)) {
                                        if (xs1VarB.equals(xs1VarS)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new j41(vs1Var, xs1VarS.b(g())));
                                            arrayListL0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListL0.add(vs1Var);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!xs1VarB.equals(xs1VarS2) ? new j41(vs1Var, xs1VarB) : new j41(vs1Var, xs1VarS2.b(g())));
                                        }
                                    }
                                    arrayListL0 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListL0 = arrayList3;
                            }
                            yp1Var3 = yp1VarE;
                            arrayList2 = arrayList4;
                            arrayListL0 = arrayList3;
                        } else {
                            yp1Var3 = yp1VarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        yp1VarE = yp1Var3;
                    }
                    yp1Var2 = yp1VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    yp1Var2 = yp1VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                yp1VarE = yp1Var2;
            }
        } else {
            arrayList = null;
            arrayListL0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                j41 j41Var = (j41) arrayList2.get(i5);
                vs1 vs1Var2 = (vs1) j41Var.e;
                xs1 xs1Var = (xs1) j41Var.f;
                xs1Var.a = j;
                synchronized (aq1.c) {
                    xs1Var.b = vs1Var2.a();
                    vs1Var2.c(xs1Var);
                }
            }
        }
        if (arrayListL0 != null) {
            int size2 = arrayListL0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ay0Var.l((vs1) arrayListL0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListL0 = pl.l0(arrayList6, arrayListL0);
            }
            this.i = arrayListL0;
        }
        return vp1.c;
    }
}
