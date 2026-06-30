package p074l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: l.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0879I extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C0881J f3538a;

    public C0879I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        AbstractC0911Y0.m2344a(this, getContext());
        C0881J c0881j = new C0881J(this);
        this.f3538a = c0881j;
        c0881j.mo2279b(attributeSet, R.attr.resc);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0881J c0881j = this.f3538a;
        Drawable drawable = c0881j.f3541f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0879I c0879i = c0881j.f3540e;
        if (drawable.setState(c0879i.getDrawableState())) {
            c0879i.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3538a.f3541f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3538a.m2289g(canvas);
    }
}
