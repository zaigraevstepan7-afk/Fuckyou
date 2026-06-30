package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class op1 extends AbstractMap {
    public static final /* synthetic */ int j = 0;
    public List e;
    public Map f;
    public boolean g;
    public volatile gd h;
    public Map i;

    public static op1 f() {
        op1 op1Var = new op1();
        op1Var.e = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        op1Var.f = map;
        op1Var.i = map;
        return op1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int size = this.e.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = comparable.compareTo(((pp1) this.e.get(i4)).e);
                if (iCompareTo < 0) {
                    i3 = i4 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    i = i4 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((pp1) this.e.get(i3)).e);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i = 0;
                while (i <= i3) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.e.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.f.isEmpty()) {
            return;
        }
        this.f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f.containsKey(comparable);
    }

    public final Set d() {
        return this.f.isEmpty() ? Collections.EMPTY_SET : this.f.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f = treeMap;
            this.i = treeMap.descendingMap();
        }
        return (SortedMap) this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new gd(this, 1);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op1)) {
            return super.equals(obj);
        }
        op1 op1Var = (op1) obj;
        int size = size();
        if (size == op1Var.size()) {
            int size2 = this.e.size();
            if (size2 != op1Var.e.size()) {
                return ((AbstractSet) entrySet()).equals(op1Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(op1Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f.equals(op1Var.f);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((pp1) this.e.get(iA)).setValue(obj);
        }
        b();
        if (this.e.isEmpty() && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.e.size() == 16) {
            pp1 pp1Var = (pp1) this.e.remove(15);
            e().put(pp1Var.e, pp1Var.f);
        }
        this.e.add(i, new pp1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((pp1) this.e.get(iA)).f : this.f.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((pp1) this.e.remove(i)).f;
        if (!this.f.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new pp1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.e.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((pp1) this.e.get(i)).hashCode();
        }
        return this.f.size() > 0 ? this.f.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f.size() + this.e.size();
    }
}
