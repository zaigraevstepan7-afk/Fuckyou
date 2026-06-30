package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mw0 {
    public final long a;
    public final long b;
    public final boolean c;

    public mw0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final mw0 a(mw0 mw0Var) {
        return new mw0(w01.e(this.a, mw0Var.a), Math.max(this.b, mw0Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        return w01.b(this.a, mw0Var.a) && this.b == mw0Var.b && this.c == mw0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + s91.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + w01.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
