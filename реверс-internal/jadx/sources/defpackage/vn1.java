package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vn1 {
    public final v41 a;
    public final v41 b;
    public final qm0 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public q52 j;

    public vn1() {
        Boolean bool = Boolean.FALSE;
        this.a = xc.B(bool);
        this.b = xc.B(bool);
        this.c = new qm0(1);
        this.d = yv0.a();
        this.e = vl.f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = u12.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        v41 v41Var = this.a;
        boolean zBooleanValue = ((Boolean) v41Var.getValue()).booleanValue();
        v41 v41Var2 = this.b;
        if (zBooleanValue && !z) {
            v41Var2.setValue(Boolean.TRUE);
        } else if (z) {
            v41Var2.setValue(Boolean.FALSE);
        }
        v41Var.setValue(Boolean.valueOf(z));
    }
}
