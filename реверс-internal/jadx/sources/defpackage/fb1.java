package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fb1 {
    public static final fb1 c = new fb1(0.0f, new fl(0.0f, 0.0f));
    public final float a;
    public final fl b;

    public fb1(float f, fl flVar) {
        this.a = f;
        this.b = flVar;
        if (Float.isNaN(f)) {
            yc.p("current must not be NaN");
            throw null;
        }
    }

    public final fl a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb1)) {
            return false;
        }
        fb1 fb1Var = (fb1) obj;
        return this.a == fb1Var.a && xi0.o(this.b, fb1Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
