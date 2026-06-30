package p066g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: g0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0763n {

    /* JADX INFO: renamed from: a */
    public int f3075a;

    /* JADX INFO: renamed from: b */
    public int f3076b;

    /* JADX INFO: renamed from: c */
    public int[] f3077c;

    /* JADX INFO: renamed from: d */
    public int f3078d;

    /* JADX INFO: renamed from: a */
    public final void m2098a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i4 = this.f3078d;
        int i5 = i4 * 2;
        int[] iArr = this.f3077c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3077c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int[] iArr3 = new int[i4 * 4];
            this.f3077c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3077c;
        iArr4[i5] = i2;
        iArr4[i5 + 1] = i3;
        this.f3078d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2099b(RecyclerView recyclerView, boolean z2) {
        this.f3078d = 0;
        int[] iArr = this.f3077c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0723K abstractC0723K = recyclerView.f1982m;
        if (recyclerView.f1980l == null || abstractC0723K == null || !abstractC0723K.f2869i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1966e.m562f()) {
                abstractC0723K.mo1579i(recyclerView.f1980l.mo985a(), this);
            }
        } else if (!recyclerView.m1607O()) {
            abstractC0723K.mo1578h(this.f3075a, this.f3076b, recyclerView.f1967e0, this);
        }
        int i2 = this.f3078d;
        if (i2 > abstractC0723K.f2870j) {
            abstractC0723K.f2870j = i2;
            abstractC0723K.f2871k = z2;
            recyclerView.f1962c.m2032m();
        }
    }
}
