package p066g0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0529T;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: g0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0742c {

    /* JADX INFO: renamed from: a */
    public final C0713A f2950a;

    /* JADX INFO: renamed from: e */
    public View f2954e;

    /* JADX INFO: renamed from: d */
    public int f2953d = 0;

    /* JADX INFO: renamed from: b */
    public final C0740b f2951b = new C0740b();

    /* JADX INFO: renamed from: c */
    public final ArrayList f2952c = new ArrayList();

    public C0742c(C0713A c0713a) {
        this.f2950a = c0713a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2063a(View view, int i2, boolean z2) {
        RecyclerView recyclerView = this.f2950a.f2845a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : m2068f(i2);
        this.f2951b.m2043e(childCount, z2);
        if (z2) {
            m2071i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1586M(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m2064b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f2950a.f2845a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : m2068f(i2);
        this.f2951b.m2043e(childCount, z2);
        if (z2) {
            m2071i(view);
        }
        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
        if (abstractC0741b0M1586M != null) {
            if (!abstractC0741b0M1586M.m2056j() && !abstractC0741b0M1586M.m2061o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC0741b0M1586M);
                throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, sb));
            }
            if (RecyclerView.f1926A0) {
                Log.d("RecyclerView", "reAttach " + abstractC0741b0M1586M);
            }
            abstractC0741b0M1586M.f2940j &= -257;
        } else if (RecyclerView.f1934z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m2065c(int i2) {
        int iM2068f = m2068f(i2);
        this.f2951b.m2044f(iM2068f);
        RecyclerView recyclerView = this.f2950a.f2845a;
        View childAt = recyclerView.getChildAt(iM2068f);
        if (childAt != null) {
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(childAt);
            if (abstractC0741b0M1586M != null) {
                if (abstractC0741b0M1586M.m2056j() && !abstractC0741b0M1586M.m2061o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC0741b0M1586M);
                    throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, sb));
                }
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC0741b0M1586M);
                }
                abstractC0741b0M1586M.m2047a(256);
            }
        } else if (RecyclerView.f1934z0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM2068f);
            throw new IllegalArgumentException(AbstractC0529T.m1415d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM2068f);
    }

    /* JADX INFO: renamed from: d */
    public final View m2066d(int i2) {
        return this.f2950a.f2845a.getChildAt(m2068f(i2));
    }

    /* JADX INFO: renamed from: e */
    public final int m2067e() {
        return this.f2950a.f2845a.getChildCount() - this.f2952c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m2068f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = this.f2950a.f2845a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            C0740b c0740b = this.f2951b;
            int iM2040b = i2 - (i3 - c0740b.m2040b(i3));
            if (iM2040b == 0) {
                while (c0740b.m2042d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iM2040b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final View m2069g(int i2) {
        return this.f2950a.f2845a.getChildAt(i2);
    }

    /* JADX INFO: renamed from: h */
    public final int m2070h() {
        return this.f2950a.f2845a.getChildCount();
    }

    /* JADX INFO: renamed from: i */
    public final void m2071i(View view) {
        this.f2952c.add(view);
        C0713A c0713a = this.f2950a;
        AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
        if (abstractC0741b0M1586M != null) {
            int i2 = abstractC0741b0M1586M.f2947q;
            View view2 = abstractC0741b0M1586M.f2931a;
            if (i2 != -1) {
                abstractC0741b0M1586M.f2946p = i2;
            } else {
                abstractC0741b0M1586M.f2946p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0713a.f2845a;
            if (!recyclerView.m1608P()) {
                view2.setImportantForAccessibility(4);
            } else {
                abstractC0741b0M1586M.f2947q = 4;
                recyclerView.f1993r0.add(abstractC0741b0M1586M);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2072j(View view) {
        if (this.f2952c.remove(view)) {
            C0713A c0713a = this.f2950a;
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(view);
            if (abstractC0741b0M1586M != null) {
                int i2 = abstractC0741b0M1586M.f2946p;
                RecyclerView recyclerView = c0713a.f2845a;
                if (recyclerView.m1608P()) {
                    abstractC0741b0M1586M.f2947q = i2;
                    recyclerView.f1993r0.add(abstractC0741b0M1586M);
                } else {
                    abstractC0741b0M1586M.f2931a.setImportantForAccessibility(i2);
                }
                abstractC0741b0M1586M.f2946p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2951b.toString() + ", hidden list:" + this.f2952c.size();
    }
}
