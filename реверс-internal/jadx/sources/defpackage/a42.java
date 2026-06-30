package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a42 implements hm0, Serializable {
    public ha0 e;
    public Object f;

    @Override // defpackage.hm0
    public final Object getValue() {
        if (this.f == l91.u) {
            ha0 ha0Var = this.e;
            ha0Var.getClass();
            this.f = ha0Var.a();
            this.e = null;
        }
        return this.f;
    }

    public final String toString() {
        return this.f != l91.u ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
