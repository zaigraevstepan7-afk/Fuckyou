package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p22 extends n22 {
    public final h61 h;

    public p22(h61 h61Var) {
        this.h = h61Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        this.g = i + 2;
        Object[] objArr = this.e;
        return new nx0(this.h, objArr[i], objArr[i + 1]);
    }
}
