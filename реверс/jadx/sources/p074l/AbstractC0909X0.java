package p074l;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0496j;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p024N.AbstractC0240S;
import p024N.C0223B;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p046Y.C0417h;
import p057d.AbstractC0641a;
import p069i.C0783a;
import p073k0.C0838b;

/* JADX INFO: renamed from: l.X0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0909X0 extends CompoundButton {

    /* JADX INFO: renamed from: R */
    public static final C0838b f3630R = new C0838b(Float.class, "thumbPos", 7);

    /* JADX INFO: renamed from: S */
    public static final int[] f3631S = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public int f3632A;

    /* JADX INFO: renamed from: B */
    public int f3633B;

    /* JADX INFO: renamed from: C */
    public int f3634C;

    /* JADX INFO: renamed from: D */
    public int f3635D;

    /* JADX INFO: renamed from: E */
    public int f3636E;

    /* JADX INFO: renamed from: F */
    public int f3637F;

    /* JADX INFO: renamed from: G */
    public int f3638G;

    /* JADX INFO: renamed from: H */
    public boolean f3639H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f3640I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f3641J;

    /* JADX INFO: renamed from: K */
    public StaticLayout f3642K;

    /* JADX INFO: renamed from: L */
    public StaticLayout f3643L;

    /* JADX INFO: renamed from: M */
    public final C0783a f3644M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f3645N;

    /* JADX INFO: renamed from: O */
    public C0979x f3646O;

    /* JADX INFO: renamed from: P */
    public C0417h f3647P;

    /* JADX INFO: renamed from: Q */
    public final Rect f3648Q;

    /* JADX INFO: renamed from: a */
    public Drawable f3649a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f3650b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f3651c;

    /* JADX INFO: renamed from: d */
    public boolean f3652d;

    /* JADX INFO: renamed from: e */
    public boolean f3653e;

    /* JADX INFO: renamed from: f */
    public Drawable f3654f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3655g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3656h;

    /* JADX INFO: renamed from: i */
    public boolean f3657i;

    /* JADX INFO: renamed from: j */
    public boolean f3658j;

    /* JADX INFO: renamed from: k */
    public int f3659k;

    /* JADX INFO: renamed from: l */
    public int f3660l;

    /* JADX INFO: renamed from: m */
    public int f3661m;

    /* JADX INFO: renamed from: n */
    public boolean f3662n;

    /* JADX INFO: renamed from: o */
    public CharSequence f3663o;

    /* JADX INFO: renamed from: p */
    public CharSequence f3664p;

    /* JADX INFO: renamed from: q */
    public CharSequence f3665q;

    /* JADX INFO: renamed from: r */
    public CharSequence f3666r;

    /* JADX INFO: renamed from: s */
    public boolean f3667s;

    /* JADX INFO: renamed from: t */
    public int f3668t;

    /* JADX INFO: renamed from: u */
    public final int f3669u;

    /* JADX INFO: renamed from: v */
    public float f3670v;

    /* JADX INFO: renamed from: w */
    public float f3671w;

    /* JADX INFO: renamed from: x */
    public final VelocityTracker f3672x;

    /* JADX INFO: renamed from: y */
    public final int f3673y;

    /* JADX INFO: renamed from: z */
    public float f3674z;

    public AbstractC0909X0(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f3650b = null;
        this.f3651c = null;
        this.f3652d = false;
        this.f3653e = false;
        this.f3655g = null;
        this.f3656h = null;
        this.f3657i = false;
        this.f3658j = false;
        this.f3672x = VelocityTracker.obtain();
        this.f3639H = true;
        this.f3648Q = new Rect();
        AbstractC0911Y0.m2344a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3640I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0641a.f2501v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.reddit.frontpage.R.attr.resc, 0);
        C0270l c0270l = new C0270l(context, typedArrayObtainStyledAttributes);
        AbstractC0240S.m784o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.reddit.frontpage.R.attr.resc);
        Drawable drawableM845h = c0270l.m845h(2);
        this.f3649a = drawableM845h;
        if (drawableM845h != null) {
            drawableM845h.setCallback(this);
        }
        Drawable drawableM845h2 = c0270l.m845h(11);
        this.f3654f = drawableM845h2;
        if (drawableM845h2 != null) {
            drawableM845h2.setCallback(this);
        }
        setTextOnInternal(typedArrayObtainStyledAttributes.getText(0));
        setTextOffInternal(typedArrayObtainStyledAttributes.getText(1));
        this.f3667s = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.f3659k = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f3660l = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f3661m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f3662n = typedArrayObtainStyledAttributes.getBoolean(4, false);
        ColorStateList colorStateListM844g = c0270l.m844g(9);
        if (colorStateListM844g != null) {
            this.f3650b = colorStateListM844g;
            this.f3652d = true;
        }
        PorterDuff.Mode modeM2415c = AbstractC0966r0.m2415c(typedArrayObtainStyledAttributes.getInt(10, -1), null);
        if (this.f3651c != modeM2415c) {
            this.f3651c = modeM2415c;
            this.f3653e = true;
        }
        if (this.f3652d || this.f3653e) {
            m2336a();
        }
        ColorStateList colorStateListM844g2 = c0270l.m844g(12);
        if (colorStateListM844g2 != null) {
            this.f3655g = colorStateListM844g2;
            this.f3657i = true;
        }
        PorterDuff.Mode modeM2415c2 = AbstractC0966r0.m2415c(typedArrayObtainStyledAttributes.getInt(13, -1), null);
        if (this.f3656h != modeM2415c2) {
            this.f3656h = modeM2415c2;
            this.f3658j = true;
        }
        if (this.f3657i || this.f3658j) {
            m2337b();
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0641a.f2502w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0016e.m160I(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3641J = colorStateList;
            } else {
                this.f3641J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                C0783a c0783a = new C0783a();
                c0783a.f3158a = context2.getResources().getConfiguration().locale;
                this.f3644M = c0783a;
            } else {
                this.f3644M = null;
            }
            setTextOnInternal(this.f3663o);
            setTextOffInternal(this.f3665q);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new C0915a0(this).m2356f(attributeSet, com.reddit.frontpage.R.attr.resc);
        c0270l.m851o();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3669u = viewConfiguration.getScaledTouchSlop();
        this.f3673y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m2431b(attributeSet, com.reddit.frontpage.R.attr.resc);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0979x getEmojiTextViewHelper() {
        if (this.f3646O == null) {
            this.f3646O = new C0979x(this);
        }
        return this.f3646O;
    }

    private boolean getTargetCheckedState() {
        return this.f3674z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z2 = AbstractC0970s1.f3845a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f3674z : this.f3674z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3654f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3648Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3649a;
        Rect rectM2414b = drawable2 != null ? AbstractC0966r0.m2414b(drawable2) : AbstractC0966r0.f3840c;
        return ((((this.f3632A - this.f3634C) - rect.left) - rect.right) - rectM2414b.left) - rectM2414b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3665q = charSequence;
        C0979x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo1079p0 = ((AbstractC0383m) emojiTextViewHelper.f3871b.f1b).mo1079p0(this.f3644M);
        if (transformationMethodMo1079p0 != null) {
            charSequence = transformationMethodMo1079p0.getTransformation(charSequence, this);
        }
        this.f3666r = charSequence;
        this.f3643L = null;
        if (this.f3667s) {
            m2339d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3663o = charSequence;
        C0979x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo1079p0 = ((AbstractC0383m) emojiTextViewHelper.f3871b.f1b).mo1079p0(this.f3644M);
        if (transformationMethodMo1079p0 != null) {
            charSequence = transformationMethodMo1079p0.getTransformation(charSequence, this);
        }
        this.f3664p = charSequence;
        this.f3642K = null;
        if (this.f3667s) {
            m2339d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2336a() {
        Drawable drawable = this.f3649a;
        if (drawable != null) {
            if (this.f3652d || this.f3653e) {
                Drawable drawableMutate = AbstractC0016e.m154B0(drawable).mutate();
                this.f3649a = drawableMutate;
                if (this.f3652d) {
                    AbstractC0092a.m429h(drawableMutate, this.f3650b);
                }
                if (this.f3653e) {
                    AbstractC0092a.m430i(this.f3649a, this.f3651c);
                }
                if (this.f3649a.isStateful()) {
                    this.f3649a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2337b() {
        Drawable drawable = this.f3654f;
        if (drawable != null) {
            if (this.f3657i || this.f3658j) {
                Drawable drawableMutate = AbstractC0016e.m154B0(drawable).mutate();
                this.f3654f = drawableMutate;
                if (this.f3657i) {
                    AbstractC0092a.m429h(drawableMutate, this.f3655g);
                }
                if (this.f3658j) {
                    AbstractC0092a.m430i(this.f3654f, this.f3656h);
                }
                if (this.f3654f.isStateful()) {
                    this.f3654f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2338c() {
        setTextOnInternal(this.f3663o);
        setTextOffInternal(this.f3665q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m2339d() {
        if (this.f3647P == null && ((AbstractC0383m) this.f3646O.f3871b.f1b).mo1061G() && C0496j.f1520k != null) {
            C0496j c0496jM1303a = C0496j.m1303a();
            int iM1304b = c0496jM1303a.m1304b();
            if (iM1304b == 3 || iM1304b == 0) {
                C0417h c0417h = new C0417h(this);
                this.f3647P = c0417h;
                c0496jM1303a.m1308f(c0417h);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f3635D;
        int i5 = this.f3636E;
        int i6 = this.f3637F;
        int i7 = this.f3638G;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f3649a;
        Rect rectM2414b = drawable != null ? AbstractC0966r0.m2414b(drawable) : AbstractC0966r0.f3840c;
        Drawable drawable2 = this.f3654f;
        Rect rect = this.f3648Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectM2414b != null) {
                int i9 = rectM2414b.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectM2414b.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectM2414b.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectM2414b.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f3654f.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f3654f.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f3649a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f3634C + rect.right;
            this.f3649a.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0092a.m427f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3649a;
        if (drawable != null) {
            AbstractC0092a.m426e(drawable, f, f2);
        }
        Drawable drawable2 = this.f3654f;
        if (drawable2 != null) {
            AbstractC0092a.m426e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3649a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3654f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z2 = AbstractC0970s1.f3845a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3632A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3661m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z2 = AbstractC0970s1.f3845a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3632A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3661m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0383m.m1048n0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3667s;
    }

    public boolean getSplitTrack() {
        return this.f3662n;
    }

    public int getSwitchMinWidth() {
        return this.f3660l;
    }

    public int getSwitchPadding() {
        return this.f3661m;
    }

    public CharSequence getTextOff() {
        return this.f3665q;
    }

    public CharSequence getTextOn() {
        return this.f3663o;
    }

    public Drawable getThumbDrawable() {
        return this.f3649a;
    }

    public final float getThumbPosition() {
        return this.f3674z;
    }

    public int getThumbTextPadding() {
        return this.f3659k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3650b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3651c;
    }

    public Drawable getTrackDrawable() {
        return this.f3654f;
    }

    public ColorStateList getTrackTintList() {
        return this.f3655g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3656h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3649a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3654f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3645N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3645N.end();
        this.f3645N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3631S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3654f;
        Rect rect = this.f3648Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f3636E;
        int i3 = this.f3638G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f3649a;
        if (drawable != null) {
            if (!this.f3662n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM2414b = AbstractC0966r0.m2414b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM2414b.left;
                rect.right -= rectM2414b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3642K : this.f3643L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3641J;
            TextPaint textPaint = this.f3640I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i4 + i5) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3663o : this.f3665q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z2, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f3649a != null) {
            Drawable drawable = this.f3654f;
            Rect rect = this.f3648Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM2414b = AbstractC0966r0.m2414b(this.f3649a);
            iMax = Math.max(0, rectM2414b.left - rect.left);
            iMax2 = Math.max(0, rectM2414b.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z3 = AbstractC0970s1.f3845a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3632A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3632A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i6 = this.f3633B;
            int i7 = height2 - (i6 / 2);
            height = i6 + i7;
            paddingTop = i7;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f3633B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f3633B;
        }
        this.f3635D = paddingLeft;
        this.f3636E = paddingTop;
        this.f3638G = height;
        this.f3637F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f3667s) {
            StaticLayout staticLayout = this.f3642K;
            TextPaint textPaint = this.f3640I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3664p;
                this.f3642K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3643L == null) {
                CharSequence charSequence2 = this.f3666r;
                this.f3643L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3649a;
        Rect rect = this.f3648Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3649a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3649a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f3634C = Math.max(this.f3667s ? (this.f3659k * 2) + Math.max(this.f3642K.getWidth(), this.f3643L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f3654f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3654f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f3649a;
        if (drawable3 != null) {
            Rect rectM2414b = AbstractC0966r0.m2414b(drawable3);
            iMax = Math.max(iMax, rectM2414b.left);
            iMax2 = Math.max(iMax2, rectM2414b.right);
        }
        int iMax3 = this.f3639H ? Math.max(this.f3660l, (this.f3634C * 2) + iMax + iMax2) : this.f3660l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3632A = iMax3;
        this.f3633B = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3663o : this.f3665q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean targetCheckedState;
        VelocityTracker velocityTracker = this.f3672x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f3669u;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f3668t == 2) {
                    this.f3668t = 0;
                    boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f3673y) {
                            boolean z3 = AbstractC0970s1.f3845a;
                            targetCheckedState = getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f3668t = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i3 = this.f3668t;
                if (i3 == 1) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = i2;
                    if (Math.abs(x2 - this.f3670v) > f || Math.abs(y2 - this.f3671w) > f) {
                        this.f3668t = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f3670v = x2;
                        this.f3671w = y2;
                        return true;
                    }
                } else if (i3 == 2) {
                    float x3 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f2 = x3 - this.f3670v;
                    float f3 = thumbScrollRange != 0 ? f2 / thumbScrollRange : f2 > 0.0f ? 1.0f : -1.0f;
                    boolean z4 = AbstractC0970s1.f3845a;
                    if (getLayoutDirection() == 1) {
                        f3 = -f3;
                    }
                    float f4 = this.f3674z;
                    float f5 = f3 + f4;
                    float f6 = f5 >= 0.0f ? f5 > 1.0f ? 1.0f : f5 : 0.0f;
                    if (f6 != f4) {
                        this.f3670v = x3;
                        setThumbPosition(f6);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
            }
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f3649a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3649a;
                Rect rect = this.f3648Q;
                drawable.getPadding(rect);
                int i4 = this.f3636E - i2;
                int i5 = (this.f3635D + thumbOffset) - i2;
                int i6 = this.f3634C + i5 + rect.left + rect.right + i2;
                int i7 = this.f3638G + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.f3668t = 1;
                    this.f3670v = x4;
                    this.f3671w = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2432c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f3663o;
                if (string == null) {
                    string = getResources().getString(com.reddit.frontpage.R.string.resc);
                }
                Object obj = string;
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                new C0223B(com.reddit.frontpage.R.id.resc, CharSequence.class, 64, 30, 2).m695d(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f3665q;
            if (string2 == null) {
                string2 = getResources().getString(com.reddit.frontpage.R.string.resc);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
            new C0223B(com.reddit.frontpage.R.id.resc, CharSequence.class, 64, 30, 2).m695d(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f3645N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3630R, zIsChecked ? 1.0f : 0.0f);
        this.f3645N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f3645N.setAutoCancel(true);
        this.f3645N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0383m.m1050o0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2433d(z2);
        setTextOnInternal(this.f3663o);
        setTextOffInternal(this.f3665q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f3639H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2430a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f3667s != z2) {
            this.f3667s = z2;
            requestLayout();
            if (z2) {
                m2339d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f3662n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f3660l = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f3661m = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3640I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f3665q;
        if (string == null) {
            string = getResources().getString(com.reddit.frontpage.R.string.resc);
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        new C0223B(com.reddit.frontpage.R.id.resc, CharSequence.class, 64, 30, 2).m695d(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f3663o;
        if (string == null) {
            string = getResources().getString(com.reddit.frontpage.R.string.resc);
        }
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        new C0223B(com.reddit.frontpage.R.id.resc, CharSequence.class, 64, 30, 2).m695d(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3649a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3649a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f3674z = f;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f3659k = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3650b = colorStateList;
        this.f3652d = true;
        m2336a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3651c = mode;
        this.f3653e = true;
        m2336a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3654f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3654f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3655g = colorStateList;
        this.f3657i = true;
        m2337b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3656h = mode;
        this.f3658j = true;
        m2337b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3649a || drawable == this.f3654f;
    }
}
