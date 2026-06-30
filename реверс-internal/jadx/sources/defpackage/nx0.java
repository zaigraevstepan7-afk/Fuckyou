package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 extends xt0 implements zj0 {
    public final h61 h;
    public Object i;

    public nx0(h61 h61Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.h = h61Var;
        this.i = obj2;
    }

    @Override // defpackage.xt0, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // defpackage.xt0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.i;
        this.i = obj;
        f61 f61Var = (f61) this.h.f;
        e61 e61Var = f61Var.h;
        Object obj3 = this.f;
        if (!e61Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = f61Var.g;
        if (!z) {
            e61Var.put(obj3, obj);
        } else {
            if (!z) {
                yc.m();
                return null;
            }
            n22 n22Var = f61Var.e[f61Var.f];
            Object obj4 = n22Var.e[n22Var.g];
            e61Var.put(obj3, obj);
            f61Var.c(obj4 != null ? obj4.hashCode() : 0, e61Var.g, obj4, 0);
        }
        f61Var.k = e61Var.i;
        return obj2;
    }
}
