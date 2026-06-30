package p074l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.reddit.frontpage.R;
import p000A.C0001b;
import p023M0.C0206l;
import p024N.AbstractC0240S;
import p024N.C0254d;
import p024N.C0258f;
import p024N.InterfaceC0252c;
import p024N.InterfaceC0286t;
import p034S.AbstractC0359c;
import p034S.C0360d;
import p034S.C0361e;
import p036T.AbstractC0383m;
import p036T.C0389s;
import p036T.InterfaceC0391u;

/* JADX INFO: renamed from: l.w */
/* JADX INFO: loaded from: classes.dex */
public class C0977w extends EditText implements InterfaceC0286t, InterfaceC0391u {

    /* JADX INFO: renamed from: a */
    public final C0959p f3863a;

    /* JADX INFO: renamed from: b */
    public final C0915a0 f3864b;

    /* JADX INFO: renamed from: c */
    public final C0871E f3865c;

    /* JADX INFO: renamed from: d */
    public final C0389s f3866d;

    /* JADX INFO: renamed from: e */
    public final C0871E f3867e;

    /* JADX INFO: renamed from: f */
    public C0975v f3868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.resc);
        AbstractC0913Z0.m2349a(context);
        AbstractC0911Y0.m2344a(this, getContext());
        C0959p c0959p = new C0959p(this);
        this.f3863a = c0959p;
        c0959p.m2406d(attributeSet, R.attr.resc);
        C0915a0 c0915a0 = new C0915a0(this);
        this.f3864b = c0915a0;
        c0915a0.m2356f(attributeSet, R.attr.resc);
        c0915a0.m2353b();
        C0871E c0871e = new C0871E();
        c0871e.f3528b = this;
        this.f3865c = c0871e;
        this.f3866d = new C0389s();
        C0871E c0871e2 = new C0871E(this);
        this.f3867e = c0871e2;
        c0871e2.mo2279b(attributeSet, R.attr.resc);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2278a = c0871e2.m2278a(keyListener);
        if (keyListenerM2278a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2278a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0975v getSuperCaller() {
        if (this.f3868f == null) {
            this.f3868f = new C0975v(this);
        }
        return this.f3868f;
    }

    @Override // p024N.InterfaceC0286t
    /* JADX INFO: renamed from: a */
    public final C0258f mo690a(C0258f c0258f) {
        return this.f3866d.m1096a(this, c0258f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0915a0 c0915a0 = this.f3864b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0383m.m1048n0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3864b.m2354d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3864b.m2355e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0871E c0871e;
        if (Build.VERSION.SDK_INT >= 28 || (c0871e = this.f3865c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0871e.f3529c;
        return textClassifier == null ? AbstractC0902U.m2331a((TextView) c0871e.f3528b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        String[] strArrM776g;
        String[] stringArray;
        InputConnection c0361e;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3864b.getClass();
        C0915a0.m2351h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0383m.m1033L(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i2 = Build.VERSION.SDK_INT) <= 30 && (strArrM776g = AbstractC0240S.m776g(this)) != null) {
            if (i2 >= 25) {
                editorInfo.contentMimeTypes = strArrM776g;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM776g);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM776g);
            }
            C0206l c0206l = new C0206l(this);
            if (i2 >= 25) {
                c0361e = new C0360d(inputConnectionOnCreateInputConnection, c0206l);
            } else {
                String[] strArr = AbstractC0359c.f1001a;
                if (i2 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                    if (strArr.length != 0) {
                        c0361e = new C0361e(inputConnectionOnCreateInputConnection, c0206l);
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                        }
                    }
                    if (strArr.length != 0) {
                    }
                }
            }
            inputConnectionOnCreateInputConnection = c0361e;
        }
        return this.f3867e.m2280c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i2 = Build.VERSION.SDK_INT;
        boolean zM2286a = false;
        if (i2 < 31 && i2 >= 24 && dragEvent.getLocalState() == null && AbstractC0240S.m776g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM2286a = AbstractC0877H.m2286a(dragEvent, this, activity);
            }
        }
        if (zM2286a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC0252c c0001b;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC0240S.m776g(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0001b = new C0001b(primaryClip, 1);
            } else {
                C0254d c0254d = new C0254d();
                c0254d.f797b = primaryClip;
                c0254d.f798c = 1;
                c0001b = c0254d;
            }
            c0001b.mo31B(i2 == 16908322 ? 0 : 1);
            AbstractC0240S.m781l(this, c0001b.mo49n());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3864b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0915a0 c0915a0 = this.f3864b;
        if (c0915a0 != null) {
            c0915a0.m2353b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0383m.m1050o0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3867e.m2281d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3867e.m2278a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3863a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0915a0 c0915a0 = this.f3864b;
        c0915a0.m2361l(colorStateList);
        c0915a0.m2353b();
    }

    @Override // p036T.InterfaceC0391u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0915a0 c0915a0 = this.f3864b;
        c0915a0.m2362m(mode);
        c0915a0.m2353b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0915a0 c0915a0 = this.f3864b;
        if (c0915a0 != null) {
            c0915a0.m2357g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0871E c0871e;
        if (Build.VERSION.SDK_INT >= 28 || (c0871e = this.f3865c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0871e.f3529c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
