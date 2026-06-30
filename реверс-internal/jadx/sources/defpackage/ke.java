package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ke(ob0 ob0Var, kj kjVar, ip1 ip1Var, sw0 sw0Var) {
        this.e = 3;
        this.f = ob0Var;
        this.g = kjVar;
        this.h = ip1Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i;
        vr vrVar;
        pc1 pc1Var;
        int i2;
        int i3;
        List listG;
        int i4 = this.e;
        t32 t32Var = t32.a;
        int i5 = 1;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i4) {
            case 0:
                ((le) obj3).a();
                xd xdVar = (xd) ((me) obj2).c;
                int i6 = ((xc1) obj).e;
                do {
                    i = xdVar.get();
                } while (!xdVar.compareAndSet(i, ((i >>> 27) & 15) == i6 ? i - 1 : i));
                return t32Var;
            case 1:
                dh dhVar = (dh) obj3;
                pc1 pc1VarL0 = dh.L0(dhVar, (c01) obj2, (y3) obj);
                if (pc1VarL0 == null) {
                    return null;
                }
                vr vrVar2 = dhVar.s;
                if (vh0.a(vrVar2.y, -1L)) {
                    qg0.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return pc1VarL0.i(vrVar2.P0(pc1VarL0, vrVar2.M0(), 0L) ^ (-9223372034707292160L));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                vr vrVar3 = (vr) obj3;
                k42 k42Var = (k42) obj2;
                gh ghVar = (gh) obj;
                wg wgVar = vrVar3.w;
                while (true) {
                    iy0 iy0Var = wgVar.a;
                    int i7 = iy0Var.g;
                    if (i7 != 0) {
                        if (i7 == 0) {
                            yc.h("MutableVector is empty.");
                            return null;
                        }
                        pc1 pc1Var2 = (pc1) ((sr) iy0Var.e[i7 - 1]).a.a();
                        if (pc1Var2 == null ? true : vr.N0(vrVar3, pc1Var2, 0L, 0L, 3)) {
                            ((sr) wgVar.a.k(r5.g - 1)).b.g(t32Var);
                        }
                    }
                }
                if (!vrVar3.x || (pc1Var = (pc1) vrVar3.v.a()) == null) {
                    vrVar = vrVar3;
                } else {
                    vrVar = vrVar3;
                    if (vr.N0(vrVar, pc1Var, 0L, 0L, 3)) {
                        vrVar.x = false;
                    }
                }
                k42Var.e = vr.L0(vrVar, ghVar, 0L);
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ob0 ob0Var = (ob0) obj3;
                kj kjVar = (kj) obj2;
                ip1 ip1Var = (ip1) obj;
                lp lpVar = ob0Var.M;
                kj kjVar2 = lpVar.b;
                try {
                    lpVar.b = kjVar;
                    ip1 ip1Var2 = ob0Var.G;
                    int[] iArr = ob0Var.o;
                    hx0 hx0Var = ob0Var.v;
                    ob0Var.o = null;
                    ob0Var.v = null;
                    try {
                        ob0Var.G = ip1Var;
                        boolean z = lpVar.e;
                        try {
                            lpVar.e = false;
                            throw null;
                        } catch (Throwable th) {
                            lpVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ob0Var.G = ip1Var2;
                        ob0Var.o = iArr;
                        ob0Var.v = hx0Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    lpVar.b = kjVar2;
                    throw th3;
                }
            case t91.LONG_FIELD_NUMBER /* 4 */:
                un0 un0Var = (un0) obj2;
                jm0 jm0Var = (jm0) obj;
                jn0 jn0Var = (jn0) ((qx) obj3).getValue();
                rh0 rh0Var = (rh0) ((wm0) un0Var.e.e).getValue();
                g6 g6Var = new g6();
                g6 g6Var2 = jn0Var.a;
                int i8 = rh0Var.e;
                if (i8 < 0) {
                    qg0.c("negative nearestRange.first");
                }
                int iMin = Math.min(rh0Var.f, g6Var2.a - 1);
                if (iMin < i8) {
                    ox0 ox0Var = r01.a;
                    ox0Var.getClass();
                    g6Var.b = ox0Var;
                    g6Var.c = new Object[0];
                    g6Var.a = 0;
                } else {
                    int i9 = (iMin - i8) + 1;
                    g6Var.c = new Object[i9];
                    g6Var.a = i8;
                    ox0 ox0Var2 = new ox0(i9);
                    iy0 iy0Var2 = (iy0) g6Var2.b;
                    if (i8 < 0 || i8 >= g6Var2.a) {
                        qg0.e("Index " + i8 + ", size " + g6Var2.a);
                    }
                    if (iMin < 0 || iMin >= g6Var2.a) {
                        qg0.e("Index " + iMin + ", size " + g6Var2.a);
                    }
                    if (iMin < i8) {
                        qg0.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i8 + ")");
                    }
                    int iC = al.c(i8, iy0Var2);
                    int i10 = ((mi0) iy0Var2.e[iC]).a;
                    while (i10 <= iMin) {
                        mi0 mi0Var = (mi0) iy0Var2.e[iC];
                        cr crVar = (cr) mi0Var.c.a;
                        int i11 = mi0Var.a;
                        int iMax = Math.max(i8, i11);
                        int iMin2 = Math.min(iMin, (mi0Var.b + i11) - i5);
                        if (iMax <= iMin2) {
                            while (true) {
                                i3 = i5;
                                Object objI = crVar.i(Integer.valueOf(iMax - i11));
                                if (objI == null) {
                                    objI = new gw(iMax);
                                }
                                ox0Var2.g(iMax, objI);
                                i2 = iMin;
                                ((Object[]) g6Var.c)[iMax - g6Var.a] = objI;
                                if (iMax != iMin2) {
                                    iMax++;
                                    iMin = i2;
                                    i5 = i3;
                                }
                            }
                        } else {
                            i2 = iMin;
                            i3 = i5;
                        }
                        i10 += mi0Var.b;
                        iC++;
                        iMin = i2;
                        i5 = i3;
                    }
                    g6Var.b = ox0Var2;
                }
                return new kn0(un0Var, jn0Var, jm0Var, g6Var);
            default:
                jb0 jb0Var = (jb0) obj3;
                mp1 mp1Var = (mp1) obj2;
                e31 e31Var = (e31) obj;
                if (jb0Var != null) {
                    mp1Var.a(mp1Var.c(jb0Var) - mp1Var.t);
                }
                List listL = al.l(mp1Var, null, mp1Var.t, null);
                cp cpVar = (cp) pl.j0(listL);
                Integer num = cpVar != null ? cpVar.b : null;
                List listD = e31Var.d(num);
                if (num != null && !listD.isEmpty()) {
                    cp cpVar2 = (cp) pl.c0(listD);
                    int size = listD.size() - 1;
                    if (size <= 0) {
                        listG = f40.e;
                    } else if (size == 1) {
                        listG = hk.G(pl.i0(listD));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (listD instanceof RandomAccess) {
                            int size2 = listD.size();
                            while (i5 < size2) {
                                arrayList.add(listD.get(i5));
                                i5++;
                            }
                        } else {
                            ListIterator listIterator = listD.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        listG = arrayList;
                    }
                    listD = pl.l0(hk.G(new cp(cpVar2.a, null, num)), listG);
                }
                return new ap(pl.l0(listL, listD), e31Var.g());
        }
    }

    public /* synthetic */ ke(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
