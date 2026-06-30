package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements Iterator, yj0 {
    public final jp1 e;
    public final int f;
    public int g;
    public final int h;

    public zc0(jp1 jp1Var, int i, int i2) {
        this.e = jp1Var;
        this.f = i2;
        this.g = i;
        this.h = jp1Var.l;
        if (jp1Var.k) {
            lp1.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        jp1 jp1Var = this.e;
        int i = jp1Var.l;
        int i2 = this.h;
        if (i != i2) {
            lp1.f();
        }
        int i3 = this.g;
        this.g = jp1Var.e[(i3 * 5) + 3] + i3;
        return new kp1(jp1Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
