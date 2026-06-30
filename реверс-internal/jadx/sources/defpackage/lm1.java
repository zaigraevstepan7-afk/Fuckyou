package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 implements Iterator, ks, yj0 {
    public int e;
    public Object f;
    public ks g;

    public final RuntimeException a() {
        int i = this.e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.e);
    }

    public final void b(Object obj, ne1 ne1Var) {
        this.f = obj;
        this.e = 3;
        this.g = ne1Var;
    }

    @Override // defpackage.ks
    public final lt e() {
        return d40.e;
    }

    @Override // defpackage.ks
    public final void g(Object obj) {
        xc.G(obj);
        this.e = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.e;
            if (i != 0) {
                break;
            }
            this.e = 5;
            ks ksVar = this.g;
            ksVar.getClass();
            this.g = null;
            ksVar.g(t32.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            yc.m();
            return null;
        }
        if (i == 2) {
            this.e = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.e = 0;
        Object obj = this.f;
        this.f = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
