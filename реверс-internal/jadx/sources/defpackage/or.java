package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class or {
    public final int a;
    public final long b;
    public final pr c;
    public final y41 d;

    public or(int i, long j, pr prVar, y41 y41Var) {
        this.a = i;
        this.b = j;
        this.c = prVar;
        this.d = y41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or)) {
            return false;
        }
        or orVar = (or) obj;
        return this.a == orVar.a && this.b == orVar.b && this.c == orVar.c && xi0.o(this.d, orVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + s91.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        y41 y41Var = this.d;
        return iHashCode + (y41Var == null ? 0 : y41Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
