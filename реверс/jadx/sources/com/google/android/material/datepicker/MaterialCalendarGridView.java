package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p024N.AbstractC0240S;
import p036T.C0378h;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f2184a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0628w.m1751c(null);
        if (C0618m.m1738I(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.reddit.frontpage.R.id.resc);
            setNextFocusRightId(com.reddit.frontpage.R.id.resc);
        }
        this.f2184a = C0618m.m1738I(getContext(), com.reddit.frontpage.R.attr.resc);
        AbstractC0240S.m785p(this, new C0378h(3));
    }

    /* JADX INFO: renamed from: a */
    public final C0621p m1731a() {
        return (C0621p) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0621p) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0621p) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0621p c0621p = (C0621p) super.getAdapter();
        c0621p.getClass();
        int iMax = Math.max(c0621p.m1744a(), getFirstVisiblePosition());
        int iMin = Math.min(c0621p.m1746c(), getLastVisiblePosition());
        c0621p.getItem(iMax);
        c0621p.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(((C0621p) super.getAdapter()).m1746c());
        } else if (i2 == 130) {
            setSelection(((C0621p) super.getAdapter()).m1744a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0621p) super.getAdapter()).m1744a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((C0621p) super.getAdapter()).m1744a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f2184a) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((C0621p) super.getAdapter()).m1744a()) {
            super.setSelection(((C0621p) super.getAdapter()).m1744a());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0621p) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0621p)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0621p.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
