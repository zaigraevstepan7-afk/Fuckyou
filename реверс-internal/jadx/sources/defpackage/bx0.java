package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 {
    public final zx0 a;

    public static final Object a(zx0 zx0Var) {
        Object objG = zx0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof sx0)) {
            zx0Var.k(null);
            return objG;
        }
        sx0 sx0Var = (sx0) objG;
        if (sx0Var.h()) {
            yc.h("List is empty.");
            return null;
        }
        int i = sx0Var.b - 1;
        Object objF = sx0Var.f(i);
        sx0Var.k(i);
        objF.getClass();
        if (sx0Var.h()) {
            zx0Var.k(null);
        }
        if (sx0Var.b == 1) {
            zx0Var.m(null, sx0Var.e());
        }
        return objF;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sx0 b(zx0 zx0Var) {
        if (zx0Var.i()) {
            sx0 sx0Var = s01.b;
            sx0Var.getClass();
            return sx0Var;
        }
        sx0 sx0Var2 = new sx0();
        Object[] objArr = zx0Var.c;
        long[] jArr = zx0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof sx0) {
                                sx0Var2.b((sx0) obj);
                            } else {
                                obj.getClass();
                                sx0Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return sx0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bx0) {
            return this.a.equals(((bx0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
