package p084q;

import java.util.Arrays;
import p035S0.AbstractC0365b;
import p051a1.AbstractC0451c;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1032k implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int[] f4105a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object[] f4106b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f4107c;

    public C1032k() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f4105a = new int[i5];
        this.f4106b = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m2494a(int i2, Object obj) {
        int i3 = this.f4107c;
        if (i3 != 0 && i2 <= this.f4105a[i3 - 1]) {
            m2497d(i2, obj);
            return;
        }
        if (i3 >= this.f4105a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f4105a, i7);
            AbstractC0451c.m1145d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4105a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4106b, i7);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4106b = objArrCopyOf;
        }
        this.f4105a[i3] = i2;
        this.f4106b[i3] = obj;
        this.f4107c = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1032k clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC0451c.m1144c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1032k c1032k = (C1032k) objClone;
        c1032k.f4105a = (int[]) this.f4105a.clone();
        c1032k.f4106b = (Object[]) this.f4106b.clone();
        return c1032k;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2496c(int i2) {
        Object obj;
        int iM2499a = AbstractC1034a.m2499a(this.f4107c, i2, this.f4105a);
        if (iM2499a < 0 || (obj = this.f4106b[iM2499a]) == AbstractC1030i.f4101b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m2497d(int i2, Object obj) {
        int iM2499a = AbstractC1034a.m2499a(this.f4107c, i2, this.f4105a);
        if (iM2499a >= 0) {
            this.f4106b[iM2499a] = obj;
            return;
        }
        int i3 = ~iM2499a;
        int i4 = this.f4107c;
        if (i3 < i4) {
            Object[] objArr = this.f4106b;
            if (objArr[i3] == AbstractC1030i.f4101b) {
                this.f4105a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f4105a.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f4105a, i8);
            AbstractC0451c.m1145d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4105a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4106b, i8);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4106b = objArrCopyOf;
        }
        int i9 = this.f4107c;
        if (i9 - i3 != 0) {
            int[] iArr = this.f4105a;
            int i10 = i3 + 1;
            AbstractC0365b.m997C0(i10, i3, i9, iArr, iArr);
            Object[] objArr2 = this.f4106b;
            AbstractC0365b.m998D0(objArr2, objArr2, i10, i3, this.f4107c);
        }
        this.f4105a[i3] = i2;
        this.f4106b[i3] = obj;
        this.f4107c++;
    }

    public final String toString() {
        int i2 = this.f4107c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.f4107c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4105a[i4]);
            sb.append('=');
            Object obj = this.f4106b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0451c.m1145d(string, "buffer.toString()");
        return string;
    }
}
