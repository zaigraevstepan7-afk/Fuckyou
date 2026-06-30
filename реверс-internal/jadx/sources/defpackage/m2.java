package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class m2 implements gb0, Serializable {
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public m2(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    @Override // defpackage.gb0
    public final int c() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.i == m2Var.i && this.j == m2Var.j && this.k == m2Var.k && xi0.o(this.e, m2Var.e) && this.f.equals(m2Var.f) && this.g.equals(m2Var.g) && this.h.equals(m2Var.h);
    }

    public final int hashCode() {
        Object obj = this.e;
        return ((((((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31)) * 31)) * 31) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        ad1.a.getClass();
        return bd1.a(this);
    }
}
