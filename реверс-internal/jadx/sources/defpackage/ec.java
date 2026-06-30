package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ec {
    public final TextView a;
    public a12 b;
    public a12 c;
    public a12 d;
    public a12 e;
    public a12 f;
    public a12 g;
    public a12 h;
    public final nc i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public ec(TextView textView) {
        this.a = textView;
        this.i = new nc(textView);
    }

    public static a12 c(Context context, wb wbVar, int i) {
        ColorStateList colorStateListG;
        synchronized (wbVar) {
            colorStateListG = wbVar.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        a12 a12Var = new a12();
        a12Var.d = true;
        a12Var.a = colorStateListG;
        return a12Var;
    }

    public final void a(Drawable drawable, a12 a12Var) {
        if (drawable == null || a12Var == null) {
            return;
        }
        wb.c(drawable, a12Var, this.a.getDrawableState());
    }

    public final void b() {
        a12 a12Var = this.b;
        TextView textView = this.a;
        if (a12Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i) {
        wb wbVar;
        boolean z;
        boolean z2;
        String string;
        String string2;
        float f;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int[] iArr = ub1.b;
        int[] iArr2 = ub1.g;
        nc ncVar = this.i;
        TextView textView = this.a;
        Context context = textView.getContext();
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
        int[] iArr3 = ub1.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = this.a;
        h62.a(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.b = c(context, wbVar, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.c = c(context, wbVar, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.d = c(context, wbVar, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.e = c(context, wbVar, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f = c(context, wbVar, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.g = c(context, wbVar, typedArrayObtainStyledAttributes.getResourceId(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId3, iArr2);
            oc ocVar = new oc(context, typedArrayObtainStyledAttributes2);
            if (z3 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
                z = true;
            }
            f(context, ocVar);
            string2 = typedArrayObtainStyledAttributes2.hasValue(15) ? typedArrayObtainStyledAttributes2.getString(15) : null;
            string = typedArrayObtainStyledAttributes2.hasValue(13) ? typedArrayObtainStyledAttributes2.getString(13) : null;
            ocVar.v();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        oc ocVar2 = new oc(context, typedArrayObtainStyledAttributes3);
        if (!z3 && typedArrayObtainStyledAttributes3.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes3.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes3.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes3.getString(15);
        }
        if (typedArrayObtainStyledAttributes3.hasValue(13)) {
            string = typedArrayObtainStyledAttributes3.getString(13);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes3.hasValue(0) && typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, ocVar2);
        ocVar2.v();
        if (!z3 && z) {
            this.a.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            cc.d(textView, string);
        }
        if (string2 != null) {
            bc.b(textView, bc.a(string2));
        }
        Context context2 = ncVar.j;
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = ncVar.i;
        h62.a(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes4, i);
        if (typedArrayObtainStyledAttributes4.hasValue(5)) {
            ncVar.a = typedArrayObtainStyledAttributes4.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes4.hasValue(4) ? typedArrayObtainStyledAttributes4.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes4.hasValue(2) ? typedArrayObtainStyledAttributes4.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes4.hasValue(1) ? typedArrayObtainStyledAttributes4.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes4.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes4.getResourceId(3, 0)) <= 0) {
            f = -1.0f;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes4.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            f = -1.0f;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                ncVar.f = nc.b(iArr4);
                ncVar.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (ncVar.a == 1) {
            if (!ncVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == f) {
                    dimension = 1.0f;
                }
                ncVar.i(dimension2, dimension3, dimension);
            }
            ncVar.g();
        }
        if (w62.a && ncVar.a != 0) {
            int[] iArr5 = ncVar.f;
            if (iArr5.length > 0) {
                if (cc.a(textView) != f) {
                    cc.b(textView, Math.round(ncVar.d), Math.round(ncVar.e), Math.round(ncVar.c), 0);
                } else {
                    cc.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes5.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? wbVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes5.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? wbVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes5.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? wbVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes5.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? wbVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes5.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? wbVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes5.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? wbVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            Drawable drawable = drawableA6;
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawable, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable2 = compoundDrawablesRelative2[0];
            if (drawable2 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawableA2, compoundDrawablesRelative2[2], drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes5.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes5.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes5.getResourceId(11, 0)) == 0 || (colorStateList = nu0.t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes5.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes5.hasValue(12)) {
            textView.setCompoundDrawableTintMode(x10.a(typedArrayObtainStyledAttributes5.getInt(12, -1)));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes5.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes5.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes5.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes5.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i6 = typedValuePeekValue.data;
                int i7 = i6 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i6);
                i3 = i7;
                i2 = -1;
                typedArrayObtainStyledAttributes5.recycle();
                if (dimensionPixelSize2 != i2) {
                    kd1.A(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != i2) {
                    kd1.B(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == f) {
                    if (i3 == i2) {
                        kd1.C(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        v0.k(textView, i3, dimensionPixelSize);
                        return;
                    } else {
                        kd1.C(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i2 = -1;
            dimensionPixelSize = typedArrayObtainStyledAttributes5.getDimensionPixelSize(19, -1);
        } else {
            i2 = -1;
            dimensionPixelSize = f;
        }
        i3 = i2;
        typedArrayObtainStyledAttributes5.recycle();
        if (dimensionPixelSize2 != i2) {
        }
        if (dimensionPixelSize3 != i2) {
        }
        if (dimensionPixelSize == f) {
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ub1.g);
        oc ocVar = new oc(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, ocVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            cc.d(textView, string);
        }
        ocVar.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(Context context, oc ocVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) ocVar.a;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceL = ocVar.l(i5, this.j, new zb(this, i6, i7, new WeakReference(this.a)));
                if (typefaceL != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceL;
                    } else {
                        this.l = dc.a(Typeface.create(typefaceL, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = dc.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
