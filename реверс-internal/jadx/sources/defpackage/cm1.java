package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class cm1 {
    public static final Comparator[] a;
    public static final xl1 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new bm1(1, new bm1(i == 0 ? x80.e : x80.c));
            i++;
        }
        a = comparatorArr;
        b = xl1.i;
    }

    public static final void a(rl1 rl1Var, ArrayList arrayList, g3 g3Var, g3 g3Var2, hx0 hx0Var) {
        nl1 nl1Var = rl1Var.d;
        Object objG = nl1Var.e.g(vl1.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) g3Var2.i(rl1Var)).booleanValue()) && ((Boolean) g3Var.i(rl1Var)).booleanValue()) {
            arrayList.add(rl1Var);
        }
        if (zBooleanValue) {
            hx0Var.i(rl1Var.f, b(rl1Var, g3Var, g3Var2, rl1.j(7, rl1Var)));
            return;
        }
        List listJ = rl1.j(7, rl1Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((rl1) listJ.get(i), arrayList, g3Var, g3Var2, hx0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(rl1 rl1Var, g3 g3Var, g3 g3Var2, List list) {
        int i;
        hx0 hx0Var = nh0.a;
        hx0 hx0Var2 = new hx0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((rl1) list.get(i2), arrayList, g3Var, g3Var2, hx0Var2);
        }
        int i3 = 1;
        char c = rl1Var.c.C == al0.f ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                rl1 rl1Var2 = (rl1) arrayList.get(i4);
                if (i4 != 0) {
                    float f = rl1Var2.h().b;
                    float f2 = rl1Var2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            pc1 pc1Var = (pc1) ((j41) arrayList2.get(i6)).e;
                            float f3 = pc1Var.b;
                            i = i3;
                            float f4 = pc1Var.d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new j41(new pc1(Math.max(pc1Var.a, 0.0f), Math.max(pc1Var.b, f), Math.min(pc1Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((j41) arrayList2.get(i6)).f));
                                ((List) ((j41) arrayList2.get(i6)).f).add(rl1Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                    } else {
                        i = i3;
                    }
                    arrayList2.add(new j41(rl1Var2.h(), hk.K(rl1Var2)));
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
            }
        } else {
            i = 1;
        }
        tl.Z(arrayList2, x80.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            j41 j41Var = (j41) arrayList2.get(i8);
            tl.Z((List) j41Var.f, comparator);
            arrayList3.addAll((Collection) j41Var.f);
        }
        int i9 = i;
        tl.Z(arrayList3, new kn(i9, b));
        int size5 = 0;
        while (size5 <= arrayList3.size() - i9) {
            List list2 = (List) hx0Var2.b(((rl1) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) g3Var2.i(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
