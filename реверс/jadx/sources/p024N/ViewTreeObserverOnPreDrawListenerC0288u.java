package p024N;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: N.u */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0288u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f873a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f874b;

    /* JADX INFO: renamed from: c */
    public final Runnable f875c;

    public ViewTreeObserverOnPreDrawListenerC0288u(View view, Runnable runnable) {
        this.f873a = view;
        this.f874b = view.getViewTreeObserver();
        this.f875c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m914a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0288u viewTreeObserverOnPreDrawListenerC0288u = new ViewTreeObserverOnPreDrawListenerC0288u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0288u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0288u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f874b.isAlive();
        View view = this.f873a;
        if (zIsAlive) {
            this.f874b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f875c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f874b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f874b.isAlive();
        View view2 = this.f873a;
        if (zIsAlive) {
            this.f874b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
