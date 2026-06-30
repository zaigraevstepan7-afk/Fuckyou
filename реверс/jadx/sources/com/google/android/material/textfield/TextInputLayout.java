package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p004C.RunnableC0020a;
import p005C0.AbstractC0038d;
import p005C0.AbstractC0047m;
import p005C0.C0037c;
import p009F.AbstractC0074a;
import p010F0.C0086a;
import p010F0.C0089d;
import p011G.AbstractC0092a;
import p015I0.C0105a;
import p015I0.C0109e;
import p015I0.C0111g;
import p015I0.C0112h;
import p015I0.C0115k;
import p015I0.C0116l;
import p015I0.C0117m;
import p015I0.InterfaceC0107c;
import p019K0.C0160b;
import p020L.AbstractC0177k;
import p020L.C0168b;
import p020L.C0176j;
import p023M0.C0188A;
import p023M0.C0189B;
import p023M0.C0190C;
import p023M0.C0192E;
import p023M0.C0194G;
import p023M0.C0201g;
import p023M0.C0202h;
import p023M0.C0207m;
import p023M0.C0209o;
import p023M0.C0212r;
import p023M0.C0215u;
import p023M0.C0216v;
import p023M0.C0219y;
import p023M0.InterfaceC0193F;
import p023M0.RunnableC0191D;
import p024N.AbstractC0231I;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p027O0.AbstractC0322a;
import p036T.AbstractC0383m;
import p073k0.AbstractC0853q;
import p073k0.C0844h;
import p074l.AbstractC0966r0;
import p074l.C0927e0;
import p074l.C0973u;
import p079n0.AbstractC1013a;
import p081o0.AbstractC1015a;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: C0 */
    public static final int[][] f2335C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    public ColorStateList f2336A;

    /* JADX INFO: renamed from: A0 */
    public boolean f2337A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f2338B;

    /* JADX INFO: renamed from: B0 */
    public boolean f2339B0;

    /* JADX INFO: renamed from: C */
    public boolean f2340C;

    /* JADX INFO: renamed from: D */
    public CharSequence f2341D;

    /* JADX INFO: renamed from: E */
    public boolean f2342E;

    /* JADX INFO: renamed from: F */
    public C0112h f2343F;

    /* JADX INFO: renamed from: G */
    public C0112h f2344G;

    /* JADX INFO: renamed from: H */
    public StateListDrawable f2345H;

    /* JADX INFO: renamed from: I */
    public boolean f2346I;

    /* JADX INFO: renamed from: J */
    public C0112h f2347J;

    /* JADX INFO: renamed from: K */
    public C0112h f2348K;

    /* JADX INFO: renamed from: L */
    public C0117m f2349L;

    /* JADX INFO: renamed from: M */
    public boolean f2350M;

    /* JADX INFO: renamed from: N */
    public final int f2351N;

    /* JADX INFO: renamed from: O */
    public int f2352O;

    /* JADX INFO: renamed from: P */
    public int f2353P;

    /* JADX INFO: renamed from: Q */
    public int f2354Q;

    /* JADX INFO: renamed from: R */
    public int f2355R;

    /* JADX INFO: renamed from: S */
    public int f2356S;

    /* JADX INFO: renamed from: T */
    public int f2357T;

    /* JADX INFO: renamed from: U */
    public int f2358U;

    /* JADX INFO: renamed from: V */
    public final Rect f2359V;

    /* JADX INFO: renamed from: W */
    public final Rect f2360W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f2361a;

    /* JADX INFO: renamed from: a0 */
    public final RectF f2362a0;

    /* JADX INFO: renamed from: b */
    public final C0188A f2363b;

    /* JADX INFO: renamed from: b0 */
    public Typeface f2364b0;

    /* JADX INFO: renamed from: c */
    public final C0212r f2365c;

    /* JADX INFO: renamed from: c0 */
    public ColorDrawable f2366c0;

    /* JADX INFO: renamed from: d */
    public EditText f2367d;

    /* JADX INFO: renamed from: d0 */
    public int f2368d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f2369e;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet f2370e0;

    /* JADX INFO: renamed from: f */
    public int f2371f;

    /* JADX INFO: renamed from: f0 */
    public ColorDrawable f2372f0;

    /* JADX INFO: renamed from: g */
    public int f2373g;

    /* JADX INFO: renamed from: g0 */
    public int f2374g0;

    /* JADX INFO: renamed from: h */
    public int f2375h;

    /* JADX INFO: renamed from: h0 */
    public Drawable f2376h0;

    /* JADX INFO: renamed from: i */
    public int f2377i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f2378i0;

    /* JADX INFO: renamed from: j */
    public final C0216v f2379j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f2380j0;

    /* JADX INFO: renamed from: k */
    public boolean f2381k;

    /* JADX INFO: renamed from: k0 */
    public int f2382k0;

    /* JADX INFO: renamed from: l */
    public int f2383l;

    /* JADX INFO: renamed from: l0 */
    public int f2384l0;

    /* JADX INFO: renamed from: m */
    public boolean f2385m;

    /* JADX INFO: renamed from: m0 */
    public int f2386m0;

    /* JADX INFO: renamed from: n */
    public InterfaceC0193F f2387n;

    /* JADX INFO: renamed from: n0 */
    public ColorStateList f2388n0;

    /* JADX INFO: renamed from: o */
    public C0927e0 f2389o;

    /* JADX INFO: renamed from: o0 */
    public int f2390o0;

    /* JADX INFO: renamed from: p */
    public int f2391p;

    /* JADX INFO: renamed from: p0 */
    public int f2392p0;

    /* JADX INFO: renamed from: q */
    public int f2393q;

    /* JADX INFO: renamed from: q0 */
    public int f2394q0;

    /* JADX INFO: renamed from: r */
    public CharSequence f2395r;

    /* JADX INFO: renamed from: r0 */
    public int f2396r0;

    /* JADX INFO: renamed from: s */
    public boolean f2397s;

    /* JADX INFO: renamed from: s0 */
    public int f2398s0;

    /* JADX INFO: renamed from: t */
    public C0927e0 f2399t;

    /* JADX INFO: renamed from: t0 */
    public int f2400t0;

    /* JADX INFO: renamed from: u */
    public ColorStateList f2401u;

    /* JADX INFO: renamed from: u0 */
    public boolean f2402u0;

    /* JADX INFO: renamed from: v */
    public int f2403v;

    /* JADX INFO: renamed from: v0 */
    public final C0037c f2404v0;

    /* JADX INFO: renamed from: w */
    public C0844h f2405w;

    /* JADX INFO: renamed from: w0 */
    public boolean f2406w0;

    /* JADX INFO: renamed from: x */
    public C0844h f2407x;

    /* JADX INFO: renamed from: x0 */
    public boolean f2408x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f2409y;

    /* JADX INFO: renamed from: y0 */
    public ValueAnimator f2410y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f2411z;

    /* JADX INFO: renamed from: z0 */
    public boolean f2412z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m979a(context, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc), attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f2371f = -1;
        this.f2373g = -1;
        this.f2375h = -1;
        this.f2377i = -1;
        this.f2379j = new C0216v(this);
        this.f2387n = new C0189B(0);
        this.f2359V = new Rect();
        this.f2360W = new Rect();
        this.f2362a0 = new RectF();
        this.f2370e0 = new LinkedHashSet();
        C0037c c0037c = new C0037c(this);
        this.f2404v0 = c0037c;
        this.f2339B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2361a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1015a.f4046a;
        c0037c.f97Q = linearInterpolator;
        c0037c.m259h(false);
        c0037c.f96P = linearInterpolator;
        c0037c.m259h(false);
        if (c0037c.f119g != 8388659) {
            c0037c.f119g = 8388659;
            c0037c.m259h(false);
        }
        int[] iArr = AbstractC1013a.f4016F;
        AbstractC0047m.m272a(context2, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        AbstractC0047m.m273b(context2, attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        C0270l c0270l = new C0270l(context2, typedArrayObtainStyledAttributes);
        C0188A c0188a = new C0188A(this, c0270l);
        this.f2363b = c0188a;
        this.f2340C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f2408x0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f2406w0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2349L = C0117m.m492b(context2, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc).m489a();
        this.f2351N = context2.getResources().getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc);
        this.f2353P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2355R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc));
        this.f2356S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc));
        this.f2354Q = this.f2355R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C0116l c0116lM495e = this.f2349L.m495e();
        if (dimension >= 0.0f) {
            c0116lM495e.f375e = new C0105a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c0116lM495e.f376f = new C0105a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c0116lM495e.f377g = new C0105a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c0116lM495e.f378h = new C0105a(dimension4);
        }
        this.f2349L = c0116lM495e.m489a();
        ColorStateList colorStateListM161J = AbstractC0016e.m161J(context2, c0270l, 7);
        if (colorStateListM161J != null) {
            int defaultColor = colorStateListM161J.getDefaultColor();
            this.f2390o0 = defaultColor;
            this.f2358U = defaultColor;
            if (colorStateListM161J.isStateful()) {
                this.f2392p0 = colorStateListM161J.getColorForState(new int[]{-16842910}, -1);
                this.f2394q0 = colorStateListM161J.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2396r0 = colorStateListM161J.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2394q0 = this.f2390o0;
                ColorStateList colorStateListM160I = AbstractC0016e.m160I(context2, com.reddit.frontpage.R.color.resc);
                this.f2392p0 = colorStateListM160I.getColorForState(new int[]{-16842910}, -1);
                this.f2396r0 = colorStateListM160I.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2358U = 0;
            this.f2390o0 = 0;
            this.f2392p0 = 0;
            this.f2394q0 = 0;
            this.f2396r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM844g = c0270l.m844g(1);
            this.f2380j0 = colorStateListM844g;
            this.f2378i0 = colorStateListM844g;
        }
        ColorStateList colorStateListM161J2 = AbstractC0016e.m161J(context2, c0270l, 14);
        this.f2386m0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f2382k0 = AbstractC0016e.m159H(context2, com.reddit.frontpage.R.color.resc);
        this.f2398s0 = AbstractC0016e.m159H(context2, com.reddit.frontpage.R.color.resc);
        this.f2384l0 = AbstractC0016e.m159H(context2, com.reddit.frontpage.R.color.resc);
        if (colorStateListM161J2 != null) {
            setBoxStrokeColorStateList(colorStateListM161J2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0016e.m161J(context2, c0270l, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2336A = c0270l.m844g(24);
        this.f2338B = c0270l.m844g(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f2393q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f2391p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f2391p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2393q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0270l.m844g(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0270l.m844g(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0270l.m844g(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0270l.m844g(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0270l.m844g(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0270l.m844g(58));
        }
        C0212r c0212r = new C0212r(this, c0270l);
        this.f2365c = c0212r;
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0270l.m851o();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            AbstractC0231I.m741m(this, 1);
        }
        frameLayout.addView(c0188a);
        frameLayout.addView(c0212r);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2367d;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC0016e.m171b0(editText)) {
            return this.f2343F;
        }
        int iM1056v = AbstractC0383m.m1056v(this.f2367d, com.reddit.frontpage.R.attr.resc);
        int i2 = this.f2352O;
        int[][] iArr = f2335C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            C0112h c0112h = this.f2343F;
            int i3 = this.f2358U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0383m.m1030I(iM1056v, i3, 0.1f), i3}), c0112h, c0112h);
        }
        Context context = getContext();
        C0112h c0112h2 = this.f2343F;
        int iM1055u = AbstractC0383m.m1055u(context, com.reddit.frontpage.R.attr.resc, "TextInputLayout");
        C0112h c0112h3 = new C0112h(c0112h2.f346a.f328a);
        int iM1030I = AbstractC0383m.m1030I(iM1056v, iM1055u, 0.1f);
        c0112h3.m480l(new ColorStateList(iArr, new int[]{iM1030I, 0}));
        c0112h3.setTint(iM1055u);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM1030I, iM1055u});
        C0112h c0112h4 = new C0112h(c0112h2.f346a.f328a);
        c0112h4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0112h3, c0112h4), c0112h2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2345H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2345H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2345H.addState(new int[0], m1768f(false));
        }
        return this.f2345H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2344G == null) {
            this.f2344G = m1768f(true);
        }
        return this.f2344G;
    }

    /* JADX INFO: renamed from: k */
    public static void m1762k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m1762k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2367d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2367d = editText;
        int i2 = this.f2371f;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f2375h);
        }
        int i3 = this.f2373g;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f2377i);
        }
        this.f2346I = false;
        m1771i();
        setTextInputAccessibilityDelegate(new C0192E(this));
        Typeface typeface = this.f2367d.getTypeface();
        C0037c c0037c = this.f2404v0;
        c0037c.m264m(typeface);
        float textSize = this.f2367d.getTextSize();
        if (c0037c.f120h != textSize) {
            c0037c.f120h = textSize;
            c0037c.m259h(false);
        }
        int i4 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2367d.getLetterSpacing();
        if (c0037c.f103W != letterSpacing) {
            c0037c.f103W = letterSpacing;
            c0037c.m259h(false);
        }
        int gravity = this.f2367d.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (c0037c.f119g != i5) {
            c0037c.f119g = i5;
            c0037c.m259h(false);
        }
        if (c0037c.f117f != gravity) {
            c0037c.f117f = gravity;
            c0037c.m259h(false);
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        this.f2400t0 = editText.getMinimumHeight();
        this.f2367d.addTextChangedListener(new C0190C(this, editText));
        if (this.f2378i0 == null) {
            this.f2378i0 = this.f2367d.getHintTextColors();
        }
        if (this.f2340C) {
            if (TextUtils.isEmpty(this.f2341D)) {
                CharSequence hint = this.f2367d.getHint();
                this.f2369e = hint;
                setHint(hint);
                this.f2367d.setHint((CharSequence) null);
            }
            this.f2342E = true;
        }
        if (i4 >= 29) {
            m1777p();
        }
        if (this.f2389o != null) {
            m1775n(this.f2367d.getText());
        }
        m1779r();
        this.f2379j.m677b();
        this.f2363b.bringToFront();
        C0212r c0212r = this.f2365c;
        c0212r.bringToFront();
        Iterator it = this.f2370e0.iterator();
        while (it.hasNext()) {
            ((C0209o) it.next()).m655a(this);
        }
        c0212r.m671m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1782u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2341D)) {
            return;
        }
        this.f2341D = charSequence;
        C0037c c0037c = this.f2404v0;
        if (charSequence == null || !TextUtils.equals(c0037c.f81A, charSequence)) {
            c0037c.f81A = charSequence;
            c0037c.f82B = null;
            Bitmap bitmap = c0037c.f85E;
            if (bitmap != null) {
                bitmap.recycle();
                c0037c.f85E = null;
            }
            c0037c.m259h(false);
        }
        if (this.f2402u0) {
            return;
        }
        m1772j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2397s == z2) {
            return;
        }
        if (z2) {
            C0927e0 c0927e0 = this.f2399t;
            if (c0927e0 != null) {
                this.f2361a.addView(c0927e0);
                this.f2399t.setVisibility(0);
            }
        } else {
            C0927e0 c0927e02 = this.f2399t;
            if (c0927e02 != null) {
                c0927e02.setVisibility(8);
            }
            this.f2399t = null;
        }
        this.f2397s = z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1763a(float f) {
        C0037c c0037c = this.f2404v0;
        if (c0037c.f109b == f) {
            return;
        }
        if (this.f2410y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2410y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0016e.m195r0(getContext(), com.reddit.frontpage.R.attr.resc, AbstractC1015a.f4047b));
            this.f2410y0.setDuration(AbstractC0016e.m193q0(getContext(), com.reddit.frontpage.R.attr.resc, 167));
            this.f2410y0.addUpdateListener(new C0160b(1, this));
        }
        this.f2410y0.setFloatValues(c0037c.f109b, f);
        this.f2410y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2361a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m1781t();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m1764b() {
        int i2;
        int i3;
        C0112h c0112h = this.f2343F;
        if (c0112h == null) {
            return;
        }
        C0117m c0117m = c0112h.f346a.f328a;
        C0117m c0117m2 = this.f2349L;
        if (c0117m != c0117m2) {
            c0112h.setShapeAppearanceModel(c0117m2);
        }
        if (this.f2352O == 2 && (i2 = this.f2354Q) > -1 && (i3 = this.f2357T) != 0) {
            C0112h c0112h2 = this.f2343F;
            c0112h2.f346a.f337j = i2;
            c0112h2.invalidateSelf();
            c0112h2.m484p(ColorStateList.valueOf(i3));
        }
        int iM354c = this.f2358U;
        if (this.f2352O == 1) {
            iM354c = AbstractC0074a.m354c(this.f2358U, AbstractC0383m.m1054t(getContext(), com.reddit.frontpage.R.attr.resc, 0));
        }
        this.f2358U = iM354c;
        this.f2343F.m480l(ColorStateList.valueOf(iM354c));
        C0112h c0112h3 = this.f2347J;
        if (c0112h3 != null && this.f2348K != null) {
            if (this.f2354Q > -1 && this.f2357T != 0) {
                c0112h3.m480l(this.f2367d.isFocused() ? ColorStateList.valueOf(this.f2382k0) : ColorStateList.valueOf(this.f2357T));
                this.f2348K.m480l(ColorStateList.valueOf(this.f2357T));
            }
            invalidate();
        }
        m1780s();
    }

    /* JADX INFO: renamed from: c */
    public final int m1765c() {
        float fM256d;
        if (!this.f2340C) {
            return 0;
        }
        int i2 = this.f2352O;
        C0037c c0037c = this.f2404v0;
        if (i2 == 0) {
            fM256d = c0037c.m256d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fM256d = c0037c.m256d() / 2.0f;
        }
        return (int) fM256d;
    }

    /* JADX INFO: renamed from: d */
    public final C0844h m1766d() {
        C0844h c0844h = new C0844h();
        c0844h.f3459c = AbstractC0016e.m193q0(getContext(), com.reddit.frontpage.R.attr.resc, 87);
        c0844h.f3460d = AbstractC0016e.m195r0(getContext(), com.reddit.frontpage.R.attr.resc, AbstractC1015a.f4046a);
        return c0844h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f2367d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f2369e != null) {
            boolean z2 = this.f2342E;
            this.f2342E = false;
            CharSequence hint = editText.getHint();
            this.f2367d.setHint(this.f2369e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f2367d.setHint(hint);
                this.f2342E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f2361a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f2367d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2337A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2337A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0112h c0112h;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f2340C;
        C0037c c0037c = this.f2404v0;
        if (z2) {
            c0037c.getClass();
            int iSave = canvas2.save();
            if (c0037c.f82B != null) {
                RectF rectF = c0037c.f115e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0037c.f94N;
                    textPaint.setTextSize(c0037c.f87G);
                    float f = c0037c.f128p;
                    float f2 = c0037c.f129q;
                    float f3 = c0037c.f86F;
                    if (f3 != 1.0f) {
                        canvas2.scale(f3, f3, f, f2);
                    }
                    if (c0037c.f114d0 <= 1 || c0037c.f83C) {
                        canvas2.translate(f, f2);
                        c0037c.f105Y.draw(canvas2);
                    } else {
                        float lineStart = c0037c.f128p - c0037c.f105Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0037c.f110b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c0037c.f88H;
                            float f6 = c0037c.f89I;
                            float f7 = c0037c.f90J;
                            int i3 = c0037c.f91K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0074a.m356e(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c0037c.f105Y.draw(canvas2);
                        textPaint.setAlpha((int) (c0037c.f108a0 * f4));
                        if (i2 >= 31) {
                            float f8 = c0037c.f88H;
                            float f9 = c0037c.f89I;
                            float f10 = c0037c.f90J;
                            int i4 = c0037c.f91K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0074a.m356e(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0037c.f105Y.getLineBaseline(0);
                        CharSequence charSequence = c0037c.f112c0;
                        float f11 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0037c.f88H, c0037c.f89I, c0037c.f90J, c0037c.f91K);
                        }
                        String strTrim = c0037c.f112c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c0037c.f105Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(iSave);
                }
            }
        }
        if (this.f2348K == null || (c0112h = this.f2347J) == null) {
            return;
        }
        c0112h.draw(canvas2);
        if (this.f2367d.isFocused()) {
            Rect bounds = this.f2348K.getBounds();
            Rect bounds2 = this.f2347J.getBounds();
            float f12 = c0037c.f109b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC1015a.m2463c(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC1015a.m2463c(iCenterX, bounds2.right, f12);
            this.f2348K.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f2412z0) {
            return;
        }
        this.f2412z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0037c c0037c = this.f2404v0;
        if (c0037c != null) {
            c0037c.f92L = drawableState;
            ColorStateList colorStateList2 = c0037c.f123k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0037c.f122j) == null || !colorStateList.isStateful())) {
                z2 = false;
            } else {
                c0037c.m259h(false);
                z2 = true;
            }
        }
        if (this.f2367d != null) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            m1782u(isLaidOut() && isEnabled(), false);
        }
        m1779r();
        m1785x();
        if (z2) {
            invalidate();
        }
        this.f2412z0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1767e() {
        return this.f2340C && !TextUtils.isEmpty(this.f2341D) && (this.f2343F instanceof C0202h);
    }

    /* JADX INFO: renamed from: f */
    public final C0112h m1768f(boolean z2) {
        int i2 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc);
        float f = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2367d;
        float popupElevation = editText instanceof C0219y ? ((C0219y) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc);
        C0115k c0115k = new C0115k();
        C0115k c0115k2 = new C0115k();
        C0115k c0115k3 = new C0115k();
        C0115k c0115k4 = new C0115k();
        C0109e c0109e = new C0109e(i2);
        C0109e c0109e2 = new C0109e(i2);
        C0109e c0109e3 = new C0109e(i2);
        C0109e c0109e4 = new C0109e(i2);
        C0105a c0105a = new C0105a(f);
        C0105a c0105a2 = new C0105a(f);
        C0105a c0105a3 = new C0105a(dimensionPixelOffset);
        C0105a c0105a4 = new C0105a(dimensionPixelOffset);
        C0117m c0117m = new C0117m();
        c0117m.f383a = c0115k;
        c0117m.f384b = c0115k2;
        c0117m.f385c = c0115k3;
        c0117m.f386d = c0115k4;
        c0117m.f387e = c0105a;
        c0117m.f388f = c0105a2;
        c0117m.f389g = c0105a4;
        c0117m.f390h = c0105a3;
        c0117m.f391i = c0109e;
        c0117m.f392j = c0109e2;
        c0117m.f393k = c0109e3;
        c0117m.f394l = c0109e4;
        EditText editText2 = this.f2367d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0219y ? ((C0219y) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0112h.f345w;
            dropDownBackgroundTintList = ColorStateList.valueOf(AbstractC0383m.m1055u(context, com.reddit.frontpage.R.attr.resc, C0112h.class.getSimpleName()));
        }
        C0112h c0112h = new C0112h();
        c0112h.m478j(context);
        c0112h.m480l(dropDownBackgroundTintList);
        c0112h.m479k(popupElevation);
        c0112h.setShapeAppearanceModel(c0117m);
        C0111g c0111g = c0112h.f346a;
        if (c0111g.f334g == null) {
            c0111g.f334g = new Rect();
        }
        c0112h.f346a.f334g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0112h.invalidateSelf();
        return c0112h;
    }

    /* JADX INFO: renamed from: g */
    public final int m1769g(int i2, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2367d.getCompoundPaddingLeft() : this.f2365c.m661c() : this.f2363b.m625a()) + i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2367d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1765c() + getPaddingTop() + editText.getBaseline();
    }

    public C0112h getBoxBackground() {
        int i2 = this.f2352O;
        if (i2 == 1 || i2 == 2) {
            return this.f2343F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2358U;
    }

    public int getBoxBackgroundMode() {
        return this.f2352O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2353P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM278g = AbstractC0047m.m278g(this);
        RectF rectF = this.f2362a0;
        return zM278g ? this.f2349L.f390h.mo453a(rectF) : this.f2349L.f389g.mo453a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM278g = AbstractC0047m.m278g(this);
        RectF rectF = this.f2362a0;
        return zM278g ? this.f2349L.f389g.mo453a(rectF) : this.f2349L.f390h.mo453a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM278g = AbstractC0047m.m278g(this);
        RectF rectF = this.f2362a0;
        return zM278g ? this.f2349L.f387e.mo453a(rectF) : this.f2349L.f388f.mo453a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM278g = AbstractC0047m.m278g(this);
        RectF rectF = this.f2362a0;
        return zM278g ? this.f2349L.f388f.mo453a(rectF) : this.f2349L.f387e.mo453a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2386m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2388n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2355R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2356S;
    }

    public int getCounterMaxLength() {
        return this.f2383l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0927e0 c0927e0;
        if (this.f2381k && this.f2385m && (c0927e0 = this.f2389o) != null) {
            return c0927e0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2411z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2409y;
    }

    public ColorStateList getCursorColor() {
        return this.f2336A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2338B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2378i0;
    }

    public EditText getEditText() {
        return this.f2367d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2365c.f691g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2365c.f691g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2365c.f697m;
    }

    public int getEndIconMode() {
        return this.f2365c.f693i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2365c.f698n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2365c.f691g;
    }

    public CharSequence getError() {
        C0216v c0216v = this.f2379j;
        if (c0216v.f735q) {
            return c0216v.f734p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2379j.f738t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2379j.f737s;
    }

    public int getErrorCurrentTextColors() {
        C0927e0 c0927e0 = this.f2379j.f736r;
        if (c0927e0 != null) {
            return c0927e0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2365c.f687c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0216v c0216v = this.f2379j;
        if (c0216v.f742x) {
            return c0216v.f741w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0927e0 c0927e0 = this.f2379j.f743y;
        if (c0927e0 != null) {
            return c0927e0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2340C) {
            return this.f2341D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2404v0.m256d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0037c c0037c = this.f2404v0;
        return c0037c.m257e(c0037c.f123k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2380j0;
    }

    public InterfaceC0193F getLengthCounter() {
        return this.f2387n;
    }

    public int getMaxEms() {
        return this.f2373g;
    }

    public int getMaxWidth() {
        return this.f2377i;
    }

    public int getMinEms() {
        return this.f2371f;
    }

    public int getMinWidth() {
        return this.f2375h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2365c.f691g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2365c.f691g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2397s) {
            return this.f2395r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2403v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2401u;
    }

    public CharSequence getPrefixText() {
        return this.f2363b.f620c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2363b.f619b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2363b.f619b;
    }

    public C0117m getShapeAppearanceModel() {
        return this.f2349L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2363b.f621d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2363b.f621d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2363b.f624g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2363b.f625h;
    }

    public CharSequence getSuffixText() {
        return this.f2365c.f700p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2365c.f701q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2365c.f701q;
    }

    public Typeface getTypeface() {
        return this.f2364b0;
    }

    /* JADX INFO: renamed from: h */
    public final int m1770h(int i2, boolean z2) {
        return i2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2367d.getCompoundPaddingRight() : this.f2363b.m625a() : this.f2365c.m661c());
    }

    /* JADX INFO: renamed from: i */
    public final void m1771i() {
        int i2 = this.f2352O;
        if (i2 == 0) {
            this.f2343F = null;
            this.f2347J = null;
            this.f2348K = null;
        } else if (i2 == 1) {
            this.f2343F = new C0112h(this.f2349L);
            this.f2347J = new C0112h();
            this.f2348K = new C0112h();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.f2352O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2340C || (this.f2343F instanceof C0202h)) {
                this.f2343F = new C0112h(this.f2349L);
            } else {
                C0117m c0117m = this.f2349L;
                int i3 = C0202h.f656y;
                if (c0117m == null) {
                    c0117m = new C0117m();
                }
                C0201g c0201g = new C0201g(c0117m, new RectF());
                C0202h c0202h = new C0202h(c0201g);
                c0202h.f657x = c0201g;
                this.f2343F = c0202h;
            }
            this.f2347J = null;
            this.f2348K = null;
        }
        m1780s();
        m1785x();
        if (this.f2352O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2353P = getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc);
            } else if (AbstractC0016e.m173d0(getContext())) {
                this.f2353P = getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc);
            }
        }
        if (this.f2367d != null && this.f2352O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2367d;
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc), this.f2367d.getPaddingEnd(), getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc));
            } else if (AbstractC0016e.m173d0(getContext())) {
                EditText editText2 = this.f2367d;
                WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc), this.f2367d.getPaddingEnd(), getResources().getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc));
            }
        }
        if (this.f2352O != 0) {
            m1781t();
        }
        EditText editText3 = this.f2367d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f2352O;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1772j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i2;
        float f5;
        int i3;
        if (m1767e()) {
            int width = this.f2367d.getWidth();
            int gravity = this.f2367d.getGravity();
            C0037c c0037c = this.f2404v0;
            boolean zM254b = c0037c.m254b(c0037c.f81A);
            c0037c.f83C = zM254b;
            Rect rect = c0037c.f113d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM254b) {
                        i3 = rect.left;
                        f3 = i3;
                    } else {
                        f = rect.right;
                        f2 = c0037c.f106Z;
                    }
                } else if (zM254b) {
                    f = rect.right;
                    f2 = c0037c.f106Z;
                } else {
                    i3 = rect.left;
                    f3 = i3;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f2362a0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0037c.f106Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0037c.f83C) {
                        f5 = c0037c.f106Z;
                        f4 = f5 + fMax;
                    } else {
                        i2 = rect.right;
                        f4 = i2;
                    }
                } else if (c0037c.f83C) {
                    i2 = rect.right;
                    f4 = i2;
                } else {
                    f5 = c0037c.f106Z;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0037c.m256d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f2351N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2354Q);
                C0202h c0202h = (C0202h) this.f2343F;
                c0202h.getClass();
                c0202h.m644t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0037c.f106Z / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f2362a0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c0037c.f106Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0037c.m256d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1773l(C0927e0 c0927e0, int i2) {
        try {
            AbstractC0383m.m1041f0(c0927e0, i2);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (c0927e0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AbstractC0383m.m1041f0(c0927e0, com.reddit.frontpage.R.style.resc);
        c0927e0.setTextColor(AbstractC0016e.m159H(getContext(), com.reddit.frontpage.R.color.resc));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1774m() {
        C0216v c0216v = this.f2379j;
        return (c0216v.f733o != 1 || c0216v.f736r == null || TextUtils.isEmpty(c0216v.f734p)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m1775n(Editable editable) {
        ((C0189B) this.f2387n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2385m;
        int i2 = this.f2383l;
        String string = null;
        if (i2 == -1) {
            this.f2389o.setText(String.valueOf(length));
            this.f2389o.setContentDescription(null);
            this.f2385m = false;
        } else {
            this.f2385m = length > i2;
            Context context = getContext();
            this.f2389o.setContentDescription(context.getString(this.f2385m ? com.reddit.frontpage.R.string.resc : com.reddit.frontpage.R.string.resc, Integer.valueOf(length), Integer.valueOf(this.f2383l)));
            if (z2 != this.f2385m) {
                m1776o();
            }
            String str = C0168b.f583b;
            C0168b c0168b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0168b.f586e : C0168b.f585d;
            C0927e0 c0927e0 = this.f2389o;
            String string2 = getContext().getString(com.reddit.frontpage.R.string.resc, Integer.valueOf(length), Integer.valueOf(this.f2383l));
            if (string2 == null) {
                c0168b.getClass();
            } else {
                c0168b.getClass();
                C0176j c0176j = AbstractC0177k.f596a;
                string = c0168b.m605c(string2).toString();
            }
            c0927e0.setText(string);
        }
        if (this.f2367d == null || z2 == this.f2385m) {
            return;
        }
        m1782u(false, false);
        m1785x();
        m1779r();
    }

    /* JADX INFO: renamed from: o */
    public final void m1776o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0927e0 c0927e0 = this.f2389o;
        if (c0927e0 != null) {
            m1773l(c0927e0, this.f2385m ? this.f2391p : this.f2393q);
            if (!this.f2385m && (colorStateList2 = this.f2409y) != null) {
                this.f2389o.setTextColor(colorStateList2);
            }
            if (!this.f2385m || (colorStateList = this.f2411z) == null) {
                return;
            }
            this.f2389o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2404v0.m258g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0212r c0212r = this.f2365c;
        c0212r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2339B0 = false;
        if (this.f2367d != null && this.f2367d.getMeasuredHeight() < (iMax = Math.max(c0212r.getMeasuredHeight(), this.f2363b.getMeasuredHeight()))) {
            this.f2367d.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zM1778q = m1778q();
        if (z2 || zM1778q) {
            this.f2367d.post(new RunnableC0020a(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f2367d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0038d.f139a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2359V;
            rect.set(0, 0, width, height);
            AbstractC0038d.m266b(this, editText, rect);
            C0112h c0112h = this.f2347J;
            if (c0112h != null) {
                int i6 = rect.bottom;
                c0112h.setBounds(rect.left, i6 - this.f2355R, rect.right, i6);
            }
            C0112h c0112h2 = this.f2348K;
            if (c0112h2 != null) {
                int i7 = rect.bottom;
                c0112h2.setBounds(rect.left, i7 - this.f2356S, rect.right, i7);
            }
            if (this.f2340C) {
                float textSize = this.f2367d.getTextSize();
                C0037c c0037c = this.f2404v0;
                if (c0037c.f120h != textSize) {
                    c0037c.f120h = textSize;
                    c0037c.m259h(false);
                }
                int gravity = this.f2367d.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c0037c.f119g != i8) {
                    c0037c.f119g = i8;
                    c0037c.m259h(false);
                }
                if (c0037c.f117f != gravity) {
                    c0037c.f117f = gravity;
                    c0037c.m259h(false);
                }
                if (this.f2367d == null) {
                    throw new IllegalStateException();
                }
                boolean zM278g = AbstractC0047m.m278g(this);
                int i9 = rect.bottom;
                Rect rect2 = this.f2360W;
                rect2.bottom = i9;
                int i10 = this.f2352O;
                if (i10 == 1) {
                    rect2.left = m1769g(rect.left, zM278g);
                    rect2.top = rect.top + this.f2353P;
                    rect2.right = m1770h(rect.right, zM278g);
                } else if (i10 != 2) {
                    rect2.left = m1769g(rect.left, zM278g);
                    rect2.top = getPaddingTop();
                    rect2.right = m1770h(rect.right, zM278g);
                } else {
                    rect2.left = this.f2367d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m1765c();
                    rect2.right = rect.right - this.f2367d.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = c0037c.f113d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    c0037c.f93M = true;
                }
                if (this.f2367d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0037c.f95O;
                textPaint.setTextSize(c0037c.f120h);
                textPaint.setTypeface(c0037c.f133u);
                textPaint.setLetterSpacing(c0037c.f103W);
                float f = -textPaint.ascent();
                rect2.left = this.f2367d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2352O != 1 || this.f2367d.getMinLines() > 1) ? rect.top + this.f2367d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f2367d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2352O != 1 || this.f2367d.getMinLines() > 1) ? rect.bottom - this.f2367d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = c0037c.f111c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    c0037c.f93M = true;
                }
                c0037c.m259h(false);
                if (!m1767e() || this.f2402u0) {
                    return;
                }
                m1772j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.f2339B0;
        C0212r c0212r = this.f2365c;
        if (!z2) {
            c0212r.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2339B0 = true;
        }
        if (this.f2399t != null && (editText = this.f2367d) != null) {
            this.f2399t.setGravity(editText.getGravity());
            this.f2399t.setPadding(this.f2367d.getCompoundPaddingLeft(), this.f2367d.getCompoundPaddingTop(), this.f2367d.getCompoundPaddingRight(), this.f2367d.getCompoundPaddingBottom());
        }
        c0212r.m671m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0194G)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0194G c0194g = (C0194G) parcelable;
        super.onRestoreInstanceState(c0194g.f1069a);
        setError(c0194g.f635c);
        if (c0194g.f636d) {
            post(new RunnableC0191D(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = i2 == 1;
        if (z2 != this.f2350M) {
            InterfaceC0107c interfaceC0107c = this.f2349L.f387e;
            RectF rectF = this.f2362a0;
            float fMo453a = interfaceC0107c.mo453a(rectF);
            float fMo453a2 = this.f2349L.f388f.mo453a(rectF);
            float fMo453a3 = this.f2349L.f390h.mo453a(rectF);
            float fMo453a4 = this.f2349L.f389g.mo453a(rectF);
            C0117m c0117m = this.f2349L;
            AbstractC0016e abstractC0016e = c0117m.f383a;
            AbstractC0016e abstractC0016e2 = c0117m.f384b;
            AbstractC0016e abstractC0016e3 = c0117m.f386d;
            AbstractC0016e abstractC0016e4 = c0117m.f385c;
            C0109e c0109e = new C0109e(0);
            C0109e c0109e2 = new C0109e(0);
            C0109e c0109e3 = new C0109e(0);
            C0109e c0109e4 = new C0109e(0);
            C0116l.m488b(abstractC0016e2);
            C0116l.m488b(abstractC0016e);
            C0116l.m488b(abstractC0016e4);
            C0116l.m488b(abstractC0016e3);
            C0105a c0105a = new C0105a(fMo453a2);
            C0105a c0105a2 = new C0105a(fMo453a);
            C0105a c0105a3 = new C0105a(fMo453a4);
            C0105a c0105a4 = new C0105a(fMo453a3);
            C0117m c0117m2 = new C0117m();
            c0117m2.f383a = abstractC0016e2;
            c0117m2.f384b = abstractC0016e;
            c0117m2.f385c = abstractC0016e3;
            c0117m2.f386d = abstractC0016e4;
            c0117m2.f387e = c0105a;
            c0117m2.f388f = c0105a2;
            c0117m2.f389g = c0105a4;
            c0117m2.f390h = c0105a3;
            c0117m2.f391i = c0109e;
            c0117m2.f392j = c0109e2;
            c0117m2.f393k = c0109e3;
            c0117m2.f394l = c0109e4;
            this.f2350M = z2;
            setShapeAppearanceModel(c0117m2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0194G c0194g = new C0194G(super.onSaveInstanceState());
        if (m1774m()) {
            c0194g.f635c = getError();
        }
        C0212r c0212r = this.f2365c;
        c0194g.f636d = c0212r.f693i != 0 && c0212r.f691g.f2277d;
        return c0194g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1777p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f2336A;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM189o0 = AbstractC0016e.m189o0(context, com.reddit.frontpage.R.attr.resc);
            if (typedValueM189o0 != null) {
                int i2 = typedValueM189o0.resourceId;
                if (i2 != 0) {
                    colorStateListValueOf = AbstractC0016e.m160I(context, i2);
                } else {
                    int i3 = typedValueM189o0.data;
                    colorStateListValueOf = i3 != 0 ? ColorStateList.valueOf(i3) : null;
                }
            }
        }
        EditText editText = this.f2367d;
        if (editText == null || AbstractC0000a.m8e(editText) == null) {
            return;
        }
        Drawable drawableMutate = AbstractC0016e.m154B0(AbstractC0000a.m8e(this.f2367d)).mutate();
        if ((m1774m() || (this.f2389o != null && this.f2385m)) && (colorStateList = this.f2338B) != null) {
            colorStateListValueOf = colorStateList;
        }
        AbstractC0092a.m429h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1778q() {
        boolean z2;
        if (this.f2367d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0188A c0188a = this.f2363b;
            if (c0188a.getMeasuredWidth() > 0) {
                int measuredWidth = c0188a.getMeasuredWidth() - this.f2367d.getPaddingLeft();
                if (this.f2366c0 == null || this.f2368d0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f2366c0 = colorDrawable;
                    this.f2368d0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f2367d.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f2366c0;
                if (drawable != colorDrawable2) {
                    this.f2367d.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z2 = true;
                }
                z2 = false;
            } else {
                if (this.f2366c0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f2367d.getCompoundDrawablesRelative();
                    this.f2367d.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f2366c0 = null;
                    z2 = true;
                }
                z2 = false;
            }
        }
        C0212r c0212r = this.f2365c;
        if ((c0212r.m663e() || ((c0212r.f693i != 0 && c0212r.m662d()) || c0212r.f700p != null)) && c0212r.getMeasuredWidth() > 0) {
            int measuredWidth2 = c0212r.f701q.getMeasuredWidth() - this.f2367d.getPaddingRight();
            if (c0212r.m663e()) {
                checkableImageButton = c0212r.f687c;
            } else if (c0212r.f693i != 0 && c0212r.m662d()) {
                checkableImageButton = c0212r.f691g;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f2367d.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f2372f0;
            if (colorDrawable3 != null && this.f2374g0 != measuredWidth2) {
                this.f2374g0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f2367d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2372f0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f2372f0 = colorDrawable4;
                this.f2374g0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f2372f0;
            if (drawable2 != colorDrawable5) {
                this.f2376h0 = drawable2;
                this.f2367d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f2372f0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f2367d.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f2372f0) {
                this.f2367d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f2376h0, compoundDrawablesRelative4[3]);
            } else {
                z3 = z2;
            }
            this.f2372f0 = null;
            return z3;
        }
        return z2;
    }

    /* JADX INFO: renamed from: r */
    public final void m1779r() {
        Drawable background;
        C0927e0 c0927e0;
        EditText editText = this.f2367d;
        if (editText == null || this.f2352O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0966r0.f3838a;
        Drawable drawableMutate = background.mutate();
        if (m1774m()) {
            drawableMutate.setColorFilter(C0973u.m2424c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2385m && (c0927e0 = this.f2389o) != null) {
            drawableMutate.setColorFilter(C0973u.m2424c(c0927e0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC0016e.m184m(drawableMutate);
            this.f2367d.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1780s() {
        EditText editText = this.f2367d;
        if (editText == null || this.f2343F == null) {
            return;
        }
        if ((this.f2346I || editText.getBackground() == null) && this.f2352O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2367d;
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            editText2.setBackground(editTextBoxBackground);
            this.f2346I = true;
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f2358U != i2) {
            this.f2358U = i2;
            this.f2390o0 = i2;
            this.f2394q0 = i2;
            this.f2396r0 = i2;
            m1764b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(AbstractC0016e.m159H(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2390o0 = defaultColor;
        this.f2358U = defaultColor;
        this.f2392p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2394q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2396r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1764b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.f2352O) {
            return;
        }
        this.f2352O = i2;
        if (this.f2367d != null) {
            m1771i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f2353P = i2;
    }

    public void setBoxCornerFamily(int i2) {
        C0116l c0116lM495e = this.f2349L.m495e();
        InterfaceC0107c interfaceC0107c = this.f2349L.f387e;
        AbstractC0016e abstractC0016eM198t = AbstractC0016e.m198t(i2);
        c0116lM495e.f371a = abstractC0016eM198t;
        C0116l.m488b(abstractC0016eM198t);
        c0116lM495e.f375e = interfaceC0107c;
        InterfaceC0107c interfaceC0107c2 = this.f2349L.f388f;
        AbstractC0016e abstractC0016eM198t2 = AbstractC0016e.m198t(i2);
        c0116lM495e.f372b = abstractC0016eM198t2;
        C0116l.m488b(abstractC0016eM198t2);
        c0116lM495e.f376f = interfaceC0107c2;
        InterfaceC0107c interfaceC0107c3 = this.f2349L.f390h;
        AbstractC0016e abstractC0016eM198t3 = AbstractC0016e.m198t(i2);
        c0116lM495e.f374d = abstractC0016eM198t3;
        C0116l.m488b(abstractC0016eM198t3);
        c0116lM495e.f378h = interfaceC0107c3;
        InterfaceC0107c interfaceC0107c4 = this.f2349L.f389g;
        AbstractC0016e abstractC0016eM198t4 = AbstractC0016e.m198t(i2);
        c0116lM495e.f373c = abstractC0016eM198t4;
        C0116l.m488b(abstractC0016eM198t4);
        c0116lM495e.f377g = interfaceC0107c4;
        this.f2349L = c0116lM495e.m489a();
        m1764b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f2386m0 != i2) {
            this.f2386m0 = i2;
            m1785x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2382k0 = colorStateList.getDefaultColor();
            this.f2398s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2384l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2386m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2386m0 != colorStateList.getDefaultColor()) {
            this.f2386m0 = colorStateList.getDefaultColor();
        }
        m1785x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2388n0 != colorStateList) {
            this.f2388n0 = colorStateList;
            m1785x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f2355R = i2;
        m1785x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f2356S = i2;
        m1785x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2381k != z2) {
            C0216v c0216v = this.f2379j;
            if (z2) {
                C0927e0 c0927e0 = new C0927e0(getContext(), null);
                this.f2389o = c0927e0;
                c0927e0.setId(com.reddit.frontpage.R.id.resc);
                Typeface typeface = this.f2364b0;
                if (typeface != null) {
                    this.f2389o.setTypeface(typeface);
                }
                this.f2389o.setMaxLines(1);
                c0216v.m676a(this.f2389o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2389o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc));
                m1776o();
                if (this.f2389o != null) {
                    EditText editText = this.f2367d;
                    m1775n(editText != null ? editText.getText() : null);
                }
            } else {
                c0216v.m682g(this.f2389o, 2);
                this.f2389o = null;
            }
            this.f2381k = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f2383l != i2) {
            if (i2 > 0) {
                this.f2383l = i2;
            } else {
                this.f2383l = -1;
            }
            if (!this.f2381k || this.f2389o == null) {
                return;
            }
            EditText editText = this.f2367d;
            m1775n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f2391p != i2) {
            this.f2391p = i2;
            m1776o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2411z != colorStateList) {
            this.f2411z = colorStateList;
            m1776o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f2393q != i2) {
            this.f2393q = i2;
            m1776o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2409y != colorStateList) {
            this.f2409y = colorStateList;
            m1776o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2336A != colorStateList) {
            this.f2336A = colorStateList;
            m1777p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2338B != colorStateList) {
            this.f2338B = colorStateList;
            if (m1774m() || (this.f2389o != null && this.f2385m)) {
                m1777p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2378i0 = colorStateList;
        this.f2380j0 = colorStateList;
        if (this.f2367d != null) {
            m1782u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m1762k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2365c.f691g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2365c.f691g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        C0212r c0212r = this.f2365c;
        CharSequence text = i2 != 0 ? c0212r.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = c0212r.f691g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        C0212r c0212r = this.f2365c;
        Drawable drawableM1057w = i2 != 0 ? AbstractC0383m.m1057w(c0212r.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = c0212r.f691g;
        checkableImageButton.setImageDrawable(drawableM1057w);
        if (drawableM1057w != null) {
            ColorStateList colorStateList = c0212r.f695k;
            PorterDuff.Mode mode = c0212r.f696l;
            TextInputLayout textInputLayout = c0212r.f685a;
            AbstractC0016e.m172d(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0016e.m187n0(textInputLayout, checkableImageButton, c0212r.f695k);
        }
    }

    public void setEndIconMinSize(int i2) {
        C0212r c0212r = this.f2365c;
        if (i2 < 0) {
            c0212r.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != c0212r.f697m) {
            c0212r.f697m = i2;
            CheckableImageButton checkableImageButton = c0212r.f691g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = c0212r.f687c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f2365c.m665g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0212r c0212r = this.f2365c;
        View.OnLongClickListener onLongClickListener = c0212r.f699o;
        CheckableImageButton checkableImageButton = c0212r.f691g;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0016e.m199v0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0212r c0212r = this.f2365c;
        c0212r.f699o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0212r.f691g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0016e.m199v0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0212r c0212r = this.f2365c;
        c0212r.f698n = scaleType;
        c0212r.f691g.setScaleType(scaleType);
        c0212r.f687c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0212r c0212r = this.f2365c;
        if (c0212r.f695k != colorStateList) {
            c0212r.f695k = colorStateList;
            AbstractC0016e.m172d(c0212r.f685a, c0212r.f691g, colorStateList, c0212r.f696l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0212r c0212r = this.f2365c;
        if (c0212r.f696l != mode) {
            c0212r.f696l = mode;
            AbstractC0016e.m172d(c0212r.f685a, c0212r.f691g, c0212r.f695k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2365c.m666h(z2);
    }

    public void setError(CharSequence charSequence) {
        C0216v c0216v = this.f2379j;
        if (!c0216v.f735q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0216v.m681f();
            return;
        }
        c0216v.m678c();
        c0216v.f734p = charSequence;
        c0216v.f736r.setText(charSequence);
        int i2 = c0216v.f732n;
        if (i2 != 1) {
            c0216v.f733o = 1;
        }
        c0216v.m684i(i2, c0216v.f733o, c0216v.m683h(c0216v.f736r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        C0216v c0216v = this.f2379j;
        c0216v.f738t = i2;
        C0927e0 c0927e0 = c0216v.f736r;
        if (c0927e0 != null) {
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            c0927e0.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0216v c0216v = this.f2379j;
        c0216v.f737s = charSequence;
        C0927e0 c0927e0 = c0216v.f736r;
        if (c0927e0 != null) {
            c0927e0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        C0216v c0216v = this.f2379j;
        if (c0216v.f735q == z2) {
            return;
        }
        c0216v.m678c();
        TextInputLayout textInputLayout = c0216v.f726h;
        if (z2) {
            C0927e0 c0927e0 = new C0927e0(c0216v.f725g, null);
            c0216v.f736r = c0927e0;
            c0927e0.setId(com.reddit.frontpage.R.id.resc);
            c0216v.f736r.setTextAlignment(5);
            Typeface typeface = c0216v.f718B;
            if (typeface != null) {
                c0216v.f736r.setTypeface(typeface);
            }
            int i2 = c0216v.f739u;
            c0216v.f739u = i2;
            C0927e0 c0927e02 = c0216v.f736r;
            if (c0927e02 != null) {
                textInputLayout.m1773l(c0927e02, i2);
            }
            ColorStateList colorStateList = c0216v.f740v;
            c0216v.f740v = colorStateList;
            C0927e0 c0927e03 = c0216v.f736r;
            if (c0927e03 != null && colorStateList != null) {
                c0927e03.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0216v.f737s;
            c0216v.f737s = charSequence;
            C0927e0 c0927e04 = c0216v.f736r;
            if (c0927e04 != null) {
                c0927e04.setContentDescription(charSequence);
            }
            int i3 = c0216v.f738t;
            c0216v.f738t = i3;
            C0927e0 c0927e05 = c0216v.f736r;
            if (c0927e05 != null) {
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                c0927e05.setAccessibilityLiveRegion(i3);
            }
            c0216v.f736r.setVisibility(4);
            c0216v.m676a(c0216v.f736r, 0);
        } else {
            c0216v.m681f();
            c0216v.m682g(c0216v.f736r, 0);
            c0216v.f736r = null;
            textInputLayout.m1779r();
            textInputLayout.m1785x();
        }
        c0216v.f735q = z2;
    }

    public void setErrorIconDrawable(int i2) {
        C0212r c0212r = this.f2365c;
        c0212r.m667i(i2 != 0 ? AbstractC0383m.m1057w(c0212r.getContext(), i2) : null);
        AbstractC0016e.m187n0(c0212r.f685a, c0212r.f687c, c0212r.f688d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0212r c0212r = this.f2365c;
        CheckableImageButton checkableImageButton = c0212r.f687c;
        View.OnLongClickListener onLongClickListener = c0212r.f690f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0016e.m199v0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0212r c0212r = this.f2365c;
        c0212r.f690f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0212r.f687c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0016e.m199v0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0212r c0212r = this.f2365c;
        if (c0212r.f688d != colorStateList) {
            c0212r.f688d = colorStateList;
            AbstractC0016e.m172d(c0212r.f685a, c0212r.f687c, colorStateList, c0212r.f689e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0212r c0212r = this.f2365c;
        if (c0212r.f689e != mode) {
            c0212r.f689e = mode;
            AbstractC0016e.m172d(c0212r.f685a, c0212r.f687c, c0212r.f688d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        C0216v c0216v = this.f2379j;
        c0216v.f739u = i2;
        C0927e0 c0927e0 = c0216v.f736r;
        if (c0927e0 != null) {
            c0216v.f726h.m1773l(c0927e0, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0216v c0216v = this.f2379j;
        c0216v.f740v = colorStateList;
        C0927e0 c0927e0 = c0216v.f736r;
        if (c0927e0 == null || colorStateList == null) {
            return;
        }
        c0927e0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2406w0 != z2) {
            this.f2406w0 = z2;
            m1782u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0216v c0216v = this.f2379j;
        if (zIsEmpty) {
            if (c0216v.f742x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0216v.f742x) {
            setHelperTextEnabled(true);
        }
        c0216v.m678c();
        c0216v.f741w = charSequence;
        c0216v.f743y.setText(charSequence);
        int i2 = c0216v.f732n;
        if (i2 != 2) {
            c0216v.f733o = 2;
        }
        c0216v.m684i(i2, c0216v.f733o, c0216v.m683h(c0216v.f743y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0216v c0216v = this.f2379j;
        c0216v.f717A = colorStateList;
        C0927e0 c0927e0 = c0216v.f743y;
        if (c0927e0 == null || colorStateList == null) {
            return;
        }
        c0927e0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        C0216v c0216v = this.f2379j;
        if (c0216v.f742x == z2) {
            return;
        }
        c0216v.m678c();
        if (z2) {
            C0927e0 c0927e0 = new C0927e0(c0216v.f725g, null);
            c0216v.f743y = c0927e0;
            c0927e0.setId(com.reddit.frontpage.R.id.resc);
            c0216v.f743y.setTextAlignment(5);
            Typeface typeface = c0216v.f718B;
            if (typeface != null) {
                c0216v.f743y.setTypeface(typeface);
            }
            c0216v.f743y.setVisibility(4);
            c0216v.f743y.setAccessibilityLiveRegion(1);
            int i2 = c0216v.f744z;
            c0216v.f744z = i2;
            C0927e0 c0927e02 = c0216v.f743y;
            if (c0927e02 != null) {
                AbstractC0383m.m1041f0(c0927e02, i2);
            }
            ColorStateList colorStateList = c0216v.f717A;
            c0216v.f717A = colorStateList;
            C0927e0 c0927e03 = c0216v.f743y;
            if (c0927e03 != null && colorStateList != null) {
                c0927e03.setTextColor(colorStateList);
            }
            c0216v.m676a(c0216v.f743y, 1);
            c0216v.f743y.setAccessibilityDelegate(new C0215u(c0216v));
        } else {
            c0216v.m678c();
            int i3 = c0216v.f732n;
            if (i3 == 2) {
                c0216v.f733o = 0;
            }
            c0216v.m684i(i3, c0216v.f733o, c0216v.m683h(c0216v.f743y, ""));
            c0216v.m682g(c0216v.f743y, 1);
            c0216v.f743y = null;
            TextInputLayout textInputLayout = c0216v.f726h;
            textInputLayout.m1779r();
            textInputLayout.m1785x();
        }
        c0216v.f742x = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        C0216v c0216v = this.f2379j;
        c0216v.f744z = i2;
        C0927e0 c0927e0 = c0216v.f743y;
        if (c0927e0 != null) {
            AbstractC0383m.m1041f0(c0927e0, i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2340C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2408x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2340C) {
            this.f2340C = z2;
            if (z2) {
                CharSequence hint = this.f2367d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2341D)) {
                        setHint(hint);
                    }
                    this.f2367d.setHint((CharSequence) null);
                }
                this.f2342E = true;
            } else {
                this.f2342E = false;
                if (!TextUtils.isEmpty(this.f2341D) && TextUtils.isEmpty(this.f2367d.getHint())) {
                    this.f2367d.setHint(this.f2341D);
                }
                setHintInternal(null);
            }
            if (this.f2367d != null) {
                m1781t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        C0037c c0037c = this.f2404v0;
        TextInputLayout textInputLayout = c0037c.f107a;
        C0089d c0089d = new C0089d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = c0089d.f281j;
        if (colorStateList != null) {
            c0037c.f123k = colorStateList;
        }
        float f = c0089d.f282k;
        if (f != 0.0f) {
            c0037c.f121i = f;
        }
        ColorStateList colorStateList2 = c0089d.f272a;
        if (colorStateList2 != null) {
            c0037c.f101U = colorStateList2;
        }
        c0037c.f99S = c0089d.f276e;
        c0037c.f100T = c0089d.f277f;
        c0037c.f98R = c0089d.f278g;
        c0037c.f102V = c0089d.f280i;
        C0086a c0086a = c0037c.f137y;
        if (c0086a != null) {
            c0086a.f265m = true;
        }
        C0001b c0001b = new C0001b(1, c0037c);
        c0089d.m380a();
        c0037c.f137y = new C0086a(c0001b, c0089d.f285n);
        c0089d.m382c(textInputLayout.getContext(), c0037c.f137y);
        c0037c.m259h(false);
        this.f2380j0 = c0037c.f123k;
        if (this.f2367d != null) {
            m1782u(false, false);
            m1781t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2380j0 != colorStateList) {
            if (this.f2378i0 == null) {
                C0037c c0037c = this.f2404v0;
                if (c0037c.f123k != colorStateList) {
                    c0037c.f123k = colorStateList;
                    c0037c.m259h(false);
                }
            }
            this.f2380j0 = colorStateList;
            if (this.f2367d != null) {
                m1782u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0193F interfaceC0193F) {
        this.f2387n = interfaceC0193F;
    }

    public void setMaxEms(int i2) {
        this.f2373g = i2;
        EditText editText = this.f2367d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.f2377i = i2;
        EditText editText = this.f2367d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f2371f = i2;
        EditText editText = this.f2367d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.f2375h = i2;
        EditText editText = this.f2367d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        C0212r c0212r = this.f2365c;
        c0212r.f691g.setContentDescription(i2 != 0 ? c0212r.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        C0212r c0212r = this.f2365c;
        c0212r.f691g.setImageDrawable(i2 != 0 ? AbstractC0383m.m1057w(c0212r.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        C0212r c0212r = this.f2365c;
        if (z2 && c0212r.f693i != 1) {
            c0212r.m665g(1);
        } else if (z2) {
            c0212r.getClass();
        } else {
            c0212r.m665g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0212r c0212r = this.f2365c;
        c0212r.f695k = colorStateList;
        AbstractC0016e.m172d(c0212r.f685a, c0212r.f691g, colorStateList, c0212r.f696l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0212r c0212r = this.f2365c;
        c0212r.f696l = mode;
        AbstractC0016e.m172d(c0212r.f685a, c0212r.f691g, c0212r.f695k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2399t == null) {
            C0927e0 c0927e0 = new C0927e0(getContext(), null);
            this.f2399t = c0927e0;
            c0927e0.setId(com.reddit.frontpage.R.id.resc);
            this.f2399t.setImportantForAccessibility(2);
            C0844h c0844hM1766d = m1766d();
            this.f2405w = c0844hM1766d;
            c0844hM1766d.f3458b = 67L;
            this.f2407x = m1766d();
            setPlaceholderTextAppearance(this.f2403v);
            setPlaceholderTextColor(this.f2401u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2397s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2395r = charSequence;
        }
        EditText editText = this.f2367d;
        m1783v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f2403v = i2;
        C0927e0 c0927e0 = this.f2399t;
        if (c0927e0 != null) {
            AbstractC0383m.m1041f0(c0927e0, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2401u != colorStateList) {
            this.f2401u = colorStateList;
            C0927e0 c0927e0 = this.f2399t;
            if (c0927e0 == null || colorStateList == null) {
                return;
            }
            c0927e0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0188A c0188a = this.f2363b;
        c0188a.getClass();
        c0188a.f620c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0188a.f619b.setText(charSequence);
        c0188a.m629e();
    }

    public void setPrefixTextAppearance(int i2) {
        AbstractC0383m.m1041f0(this.f2363b.f619b, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2363b.f619b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0117m c0117m) {
        C0112h c0112h = this.f2343F;
        if (c0112h == null || c0112h.f346a.f328a == c0117m) {
            return;
        }
        this.f2349L = c0117m;
        m1764b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2363b.f621d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2363b.f621d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? AbstractC0383m.m1057w(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        C0188A c0188a = this.f2363b;
        if (i2 < 0) {
            c0188a.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != c0188a.f624g) {
            c0188a.f624g = i2;
            CheckableImageButton checkableImageButton = c0188a.f621d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0188A c0188a = this.f2363b;
        View.OnLongClickListener onLongClickListener = c0188a.f626i;
        CheckableImageButton checkableImageButton = c0188a.f621d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0016e.m199v0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0188A c0188a = this.f2363b;
        c0188a.f626i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0188a.f621d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0016e.m199v0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0188A c0188a = this.f2363b;
        c0188a.f625h = scaleType;
        c0188a.f621d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0188A c0188a = this.f2363b;
        if (c0188a.f622e != colorStateList) {
            c0188a.f622e = colorStateList;
            AbstractC0016e.m172d(c0188a.f618a, c0188a.f621d, colorStateList, c0188a.f623f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0188A c0188a = this.f2363b;
        if (c0188a.f623f != mode) {
            c0188a.f623f = mode;
            AbstractC0016e.m172d(c0188a.f618a, c0188a.f621d, c0188a.f622e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2363b.m627c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0212r c0212r = this.f2365c;
        c0212r.getClass();
        c0212r.f700p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0212r.f701q.setText(charSequence);
        c0212r.m672n();
    }

    public void setSuffixTextAppearance(int i2) {
        AbstractC0383m.m1041f0(this.f2365c.f701q, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2365c.f701q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0192E c0192e) {
        EditText editText = this.f2367d;
        if (editText != null) {
            AbstractC0240S.m785p(editText, c0192e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2364b0) {
            this.f2364b0 = typeface;
            this.f2404v0.m264m(typeface);
            C0216v c0216v = this.f2379j;
            if (typeface != c0216v.f718B) {
                c0216v.f718B = typeface;
                C0927e0 c0927e0 = c0216v.f736r;
                if (c0927e0 != null) {
                    c0927e0.setTypeface(typeface);
                }
                C0927e0 c0927e02 = c0216v.f743y;
                if (c0927e02 != null) {
                    c0927e02.setTypeface(typeface);
                }
            }
            C0927e0 c0927e03 = this.f2389o;
            if (c0927e03 != null) {
                c0927e03.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1781t() {
        if (this.f2352O != 1) {
            FrameLayout frameLayout = this.f2361a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM1765c = m1765c();
            if (iM1765c != layoutParams.topMargin) {
                layoutParams.topMargin = iM1765c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1782u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0927e0 c0927e0;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2367d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2367d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2378i0;
        C0037c c0037c = this.f2404v0;
        if (colorStateList2 != null) {
            c0037c.m260i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f2378i0;
            c0037c.m260i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2398s0) : this.f2398s0));
        } else if (m1774m()) {
            C0927e0 c0927e02 = this.f2379j.f736r;
            c0037c.m260i(c0927e02 != null ? c0927e02.getTextColors() : null);
        } else if (this.f2385m && (c0927e0 = this.f2389o) != null) {
            c0037c.m260i(c0927e0.getTextColors());
        } else if (z5 && (colorStateList = this.f2380j0) != null && c0037c.f123k != colorStateList) {
            c0037c.f123k = colorStateList;
            c0037c.m259h(false);
        }
        C0212r c0212r = this.f2365c;
        C0188A c0188a = this.f2363b;
        if (z4 || !this.f2406w0 || (isEnabled() && z5)) {
            if (z3 || this.f2402u0) {
                ValueAnimator valueAnimator = this.f2410y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2410y0.cancel();
                }
                if (z2 && this.f2408x0) {
                    m1763a(1.0f);
                } else {
                    c0037c.m262k(1.0f);
                }
                this.f2402u0 = false;
                if (m1767e()) {
                    m1772j();
                }
                EditText editText3 = this.f2367d;
                m1783v(editText3 != null ? editText3.getText() : null);
                c0188a.f627j = false;
                c0188a.m629e();
                c0212r.f702r = false;
                c0212r.m672n();
                return;
            }
            return;
        }
        if (z3 || !this.f2402u0) {
            ValueAnimator valueAnimator2 = this.f2410y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2410y0.cancel();
            }
            if (z2 && this.f2408x0) {
                m1763a(0.0f);
            } else {
                c0037c.m262k(0.0f);
            }
            if (m1767e() && !((C0202h) this.f2343F).f657x.f655r.isEmpty() && m1767e()) {
                ((C0202h) this.f2343F).m644t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2402u0 = true;
            C0927e0 c0927e03 = this.f2399t;
            if (c0927e03 != null && this.f2397s) {
                c0927e03.setText((CharSequence) null);
                AbstractC0853q.m2260a(this.f2361a, this.f2407x);
                this.f2399t.setVisibility(4);
            }
            c0188a.f627j = true;
            c0188a.m629e();
            c0212r.f702r = true;
            c0212r.m672n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1783v(Editable editable) {
        ((C0189B) this.f2387n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2361a;
        if (length != 0 || this.f2402u0) {
            C0927e0 c0927e0 = this.f2399t;
            if (c0927e0 == null || !this.f2397s) {
                return;
            }
            c0927e0.setText((CharSequence) null);
            AbstractC0853q.m2260a(frameLayout, this.f2407x);
            this.f2399t.setVisibility(4);
            return;
        }
        if (this.f2399t == null || !this.f2397s || TextUtils.isEmpty(this.f2395r)) {
            return;
        }
        this.f2399t.setText(this.f2395r);
        AbstractC0853q.m2260a(frameLayout, this.f2405w);
        this.f2399t.setVisibility(0);
        this.f2399t.bringToFront();
        announceForAccessibility(this.f2395r);
    }

    /* JADX INFO: renamed from: w */
    public final void m1784w(boolean z2, boolean z3) {
        int defaultColor = this.f2388n0.getDefaultColor();
        int colorForState = this.f2388n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2388n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2357T = colorForState2;
        } else if (z3) {
            this.f2357T = colorForState;
        } else {
            this.f2357T = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1785x() {
        C0927e0 c0927e0;
        EditText editText;
        EditText editText2;
        if (this.f2343F == null || this.f2352O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2367d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2367d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2357T = this.f2398s0;
        } else if (m1774m()) {
            if (this.f2388n0 != null) {
                m1784w(z3, z2);
            } else {
                this.f2357T = getErrorCurrentTextColors();
            }
        } else if (!this.f2385m || (c0927e0 = this.f2389o) == null) {
            if (z3) {
                this.f2357T = this.f2386m0;
            } else if (z2) {
                this.f2357T = this.f2384l0;
            } else {
                this.f2357T = this.f2382k0;
            }
        } else if (this.f2388n0 != null) {
            m1784w(z3, z2);
        } else {
            this.f2357T = c0927e0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m1777p();
        }
        C0212r c0212r = this.f2365c;
        c0212r.m670l();
        CheckableImageButton checkableImageButton = c0212r.f687c;
        ColorStateList colorStateList = c0212r.f688d;
        TextInputLayout textInputLayout = c0212r.f685a;
        AbstractC0016e.m187n0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0212r.f695k;
        CheckableImageButton checkableImageButton2 = c0212r.f691g;
        AbstractC0016e.m187n0(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0212r.m660b() instanceof C0207m) {
            if (!textInputLayout.m1774m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0016e.m172d(textInputLayout, checkableImageButton2, c0212r.f695k, c0212r.f696l);
            } else {
                Drawable drawableMutate = AbstractC0016e.m154B0(checkableImageButton2.getDrawable()).mutate();
                AbstractC0092a.m428g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C0188A c0188a = this.f2363b;
        AbstractC0016e.m187n0(c0188a.f618a, c0188a.f621d, c0188a.f622e);
        if (this.f2352O == 2) {
            int i2 = this.f2354Q;
            if (z3 && isEnabled()) {
                this.f2354Q = this.f2356S;
            } else {
                this.f2354Q = this.f2355R;
            }
            if (this.f2354Q != i2 && m1767e() && !this.f2402u0) {
                if (m1767e()) {
                    ((C0202h) this.f2343F).m644t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m1772j();
            }
        }
        if (this.f2352O == 1) {
            if (!isEnabled()) {
                this.f2358U = this.f2392p0;
            } else if (z2 && !z3) {
                this.f2358U = this.f2396r0;
            } else if (z3) {
                this.f2358U = this.f2394q0;
            } else {
                this.f2358U = this.f2390o0;
            }
        }
        m1764b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2363b.m626b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2365c.f691g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2365c.f691g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2365c.m667i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2365c.f691g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0212r c0212r = this.f2365c;
        CheckableImageButton checkableImageButton = c0212r.f691g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0212r.f695k;
            PorterDuff.Mode mode = c0212r.f696l;
            TextInputLayout textInputLayout = c0212r.f685a;
            AbstractC0016e.m172d(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0016e.m187n0(textInputLayout, checkableImageButton, c0212r.f695k);
        }
    }
}
