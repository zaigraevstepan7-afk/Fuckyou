package p074l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p036T.InterfaceC0391u;

/* JADX INFO: renamed from: l.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948l0 extends ToggleButton implements InterfaceC0391u {

    /* JADX INFO: renamed from: a */
    public final C0959p f3784a;

    /* JADX INFO: renamed from: b */
    public final C0915a0 f3785b;

    /* JADX INFO: renamed from: c */
    public C0979x f3786c;

    public C0948l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC0911Y0.m2344a(this, getContext());
        C0959p c0959p = new C0959p(this);
        this.f3784a = c0959p;
        c0959p.m2406d(attributeSet, R.attr.buttonStyleToggle);
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3785b = c0915a0;
        c0915a0.m2356f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m2431b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0979x getEmojiTextViewHelper() {
        if (this.f3786c == null) {
            this.f3786c = new C0979x(this);
        }
        return this.f3786c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0915a0 c0915a0 = this.f3785b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3785b.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3785b.m2355e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2432c(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3785b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3785b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2433d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m2430a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3784a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3785b;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3785b;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }
}
