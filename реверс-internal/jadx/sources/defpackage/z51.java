package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z51 implements ht {
    public final float a;

    public z51(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            qg0.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.ht
    public final float a(long j, hx hxVar) {
        return (this.a / 100.0f) * io1.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z51) && Float.compare(this.a, ((z51) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
