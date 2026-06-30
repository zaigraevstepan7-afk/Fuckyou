package p074l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p072k.InterfaceC0801C;

/* JADX INFO: renamed from: l.A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0864A0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f3497a;

    /* JADX INFO: renamed from: b */
    public final int f3498b;

    /* JADX INFO: renamed from: c */
    public final int f3499c;

    /* JADX INFO: renamed from: d */
    public final View f3500d;

    /* JADX INFO: renamed from: e */
    public RunnableC0984z0 f3501e;

    /* JADX INFO: renamed from: f */
    public RunnableC0984z0 f3502f;

    /* JADX INFO: renamed from: g */
    public boolean f3503g;

    /* JADX INFO: renamed from: h */
    public int f3504h;

    /* JADX INFO: renamed from: i */
    public final int[] f3505i = new int[2];

    public AbstractViewOnTouchListenerC0864A0(View view) {
        this.f3500d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3497a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3498b = tapTimeout;
        this.f3499c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2273a() {
        RunnableC0984z0 runnableC0984z0 = this.f3502f;
        View view = this.f3500d;
        if (runnableC0984z0 != null) {
            view.removeCallbacks(runnableC0984z0);
        }
        RunnableC0984z0 runnableC0984z02 = this.f3501e;
        if (runnableC0984z02 != null) {
            view.removeCallbacks(runnableC0984z02);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0801C mo2173b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2174c();

    /* JADX INFO: renamed from: d */
    public boolean mo2175d() {
        InterfaceC0801C interfaceC0801CMo2173b = mo2173b();
        if (interfaceC0801CMo2173b == null || !interfaceC0801CMo2173b.mo2148a()) {
            return true;
        }
        interfaceC0801CMo2173b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0980x0 c0980x0Mo2149e;
        boolean z3 = this.f3503g;
        View view2 = this.f3500d;
        if (z3) {
            InterfaceC0801C interfaceC0801CMo2173b = mo2173b();
            if (interfaceC0801CMo2173b == null || !interfaceC0801CMo2173b.mo2148a() || (c0980x0Mo2149e = interfaceC0801CMo2173b.mo2149e()) == null || !c0980x0Mo2149e.isShown()) {
                z2 = !mo2175d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f3505i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0980x0Mo2149e.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM2435b = c0980x0Mo2149e.m2435b(motionEventObtainNoHistory, this.f3504h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM2435b || !z4) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f3504h = motionEvent.getPointerId(0);
                if (this.f3501e == null) {
                    this.f3501e = new RunnableC0984z0(this, 0);
                }
                view2.postDelayed(this.f3501e, this.f3498b);
                if (this.f3502f == null) {
                    this.f3502f = new RunnableC0984z0(this, 1);
                }
                view2.postDelayed(this.f3502f, this.f3499c);
            } else if (actionMasked2 == 1) {
                m2273a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3504h);
                if (iFindPointerIndex >= 0) {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float f = this.f3497a;
                    float f2 = -f;
                    if (x2 < f2 || y2 < f2 || x2 >= (view2.getRight() - view2.getLeft()) + f || y2 >= (view2.getBottom() - view2.getTop()) + f) {
                        m2273a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        z2 = mo2174c();
                        if (z2) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            if (z2) {
            }
        } else {
            if (z2) {
            }
        }
        this.f3503g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3503g = false;
        this.f3504h = -1;
        RunnableC0984z0 runnableC0984z0 = this.f3501e;
        if (runnableC0984z0 != null) {
            this.f3500d.removeCallbacks(runnableC0984z0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
