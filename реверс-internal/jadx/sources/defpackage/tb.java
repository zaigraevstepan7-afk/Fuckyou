package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class tb extends AutoCompleteTextView {
    public static final int[] h = {R.attr.popupBackground};
    public final ub e;
    public final ec f;
    public final qt0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        Object obj = z02.a;
        if (!(context.getResources() instanceof b12)) {
            context.getResources();
            int i2 = y42.a;
        }
        k02.a(this, getContext());
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, h, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : nu0.u(context2, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
        ub ubVar = new ub(this);
        this.e = ubVar;
        ubVar.b(attributeSet, i);
        ec ecVar = new ec(this);
        this.f = ecVar;
        ecVar.d(attributeSet, i);
        ecVar.b();
        qt0 qt0Var = new qt0(this, 4);
        this.g = qt0Var;
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, ub1.b, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes2.hasValue(14) ? typedArrayObtainStyledAttributes2.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes2.recycle();
            qt0Var.z(z);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerS = qt0Var.s(keyListener);
            if (keyListenerS == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerS);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof i02 ? ((i02) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        qt0 qt0Var = (qt0) this.g.f;
        if (inputConnectionOnCreateInputConnection == null) {
            qt0Var.getClass();
            return null;
        }
        xg0 xg0Var = (xg0) qt0Var.f;
        xg0Var.getClass();
        return inputConnectionOnCreateInputConnection instanceof m30 ? inputConnectionOnCreateInputConnection : new m30((tb) xg0Var.f, inputConnectionOnCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof i02) && callback != null) {
            callback = new i02(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(nu0.u(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.g.z(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.g.s(keyListener));
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
}
