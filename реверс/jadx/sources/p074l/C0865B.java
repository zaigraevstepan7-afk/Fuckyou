package p074l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p036T.InterfaceC0391u;

/* JADX INFO: renamed from: l.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0865B extends MultiAutoCompleteTextView implements InterfaceC0391u {

    /* JADX INFO: renamed from: d */
    public static final int[] f3506d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C0959p f3507a;

    /* JADX INFO: renamed from: b */
    public final C0915a0 f3508b;

    /* JADX INFO: renamed from: c */
    public final C0871E f3509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0865B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.reddit.frontpage.R.attr.resc);
        AbstractC0913Z0.m2349a(context);
        AbstractC0911Y0.m2344a(this, getContext());
        C0270l c0270lM838m = C0270l.m838m(getContext(), attributeSet, f3506d, com.reddit.frontpage.R.attr.resc);
        if (((TypedArray) c0270lM838m.f837b).hasValue(0)) {
            setDropDownBackgroundDrawable(c0270lM838m.m845h(0));
        }
        c0270lM838m.m851o();
        C0959p c0959p = new C0959p(this);
        this.f3507a = c0959p;
        c0959p.m2406d(attributeSet, com.reddit.frontpage.R.attr.resc);
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3508b = c0915a0;
        c0915a0.m2356f(attributeSet, com.reddit.frontpage.R.attr.resc);
        c0915a0.m2353b();
        C0871E c0871e = new C0871E(this);
        this.f3509c = c0871e;
        c0871e.mo2279b(attributeSet, com.reddit.frontpage.R.attr.resc);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM2278a = c0871e.m2278a(keyListener);
        if (keyListenerM2278a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2278a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0915a0 c0915a0 = this.f3508b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3508b.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3508b.m2355e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0383m.m1033L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f3509c.m2280c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3508b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3508b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3509c.m2281d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3509c.m2278a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3507a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3508b;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3508b;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0915a0 c0915a0 = this.f3508b;
        if (c0915a0 != null) {
            c0915a0.m2357g(context, i2);
        }
    }
}
