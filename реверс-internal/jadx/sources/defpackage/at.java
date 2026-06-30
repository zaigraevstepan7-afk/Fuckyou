package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class at implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ at(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(q81 q81Var, ks ksVar) {
        int i = this.a;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objR = bl.r(new zs(q81Var, (ex1) obj2, (ry1) obj, null), ksVar);
                return objR == wtVar ? objR : t32Var;
            default:
                Object objR2 = bl.r(new g(q81Var, (jx0) obj2, (hp1) obj, (ks) null), ksVar);
                return objR2 == wtVar ? objR2 : t32Var;
        }
    }
}
