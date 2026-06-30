package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 {
    public final float a;

    public hq0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hq0)) {
            return false;
        }
        return tz.b(0.0f, 0.0f) && tz.b(this.a, ((hq0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a) + (Float.hashCode(0.0f) * 31);
    }
}
