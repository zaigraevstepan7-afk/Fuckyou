package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l60 implements Iterator, yj0 {
    public final Iterator e;
    public int f = -1;
    public Object g;
    public final /* synthetic */ m60 h;

    public l60(m60 m60Var) {
        this.h = m60Var;
        this.e = new w12((m60) m60Var.b);
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.e;
            if (!it.hasNext()) {
                this.f = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((n) this.h.c).i(next)).booleanValue());
        this.g = next;
        this.f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            yc.m();
            return null;
        }
        Object obj = this.g;
        this.g = null;
        this.f = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
