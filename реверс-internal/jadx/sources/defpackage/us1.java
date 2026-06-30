package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class us1 implements Iterator, yj0 {
    public final oq1 e;
    public final Iterator f;
    public int g;
    public Map.Entry h;
    public Map.Entry i;
    public final /* synthetic */ int j;

    public us1(oq1 oq1Var, Iterator it, int i) {
        this.j = i;
        this.e = oq1Var;
        this.f = it;
        this.g = oq1Var.e().d;
        a();
    }

    public final void a() {
        this.h = this.i;
        Iterator it = this.f;
        this.i = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.j) {
            case 0:
                a();
                if (this.h != null) {
                    return new ts1(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.i;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.i;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        oq1 oq1Var = this.e;
        if (oq1Var.e().d != this.g) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.h;
        if (entry == null) {
            throw new IllegalStateException();
        }
        oq1Var.remove(entry.getKey());
        this.h = null;
        this.g = oq1Var.e().d;
    }
}
