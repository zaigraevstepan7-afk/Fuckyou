package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j61 extends b0 implements yj0 {
    public final e61 e;

    public j61(e61 e61Var) {
        this.e = e61Var;
    }

    @Override // defpackage.b0
    public final int a() {
        return this.e.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        n22[] n22VarArr = new n22[8];
        for (int i = 0; i < 8; i++) {
            n22VarArr[i] = new o22(2);
        }
        return new i61(this.e, n22VarArr);
    }
}
