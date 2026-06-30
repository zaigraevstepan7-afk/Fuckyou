package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q31 {
    public final long a;
    public final e41 b;

    public q31() {
        long jG = lk.g(4284900966L);
        e41 e41Var = new e41(0.0f, 0.0f, 0.0f, 0.0f);
        this.a = jG;
        this.b = e41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q31.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        q31 q31Var = (q31) obj;
        return vl.c(this.a, q31Var.a) && xi0.o(this.b, q31Var.b);
    }

    public final int hashCode() {
        int i = vl.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + vl.i(this.a) + ", drawPadding=" + this.b + ")";
    }
}
