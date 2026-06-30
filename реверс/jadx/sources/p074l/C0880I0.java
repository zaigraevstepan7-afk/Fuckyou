package p074l;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880I0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0884K0 f3539a;

    public C0880I0(C0884K0 c0884k0) {
        this.f3539a = c0884k0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            C0884K0 c0884k0 = this.f3539a;
            if (c0884k0.f3577z.getInputMethodMode() == 2 || c0884k0.f3577z.getContentView() == null) {
                return;
            }
            Handler handler = c0884k0.f3573v;
            RunnableC0876G0 runnableC0876G0 = c0884k0.f3569r;
            handler.removeCallbacks(runnableC0876G0);
            runnableC0876G0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
