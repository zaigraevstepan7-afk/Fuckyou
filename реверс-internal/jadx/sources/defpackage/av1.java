package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class av1 extends xv0 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public av1(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        return new fv1(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av1)) {
            return false;
        }
        av1 av1Var = (av1) obj;
        return xi0.o(this.a, av1Var.a) && xi0.o(this.b, av1Var.b) && this.c == av1Var.c;
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        fv1 fv1Var = (fv1) sv0Var;
        Object obj = fv1Var.s;
        Object obj2 = this.a;
        boolean z = !xi0.o(obj, obj2);
        fv1Var.s = obj2;
        Object obj3 = fv1Var.t;
        Object obj4 = this.b;
        if (!xi0.o(obj3, obj4)) {
            z = true;
        }
        fv1Var.t = obj4;
        Class<?> cls = fv1Var.u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            fv1Var.N0();
        }
        fv1Var.u = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
