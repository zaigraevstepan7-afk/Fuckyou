package p074l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.reddit.frontpage.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p011G.AbstractC0092a;
import p023M0.RunnableC0191D;
import p036T.ViewOnTouchListenerC0377g;

/* JADX INFO: renamed from: l.x0 */
/* JADX INFO: loaded from: classes.dex */
public class C0980x0 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f3872a;

    /* JADX INFO: renamed from: b */
    public int f3873b;

    /* JADX INFO: renamed from: c */
    public int f3874c;

    /* JADX INFO: renamed from: d */
    public int f3875d;

    /* JADX INFO: renamed from: e */
    public int f3876e;

    /* JADX INFO: renamed from: f */
    public int f3877f;

    /* JADX INFO: renamed from: g */
    public C0976v0 f3878g;

    /* JADX INFO: renamed from: h */
    public boolean f3879h;

    /* JADX INFO: renamed from: i */
    public final boolean f3880i;

    /* JADX INFO: renamed from: j */
    public boolean f3881j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0377g f3882k;

    /* JADX INFO: renamed from: l */
    public RunnableC0191D f3883l;

    public C0980x0(Context context, boolean z2) {
        super(context, null, R.attr.resc);
        this.f3872a = new Rect();
        this.f3873b = 0;
        this.f3874c = 0;
        this.f3875d = 0;
        this.f3876e = 0;
        this.f3880i = z2;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m2434a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2435b(MotionEvent motionEvent, int i2) {
        boolean z2;
        boolean zM2428a;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                z2 = actionMasked != 3;
                if (z2 || z3) {
                    this.f3881j = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f3877f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    ViewOnTouchListenerC0377g viewOnTouchListenerC0377g = this.f3882k;
                    if (viewOnTouchListenerC0377g != null) {
                        if (viewOnTouchListenerC0377g.f1038p) {
                            viewOnTouchListenerC0377g.m1019d();
                        }
                        viewOnTouchListenerC0377g.f1038p = false;
                    }
                } else {
                    if (this.f3882k == null) {
                        this.f3882k = new ViewOnTouchListenerC0377g(this);
                    }
                    ViewOnTouchListenerC0377g viewOnTouchListenerC0377g2 = this.f3882k;
                    boolean z4 = viewOnTouchListenerC0377g2.f1038p;
                    viewOnTouchListenerC0377g2.f1038p = true;
                    viewOnTouchListenerC0377g2.onTouch(this, motionEvent);
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x2;
                float f2 = y2;
                this.f3881j = true;
                int i3 = Build.VERSION.SDK_INT;
                AbstractC0969s0.m2417a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f3877f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3877f = iPointToPosition;
                AbstractC0969s0.m2417a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3872a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3873b;
                rect.top -= this.f3874c;
                rect.right += this.f3875d;
                rect.bottom += this.f3876e;
                if (i3 >= 33) {
                    zM2428a = AbstractC0974u0.m2428a(this);
                } else {
                    Field field = AbstractC0978w0.f3869a;
                    if (field != null) {
                        try {
                            zM2428a = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                            zM2428a = false;
                        }
                    } else {
                        zM2428a = false;
                    }
                }
                if (childAt3.isEnabled() != zM2428a) {
                    boolean z6 = !zM2428a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0974u0.m2429b(this, z6);
                    } else {
                        Field field2 = AbstractC0978w0.f3869a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC0092a.m426e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    AbstractC0092a.m426e(selector2, f, f2);
                }
                C0976v0 c0976v0 = this.f3878g;
                if (c0976v0 != null) {
                    c0976v0.f3862b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            this.f3881j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3877f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3872a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3883l != null) {
            return;
        }
        super.drawableStateChanged();
        C0976v0 c0976v0 = this.f3878g;
        if (c0976v0 != null) {
            c0976v0.f3862b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3881j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3880i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3880i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3880i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3880i && this.f3879h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3883l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3883l == null) {
            RunnableC0191D runnableC0191D = new RunnableC0191D(11, this);
            this.f3883l = runnableC0191D;
            post(runnableC0191D);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i2 < 30 || !AbstractC0972t0.f3857d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0972t0.f3854a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0972t0.f3855b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0972t0.f3856c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f3881j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3877f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0191D runnableC0191D = this.f3883l;
        if (runnableC0191D != null) {
            C0980x0 c0980x0 = (C0980x0) runnableC0191D.f633b;
            c0980x0.f3883l = null;
            c0980x0.removeCallbacks(runnableC0191D);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f3879h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0976v0 c0976v0;
        if (drawable != null) {
            c0976v0 = new C0976v0(drawable);
            c0976v0.f3862b = true;
        } else {
            c0976v0 = null;
        }
        this.f3878g = c0976v0;
        super.setSelector(c0976v0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3873b = rect.left;
        this.f3874c = rect.top;
        this.f3875d = rect.right;
        this.f3876e = rect.bottom;
    }
}
