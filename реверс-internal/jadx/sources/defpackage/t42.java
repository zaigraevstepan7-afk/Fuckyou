package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t42 implements k72 {
    public final String a;
    public final v41 b;

    public t42(ih0 ih0Var, String str) {
        this.a = str;
        this.b = xc.B(ih0Var);
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

    public final ih0 e() {
        return (ih0) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t42) {
            return xi0.o(e(), ((t42) obj).e());
        }
        return false;
    }

    public final void f(ih0 ih0Var) {
        this.b.setValue(ih0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
