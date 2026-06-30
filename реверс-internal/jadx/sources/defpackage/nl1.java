package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 implements am1, Iterable, yj0 {
    public final zx0 e;
    public cu0 f;
    public boolean g;
    public boolean h;

    public nl1() {
        long[] jArr = pi1.a;
        this.e = new zx0();
    }

    @Override // defpackage.am1
    public final void a(zl1 zl1Var, Object obj) {
        boolean z = obj instanceof r0;
        zx0 zx0Var = this.e;
        if (z && zx0Var.c(zl1Var)) {
            Object objG = zx0Var.g(zl1Var);
            objG.getClass();
            r0 r0Var = (r0) objG;
            r0 r0Var2 = (r0) obj;
            String str = r0Var2.a;
            if (str == null) {
                str = r0Var.a;
            }
            eb0 eb0Var = r0Var2.b;
            if (eb0Var == null) {
                eb0Var = r0Var.b;
            }
            zx0Var.m(zl1Var, new r0(str, eb0Var));
        } else {
            zx0Var.m(zl1Var, obj);
        }
        zl1Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nl1 b() {
        nl1 nl1Var = new nl1();
        nl1Var.g = this.g;
        nl1Var.h = this.h;
        zx0 zx0Var = nl1Var.e;
        zx0Var.getClass();
        zx0 zx0Var2 = this.e;
        zx0Var2.getClass();
        Object[] objArr = zx0Var2.b;
        Object[] objArr2 = zx0Var2.c;
        long[] jArr = zx0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            zx0Var.m(objArr[i4], objArr2[i4]);
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
        return nl1Var;
    }

    public final Object c(zl1 zl1Var) {
        Object objG = this.e.g(zl1Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + zl1Var + " - consider getOrElse or getOrNull");
    }

    public final void e(nl1 nl1Var) {
        zx0 zx0Var = nl1Var.e;
        Object[] objArr = zx0Var.b;
        Object[] objArr2 = zx0Var.c;
        long[] jArr = zx0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        zl1 zl1Var = (zl1) obj;
                        zx0 zx0Var2 = this.e;
                        Object objG = zx0Var2.g(zl1Var);
                        zl1Var.getClass();
                        Object objH = zl1Var.b.h(objG, obj2);
                        if (objH != null) {
                            zx0Var2.m(zl1Var, objH);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1Var = (nl1) obj;
        return xi0.o(this.e, nl1Var.e) && this.g == nl1Var.g && this.h == nl1Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + s91.d(this.e.hashCode() * 31, 31, this.g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        cu0 cu0Var = this.f;
        if (cu0Var == null) {
            zx0 zx0Var = this.e;
            zx0Var.getClass();
            cu0 cu0Var2 = new cu0(zx0Var);
            this.f = cu0Var2;
            cu0Var = cu0Var2;
        }
        return ((y40) cu0Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        zx0 zx0Var = this.e;
        Object[] objArr = zx0Var.b;
        Object[] objArr2 = zx0Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((zl1) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return hk.T(this) + "{ " + ((Object) sb) + " }";
    }
}
