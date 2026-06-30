package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: com.google.android.material.timepicker.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0640i implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GestureDetector f2453a;

    public ViewOnTouchListenerC0640i(GestureDetector gestureDetector) {
        this.f2453a = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2453a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
