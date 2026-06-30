package p074l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0984z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC0864A0 f3892b;

    public /* synthetic */ RunnableC0984z0(AbstractViewOnTouchListenerC0864A0 abstractViewOnTouchListenerC0864A0, int i2) {
        this.f3891a = i2;
        this.f3892b = abstractViewOnTouchListenerC0864A0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3891a) {
            case 0:
                ViewParent parent = this.f3892b.f3500d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0864A0 abstractViewOnTouchListenerC0864A0 = this.f3892b;
                abstractViewOnTouchListenerC0864A0.m2273a();
                View view = abstractViewOnTouchListenerC0864A0.f3500d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0864A0.mo2174c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0864A0.f3503g = true;
                    break;
                }
                break;
        }
    }
}
