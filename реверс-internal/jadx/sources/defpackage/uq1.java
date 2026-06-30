package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends lh implements li0 {
    public final long a;

    public uq1(long j) {
        this.a = j;
    }

    @Override // defpackage.lh
    public final void a(float f, long j, p6 p6Var) {
        p6Var.d(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = vl.b(vl.d(jB) * f, jB);
        }
        p6Var.f(jB);
        if (p6Var.c != null) {
            p6Var.c = null;
            p6Var.a.setShader(null);
        }
    }

    @Override // defpackage.li0
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new uq1(vl.f);
        }
        if (!(obj instanceof uq1)) {
            return null;
        }
        return new uq1(lk.U(f, this.a, ((uq1) obj).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uq1) {
            return vl.c(this.a, ((uq1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return s91.l("SolidColor(value=", vl.i(this.a), ")");
    }
}
