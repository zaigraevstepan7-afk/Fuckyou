package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface uu0 {
    default int b(pi0 pi0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ew((pu0) list.get(i3), qi0.f, ui0.f, i2));
        }
        return g(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList, lr.b(0, i, 0, 0, 13)).d();
    }

    default int d(pi0 pi0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ew((pu0) list.get(i3), qi0.f, ui0.e, i2));
        }
        return g(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList, lr.b(0, 0, 0, i, 7)).g();
    }

    vu0 g(xu0 xu0Var, List list, long j);

    default int h(pi0 pi0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ew((pu0) list.get(i3), qi0.e, ui0.f, i2));
        }
        return g(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList, lr.b(0, i, 0, 0, 13)).d();
    }

    default int j(pi0 pi0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ew((pu0) list.get(i3), qi0.e, ui0.e, i2));
        }
        return g(new dj0(pi0Var, pi0Var.getLayoutDirection()), arrayList, lr.b(0, 0, 0, i, 7)).g();
    }
}
