package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p024N.AbstractC0240S;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0002c {
    public ExpandableBehavior() {
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: b */
    public abstract void mo63b(View view);

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: d */
    public final boolean mo65d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public final boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM1256j = coordinatorLayout.m1256j(view);
            int size = arrayListM1256j.size();
            for (int i3 = 0; i3 < size; i3++) {
                mo63b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
