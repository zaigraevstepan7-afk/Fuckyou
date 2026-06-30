package p035S0;

import p001A0.AbstractC0016e;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: S0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0365b extends AbstractC0016e {
    /* JADX INFO: renamed from: C0 */
    public static void m997C0(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        AbstractC0451c.m1146e(iArr, "<this>");
        AbstractC0451c.m1146e(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m998D0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        AbstractC0451c.m1146e(objArr, "<this>");
        AbstractC0451c.m1146e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m999E0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        m998D0(objArr, objArr2, 0, i2, i3);
    }
}
