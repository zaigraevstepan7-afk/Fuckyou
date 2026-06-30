package defpackage;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bm1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public bm1(Comparator comparator) {
        this.a = 0;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return ql0.U.compare(((rl1) obj).c, ((rl1) obj2).c);
            case 1:
                int iCompare2 = ((bm1) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : el.s(Integer.valueOf(((rl1) obj).f), Integer.valueOf(((rl1) obj2).f));
            default:
                cw1 cw1Var = (cw1) obj3;
                return el.s((Comparable) ((HashMap) cw1Var.e()).get((ld0) obj), (Comparable) ((HashMap) cw1Var.e()).get((ld0) obj2));
        }
    }

    public /* synthetic */ bm1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
