package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.reddit.frontpage.R;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p036T.AbstractC0383m;
import p036T.InterfaceC0391u;
import p057d.AbstractC0641a;
import p068h0.C0781d;

/* JADX INFO: renamed from: l.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0968s extends CheckedTextView implements InterfaceC0391u {

    /* JADX INFO: renamed from: a */
    public final C0781d f3841a;

    /* JADX INFO: renamed from: b */
    public final C0959p f3842b;

    /* JADX INFO: renamed from: c */
    public final C0915a0 f3843c;

    /* JADX INFO: renamed from: d */
    public C0979x f3844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0968s(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.resc);
        AbstractC0913Z0.m2349a(context);
        AbstractC0911Y0.m2344a(this, getContext());
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3843c = c0915a0;
        c0915a0.m2356f(attributeSet, R.attr.resc);
        c0915a0.m2353b();
        C0959p c0959p = new C0959p(this);
        this.f3842b = c0959p;
        c0959p.m2406d(attributeSet, R.attr.resc);
        this.f3841a = new C0781d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0641a.f2491l;
        C0270l c0270lM838m = C0270l.m838m(context2, attributeSet, iArr, R.attr.resc);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        AbstractC0240S.m784o(this, getContext(), iArr, attributeSet, (TypedArray) c0270lM838m.f837b, R.attr.resc);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0383m.m1057w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC0383m.m1057w(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0383m.m1057w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0270lM838m.m844g(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0966r0.m2415c(typedArray.getInt(3, -1), null));
            }
            c0270lM838m.m851o();
            getEmojiTextViewHelper().m2431b(attributeSet, R.attr.resc);
        } catch (Throwable th) {
            c0270lM838m.m851o();
            throw th;
        }
    }

    private C0979x getEmojiTextViewHelper() {
        if (this.f3844d == null) {
            this.f3844d = new C0979x(this);
        }
        return this.f3844d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0915a0 c0915a0 = this.f3843c;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0781d c0781d = this.f3841a;
        if (c0781d != null) {
            c0781d.m2129b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0383m.m1048n0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0781d c0781d = this.f3841a;
        if (c0781d != null) {
            return (ColorStateList) c0781d.f3156e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0781d c0781d = this.f3841a;
        if (c0781d != null) {
            return (PorterDuff.Mode) c0781d.f3157f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3843c.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3843c.m2355e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0383m.m1033L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2432c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0781d c0781d = this.f3841a;
        if (c0781d != null) {
            if (c0781d.f3154c) {
                c0781d.f3154c = false;
            } else {
                c0781d.f3154c = true;
                c0781d.m2129b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3843c;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3843c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3842b;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0781d c0781d = this.f3841a;
        if (c0781d != null) {
            c0781d.f3156e = colorStateList;
            c0781d.f3152a = true;
            c0781d.m2129b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0781d c0781d = this.f3841a;
        if (c0781d != null) {
            c0781d.f3157f = mode;
            c0781d.f3153b = true;
            c0781d.m2129b();
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3843c;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3843c;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0915a0 c0915a0 = this.f3843c;
        if (c0915a0 != null) {
            c0915a0.m2357g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }
}
