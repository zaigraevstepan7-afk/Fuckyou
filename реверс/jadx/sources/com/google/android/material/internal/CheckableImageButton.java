package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p005C0.C0035a;
import p005C0.C0036b;
import p024N.AbstractC0240S;
import p074l.C0981y;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0981y implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f2276g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f2277d;

    /* JADX INFO: renamed from: e */
    public boolean f2278e;

    /* JADX INFO: renamed from: f */
    public boolean f2279f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f2278e = true;
        this.f2279f = true;
        AbstractC0240S.m785p(this, new C0035a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2277d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f2277d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f2276g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0036b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0036b c0036b = (C0036b) parcelable;
        super.onRestoreInstanceState(c0036b.f1069a);
        setChecked(c0036b.f80c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0036b c0036b = new C0036b(super.onSaveInstanceState());
        c0036b.f80c = this.f2277d;
        return c0036b;
    }

    public void setCheckable(boolean z2) {
        if (this.f2278e != z2) {
            this.f2278e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f2278e || this.f2277d == z2) {
            return;
        }
        this.f2277d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2279f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2279f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2277d);
    }
}
