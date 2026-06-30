package p074l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0882J0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0884K0 f3546a;

    public ViewOnTouchListenerC0882J0(C0884K0 c0884k0) {
        this.f3546a = c0884k0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0867C c0867c;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C0884K0 c0884k0 = this.f3546a;
        if (action == 0 && (c0867c = c0884k0.f3577z) != null && c0867c.isShowing() && x2 >= 0 && x2 < c0884k0.f3577z.getWidth() && y2 >= 0 && y2 < c0884k0.f3577z.getHeight()) {
            c0884k0.f3573v.postDelayed(c0884k0.f3569r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0884k0.f3573v.removeCallbacks(c0884k0.f3569r);
        return false;
    }
}
