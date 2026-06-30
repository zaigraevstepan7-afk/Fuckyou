package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class kb1 extends oi implements ck0 {
    public final boolean k;

    public kb1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kb1) {
            kb1 kb1Var = (kb1) obj;
            return e().equals(kb1Var.e()) && this.h.equals(kb1Var.h) && this.i.equals(kb1Var.i) && xi0.o(this.f, kb1Var.f);
        }
        if (obj instanceof ck0) {
            return obj.equals(g());
        }
        return false;
    }

    public final xj0 g() {
        if (this.k) {
            return this;
        }
        xj0 xj0Var = this.e;
        if (xj0Var != null) {
            return xj0Var;
        }
        xj0 xj0VarD = d();
        this.e = xj0VarD;
        return xj0VarD;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xj0 xj0VarG = g();
        if (xj0VarG != this) {
            return xj0VarG.toString();
        }
        return "property " + this.h + " (Kotlin reflection is not available)";
    }
}
