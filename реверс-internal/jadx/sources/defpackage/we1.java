package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class we1 extends y {
    public final List e;

    public we1(List list) {
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.o
    public final int a() {
        return this.e.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= hk.B(this)) {
            return this.e.get(hk.B(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new rh0(0, hk.B(this), 1) + "].");
    }

    @Override // defpackage.y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ve1(this, 0);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator() {
        return new ve1(this, 0);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator(int i) {
        return new ve1(this, i);
    }
}
