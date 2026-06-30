package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u50 extends v50 {
    @Override // defpackage.v50
    public final v50 a(d81 d81Var) {
        aq0 aq0VarN = hk.n();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aq0VarN.add(((fu) list.get(i)).e(d81Var));
        }
        aq0 aq0VarK = hk.k(aq0VarN);
        aq0VarK.getClass();
        return new u50(aq0VarK);
    }

    public final String toString() {
        return "Edge";
    }
}
