package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.ViewOnClickListenerC0615j;
import com.reddit.frontpage.R;
import p024N.AbstractC0240S;
import p024N.C0249a0;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;
import p071j.AbstractC0786a;
import p072k.InterfaceC0799A;
import p072k.MenuC0816m;
import p074l.AbstractC0970s1;
import p074l.C0914a;
import p074l.C0932g;
import p074l.C0944k;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0914a f1294a;

    /* JADX INFO: renamed from: b */
    public final Context f1295b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f1296c;

    /* JADX INFO: renamed from: d */
    public C0944k f1297d;

    /* JADX INFO: renamed from: e */
    public int f1298e;

    /* JADX INFO: renamed from: f */
    public C0249a0 f1299f;

    /* JADX INFO: renamed from: g */
    public boolean f1300g;

    /* JADX INFO: renamed from: h */
    public boolean f1301h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1302i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1303j;

    /* JADX INFO: renamed from: k */
    public View f1304k;

    /* JADX INFO: renamed from: l */
    public View f1305l;

    /* JADX INFO: renamed from: m */
    public View f1306m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f1307n;

    /* JADX INFO: renamed from: o */
    public TextView f1308o;

    /* JADX INFO: renamed from: p */
    public TextView f1309p;

    /* JADX INFO: renamed from: q */
    public final int f1310q;

    /* JADX INFO: renamed from: r */
    public final int f1311r;

    /* JADX INFO: renamed from: s */
    public boolean f1312s;

    /* JADX INFO: renamed from: t */
    public final int f1313t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.resc);
        this.f1294a = new C0914a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.resc, typedValue, true) || typedValue.resourceId == 0) {
            this.f1295b = context;
        } else {
            this.f1295b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2483d, R.attr.resc, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0383m.m1057w(context, resourceId));
        this.f1310q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1311r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1298e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1313t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.resc);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m1199f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m1200g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m1201c(AbstractC0786a abstractC0786a) {
        View view = this.f1304k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1313t, (ViewGroup) this, false);
            this.f1304k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1304k);
        }
        View viewFindViewById = this.f1304k.findViewById(R.id.resc);
        this.f1305l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0615j(2, abstractC0786a));
        MenuC0816m menuC0816mMo1866c = abstractC0786a.mo1866c();
        C0944k c0944k = this.f1297d;
        if (c0944k != null) {
            c0944k.m2382e();
            C0932g c0932g = c0944k.f3752t;
            if (c0932g != null && c0932g.m2206b()) {
                c0932g.f3395i.dismiss();
            }
        }
        C0944k c0944k2 = new C0944k(getContext());
        this.f1297d = c0944k2;
        c0944k2.f3744l = true;
        c0944k2.f3745m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC0816mMo1866c.m2185b(this.f1297d, this.f1295b);
        C0944k c0944k3 = this.f1297d;
        InterfaceC0799A interfaceC0799A = c0944k3.f3740h;
        if (interfaceC0799A == null) {
            InterfaceC0799A interfaceC0799A2 = (InterfaceC0799A) c0944k3.f3736d.inflate(c0944k3.f3738f, (ViewGroup) this, false);
            c0944k3.f3740h = interfaceC0799A2;
            interfaceC0799A2.mo1196c(c0944k3.f3735c);
            c0944k3.mo2152c();
        }
        InterfaceC0799A interfaceC0799A3 = c0944k3.f3740h;
        if (interfaceC0799A != interfaceC0799A3) {
            ((ActionMenuView) interfaceC0799A3).setPresenter(c0944k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0799A3;
        this.f1296c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1296c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m1202d() {
        if (this.f1307n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.resc, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1307n = linearLayout;
            this.f1308o = (TextView) linearLayout.findViewById(R.id.resc);
            this.f1309p = (TextView) this.f1307n.findViewById(R.id.resc);
            int i2 = this.f1310q;
            if (i2 != 0) {
                this.f1308o.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f1311r;
            if (i3 != 0) {
                this.f1309p.setTextAppearance(getContext(), i3);
            }
        }
        this.f1308o.setText(this.f1302i);
        this.f1309p.setText(this.f1303j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1302i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1303j);
        this.f1309p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1307n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1307n.getParent() == null) {
            addView(this.f1307n);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1203e() {
        removeAllViews();
        this.f1306m = null;
        this.f1296c = null;
        this.f1297d = null;
        View view = this.f1305l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1299f != null ? this.f1294a.f3684b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1298e;
    }

    public CharSequence getSubtitle() {
        return this.f1303j;
    }

    public CharSequence getTitle() {
        return this.f1302i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            C0249a0 c0249a0 = this.f1299f;
            if (c0249a0 != null) {
                c0249a0.m806b();
            }
            super.setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0249a0 m1205i(int i2, long j2) {
        C0249a0 c0249a0 = this.f1299f;
        if (c0249a0 != null) {
            c0249a0.m806b();
        }
        C0914a c0914a = this.f1294a;
        if (i2 != 0) {
            C0249a0 c0249a0M770a = AbstractC0240S.m770a(this);
            c0249a0M770a.m805a(0.0f);
            c0249a0M770a.m807c(j2);
            c0914a.f3685c.f1299f = c0249a0M770a;
            c0914a.f3684b = i2;
            c0249a0M770a.m808d(c0914a);
            return c0249a0M770a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0249a0 c0249a0M770a2 = AbstractC0240S.m770a(this);
        c0249a0M770a2.m805a(1.0f);
        c0249a0M770a2.m807c(j2);
        c0914a.f3685c.f1299f = c0249a0M770a2;
        c0914a.f3684b = i2;
        c0249a0M770a2.m808d(c0914a);
        return c0249a0M770a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0641a.f2480a, R.attr.resc, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0944k c0944k = this.f1297d;
        if (c0944k != null) {
            Configuration configuration2 = c0944k.f3734b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c0944k.f3748p = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            MenuC0816m menuC0816m = c0944k.f3735c;
            if (menuC0816m != null) {
                menuC0816m.m2191p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0944k c0944k = this.f1297d;
        if (c0944k != null) {
            c0944k.m2382e();
            C0932g c0932g = this.f1297d.f3752t;
            if (c0932g == null || !c0932g.m2206b()) {
                return;
            }
            c0932g.f3395i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1301h = false;
        }
        if (!this.f1301h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1301h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1301h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = AbstractC0970s1.f3845a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1304k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1304k.getLayoutParams();
            int i6 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z4 ? paddingRight - i6 : paddingRight + i6;
            int iM1200g = m1200g(this.f1304k, i8, paddingTop, paddingTop2, z4) + i8;
            paddingRight = z4 ? iM1200g - i7 : iM1200g + i7;
        }
        LinearLayout linearLayout = this.f1307n;
        if (linearLayout != null && this.f1306m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1200g(this.f1307n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1306m;
        if (view2 != null) {
            m1200g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1296c;
        if (actionMenuView != null) {
            m1200g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f1298e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1304k;
        if (view != null) {
            int iM1199f = m1199f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1304k.getLayoutParams();
            paddingLeft = iM1199f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1296c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1199f(this.f1296c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1307n;
        if (linearLayout != null && this.f1306m == null) {
            if (this.f1312s) {
                this.f1307n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1307n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1307n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m1199f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f1306m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f1306m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f1298e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1300g = false;
        }
        if (!this.f1300g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1300g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1300g = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1298e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1306m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1306m = view;
        if (view != null && (linearLayout = this.f1307n) != null) {
            removeView(linearLayout);
            this.f1307n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1303j = charSequence;
        m1202d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1302i = charSequence;
        m1202d();
        AbstractC0240S.m786q(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1312s) {
            requestLayout();
        }
        this.f1312s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
