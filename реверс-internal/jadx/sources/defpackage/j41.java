package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j41 implements Serializable {
    public final Object e;
    public final Object f;

    public j41(Object obj, Object obj2) {
        this.e = obj;
        this.f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j41)) {
            return false;
        }
        j41 j41Var = (j41) obj;
        return xi0.o(this.e, j41Var.e) && xi0.o(this.f, j41Var.f);
    }

    public final int hashCode() {
        Object obj = this.e;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ')';
    }
}
