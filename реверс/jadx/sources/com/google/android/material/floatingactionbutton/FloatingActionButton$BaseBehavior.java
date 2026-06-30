package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p079n0.AbstractC1013a;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0002c {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: a */
    public final boolean mo62a(View view) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: c */
    public final void mo64c(C0005f c0005f) {
        if (c0005f.f10h == 0) {
            c0005f.f10h = 80;
        }
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: d */
    public final boolean mo65d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public final boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4026h);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
