package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p001A0.AbstractC0016e;
import p024N.AbstractC0240S;
import p079n0.AbstractC1013a;
import p083p0.AbstractC1021a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1021a {

    /* JADX INFO: renamed from: b */
    public final int f2048b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: s */
    public static void m1685s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: d */
    public boolean mo65d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0002c abstractC0002c = ((C0005f) view2.getLayoutParams()).f3a;
        if (abstractC0002c instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0002c).getClass();
            int i2 = this.f2048b;
            AbstractC0240S.m780k(view, bottom - (i2 == 0 ? 0 : AbstractC0016e.m183l((int) (0.0f * i2), 0, i2)));
        }
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: h */
    public final boolean mo69h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        m1685s(coordinatorLayout.m1256j(view));
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: l */
    public final void mo73l(CoordinatorLayout coordinatorLayout, View view) {
        m1685s(coordinatorLayout.m1256j(view));
    }

    @Override // p083p0.AbstractC1021a
    /* JADX INFO: renamed from: r */
    public final void mo1686r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        m1685s(coordinatorLayout.m1256j(view));
        coordinatorLayout.m1261q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4043y);
        this.f2048b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: b */
    public final void mo63b(View view) {
    }
}
