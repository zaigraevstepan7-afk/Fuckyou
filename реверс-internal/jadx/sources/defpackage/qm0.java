package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qm0 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public qm0(int i) {
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.a = xc.B(bool);
                this.b = new r41(1.0f);
                this.c = xc.B(bool);
                this.d = new r41(1.0f);
                this.e = xc.B(bool);
                this.f = xc.B(new u12(u12.b));
                this.g = xc.B(bool);
                this.h = xc.B(new vl(vl.f));
                break;
            default:
                long[] jArr = pi1.a;
                this.a = new zx0();
                ay0 ay0Var = qi1.a;
                this.c = new ay0();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                break;
        }
    }

    public static int e(int[] iArr, qn0 qn0Var) {
        qn0Var.getClass();
        int i = qn0Var.l + qn0Var.m + iArr[0];
        iArr[0] = i;
        return Math.max(0, i);
    }

    public long a() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        s91.t(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(int i, int i2, ArrayList arrayList, g6 g6Var, nn0 nn0Var, boolean z, boolean z2, int i3, int i4) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        Throwable th;
        zx0 zx0Var;
        int i5;
        qm0 qm0Var;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        ArrayList arrayList4 = (ArrayList) this.e;
        ArrayList arrayList5 = (ArrayList) this.d;
        ay0 ay0Var = (ay0) this.c;
        Object obj = this.a;
        zx0 zx0Var2 = (zx0) obj;
        ArrayList arrayList6 = (ArrayList) this.g;
        ArrayList arrayList7 = (ArrayList) this.f;
        g6 g6Var2 = (g6) this.b;
        this.b = g6Var;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            qn0 qn0Var = (qn0) arrayList.get(i9);
            Object obj2 = obj;
            int i10 = size;
            int i11 = 0;
            for (int size2 = qn0Var.b.size(); i11 < size2; size2 = size2) {
                ((z61) qn0Var.b.get(i11)).i();
                i11++;
            }
            i9++;
            size = i10;
            obj = obj2;
        }
        Object obj3 = obj;
        if (zx0Var2.i()) {
            c();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr3 = zx0Var2.b;
        long[] jArr = zx0Var2.a;
        int i12 = 2;
        int length = jArr.length - 2;
        boolean z4 = z3;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j = jArr[i13];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j & 255) < 128) {
                            i8 = i15;
                            ay0Var.a(objArr3[(i13 << 3) + i15]);
                        } else {
                            i8 = i15;
                        }
                        j >>= 8;
                        i15 = i8 + 1;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i16 = 0; i16 < size3; i16++) {
            qn0 qn0Var2 = (qn0) arrayList.get(i16);
            Object obj4 = qn0Var2.g;
            List list = qn0Var2.b;
            ay0Var.l(obj4);
            int size4 = list.size();
            for (int i17 = 0; i17 < size4; i17++) {
                ((z61) list.get(i17)).i();
            }
            s91.t(((zx0) obj3).k(qn0Var2.g));
        }
        int[] iArr = new int[1];
        if (z4 && g6Var2 != null) {
            if (arrayList5.isEmpty()) {
                i7 = 0;
            } else {
                if (arrayList5.size() > 1) {
                    tl.Z(arrayList5, new pm0(g6Var2, i12));
                }
                if (arrayList5.size() > 0) {
                    qn0 qn0Var3 = (qn0) arrayList5.get(0);
                    e(iArr, qn0Var3);
                    Object objG = zx0Var2.g(qn0Var3.g);
                    objG.getClass();
                    s91.t(objG);
                    qn0Var3.b(0);
                    throw null;
                }
                i7 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    tl.Z(arrayList4, new pm0(g6Var2, i7));
                }
                if (arrayList4.size() > 0) {
                    qn0 qn0Var4 = (qn0) arrayList4.get(i7);
                    e(iArr, qn0Var4);
                    Object objG2 = zx0Var2.g(qn0Var4.g);
                    objG2.getClass();
                    s91.t(objG2);
                    qn0Var4.b(i7);
                    throw null;
                }
                Arrays.fill(iArr, i7, 1, i7);
            }
        }
        Object[] objArr4 = ay0Var.b;
        long[] jArr2 = ay0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            th = null;
            zx0Var = zx0Var2;
            int i18 = 0;
            while (true) {
                long j2 = jArr2[i18];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j2 & 255) < 128) {
                            objArr2 = objArr4;
                            s91.t(zx0Var.g(objArr2[(i18 << 3) + i20]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j2 >>= 8;
                        i20++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i19 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
                objArr4 = objArr;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
            th = null;
            zx0Var = zx0Var2;
        }
        if (arrayList7.isEmpty()) {
            i5 = 1;
            qm0Var = this;
            i6 = i;
        } else {
            if (arrayList7.size() > 1) {
                tl.Z(arrayList7, new pm0(g6Var, 3));
            }
            int size5 = arrayList7.size();
            for (int i21 = 0; i21 < size5; i21++) {
                qn0 qn0Var5 = (qn0) arrayList7.get(i21);
                Object objG3 = zx0Var.g(qn0Var5.g);
                objG3.getClass();
                s91.t(objG3);
                qn0Var5.d((z ? (int) (((qn0) pl.c0(arrayList)).b(0) & 4294967295L) : 0) - e(iArr, qn0Var5), i, i2);
                if (z4) {
                    d(qn0Var5, true);
                    throw th;
                }
            }
            qm0Var = this;
            i6 = i;
            i5 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i5) {
                tl.Z(arrayList6, new pm0(g6Var, i5));
            }
            int size6 = arrayList6.size();
            for (int i22 = 0; i22 < size6; i22++) {
                qn0 qn0Var6 = (qn0) arrayList6.get(i22);
                Object objG4 = zx0Var.g(qn0Var6.g);
                objG4.getClass();
                s91.t(objG4);
                qn0Var6.d((0 - (qn0Var6.l + qn0Var6.m)) + e(iArr, qn0Var6), i6, i2);
                if (z4) {
                    qm0Var.d(qn0Var6, true);
                    throw th;
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList6);
        arrayList3.clear();
        arrayList2.clear();
        arrayList7.clear();
        arrayList6.clear();
        ay0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        zx0 zx0Var = (zx0) this.a;
        if (zx0Var.j()) {
            Object[] objArr = zx0Var.c;
            long[] jArr = zx0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                s91.t(objArr[(i << 3) + i3]);
                                throw null;
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
            zx0Var.a();
        }
    }

    public void d(qn0 qn0Var, boolean z) {
        Object objG = ((zx0) this.a).g(qn0Var.g);
        objG.getClass();
        s91.t(objG);
        throw null;
    }
}
