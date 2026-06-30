package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 implements p60 {
    public final float a;
    public final float b;
    public final Object c;

    public gr1(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.wa
    public final e52 a(r22 r22Var) {
        Object obj = this.c;
        return new y41(this.a, this.b, obj == null ? null : (cb) r22Var.a.i(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gr1) {
            gr1 gr1Var = (gr1) obj;
            if (gr1Var.a == this.a && gr1Var.b == this.b && xi0.o(gr1Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + s91.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ gr1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
