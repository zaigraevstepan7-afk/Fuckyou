package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dy {
    public final boolean a;
    public final boolean b;
    public final dk1 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public dy(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.a = z;
        this.b = z2;
        this.c = dk1.e;
        this.d = true;
        this.e = true;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        return this.a == dyVar.a && this.b == dyVar.b && this.c == dyVar.c && this.d == dyVar.d && this.e == dyVar.e && this.g == dyVar.g;
    }

    public final int hashCode() {
        return (s91.d(s91.d((this.c.hashCode() + s91.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }
}
