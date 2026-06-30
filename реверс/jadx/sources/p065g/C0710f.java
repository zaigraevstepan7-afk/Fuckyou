package p065g;

import android.graphics.drawable.Drawable;
import p075l0.C0989e;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0710f implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2829a = 0;

    /* JADX INFO: renamed from: b */
    public Object f2830b;

    public /* synthetic */ C0710f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2829a) {
            case 0:
                break;
            default:
                ((C0989e) this.f2830b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f2829a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f2830b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                }
                break;
            default:
                ((C0989e) this.f2830b).scheduleSelf(runnable, j2);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2829a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f2830b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((C0989e) this.f2830b).unscheduleSelf(runnable);
                break;
        }
    }

    public C0710f(C0989e c0989e) {
        this.f2830b = c0989e;
    }

    /* JADX INFO: renamed from: a */
    private final void m1961a(Drawable drawable) {
    }
}
