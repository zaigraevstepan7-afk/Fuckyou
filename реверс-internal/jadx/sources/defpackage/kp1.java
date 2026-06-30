package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements qp, Iterable, yj0 {
    public final jp1 e;
    public final int f;
    public final int g;

    public kp1(jp1 jp1Var, int i, int i2) {
        this.e = jp1Var;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kp1)) {
            return false;
        }
        kp1 kp1Var = (kp1) obj;
        return kp1Var.f == this.f && kp1Var.g == this.g && kp1Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        jp1 jp1Var = this.e;
        if (jp1Var.l != this.g) {
            lp1.f();
        }
        int i = this.f;
        jp1Var.g(i);
        return new zc0(jp1Var, i + 1, jp1Var.e[(i * 5) + 3] + i);
    }
}
