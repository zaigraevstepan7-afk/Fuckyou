package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class lp1 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int iE = e(arrayList, i, i2);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final jp1 d(jp1 jp1Var) {
        if (!(jp1Var instanceof jp1)) {
            jp1Var = null;
        }
        if (jp1Var != null) {
            return jp1Var;
        }
        mp.b("Inconsistent composition");
        yc.j();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((jb0) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iT = xi0.t(i5, i);
            if (iT < 0) {
                i3 = i4 + 1;
            } else {
                if (iT <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
