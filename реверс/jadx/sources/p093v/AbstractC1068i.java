package p093v;

import java.util.ArrayList;
import p095w.AbstractC1082h;
import p095w.C1088n;

/* JADX INFO: renamed from: v.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068i extends C1063d {

    /* JADX INFO: renamed from: q0 */
    public C1063d[] f4423q0 = new C1063d[4];

    /* JADX INFO: renamed from: r0 */
    public int f4424r0 = 0;

    /* JADX INFO: renamed from: R */
    public final void m2645R(int i2, ArrayList arrayList, C1088n c1088n) {
        for (int i3 = 0; i3 < this.f4424r0; i3++) {
            C1063d c1063d = this.f4423q0[i3];
            ArrayList arrayList2 = c1088n.f4474a;
            if (!arrayList2.contains(c1063d)) {
                arrayList2.add(c1063d);
            }
        }
        for (int i4 = 0; i4 < this.f4424r0; i4++) {
            AbstractC1082h.m2669b(this.f4423q0[i4], i2, arrayList, c1088n);
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo2639S() {
    }
}
