package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements hm0, Serializable {
    public ha0 e;
    public volatile Object f;
    public final Object g;

    public jv1(ha0 ha0Var) {
        ha0Var.getClass();
        this.e = ha0Var;
        this.f = l91.u;
        this.g = this;
    }

    @Override // defpackage.hm0
    public final Object getValue() {
        Object objA;
        Object obj = this.f;
        l91 l91Var = l91.u;
        if (obj != l91Var) {
            return obj;
        }
        synchronized (this.g) {
            objA = this.f;
            if (objA == l91Var) {
                ha0 ha0Var = this.e;
                ha0Var.getClass();
                objA = ha0Var.a();
                this.f = objA;
                this.e = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f != l91.u ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
