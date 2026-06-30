package p083p0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.C0617l;
import p000A.AbstractC0002c;
import p024N.AbstractC0240S;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1021a extends AbstractC0002c {

    /* JADX INFO: renamed from: a */
    public C0617l f4077a;

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        mo1686r(coordinatorLayout, view, i2);
        if (this.f4077a == null) {
            this.f4077a = new C0617l(view);
        }
        C0617l c0617l = this.f4077a;
        View view2 = (View) c0617l.f2223a;
        c0617l.f2224b = view2.getTop();
        c0617l.f2225c = view2.getLeft();
        C0617l c0617l2 = this.f4077a;
        View view3 = (View) c0617l2.f2223a;
        AbstractC0240S.m780k(view3, 0 - (view3.getTop() - c0617l2.f2224b));
        AbstractC0240S.m779j(view3, 0 - (view3.getLeft() - c0617l2.f2225c));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo1686r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.m1261q(view, i2);
    }
}
