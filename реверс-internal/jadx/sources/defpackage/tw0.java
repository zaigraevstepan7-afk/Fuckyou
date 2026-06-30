package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface tw0 {
    vu0 a(xu0 xu0Var, ArrayList arrayList, long j);

    default int b(pi0 pi0Var, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ew((pu0) list.get(i3), qi0.f, ui0.e, 0));
            }
            arrayList2.add(arrayList3);
        }
        return a(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList2, lr.b(0, 0, 0, i, 7)).g();
    }

    default int c(pi0 pi0Var, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ew((pu0) list.get(i3), qi0.e, ui0.e, 0));
            }
            arrayList2.add(arrayList3);
        }
        return a(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList2, lr.b(0, 0, 0, i, 7)).g();
    }

    default int d(pi0 pi0Var, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ew((pu0) list.get(i3), qi0.e, ui0.f, 0));
            }
            arrayList2.add(arrayList3);
        }
        return a(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList2, lr.b(0, i, 0, 0, 13)).d();
    }

    default int e(pi0 pi0Var, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ew((pu0) list.get(i3), qi0.f, ui0.f, 0));
            }
            arrayList2.add(arrayList3);
        }
        return a(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList2, lr.b(0, i, 0, 0, 13)).d();
    }
}
