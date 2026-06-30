package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.reddit.frontpage.R;
import p057d.AbstractC0641a;
import p074l.AbstractC0905V0;
import p074l.C0917b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1285a;

    /* JADX INFO: renamed from: b */
    public View f1286b;

    /* JADX INFO: renamed from: c */
    public View f1287c;

    /* JADX INFO: renamed from: d */
    public Drawable f1288d;

    /* JADX INFO: renamed from: e */
    public Drawable f1289e;

    /* JADX INFO: renamed from: f */
    public Drawable f1290f;

    /* JADX INFO: renamed from: g */
    public final boolean f1291g;

    /* JADX INFO: renamed from: h */
    public boolean f1292h;

    /* JADX INFO: renamed from: i */
    public final int f1293i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0917b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2480a);
        boolean z2 = false;
        this.f1288d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1289e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1293i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.resc) {
            this.f1291g = true;
            this.f1290f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1291g ? !(this.f1288d != null || this.f1289e != null) : this.f1290f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1288d;
        if (drawable != null && drawable.isStateful()) {
            this.f1288d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1289e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1289e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1290f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1290f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1288d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1289e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1290f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1286b = findViewById(R.id.resc);
        this.f1287c = findViewById(R.id.resc);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1285a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1291g) {
            Drawable drawable = this.f1290f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1288d == null) {
                z3 = false;
            } else if (this.f1286b.getVisibility() == 0) {
                this.f1288d.setBounds(this.f1286b.getLeft(), this.f1286b.getTop(), this.f1286b.getRight(), this.f1286b.getBottom());
            } else {
                View view = this.f1287c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1288d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1288d.setBounds(this.f1287c.getLeft(), this.f1287c.getTop(), this.f1287c.getRight(), this.f1287c.getBottom());
                }
            }
            this.f1292h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1286b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1293i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1286b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1288d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1288d);
        }
        this.f1288d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1286b;
            if (view != null) {
                this.f1288d.setBounds(view.getLeft(), this.f1286b.getTop(), this.f1286b.getRight(), this.f1286b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1291g ? !(this.f1288d != null || this.f1289e != null) : this.f1290f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1290f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1290f);
        }
        this.f1290f = drawable;
        boolean z2 = this.f1291g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1290f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1288d != null || this.f1289e != null) : this.f1290f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1289e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1289e);
        }
        this.f1289e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1292h && this.f1289e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1291g ? !(this.f1288d != null || this.f1289e != null) : this.f1290f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1285a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1288d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1289e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1290f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1288d;
        boolean z2 = this.f1291g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f1289e && this.f1292h) {
            return true;
        }
        return (drawable == this.f1290f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(AbstractC0905V0 abstractC0905V0) {
    }
}
