package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 {
    public final long a;
    public final long b;

    public xz1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz1)) {
            return false;
        }
        xz1 xz1Var = (xz1) obj;
        return vl.c(this.a, xz1Var.a) && vl.c(this.b, xz1Var.b);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + vl.i(this.a) + ", selectionBackgroundColor=" + vl.i(this.b) + ")";
    }
}
