package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t50 extends v50 {
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(List list, boolean z) {
        super(list);
        list.getClass();
        this.b = z;
    }

    @Override // defpackage.v50
    public final v50 a(d81 d81Var) {
        aq0 aq0VarN = hk.n();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aq0VarN.add(((fu) list.get(i)).e(d81Var));
        }
        return new t50(hk.k(aq0VarN), this.b);
    }

    public final String toString() {
        return "Corner: cubics=" + pl.h0(this.a, ", ", null, null, new mt(4), 30) + " convex=" + this.b;
    }
}
