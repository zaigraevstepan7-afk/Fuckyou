package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q61 extends z {
    public final Object[] g;
    public final l22 h;

    public q61(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.g = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.h = new l22(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yc.m();
            return null;
        }
        l22 l22Var = this.h;
        if (l22Var.hasNext()) {
            this.e++;
            return l22Var.next();
        }
        int i = this.e;
        this.e = i + 1;
        return this.g[i - l22Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yc.m();
            return null;
        }
        int i = this.e;
        l22 l22Var = this.h;
        int i2 = l22Var.f;
        if (i <= i2) {
            this.e = i - 1;
            return l22Var.previous();
        }
        int i3 = i - 1;
        this.e = i3;
        return this.g[i3 - i2];
    }
}
