package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx1 implements a70, fb0 {
    public final /* synthetic */ ha0 e;

    public rx1(ha0 ha0Var) {
        this.e = ha0Var;
    }

    @Override // defpackage.a70
    public final /* synthetic */ float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.fb0
    public final eb0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a70) || !(obj instanceof fb0)) {
            return false;
        }
        return xi0.o(this.e, ((fb0) obj).b());
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
