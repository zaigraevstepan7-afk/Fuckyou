package p074l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.reddit.frontpage.R;
import p011G.AbstractC0092a;
import p036T.AbstractC0383m;
import p072k.C0805b;

/* JADX INFO: renamed from: l.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0941j extends C0863A implements InterfaceC0947l {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0944k f3730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941j(C0944k c0944k, Context context) {
        super(context, null, R.attr.resc);
        this.f3730d = c0944k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0383m.m1043g0(this, getContentDescription());
        setOnTouchListener(new C0805b(this, this));
    }

    @Override // p074l.InterfaceC0947l
    /* JADX INFO: renamed from: b */
    public final boolean mo1191b() {
        return false;
    }

    @Override // p074l.InterfaceC0947l
    /* JADX INFO: renamed from: c */
    public final boolean mo1192c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3730d.m2384l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0092a.m427f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
