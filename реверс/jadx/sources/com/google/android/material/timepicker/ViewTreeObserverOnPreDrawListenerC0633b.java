package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0633b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f2446a;

    public ViewTreeObserverOnPreDrawListenerC0633b(ClockFaceView clockFaceView) {
        this.f2446a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2446a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2423t.f2433d) - clockFaceView.f2416B;
        if (height != clockFaceView.f2449r) {
            clockFaceView.f2449r = height;
            clockFaceView.mo1792m();
            int i2 = clockFaceView.f2449r;
            ClockHandView clockHandView = clockFaceView.f2423t;
            clockHandView.f2441l = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
