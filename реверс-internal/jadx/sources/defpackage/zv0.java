package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zv0 {
    public final ArrayList a;

    public zv0(pg1 pg1Var, pg1 pg1Var2) throws Throwable {
        float f;
        Throwable th;
        float f2;
        List listH;
        Iterator it;
        float f3;
        int i;
        int i2;
        float fV;
        int i3;
        j41 j41VarA;
        j41 j41VarA2;
        float fE;
        zu0 zu0VarQ = bk.Q(new wr(19), pg1Var);
        zu0 zu0VarQ2 = bk.Q(new wr(19), pg1Var2);
        List list = zu0VarQ.g;
        List list2 = zu0VarQ2.g;
        List list3 = w50.a;
        list.getClass();
        list2.getClass();
        aq0 aq0VarN = hk.n();
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (((jb1) list.get(i5)).b instanceof t50) {
                aq0VarN.add(list.get(i5));
            }
        }
        aq0 aq0VarK = hk.k(aq0VarN);
        aq0 aq0VarN2 = hk.n();
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (((jb1) list2.get(i6)).b instanceof t50) {
                aq0VarN2.add(list2.get(i6));
            }
        }
        aq0 aq0VarK2 = hk.k(aq0VarN2);
        aq0VarK.getClass();
        aq0VarK2.getClass();
        aq0 aq0VarN3 = hk.n();
        ListIterator listIterator = aq0VarK.listIterator(0);
        while (true) {
            rd0 rd0Var = (rd0) listIterator;
            if (!rd0Var.hasNext()) {
                break;
            }
            jb1 jb1Var = (jb1) rd0Var.next();
            ListIterator listIterator2 = aq0VarK2.listIterator(0);
            while (true) {
                rd0 rd0Var2 = (rd0) listIterator2;
                if (rd0Var2.hasNext()) {
                    jb1 jb1Var2 = (jb1) rd0Var2.next();
                    v50 v50Var = jb1Var.b;
                    v50 v50Var2 = jb1Var2.b;
                    v50Var.getClass();
                    v50Var2.getClass();
                    if ((v50Var instanceof t50) && (v50Var2 instanceof t50) && ((t50) v50Var).b != ((t50) v50Var2).b) {
                        fE = Float.MAX_VALUE;
                    } else {
                        long jI = hk.I(w50.a(v50Var), w50.a(v50Var2));
                        fE = (hk.E(jI) * hk.E(jI)) + (hk.D(jI) * hk.D(jI));
                    }
                    if (fE != Float.MAX_VALUE) {
                        aq0VarN3.add(new ez(fE, jb1Var, jb1Var2));
                    }
                }
            }
        }
        List listM0 = pl.m0(hk.k(aq0VarN3), new x80(10));
        float f4 = 1.0f;
        int i7 = 1;
        if (listM0.isEmpty()) {
            listH = w50.a;
        } else {
            if (listM0.size() != 1) {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = listM0.iterator();
                while (it2.hasNext()) {
                    ez ezVar = (ez) it2.next();
                    jb1 jb1Var3 = ezVar.b;
                    jb1 jb1Var4 = ezVar.c;
                    float f5 = jb1Var3.a;
                    float f6 = jb1Var4.a;
                    if (linkedHashSet.contains(jb1Var3) || linkedHashSet2.contains(jb1Var4)) {
                        it = it2;
                        f3 = f4;
                    } else {
                        Float fValueOf = Float.valueOf(f5);
                        int size3 = arrayList.size();
                        f3 = f4;
                        hk.O(arrayList.size(), size3);
                        int i8 = size3 - i7;
                        int i9 = i4;
                        while (true) {
                            if (i9 > i8) {
                                i = i7;
                                i2 = -(i9 + 1);
                                break;
                            }
                            i2 = (i9 + i8) >>> 1;
                            i = i7;
                            int iS = el.s((Float) ((j41) arrayList.get(i2)).e, fValueOf);
                            if (iS < 0) {
                                i9 = i2 + 1;
                            } else if (iS <= 0) {
                                break;
                            } else {
                                i8 = i2 - 1;
                            }
                            i7 = i;
                        }
                        if (i2 >= 0) {
                            yc.p("There can't be two features with the same progress");
                            throw null;
                        }
                        int i10 = (-i2) - 1;
                        int size4 = arrayList.size();
                        int i11 = i;
                        if (size4 >= i11) {
                            j41 j41Var = (j41) arrayList.get(((i10 + size4) - i11) % size4);
                            float fFloatValue = ((Number) j41Var.e).floatValue();
                            float fFloatValue2 = ((Number) j41Var.f).floatValue();
                            j41 j41Var2 = (j41) arrayList.get(i10 % size4);
                            it = it2;
                            float fFloatValue3 = ((Number) j41Var2.e).floatValue();
                            float fFloatValue4 = ((Number) j41Var2.f).floatValue();
                            if (lk.c0(f5, fFloatValue) >= 1.0E-4f && lk.c0(f5, fFloatValue3) >= 1.0E-4f && lk.c0(f6, fFloatValue2) >= 1.0E-4f && lk.c0(f6, fFloatValue4) >= 1.0E-4f) {
                                if (size4 > 1) {
                                    if (fFloatValue4 >= fFloatValue2) {
                                        if (fFloatValue2 > f6 || f6 > fFloatValue4) {
                                        }
                                    } else if (f6 >= fFloatValue2 || f6 <= fFloatValue4) {
                                    }
                                }
                            }
                        } else {
                            it = it2;
                        }
                        arrayList.add(i10, new j41(Float.valueOf(f5), Float.valueOf(f6)));
                        linkedHashSet.add(jb1Var3);
                        linkedHashSet2.add(jb1Var4);
                    }
                    f4 = f3;
                    it2 = it;
                    i4 = 0;
                    i7 = 1;
                }
                f = f4;
                th = null;
                f2 = 1.0E-4f;
                listH = arrayList;
                j41[] j41VarArr = (j41[]) listH.toArray(new j41[0]);
                jz jzVar = new jz((j41[]) Arrays.copyOf(j41VarArr, j41VarArr.length));
                ex0 ex0Var = jzVar.a;
                ex0 ex0Var2 = jzVar.b;
                fV = lk.V(ex0Var, ex0Var2, 0.0f);
                ArrayList arrayList2 = zu0VarQ2.f;
                if (0.0f <= fV || fV > f) {
                    yc.p("Cutting point is expected to be between 0 and 1");
                    throw th;
                }
                if (fV < f2) {
                    i3 = 1;
                } else {
                    int size5 = arrayList2.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size5) {
                            i12 = -1;
                            break;
                        }
                        Object obj = arrayList2.get(i13);
                        i13++;
                        yu0 yu0Var = (yu0) obj;
                        float f7 = yu0Var.c;
                        if (fV <= yu0Var.d && f7 <= fV) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j41 j41VarA3 = ((yu0) arrayList2.get(i12)).a(fV);
                    yu0 yu0Var2 = (yu0) j41VarA3.e;
                    ArrayList arrayListK = hk.K(((yu0) j41VarA3.f).a);
                    int size6 = arrayList2.size();
                    for (int i14 = 1; i14 < size6; i14++) {
                        arrayListK.add(((yu0) arrayList2.get((i14 + i12) % arrayList2.size())).a);
                    }
                    arrayListK.add(yu0Var2.a);
                    ex0 ex0Var3 = new ex0(arrayList2.size() + 2);
                    int size7 = arrayList2.size() + 2;
                    int i15 = 0;
                    while (i15 < size7) {
                        ex0Var3.a(i15 == 0 ? 0.0f : i15 == arrayList2.size() + 1 ? f : q42.c(((yu0) arrayList2.get(((i12 + i15) - 1) % arrayList2.size())).d - fV));
                        i15++;
                    }
                    i3 = 1;
                    aq0 aq0VarN4 = hk.n();
                    int size8 = list2.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        aq0VarN4.add(new jb1(q42.c(((jb1) list2.get(i16)).a - fV), ((jb1) list2.get(i16)).b));
                    }
                    zu0VarQ2 = new zu0(zu0VarQ2.e, hk.k(aq0VarN4), arrayListK, ex0Var3);
                }
                ArrayList arrayList3 = new ArrayList();
                yu0 yu0Var3 = (yu0) pl.e0(0, zu0VarQ);
                yu0 yu0Var4 = (yu0) pl.e0(0, zu0VarQ2);
                int i17 = i3;
                int i18 = i17;
                while (yu0Var3 != null && yu0Var4 != null) {
                    float f8 = i18 == zu0VarQ.f.size() ? f : yu0Var3.d;
                    float fV2 = i17 == zu0VarQ2.f.size() ? f : lk.V(ex0Var2, ex0Var, q42.c(yu0Var4.d + fV));
                    float fMin = Math.min(f8, fV2);
                    float f9 = 1.0E-6f + fMin;
                    if (f8 > f9) {
                        j41VarA = yu0Var3.a(fMin);
                    } else {
                        j41 j41Var3 = new j41(yu0Var3, pl.e0(i18, zu0VarQ));
                        i18++;
                        j41VarA = j41Var3;
                    }
                    yu0 yu0Var5 = (yu0) j41VarA.e;
                    yu0Var3 = (yu0) j41VarA.f;
                    if (fV2 > f9) {
                        j41VarA2 = yu0Var4.a(q42.c(lk.V(ex0Var, ex0Var2, fMin) - fV));
                    } else {
                        j41 j41Var4 = new j41(yu0Var4, pl.e0(i17, zu0VarQ2));
                        i17++;
                        j41VarA2 = j41Var4;
                    }
                    yu0 yu0Var6 = (yu0) j41VarA2.e;
                    yu0Var4 = (yu0) j41VarA2.f;
                    arrayList3.add(new j41(yu0Var5.a, yu0Var6.a));
                }
                if (yu0Var3 == null && yu0Var4 == null) {
                    this.a = arrayList3;
                    return;
                } else {
                    yc.p("Expected both Polygon's Cubic to be fully matched");
                    throw th;
                }
            }
            ez ezVar2 = (ez) pl.c0(listM0);
            float f10 = ezVar2.b.a;
            float f11 = ezVar2.c.a;
            listH = hk.H(new j41(Float.valueOf(f10), Float.valueOf(f11)), new j41(Float.valueOf((f10 + 0.5f) % 1.0f), Float.valueOf((f11 + 0.5f) % 1.0f)));
        }
        f = 1.0f;
        th = null;
        f2 = 1.0E-4f;
        j41[] j41VarArr2 = (j41[]) listH.toArray(new j41[0]);
        jz jzVar2 = new jz((j41[]) Arrays.copyOf(j41VarArr2, j41VarArr2.length));
        ex0 ex0Var4 = jzVar2.a;
        ex0 ex0Var22 = jzVar2.b;
        fV = lk.V(ex0Var4, ex0Var22, 0.0f);
        ArrayList arrayList22 = zu0VarQ2.f;
        if (0.0f <= fV) {
        }
        yc.p("Cutting point is expected to be between 0 and 1");
        throw th;
    }
}
