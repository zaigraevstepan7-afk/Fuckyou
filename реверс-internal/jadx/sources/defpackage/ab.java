package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends cb {
    public float a;
    public float b;
    public float c;

    public ab(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.cb
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.cb
    public final int b() {
        return 3;
    }

    @Override // defpackage.cb
    public final cb c() {
        return new ab(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.cb
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.cb
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return abVar.a == this.a && abVar.b == this.b && abVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + s91.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbM = s91.m("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbM.append(f3);
        return sbM.toString();
    }
}
