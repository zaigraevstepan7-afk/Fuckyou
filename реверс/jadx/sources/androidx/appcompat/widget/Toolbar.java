package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0511A;
import com.google.android.material.datepicker.ViewOnClickListenerC0615j;
import com.reddit.frontpage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p023M0.RunnableC0191D;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;
import p071j.C0793h;
import p072k.C0818o;
import p072k.MenuC0816m;
import p074l.AbstractC0928e1;
import p074l.AbstractC0970s1;
import p074l.C0863A;
import p074l.C0903U0;
import p074l.C0925d1;
import p074l.C0927e0;
import p074l.C0931f1;
import p074l.C0934g1;
import p074l.C0940i1;
import p074l.C0944k;
import p074l.C0946k1;
import p074l.C0981y;
import p074l.InterfaceC0937h1;
import p074l.InterfaceC0957o0;
import p074l.RunnableC0922c1;
import p074l.ViewOnClickListenerC0943j1;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1371A;

    /* JADX INFO: renamed from: B */
    public boolean f1372B;

    /* JADX INFO: renamed from: C */
    public boolean f1373C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f1374D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f1375E;

    /* JADX INFO: renamed from: F */
    public final int[] f1376F;

    /* JADX INFO: renamed from: G */
    public final C0270l f1377G;

    /* JADX INFO: renamed from: H */
    public ArrayList f1378H;

    /* JADX INFO: renamed from: I */
    public final C0925d1 f1379I;

    /* JADX INFO: renamed from: J */
    public C0946k1 f1380J;

    /* JADX INFO: renamed from: K */
    public C0944k f1381K;

    /* JADX INFO: renamed from: L */
    public C0931f1 f1382L;

    /* JADX INFO: renamed from: M */
    public boolean f1383M;

    /* JADX INFO: renamed from: N */
    public OnBackInvokedCallback f1384N;

    /* JADX INFO: renamed from: O */
    public OnBackInvokedDispatcher f1385O;

    /* JADX INFO: renamed from: P */
    public boolean f1386P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC0191D f1387Q;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1388a;

    /* JADX INFO: renamed from: b */
    public C0927e0 f1389b;

    /* JADX INFO: renamed from: c */
    public C0927e0 f1390c;

    /* JADX INFO: renamed from: d */
    public C0981y f1391d;

    /* JADX INFO: renamed from: e */
    public C0863A f1392e;

    /* JADX INFO: renamed from: f */
    public final Drawable f1393f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f1394g;

    /* JADX INFO: renamed from: h */
    public C0981y f1395h;

    /* JADX INFO: renamed from: i */
    public View f1396i;

    /* JADX INFO: renamed from: j */
    public Context f1397j;

    /* JADX INFO: renamed from: k */
    public int f1398k;

    /* JADX INFO: renamed from: l */
    public int f1399l;

    /* JADX INFO: renamed from: m */
    public int f1400m;

    /* JADX INFO: renamed from: n */
    public final int f1401n;

    /* JADX INFO: renamed from: o */
    public final int f1402o;

    /* JADX INFO: renamed from: p */
    public int f1403p;

    /* JADX INFO: renamed from: q */
    public int f1404q;

    /* JADX INFO: renamed from: r */
    public int f1405r;

    /* JADX INFO: renamed from: s */
    public int f1406s;

    /* JADX INFO: renamed from: t */
    public C0903U0 f1407t;

    /* JADX INFO: renamed from: u */
    public int f1408u;

    /* JADX INFO: renamed from: v */
    public int f1409v;

    /* JADX INFO: renamed from: w */
    public final int f1410w;

    /* JADX INFO: renamed from: x */
    public CharSequence f1411x;

    /* JADX INFO: renamed from: y */
    public CharSequence f1412y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f1413z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0793h(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C0934g1 m1219h() {
        C0934g1 c0934g1 = new C0934g1(-2, -2);
        c0934g1.f3724b = 0;
        c0934g1.f3723a = 8388627;
        return c0934g1;
    }

    /* JADX INFO: renamed from: i */
    public static C0934g1 m1220i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C0934g1;
        if (z2) {
            C0934g1 c0934g1 = (C0934g1) layoutParams;
            C0934g1 c0934g12 = new C0934g1(c0934g1);
            c0934g12.f3724b = 0;
            c0934g12.f3724b = c0934g1.f3724b;
            return c0934g12;
        }
        if (z2) {
            C0934g1 c0934g13 = new C0934g1((C0934g1) layoutParams);
            c0934g13.f3724b = 0;
            return c0934g13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C0934g1 c0934g14 = new C0934g1(layoutParams);
            c0934g14.f3724b = 0;
            return c0934g14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C0934g1 c0934g15 = new C0934g1(marginLayoutParams);
        c0934g15.f3724b = 0;
        ((ViewGroup.MarginLayoutParams) c0934g15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c0934g15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c0934g15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c0934g15).bottomMargin = marginLayoutParams.bottomMargin;
        return c0934g15;
    }

    /* JADX INFO: renamed from: k */
    public static int m1221k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m1222l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m1223a(ArrayList arrayList, int i2) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0934g1 c0934g1 = (C0934g1) childAt.getLayoutParams();
                if (c0934g1.f3724b == 0 && m1238t(childAt)) {
                    int i4 = c0934g1.f3723a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            C0934g1 c0934g12 = (C0934g1) childAt2.getLayoutParams();
            if (c0934g12.f3724b == 0 && m1238t(childAt2)) {
                int i6 = c0934g12.f3723a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1224b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0934g1 c0934g1M1219h = layoutParams == null ? m1219h() : !checkLayoutParams(layoutParams) ? m1220i(layoutParams) : (C0934g1) layoutParams;
        c0934g1M1219h.f3724b = 1;
        if (!z2 || this.f1396i == null) {
            addView(view, c0934g1M1219h);
        } else {
            view.setLayoutParams(c0934g1M1219h);
            this.f1375E.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1225c() {
        if (this.f1395h == null) {
            C0981y c0981y = new C0981y(getContext(), null, R.attr.resc);
            this.f1395h = c0981y;
            c0981y.setImageDrawable(this.f1393f);
            this.f1395h.setContentDescription(this.f1394g);
            C0934g1 c0934g1M1219h = m1219h();
            c0934g1M1219h.f3723a = (this.f1401n & 112) | 8388611;
            c0934g1M1219h.f3724b = 2;
            this.f1395h.setLayoutParams(c0934g1M1219h);
            this.f1395h.setOnClickListener(new ViewOnClickListenerC0615j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0934g1);
    }

    /* JADX INFO: renamed from: d */
    public final void m1226d() {
        if (this.f1407t == null) {
            C0903U0 c0903u0 = new C0903U0();
            c0903u0.f3618a = 0;
            c0903u0.f3619b = 0;
            c0903u0.f3620c = Integer.MIN_VALUE;
            c0903u0.f3621d = Integer.MIN_VALUE;
            c0903u0.f3622e = 0;
            c0903u0.f3623f = 0;
            c0903u0.f3624g = false;
            c0903u0.f3625h = false;
            this.f1407t = c0903u0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1227e() {
        m1228f();
        ActionMenuView actionMenuView = this.f1388a;
        if (actionMenuView.f1345p == null) {
            MenuC0816m menuC0816m = (MenuC0816m) actionMenuView.getMenu();
            if (this.f1382L == null) {
                this.f1382L = new C0931f1(this);
            }
            this.f1388a.setExpandedActionViewsExclusive(true);
            menuC0816m.m2185b(this.f1382L, this.f1397j);
            m1239u();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1228f() {
        if (this.f1388a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1388a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1398k);
            this.f1388a.setOnMenuItemClickListener(this.f1379I);
            ActionMenuView actionMenuView2 = this.f1388a;
            C0925d1 c0925d1 = new C0925d1(this);
            actionMenuView2.getClass();
            actionMenuView2.f1350u = c0925d1;
            C0934g1 c0934g1M1219h = m1219h();
            c0934g1M1219h.f3723a = (this.f1401n & 112) | 8388613;
            this.f1388a.setLayoutParams(c0934g1M1219h);
            m1224b(this.f1388a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1229g() {
        if (this.f1391d == null) {
            this.f1391d = new C0981y(getContext(), null, R.attr.resc);
            C0934g1 c0934g1M1219h = m1219h();
            c0934g1M1219h.f3723a = (this.f1401n & 112) | 8388611;
            this.f1391d.setLayoutParams(c0934g1M1219h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1219h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1220i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0981y c0981y = this.f1395h;
        if (c0981y != null) {
            return c0981y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0981y c0981y = this.f1395h;
        if (c0981y != null) {
            return c0981y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0903U0 c0903u0 = this.f1407t;
        if (c0903u0 != null) {
            return c0903u0.f3624g ? c0903u0.f3618a : c0903u0.f3619b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1409v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0903U0 c0903u0 = this.f1407t;
        if (c0903u0 != null) {
            return c0903u0.f3618a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0903U0 c0903u0 = this.f1407t;
        if (c0903u0 != null) {
            return c0903u0.f3619b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0903U0 c0903u0 = this.f1407t;
        if (c0903u0 != null) {
            return c0903u0.f3624g ? c0903u0.f3619b : c0903u0.f3618a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1408u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0816m menuC0816m;
        ActionMenuView actionMenuView = this.f1388a;
        return (actionMenuView == null || (menuC0816m = actionMenuView.f1345p) == null || !menuC0816m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1409v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1408u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0863A c0863a = this.f1392e;
        if (c0863a != null) {
            return c0863a.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0863A c0863a = this.f1392e;
        if (c0863a != null) {
            return c0863a.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1227e();
        return this.f1388a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1391d;
    }

    public CharSequence getNavigationContentDescription() {
        C0981y c0981y = this.f1391d;
        if (c0981y != null) {
            return c0981y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0981y c0981y = this.f1391d;
        if (c0981y != null) {
            return c0981y.getDrawable();
        }
        return null;
    }

    public C0944k getOuterActionMenuPresenter() {
        return this.f1381K;
    }

    public Drawable getOverflowIcon() {
        m1227e();
        return this.f1388a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1397j;
    }

    public int getPopupTheme() {
        return this.f1398k;
    }

    public CharSequence getSubtitle() {
        return this.f1412y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1390c;
    }

    public CharSequence getTitle() {
        return this.f1411x;
    }

    public int getTitleMarginBottom() {
        return this.f1406s;
    }

    public int getTitleMarginEnd() {
        return this.f1404q;
    }

    public int getTitleMarginStart() {
        return this.f1403p;
    }

    public int getTitleMarginTop() {
        return this.f1405r;
    }

    public final TextView getTitleTextView() {
        return this.f1389b;
    }

    public InterfaceC0957o0 getWrapper() {
        Drawable drawable;
        if (this.f1380J == null) {
            C0946k1 c0946k1 = new C0946k1();
            c0946k1.f3782n = 0;
            c0946k1.f3769a = this;
            c0946k1.f3776h = getTitle();
            c0946k1.f3777i = getSubtitle();
            c0946k1.f3775g = c0946k1.f3776h != null;
            c0946k1.f3774f = getNavigationIcon();
            C0270l c0270lM838m = C0270l.m838m(getContext(), null, AbstractC0641a.f2480a, R.attr.resc);
            c0946k1.f3783o = c0270lM838m.m845h(15);
            TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c0946k1.f3775g = true;
                c0946k1.f3776h = text;
                if ((c0946k1.f3770b & 8) != 0) {
                    Toolbar toolbar = c0946k1.f3769a;
                    toolbar.setTitle(text);
                    if (c0946k1.f3775g) {
                        AbstractC0240S.m786q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c0946k1.f3777i = text2;
                if ((c0946k1.f3770b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM845h = c0270lM838m.m845h(20);
            if (drawableM845h != null) {
                c0946k1.f3773e = drawableM845h;
                c0946k1.m2398c();
            }
            Drawable drawableM845h2 = c0270lM838m.m845h(17);
            if (drawableM845h2 != null) {
                c0946k1.f3772d = drawableM845h2;
                c0946k1.m2398c();
            }
            if (c0946k1.f3774f == null && (drawable = c0946k1.f3783o) != null) {
                c0946k1.f3774f = drawable;
                int i2 = c0946k1.f3770b & 4;
                Toolbar toolbar2 = c0946k1.f3769a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c0946k1.m2396a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c0946k1.f3771c;
                if (view != null && (c0946k1.f3770b & 16) != 0) {
                    removeView(view);
                }
                c0946k1.f3771c = viewInflate;
                if (viewInflate != null && (c0946k1.f3770b & 16) != 0) {
                    addView(viewInflate);
                }
                c0946k1.m2396a(c0946k1.f3770b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m1226d();
                this.f1407t.m2332a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1399l = resourceId2;
                C0927e0 c0927e0 = this.f1389b;
                if (c0927e0 != null) {
                    c0927e0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1400m = resourceId3;
                C0927e0 c0927e02 = this.f1390c;
                if (c0927e02 != null) {
                    c0927e02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0270lM838m.m851o();
            if (R.string.resc != c0946k1.f3782n) {
                c0946k1.f3782n = R.string.resc;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c0946k1.f3782n;
                    c0946k1.f3778j = i3 != 0 ? getContext().getString(i3) : null;
                    c0946k1.m2397b();
                }
            }
            c0946k1.f3778j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0943j1(c0946k1));
            this.f1380J = c0946k1;
        }
        return this.f1380J;
    }

    /* JADX INFO: renamed from: j */
    public final int m1230j(View view, int i2) {
        C0934g1 c0934g1 = (C0934g1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = c0934g1.f3723a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1410w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0934g1).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c0934g1).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c0934g1).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public void mo1231m(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    /* JADX INFO: renamed from: n */
    public final void m1232n() {
        Iterator it = this.f1378H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1377G.f837b).iterator();
        while (it2.hasNext()) {
            ((C0511A) it2.next()).f1564a.m1367j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1378H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1233o(View view) {
        return view.getParent() == this || this.f1375E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1239u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1387Q);
        m1239u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1373C = false;
        }
        if (!this.f1373C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1373C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1373C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0317 A[LOOP:3: B:117:0x0315->B:118:0x0317, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iM1234p;
        int iM1235q;
        int iMax;
        boolean zM1238t;
        boolean zM1238t2;
        boolean z3;
        int measuredHeight;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int size;
        int iM1234p2;
        int i11;
        int size2;
        int i12;
        int size3;
        int i13;
        int i14;
        int i15;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = width - paddingRight;
        int[] iArr = this.f1376F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!m1238t(this.f1391d)) {
            iM1234p = paddingLeft;
        } else {
            if (z4) {
                iM1235q = m1235q(this.f1391d, i16, iMin, iArr);
                iM1234p = paddingLeft;
                if (m1238t(this.f1395h)) {
                    if (z4) {
                        iM1235q = m1235q(this.f1395h, iM1235q, iMin, iArr);
                    } else {
                        iM1234p = m1234p(this.f1395h, iM1234p, iMin, iArr);
                    }
                }
                if (m1238t(this.f1388a)) {
                    if (z4) {
                        iM1234p = m1234p(this.f1388a, iM1234p, iMin, iArr);
                    } else {
                        iM1235q = m1235q(this.f1388a, iM1235q, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM1234p);
                iArr[1] = Math.max(0, currentContentInsetRight - (i16 - iM1235q));
                iMax = Math.max(iM1234p, currentContentInsetLeft);
                int iMin2 = Math.min(iM1235q, i16 - currentContentInsetRight);
                if (m1238t(this.f1396i)) {
                    if (z4) {
                        iMin2 = m1235q(this.f1396i, iMin2, iMin, iArr);
                    } else {
                        iMax = m1234p(this.f1396i, iMax, iMin, iArr);
                    }
                }
                if (m1238t(this.f1392e)) {
                    if (z4) {
                        iMin2 = m1235q(this.f1392e, iMin2, iMin, iArr);
                    } else {
                        iMax = m1234p(this.f1392e, iMax, iMin, iArr);
                    }
                }
                zM1238t = m1238t(this.f1389b);
                zM1238t2 = m1238t(this.f1390c);
                if (zM1238t) {
                    z3 = z4;
                    measuredHeight = 0;
                } else {
                    C0934g1 c0934g1 = (C0934g1) this.f1389b.getLayoutParams();
                    z3 = z4;
                    measuredHeight = this.f1389b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0934g1).topMargin + ((ViewGroup.MarginLayoutParams) c0934g1).bottomMargin;
                }
                if (!zM1238t2) {
                    C0934g1 c0934g12 = (C0934g1) this.f1390c.getLayoutParams();
                    measuredHeight = this.f1390c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0934g12).topMargin + ((ViewGroup.MarginLayoutParams) c0934g12).bottomMargin + measuredHeight;
                }
                if (!zM1238t || zM1238t2) {
                    C0927e0 c0927e0 = !zM1238t ? this.f1389b : this.f1390c;
                    C0927e0 c0927e02 = !zM1238t2 ? this.f1390c : this.f1389b;
                    C0934g1 c0934g13 = (C0934g1) c0927e0.getLayoutParams();
                    C0934g1 c0934g14 = (C0934g1) c0927e02.getLayoutParams();
                    int i17 = measuredHeight;
                    boolean z5 = (zM1238t && this.f1389b.getMeasuredWidth() > 0) || (zM1238t2 && this.f1390c.getMeasuredWidth() > 0);
                    i6 = this.f1410w & 112;
                    int i18 = iMax;
                    if (i6 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0934g13).topMargin + this.f1405r;
                    } else if (i6 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i17) / 2;
                        int i19 = ((ViewGroup.MarginLayoutParams) c0934g13).topMargin + this.f1405r;
                        if (iMax2 < i19) {
                            iMax2 = i19;
                        } else {
                            int i20 = (((height - paddingBottom) - i17) - iMax2) - paddingTop2;
                            int i21 = ((ViewGroup.MarginLayoutParams) c0934g13).bottomMargin;
                            int i22 = this.f1406s;
                            if (i20 < i21 + i22) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0934g14).bottomMargin + i22) - i20));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0934g14).bottomMargin) - this.f1406s) - i17;
                    }
                    if (z3) {
                        int i23 = (z5 ? this.f1403p : 0) - iArr[1];
                        iMin2 -= Math.max(0, i23);
                        iArr[1] = Math.max(0, -i23);
                        if (zM1238t) {
                            C0934g1 c0934g15 = (C0934g1) this.f1389b.getLayoutParams();
                            int measuredWidth = iMin2 - this.f1389b.getMeasuredWidth();
                            int measuredHeight2 = this.f1389b.getMeasuredHeight() + paddingTop;
                            this.f1389b.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i9 = measuredWidth - this.f1404q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0934g15).bottomMargin;
                        } else {
                            i9 = iMin2;
                        }
                        if (zM1238t2) {
                            int i24 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0934g1) this.f1390c.getLayoutParams())).topMargin;
                            this.f1390c.layout(iMin2 - this.f1390c.getMeasuredWidth(), i24, iMin2, this.f1390c.getMeasuredHeight() + i24);
                            i10 = iMin2 - this.f1404q;
                        } else {
                            i10 = iMin2;
                        }
                        if (z5) {
                            iMin2 = Math.min(i9, i10);
                        }
                        iMax = i18;
                    } else {
                        int i25 = (z5 ? this.f1403p : 0) - iArr[0];
                        iMax = Math.max(0, i25) + i18;
                        iArr[0] = Math.max(0, -i25);
                        if (zM1238t) {
                            C0934g1 c0934g16 = (C0934g1) this.f1389b.getLayoutParams();
                            int measuredWidth2 = this.f1389b.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f1389b.getMeasuredHeight() + paddingTop;
                            this.f1389b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i7 = measuredWidth2 + this.f1404q;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0934g16).bottomMargin;
                        } else {
                            i7 = iMax;
                        }
                        if (zM1238t2) {
                            int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0934g1) this.f1390c.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f1390c.getMeasuredWidth() + iMax;
                            this.f1390c.layout(iMax, i26, measuredWidth3, this.f1390c.getMeasuredHeight() + i26);
                            i8 = measuredWidth3 + this.f1404q;
                        } else {
                            i8 = iMax;
                        }
                        if (z5) {
                            iMax = Math.max(i7, i8);
                        }
                    }
                }
                ArrayList arrayList = this.f1374D;
                m1223a(arrayList, 3);
                size = arrayList.size();
                iM1234p2 = iMax;
                for (i11 = 0; i11 < size; i11++) {
                    iM1234p2 = m1234p((View) arrayList.get(i11), iM1234p2, iMin, iArr);
                }
                m1223a(arrayList, 5);
                size2 = arrayList.size();
                for (i12 = 0; i12 < size2; i12++) {
                    iMin2 = m1235q((View) arrayList.get(i12), iMin2, iMin, iArr);
                }
                m1223a(arrayList, 1);
                int i27 = iArr[0];
                int i28 = iArr[1];
                size3 = arrayList.size();
                int i29 = i28;
                int i30 = i27;
                i13 = 0;
                int measuredWidth4 = 0;
                while (i13 < size3) {
                    View view = (View) arrayList.get(i13);
                    C0934g1 c0934g17 = (C0934g1) view.getLayoutParams();
                    int i31 = i13;
                    int i32 = ((ViewGroup.MarginLayoutParams) c0934g17).leftMargin - i30;
                    int i33 = ((ViewGroup.MarginLayoutParams) c0934g17).rightMargin - i29;
                    int iMax3 = Math.max(0, i32);
                    int iMax4 = Math.max(0, i33);
                    int iMax5 = Math.max(0, -i32);
                    int iMax6 = Math.max(0, -i33);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i29 = iMax6;
                    i30 = iMax5;
                    i13 = i31 + 1;
                }
                i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i34 = measuredWidth4 + i15;
                if (i15 >= iM1234p2) {
                    iM1234p2 = i34 > iMin2 ? i15 - (i34 - iMin2) : i15;
                }
                size4 = arrayList.size();
                for (i14 = 0; i14 < size4; i14++) {
                    iM1234p2 = m1234p((View) arrayList.get(i14), iM1234p2, iMin, iArr);
                }
                arrayList.clear();
            }
            iM1234p = m1234p(this.f1391d, paddingLeft, iMin, iArr);
        }
        iM1235q = i16;
        if (m1238t(this.f1395h)) {
        }
        if (m1238t(this.f1388a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM1234p);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i16 - iM1235q));
        iMax = Math.max(iM1234p, currentContentInsetLeft2);
        int iMin22 = Math.min(iM1235q, i16 - currentContentInsetRight2);
        if (m1238t(this.f1396i)) {
        }
        if (m1238t(this.f1392e)) {
        }
        zM1238t = m1238t(this.f1389b);
        zM1238t2 = m1238t(this.f1390c);
        if (zM1238t) {
        }
        if (!zM1238t2) {
        }
        if (!zM1238t) {
            if (!zM1238t) {
            }
            if (!zM1238t2) {
            }
            C0934g1 c0934g132 = (C0934g1) c0927e0.getLayoutParams();
            C0934g1 c0934g142 = (C0934g1) c0927e02.getLayoutParams();
            int i172 = measuredHeight;
            if (zM1238t) {
                i6 = this.f1410w & 112;
                int i182 = iMax;
                if (i6 == 48) {
                }
                if (z3) {
                }
            } else {
                i6 = this.f1410w & 112;
                int i1822 = iMax;
                if (i6 == 48) {
                }
                if (z3) {
                }
            }
        }
        ArrayList arrayList2 = this.f1374D;
        m1223a(arrayList2, 3);
        size = arrayList2.size();
        iM1234p2 = iMax;
        while (i11 < size) {
        }
        m1223a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i12 < size2) {
        }
        m1223a(arrayList2, 1);
        int i272 = iArr[0];
        int i282 = iArr[1];
        size3 = arrayList2.size();
        int i292 = i282;
        int i302 = i272;
        i13 = 0;
        int measuredWidth42 = 0;
        while (i13 < size3) {
        }
        i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i342 = measuredWidth42 + i15;
        if (i15 >= iM1234p2) {
        }
        size4 = arrayList2.size();
        while (i14 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        char c2;
        int iM1221k;
        int iMax;
        int iCombineMeasuredStates;
        int iM1221k2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM1222l;
        boolean z3 = AbstractC0970s1.f3845a;
        int i4 = 0;
        if (getLayoutDirection() == 1) {
            z2 = true;
            c2 = 0;
        } else {
            z2 = false;
            c2 = 1;
        }
        if (m1238t(this.f1391d)) {
            m1237s(this.f1391d, i2, 0, i3, this.f1402o);
            iM1221k = m1221k(this.f1391d) + this.f1391d.getMeasuredWidth();
            iMax = Math.max(0, m1222l(this.f1391d) + this.f1391d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1391d.getMeasuredState());
        } else {
            iM1221k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1238t(this.f1395h)) {
            m1237s(this.f1395h, i2, 0, i3, this.f1402o);
            iM1221k = m1221k(this.f1395h) + this.f1395h.getMeasuredWidth();
            iMax = Math.max(iMax, m1222l(this.f1395h) + this.f1395h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1395h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1221k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM1221k);
        boolean z4 = z2;
        int[] iArr = this.f1376F;
        iArr[z4 ? 1 : 0] = iMax4;
        if (m1238t(this.f1388a)) {
            m1237s(this.f1388a, i2, iMax3, i3, this.f1402o);
            iM1221k2 = m1221k(this.f1388a) + this.f1388a.getMeasuredWidth();
            iMax = Math.max(iMax, m1222l(this.f1388a) + this.f1388a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1388a.getMeasuredState());
        } else {
            iM1221k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM1221k2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iM1221k2);
        if (m1238t(this.f1396i)) {
            iMax5 += m1236r(this.f1396i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m1222l(this.f1396i) + this.f1396i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1396i.getMeasuredState());
        }
        if (m1238t(this.f1392e)) {
            iMax5 += m1236r(this.f1392e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m1222l(this.f1392e) + this.f1392e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1392e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((C0934g1) childAt.getLayoutParams()).f3724b == 0 && m1238t(childAt)) {
                iMax5 += m1236r(childAt, i2, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, m1222l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f1405r + this.f1406s;
        int i8 = this.f1403p + this.f1404q;
        if (m1238t(this.f1389b)) {
            m1236r(this.f1389b, i2, i6 + i8, i3, i7, iArr);
            int iM1221k3 = m1221k(this.f1389b) + this.f1389b.getMeasuredWidth();
            iM1222l = m1222l(this.f1389b) + this.f1389b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1389b.getMeasuredState());
            iMax2 = iM1221k3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM1222l = 0;
        }
        if (m1238t(this.f1390c)) {
            iMax2 = Math.max(iMax2, m1236r(this.f1390c, i2, i6 + i8, i3, i7 + iM1222l, iArr));
            iM1222l += m1222l(this.f1390c) + this.f1390c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1390c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM1222l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f1383M) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (m1238t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0940i1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0940i1 c0940i1 = (C0940i1) parcelable;
        super.onRestoreInstanceState(c0940i1.f1069a);
        ActionMenuView actionMenuView = this.f1388a;
        MenuC0816m menuC0816m = actionMenuView != null ? actionMenuView.f1345p : null;
        int i2 = c0940i1.f3728c;
        if (i2 != 0 && this.f1382L != null && menuC0816m != null && (menuItemFindItem = menuC0816m.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0940i1.f3729d) {
            RunnableC0191D runnableC0191D = this.f1387Q;
            removeCallbacks(runnableC0191D);
            post(runnableC0191D);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        m1226d();
        C0903U0 c0903u0 = this.f1407t;
        boolean z2 = i2 == 1;
        if (z2 == c0903u0.f3624g) {
            return;
        }
        c0903u0.f3624g = z2;
        if (!c0903u0.f3625h) {
            c0903u0.f3618a = c0903u0.f3622e;
            c0903u0.f3619b = c0903u0.f3623f;
            return;
        }
        if (z2) {
            int i3 = c0903u0.f3621d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0903u0.f3622e;
            }
            c0903u0.f3618a = i3;
            int i4 = c0903u0.f3620c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0903u0.f3623f;
            }
            c0903u0.f3619b = i4;
            return;
        }
        int i5 = c0903u0.f3620c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0903u0.f3622e;
        }
        c0903u0.f3618a = i5;
        int i6 = c0903u0.f3621d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c0903u0.f3623f;
        }
        c0903u0.f3619b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0944k c0944k;
        C0818o c0818o;
        C0940i1 c0940i1 = new C0940i1(super.onSaveInstanceState());
        C0931f1 c0931f1 = this.f1382L;
        if (c0931f1 != null && (c0818o = c0931f1.f3719b) != null) {
            c0940i1.f3728c = c0818o.f3349a;
        }
        ActionMenuView actionMenuView = this.f1388a;
        c0940i1.f3729d = (actionMenuView == null || (c0944k = actionMenuView.f1349t) == null || !c0944k.m2383i()) ? false : true;
        return c0940i1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1372B = false;
        }
        if (!this.f1372B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1372B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1372B = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m1234p(View view, int i2, int i3, int[] iArr) {
        C0934g1 c0934g1 = (C0934g1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0934g1).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iM1230j = m1230j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1230j, iMax + measuredWidth, view.getMeasuredHeight() + iM1230j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0934g1).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m1235q(View view, int i2, int i3, int[] iArr) {
        C0934g1 c0934g1 = (C0934g1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0934g1).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iM1230j = m1230j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1230j, iMax, view.getMeasuredHeight() + iM1230j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0934g1).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m1236r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: s */
    public final void m1237s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1386P != z2) {
            this.f1386P = z2;
            m1239u();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1383M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1409v) {
            this.f1409v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1408u) {
            this.f1408u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1229g();
        this.f1391d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m1227e();
        this.f1388a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1398k != i2) {
            this.f1398k = i2;
            if (i2 == 0) {
                this.f1397j = getContext();
            } else {
                this.f1397j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1406s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1404q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1403p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1405r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1238t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final void m1239u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM2368a = AbstractC0928e1.m2368a(this);
            C0931f1 c0931f1 = this.f1382L;
            boolean z2 = (c0931f1 == null || c0931f1.f3719b == null || onBackInvokedDispatcherM2368a == null || !isAttachedToWindow() || !this.f1386P) ? false : true;
            if (z2 && this.f1385O == null) {
                if (this.f1384N == null) {
                    this.f1384N = AbstractC0928e1.m2369b(new RunnableC0922c1(this, 0));
                }
                AbstractC0928e1.m2370c(onBackInvokedDispatcherM2368a, this.f1384N);
                this.f1385O = onBackInvokedDispatcherM2368a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1385O) == null) {
                return;
            }
            AbstractC0928e1.m2371d(onBackInvokedDispatcher, this.f1384N);
            this.f1385O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.resc);
        this.f1410w = 8388627;
        this.f1374D = new ArrayList();
        this.f1375E = new ArrayList();
        this.f1376F = new int[2];
        this.f1377G = new C0270l(new RunnableC0922c1(this, 1));
        this.f1378H = new ArrayList();
        this.f1379I = new C0925d1(this);
        this.f1387Q = new RunnableC0191D(13, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0641a.f2503x;
        C0270l c0270lM838m = C0270l.m838m(context2, attributeSet, iArr, R.attr.resc);
        AbstractC0240S.m784o(this, context, iArr, attributeSet, (TypedArray) c0270lM838m.f837b, R.attr.resc);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        this.f1399l = typedArray.getResourceId(28, 0);
        this.f1400m = typedArray.getResourceId(19, 0);
        this.f1410w = typedArray.getInteger(0, 8388627);
        this.f1401n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1406s = dimensionPixelOffset;
        this.f1405r = dimensionPixelOffset;
        this.f1404q = dimensionPixelOffset;
        this.f1403p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1403p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1404q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1405r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1406s = dimensionPixelOffset5;
        }
        this.f1402o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1226d();
        C0903U0 c0903u0 = this.f1407t;
        c0903u0.f3625h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0903u0.f3622e = dimensionPixelSize;
            c0903u0.f3618a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0903u0.f3623f = dimensionPixelSize2;
            c0903u0.f3619b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0903u0.m2332a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1408u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1409v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1393f = c0270lM838m.m845h(4);
        this.f1394g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1397j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM845h = c0270lM838m.m845h(16);
        if (drawableM845h != null) {
            setNavigationIcon(drawableM845h);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM845h2 = c0270lM838m.m845h(11);
        if (drawableM845h2 != null) {
            setLogo(drawableM845h2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0270lM838m.m844g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0270lM838m.m844g(20));
        }
        if (typedArray.hasValue(14)) {
            mo1231m(typedArray.getResourceId(14, 0));
        }
        c0270lM838m.m851o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0934g1 c0934g1 = new C0934g1(context, attributeSet);
        c0934g1.f3723a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0641a.f2481b);
        c0934g1.f3723a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c0934g1.f3724b = 0;
        return c0934g1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1225c();
        }
        C0981y c0981y = this.f1395h;
        if (c0981y != null) {
            c0981y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1225c();
            this.f1395h.setImageDrawable(drawable);
        } else {
            C0981y c0981y = this.f1395h;
            if (c0981y != null) {
                c0981y.setImageDrawable(this.f1393f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1392e == null) {
                this.f1392e = new C0863A(getContext(), null, 0);
            }
            if (!m1233o(this.f1392e)) {
                m1224b(this.f1392e, true);
            }
        } else {
            C0863A c0863a = this.f1392e;
            if (c0863a != null && m1233o(c0863a)) {
                removeView(this.f1392e);
                this.f1375E.remove(this.f1392e);
            }
        }
        C0863A c0863a2 = this.f1392e;
        if (c0863a2 != null) {
            c0863a2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1392e == null) {
            this.f1392e = new C0863A(getContext(), null, 0);
        }
        C0863A c0863a = this.f1392e;
        if (c0863a != null) {
            c0863a.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1229g();
        }
        C0981y c0981y = this.f1391d;
        if (c0981y != null) {
            c0981y.setContentDescription(charSequence);
            AbstractC0383m.m1043g0(this.f1391d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1229g();
            if (!m1233o(this.f1391d)) {
                m1224b(this.f1391d, true);
            }
        } else {
            C0981y c0981y = this.f1391d;
            if (c0981y != null && m1233o(c0981y)) {
                removeView(this.f1391d);
                this.f1375E.remove(this.f1391d);
            }
        }
        C0981y c0981y2 = this.f1391d;
        if (c0981y2 != null) {
            c0981y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0927e0 c0927e0 = this.f1390c;
            if (c0927e0 != null && m1233o(c0927e0)) {
                removeView(this.f1390c);
                this.f1375E.remove(this.f1390c);
            }
        } else {
            if (this.f1390c == null) {
                Context context = getContext();
                C0927e0 c0927e02 = new C0927e0(context, null);
                this.f1390c = c0927e02;
                c0927e02.setSingleLine();
                this.f1390c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1400m;
                if (i2 != 0) {
                    this.f1390c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1371A;
                if (colorStateList != null) {
                    this.f1390c.setTextColor(colorStateList);
                }
            }
            if (!m1233o(this.f1390c)) {
                m1224b(this.f1390c, true);
            }
        }
        C0927e0 c0927e03 = this.f1390c;
        if (c0927e03 != null) {
            c0927e03.setText(charSequence);
        }
        this.f1412y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1371A = colorStateList;
        C0927e0 c0927e0 = this.f1390c;
        if (c0927e0 != null) {
            c0927e0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0927e0 c0927e0 = this.f1389b;
            if (c0927e0 != null && m1233o(c0927e0)) {
                removeView(this.f1389b);
                this.f1375E.remove(this.f1389b);
            }
        } else {
            if (this.f1389b == null) {
                Context context = getContext();
                C0927e0 c0927e02 = new C0927e0(context, null);
                this.f1389b = c0927e02;
                c0927e02.setSingleLine();
                this.f1389b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1399l;
                if (i2 != 0) {
                    this.f1389b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1413z;
                if (colorStateList != null) {
                    this.f1389b.setTextColor(colorStateList);
                }
            }
            if (!m1233o(this.f1389b)) {
                m1224b(this.f1389b, true);
            }
        }
        C0927e0 c0927e03 = this.f1389b;
        if (c0927e03 != null) {
            c0927e03.setText(charSequence);
        }
        this.f1411x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1413z = colorStateList;
        C0927e0 c0927e0 = this.f1389b;
        if (c0927e0 != null) {
            c0927e0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC0937h1 interfaceC0937h1) {
    }
}
