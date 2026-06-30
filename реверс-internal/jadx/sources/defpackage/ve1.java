package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 implements ListIterator, yj0 {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final /* synthetic */ Object g;

    public ve1(we1 we1Var, int i) {
        this.g = we1Var;
        List list = we1Var.e;
        if (i >= 0 && i <= we1Var.a()) {
            this.f = list.listIterator(we1Var.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new rh0(0, we1Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((xc1) obj).e < ((gu1) this.g).h - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((xc1) obj).e >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                xc1 xc1Var = (xc1) obj;
                int i2 = xc1Var.e + 1;
                gu1 gu1Var = (gu1) this.g;
                wi0.p(i2, gu1Var.h);
                xc1Var.e = i2;
                return gu1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                we1 we1Var = (we1) this.g;
                return (we1Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((xc1) obj).e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                xc1 xc1Var = (xc1) obj;
                int i2 = xc1Var.e;
                gu1 gu1Var = (gu1) this.g;
                wi0.p(i2, gu1Var.h);
                xc1Var.e = i2 - 1;
                return gu1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                we1 we1Var = (we1) this.g;
                return (we1Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((xc1) obj).e;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public ve1(xc1 xc1Var, gu1 gu1Var) {
        this.f = xc1Var;
        this.g = gu1Var;
    }
}
