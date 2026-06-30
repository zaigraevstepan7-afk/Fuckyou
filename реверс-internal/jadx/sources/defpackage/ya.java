package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends cb {
    public float a;

    public ya(float f) {
        this.a = f;
    }

    @Override // defpackage.cb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.cb
    public final int b() {
        return 1;
    }

    @Override // defpackage.cb
    public final cb c() {
        return new ya(0.0f);
    }

    @Override // defpackage.cb
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.cb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ya) && ((ya) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
