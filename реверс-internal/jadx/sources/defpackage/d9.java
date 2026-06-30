package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d9 implements k72 {
    public final int a;
    public final String b;
    public final v41 c = xc.B(eh0.e);
    public final v41 d = xc.B(Boolean.TRUE);

    public d9(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.k72
    public final int a(hx hxVar) {
        return e().d;
    }

    @Override // defpackage.k72
    public final int b(hx hxVar) {
        return e().b;
    }

    @Override // defpackage.k72
    public final int c(hx hxVar, al0 al0Var) {
        return e().c;
    }

    @Override // defpackage.k72
    public final int d(hx hxVar, al0 al0Var) {
        return e().a;
    }

    public final eh0 e() {
        return (eh0) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d9) {
            return this.a == ((d9) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(p82 p82Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(p82Var.a.h(i2));
            f(p82Var.a.t(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
