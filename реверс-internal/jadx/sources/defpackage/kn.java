package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kn implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (sa0 sa0Var : (sa0[]) obj3) {
                    int iS = el.s((Comparable) sa0Var.i(obj), (Comparable) sa0Var.i(obj2));
                    if (iS != 0) {
                        return iS;
                    }
                }
                return 0;
            default:
                return ((Number) ((wa0) obj3).h(obj, obj2)).intValue();
        }
    }
}
