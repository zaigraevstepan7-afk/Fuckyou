package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements tw0 {
    public final vt a;
    public final wa b;
    public h9 c;
    public Integer d;

    public jk1(vt vtVar, wa waVar) {
        this.a = vtVar;
        this.b = waVar;
    }

    @Override // defpackage.tw0
    public final vu0 a(xu0 xu0Var, ArrayList arrayList, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        List list = (List) arrayList.get(0);
        int i = 1;
        List list2 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((pu0) list.get(i2)).e(j));
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i3 = ((z61) obj).e;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int i5 = ((z61) obj4).e;
                    if (i3 < i5) {
                        obj = obj4;
                        i3 = i5;
                    }
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        z61 z61Var = (z61) obj;
        int i6 = z61Var != null ? z61Var.e : 0;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            arrayList3.add(((pu0) list2.get(i7)).e(j));
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i8 = ((z61) obj2).e;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i9 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i9);
                    int i10 = ((z61) obj5).e;
                    if (i8 < i10) {
                        obj2 = obj5;
                        i8 = i10;
                    }
                    if (i9 == size4) {
                        break;
                    }
                    i9++;
                }
            }
        }
        z61 z61Var2 = (z61) obj2;
        Integer numValueOf = z61Var2 != null ? Integer.valueOf(z61Var2.e) : null;
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i11 = ((z61) obj3).f;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i12 = ((z61) obj6).f;
                    if (i11 < i12) {
                        obj3 = obj6;
                        i11 = i12;
                    }
                    if (i == size5) {
                        break;
                    }
                    i++;
                }
            }
        }
        z61 z61Var3 = (z61) obj3;
        int i13 = z61Var3 != null ? z61Var3.f : 0;
        float f = lk1.c;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + xu0Var.N(8.0f) + Math.max(xu0Var.N(f), i6);
        int i14 = i6 == 0 ? (-(xu0Var.N(8.0f) + xu0Var.N(f))) / 2 : 0;
        Integer num = this.d;
        if (num == null) {
            this.d = Integer.valueOf(i14);
        } else {
            h9 h9Var = this.c;
            if (h9Var == null) {
                h9Var = new h9(num, c2.Q, null, 12);
                this.c = h9Var;
            }
            if (((Number) h9Var.e.getValue()).intValue() != i14) {
                nu0.A(this.a, null, null, new ik1(h9Var, i14, this, null), 3);
            }
        }
        return xu0Var.f0(iIntValue, i13, g40.e, new hk1(arrayList2, this, i14, arrayList3, i13));
    }
}
