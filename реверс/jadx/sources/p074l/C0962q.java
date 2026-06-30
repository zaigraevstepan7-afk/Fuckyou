package p074l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p036T.AbstractC0383m;
import p036T.InterfaceC0391u;

/* JADX INFO: renamed from: l.q */
/* JADX INFO: loaded from: classes.dex */
public class C0962q extends Button implements InterfaceC0391u {

    /* JADX INFO: renamed from: a */
    public final C0959p f3831a;

    /* JADX INFO: renamed from: b */
    public final C0915a0 f3832b;

    /* JADX INFO: renamed from: c */
    public C0979x f3833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0962q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0913Z0.m2349a(context);
        AbstractC0911Y0.m2344a(this, getContext());
        C0959p c0959p = new C0959p(this);
        this.f3831a = c0959p;
        c0959p.m2406d(attributeSet, i2);
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3832b = c0915a0;
        c0915a0.m2356f(attributeSet, i2);
        c0915a0.m2353b();
        getEmojiTextViewHelper().m2431b(attributeSet, i2);
    }

    private C0979x getEmojiTextViewHelper() {
        if (this.f3833c == null) {
            this.f3833c = new C0979x(this);
        }
        return this.f3833c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0915a0 c0915a0 = this.f3832b;
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
        C0915a0 c0915a0 = this.f3832b;
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
        C0915a0 c0915a0 = this.f3832b;
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
        C0915a0 c0915a0 = this.f3832b;
        return c0915a0 != null ? c0915a0.f3694i.f3763f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0970s1.f3847c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 != null) {
            return c0915a0.f3694i.f3758a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0383m.m1048n0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3832b.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3832b.m2355e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 == null || AbstractC0970s1.f3847c) {
            return;
        }
        c0915a0.f3694i.m2388a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0915a0 c0915a0 = this.f3832b;
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
        C0915a0 c0915a0 = this.f3832b;
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
        C0915a0 c0915a0 = this.f3832b;
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
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 != null) {
            c0915a0.m2360k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
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

    public void setSupportAllCaps(boolean z2) {
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 != null) {
            c0915a0.f3686a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3831a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3832b;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3832b;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 != null) {
            c0915a0.m2357g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = AbstractC0970s1.f3847c;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0915a0 c0915a0 = this.f3832b;
        if (c0915a0 == null || z2) {
            return;
        }
        C0945k0 c0945k0 = c0915a0.f3694i;
        if (c0945k0.m2390f()) {
            return;
        }
        c0945k0.m2391g(i2, f);
    }
}
