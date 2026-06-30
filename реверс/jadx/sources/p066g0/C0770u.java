package p066g0;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: g0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0770u {

    /* JADX INFO: renamed from: a */
    public boolean f3110a;

    /* JADX INFO: renamed from: b */
    public int f3111b;

    /* JADX INFO: renamed from: c */
    public int f3112c;

    /* JADX INFO: renamed from: d */
    public int f3113d;

    /* JADX INFO: renamed from: e */
    public int f3114e;

    /* JADX INFO: renamed from: f */
    public int f3115f;

    /* JADX INFO: renamed from: g */
    public int f3116g;

    /* JADX INFO: renamed from: h */
    public int f3117h;

    /* JADX INFO: renamed from: i */
    public int f3118i;

    /* JADX INFO: renamed from: j */
    public int f3119j;

    /* JADX INFO: renamed from: k */
    public List f3120k;

    /* JADX INFO: renamed from: l */
    public boolean f3121l;

    /* JADX INFO: renamed from: a */
    public final void m2107a(View view) {
        int iM2048b;
        int size = this.f3120k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((AbstractC0741b0) this.f3120k.get(i3)).f2931a;
            C0724L c0724l = (C0724L) view3.getLayoutParams();
            if (view3 != view && !c0724l.f2876a.m2054h() && (iM2048b = (c0724l.f2876a.m2048b() - this.f3113d) * this.f3114e) >= 0 && iM2048b < i2) {
                view2 = view3;
                if (iM2048b == 0) {
                    break;
                } else {
                    i2 = iM2048b;
                }
            }
        }
        if (view2 == null) {
            this.f3113d = -1;
        } else {
            this.f3113d = ((C0724L) view2.getLayoutParams()).f2876a.m2048b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m2108b(C0729Q c0729q) {
        List list = this.f3120k;
        if (list == null) {
            View view = c0729q.m2030k(this.f3113d, Long.MAX_VALUE).f2931a;
            this.f3113d += this.f3114e;
            return view;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = ((AbstractC0741b0) this.f3120k.get(i2)).f2931a;
            C0724L c0724l = (C0724L) view2.getLayoutParams();
            if (!c0724l.f2876a.m2054h() && this.f3113d == c0724l.f2876a.m2048b()) {
                m2107a(view2);
                return view2;
            }
        }
        return null;
    }
}
