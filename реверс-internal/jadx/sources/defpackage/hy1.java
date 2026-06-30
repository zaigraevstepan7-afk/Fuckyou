package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hy1 implements PointerInputEventHandler {
    public final /* synthetic */ vt a;
    public final /* synthetic */ fy0 b;
    public final /* synthetic */ jx0 c;
    public final /* synthetic */ fy0 d;

    public hy1(vt vtVar, fy0 fy0Var, jx0 jx0Var, fy0 fy0Var2) {
        this.a = vtVar;
        this.b = fy0Var;
        this.c = jx0Var;
        this.d = fy0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(q81 q81Var, ks ksVar) {
        gy1 gy1Var = new gy1(this.a, this.b, this.c, null);
        p8 p8Var = new p8(this.d, 5);
        f10 f10Var = xv1.a;
        Object objR = bl.r(new l6(q81Var, gy1Var, p8Var, new ma1(q81Var), null, 10), ksVar);
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        if (objR != wtVar) {
            objR = t32Var;
        }
        return objR == wtVar ? objR : t32Var;
    }
}
