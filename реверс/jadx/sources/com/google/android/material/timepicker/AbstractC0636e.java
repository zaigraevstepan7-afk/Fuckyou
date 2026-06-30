package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p004C.RunnableC0020a;
import p015I0.C0112h;
import p015I0.C0114j;
import p015I0.C0116l;
import p024N.AbstractC0240S;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: com.google.android.material.timepicker.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0636e extends ConstraintLayout {

    /* JADX INFO: renamed from: q */
    public final RunnableC0020a f2448q;

    /* JADX INFO: renamed from: r */
    public int f2449r;

    /* JADX INFO: renamed from: s */
    public final C0112h f2450s;

    public AbstractC0636e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        LayoutInflater.from(context).inflate(R.layout.resc, this);
        C0112h c0112h = new C0112h();
        this.f2450s = c0112h;
        C0114j c0114j = new C0114j(0.5f);
        C0116l c0116lM495e = c0112h.f346a.f328a.m495e();
        c0116lM495e.f375e = c0114j;
        c0116lM495e.f376f = c0114j;
        c0116lM495e.f377g = c0114j;
        c0116lM495e.f378h = c0114j;
        c0112h.setShapeAppearanceModel(c0116lM495e.m489a());
        this.f2450s.m480l(ColorStateList.valueOf(-1));
        C0112h c0112h2 = this.f2450s;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        setBackground(c0112h2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1013a.f4042x, R.attr.resc, 0);
        this.f2449r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2448q = new RunnableC0020a(11, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0020a runnableC0020a = this.f2448q;
            handler.removeCallbacks(runnableC0020a);
            handler.post(runnableC0020a);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1792m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1792m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0020a runnableC0020a = this.f2448q;
            handler.removeCallbacks(runnableC0020a);
            handler.post(runnableC0020a);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f2450s.m480l(ColorStateList.valueOf(i2));
    }
}
