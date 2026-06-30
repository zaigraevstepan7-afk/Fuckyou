package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i21 extends d31 {
    public static final i21 c = new i21(0, 1, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        iy0 iy0Var;
        dc1 dc1Var = (dc1) llVar.e(0);
        zx0 zx0Var = hd1Var.i;
        if (zx0Var == null || ((w51) zx0Var.g(dc1Var)) == null) {
            return;
        }
        ArrayList arrayList = hd1Var.j;
        if (arrayList != null && (iy0Var = (iy0) arrayList.remove(arrayList.size() - 1)) != null) {
            hd1Var.e = iy0Var;
        }
        zx0Var.k(dc1Var);
    }
}
