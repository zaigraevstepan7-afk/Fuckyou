package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r21 extends d31 {
    public static final r21 c = new r21(0, 1, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        dc1 dc1Var = (dc1) llVar.e(0);
        Set set = hd1Var.a;
        if (set == null) {
            return;
        }
        w51 w51Var = new w51(set);
        zx0 zx0Var = hd1Var.i;
        if (zx0Var == null) {
            long[] jArr = pi1.a;
            zx0Var = new zx0();
            hd1Var.i = zx0Var;
        }
        zx0Var.m(dc1Var, w51Var);
        hd1Var.e.b(new sb0(w51Var, -1));
    }
}
