package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ib {
    public static final hb a = new hb("");

    public static final List a(hb hbVar, int i, int i2, p1 p1Var) {
        List list;
        if (i == i2 || (list = hbVar.e) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= hbVar.f.length()) {
            if (p1Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) p1Var.i(((gb) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            gb gbVar = (gb) list.get(i3);
            if (p1Var != null ? ((Boolean) p1Var.i(gbVar.a)).booleanValue() : true) {
                int i4 = gbVar.b;
                int i5 = gbVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new gb((db) gbVar.a, lk.A(gbVar.b, i, i2) - i, lk.A(i5, i, i2) - i, gbVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
