package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z11 extends d31 {
    public static final z11 c = new z11(0, 2, 1);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) throws IllegalAccessException, InvocationTargetException {
        th0 th0Var = (th0) llVar.e(1);
        int i = th0Var != null ? th0Var.a : 0;
        kj kjVar = (kj) llVar.e(0);
        if (i > 0) {
            vcVar = new x01(vcVar, i);
        }
        kjVar.t0(vcVar, mp1Var, hd1Var, e31Var != null ? new xg0(28, e31Var, mp1Var) : null);
    }
}
