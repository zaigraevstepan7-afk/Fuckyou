package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ub {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ub() {
        this.b = new xd0[32];
        this.c = new float[32];
        this.d = new byte[32];
        ay0 ay0Var = qi1.a;
        this.e = new ay0();
        this.f = new ay0();
    }

    public void a() {
        TextView textView = (TextView) this.b;
        Drawable background = textView.getBackground();
        if (background != null) {
            if (((a12) this.d) != null) {
                if (((a12) this.f) == null) {
                    this.f = new a12();
                }
                a12 a12Var = (a12) this.f;
                a12Var.a = null;
                a12Var.d = false;
                a12Var.b = null;
                a12Var.c = false;
                Field field = h62.a;
                ColorStateList backgroundTintList = textView.getBackgroundTintList();
                if (backgroundTintList != null) {
                    a12Var.d = true;
                    a12Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = textView.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    a12Var.c = true;
                    a12Var.b = backgroundTintMode;
                }
                if (a12Var.d || a12Var.c) {
                    wb.c(background, a12Var, textView.getDrawableState());
                    return;
                }
            }
            a12 a12Var2 = (a12) this.e;
            if (a12Var2 != null) {
                wb.c(background, a12Var2, textView.getDrawableState());
                return;
            }
            a12 a12Var3 = (a12) this.d;
            if (a12Var3 != null) {
                wb.c(background, a12Var3, textView.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int resourceId;
        ColorStateList colorStateListG;
        TextView textView = (TextView) this.b;
        Context context = textView.getContext();
        int[] iArr = ub1.h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView2 = (TextView) this.b;
        h62.a(textView2, textView2.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                wb wbVar = (wb) this.c;
                Context context2 = textView.getContext();
                int i2 = this.a;
                synchronized (wbVar) {
                    colorStateListG = wbVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    d(colorStateListG);
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                if (!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0 || (colorStateList = nu0.t(context, resourceId)) == null) {
                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
                }
                textView.setBackgroundTintList(colorStateList);
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                textView.setBackgroundTintMode(x10.a(typedArrayObtainStyledAttributes.getInt(2, -1)));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(xd0 xd0Var) {
        int iV = nd.V((xd0[]) this.b, xd0Var);
        if (iV >= 0) {
            xd0[] xd0VarArr = (xd0[]) this.b;
            int i = iV + 1;
            nd.M(xd0VarArr, xd0VarArr, iV, i, this.a);
            xd0[] xd0VarArr2 = (xd0[]) this.b;
            int i2 = this.a;
            xd0VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, iV, i2 - i);
            byte[] bArr = (byte[]) this.d;
            System.arraycopy(bArr, i, bArr, iV, this.a - i);
            this.a--;
        }
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((a12) this.d) == null) {
                this.d = new a12();
            }
            a12 a12Var = (a12) this.d;
            a12Var.a = colorStateList;
            a12Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public ub(TextView textView) {
        wb wbVar;
        this.a = -1;
        this.b = textView;
        PorterDuff.Mode mode = wb.b;
        synchronized (wb.class) {
            try {
                if (wb.c == null) {
                    wb.b();
                }
                wbVar = wb.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = wbVar;
    }
}
