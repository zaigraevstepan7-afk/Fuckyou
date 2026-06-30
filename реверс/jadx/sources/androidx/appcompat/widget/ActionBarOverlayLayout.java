package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p009F.C0076c;
import p019K0.C0161c;
import p024N.AbstractC0227E;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.AbstractC0279p0;
import p024N.C0273m0;
import p024N.C0275n0;
import p024N.C0277o0;
import p024N.C0280q;
import p024N.C0291v0;
import p024N.C0295x0;
import p024N.InterfaceC0276o;
import p024N.InterfaceC0278p;
import p036T.AbstractC0383m;
import p060e.C0658N;
import p071j.C0795j;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p074l.C0926e;
import p074l.C0929f;
import p074l.C0931f1;
import p074l.C0944k;
import p074l.C0946k1;
import p074l.InterfaceC0923d;
import p074l.InterfaceC0954n0;
import p074l.InterfaceC0957o0;
import p074l.RunnableC0920c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0954n0, InterfaceC0276o, InterfaceC0278p {

    /* JADX INFO: renamed from: C */
    public static final int[] f1314C = {R.attr.resc, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: D */
    public static final C0295x0 f1315D;

    /* JADX INFO: renamed from: E */
    public static final Rect f1316E;

    /* JADX INFO: renamed from: A */
    public final C0280q f1317A;

    /* JADX INFO: renamed from: B */
    public final C0929f f1318B;

    /* JADX INFO: renamed from: a */
    public int f1319a;

    /* JADX INFO: renamed from: b */
    public int f1320b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f1321c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f1322d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0957o0 f1323e;

    /* JADX INFO: renamed from: f */
    public Drawable f1324f;

    /* JADX INFO: renamed from: g */
    public boolean f1325g;

    /* JADX INFO: renamed from: h */
    public boolean f1326h;

    /* JADX INFO: renamed from: i */
    public boolean f1327i;

    /* JADX INFO: renamed from: j */
    public boolean f1328j;

    /* JADX INFO: renamed from: k */
    public int f1329k;

    /* JADX INFO: renamed from: l */
    public int f1330l;

    /* JADX INFO: renamed from: m */
    public final Rect f1331m;

    /* JADX INFO: renamed from: n */
    public final Rect f1332n;

    /* JADX INFO: renamed from: o */
    public final Rect f1333o;

    /* JADX INFO: renamed from: p */
    public final Rect f1334p;

    /* JADX INFO: renamed from: q */
    public C0295x0 f1335q;

    /* JADX INFO: renamed from: r */
    public C0295x0 f1336r;

    /* JADX INFO: renamed from: s */
    public C0295x0 f1337s;

    /* JADX INFO: renamed from: t */
    public C0295x0 f1338t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0923d f1339u;

    /* JADX INFO: renamed from: v */
    public OverScroller f1340v;

    /* JADX INFO: renamed from: w */
    public ViewPropertyAnimator f1341w;

    /* JADX INFO: renamed from: x */
    public final C0161c f1342x;

    /* JADX INFO: renamed from: y */
    public final RunnableC0920c f1343y;

    /* JADX INFO: renamed from: z */
    public final RunnableC0920c f1344z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0279p0 c0277o0 = i2 >= 30 ? new C0277o0() : i2 >= 29 ? new C0275n0() : new C0273m0();
        c0277o0.mo870g(C0076c.m359b(0, 1, 0, 1));
        f1315D = c0277o0.mo868b();
        f1316E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1320b = 0;
        this.f1331m = new Rect();
        this.f1332n = new Rect();
        this.f1333o = new Rect();
        this.f1334p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0295x0 c0295x0 = C0295x0.f881b;
        this.f1335q = c0295x0;
        this.f1336r = c0295x0;
        this.f1337s = c0295x0;
        this.f1338t = c0295x0;
        this.f1342x = new C0161c(4, this);
        this.f1343y = new RunnableC0920c(this, 0);
        this.f1344z = new RunnableC0920c(this, 1);
        m1208i(context);
        this.f1317A = new C0280q();
        C0929f c0929f = new C0929f(context);
        c0929f.setWillNotDraw(true);
        this.f1318B = c0929f;
        addView(c0929f);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1206g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0926e c0926e = (C0926e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0926e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0926e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0926e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0926e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0926e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0926e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0926e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0926e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: a */
    public final void mo882a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // p024N.InterfaceC0278p
    /* JADX INFO: renamed from: b */
    public final void mo888b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        mo883c(view, i2, i3, i4, i5, i6);
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: c */
    public final void mo883c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0926e;
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: d */
    public final void mo884d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1324f != null) {
            if (this.f1322d.getVisibility() == 0) {
                translationY = (int) (this.f1322d.getTranslationY() + this.f1322d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1324f.setBounds(0, translationY, getWidth(), this.f1324f.getIntrinsicHeight() + translationY);
            this.f1324f.draw(canvas);
        }
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: e */
    public final void mo885e(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // p024N.InterfaceC0276o
    /* JADX INFO: renamed from: f */
    public final boolean mo886f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0926e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0926e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1322d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0280q c0280q = this.f1317A;
        return c0280q.f858b | c0280q.f857a;
    }

    public CharSequence getTitle() {
        m1210k();
        return ((C0946k1) this.f1323e).f3769a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m1207h() {
        removeCallbacks(this.f1343y);
        removeCallbacks(this.f1344z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1341w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1208i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1314C);
        this.f1319a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1324f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1340v = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m1209j(int i2) {
        m1210k();
        if (i2 == 2) {
            ((C0946k1) this.f1323e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((C0946k1) this.f1323e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1210k() {
        InterfaceC0957o0 wrapper;
        if (this.f1321c == null) {
            this.f1321c = (ContentFrameLayout) findViewById(R.id.resc);
            this.f1322d = (ActionBarContainer) findViewById(R.id.resc);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.resc);
            if (callbackFindViewById instanceof InterfaceC0957o0) {
                wrapper = (InterfaceC0957o0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1323e = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1211l(MenuC0816m menuC0816m, InterfaceC0827x interfaceC0827x) {
        m1210k();
        C0946k1 c0946k1 = (C0946k1) this.f1323e;
        C0944k c0944k = c0946k1.f3781m;
        Toolbar toolbar = c0946k1.f3769a;
        if (c0944k == null) {
            c0946k1.f3781m = new C0944k(toolbar.getContext());
        }
        C0944k c0944k2 = c0946k1.f3781m;
        c0944k2.f3737e = interfaceC0827x;
        if (menuC0816m == null && toolbar.f1388a == null) {
            return;
        }
        toolbar.m1228f();
        MenuC0816m menuC0816m2 = toolbar.f1388a.f1345p;
        if (menuC0816m2 == menuC0816m) {
            return;
        }
        if (menuC0816m2 != null) {
            menuC0816m2.m2193r(toolbar.f1381K);
            menuC0816m2.m2193r(toolbar.f1382L);
        }
        if (toolbar.f1382L == null) {
            toolbar.f1382L = new C0931f1(toolbar);
        }
        c0944k2.f3749q = true;
        if (menuC0816m != null) {
            menuC0816m.m2185b(c0944k2, toolbar.f1397j);
            menuC0816m.m2185b(toolbar.f1382L, toolbar.f1397j);
        } else {
            c0944k2.mo2181j(toolbar.f1397j, null);
            toolbar.f1382L.mo2181j(toolbar.f1397j, null);
            c0944k2.mo2152c();
            toolbar.f1382L.mo2152c();
        }
        toolbar.f1388a.setPopupTheme(toolbar.f1398k);
        toolbar.f1388a.setPresenter(c0944k2);
        toolbar.f1381K = c0944k2;
        toolbar.m1239u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1210k();
        C0295x0 c0295x0M920g = C0295x0.m920g(this, windowInsets);
        boolean zM1206g = m1206g(this.f1322d, new Rect(c0295x0M920g.m922b(), c0295x0M920g.m924d(), c0295x0M920g.m923c(), c0295x0M920g.m921a()), false);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        Rect rect = this.f1331m;
        AbstractC0229G.m700b(this, c0295x0M920g, rect);
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C0291v0 c0291v0 = c0295x0M920g.f882a;
        C0295x0 c0295x0Mo898l = c0291v0.mo898l(i2, i3, i4, i5);
        this.f1335q = c0295x0Mo898l;
        boolean z2 = true;
        if (!this.f1336r.equals(c0295x0Mo898l)) {
            this.f1336r = this.f1335q;
            zM1206g = true;
        }
        Rect rect2 = this.f1332n;
        if (rect2.equals(rect)) {
            z2 = zM1206g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0291v0.mo909a().f882a.mo905c().f882a.mo904b().m925f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1208i(getContext());
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1207h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0926e c0926e = (C0926e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0926e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0926e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        m1210k();
        measureChildWithMargins(this.f1322d, i2, 0, i3, 0);
        C0926e c0926e = (C0926e) this.f1322d.getLayoutParams();
        int iMax = Math.max(0, this.f1322d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0926e).leftMargin + ((ViewGroup.MarginLayoutParams) c0926e).rightMargin);
        int iMax2 = Math.max(0, this.f1322d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0926e).topMargin + ((ViewGroup.MarginLayoutParams) c0926e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1322d.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1319a;
            if (this.f1326h && this.f1322d.getTabContainer() != null) {
                measuredHeight += this.f1319a;
            }
        } else {
            measuredHeight = this.f1322d.getVisibility() != 8 ? this.f1322d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1331m;
        Rect rect2 = this.f1333o;
        rect2.set(rect);
        this.f1337s = this.f1335q;
        if (this.f1325g || z2) {
            C0076c c0076cM359b = C0076c.m359b(this.f1337s.m922b(), this.f1337s.m924d() + measuredHeight, this.f1337s.m923c(), this.f1337s.m921a());
            C0295x0 c0295x0 = this.f1337s;
            int i4 = Build.VERSION.SDK_INT;
            AbstractC0279p0 c0277o0 = i4 >= 30 ? new C0277o0(c0295x0) : i4 >= 29 ? new C0275n0(c0295x0) : new C0273m0(c0295x0);
            c0277o0.mo870g(c0076cM359b);
            this.f1337s = c0277o0.mo868b();
        } else {
            C0929f c0929f = this.f1318B;
            C0295x0 c0295x02 = f1315D;
            Rect rect3 = this.f1334p;
            AbstractC0229G.m700b(c0929f, c0295x02, rect3);
            if (!rect3.equals(f1316E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1337s = this.f1337s.f882a.mo898l(0, measuredHeight, 0, 0);
            }
        }
        m1206g(this.f1321c, rect2, true);
        if (!this.f1338t.equals(this.f1337s)) {
            C0295x0 c0295x03 = this.f1337s;
            this.f1338t = c0295x03;
            ContentFrameLayout contentFrameLayout = this.f1321c;
            WindowInsets windowInsetsM925f = c0295x03.m925f();
            if (windowInsetsM925f != null) {
                WindowInsets windowInsetsM696a = AbstractC0227E.m696a(contentFrameLayout, windowInsetsM925f);
                if (!windowInsetsM696a.equals(windowInsetsM925f)) {
                    C0295x0.m920g(contentFrameLayout, windowInsetsM696a);
                }
            }
        }
        measureChildWithMargins(this.f1321c, i2, 0, i3, 0);
        C0926e c0926e2 = (C0926e) this.f1321c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1321c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0926e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0926e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1321c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0926e2).topMargin + ((ViewGroup.MarginLayoutParams) c0926e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1321c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.f1327i || !z2) {
            return false;
        }
        this.f1340v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1340v.getFinalY() > this.f1322d.getHeight()) {
            m1207h();
            this.f1344z.run();
        } else {
            m1207h();
            this.f1343y.run();
        }
        this.f1328j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1329k + i3;
        this.f1329k = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        C0658N c0658n;
        C0795j c0795j;
        this.f1317A.f857a = i2;
        this.f1329k = getActionBarHideOffset();
        m1207h();
        InterfaceC0923d interfaceC0923d = this.f1339u;
        if (interfaceC0923d == null || (c0795j = (c0658n = (C0658N) interfaceC0923d).f2614H) == null) {
            return;
        }
        c0795j.m2142a();
        c0658n.f2614H = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1322d.getVisibility() != 0) {
            return false;
        }
        return this.f1327i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1327i || this.f1328j) {
            return;
        }
        if (this.f1329k <= this.f1322d.getHeight()) {
            m1207h();
            postDelayed(this.f1343y, 600L);
        } else {
            m1207h();
            postDelayed(this.f1344z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m1210k();
        int i3 = this.f1330l ^ i2;
        this.f1330l = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC0923d interfaceC0923d = this.f1339u;
        if (interfaceC0923d != null) {
            C0658N c0658n = (C0658N) interfaceC0923d;
            c0658n.f2610D = !z3;
            if (z2 || !z3) {
                if (c0658n.f2611E) {
                    c0658n.f2611E = false;
                    c0658n.m1883v0(true);
                }
            } else if (!c0658n.f2611E) {
                c0658n.f2611E = true;
                c0658n.m1883v0(true);
            }
        }
        if ((i3 & 256) == 0 || this.f1339u == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f1320b = i2;
        InterfaceC0923d interfaceC0923d = this.f1339u;
        if (interfaceC0923d != null) {
            ((C0658N) interfaceC0923d).f2609C = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        m1207h();
        this.f1322d.setTranslationY(-Math.max(0, Math.min(i2, this.f1322d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0923d interfaceC0923d) {
        this.f1339u = interfaceC0923d;
        if (getWindowToken() != null) {
            ((C0658N) this.f1339u).f2609C = this.f1320b;
            int i2 = this.f1330l;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                AbstractC0227E.m698c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1326h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1327i) {
            this.f1327i = z2;
            if (z2) {
                return;
            }
            m1207h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m1210k();
        C0946k1 c0946k1 = (C0946k1) this.f1323e;
        c0946k1.f3772d = i2 != 0 ? AbstractC0383m.m1057w(c0946k1.f3769a.getContext(), i2) : null;
        c0946k1.m2398c();
    }

    public void setLogo(int i2) {
        m1210k();
        C0946k1 c0946k1 = (C0946k1) this.f1323e;
        c0946k1.f3773e = i2 != 0 ? AbstractC0383m.m1057w(c0946k1.f3769a.getContext(), i2) : null;
        c0946k1.m2398c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1325g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // p074l.InterfaceC0954n0
    public void setWindowCallback(Window.Callback callback) {
        m1210k();
        ((C0946k1) this.f1323e).f3779k = callback;
    }

    @Override // p074l.InterfaceC0954n0
    public void setWindowTitle(CharSequence charSequence) {
        m1210k();
        C0946k1 c0946k1 = (C0946k1) this.f1323e;
        if (c0946k1.f3775g) {
            return;
        }
        c0946k1.f3776h = charSequence;
        if ((c0946k1.f3770b & 8) != 0) {
            Toolbar toolbar = c0946k1.f3769a;
            toolbar.setTitle(charSequence);
            if (c0946k1.f3775g) {
                AbstractC0240S.m786q(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0926e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1210k();
        C0946k1 c0946k1 = (C0946k1) this.f1323e;
        c0946k1.f3772d = drawable;
        c0946k1.m2398c();
    }
}
