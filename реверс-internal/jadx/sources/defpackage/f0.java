package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends y {
    public abstract f0 b(int i, Object obj);

    public abstract f0 c(Object obj);

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public f0 e(Collection collection) {
        p61 p61VarF = f();
        p61VarF.addAll(collection);
        return p61VarF.c();
    }

    public abstract p61 f();

    public abstract f0 g(e0 e0Var);

    public abstract f0 h(int i);

    public abstract f0 i(int i, Object obj);

    @Override // defpackage.y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.y, java.util.List
    public final List subList(int i, int i2) {
        return new ff0(this, i, i2);
    }
}
