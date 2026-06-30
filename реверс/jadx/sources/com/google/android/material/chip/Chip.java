package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p005C0.C0043i;
import p005C0.C0045k;
import p005C0.InterfaceC0040f;
import p010F0.C0089d;
import p011G.C0097f;
import p011G.InterfaceC0096e;
import p012G0.AbstractC0102d;
import p015I0.C0117m;
import p015I0.InterfaceC0128x;
import p020L.AbstractC0177k;
import p020L.C0168b;
import p020L.C0176j;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p027O0.AbstractC0322a;
import p031Q0.C0346t;
import p036T.AbstractC0383m;
import p074l.C0965r;
import p079n0.AbstractC1013a;
import p081o0.C1016b;
import p098x0.C1094a;
import p098x0.C1095b;
import p098x0.C1097d;
import p098x0.InterfaceC1096c;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0965r implements InterfaceC1096c, InterfaceC0128x, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f2163w = new Rect();

    /* JADX INFO: renamed from: x */
    public static final int[] f2164x = {R.attr.state_selected};

    /* JADX INFO: renamed from: y */
    public static final int[] f2165y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C1097d f2166e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f2167f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f2168g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f2169h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f2170i;

    /* JADX INFO: renamed from: j */
    public boolean f2171j;

    /* JADX INFO: renamed from: k */
    public boolean f2172k;

    /* JADX INFO: renamed from: l */
    public boolean f2173l;

    /* JADX INFO: renamed from: m */
    public boolean f2174m;

    /* JADX INFO: renamed from: n */
    public boolean f2175n;

    /* JADX INFO: renamed from: o */
    public int f2176o;

    /* JADX INFO: renamed from: p */
    public int f2177p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2178q;

    /* JADX INFO: renamed from: r */
    public final C1095b f2179r;

    /* JADX INFO: renamed from: s */
    public boolean f2180s;

    /* JADX INFO: renamed from: t */
    public final Rect f2181t;

    /* JADX INFO: renamed from: u */
    public final RectF f2182u;

    /* JADX INFO: renamed from: v */
    public final C0043i f2183v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0322a.m979a(context, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc), attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f2181t = new Rect();
        this.f2182u = new RectF();
        this.f2183v = new C0043i(1, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1097d c1097d = new C1097d(context2, attributeSet);
        int[] iArr = AbstractC1013a.f4022d;
        TypedArray typedArrayM279h = AbstractC0047m.m279h(c1097d.f4556e0, attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc, new int[0]);
        c1097d.f4530E0 = typedArrayM279h.hasValue(37);
        Context context3 = c1097d.f4556e0;
        ColorStateList colorStateListM162K = AbstractC0016e.m162K(context3, typedArrayM279h, 24);
        if (c1097d.f4575x != colorStateListM162K) {
            c1097d.f4575x = colorStateListM162K;
            c1097d.onStateChange(c1097d.getState());
        }
        ColorStateList colorStateListM162K2 = AbstractC0016e.m162K(context3, typedArrayM279h, 11);
        if (c1097d.f4577y != colorStateListM162K2) {
            c1097d.f4577y = colorStateListM162K2;
            c1097d.onStateChange(c1097d.getState());
        }
        float dimension = typedArrayM279h.getDimension(19, 0.0f);
        if (c1097d.f4579z != dimension) {
            c1097d.f4579z = dimension;
            c1097d.invalidateSelf();
            c1097d.m2699A();
        }
        if (typedArrayM279h.hasValue(12)) {
            c1097d.m2705G(typedArrayM279h.getDimension(12, 0.0f));
        }
        c1097d.m2710L(AbstractC0016e.m162K(context3, typedArrayM279h, 22));
        c1097d.m2711M(typedArrayM279h.getDimension(23, 0.0f));
        c1097d.m2720V(AbstractC0016e.m162K(context3, typedArrayM279h, 36));
        String text = typedArrayM279h.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c1097d.f4529E, text);
        C0045k c0045k = c1097d.f4562k0;
        if (!zEquals) {
            c1097d.f4529E = text;
            c0045k.f167d = true;
            c1097d.invalidateSelf();
            c1097d.m2699A();
        }
        C0089d c0089d = (!typedArrayM279h.hasValue(0) || (resourceId3 = typedArrayM279h.getResourceId(0, 0)) == 0) ? null : new C0089d(context3, resourceId3);
        c0089d.f282k = typedArrayM279h.getDimension(1, c0089d.f282k);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            c0089d.f281j = AbstractC0016e.m162K(context3, typedArrayM279h, 2);
        }
        c0045k.m271b(c0089d, context3);
        int i3 = typedArrayM279h.getInt(3, 0);
        if (i3 == 1) {
            c1097d.f4524B0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            c1097d.f4524B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            c1097d.f4524B0 = TextUtils.TruncateAt.END;
        }
        c1097d.m2709K(typedArrayM279h.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1097d.m2709K(typedArrayM279h.getBoolean(15, false));
        }
        c1097d.m2706H(AbstractC0016e.m165O(context3, typedArrayM279h, 14));
        if (typedArrayM279h.hasValue(17)) {
            c1097d.m2708J(AbstractC0016e.m162K(context3, typedArrayM279h, 17));
        }
        c1097d.m2707I(typedArrayM279h.getDimension(16, -1.0f));
        c1097d.m2717S(typedArrayM279h.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1097d.m2717S(typedArrayM279h.getBoolean(26, false));
        }
        c1097d.m2712N(AbstractC0016e.m165O(context3, typedArrayM279h, 25));
        c1097d.m2716R(AbstractC0016e.m162K(context3, typedArrayM279h, 30));
        c1097d.m2714P(typedArrayM279h.getDimension(28, 0.0f));
        c1097d.m2701C(typedArrayM279h.getBoolean(6, false));
        c1097d.m2704F(typedArrayM279h.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1097d.m2704F(typedArrayM279h.getBoolean(8, false));
        }
        c1097d.m2702D(AbstractC0016e.m165O(context3, typedArrayM279h, 7));
        if (typedArrayM279h.hasValue(9)) {
            c1097d.m2703E(AbstractC0016e.m162K(context3, typedArrayM279h, 9));
        }
        c1097d.f4546U = (!typedArrayM279h.hasValue(39) || (resourceId2 = typedArrayM279h.getResourceId(39, 0)) == 0) ? null : C1016b.m2464a(context3, resourceId2);
        c1097d.f4547V = (!typedArrayM279h.hasValue(33) || (resourceId = typedArrayM279h.getResourceId(33, 0)) == 0) ? null : C1016b.m2464a(context3, resourceId);
        float dimension2 = typedArrayM279h.getDimension(21, 0.0f);
        if (c1097d.f4548W != dimension2) {
            c1097d.f4548W = dimension2;
            c1097d.invalidateSelf();
            c1097d.m2699A();
        }
        c1097d.m2719U(typedArrayM279h.getDimension(35, 0.0f));
        c1097d.m2718T(typedArrayM279h.getDimension(34, 0.0f));
        float dimension3 = typedArrayM279h.getDimension(41, 0.0f);
        if (c1097d.f4551Z != dimension3) {
            c1097d.f4551Z = dimension3;
            c1097d.invalidateSelf();
            c1097d.m2699A();
        }
        float dimension4 = typedArrayM279h.getDimension(40, 0.0f);
        if (c1097d.f4552a0 != dimension4) {
            c1097d.f4552a0 = dimension4;
            c1097d.invalidateSelf();
            c1097d.m2699A();
        }
        c1097d.m2715Q(typedArrayM279h.getDimension(29, 0.0f));
        c1097d.m2713O(typedArrayM279h.getDimension(27, 0.0f));
        float dimension5 = typedArrayM279h.getDimension(13, 0.0f);
        if (c1097d.f4555d0 != dimension5) {
            c1097d.f4555d0 = dimension5;
            c1097d.invalidateSelf();
            c1097d.m2699A();
        }
        c1097d.f4528D0 = typedArrayM279h.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM279h.recycle();
        AbstractC0047m.m272a(context2, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        AbstractC0047m.m273b(context2, attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        this.f2175n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f2177p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(AbstractC0047m.m275d(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c1097d);
        c1097d.m479k(AbstractC0229G.m707i(this));
        AbstractC0047m.m272a(context2, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        AbstractC0047m.m273b(context2, attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        if (i2 < 23) {
            setTextColor(AbstractC0016e.m162K(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f2179r = new C1095b(this, this);
        m1727e();
        if (!zHasValue) {
            setOutlineProvider(new C1094a(this));
        }
        setChecked(this.f2171j);
        setText(c1097d.f4529E);
        setEllipsize(c1097d.f4524B0);
        m1730h();
        if (!this.f2166e.f4526C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m1729g();
        if (this.f2175n) {
            setMinHeight(this.f2177p);
        }
        this.f2176o = getLayoutDirection();
        super.setOnCheckedChangeListener(new C0346t(2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2182u;
        rectF.setEmpty();
        if (m1726d() && this.f2169h != null) {
            C1097d c1097d = this.f2166e;
            Rect bounds = c1097d.getBounds();
            rectF.setEmpty();
            if (c1097d.m2723Y()) {
                float f = c1097d.f4555d0 + c1097d.f4554c0 + c1097d.f4540O + c1097d.f4553b0 + c1097d.f4552a0;
                if (AbstractC0016e.m167S(c1097d) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2181t;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private C0089d getTextAppearance() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4562k0.f169f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2173l != z2) {
            this.f2173l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2172k != z2) {
            this.f2172k = z2;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1725c(int i2) {
        this.f2177p = i2;
        if (!this.f2175n) {
            InsetDrawable insetDrawable = this.f2167f;
            if (insetDrawable == null) {
                int[] iArr = AbstractC0102d.f301a;
                m1728f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2167f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC0102d.f301a;
                    m1728f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i2 - ((int) this.f2166e.f4579z));
        int iMax2 = Math.max(0, i2 - this.f2166e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f2167f;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC0102d.f301a;
                m1728f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2167f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC0102d.f301a;
                    m1728f();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f2167f != null) {
            Rect rect = new Rect();
            this.f2167f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                int[] iArr5 = AbstractC0102d.f301a;
                m1728f();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f2167f = new InsetDrawable((Drawable) this.f2166e, i3, i4, i3, i4);
        int[] iArr6 = AbstractC0102d.f301a;
        m1728f();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1726d() {
        C1097d c1097d = this.f2166e;
        if (c1097d == null) {
            return false;
        }
        Object obj = c1097d.f4537L;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC0096e) {
            obj = ((C0097f) ((InterfaceC0096e) obj)).f293f;
        }
        return obj != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f2180s ? super.dispatchHoverEvent(motionEvent) : this.f2179r.m1107m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2180s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1095b c1095b = this.f2179r;
        c1095b.getClass();
        boolean zM1109q = false;
        int i2 = 0;
        zM1109q = false;
        zM1109q = false;
        zM1109q = false;
        zM1109q = false;
        zM1109q = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && c1095b.m1109q(i3, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                zM1109q = z2;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i4 = c1095b.f1083l;
                                if (i4 != Integer.MIN_VALUE) {
                                    c1095b.mo572s(i4, 16, null);
                                }
                                zM1109q = true;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM1109q = c1095b.m1109q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM1109q = c1095b.m1109q(1, null);
            }
        }
        if (!zM1109q || c1095b.f1083l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p074l.C0965r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        C1097d c1097d = this.f2166e;
        boolean zM2700B = false;
        if (c1097d != null && C1097d.m2698z(c1097d.f4537L)) {
            C1097d c1097d2 = this.f2166e;
            ?? IsEnabled = isEnabled();
            int i3 = IsEnabled;
            if (this.f2174m) {
                i3 = IsEnabled + 1;
            }
            int i4 = i3;
            if (this.f2173l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f2172k) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f2174m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f2173l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f2172k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c1097d2.f4578y0, iArr)) {
                c1097d2.f4578y0 = iArr;
                if (c1097d2.m2723Y()) {
                    zM2700B = c1097d2.m2700B(c1097d2.getState(), iArr);
                }
            }
        }
        if (zM2700B) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1727e() {
        C1097d c1097d;
        if (!m1726d() || (c1097d = this.f2166e) == null || !c1097d.f4536K || this.f2169h == null) {
            AbstractC0240S.m785p(this, null);
            this.f2180s = false;
        } else {
            AbstractC0240S.m785p(this, this.f2179r);
            this.f2180s = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1728f() {
        this.f2168g = new RippleDrawable(AbstractC0102d.m448a(this.f2166e.f4527D), getBackgroundDrawable(), null);
        this.f2166e.getClass();
        RippleDrawable rippleDrawable = this.f2168g;
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        setBackground(rippleDrawable);
        m1729g();
    }

    /* JADX INFO: renamed from: g */
    public final void m1729g() {
        C1097d c1097d;
        if (TextUtils.isEmpty(getText()) || (c1097d = this.f2166e) == null) {
            return;
        }
        int iM2727w = (int) (c1097d.m2727w() + c1097d.f4555d0 + c1097d.f4552a0);
        C1097d c1097d2 = this.f2166e;
        int iM2726v = (int) (c1097d2.m2726v() + c1097d2.f4548W + c1097d2.f4551Z);
        if (this.f2167f != null) {
            Rect rect = new Rect();
            this.f2167f.getPadding(rect);
            iM2726v += rect.left;
            iM2727w += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        setPaddingRelative(iM2726v, paddingTop, iM2727w, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2178q)) {
            return this.f2178q;
        }
        C1097d c1097d = this.f2166e;
        if (!(c1097d != null && c1097d.f4542Q)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2167f;
        return insetDrawable == null ? this.f2166e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4544S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4545T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4577y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return Math.max(0.0f, c1097d.m2728x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2166e;
    }

    public float getChipEndPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4555d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1097d c1097d = this.f2166e;
        if (c1097d == null || (drawable = c1097d.f4532G) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC0096e ? ((C0097f) ((InterfaceC0096e) drawable)).f293f : drawable;
    }

    public float getChipIconSize() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4534I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4533H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4579z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4548W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4523B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4525C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1097d c1097d = this.f2166e;
        if (c1097d == null || (drawable = c1097d.f4537L) == 0) {
            return null;
        }
        return drawable instanceof InterfaceC0096e ? ((C0097f) ((InterfaceC0096e) drawable)).f293f : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4541P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4554c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4540O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4553b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4539N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4524B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2180s) {
            C1095b c1095b = this.f2179r;
            if (c1095b.f1083l == 1 || c1095b.f1082k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1016b getHideMotionSpec() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4547V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4550Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4549X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4527D;
        }
        return null;
    }

    public C0117m getShapeAppearanceModel() {
        return this.f2166e.f346a.f328a;
    }

    public C1016b getShowMotionSpec() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4546U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4552a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            return c1097d.f4551Z;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m1730h() {
        TextPaint paint = getPaint();
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            paint.drawableState = c1097d.getState();
        }
        C0089d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m384e(getContext(), paint, this.f2183v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0016e.m201x0(this, this.f2166e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2164x);
        }
        C1097d c1097d = this.f2166e;
        if (c1097d != null && c1097d.f4542Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2165y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f2180s) {
            C1095b c1095b = this.f2179r;
            int i3 = c1095b.f1083l;
            if (i3 != Integer.MIN_VALUE) {
                c1095b.m1104j(i3);
            }
            if (z2) {
                c1095b.m1109q(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C1097d c1097d = this.f2166e;
        accessibilityNodeInfo.setCheckable(c1097d != null && c1097d.f4542Q);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f2176o != i2) {
            this.f2176o = i2;
            m1729g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2172k) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                if (this.f2172k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f2169h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f2180s) {
                        this.f2179r.m1114x(1, 1);
                    }
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2178q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2168g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p074l.C0965r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2168g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p074l.C0965r, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2701C(z2);
        }
    }

    public void setCheckableResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2701C(c1097d.f4556e0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null) {
            this.f2171j = z2;
        } else if (c1097d.f4542Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2702D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2702D(AbstractC0383m.m1057w(c1097d.f4556e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2703E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2703E(AbstractC0016e.m160I(c1097d.f4556e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2704F(c1097d.f4556e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4577y == colorStateList) {
            return;
        }
        c1097d.f4577y = colorStateList;
        c1097d.onStateChange(c1097d.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateListM160I;
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4577y == (colorStateListM160I = AbstractC0016e.m160I(c1097d.f4556e0, i2))) {
            return;
        }
        c1097d.f4577y = colorStateListM160I;
        c1097d.onStateChange(c1097d.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2705G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2705G(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(C1097d c1097d) {
        C1097d c1097d2 = this.f2166e;
        if (c1097d2 != c1097d) {
            if (c1097d2 != null) {
                c1097d2.f4522A0 = new WeakReference(null);
            }
            this.f2166e = c1097d;
            c1097d.f4526C0 = false;
            c1097d.f4522A0 = new WeakReference(this);
            m1725c(this.f2177p);
        }
    }

    public void setChipEndPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4555d0 == f) {
            return;
        }
        c1097d.f4555d0 = f;
        c1097d.invalidateSelf();
        c1097d.m2699A();
    }

    public void setChipEndPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            float dimension = c1097d.f4556e0.getResources().getDimension(i2);
            if (c1097d.f4555d0 != dimension) {
                c1097d.f4555d0 = dimension;
                c1097d.invalidateSelf();
                c1097d.m2699A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2706H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2706H(AbstractC0383m.m1057w(c1097d.f4556e0, i2));
        }
    }

    public void setChipIconSize(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2707I(f);
        }
    }

    public void setChipIconSizeResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2707I(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2708J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2708J(AbstractC0016e.m160I(c1097d.f4556e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2709K(c1097d.f4556e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4579z == f) {
            return;
        }
        c1097d.f4579z = f;
        c1097d.invalidateSelf();
        c1097d.m2699A();
    }

    public void setChipMinHeightResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            float dimension = c1097d.f4556e0.getResources().getDimension(i2);
            if (c1097d.f4579z != dimension) {
                c1097d.f4579z = dimension;
                c1097d.invalidateSelf();
                c1097d.m2699A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4548W == f) {
            return;
        }
        c1097d.f4548W = f;
        c1097d.invalidateSelf();
        c1097d.m2699A();
    }

    public void setChipStartPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            float dimension = c1097d.f4556e0.getResources().getDimension(i2);
            if (c1097d.f4548W != dimension) {
                c1097d.f4548W = dimension;
                c1097d.invalidateSelf();
                c1097d.m2699A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2710L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2710L(AbstractC0016e.m160I(c1097d.f4556e0, i2));
        }
    }

    public void setChipStrokeWidth(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2711M(f);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2711M(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2712N(drawable);
        }
        m1727e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4541P == charSequence) {
            return;
        }
        String str = C0168b.f583b;
        C0168b c0168b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0168b.f586e : C0168b.f585d;
        c0168b.getClass();
        C0176j c0176j = AbstractC0177k.f596a;
        c1097d.f4541P = c0168b.m605c(charSequence);
        c1097d.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2713O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2713O(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2712N(AbstractC0383m.m1057w(c1097d.f4556e0, i2));
        }
        m1727e();
    }

    public void setCloseIconSize(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2714P(f);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2714P(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2715Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2715Q(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2716R(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2716R(AbstractC0016e.m160I(c1097d.f4556e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // p074l.C0965r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p074l.C0965r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m479k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2166e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4524B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2175n = z2;
        m1725c(this.f2177p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(C1016b c1016b) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4547V = c1016b;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4547V = C1016b.m2464a(c1097d.f4556e0, i2);
        }
    }

    public void setIconEndPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2718T(f);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2718T(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2719U(f);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2719U(c1097d.f4556e0.getResources().getDimension(i2));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f2166e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4528D0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2170i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2169h = onClickListener;
        m1727e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2720V(colorStateList);
        }
        this.f2166e.getClass();
        m1728f();
    }

    public void setRippleColorResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2720V(AbstractC0016e.m160I(c1097d.f4556e0, i2));
            this.f2166e.getClass();
            m1728f();
        }
    }

    @Override // p015I0.InterfaceC0128x
    public void setShapeAppearanceModel(C0117m c0117m) {
        this.f2166e.setShapeAppearanceModel(c0117m);
    }

    public void setShowMotionSpec(C1016b c1016b) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4546U = c1016b;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4546U = C1016b.m2464a(c1097d.f4556e0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1097d.f4526C0 ? null : charSequence, bufferType);
        C1097d c1097d2 = this.f2166e;
        if (c1097d2 == null || TextUtils.equals(c1097d2.f4529E, charSequence)) {
            return;
        }
        c1097d2.f4529E = charSequence;
        c1097d2.f4562k0.f167d = true;
        c1097d2.invalidateSelf();
        c1097d2.m2699A();
    }

    public void setTextAppearance(C0089d c0089d) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.f4562k0.m271b(c0089d, c1097d.f4556e0);
        }
        m1730h();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4552a0 == f) {
            return;
        }
        c1097d.f4552a0 = f;
        c1097d.invalidateSelf();
        c1097d.m2699A();
    }

    public void setTextEndPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            float dimension = c1097d.f4556e0.getResources().getDimension(i2);
            if (c1097d.f4552a0 != dimension) {
                c1097d.f4552a0 = dimension;
                c1097d.invalidateSelf();
                c1097d.m2699A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            C0045k c0045k = c1097d.f4562k0;
            C0089d c0089d = c0045k.f169f;
            if (c0089d != null) {
                c0089d.f282k = fApplyDimension;
                c0045k.f164a.setTextSize(fApplyDimension);
                c1097d.mo269a();
            }
        }
        m1730h();
    }

    public void setTextStartPadding(float f) {
        C1097d c1097d = this.f2166e;
        if (c1097d == null || c1097d.f4551Z == f) {
            return;
        }
        c1097d.f4551Z = f;
        c1097d.invalidateSelf();
        c1097d.m2699A();
    }

    public void setTextStartPaddingResource(int i2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            float dimension = c1097d.f4556e0.getResources().getDimension(i2);
            if (c1097d.f4551Z != dimension) {
                c1097d.f4551Z = dimension;
                c1097d.invalidateSelf();
                c1097d.m2699A();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2717S(z2);
        }
        m1727e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2704F(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            c1097d.m2709K(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            Context context2 = c1097d.f4556e0;
            c1097d.f4562k0.m271b(new C0089d(context2, i2), context2);
        }
        m1730h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C1097d c1097d = this.f2166e;
        if (c1097d != null) {
            Context context = c1097d.f4556e0;
            c1097d.f4562k0.m271b(new C0089d(context, i2), context);
        }
        m1730h();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0040f interfaceC0040f) {
    }
}
