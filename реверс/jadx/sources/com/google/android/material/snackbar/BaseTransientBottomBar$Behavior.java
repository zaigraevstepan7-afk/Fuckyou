package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p015I0.C0109e;
import p021L0.AbstractC0180c;
import p021L0.C0183f;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final C0109e f2329h;

    public BaseTransientBottomBar$Behavior() {
        C0109e c0109e = new C0109e(2);
        this.f2067e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2068f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2066d = 0;
        this.f2329h = c0109e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000A.AbstractC0002c
    /* JADX INFO: renamed from: f */
    public final boolean mo67f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2329h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0183f.f611b == null) {
                    C0183f.f611b = new C0183f();
                }
                synchronized (C0183f.f611b.f612a) {
                }
            }
        } else if (coordinatorLayout.m1259o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0183f.f611b == null) {
                C0183f.f611b = new C0183f();
            }
            C0183f.f611b.m621a();
        }
        return super.mo67f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo1688r(View view) {
        this.f2329h.getClass();
        return view instanceof AbstractC0180c;
    }
}
