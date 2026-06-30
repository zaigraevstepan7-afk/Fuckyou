package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z81 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public z81(boolean z, dk1 dk1Var, boolean z2) {
        bq bqVar = l7.a;
        int i = !z ? 262152 : 262144;
        i = dk1Var == dk1.f ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = dk1Var == dk1.e;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z81)) {
            return false;
        }
        z81 z81Var = (z81) obj;
        return this.a == z81Var.a && this.b == z81Var.b && this.c == z81Var.c && this.d == z81Var.d && this.e == z81Var.e && this.f == z81Var.f;
    }

    public final int hashCode() {
        return (s91.d(s91.d(s91.d(s91.d(s91.d(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }
}
