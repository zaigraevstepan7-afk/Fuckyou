package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qx extends ws1 implements ns1 {
    public final ha0 f;
    public final hq1 g;
    public px h = new px(aq1.j().g());

    public qx(ha0 ha0Var, hq1 hq1Var) {
        this.f = ha0Var;
        this.g = hq1Var;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.h;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.getClass();
        this.h = (px) xs1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final px g(px pxVar, sp1 sp1Var, boolean z, ha0 ha0Var) {
        iy0 iy0VarR;
        px pxVar2;
        hq1 hq1Var;
        int i;
        if (pxVar.c(this, sp1Var)) {
            if (z) {
                iy0VarR = xc.r();
                Object[] objArr = iy0VarR.e;
                int i2 = iy0VarR.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((nb0) objArr[i3]).b();
                }
                try {
                    ox0 ox0Var = pxVar.e;
                    oc ocVar = iq1.a;
                    th0 th0Var = (th0) ocVar.h();
                    if (th0Var == null) {
                        th0Var = new th0();
                        ocVar.x(th0Var);
                    }
                    int i4 = th0Var.a;
                    Object[] objArr2 = ox0Var.b;
                    int[] iArr = ox0Var.c;
                    long[] jArr = ox0Var.a;
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
                                        int i9 = (i5 << 3) + i8;
                                        vs1 vs1Var = (vs1) objArr2[i9];
                                        i = i6;
                                        th0Var.a = i4 + iArr[i9];
                                        sa0 sa0VarE = sp1Var.e();
                                        if (sa0VarE != null) {
                                            sa0VarE.i(vs1Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    th0Var.a = i4;
                    Object[] objArr3 = iy0VarR.e;
                    int i10 = iy0VarR.g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((nb0) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return pxVar;
        }
        ox0 ox0Var2 = new ox0();
        oc ocVar2 = iq1.a;
        th0 th0Var2 = (th0) ocVar2.h();
        if (th0Var2 == null) {
            th0Var2 = new th0();
            ocVar2.x(th0Var2);
        }
        int i12 = th0Var2.a;
        iy0VarR = xc.r();
        Object[] objArr4 = iy0VarR.e;
        int i13 = iy0VarR.g;
        for (int i14 = 0; i14 < i13; i14++) {
            ((nb0) objArr4[i14]).b();
        }
        try {
            th0Var2.a = i12 + 1;
            Object objX = uc1.x(new ox(this, th0Var2, ox0Var2, i12, 0), ha0Var);
            th0Var2.a = i12;
            Object[] objArr5 = iy0VarR.e;
            int i15 = iy0VarR.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ((nb0) objArr5[i16]).a();
            }
            Object obj = aq1.c;
            synchronized (obj) {
                try {
                    sp1 sp1VarJ = aq1.j();
                    Object obj2 = pxVar.f;
                    if (obj2 == px.h || (hq1Var = this.g) == null || !hq1Var.c(objX, obj2)) {
                        px pxVar3 = this.h;
                        synchronized (obj) {
                            xs1 xs1VarM = aq1.m(pxVar3, this);
                            xs1VarM.a(pxVar3);
                            xs1VarM.a = sp1VarJ.g();
                            pxVar2 = (px) xs1VarM;
                            pxVar2.e = ox0Var2;
                            pxVar2.g = pxVar2.d(this, sp1VarJ);
                            pxVar2.f = objX;
                        }
                        return pxVar2;
                    }
                    pxVar.e = ox0Var2;
                    pxVar.g = pxVar.d(this, sp1VarJ);
                    pxVar2 = pxVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            th0 th0Var3 = (th0) iq1.a.h();
            if (th0Var3 == null || th0Var3.a != 0) {
                return pxVar2;
            }
            aq1.j().m();
            synchronized (obj) {
                sp1 sp1VarJ2 = aq1.j();
                pxVar2.c = sp1VarJ2.g();
                pxVar2.d = sp1VarJ2.h();
                return pxVar2;
            }
        } finally {
            Object[] objArr6 = iy0VarR.e;
            int i17 = iy0VarR.g;
            for (int i18 = 0; i18 < i17; i18++) {
                ((nb0) objArr6[i18]).a();
            }
        }
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        sa0 sa0VarE = aq1.j().e();
        if (sa0VarE != null) {
            sa0VarE.i(this);
        }
        sp1 sp1VarJ = aq1.j();
        return g((px) aq1.i(this.h, sp1VarJ), sp1VarJ, true, this.f).f;
    }

    public final px h() {
        sp1 sp1VarJ = aq1.j();
        return g((px) aq1.i(this.h, sp1VarJ), sp1VarJ, false, this.f);
    }

    public final String toString() {
        px pxVar = (px) aq1.h(this.h);
        return "DerivedState(value=" + (pxVar.c(this, aq1.j()) ? String.valueOf(pxVar.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
