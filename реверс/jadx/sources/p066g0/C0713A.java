package p066g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p024N.C0280q;
import p024N.InterfaceC0262h;

/* JADX INFO: renamed from: g0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0713A implements InterfaceC0262h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f2845a;

    public /* synthetic */ C0713A(RecyclerView recyclerView) {
        this.f2845a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m1966a(C0738a c0738a) {
        int i2 = c0738a.f2918a;
        RecyclerView recyclerView = this.f2845a;
        if (i2 == 1) {
            recyclerView.f1982m.mo1508Y(c0738a.f2919b, c0738a.f2920c);
            return;
        }
        if (i2 == 2) {
            recyclerView.f1982m.mo1511b0(c0738a.f2919b, c0738a.f2920c);
        } else if (i2 == 4) {
            recyclerView.f1982m.mo1512c0(c0738a.f2919b, c0738a.f2920c);
        } else {
            if (i2 != 8) {
                return;
            }
            recyclerView.f1982m.mo1510a0(c0738a.f2919b, c0738a.f2920c);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0741b0 m1967b(int i2) {
        RecyclerView recyclerView = this.f2845a;
        int iM2070h = recyclerView.f1968f.m2070h();
        int i3 = 0;
        AbstractC0741b0 abstractC0741b0 = null;
        while (true) {
            if (i3 >= iM2070h) {
                break;
            }
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(recyclerView.f1968f.m2069g(i3));
            if (abstractC0741b0M1586M != null && !abstractC0741b0M1586M.m2054h() && abstractC0741b0M1586M.f2933c == i2) {
                if (!recyclerView.f1968f.f2952c.contains(abstractC0741b0M1586M.f2931a)) {
                    abstractC0741b0 = abstractC0741b0M1586M;
                    break;
                }
                abstractC0741b0 = abstractC0741b0M1586M;
            }
            i3++;
        }
        if (abstractC0741b0 != null) {
            if (!recyclerView.f1968f.f2952c.contains(abstractC0741b0.f2931a)) {
                return abstractC0741b0;
            }
            if (RecyclerView.f1926A0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m1968c(int i2, int i3) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.f2845a;
        int iM2070h = recyclerView.f1968f.m2070h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < iM2070h; i7++) {
            View viewM2069g = recyclerView.f1968f.m2069g(i7);
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(viewM2069g);
            if (abstractC0741b0M1586M != null && !abstractC0741b0M1586M.m2061o() && (i5 = abstractC0741b0M1586M.f2933c) >= i2 && i5 < i6) {
                abstractC0741b0M1586M.m2047a(2);
                abstractC0741b0M1586M.m2047a(1024);
                ((C0724L) viewM2069g.getLayoutParams()).f2878c = true;
            }
        }
        C0729Q c0729q = recyclerView.f1962c;
        ArrayList arrayList = c0729q.f2889c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(size);
            if (abstractC0741b0 != null && (i4 = abstractC0741b0.f2933c) >= i2 && i4 < i6) {
                abstractC0741b0.m2047a(2);
                c0729q.m2026g(size);
            }
        }
        recyclerView.f1975i0 = true;
    }

    /* JADX INFO: renamed from: d */
    public void m1969d(int i2, int i3) {
        RecyclerView recyclerView = this.f2845a;
        int iM2070h = recyclerView.f1968f.m2070h();
        for (int i4 = 0; i4 < iM2070h; i4++) {
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(recyclerView.f1968f.m2069g(i4));
            if (abstractC0741b0M1586M != null && !abstractC0741b0M1586M.m2061o() && abstractC0741b0M1586M.f2933c >= i2) {
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i4 + " holder " + abstractC0741b0M1586M + " now at position " + (abstractC0741b0M1586M.f2933c + i3));
                }
                abstractC0741b0M1586M.m2058l(i3, false);
                recyclerView.f1967e0.f2909f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1962c.f2889c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(i5);
            if (abstractC0741b0 != null && abstractC0741b0.f2933c >= i2) {
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i5 + " holder " + abstractC0741b0 + " now at position " + (abstractC0741b0.f2933c + i3));
                }
                abstractC0741b0.m2058l(i3, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1973h0 = true;
    }

    /* JADX INFO: renamed from: e */
    public void m1970e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f2845a;
        int iM2070h = recyclerView.f1968f.m2070h();
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        boolean z2 = false;
        for (int i12 = 0; i12 < iM2070h; i12++) {
            AbstractC0741b0 abstractC0741b0M1586M = RecyclerView.m1586M(recyclerView.f1968f.m2069g(i12));
            if (abstractC0741b0M1586M != null && (i11 = abstractC0741b0M1586M.f2933c) >= i5 && i11 <= i4) {
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i12 + " holder " + abstractC0741b0M1586M);
                }
                if (abstractC0741b0M1586M.f2933c == i2) {
                    abstractC0741b0M1586M.m2058l(i3 - i2, false);
                } else {
                    abstractC0741b0M1586M.m2058l(i6, false);
                }
                recyclerView.f1967e0.f2909f = true;
            }
        }
        C0729Q c0729q = recyclerView.f1962c;
        c0729q.getClass();
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
            i9 = -1;
        } else {
            i7 = i2;
            i8 = i3;
            i9 = 1;
        }
        ArrayList arrayList = c0729q.f2889c;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            AbstractC0741b0 abstractC0741b0 = (AbstractC0741b0) arrayList.get(i13);
            if (abstractC0741b0 != null && (i10 = abstractC0741b0.f2933c) >= i8 && i10 <= i7) {
                if (i10 == i2) {
                    abstractC0741b0.m2058l(i3 - i2, z2);
                } else {
                    abstractC0741b0.m2058l(i9, z2);
                }
                if (RecyclerView.f1926A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i13 + " holder " + abstractC0741b0);
                }
            }
            i13++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1973h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1971f(AbstractC0741b0 abstractC0741b0, C0280q c0280q, C0280q c0280q2) {
        boolean zM2075g;
        RecyclerView recyclerView = this.f2845a;
        recyclerView.getClass();
        abstractC0741b0.m2060n(false);
        C0756j c0756j = (C0756j) recyclerView.f1944J;
        if (c0280q != null) {
            c0756j.getClass();
            int i2 = c0280q.f857a;
            int i3 = c0280q2.f857a;
            if (i2 == i3 && c0280q.f858b == c0280q2.f858b) {
                c0756j.m2079l(abstractC0741b0);
                abstractC0741b0.f2931a.setAlpha(0.0f);
                c0756j.f3016i.add(abstractC0741b0);
                zM2075g = true;
            } else {
                zM2075g = c0756j.m2075g(abstractC0741b0, i2, c0280q.f858b, i3, c0280q2.f858b);
            }
        }
        if (zM2075g) {
            recyclerView.m1615W();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1972g(AbstractC0741b0 abstractC0741b0, C0280q c0280q, C0280q c0280q2) {
        boolean zM2075g;
        RecyclerView recyclerView = this.f2845a;
        recyclerView.f1962c.m2031l(abstractC0741b0);
        recyclerView.m1626h(abstractC0741b0);
        abstractC0741b0.m2060n(false);
        C0756j c0756j = (C0756j) recyclerView.f1944J;
        c0756j.getClass();
        int i2 = c0280q.f857a;
        int i3 = c0280q.f858b;
        View view = abstractC0741b0.f2931a;
        int left = c0280q2 == null ? view.getLeft() : c0280q2.f857a;
        int top = c0280q2 == null ? view.getTop() : c0280q2.f858b;
        if (abstractC0741b0.m2054h() || (i2 == left && i3 == top)) {
            c0756j.m2079l(abstractC0741b0);
            c0756j.f3015h.add(abstractC0741b0);
            zM2075g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2075g = c0756j.m2075g(abstractC0741b0, i2, i3, left, top);
        }
        if (zM2075g) {
            recyclerView.m1615W();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1973h(int i2) {
        RecyclerView recyclerView = this.f2845a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.m1586M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }

    @Override // p024N.InterfaceC0262h
    /* JADX INFO: renamed from: i */
    public boolean mo44i(float f) {
        int i2;
        int i3;
        RecyclerView recyclerView = this.f2845a;
        if (recyclerView.f1982m.mo1572e()) {
            i3 = (int) f;
            i2 = 0;
        } else {
            i2 = recyclerView.f1982m.mo1571d() ? (int) f : 0;
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        recyclerView.m1638n0();
        return recyclerView.m1602I(i2, i3, 0, Integer.MAX_VALUE);
    }

    @Override // p024N.InterfaceC0262h
    /* JADX INFO: renamed from: q */
    public float mo52q() {
        float f;
        RecyclerView recyclerView = this.f2845a;
        if (recyclerView.f1982m.mo1572e()) {
            f = recyclerView.f1957W;
        } else {
            if (!recyclerView.f1982m.mo1571d()) {
                return 0.0f;
            }
            f = recyclerView.f1956V;
        }
        return -f;
    }

    @Override // p024N.InterfaceC0262h
    /* JADX INFO: renamed from: x */
    public void mo59x() {
        this.f2845a.m1638n0();
    }
}
