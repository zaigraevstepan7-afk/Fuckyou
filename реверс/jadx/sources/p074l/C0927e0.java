package p074l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000A.C0001b;
import p001A0.AbstractC0016e;
import p009F.AbstractC0080g;
import p020L.AbstractC0174h;
import p020L.C0173g;
import p036T.AbstractC0383m;
import p036T.AbstractC0384n;
import p036T.AbstractC0387q;
import p036T.InterfaceC0391u;

/* JADX INFO: renamed from: l.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C0927e0 extends TextView implements InterfaceC0391u {

    /* JADX INFO: renamed from: a */
    public final C0959p f3711a;

    /* JADX INFO: renamed from: b */
    public final C0915a0 f3712b;

    /* JADX INFO: renamed from: c */
    public final C0871E f3713c;

    /* JADX INFO: renamed from: d */
    public C0979x f3714d;

    /* JADX INFO: renamed from: e */
    public boolean f3715e;

    /* JADX INFO: renamed from: f */
    public C0001b f3716f;

    /* JADX INFO: renamed from: g */
    public Future f3717g;

    public C0927e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0979x getEmojiTextViewHelper() {
        if (this.f3714d == null) {
            this.f3714d = new C0979x(this);
        }
        return this.f3714d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2367g() {
        Future future = this.f3717g;
        if (future == null) {
            return;
        }
        try {
            this.f3717g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0383m.m1026B(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            return Math.round(c0915a0.f3694i.f3762e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeMinTextSize();
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            return Math.round(c0915a0.f3694i.f3761d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeStepGranularity();
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            return Math.round(c0915a0.f3694i.f3760c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0915a0 c0915a0 = this.f3712b;
        return c0915a0 != null ? c0915a0.f3694i.f3763f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            return c0915a0.f3694i.f3758a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0383m.m1048n0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0918b0 getSuperCaller() {
        if (this.f3716f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f3716f = new C0924d0(this);
            } else if (i2 >= 28) {
                this.f3716f = new C0921c0(this);
            } else if (i2 >= 26) {
                this.f3716f = new C0001b(27, this);
            }
        }
        return this.f3716f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3712b.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3712b.m2355e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2367g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0871E c0871e;
        if (Build.VERSION.SDK_INT >= 28 || (c0871e = this.f3713c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0871e.f3529c;
        return textClassifier == null ? AbstractC0902U.m2331a((TextView) c0871e.f3528b) : textClassifier;
    }

    public C0173g getTextMetricsParamsCompat() {
        return AbstractC0383m.m1026B(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3712b.getClass();
        C0915a0.m2351h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0383m.m1033L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 == null || AbstractC0970s1.f3847c) {
            return;
        }
        c0915a0.f3694i.m2388a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        m2367g();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 == null || AbstractC0970s1.f3847c) {
            return;
        }
        C0945k0 c0945k0 = c0915a0.f3694i;
        if (c0945k0.m2390f()) {
            c0945k0.m2388a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2432c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (AbstractC0970s1.f3847c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2358i(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AbstractC0970s1.f3847c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2359j(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AbstractC0970s1.f3847c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2360k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0383m.m1050o0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2433d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2430a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo39d(i2);
        } else {
            AbstractC0383m.m1035b0(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo30A(i2);
        } else {
            AbstractC0383m.m1036c0(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        AbstractC0383m.m1037d0(this, i2);
    }

    public void setPrecomputedText(AbstractC0174h abstractC0174h) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0383m.m1026B(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3711a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3712b;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3712b;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2357g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0871E c0871e;
        if (Build.VERSION.SDK_INT >= 28 || (c0871e = this.f3713c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0871e.f3529c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0174h> future) {
        this.f3717g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0173g c0173g) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0173g.f590b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        int i3 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c0173g.f589a;
        if (i3 >= 23) {
            getPaint().set(textPaint);
            AbstractC0384n.m1086e(this, c0173g.f591c);
            AbstractC0384n.m1089h(this, c0173g.f592d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = AbstractC0970s1.f3847c;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 == null || z2) {
            return;
        }
        C0945k0 c0945k0 = c0915a0.f3694i;
        if (c0945k0.m2390f()) {
            return;
        }
        c0945k0.m2391g(i2, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f3715e) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0016e abstractC0016e = AbstractC0080g.f245a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f3715e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f3715e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0927e0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0913Z0.m2349a(context);
        this.f3715e = false;
        this.f3716f = null;
        AbstractC0911Y0.m2344a(this, getContext());
        C0959p c0959p = new C0959p(this);
        this.f3711a = c0959p;
        c0959p.m2406d(attributeSet, i2);
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3712b = c0915a0;
        c0915a0.m2356f(attributeSet, i2);
        c0915a0.m2353b();
        C0871E c0871e = new C0871E();
        c0871e.f3528b = this;
        this.f3713c = c0871e;
        getEmojiTextViewHelper().m2431b(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i2, float f) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            getSuperCaller().mo55t(i2, f);
        } else if (i3 >= 34) {
            AbstractC0387q.m1095a(this, i2, f);
        } else {
            AbstractC0383m.m1037d0(this, Math.round(TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0383m.m1057w(context, i2) : null, i3 != 0 ? AbstractC0383m.m1057w(context, i3) : null, i4 != 0 ? AbstractC0383m.m1057w(context, i4) : null, i5 != 0 ? AbstractC0383m.m1057w(context, i5) : null);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0383m.m1057w(context, i2) : null, i3 != 0 ? AbstractC0383m.m1057w(context, i3) : null, i4 != 0 ? AbstractC0383m.m1057w(context, i4) : null, i5 != 0 ? AbstractC0383m.m1057w(context, i5) : null);
        C0915a0 c0915a0 = this.f3712b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }
}
