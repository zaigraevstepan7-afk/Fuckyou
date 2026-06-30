package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h61 implements Iterator, yj0 {
    public final /* synthetic */ int e = 0;
    public final Iterator f;

    public h61(e61 e61Var) {
        n22[] n22VarArr = new n22[8];
        for (int i = 0; i < 8; i++) {
            n22VarArr[i] = new p22(this);
        }
        this.f = new f61(e61Var, n22VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((f61) this.f).g;
            default:
                return this.f.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return (Map.Entry) ((f61) this.f).next();
            default:
                return (b52) this.f.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((f61) this.f).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h61(z42 z42Var) {
        this.f = z42Var.n.iterator();
    }
}
