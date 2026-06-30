package p066g0;

import android.view.View;
import androidx.emoji2.text.AbstractC0493g;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: g0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0775z extends AbstractC0725M {

    /* JADX INFO: renamed from: a */
    public RecyclerView f3144a;

    /* JADX INFO: renamed from: b */
    public final C0747e0 f3145b = new C0747e0(this);

    /* JADX INFO: renamed from: c */
    public C0773x f3146c;

    /* JADX INFO: renamed from: d */
    public C0773x f3147d;

    /* JADX INFO: renamed from: b */
    public static int m2117b(View view, AbstractC0493g abstractC0493g) {
        return ((abstractC0493g.mo1290c(view) / 2) + abstractC0493g.mo1292e(view)) - ((abstractC0493g.mo1299l() / 2) + abstractC0493g.mo1298k());
    }

    /* JADX INFO: renamed from: c */
    public static View m2118c(AbstractC0723K abstractC0723K, AbstractC0493g abstractC0493g) {
        int iM2014v = abstractC0723K.m2014v();
        View view = null;
        if (iM2014v == 0) {
            return null;
        }
        int iMo1299l = (abstractC0493g.mo1299l() / 2) + abstractC0493g.mo1298k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iM2014v; i3++) {
            View viewM2013u = abstractC0723K.m2013u(i3);
            int iAbs = Math.abs(((abstractC0493g.mo1290c(viewM2013u) / 2) + abstractC0493g.mo1292e(viewM2013u)) - iMo1299l);
            if (iAbs < i2) {
                view = viewM2013u;
                i2 = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m2119a(AbstractC0723K abstractC0723K, View view) {
        int[] iArr = new int[2];
        if (abstractC0723K.mo1571d()) {
            iArr[0] = m2117b(view, m2120d(abstractC0723K));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0723K.mo1572e()) {
            iArr[1] = m2117b(view, m2121e(abstractC0723K));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0493g m2120d(AbstractC0723K abstractC0723K) {
        C0773x c0773x = this.f3147d;
        if (c0773x == null || ((AbstractC0723K) c0773x.f1517b) != abstractC0723K) {
            this.f3147d = new C0773x(abstractC0723K, 0);
        }
        return this.f3147d;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0493g m2121e(AbstractC0723K abstractC0723K) {
        C0773x c0773x = this.f3146c;
        if (c0773x == null || ((AbstractC0723K) c0773x.f1517b) != abstractC0723K) {
            this.f3146c = new C0773x(abstractC0723K, 1);
        }
        return this.f3146c;
    }

    /* JADX INFO: renamed from: f */
    public final void m2122f() {
        AbstractC0723K layoutManager;
        RecyclerView recyclerView = this.f3144a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM2118c = layoutManager.mo1572e() ? m2118c(layoutManager, m2121e(layoutManager)) : layoutManager.mo1571d() ? m2118c(layoutManager, m2120d(layoutManager)) : null;
        if (viewM2118c == null) {
            return;
        }
        int[] iArrM2119a = m2119a(layoutManager, viewM2118c);
        int i2 = iArrM2119a[0];
        if (i2 == 0 && iArrM2119a[1] == 0) {
            return;
        }
        this.f3144a.m1627h0(i2, iArrM2119a[1], false);
    }
}
