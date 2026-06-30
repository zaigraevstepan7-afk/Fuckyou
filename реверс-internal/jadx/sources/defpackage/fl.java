package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fl {
    public final float a;
    public final float b;

    public fl(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static boolean a(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl)) {
            return false;
        }
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            fl flVar = (fl) obj;
            if (flVar.a > flVar.b) {
                return true;
            }
        }
        fl flVar2 = (fl) obj;
        return f == flVar2.a && f2 == flVar2.b;
    }

    public final int hashCode() {
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
