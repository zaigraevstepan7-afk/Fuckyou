package p066g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p024N.C0280q;

/* JADX INFO: renamed from: g0.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0719G {

    /* JADX INFO: renamed from: a */
    public C0713A f2849a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2850b;

    /* JADX INFO: renamed from: c */
    public long f2851c;

    /* JADX INFO: renamed from: d */
    public long f2852d;

    /* JADX INFO: renamed from: e */
    public long f2853e;

    /* JADX INFO: renamed from: f */
    public long f2854f;

    /* JADX INFO: renamed from: b */
    public static void m1977b(AbstractC0741b0 abstractC0741b0) {
        RecyclerView recyclerView;
        int i2 = abstractC0741b0.f2940j;
        if (abstractC0741b0.m2052f() || (i2 & 4) != 0 || (recyclerView = abstractC0741b0.f2948r) == null) {
            return;
        }
        recyclerView.m1603J(abstractC0741b0);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo1978a(AbstractC0741b0 abstractC0741b0, AbstractC0741b0 abstractC0741b02, C0280q c0280q, C0280q c0280q2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1979c(AbstractC0741b0 abstractC0741b0) {
        C0713A c0713a = this.f2849a;
        if (c0713a != null) {
            boolean z2 = true;
            abstractC0741b0.m2060n(true);
            if (abstractC0741b0.f2938h != null && abstractC0741b0.f2939i == null) {
                abstractC0741b0.f2938h = null;
            }
            abstractC0741b0.f2939i = null;
            if ((abstractC0741b0.f2940j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0713a.f2845a;
            recyclerView.m1631j0();
            C0742c c0742c = recyclerView.f1968f;
            C0740b c0740b = c0742c.f2951b;
            C0713A c0713a2 = c0742c.f2950a;
            int i2 = c0742c.f2953d;
            View view = abstractC0741b0.f2931a;
            if (i2 != 1) {
                if (i2 == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0742c.f2953d = 2;
                    int iIndexOfChild = c0713a2.f2845a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c0742c.m2072j(view);
                    } else if (c0740b.m2042d(iIndexOfChild)) {
                        c0740b.m2044f(iIndexOfChild);
                        c0742c.m2072j(view);
                        c0713a2.m1973h(iIndexOfChild);
                    }
                    if (z2) {
                        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
                        C0729Q c0729q = recyclerView.f1962c;
                        c0729q.m2031l(abstractC0741b0M1586M);
                        c0729q.m2028i(abstractC0741b0M1586M);
                        if (RecyclerView.f1926A0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m1634l0(!z2);
                    if (z2 && abstractC0741b0.m2056j()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0742c.f2953d = 0;
                }
            }
            if (c0742c.f2954e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z2 = false;
            if (z2) {
            }
            recyclerView.m1634l0(!z2);
            if (z2) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1980d(AbstractC0741b0 abstractC0741b0);

    /* JADX INFO: renamed from: e */
    public abstract void mo1981e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo1982f();
}
