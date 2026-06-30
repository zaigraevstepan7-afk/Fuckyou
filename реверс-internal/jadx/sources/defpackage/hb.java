package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hb implements CharSequence {
    public final List e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;

    static {
        n81 n81Var = ei1.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        r0.a(r2.c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hb(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.e = list;
        this.f = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                gb gbVar = (gb) list.get(i);
                Object obj = gbVar.a;
                if (obj instanceof zq1) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(gbVar);
                } else if (obj instanceof p41) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(gbVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.g = arrayList;
        this.h = arrayList2;
        List listM0 = arrayList2 != null ? pl.m0(arrayList2, new x80(5)) : null;
        if (listM0 == null || listM0.isEmpty()) {
            return;
        }
        int i2 = ((gb) pl.c0(listM0)).c;
        gx0 gx0Var = lh0.a;
        int i3 = 1;
        gx0 gx0Var2 = new gx0(1);
        gx0Var2.a(i2);
        int size2 = listM0.size();
        while (i3 < size2) {
            gb gbVar2 = (gb) listM0.get(i3);
            while (true) {
                int i4 = gx0Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    yc.h("IntList is empty.");
                    throw null;
                }
                int i5 = gx0Var2.a[i4 - 1];
                if (gbVar2.b >= i5) {
                    gx0Var2.d(i4 - 1);
                } else {
                    int i6 = gbVar2.c;
                    if (i6 > i5) {
                        og0.a("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + i5);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hb subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            og0.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.f;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        hb hbVar = ib.a;
        if (i > i2) {
            og0.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.e;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                gb gbVar = (gb) list.get(i3);
                int i4 = gbVar.b;
                int i5 = gbVar.c;
                if (ib.b(i, i2, i4, i5)) {
                    arrayList.add(new gb(gbVar.a, Math.max(i, gbVar.b) - i, Math.min(i2, i5) - i, gbVar.d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new hb(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return xi0.o(this.f, hbVar.f) && xi0.o(this.e, hbVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f;
    }

    public /* synthetic */ hb(String str) {
        this(str, f40.e);
    }

    public hb(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
