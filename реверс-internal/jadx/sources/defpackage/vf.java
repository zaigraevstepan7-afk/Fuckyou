package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vf extends g41 {
    public final f6 e;
    public final long f;
    public int g = 1;
    public final long h;
    public float i;
    public wl j;

    public vf(f6 f6Var, long j) {
        int i;
        this.e = f6Var;
        this.f = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > f6Var.a.getWidth() || i > f6Var.a.getHeight()) {
            yc.p("Failed requirement.");
            throw null;
        }
        this.h = j;
        this.i = 1.0f;
    }

    @Override // defpackage.g41
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.g41
    public final void b(wl wlVar) {
        this.j = wlVar;
    }

    @Override // defpackage.g41
    public final long e() {
        return xk.P(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return xi0.o(this.e, vfVar.e) && oh0.a(0L, 0L) && vh0.a(this.f, vfVar.f) && this.g == vfVar.g;
    }

    @Override // defpackage.g41
    public final void f(sl0 sl0Var) {
        ej ejVar = sl0Var.e;
        p10.Z(sl0Var, this.e, this.f, (((long) Math.round(Float.intBitsToFloat((int) (ejVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (ejVar.d() & 4294967295L)))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + s91.c(s91.c(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    public final String toString() {
        String strD = oh0.d(0L);
        String strB = vh0.b(this.f);
        int i = this.g;
        return "BitmapPainter(image=" + this.e + ", srcOffset=" + strD + ", srcSize=" + strB + ", filterQuality=" + (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown") + ")";
    }
}
