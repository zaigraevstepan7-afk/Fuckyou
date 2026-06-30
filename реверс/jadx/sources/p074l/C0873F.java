package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.reddit.frontpage.R;
import p036T.AbstractC0383m;
import p036T.InterfaceC0390t;
import p036T.InterfaceC0391u;
import p068h0.C0781d;

/* JADX INFO: renamed from: l.F */
/* JADX INFO: loaded from: classes.dex */
public class C0873F extends RadioButton implements InterfaceC0390t, InterfaceC0391u {

    /* JADX INFO: renamed from: a */
    public final C0781d f3530a;

    /* JADX INFO: renamed from: b */
    public final C0959p f3531b;

    /* JADX INFO: renamed from: c */
    public final C0915a0 f3532c;

    /* JADX INFO: renamed from: d */
    public C0979x f3533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        AbstractC0913Z0.m2349a(context);
        AbstractC0911Y0.m2344a(this, getContext());
        C0781d c0781d = new C0781d(this);
        this.f3530a = c0781d;
        c0781d.m2131d(attributeSet, R.attr.resc);
        C0959p c0959p = new C0959p(this);
        this.f3531b = c0959p;
        c0959p.m2406d(attributeSet, R.attr.resc);
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3532c = c0915a0;
        c0915a0.m2356f(attributeSet, R.attr.resc);
        getEmojiTextViewHelper().m2431b(attributeSet, R.attr.resc);
    }

    private C0979x getEmojiTextViewHelper() {
        if (this.f3533d == null) {
            this.f3533d = new C0979x(this);
        }
        return this.f3533d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0915a0 c0915a0 = this.f3532c;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    @Override // p036T.InterfaceC0390t
    public ColorStateList getSupportButtonTintList() {
        C0781d c0781d = this.f3530a;
        if (c0781d != null) {
            return (ColorStateList) c0781d.f3156e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0781d c0781d = this.f3530a;
        if (c0781d != null) {
            return (PorterDuff.Mode) c0781d.f3157f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3532c.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3532c.m2355e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2432c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0781d c0781d = this.f3530a;
        if (c0781d != null) {
            if (c0781d.f3154c) {
                c0781d.f3154c = false;
            } else {
                c0781d.f3154c = true;
                c0781d.m2128a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3532c;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3532c;
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
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3531b;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // p036T.InterfaceC0390t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0781d c0781d = this.f3530a;
        if (c0781d != null) {
            c0781d.f3156e = colorStateList;
            c0781d.f3152a = true;
            c0781d.m2128a();
        }
    }

    @Override // p036T.InterfaceC0390t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0781d c0781d = this.f3530a;
        if (c0781d != null) {
            c0781d.f3157f = mode;
            c0781d.f3153b = true;
            c0781d.m2128a();
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3532c;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3532c;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }
}
