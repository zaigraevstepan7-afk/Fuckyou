package p066g0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: g0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0758k extends AbstractC0726N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0762m f3033a;

    public C0758k(C0762m c0762m) {
        this.f3033a = c0762m;
    }

    @Override // p066g0.AbstractC0726N
    /* JADX INFO: renamed from: b */
    public final void mo1734b(RecyclerView recyclerView, int i2, int i3) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0762m c0762m = this.f3033a;
        int iComputeVerticalScrollRange = c0762m.f3067s.computeVerticalScrollRange();
        int i4 = c0762m.f3066r;
        int i5 = iComputeVerticalScrollRange - i4;
        int i6 = c0762m.f3049a;
        c0762m.f3068t = i5 > 0 && i4 >= i6;
        int iComputeHorizontalScrollRange = c0762m.f3067s.computeHorizontalScrollRange();
        int i7 = c0762m.f3065q;
        boolean z2 = iComputeHorizontalScrollRange - i7 > 0 && i7 >= i6;
        c0762m.f3069u = z2;
        boolean z3 = c0762m.f3068t;
        if (!z3 && !z2) {
            if (c0762m.f3070v != 0) {
                c0762m.m2096f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i4;
            c0762m.f3060l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0762m.f3059k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c0762m.f3069u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i7;
            c0762m.f3063o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0762m.f3062n = Math.min(i7, (i7 * i7) / iComputeHorizontalScrollRange);
        }
        int i8 = c0762m.f3070v;
        if (i8 == 0 || i8 == 1) {
            c0762m.m2096f(1);
        }
    }
}
