package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 {
    public final nl1 a;
    public final ix0 b;

    public sl1(rl1 rl1Var, mh0 mh0Var) {
        this.a = rl1Var.d;
        List listJ = rl1.j(4, rl1Var);
        this.b = new ix0(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            rl1 rl1Var2 = (rl1) listJ.get(i);
            if (mh0Var.a(rl1Var2.f)) {
                this.b.a(rl1Var2.f);
            }
        }
    }
}
