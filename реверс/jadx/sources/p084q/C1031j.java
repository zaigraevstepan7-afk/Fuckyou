package p084q;

import androidx.fragment.app.AbstractC0529T;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p035S0.AbstractC0365b;
import p051a1.AbstractC0451c;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes.dex */
public class C1031j {

    /* JADX INFO: renamed from: a */
    public int[] f4102a;

    /* JADX INFO: renamed from: b */
    public Object[] f4103b;

    /* JADX INFO: renamed from: c */
    public int f4104c;

    public C1031j(int i2) {
        this.f4102a = i2 == 0 ? AbstractC1034a.f4111a : new int[i2];
        this.f4103b = i2 == 0 ? AbstractC1034a.f4112b : new Object[i2 << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m2485a(Object obj) {
        int i2 = this.f4104c * 2;
        Object[] objArr = this.f4103b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m2486b(int i2) {
        int i3 = this.f4104c;
        int[] iArr = this.f4102a;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            AbstractC0451c.m1145d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4102a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4103b, i2 * 2);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4103b = objArrCopyOf;
        }
        if (this.f4104c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2487c(int i2, Object obj) {
        int i3 = this.f4104c;
        if (i3 == 0) {
            return -1;
        }
        int iM2499a = AbstractC1034a.m2499a(i3, i2, this.f4102a);
        if (iM2499a < 0 || AbstractC0451c.m1142a(obj, this.f4103b[iM2499a << 1])) {
            return iM2499a;
        }
        int i4 = iM2499a + 1;
        while (i4 < i3 && this.f4102a[i4] == i2) {
            if (AbstractC0451c.m1142a(obj, this.f4103b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM2499a - 1; i5 >= 0 && this.f4102a[i5] == i2; i5--) {
            if (AbstractC0451c.m1142a(obj, this.f4103b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final void clear() {
        if (this.f4104c > 0) {
            this.f4102a = AbstractC1034a.f4111a;
            this.f4103b = AbstractC1034a.f4112b;
            this.f4104c = 0;
        }
        if (this.f4104c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m2488d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m2485a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m2488d(Object obj) {
        return obj == null ? m2489e() : m2487c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m2489e() {
        int i2 = this.f4104c;
        if (i2 == 0) {
            return -1;
        }
        int iM2499a = AbstractC1034a.m2499a(i2, 0, this.f4102a);
        if (iM2499a < 0 || this.f4103b[iM2499a << 1] == null) {
            return iM2499a;
        }
        int i3 = iM2499a + 1;
        while (i3 < i2 && this.f4102a[i3] == 0) {
            if (this.f4103b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2499a - 1; i4 >= 0 && this.f4102a[i4] == 0; i4--) {
            if (this.f4103b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1031j) {
                int i2 = this.f4104c;
                if (i2 != ((C1031j) obj).f4104c) {
                    return false;
                }
                C1031j c1031j = (C1031j) obj;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objM2490f = m2490f(i3);
                    Object objM2493i = m2493i(i3);
                    Object obj2 = c1031j.get(objM2490f);
                    if (objM2493i == null) {
                        if (obj2 != null || !c1031j.containsKey(objM2490f)) {
                            return false;
                        }
                    } else if (!objM2493i.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4104c != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.f4104c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object objM2490f2 = m2490f(i5);
                Object objM2493i2 = m2493i(i5);
                Object obj3 = ((Map) obj).get(objM2490f2);
                if (objM2493i2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM2490f2)) {
                        return false;
                    }
                } else if (!objM2493i2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m2490f(int i2) {
        if (i2 < 0 || i2 >= this.f4104c) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        return this.f4103b[i2 << 1];
    }

    /* JADX INFO: renamed from: g */
    public final Object m2491g(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f4104c)) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        Object[] objArr = this.f4103b;
        int i4 = i2 << 1;
        Object obj = objArr[i4 + 1];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i5 = i3 - 1;
        int[] iArr = this.f4102a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i5) {
                int i6 = i2 + 1;
                AbstractC0365b.m997C0(i2, i6, i3, iArr, iArr);
                Object[] objArr2 = this.f4103b;
                AbstractC0365b.m998D0(objArr2, objArr2, i4, i6 << 1, i3 << 1);
            }
            Object[] objArr3 = this.f4103b;
            int i7 = i5 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            AbstractC0451c.m1145d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4102a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4103b, i8 << 1);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4103b = objArrCopyOf;
            if (i3 != this.f4104c) {
                throw new ConcurrentModificationException();
            }
            if (i2 > 0) {
                AbstractC0365b.m997C0(0, 0, i2, iArr, this.f4102a);
                AbstractC0365b.m998D0(objArr, this.f4103b, 0, 0, i4);
            }
            if (i2 < i5) {
                int i9 = i2 + 1;
                AbstractC0365b.m997C0(i2, i9, i3, iArr, this.f4102a);
                AbstractC0365b.m998D0(objArr, this.f4103b, i4, i9 << 1, i3 << 1);
            }
        }
        if (i3 != this.f4104c) {
            throw new ConcurrentModificationException();
        }
        this.f4104c = i5;
        return obj;
    }

    public Object get(Object obj) {
        int iM2488d = m2488d(obj);
        if (iM2488d >= 0) {
            return this.f4103b[(iM2488d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2488d = m2488d(obj);
        return iM2488d >= 0 ? this.f4103b[(iM2488d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m2492h(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.f4104c) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f4103b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f4102a;
        Object[] objArr = this.f4103b;
        int i2 = this.f4104c;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m2493i(int i2) {
        if (i2 < 0 || i2 >= this.f4104c) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        return this.f4103b[(i2 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f4104c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.f4104c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2487c = obj != null ? m2487c(iHashCode, obj) : m2489e();
        if (iM2487c >= 0) {
            int i3 = (iM2487c << 1) + 1;
            Object[] objArr = this.f4103b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iM2487c;
        int[] iArr = this.f4102a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            AbstractC0451c.m1145d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4102a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4103b, i5 << 1);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4103b = objArrCopyOf;
            if (i2 != this.f4104c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f4102a;
            int i6 = i4 + 1;
            AbstractC0365b.m997C0(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.f4103b;
            AbstractC0365b.m998D0(objArr2, objArr2, i6 << 1, i4 << 1, this.f4104c << 1);
        }
        int i7 = this.f4104c;
        if (i2 == i7) {
            int[] iArr3 = this.f4102a;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.f4103b;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f4104c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM2488d = m2488d(obj);
        if (iM2488d >= 0) {
            return m2491g(iM2488d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2488d = m2488d(obj);
        if (iM2488d >= 0) {
            return m2492h(iM2488d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4104c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4104c * 28);
        sb.append('{');
        int i2 = this.f4104c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objM2490f = m2490f(i3);
            if (objM2490f != sb) {
                sb.append(objM2490f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2493i = m2493i(i3);
            if (objM2493i != sb) {
                sb.append(objM2493i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0451c.m1145d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2488d = m2488d(obj);
        if (iM2488d < 0 || !AbstractC0451c.m1142a(obj2, m2493i(iM2488d))) {
            return false;
        }
        m2491g(iM2488d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2488d = m2488d(obj);
        if (iM2488d < 0 || !AbstractC0451c.m1142a(obj2, m2493i(iM2488d))) {
            return false;
        }
        m2492h(iM2488d, obj3);
        return true;
    }
}
