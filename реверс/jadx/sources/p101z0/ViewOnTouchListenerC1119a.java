package p101z0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1119a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f4815a;

    /* JADX INFO: renamed from: b */
    public final int f4816b;

    /* JADX INFO: renamed from: c */
    public final int f4817c;

    /* JADX INFO: renamed from: d */
    public final int f4818d;

    public ViewOnTouchListenerC1119a(Dialog dialog, Rect rect) {
        this.f4815a = dialog;
        this.f4816b = rect.left;
        this.f4817c = rect.top;
        this.f4818d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f4816b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f4817c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.f4818d;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f4815a.onTouchEvent(motionEventObtain);
    }
}
