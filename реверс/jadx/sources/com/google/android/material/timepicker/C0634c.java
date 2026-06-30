package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.reddit.frontpage.R;
import p024N.C0250b;
import p026O.C0306f;
import p026O.C0310j;
import p026O.C0311k;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0634c extends C0250b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f2447d;

    public C0634c(ClockFaceView clockFaceView) {
        this.f2447d = clockFaceView;
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final void mo251d(View view, C0311k c0311k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f794a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0311k.f911a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.resc)).intValue();
        if (iIntValue > 0) {
            View view2 = (View) this.f2447d.f2427x.get(iIntValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        c0311k.m976j(C0310j.m966a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0311k.m969b(C0306f.f894e);
    }

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: g */
    public final boolean mo813g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.mo813g(view, i2, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2447d;
        view.getHitRect(clockFaceView.f2424u);
        float fCenterX = clockFaceView.f2424u.centerX();
        float fCenterY = clockFaceView.f2424u.centerY();
        clockFaceView.f2423t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f2423t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
