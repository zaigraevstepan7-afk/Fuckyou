package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p083p0.AbstractC1021a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1021a {

    /* JADX INFO: renamed from: b */
    public boolean f2043b;

    /* JADX INFO: renamed from: d */
    public int f2045d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f2047f;

    /* JADX INFO: renamed from: c */
    public int f2044c = -1;

    /* JADX INFO: renamed from: e */
    public int f2046e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo67f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f2046e < 0) {
            this.f2046e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2043b) {
            int i2 = this.f2044c;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f2045d) > this.f2046e) {
                    this.f2045d = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f2044c = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            VelocityTracker velocityTracker = this.f2047f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // p083p0.AbstractC1021a, p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public final boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: h */
    public final boolean mo69h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo71j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: k */
    public final void mo72k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: m */
    public final void mo74m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: n */
    public final Parcelable mo75n(View view) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: o */
    public final boolean mo76o(View view, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: p */
    public final void mo77p(View view, View view2, int i2) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo78q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2044c);
                if (iFindPointerIndex != -1) {
                    this.f2045d = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f2044c = motionEvent.getPointerId(i2);
                    this.f2045d = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            velocityTracker = this.f2047f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return !this.f2043b;
        }
        VelocityTracker velocityTracker2 = this.f2047f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f2047f.computeCurrentVelocity(1000);
            this.f2047f.getYVelocity(this.f2044c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f2043b = false;
        this.f2044c = -1;
        VelocityTracker velocityTracker3 = this.f2047f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f2047f = null;
        }
        velocityTracker = this.f2047f;
        if (velocityTracker != null) {
        }
        if (!this.f2043b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
