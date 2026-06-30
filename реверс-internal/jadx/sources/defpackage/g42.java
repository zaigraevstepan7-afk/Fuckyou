package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class g42 extends xv0 {
    public final float a;
    public final float b;

    public g42(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        h42 h42Var = new h42();
        h42Var.s = this.a;
        h42Var.t = this.b;
        return h42Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g42)) {
            return false;
        }
        g42 g42Var = (g42) obj;
        return tz.b(this.a, g42Var.a) && tz.b(this.b, g42Var.b);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        h42 h42Var = (h42) sv0Var;
        h42Var.s = this.a;
        h42Var.t = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
