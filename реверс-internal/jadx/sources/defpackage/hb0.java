package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class hb0 extends oi implements gb0, xj0, eb0 {
    public final int k;

    public hb0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.k = i;
    }

    @Override // defpackage.gb0
    public final int c() {
        return this.k;
    }

    @Override // defpackage.oi
    public final xj0 d() {
        ad1.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hb0) {
            hb0 hb0Var = (hb0) obj;
            return this.h.equals(hb0Var.h) && this.i.equals(hb0Var.i) && xi0.o(this.f, hb0Var.f) && e().equals(hb0Var.e());
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        xj0 xj0Var = this.e;
        if (xj0Var == null) {
            d();
            this.e = this;
            this = this;
        } else {
            r2 = xj0Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        e();
        return this.i.hashCode() + ((this.h.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xj0 xj0Var = this.e;
        if (xj0Var == null) {
            d();
            this.e = this;
            xj0Var = this;
        }
        if (xj0Var != this) {
            return xj0Var.toString();
        }
        String str = this.h;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : s91.l("function ", str, " (Kotlin reflection is not available)");
    }

    public hb0(int i, Class cls, String str, String str2, int i2) {
        this(i, ni.e, cls, str, str2, i2, 0);
    }
}
