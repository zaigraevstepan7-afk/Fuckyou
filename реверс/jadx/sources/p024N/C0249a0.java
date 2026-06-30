package p024N;

import android.view.View;
import java.lang.ref.WeakReference;
import p019K0.C0161c;

/* JADX INFO: renamed from: N.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0249a0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f792a;

    public C0249a0(View view) {
        this.f792a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m805a(float f) {
        View view = (View) this.f792a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m806b() {
        View view = (View) this.f792a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m807c(long j2) {
        View view = (View) this.f792a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m808d(InterfaceC0251b0 interfaceC0251b0) {
        View view = (View) this.f792a.get();
        if (view != null) {
            if (interfaceC0251b0 != null) {
                view.animate().setListener(new C0161c(interfaceC0251b0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m809e(float f) {
        View view = (View) this.f792a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
