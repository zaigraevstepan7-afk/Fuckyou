package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements Map, Serializable, ak0 {
    public static final ut0 r;
    public Object[] e;
    public Object[] f;
    public int[] g;
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public vt0 n;
    public wt0 o;
    public vt0 p;
    public boolean q;

    static {
        ut0 ut0Var = new ut0(0);
        ut0Var.q = true;
        r = ut0Var;
    }

    public ut0(int i) {
        if (i < 0) {
            yc.p("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.e = objArr;
        this.f = null;
        this.g = iArr;
        this.h = new int[iHighestOneBit];
        this.i = 2;
        this.j = 0;
        this.k = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iH = h(obj);
            int i = this.i * 2;
            int length = this.h.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[iH];
                if (i3 == 0) {
                    int i4 = this.j;
                    Object[] objArr = this.e;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.j = i5;
                        objArr[i4] = obj;
                        this.g[i4] = iH;
                        iArr[iH] = i5;
                        this.m++;
                        this.l++;
                        if (i2 > this.i) {
                            this.i = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (xi0.o(this.e[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.h.length * 2);
                        break;
                    }
                    iH = iH == 0 ? this.h.length - 1 : iH - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.g;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.e;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.h[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        hk.R(this.e, i3, i);
        if (objArr != null) {
            hk.R(objArr, i3, this.j);
        }
        this.j = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.j - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.h[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        hk.R(this.e, 0, this.j);
        Object[] objArr = this.f;
        if (objArr != null) {
            hk.R(objArr, 0, this.j);
        }
        this.m = 0;
        this.j = 0;
        this.l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean zO;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = f(entry.getKey());
                    if (iF < 0) {
                        zO = false;
                    } else {
                        Object[] objArr = this.f;
                        objArr.getClass();
                        zO = xi0.o(objArr[iF], entry.getValue());
                    }
                    if (!zO) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int i2 = this.j;
        int i3 = length - i2;
        int i4 = i2 - this.m;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.e = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f;
            this.f = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.g = Arrays.copyOf(this.g, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.h.length) {
                i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        vt0 vt0Var = this.p;
        if (vt0Var != null) {
            return vt0Var;
        }
        vt0 vt0Var2 = new vt0(this, 0);
        this.p = vt0Var2;
        return vt0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.m == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int iH = h(obj);
        int i = this.i;
        while (true) {
            int i2 = this.h[iH];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (xi0.o(this.e[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.h.length - 1 : iH - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.j;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.g[i] >= 0) {
                Object[] objArr = this.f;
                objArr.getClass();
                if (xi0.o(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        return objArr[iF];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    @Override // java.util.Map
    public final int hashCode() {
        rt0 rt0Var = new rt0(this, 0);
        int i = 0;
        while (rt0Var.hasNext()) {
            int i2 = rt0Var.e;
            ut0 ut0Var = (ut0) rt0Var.h;
            if (i2 >= ut0Var.j) {
                yc.m();
                return 0;
            }
            rt0Var.e = i2 + 1;
            rt0Var.f = i2;
            Object obj = ut0Var.e[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ut0Var.f;
            objArr.getClass();
            Object obj2 = objArr[rt0Var.f];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            rt0Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.g[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        this.l++;
        int i2 = 0;
        if (this.j > this.m) {
            c(false);
        }
        this.h = new int[i];
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.j) {
            int i3 = i2 + 1;
            int iH = h(this.e[i2]);
            int i4 = this.i;
            while (true) {
                int[] iArr = this.h;
                if (iArr[iH] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    yc.l("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iH = iH == 0 ? iArr.length - 1 : iH - 1;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m == 0;
    }

    public final void j(int i) {
        int i2;
        int i3;
        int iH;
        int[] iArr;
        Object[] objArr = this.e;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.f;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.g[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.h.length - 1 : length - 1;
                int[] iArr2 = this.h;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.i) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iH = h(this.e[i3]) - length;
                    iArr = this.h;
                }
            } while ((iH & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.g[i3] = i4;
        }
        this.g[i] = -1;
        this.m--;
        this.l++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        vt0 vt0Var = this.n;
        if (vt0Var != null) {
            return vt0Var;
        }
        vt0 vt0Var2 = new vt0(this, 1);
        this.n = vt0Var2;
        return vt0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.f;
        if (objArr == null) {
            int length = this.e.length;
            if (length < 0) {
                yc.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f;
            if (objArr == null) {
                int length = this.e.length;
                if (length < 0) {
                    yc.p("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!xi0.o(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        Object obj2 = objArr[iF];
        j(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m * 3) + 2);
        sb.append("{");
        int i = 0;
        rt0 rt0Var = new rt0(this, 0);
        while (rt0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = rt0Var.e;
            ut0 ut0Var = (ut0) rt0Var.h;
            if (i2 >= ut0Var.j) {
                yc.m();
                return null;
            }
            rt0Var.e = i2 + 1;
            rt0Var.f = i2;
            Object obj = ut0Var.e[i2];
            if (obj == ut0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ut0Var.f;
            objArr.getClass();
            Object obj2 = objArr[rt0Var.f];
            if (obj2 == ut0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            rt0Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        wt0 wt0Var = this.o;
        if (wt0Var != null) {
            return wt0Var;
        }
        wt0 wt0Var2 = new wt0(this);
        this.o = wt0Var2;
        return wt0Var2;
    }
}
