package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tp implements np {
    public int A;
    public final op e;
    public final k32 f;
    public final AtomicReference g = new AtomicReference(null);
    public final Object h = new Object();
    public final cy0 i;
    public final jp1 j;
    public final zx0 k;
    public final ay0 l;
    public final ay0 m;
    public final zx0 n;
    public final kj o;
    public final kj p;
    public final zx0 q;
    public zx0 r;
    public boolean s;
    public yn1 t;
    public v51 u;
    public tp v;
    public int w;
    public final qt0 x;
    public final hd1 y;
    public final ob0 z;

    public tp(op opVar, k32 k32Var) {
        this.e = opVar;
        this.f = k32Var;
        cy0 cy0Var = new cy0(new ay0());
        this.i = cy0Var;
        jp1 jp1Var = new jp1();
        if (opVar.d()) {
            jp1Var.o = new hx0();
        }
        if (opVar.f()) {
            jp1Var.b();
        }
        this.j = jp1Var;
        this.k = qc1.g();
        this.l = new ay0();
        this.m = new ay0();
        this.n = qc1.g();
        kj kjVar = new kj();
        this.o = kjVar;
        kj kjVar2 = new kj();
        this.p = kjVar2;
        this.q = qc1.g();
        this.r = qc1.g();
        qt0 qt0Var = new qt0(12, opVar);
        this.x = qt0Var;
        this.y = new hd1();
        ob0 ob0Var = new ob0(k32Var, opVar, lp1.d(jp1Var), cy0Var, kjVar, kjVar2, qt0Var, this);
        opVar.p(ob0Var);
        this.z = ob0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(Object obj) {
        synchronized (this.h) {
            try {
                u(obj);
                Object objG = this.n.g(obj);
                if (objG != null) {
                    if (objG instanceof ay0) {
                        ay0 ay0Var = (ay0) objG;
                        Object[] objArr = ay0Var.b;
                        long[] jArr = ay0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((qx) objArr[(i << 3) + i3]);
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
                    } else {
                        u((qx) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(wa0 wa0Var) {
        boolean zI = i();
        q();
        op opVar = this.e;
        if (!zI) {
            opVar.a(this, wa0Var);
            return;
        }
        ob0 ob0Var = this.z;
        ob0Var.z = 0;
        ob0Var.y = true;
        opVar.a(this, wa0Var);
        if (ob0Var.F || ob0Var.z != 0) {
            e91.a("Cannot disable reuse from root if it was caused by other groups");
        }
        ob0Var.z = -1;
        ob0Var.y = false;
    }

    public final void a() {
        this.g.set(null);
        this.o.b.Y();
        this.p.b.Y();
        cy0 cy0Var = this.i;
        if (cy0Var.e.g()) {
            return;
        }
        hd1 hd1Var = this.y;
        try {
            hd1Var.g(cy0Var, this.z.y());
            hd1Var.b();
        } finally {
            hd1Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.k.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof ay0;
        ij0 ij0Var = ij0.e;
        ay0 ay0Var = this.l;
        ay0 ay0Var2 = this.m;
        zx0 zx0Var = this.q;
        if (!z2) {
            dc1 dc1Var = (dc1) objG;
            if (qc1.v(zx0Var, obj, dc1Var) || dc1Var.b(obj) == ij0Var) {
                return;
            }
            if (dc1Var.g == null || z) {
                ay0Var.a(dc1Var);
                return;
            } else {
                ay0Var2.a(dc1Var);
                return;
            }
        }
        ay0 ay0Var3 = (ay0) objG;
        Object[] objArr = ay0Var3.b;
        long[] jArr = ay0Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        dc1 dc1Var2 = (dc1) objArr[(i << 3) + i3];
                        if (!qc1.v(zx0Var, obj, dc1Var2) && dc1Var2.b(obj) != ij0Var) {
                            if (dc1Var2.g == null || z) {
                                ay0Var.a(dc1Var2);
                            } else {
                                ay0Var2.a(dc1Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z2 = set instanceof ri1;
        zx0 zx0Var = this.n;
        Object obj = null;
        int i4 = 8;
        if (z2) {
            ay0 ay0Var = ((ri1) set).e;
            Object[] objArr = ay0Var.b;
            long[] jArr10 = ay0Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof dc1) {
                                    ((dc1) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = zx0Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof ay0) {
                                            ay0 ay0Var2 = (ay0) objG;
                                            Object[] objArr2 = ay0Var2.b;
                                            long[] jArr11 = ay0Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                b((qx) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            b((qx) objG, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof dc1) {
                    ((dc1) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = zx0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof ay0) {
                            ay0 ay0Var3 = (ay0) objG2;
                            Object[] objArr3 = ay0Var3.b;
                            long[] jArr13 = ay0Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((qx) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((qx) objG2, z);
                        }
                    }
                }
            }
        }
        zx0 zx0Var2 = this.k;
        ay0 ay0Var4 = this.l;
        if (z) {
            ay0 ay0Var5 = this.m;
            if (ay0Var5.h()) {
                long[] jArr14 = zx0Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = zx0Var2.b[i18];
                                    Object obj5 = zx0Var2.c[i18];
                                    if (obj5 instanceof ay0) {
                                        ay0 ay0Var6 = (ay0) obj5;
                                        Object[] objArr4 = ay0Var6.b;
                                        long[] jArr15 = ay0Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            dc1 dc1Var = (dc1) objArr5[i22];
                                                            if (ay0Var5.c(dc1Var) || ay0Var4.c(dc1Var)) {
                                                                ay0Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        zG = ay0Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        dc1 dc1Var2 = (dc1) obj5;
                                        zG = ay0Var5.c(dc1Var2) || ay0Var4.c(dc1Var2);
                                    }
                                    if (zG) {
                                        zx0Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                ay0Var5.b();
                h();
                return;
            }
        }
        if (ay0Var4.h()) {
            long[] jArr17 = zx0Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = zx0Var2.b[i26];
                                Object obj7 = zx0Var2.c[i26];
                                if (obj7 instanceof ay0) {
                                    ay0 ay0Var7 = (ay0) obj7;
                                    Object[] objArr6 = ay0Var7.b;
                                    long[] jArr18 = ay0Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (ay0Var4.c((dc1) objArr7[i30])) {
                                                            ay0Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    zC = ay0Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = ay0Var4.c((dc1) obj7);
                                }
                                if (zC) {
                                    zx0Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            h();
            ay0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.h) {
            try {
                e(this.o);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        hd1 hd1Var = this.y;
                        try {
                            hd1Var.g(this.i, this.z.y());
                            hd1Var.b();
                            hd1Var.a();
                        } catch (Throwable th2) {
                            hd1Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(kj kjVar) throws Throwable {
        vc vcVar;
        hd1 hd1Var;
        hd1 hd1Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        hd1 hd1Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        kj kjVar2 = this.p;
        ob0 ob0Var = this.z;
        rp rpVarY = ob0Var.y();
        hd1 hd1Var4 = this.y;
        hd1Var4.g(this.i, rpVarY);
        try {
            if (kjVar.b.a0()) {
                try {
                    if (kjVar2.b.a0() && this.u == null) {
                        hd1Var4.b();
                    }
                    return;
                } finally {
                }
            }
            v51 v51Var = this.u;
            if (v51Var == null || (vcVar = v51Var.l) == null) {
                vcVar = this.f;
            }
            try {
                Trace.beginSection(vcVar.equals(v51Var != null ? v51Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    v51 v51Var2 = this.u;
                    if (v51Var2 == null || (hd1Var = v51Var2.k) == null) {
                        hd1Var = hd1Var4;
                    }
                    jp1 jp1Var = this.j;
                    rp rpVarY2 = ob0Var.y();
                    mp1 mp1VarE = lp1.d(jp1Var).e();
                    int i3 = 0;
                    try {
                        kjVar.t0(vcVar, mp1VarE, hd1Var, rpVarY2);
                        mp1VarE.e(true);
                        vcVar.g();
                        Trace.endSection();
                        hd1Var4.c();
                        hd1Var4.d();
                        if (this.s) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.s = false;
                                zx0 zx0Var = this.k;
                                long[] jArr3 = zx0Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = zx0Var.b[i8];
                                                    Object obj2 = zx0Var.c[i8];
                                                    if (obj2 instanceof ay0) {
                                                        ay0 ay0Var = (ay0) obj2;
                                                        Object[] objArr = ay0Var.b;
                                                        long[] jArr4 = ay0Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        hd1Var3 = hd1Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((dc1) objArr[i13]).a()) {
                                                                                    ay0Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 == length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = ay0Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        hd1Var3 = hd1Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((dc1) obj2).a();
                                                    }
                                                    if (zG) {
                                                        zx0Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    hd1Var3 = hd1Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                hd1Var4 = hd1Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            hd1Var2 = hd1Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            hd1Var2 = hd1Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        hd1Var4 = hd1Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    hd1Var2 = hd1Var4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            hd1Var2 = hd1Var4;
                        }
                        try {
                            if (kjVar2.b.a0() && this.u == null) {
                                hd1Var2.b();
                            }
                            return;
                        } finally {
                            hd1Var2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            mp1VarE.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (kjVar2.b.a0() && this.u == null) {
                hd1Var4.b();
            }
            throw th;
        } finally {
        }
    }

    public final void f() {
        synchronized (this.h) {
            try {
                kj kjVar = this.p;
                kjVar.getClass();
                if (!kjVar.b.a0()) {
                    e(this.p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        hd1 hd1Var = this.y;
                        try {
                            hd1Var.g(this.i, this.z.y());
                            hd1Var.b();
                            hd1Var.a();
                        } catch (Throwable th2) {
                            hd1Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        hd1 hd1Var;
        synchronized (this.h) {
            try {
                this.z.v = null;
                if (!this.i.e.g()) {
                    hd1Var = this.y;
                    try {
                        hd1Var.g(this.i, this.z.y());
                        hd1Var.b();
                        hd1Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.e.g()) {
                        hd1Var = this.y;
                        try {
                            hd1Var.g(this.i, this.z.y());
                            hd1Var.b();
                            hd1Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        zx0 zx0Var = this.n;
        long[] jArr3 = zx0Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = zx0Var.b[i10];
                            Object obj2 = zx0Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof ay0;
                            j5 = j8;
                            zx0 zx0Var2 = this.k;
                            if (z) {
                                ay0 ay0Var = (ay0) obj2;
                                Object[] objArr = ay0Var.b;
                                long[] jArr4 = ay0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!zx0Var2.c((qx) objArr[i15])) {
                                                        ay0Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = ay0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !zx0Var2.c((qx) obj2);
                            }
                            if (zG) {
                                zx0Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        ay0 ay0Var2 = this.m;
        if (!ay0Var2.h()) {
            return;
        }
        Object[] objArr2 = ay0Var2.b;
        long[] jArr5 = ay0Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((dc1) objArr2[i20]).g == null) {
                            ay0Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.h) {
            z = true;
            if (this.A != 1) {
                z = false;
            }
            if (z) {
                this.A = 0;
            }
        }
        return z;
    }

    public final void j(wa0 wa0Var) {
        try {
            synchronized (this.h) {
                n();
                zx0 zx0Var = this.r;
                this.r = qc1.g();
                try {
                    ob0 ob0Var = this.z;
                    yn1 yn1Var = this.t;
                    if (!ob0Var.e.b.a0()) {
                        mp.a("Expected applyChanges() to have been called");
                    }
                    ob0Var.P = yn1Var;
                    try {
                        ob0Var.n(zx0Var, wa0Var);
                    } finally {
                        ob0Var.P = null;
                    }
                } catch (Throwable th) {
                    this.r = zx0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.i.e.g()) {
                    hd1 hd1Var = this.y;
                    try {
                        hd1Var.g(this.i, this.z.y());
                        hd1Var.b();
                        hd1Var.a();
                    } catch (Throwable th3) {
                        hd1Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final v51 k(boolean z, wa0 wa0Var) {
        if (this.u != null) {
            e91.b("A pausable composition is in progress");
        }
        v51 v51Var = new v51(this, this.e, this.z, this.i, wa0Var, z, this.f, this.h);
        this.u = v51Var;
        return v51Var;
    }

    public final void l() {
        synchronized (this.h) {
            try {
                if (this.u != null) {
                    e91.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.j.f == 0;
                if (!z || !this.i.e.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        hd1 hd1Var = this.y;
                        try {
                            hd1Var.g(this.i, this.z.y());
                            if (!z) {
                                jp1 jp1Var = this.j;
                                hd1 hd1Var2 = this.y;
                                mp1 mp1VarE = jp1Var.e();
                                try {
                                    mp1VarE.n(mp1VarE.t, new fi(6, hd1Var2, mp1VarE));
                                    mp1VarE.e(true);
                                    this.f.g();
                                    hd1Var.c();
                                } catch (Throwable th) {
                                    mp1VarE.e(false);
                                    throw th;
                                }
                            }
                            hd1Var.b();
                            hd1Var.a();
                        } catch (Throwable th2) {
                            hd1Var.a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.k.a();
                this.n.a();
                this.r.a();
                this.o.b.Y();
                this.p.b.Y();
                ob0 ob0Var = this.z;
                ob0Var.E.clear();
                ob0Var.s.clear();
                ob0Var.e.b.Y();
                ob0Var.v = null;
                this.A = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        synchronized (this.h) {
            try {
                if (this.z.F) {
                    e91.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.A != 3) {
                    this.A = 3;
                    kj kjVar = this.z.L;
                    if (kjVar != null) {
                        e(kjVar);
                    }
                    boolean z = this.j.f == 0;
                    if (!z || !this.i.e.g()) {
                        hd1 hd1Var = this.y;
                        try {
                            hd1Var.g(this.i, this.z.y());
                            if (!z) {
                                jp1 jp1Var = this.j;
                                hd1 hd1Var2 = this.y;
                                mp1 mp1VarE = jp1Var.e();
                                try {
                                    mp1VarE.n(mp1VarE.t, new ud(4, hd1Var2));
                                    mp1VarE.H();
                                    mp1VarE.e(true);
                                    this.f.a();
                                    this.f.g();
                                    hd1Var.c();
                                } catch (Throwable th) {
                                    mp1VarE.e(false);
                                    throw th;
                                }
                            }
                            hd1Var.b();
                            hd1Var.a();
                        } catch (Throwable th2) {
                            hd1Var.a();
                            throw th2;
                        }
                    }
                    ob0 ob0Var = this.z;
                    ob0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        ob0Var.b.u(ob0Var);
                        ob0Var.E.clear();
                        ob0Var.s.clear();
                        ob0Var.e.b.Y();
                        ob0Var.v = null;
                        ob0Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.e.v(this);
    }

    public final void n() {
        Object obj = c2.j;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                mp.b("pending composition has not been applied");
                yc.j();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                mp.b("corrupt pendingModifications drain: " + atomicReference);
                yc.j();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(null);
        if (xi0.o(andSet, c2.j)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.u == null) {
                mp.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            mp.b("corrupt pendingModifications drain: " + atomicReference);
            yc.j();
        }
    }

    public final void p() {
        j40 j40Var = j40.e;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(j40Var);
        if (xi0.o(andSet, c2.j) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            mp.b("corrupt pendingModifications drain: " + atomicReference);
            yc.j();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i = this.A;
        if (i != 0) {
            e91.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.u == null) {
            return;
        }
        e91.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        cy0 cy0Var = this.i;
        ob0 ob0Var = this.z;
        if (arrayList.size() > 0) {
            ((sw0) ((j41) arrayList.get(0)).e).getClass();
            mp.a("Check failed");
        }
        try {
            ob0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    ob0Var.A(arrayList);
                    ob0Var.i();
                } catch (Throwable th) {
                    ob0Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!cy0Var.e.g()) {
                    hd1 hd1Var = this.y;
                    try {
                        hd1Var.g(cy0Var, ob0Var.y());
                        hd1Var.b();
                        hd1Var.a();
                    } catch (Throwable th3) {
                        hd1Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final ij0 s(dc1 dc1Var, Object obj) {
        tp tpVar;
        int i = dc1Var.b;
        if ((i & 2) != 0) {
            dc1Var.b = i | 4;
        }
        jb0 jb0Var = dc1Var.c;
        if (jb0Var == null || !jb0Var.a()) {
            return ij0.e;
        }
        jp1 jp1Var = this.j;
        jp1Var.getClass();
        jb0 jb0Var2 = dc1Var.c;
        if (jb0Var2 != null && jp1Var.f(bk.l(jb0Var2))) {
            if (dc1Var.d == null) {
                return ij0.e;
            }
            ij0 ij0VarT = t(dc1Var, jb0Var, obj);
            if (ij0VarT != ij0.e) {
                this.x.l();
            }
            return ij0VarT;
        }
        synchronized (this.h) {
            tpVar = this.v;
        }
        if (tpVar != null) {
            ob0 ob0Var = tpVar.z;
            if (ob0Var.F && ob0Var.b0(dc1Var, obj)) {
                return ij0.h;
            }
        }
        return ij0.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ij0 t(dc1 dc1Var, jb0 jb0Var, Object obj) {
        synchronized (this.h) {
            try {
                tp tpVar = this.v;
                tp tpVar2 = null;
                if (tpVar != null) {
                    jp1 jp1Var = this.j;
                    int i = this.w;
                    if (jp1Var.k) {
                        mp.a("Writer is active");
                    }
                    if (i < 0 || i >= jp1Var.f) {
                        mp.a("Invalid group index");
                    }
                    jb0 jb0VarL = bk.l(jb0Var);
                    if (jp1Var.f(jb0VarL)) {
                        int i2 = jp1Var.e[(i * 5) + 3] + i;
                        int i3 = jb0VarL.a;
                        if (i > i3 || i3 >= i2) {
                            tpVar = null;
                        }
                        tpVar2 = tpVar;
                    }
                }
                if (tpVar2 == null) {
                    ob0 ob0Var = this.z;
                    if (ob0Var.F && ob0Var.b0(dc1Var, obj)) {
                        return ij0.h;
                    }
                    if (obj == null) {
                        this.r.m(dc1Var, l91.i);
                    } else {
                        boolean z = obj instanceof qx;
                        zx0 zx0Var = this.r;
                        if (z) {
                            Object objG = zx0Var.g(dc1Var);
                            if (objG == null) {
                                qc1.d(this.r, dc1Var, obj);
                            } else if (objG instanceof ay0) {
                                ay0 ay0Var = (ay0) objG;
                                Object[] objArr = ay0Var.b;
                                long[] jArr = ay0Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == l91.i) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                            }
                                            if (i5 != 8) {
                                                break;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    qc1.d(this.r, dc1Var, obj);
                                }
                            } else if (objG == l91.i) {
                            }
                        } else {
                            zx0Var.m(dc1Var, l91.i);
                        }
                    }
                }
                if (tpVar2 != null) {
                    return tpVar2.t(dc1Var, jb0Var, obj);
                }
                this.e.l(this);
                return this.z.F ? ij0.g : ij0.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.k.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof ay0;
        ij0 ij0Var = ij0.h;
        zx0 zx0Var = this.q;
        if (!z) {
            dc1 dc1Var = (dc1) objG;
            if (dc1Var.b(obj) == ij0Var) {
                qc1.d(zx0Var, obj, dc1Var);
                return;
            }
            return;
        }
        ay0 ay0Var = (ay0) objG;
        Object[] objArr = ay0Var.b;
        long[] jArr = ay0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        dc1 dc1Var2 = (dc1) objArr[(i << 3) + i3];
                        if (dc1Var2.b(obj) == ij0Var) {
                            qc1.d(zx0Var, obj, dc1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean v() {
        return this.A == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(Set set) {
        boolean z = set instanceof ri1;
        zx0 zx0Var = this.n;
        zx0 zx0Var2 = this.k;
        if (z) {
            ay0 ay0Var = ((ri1) set).e;
            Object[] objArr = ay0Var.b;
            long[] jArr = ay0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (zx0Var2.c(obj) || zx0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else {
            for (Object obj2 : set) {
                if (zx0Var2.c(obj2) || zx0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.h) {
            v51 v51Var = this.u;
            boolean z = false;
            if (v51Var != null && (v51Var.h.get() != x51.i || v51Var.i != xc.q())) {
                AtomicReference atomicReference = v51Var.h;
                x51 x51Var = x51.j;
                x51 x51Var2 = x51.h;
                while (!atomicReference.compareAndSet(x51Var, x51Var2) && atomicReference.get() == x51Var) {
                }
                v51Var.l.e.a(9);
                return false;
            }
            n();
            try {
                zx0 zx0Var = this.r;
                this.r = qc1.g();
                try {
                    ob0 ob0Var = this.z;
                    yn1 yn1Var = this.t;
                    f31 f31Var = ob0Var.e.b;
                    if (!f31Var.a0()) {
                        mp.a("Expected applyChanges() to have been called");
                    }
                    if (zx0Var.e > 0 || !ob0Var.s.isEmpty()) {
                        ob0Var.P = yn1Var;
                        try {
                            ob0Var.n(zx0Var, null);
                            ob0Var.P = null;
                            z = !f31Var.a0();
                        } catch (Throwable th) {
                            ob0Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.r = zx0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.i.e.g()) {
                        hd1 hd1Var = this.y;
                        try {
                            hd1Var.g(this.i, this.z.y());
                            hd1Var.b();
                            hd1Var.a();
                        } catch (Throwable th4) {
                            hd1Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(ri1 ri1Var) {
        Object obj;
        while (true) {
            Object obj2 = this.g.get();
            if (obj2 == null || obj2.equals(c2.j)) {
                obj = ri1Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, ri1Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.g).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = ri1Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.g;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.h) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Object obj) {
        dc1 dc1VarW;
        int i;
        boolean z;
        int i2;
        ob0 ob0Var = this.z;
        if (ob0Var.A <= 0 && (dc1VarW = ob0Var.w()) != null) {
            int i3 = dc1VarW.b | 1;
            dc1VarW.b = i3;
            if ((i3 & 32) == 0) {
                ox0 ox0Var = dc1VarW.f;
                if (ox0Var == null) {
                    ox0Var = new ox0();
                    dc1VarW.f = ox0Var;
                }
                int i4 = dc1VarW.e;
                int iC = ox0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = ox0Var.c[iC];
                }
                ox0Var.b[iC] = obj;
                ox0Var.c[iC] = i4;
                z = i == dc1VarW.e;
            }
            this.x.l();
            if (z) {
                return;
            }
            if (obj instanceof ws1) {
                ((ws1) obj).f(1);
            }
            qc1.d(this.k, obj, dc1VarW);
            if (obj instanceof qx) {
                qx qxVar = (qx) obj;
                px pxVarH = qxVar.h();
                zx0 zx0Var = this.n;
                qc1.w(zx0Var, obj);
                ox0 ox0Var2 = pxVarH.e;
                Object[] objArr = ox0Var2.b;
                long[] jArr = ox0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    vs1 vs1Var = (vs1) objArr[(i5 << 3) + i8];
                                    i2 = i6;
                                    if (vs1Var instanceof ws1) {
                                        ((ws1) vs1Var).f(1);
                                    }
                                    qc1.d(zx0Var, vs1Var, obj);
                                } else {
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                Object obj2 = pxVarH.f;
                zx0 zx0Var2 = dc1VarW.g;
                if (zx0Var2 == null) {
                    zx0Var2 = new zx0();
                    dc1VarW.g = zx0Var2;
                }
                zx0Var2.m(qxVar, obj2);
            }
        }
    }
}
