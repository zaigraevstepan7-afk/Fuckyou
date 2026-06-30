package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u5 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(q81 q81Var, ks ksVar) {
        int i = this.a;
        int i2 = 2;
        ks ksVar2 = null;
        Object obj = this.b;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                Object objO = el.o(q81Var, new t5((v5) obj, ksVar2, 0), ksVar);
                return objO == wtVar ? objO : t32Var;
            case 1:
                Object objL0 = ((fv1) q81Var).L0(new t5((qs) obj, ksVar2, i2), ksVar);
                return objL0 == wtVar ? objL0 : t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                Object objO2 = el.o(q81Var, new zk1((cu1) obj, null), ksVar);
                return objO2 == wtVar ? objO2 : t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                Object objO3 = el.o(q81Var, new t5(new f(1, (pw1) obj, pw1.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 28), ksVar2, 1), ksVar);
                if (objO3 != wtVar) {
                    objO3 = t32Var;
                }
                return objO3 == wtVar ? objO3 : t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ry1 ry1Var = (ry1) obj;
                go1 go1Var = ry1Var.z;
                py1 py1Var = ry1Var.y;
                fv1 fv1Var = (fv1) q81Var;
                fv1Var.getClass();
                j62 j62Var = bl.P(fv1Var).D;
                g6 g6Var = new g6();
                g6Var.b = j62Var;
                Object objO4 = el.o(q81Var, new zk1(g6Var, go1Var, py1Var, null), ksVar);
                if (objO4 != wtVar) {
                    objO4 = t32Var;
                }
                return objO4 == wtVar ? objO4 : t32Var;
            default:
                Object objR = bl.r(new da(q81Var, (ex1) obj, ksVar2, i2), ksVar);
                if (objR != wtVar) {
                    objR = t32Var;
                }
                return objR == wtVar ? objR : t32Var;
        }
    }
}
