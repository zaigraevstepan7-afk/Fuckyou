package p084q;

import java.util.ConcurrentModificationException;
import p051a1.AbstractC0451c;
import p086r.AbstractC1034a;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1030i {

    /* JADX INFO: renamed from: a */
    public static final Object f4100a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f4101b = new Object();

    /* JADX INFO: renamed from: a */
    public static final int m2484a(C1028g c1028g, Object obj, int i2) {
        AbstractC0451c.m1146e(c1028g, "<this>");
        int i3 = c1028g.f4095c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM2499a = AbstractC1034a.m2499a(c1028g.f4095c, i2, c1028g.f4093a);
            if (iM2499a < 0 || AbstractC0451c.m1142a(obj, c1028g.f4094b[iM2499a])) {
                return iM2499a;
            }
            int i4 = iM2499a + 1;
            while (i4 < i3 && c1028g.f4093a[i4] == i2) {
                if (AbstractC0451c.m1142a(obj, c1028g.f4094b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM2499a - 1; i5 >= 0 && c1028g.f4093a[i5] == i2; i5--) {
                if (AbstractC0451c.m1142a(obj, c1028g.f4094b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
