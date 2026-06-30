package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s01 {
    public static final Object[] a = new Object[0];
    public static final sx0 b = new sx0(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            yc.o(s91.k("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            yc.p(s91.k("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
            return;
        }
        if (i < 0) {
            yc.o(s91.h(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
