package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements Iterator {
    public int e = 0;
    public final int f;
    public final /* synthetic */ ji g;

    public hi(ji jiVar) {
        this.g = jiVar;
        this.f = jiVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i < this.f) {
            this.e = i + 1;
            return Byte.valueOf(this.g.g(i));
        }
        yc.m();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
