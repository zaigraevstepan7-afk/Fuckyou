package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p000A.C0001b;
import p024N.AbstractC0240S;
import p026O.C0306f;
import p042W.C0404e;
import p085q0.C1033a;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0002c {

    /* JADX INFO: renamed from: a */
    public C0404e f2063a;

    /* JADX INFO: renamed from: b */
    public boolean f2064b;

    /* JADX INFO: renamed from: c */
    public boolean f2065c;

    /* JADX INFO: renamed from: d */
    public int f2066d = 2;

    /* JADX INFO: renamed from: e */
    public float f2067e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f2068f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final C1033a f2069g = new C1033a(this);

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: f */
    public boolean mo67f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM1259o = this.f2064b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1259o = coordinatorLayout.m1259o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2064b = zM1259o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2064b = false;
        }
        if (zM1259o) {
            if (this.f2063a == null) {
                this.f2063a = new C0404e(coordinatorLayout.getContext(), coordinatorLayout, this.f2069g);
            }
            if (!this.f2065c && this.f2063a.m1130p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: g */
    public final boolean mo68g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0240S.m782m(view, 1048576);
            AbstractC0240S.m778i(view, 0);
            if (mo1688r(view)) {
                AbstractC0240S.m783n(view, C0306f.f899j, new C0001b(28, this));
            }
        }
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* JADX INFO: renamed from: q */
    public final boolean mo78q(View view, MotionEvent motionEvent) {
        if (this.f2063a == null) {
            return false;
        }
        if (this.f2065c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2063a.m1124j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo1688r(View view) {
        return true;
    }
}
