package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 extends h01 {
    public final sv0 c;
    public final qn d;
    public final qs0 e;
    public c01 f;
    public e81 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public uz0(sv0 sv0Var) {
        this.c = sv0Var;
        qn qnVar = new qn();
        qnVar.b = new long[2];
        this.d = qnVar;
        this.e = new qs0(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031e  */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [sv0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [sv0] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // defpackage.h01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(qs0 qs0Var, zk0 zk0Var, xg0 xg0Var, boolean z) {
        qn qnVar;
        qs0 qs0Var2;
        Object obj;
        boolean z2;
        boolean z3;
        e81 e81Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        l81 l81Var;
        zk0 zk0Var2 = zk0Var;
        boolean zA = super.a(qs0Var, zk0Var, xg0Var, z);
        ?? K = this.c;
        boolean z6 = true;
        if (K.r) {
            ?? iy0Var = 0;
            while (K != 0) {
                if (K instanceof p81) {
                    this.f = bl.N((p81) K, 16);
                } else if ((K.g & 16) != 0 && (K instanceof yw)) {
                    sv0 sv0Var = ((yw) K).t;
                    int i6 = 0;
                    K = K;
                    iy0Var = iy0Var;
                    while (sv0Var != null) {
                        if ((sv0Var.g & 16) != 0) {
                            i6++;
                            iy0Var = iy0Var;
                            if (i6 == 1) {
                                K = sv0Var;
                            } else {
                                if (iy0Var == 0) {
                                    iy0Var = new iy0(new sv0[16]);
                                }
                                if (K != 0) {
                                    iy0Var.b(K);
                                    K = 0;
                                }
                                iy0Var.b(sv0Var);
                            }
                        }
                        sv0Var = sv0Var.j;
                        K = K;
                        iy0Var = iy0Var;
                    }
                    if (i6 == 1) {
                    }
                }
                K = bl.k(iy0Var);
            }
            if (this.f != null) {
                int iE = qs0Var.e();
                int i7 = 0;
                while (true) {
                    qnVar = this.d;
                    qs0Var2 = this.e;
                    if (i7 >= iE) {
                        break;
                    }
                    long jB = qs0Var.b(i7);
                    l81 l81Var2 = (l81) qs0Var.f(i7);
                    if (qnVar.b(jB)) {
                        boolean z7 = z6;
                        long j = l81Var2.g;
                        long j2 = l81Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            z4 = zA;
                            ArrayList arrayList = new ArrayList(l81Var2.b().size());
                            List listB = l81Var2.b();
                            i3 = iE;
                            int size = listB.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list = listB;
                                pd0 pd0Var = (pd0) listB.get(i8);
                                qs0 qs0Var3 = qs0Var2;
                                long j3 = jB;
                                long j4 = pd0Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    l81Var = l81Var2;
                                    long j5 = pd0Var.a;
                                    i5 = size;
                                    c01 c01Var = this.f;
                                    c01Var.getClass();
                                    arrayList.add(new pd0(j5, c01Var.D(zk0Var2, j4), pd0Var.c, pd0Var.d, pd0Var.e));
                                } else {
                                    i5 = size;
                                    l81Var = l81Var2;
                                }
                                i8++;
                                size = i5;
                                listB = list;
                                qs0Var2 = qs0Var3;
                                jB = j3;
                                l81Var2 = l81Var;
                            }
                            qs0 qs0Var4 = qs0Var2;
                            long j6 = jB;
                            c01 c01Var2 = this.f;
                            c01Var2.getClass();
                            long jD = c01Var2.D(zk0Var2, j);
                            c01 c01Var3 = this.f;
                            c01Var3.getClass();
                            l81 l81Var3 = new l81(l81Var2.a, l81Var2.b, c01Var3.D(zk0Var2, j2), l81Var2.d, l81Var2.e, l81Var2.f, jD, l81Var2.h, l81Var2.i, arrayList, l81Var2.j, l81Var2.k, l81Var2.l, l81Var2.n);
                            l81 l81Var4 = l81Var2.q;
                            if (l81Var4 == null) {
                                l81Var4 = l81Var2;
                            }
                            l81Var3.q = l81Var4;
                            l81 l81Var5 = l81Var2.q;
                            if (l81Var5 != null) {
                                l81Var2 = l81Var5;
                            }
                            l81Var3.q = l81Var2;
                            qs0Var4.c(j6, l81Var3);
                        } else {
                            z4 = zA;
                            i3 = iE;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = zA;
                        i3 = iE;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    zk0Var2 = zk0Var;
                    z6 = z5;
                    iE = i3;
                    zA = z4;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (qs0Var2.e() == 0) {
                    qnVar.a = 0;
                    this.a.g();
                    return z9;
                }
                int i9 = qnVar.a;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) qnVar.b)[i9];
                    if (qs0Var.e) {
                        int i10 = qs0Var.h;
                        long[] jArr = qs0Var.f;
                        Object[] objArr = qs0Var.g;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != pv.u) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        qs0Var.e = false;
                        qs0Var.h = i11;
                    }
                    if (wi0.s(qs0Var.f, qs0Var.h, j7) < 0 && i9 < (i2 = qnVar.a)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) qnVar.b;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        qnVar.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qs0Var2.e());
                int iE2 = qs0Var2.e();
                for (int i16 = 0; i16 < iE2; i16++) {
                    arrayList2.add(qs0Var2.f(i16));
                }
                e81 e81Var2 = new e81(arrayList2, xg0Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i17);
                    if (xg0Var.p(((l81) obj).a)) {
                        break;
                    }
                    i17++;
                }
                l81 l81Var6 = (l81) obj;
                if (l81Var6 != null) {
                    boolean z10 = l81Var6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || l81Var6.h)) {
                            c01 c01Var4 = this.f;
                            c01Var4.getClass();
                            long j8 = c01Var4.g;
                            long j9 = l81Var6.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i18) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = e81Var2.f) == 3 || i == 4 || i == 5)) {
                        int i19 = e81Var2.f;
                        if (i19 == 4 && z12 && !this.j) {
                            e81Var2.f = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            e81Var2.f = 3;
                        }
                    } else {
                        e81Var2.f = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || e81Var2.f != 3 || (e81Var = this.g) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = e81Var.a;
                int size3 = r1.size();
                ?? r4 = e81Var2.a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z2; r5 < size4; r5++) {
                        if (!w01.b(((l81) r1.get(r5)).c, ((l81) r4.get(r5)).c)) {
                            z3 = z9;
                            break;
                        }
                    }
                    z3 = z2;
                }
                this.g = e81Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.h01
    public final void b(xg0 xg0Var) {
        super.b(xg0Var);
        e81 e81Var = this.g;
        if (e81Var == null) {
            return;
        }
        this.h = this.i;
        List list = e81Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l81 l81Var = (l81) list.get(i);
            boolean z = l81Var.d;
            long j = l81Var.a;
            boolean zP = xg0Var.p(j);
            boolean z2 = this.i;
            if ((!z && !zP) || (!z && !z2)) {
                this.d.d(j);
            }
        }
        this.i = false;
        this.j = e81Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [iy0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [iy0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [sv0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [sv0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        iy0 iy0Var = this.a;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((uz0) objArr[i2]).c();
        }
        ?? K = this.c;
        ?? iy0Var2 = 0;
        while (K != 0) {
            if (K instanceof p81) {
                ((p81) K).h0();
            } else if ((K.g & 16) != 0 && (K instanceof yw)) {
                sv0 sv0Var = ((yw) K).t;
                int i3 = 0;
                iy0Var2 = iy0Var2;
                K = K;
                while (sv0Var != null) {
                    if ((sv0Var.g & 16) != 0) {
                        i3++;
                        iy0Var2 = iy0Var2;
                        if (i3 == 1) {
                            K = sv0Var;
                        } else {
                            if (iy0Var2 == 0) {
                                iy0Var2 = new iy0(new sv0[16]);
                            }
                            if (K != 0) {
                                iy0Var2.b(K);
                                K = 0;
                            }
                            iy0Var2.b(sv0Var);
                        }
                    }
                    sv0Var = sv0Var.j;
                    iy0Var2 = iy0Var2;
                    K = K;
                }
                if (i3 == 1) {
                }
            }
            K = bl.k(iy0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [sv0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [iy0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(xg0 xg0Var) {
        boolean z;
        ql0 ql0Var;
        qs0 qs0Var = this.e;
        if (qs0Var.e() == 0) {
            z = false;
        } else {
            sv0 sv0Var = this.c;
            if (sv0Var.r) {
                c01 c01Var = sv0Var.l;
                if ((c01Var == null || (ql0Var = c01Var.w) == null) ? false : ql0Var.K()) {
                    e81 e81Var = this.g;
                    e81Var.getClass();
                    c01 c01Var2 = this.f;
                    c01Var2.getClass();
                    long j = c01Var2.g;
                    ?? K = sv0Var;
                    ?? iy0Var = 0;
                    while (true) {
                        z = true;
                        if (K == 0) {
                            break;
                        }
                        if (K instanceof p81) {
                            ((p81) K).I(e81Var, f81.g, j);
                        } else if ((K.g & 16) != 0 && (K instanceof yw)) {
                            sv0 sv0Var2 = ((yw) K).t;
                            int i = 0;
                            K = K;
                            iy0Var = iy0Var;
                            while (sv0Var2 != null) {
                                if ((sv0Var2.g & 16) != 0) {
                                    i++;
                                    iy0Var = iy0Var;
                                    if (i == 1) {
                                        K = sv0Var2;
                                    } else {
                                        if (iy0Var == 0) {
                                            iy0Var = new iy0(new sv0[16]);
                                        }
                                        if (K != 0) {
                                            iy0Var.b(K);
                                            K = 0;
                                        }
                                        iy0Var.b(sv0Var2);
                                    }
                                }
                                sv0Var2 = sv0Var2.j;
                                K = K;
                                iy0Var = iy0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        K = bl.k(iy0Var);
                    }
                    if (sv0Var.r) {
                        iy0 iy0Var2 = this.a;
                        Object[] objArr = iy0Var2.e;
                        int i2 = iy0Var2.g;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((uz0) objArr[i3]).d(xg0Var);
                        }
                    }
                }
            }
        }
        b(xg0Var);
        int i4 = qs0Var.h;
        Object[] objArr2 = qs0Var.g;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        qs0Var.h = 0;
        qs0Var.e = false;
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [sv0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [iy0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [iy0] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [sv0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [sv0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [iy0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [iy0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(xg0 xg0Var, boolean z) {
        ql0 ql0Var;
        if (this.e.e() == 0) {
            return false;
        }
        ?? K = this.c;
        if (K.r) {
            c01 c01Var = K.l;
            if ((c01Var == null || (ql0Var = c01Var.w) == null) ? false : ql0Var.K()) {
                e81 e81Var = this.g;
                e81Var.getClass();
                c01 c01Var2 = this.f;
                c01Var2.getClass();
                long j = c01Var2.g;
                ?? K2 = K;
                ?? iy0Var = 0;
                while (K2 != 0) {
                    if (K2 instanceof p81) {
                        ((p81) K2).I(e81Var, f81.e, j);
                    } else if ((K2.g & 16) != 0 && (K2 instanceof yw)) {
                        sv0 sv0Var = ((yw) K2).t;
                        int i = 0;
                        K2 = K2;
                        iy0Var = iy0Var;
                        while (sv0Var != null) {
                            if ((sv0Var.g & 16) != 0) {
                                i++;
                                iy0Var = iy0Var;
                                if (i == 1) {
                                    K2 = sv0Var;
                                } else {
                                    if (iy0Var == 0) {
                                        iy0Var = new iy0(new sv0[16]);
                                    }
                                    if (K2 != 0) {
                                        iy0Var.b(K2);
                                        K2 = 0;
                                    }
                                    iy0Var.b(sv0Var);
                                }
                            }
                            sv0Var = sv0Var.j;
                            K2 = K2;
                            iy0Var = iy0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    K2 = bl.k(iy0Var);
                }
                if (K.r) {
                    iy0 iy0Var2 = this.a;
                    Object[] objArr = iy0Var2.e;
                    int i2 = iy0Var2.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        uz0 uz0Var = (uz0) objArr[i3];
                        this.f.getClass();
                        uz0Var.e(xg0Var, z);
                    }
                }
                if (K.r) {
                    ?? iy0Var3 = 0;
                    while (K != 0) {
                        if (K instanceof p81) {
                            ((p81) K).I(e81Var, f81.f, j);
                        } else if ((K.g & 16) != 0 && (K instanceof yw)) {
                            sv0 sv0Var2 = ((yw) K).t;
                            int i4 = 0;
                            K = K;
                            iy0Var3 = iy0Var3;
                            while (sv0Var2 != null) {
                                if ((sv0Var2.g & 16) != 0) {
                                    i4++;
                                    iy0Var3 = iy0Var3;
                                    if (i4 == 1) {
                                        K = sv0Var2;
                                    } else {
                                        if (iy0Var3 == 0) {
                                            iy0Var3 = new iy0(new sv0[16]);
                                        }
                                        if (K != 0) {
                                            iy0Var3.b(K);
                                            K = 0;
                                        }
                                        iy0Var3.b(sv0Var2);
                                    }
                                }
                                sv0Var2 = sv0Var2.j;
                                K = K;
                                iy0Var3 = iy0Var3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        K = bl.k(iy0Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, sx0 sx0Var) {
        qn qnVar = this.d;
        if (qnVar.b(j) && sx0Var.g(this) < 0) {
            qnVar.d(j);
            this.e.d(j);
        }
        iy0 iy0Var = this.a;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((uz0) objArr[i2]).f(j, sx0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
