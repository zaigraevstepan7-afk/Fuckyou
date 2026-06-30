package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x21 extends d31 {
    public static final x21 c = new x21(0, 1, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        dc1 dc1Var = (dc1) llVar.e(0);
        zx0 zx0Var = hd1Var.i;
        w51 w51Var = zx0Var != null ? (w51) zx0Var.g(dc1Var) : null;
        if (w51Var != null) {
            ArrayList arrayList = hd1Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                hd1Var.j = arrayList;
            }
            arrayList.add(hd1Var.e);
            hd1Var.e = w51Var.f;
        }
    }
}
