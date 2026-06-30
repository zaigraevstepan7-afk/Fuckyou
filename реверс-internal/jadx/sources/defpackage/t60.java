package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t60 {
    public final float a;
    public final float b;
    public final long c;

    public t60(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t60)) {
            return false;
        }
        t60 t60Var = (t60) obj;
        return Float.compare(this.a, t60Var.a) == 0 && Float.compare(this.b, t60Var.b) == 0 && this.c == t60Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + s91.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = s91.m("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
