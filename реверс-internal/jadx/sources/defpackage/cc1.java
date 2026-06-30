package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc1 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cc1(z52 z52Var, z61 z61Var, int i) {
        this.e = 2;
        this.g = z52Var;
        this.h = z61Var;
        this.f = i;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        np npVar;
        t32 t32Var;
        np npVar2;
        t32 t32Var2;
        int i;
        int i2 = this.e;
        t32 t32Var3 = t32.a;
        int i3 = 0;
        int i4 = this.f;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                dc1 dc1Var = (dc1) obj3;
                ox0 ox0Var = (ox0) obj2;
                np npVar3 = (np) obj;
                if (dc1Var.e == i4 && xi0.o(ox0Var, dc1Var.f) && (npVar3 instanceof tp)) {
                    long[] jArr = ox0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = ox0Var.b[i9];
                                        boolean z = ox0Var.c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            tp tpVar = (tp) npVar3;
                                            npVar2 = npVar3;
                                            zx0 zx0Var = tpVar.k;
                                            qc1.v(zx0Var, obj4, dc1Var);
                                            t32Var2 = t32Var3;
                                            if (obj4 instanceof qx) {
                                                qx qxVar = (qx) obj4;
                                                if (!zx0Var.c(qxVar)) {
                                                    qc1.w(tpVar.n, qxVar);
                                                }
                                                zx0 zx0Var2 = dc1Var.g;
                                                if (zx0Var2 != null) {
                                                    zx0Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            npVar2 = npVar3;
                                            t32Var2 = t32Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            ox0Var.f(i9);
                                        }
                                    } else {
                                        npVar2 = npVar3;
                                        t32Var2 = t32Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    npVar3 = npVar2;
                                    t32Var3 = t32Var2;
                                }
                                npVar = npVar3;
                                t32Var = t32Var3;
                                if (i7 != i6) {
                                }
                            } else {
                                npVar = npVar3;
                                t32Var = t32Var3;
                            }
                            if (i5 != length) {
                                i5++;
                                npVar3 = npVar;
                                t32Var3 = t32Var;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            case 1:
                dj1 dj1Var = (dj1) obj3;
                z61 z61Var = (z61) obj2;
                y61 y61Var = (y61) obj;
                int iG = dj1Var.s.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                if (iG <= i4) {
                    i4 = iG;
                }
                int i10 = -i4;
                boolean z2 = dj1Var.t;
                int i11 = z2 ? 0 : i10;
                int i12 = z2 ? i10 : 0;
                y61Var.e = true;
                y61.k(y61Var, z61Var, i11, i12, null, 12);
                y61Var.e = false;
                break;
            default:
                z52 z52Var = (z52) obj3;
                z61 z61Var2 = (z61) obj2;
                y61 y61Var2 = (y61) obj;
                int i13 = z52Var.b;
                ky1 ky1Var = z52Var.a;
                v12 v12Var = z52Var.c;
                qz1 qz1Var = (qz1) z52Var.d.a();
                ky1Var.a(k31.e, ef1.b(y61Var2, i13, v12Var, qz1Var != null ? qz1Var.a : null, false, z61Var2.e), i4, z61Var2.f);
                y61.j(y61Var2, z61Var2, 0, Math.round(-ky1Var.a.g()));
                break;
        }
        return t32Var3;
    }

    public /* synthetic */ cc1(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }
}
