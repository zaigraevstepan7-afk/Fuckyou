package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reddit.frontpage.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p001A0.AbstractC0016e;
import p019K0.C0161c;
import p081o0.AbstractC1015a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0002c {

    /* JADX INFO: renamed from: b */
    public int f2056b;

    /* JADX INFO: renamed from: c */
    public int f2057c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f2058d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f2059e;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f2062h;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f2055a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f2060f = 0;

    /* JADX INFO: renamed from: g */
    public int f2061g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f2060f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2056b = AbstractC0016e.m193q0(view.getContext(), R.attr.resc, 225);
        this.f2057c = AbstractC0016e.m193q0(view.getContext(), R.attr.resc, 175);
        this.f2058d = AbstractC0016e.m195r0(view.getContext(), R.attr.resc, AbstractC1015a.f4049d);
        this.f2059e = AbstractC0016e.m195r0(view.getContext(), R.attr.resc, AbstractC1015a.f4048c);
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: k */
    public final void mo72k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2055a;
        if (i2 > 0) {
            if (this.f2061g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2062h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2061g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f2062h = view.animate().translationY(this.f2060f).setInterpolator(this.f2059e).setDuration(this.f2057c).setListener(new C0161c(6, this));
            return;
        }
        if (i2 >= 0 || this.f2061g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2062h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2061g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f2062h = view.animate().translationY(0).setInterpolator(this.f2058d).setDuration(this.f2056b).setListener(new C0161c(6, this));
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: o */
    public boolean mo76o(View view, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
