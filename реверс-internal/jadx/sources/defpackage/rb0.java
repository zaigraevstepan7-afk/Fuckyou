package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rb0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final hx0 e;
    public final jv1 f;

    public rb0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            e91.a("Invalid start index");
        }
        this.d = new ArrayList();
        hx0 hx0Var = new hx0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            hk0 hk0Var = (hk0) this.a.get(i3);
            int i4 = hk0Var.c;
            int i5 = hk0Var.d;
            hx0Var.i(i4, new yc0(i3, i2, i5));
            i2 += i5;
        }
        this.e = hx0Var;
        this.f = new jv1(new rq0(22, this));
    }

    public final boolean a(int i, int i2) {
        yc0 yc0Var;
        int i3;
        int i4;
        hx0 hx0Var = this.e;
        yc0 yc0Var2 = (yc0) hx0Var.b(i);
        if (yc0Var2 == null) {
            return false;
        }
        int i5 = yc0Var2.b;
        int i6 = i2 - yc0Var2.c;
        yc0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = hx0Var.c;
        long[] jArr = hx0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (yc0Var = (yc0) objArr[(i7 << 3) + i9]).b) >= i5 && yc0Var != yc0Var2 && (i4 = i3 + i6) >= 0) {
                        yc0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
