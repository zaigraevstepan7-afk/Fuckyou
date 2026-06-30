package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kg {
    public final float a;
    public final uq1 b;

    public kg(float f, uq1 uq1Var) {
        this.a = f;
        this.b = uq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj;
        return tz.b(this.a, kgVar.a) && this.b.equals(kgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + tz.c(this.a) + ", brush=" + this.b + ")";
    }
}
