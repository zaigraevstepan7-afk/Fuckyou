package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sf {
    public final float a;

    public sf(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, al0 al0Var) {
        float f = (i2 - i) / 2.0f;
        al0 al0Var2 = al0.e;
        float f2 = this.a;
        if (al0Var != al0Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf) && Float.compare(this.a, ((sf) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
