package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pq1 {
    public final sa0 a;
    public Object b;
    public ox0 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final zx0 e = qc1.g();
    public final zx0 f = new zx0();
    public final ay0 g = new ay0();
    public final iy0 h = new iy0(new qx[16]);
    public final nb0 i = new nb0(1, this);
    public final zx0 l = qc1.g();
    public final HashMap m = new HashMap();

    public pq1(sa0 sa0Var) {
        this.a = sa0Var;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq1.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, int i, Object obj2, ox0 ox0Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = ox0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = ox0Var.c[iC];
        }
        ox0Var.b[iC] = obj;
        ox0Var.c[iC] = i;
        if ((obj instanceof qx) && i2 != i) {
            px pxVarH = ((qx) obj).h();
            this.m.put(obj, pxVarH.f);
            ox0 ox0Var2 = pxVarH.e;
            zx0 zx0Var = this.l;
            qc1.w(zx0Var, obj);
            Object[] objArr = ox0Var2.b;
            long[] jArr = ox0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                vs1 vs1Var = (vs1) objArr[(i3 << 3) + i5];
                                if (vs1Var instanceof ws1) {
                                    ((ws1) vs1Var).f(2);
                                }
                                qc1.d(zx0Var, vs1Var, obj);
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
        }
        if (i2 == -1) {
            if (obj instanceof ws1) {
                ((ws1) obj).f(2);
            }
            qc1.d(this.e, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        Object obj;
        long j3;
        Object obj2;
        zx0 zx0Var = this.f;
        long[] jArr3 = zx0Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj3 = zx0Var.b[i6];
                        j2 = j5;
                        ox0 ox0Var = (ox0) zx0Var.c[i6];
                        obj3.getClass();
                        boolean z2 = ((x31) obj3).z();
                        if (!z2) {
                            Object[] objArr = ox0Var.b;
                            int[] iArr = ox0Var.c;
                            long[] jArr4 = ox0Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = z2;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj4 = objArr[i11];
                                                int i12 = iArr[i11];
                                                zx0 zx0Var2 = this.e;
                                                qc1.v(zx0Var2, obj4, obj3);
                                                obj2 = obj3;
                                                if ((obj4 instanceof qx) && !zx0Var2.c(obj4)) {
                                                    qc1.w(this.l, obj4);
                                                    this.m.remove(obj4);
                                                }
                                            } else {
                                                j3 = j6;
                                                obj2 = obj3;
                                            }
                                            j6 = j3 >> i7;
                                            i10++;
                                            obj3 = obj2;
                                        }
                                        obj = obj3;
                                        if (i9 != i7) {
                                            break;
                                        }
                                    } else {
                                        obj = obj3;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    z2 = z;
                                    jArr4 = jArr5;
                                    obj3 = obj;
                                    i7 = 8;
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                                z = z2;
                            }
                            if (!z) {
                                zx0Var.l(i6);
                            }
                            i = 8;
                        }
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
