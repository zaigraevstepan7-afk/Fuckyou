package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p024N.ViewTreeObserverOnPreDrawListenerC0288u;

/* JADX INFO: renamed from: androidx.fragment.app.u */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0551u extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f1810a;

    /* JADX INFO: renamed from: b */
    public final View f1811b;

    /* JADX INFO: renamed from: c */
    public boolean f1812c;

    /* JADX INFO: renamed from: d */
    public boolean f1813d;

    /* JADX INFO: renamed from: e */
    public boolean f1814e;

    public RunnableC0551u(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1814e = true;
        this.f1810a = viewGroup;
        this.f1811b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1814e = true;
        if (this.f1812c) {
            return !this.f1813d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1812c = true;
            ViewTreeObserverOnPreDrawListenerC0288u.m914a(this.f1810a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1812c;
        ViewGroup viewGroup = this.f1810a;
        if (z2 || !this.f1814e) {
            viewGroup.endViewTransition(this.f1811b);
            this.f1813d = true;
        } else {
            this.f1814e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f) {
        this.f1814e = true;
        if (this.f1812c) {
            return !this.f1813d;
        }
        if (!super.getTransformation(j2, transformation, f)) {
            this.f1812c = true;
            ViewTreeObserverOnPreDrawListenerC0288u.m914a(this.f1810a, this);
        }
        return true;
    }
}
