package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bb extends cb {
    public float a;
    public float b;
    public float c;
    public float d;

    public bb(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.cb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.cb
    public final int b() {
        return 4;
    }

    @Override // defpackage.cb
    public final cb c() {
        return new bb(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.cb
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.cb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return bbVar.a == this.a && bbVar.b == this.b && bbVar.c == this.c && bbVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbM = s91.m("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbM.append(f3);
        sbM.append(", v4 = ");
        sbM.append(f4);
        return sbM.toString();
    }
}
