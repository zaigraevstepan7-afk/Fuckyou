package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic extends TextView {
    public final ub e;
    public final ec f;
    public final xg0 g;
    public xb h;
    public boolean i;
    public qt0 j;
    public Future k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object obj = z02.a;
        if (!(context.getResources() instanceof b12)) {
            context.getResources();
            int i2 = y42.a;
        }
        this.i = false;
        this.j = null;
        k02.a(this, getContext());
        ub ubVar = new ub(this);
        this.e = ubVar;
        ubVar.b(attributeSet, i);
        ec ecVar = new ec(this);
        this.f = ecVar;
        ecVar.d(attributeSet, i);
        ecVar.b();
        xg0 xg0Var = new xg0(4, false);
        xg0Var.f = this;
        this.g = xg0Var;
        xb emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray typedArrayObtainStyledAttributes = emojiTextViewHelper.a.getContext().obtainStyledAttributes(attributeSet, ub1.b, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((lk) emojiTextViewHelper.b.f).h0(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private xb getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new xb(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.a();
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (w62.a) {
            return super.getAutoSizeMaxTextSize();
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            return Math.round(ecVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (w62.a) {
            return super.getAutoSizeMinTextSize();
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            return Math.round(ecVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (w62.a) {
            return super.getAutoSizeStepGranularity();
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            return Math.round(ecVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (w62.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ec ecVar = this.f;
        return ecVar != null ? ecVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (w62.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            return ecVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof i02 ? ((i02) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public fc getSuperCaller() {
        if (this.j == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.j = new hc(this);
            } else if (i >= 28) {
                this.j = new gc(this);
            } else {
                this.j = new qt0(5, this);
            }
        }
        return this.j;
    }

    public ColorStateList getSupportBackgroundTintList() {
        a12 a12Var;
        ub ubVar = this.e;
        if (ubVar == null || (a12Var = (a12) ubVar.e) == null) {
            return null;
        }
        return a12Var.a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a12 a12Var;
        ub ubVar = this.e;
        if (ubVar == null || (a12Var = (a12) ubVar.e) == null) {
            return null;
        }
        return a12Var.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a12 a12Var = this.f.h;
        if (a12Var != null) {
            return a12Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a12 a12Var = this.f.h;
        if (a12Var != null) {
            return a12Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.k;
        if (future != null) {
            try {
                this.k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                kd1.r(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        xg0 xg0Var;
        if (Build.VERSION.SDK_INT >= 28 || (xg0Var = this.g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) xg0Var.g;
        return textClassifier == null ? yb.a((ic) xg0Var.f) : textClassifier;
    }

    public c91 getTextMetricsParamsCompat() {
        return kd1.r(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            el.N(editorInfo, getText());
        }
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ec ecVar = this.f;
        if (ecVar == null || w62.a) {
            return;
        }
        ecVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.k;
        if (future != null) {
            try {
                this.k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                kd1.r(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ec ecVar = this.f;
        if (ecVar == null || w62.a) {
            return;
        }
        nc ncVar = ecVar.i;
        if (ncVar.a != 0) {
            ncVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((lk) getEmojiTextViewHelper().b.f).g0(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (w62.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            nc ncVar = ecVar.i;
            DisplayMetrics displayMetrics = ncVar.j.getResources().getDisplayMetrics();
            ncVar.i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ncVar.g()) {
                ncVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (w62.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            nc ncVar = ecVar.i;
            ncVar.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ncVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ncVar.f = nc.b(iArrCopyOf);
                if (!ncVar.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                ncVar.g = false;
            }
            if (ncVar.g()) {
                ncVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (w62.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            nc ncVar = ecVar.i;
            if (i == 0) {
                ncVar.a = 0;
                ncVar.d = -1.0f;
                ncVar.e = -1.0f;
                ncVar.c = -1.0f;
                ncVar.f = new int[0];
                ncVar.b = false;
                return;
            }
            if (i != 1) {
                ncVar.getClass();
                yc.p(s91.i("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = ncVar.j.getResources().getDisplayMetrics();
            ncVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ncVar.g()) {
                ncVar.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.a = -1;
            ubVar.d(null);
            ubVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        ColorStateList colorStateListG;
        super.setBackgroundResource(i);
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.a = i;
            wb wbVar = (wb) ubVar.c;
            if (wbVar != null) {
                Context context = ((TextView) ubVar.b).getContext();
                synchronized (wbVar) {
                    colorStateListG = wbVar.a.g(context, i);
                }
            } else {
                colorStateListG = null;
            }
            ubVar.d(colorStateListG);
            ubVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? nu0.u(context, i) : null, i2 != 0 ? nu0.u(context, i2) : null, i3 != 0 ? nu0.u(context, i3) : null, i4 != 0 ? nu0.u(context, i4) : null);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? nu0.u(context, i) : null, i2 != 0 ? nu0.u(context, i2) : null, i3 != 0 ? nu0.u(context, i3) : null, i4 != 0 ? nu0.u(context, i4) : null);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof i02) && callback != null) {
            callback = new i02(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((lk) getEmojiTextViewHelper().b.f).h0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((lk) getEmojiTextViewHelper().b.f).O(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            kd1.A(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            kd1.B(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().g(i, f);
        } else if (i2 >= 34) {
            v0.k(this, i, f);
        } else {
            kd1.C(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(d91 d91Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        kd1.r(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ub ubVar = this.e;
        if (ubVar != null) {
            if (((a12) ubVar.e) == null) {
                ubVar.e = new a12();
            }
            a12 a12Var = (a12) ubVar.e;
            a12Var.a = colorStateList;
            a12Var.d = true;
            ubVar.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ub ubVar = this.e;
        if (ubVar != null) {
            if (((a12) ubVar.e) == null) {
                ubVar.e = new a12();
            }
            a12 a12Var = (a12) ubVar.e;
            a12Var.b = mode;
            a12Var.c = true;
            ubVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ec ecVar = this.f;
        if (ecVar.h == null) {
            ecVar.h = new a12();
        }
        a12 a12Var = ecVar.h;
        a12Var.a = colorStateList;
        a12Var.d = colorStateList != null;
        ecVar.b = a12Var;
        ecVar.c = a12Var;
        ecVar.d = a12Var;
        ecVar.e = a12Var;
        ecVar.f = a12Var;
        ecVar.g = a12Var;
        ecVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ec ecVar = this.f;
        if (ecVar.h == null) {
            ecVar.h = new a12();
        }
        a12 a12Var = ecVar.h;
        a12Var.b = mode;
        a12Var.c = mode != null;
        ecVar.b = a12Var;
        ecVar.c = a12Var;
        ecVar.d = a12Var;
        ecVar.e = a12Var;
        ecVar.f = a12Var;
        ecVar.g = a12Var;
        ecVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        xg0 xg0Var;
        if (Build.VERSION.SDK_INT >= 28 || (xg0Var = this.g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xg0Var.g = textClassifier;
        }
    }

    public void setTextFuture(Future<d91> future) {
        this.k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c91 c91Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c91Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c91Var.a);
        setBreakStrategy(c91Var.c);
        setHyphenationFrequency(c91Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = w62.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ec ecVar = this.f;
        if (ecVar != null) {
            nc ncVar = ecVar.i;
            if (z || ncVar.a != 0) {
                return;
            }
            ncVar.f(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.i) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            qc1 qc1Var = v22.a;
            if (context == null) {
                yc.p("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.i = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.i = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        kd1.C(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ec ecVar = this.f;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    public ic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
