package p084q;

import androidx.fragment.app.AbstractC0529T;
import java.util.Arrays;
import p035S0.AbstractC0365b;
import p051a1.AbstractC0451c;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1029h implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f4096a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f4097b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f4098c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f4099d;

    public C1029h() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f4097b = new long[i5];
        this.f4098c = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m2475a(long j2, Long l2) {
        int i2 = this.f4099d;
        if (i2 != 0 && j2 <= this.f4097b[i2 - 1]) {
            m2481g(j2, l2);
            return;
        }
        if (this.f4096a) {
            long[] jArr = this.f4097b;
            if (i2 >= jArr.length) {
                Object[] objArr = this.f4098c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != AbstractC1030i.f4100a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f4096a = false;
                this.f4099d = i3;
            }
        }
        int i5 = this.f4099d;
        if (i5 >= this.f4097b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f4097b, i9);
            AbstractC0451c.m1145d(jArrCopyOf, "copyOf(this, newSize)");
            this.f4097b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4098c, i9);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4098c = objArrCopyOf;
        }
        this.f4097b[i5] = j2;
        this.f4098c[i5] = l2;
        this.f4099d = i5 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m2476b() {
        int i2 = this.f4099d;
        Object[] objArr = this.f4098c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f4099d = 0;
        this.f4096a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1029h clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC0451c.m1144c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1029h c1029h = (C1029h) objClone;
        c1029h.f4097b = (long[]) this.f4097b.clone();
        c1029h.f4098c = (Object[]) this.f4098c.clone();
        return c1029h;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2478d(long j2) {
        Object obj;
        int iM2500b = AbstractC1034a.m2500b(this.f4097b, this.f4099d, j2);
        if (iM2500b < 0 || (obj = this.f4098c[iM2500b]) == AbstractC1030i.f4100a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m2479e(long j2) {
        Object obj;
        int iM2500b = AbstractC1034a.m2500b(this.f4097b, this.f4099d, j2);
        if (iM2500b < 0 || (obj = this.f4098c[iM2500b]) == AbstractC1030i.f4100a) {
            return -1L;
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public final long m2480f(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f4099d)) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        if (this.f4096a) {
            long[] jArr = this.f4097b;
            Object[] objArr = this.f4098c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC1030i.f4100a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f4096a = false;
            this.f4099d = i4;
        }
        return this.f4097b[i2];
    }

    /* JADX INFO: renamed from: g */
    public final void m2481g(long j2, Object obj) {
        int iM2500b = AbstractC1034a.m2500b(this.f4097b, this.f4099d, j2);
        if (iM2500b >= 0) {
            this.f4098c[iM2500b] = obj;
            return;
        }
        int i2 = ~iM2500b;
        int i3 = this.f4099d;
        Object obj2 = AbstractC1030i.f4100a;
        if (i2 < i3) {
            Object[] objArr = this.f4098c;
            if (objArr[i2] == obj2) {
                this.f4097b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f4096a) {
            long[] jArr = this.f4097b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f4098c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f4096a = false;
                this.f4099d = i4;
                i2 = ~AbstractC1034a.m2500b(this.f4097b, i4, j2);
            }
        }
        int i6 = this.f4099d;
        if (i6 >= this.f4097b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f4097b, i10);
            AbstractC0451c.m1145d(jArrCopyOf, "copyOf(this, newSize)");
            this.f4097b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4098c, i10);
            AbstractC0451c.m1145d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4098c = objArrCopyOf;
        }
        int i11 = this.f4099d - i2;
        if (i11 != 0) {
            long[] jArr2 = this.f4097b;
            int i12 = i2 + 1;
            AbstractC0451c.m1146e(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.f4098c;
            AbstractC0365b.m998D0(objArr3, objArr3, i12, i2, this.f4099d);
        }
        this.f4097b[i2] = j2;
        this.f4098c[i2] = obj;
        this.f4099d++;
    }

    /* JADX INFO: renamed from: h */
    public final int m2482h() {
        if (this.f4096a) {
            int i2 = this.f4099d;
            long[] jArr = this.f4097b;
            Object[] objArr = this.f4098c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC1030i.f4100a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f4096a = false;
            this.f4099d = i3;
        }
        return this.f4099d;
    }

    /* JADX INFO: renamed from: i */
    public final Object m2483i(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f4099d)) {
            throw new IllegalArgumentException(AbstractC0529T.m1416e("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        if (this.f4096a) {
            long[] jArr = this.f4097b;
            Object[] objArr = this.f4098c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC1030i.f4100a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f4096a = false;
            this.f4099d = i4;
        }
        return this.f4098c[i2];
    }

    public final String toString() {
        if (m2482h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4099d * 28);
        sb.append('{');
        int i2 = this.f4099d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(m2480f(i3));
            sb.append('=');
            Object objM2483i = m2483i(i3);
            if (objM2483i != sb) {
                sb.append(objM2483i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0451c.m1145d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
