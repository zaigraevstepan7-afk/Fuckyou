package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0529T;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p001A0.AbstractC0016e;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p034S.AbstractC0358b;
import p034S.AbstractC0359c;
import p036T.AbstractC0383m;
import p036T.AbstractC0384n;
import p036T.AbstractC0387q;
import p036T.InterfaceC0391u;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f3686a;

    /* JADX INFO: renamed from: b */
    public C0916a1 f3687b;

    /* JADX INFO: renamed from: c */
    public C0916a1 f3688c;

    /* JADX INFO: renamed from: d */
    public C0916a1 f3689d;

    /* JADX INFO: renamed from: e */
    public C0916a1 f3690e;

    /* JADX INFO: renamed from: f */
    public C0916a1 f3691f;

    /* JADX INFO: renamed from: g */
    public C0916a1 f3692g;

    /* JADX INFO: renamed from: h */
    public C0916a1 f3693h;

    /* JADX INFO: renamed from: i */
    public final C0945k0 f3694i;

    /* JADX INFO: renamed from: j */
    public int f3695j = 0;

    /* JADX INFO: renamed from: k */
    public int f3696k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f3697l;

    /* JADX INFO: renamed from: m */
    public boolean f3698m;

    public C0915a0(TextView textView) {
        this.f3686a = textView;
        this.f3694i = new C0945k0(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0916a1 m2350c(Context context, C0973u c0973u, int i2) {
        ColorStateList colorStateListM2325i;
        synchronized (c0973u) {
            colorStateListM2325i = c0973u.f3860a.m2325i(context, i2);
        }
        if (colorStateListM2325i == null) {
            return null;
        }
        C0916a1 c0916a1 = new C0916a1();
        c0916a1.f3702d = true;
        c0916a1.f3699a = colorStateListM2325i;
        return c0916a1;
    }

    /* JADX INFO: renamed from: h */
    public static void m2351h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            AbstractC0358b.m991a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            AbstractC0358b.m991a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            AbstractC0359c.m992a(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            AbstractC0359c.m992a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0359c.m992a(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        AbstractC0359c.m992a(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m2352a(Drawable drawable, C0916a1 c0916a1) {
        if (drawable == null || c0916a1 == null) {
            return;
        }
        C0973u.m2426e(drawable, c0916a1, this.f3686a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m2353b() {
        C0916a1 c0916a1 = this.f3687b;
        TextView textView = this.f3686a;
        if (c0916a1 != null || this.f3688c != null || this.f3689d != null || this.f3690e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m2352a(compoundDrawables[0], this.f3687b);
            m2352a(compoundDrawables[1], this.f3688c);
            m2352a(compoundDrawables[2], this.f3689d);
            m2352a(compoundDrawables[3], this.f3690e);
        }
        if (this.f3691f == null && this.f3692g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m2352a(compoundDrawablesRelative[0], this.f3691f);
        m2352a(compoundDrawablesRelative[2], this.f3692g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m2354d() {
        C0916a1 c0916a1 = this.f3693h;
        if (c0916a1 != null) {
            return c0916a1.f3699a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m2355e() {
        C0916a1 c0916a1 = this.f3693h;
        if (c0916a1 != null) {
            return c0916a1.f3700b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2356f(AttributeSet attributeSet, int i2) {
        String string;
        boolean z2;
        boolean z3;
        ColorStateList colorStateListM844g;
        ColorStateList colorStateListM844g2;
        ColorStateList colorStateListM844g3;
        String string2;
        C0973u c0973u;
        int i3;
        int i4;
        float dimensionPixelSize;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        int i6;
        TextView textView = this.f3686a;
        Context context = textView.getContext();
        C0973u c0973uM2423a = C0973u.m2423a();
        int[] iArr = AbstractC0641a.f2487h;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, i2);
        AbstractC0240S.m784o(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0270lM838m.f837b, i2);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3687b = m2350c(context, c0973uM2423a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3688c = m2350c(context, c0973uM2423a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3689d = m2350c(context, c0973uM2423a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3690e = m2350c(context, c0973uM2423a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f3691f = m2350c(context, c0973uM2423a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3692g = m2350c(context, c0973uM2423a, typedArray.getResourceId(6, 0));
        }
        c0270lM838m.m851o();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0641a.f2502w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0270l c0270l = new C0270l(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m2363n(context, c0270l);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 23) {
                colorStateListM844g = typedArrayObtainStyledAttributes.hasValue(3) ? c0270l.m844g(3) : null;
                colorStateListM844g2 = typedArrayObtainStyledAttributes.hasValue(4) ? c0270l.m844g(4) : null;
                if (typedArrayObtainStyledAttributes.hasValue(5)) {
                    colorStateListM844g3 = c0270l.m844g(5);
                    i6 = 15;
                    string2 = !typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getString(i6) : null;
                    string = (i7 >= 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
                    c0270l.m851o();
                } else {
                    i6 = 15;
                }
            } else {
                i6 = 15;
                colorStateListM844g = null;
                colorStateListM844g2 = null;
            }
            colorStateListM844g3 = null;
            if (!typedArrayObtainStyledAttributes.hasValue(i6)) {
            }
            if (i7 >= 26) {
                c0270l.m851o();
            }
        } else {
            string = null;
            z2 = false;
            z3 = false;
            colorStateListM844g = null;
            colorStateListM844g2 = null;
            colorStateListM844g3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0270l c0270l2 = new C0270l(context, typedArrayObtainStyledAttributes2);
        if (!z4 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z5 = z3;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListM844g = c0270l2.m844g(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListM844g2 = c0270l2.m844g(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListM844g3 = c0270l2.m844g(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListM844g;
        ColorStateList colorStateList3 = colorStateListM844g2;
        ColorStateList colorStateList4 = colorStateListM844g3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i8 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i8 < 28 || !typedArrayObtainStyledAttributes2.hasValue(0)) {
            c0973u = c0973uM2423a;
        } else {
            c0973u = c0973uM2423a;
            if (typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m2363n(context, c0270l2);
        c0270l2.m851o();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z4 && z2) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f3697l;
        if (typeface != null) {
            if (this.f3696k == -1) {
                textView.setTypeface(typeface, this.f3695j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0910Y.m2343d(textView, string);
        }
        if (str == null) {
            i3 = 0;
        } else if (i8 >= 24) {
            AbstractC0908X.m2335b(textView, AbstractC0908X.m2334a(str));
            i3 = 0;
        } else {
            i3 = 0;
            textView.setTextLocale(AbstractC0906W.m2333a(str.split(",")[0]));
        }
        int[] iArr3 = AbstractC0641a.f2488i;
        C0945k0 c0945k0 = this.f3694i;
        Context context2 = c0945k0.f3767j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, i3);
        TextView textView2 = c0945k0.f3766i;
        AbstractC0240S.m784o(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0945k0.f3758a = typedArrayObtainStyledAttributes3.getInt(5, i3);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i9 = 0; i9 < length; i9++) {
                    iArr4[i9] = typedArrayObtainTypedArray.getDimensionPixelSize(i9, -1);
                }
                c0945k0.f3763f = C0945k0.m2385b(iArr4);
                c0945k0.m2393i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0945k0.m2394j()) {
            c0945k0.f3758a = 0;
        } else if (c0945k0.f3758a == 1) {
            if (!c0945k0.f3764g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0945k0.m2395k(dimension2, f, dimension);
            }
            c0945k0.m2392h();
        }
        if (AbstractC0970s1.f3847c && c0945k0.f3758a != 0) {
            int[] iArr5 = c0945k0.f3763f;
            if (iArr5.length > 0) {
                if (AbstractC0910Y.m2340a(textView) != -1.0f) {
                    AbstractC0910Y.m2341b(textView, Math.round(c0945k0.f3761d), Math.round(c0945k0.f3762e), Math.round(c0945k0.f3760c), 0);
                } else {
                    AbstractC0910Y.m2342c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        C0973u c0973u2 = c0973u;
        Drawable drawableM2427b = resourceId4 != -1 ? c0973u2.m2427b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM2427b2 = resourceId5 != -1 ? c0973u2.m2427b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM2427b3 = resourceId6 != -1 ? c0973u2.m2427b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM2427b4 = resourceId7 != -1 ? c0973u2.m2427b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM2427b5 = resourceId8 != -1 ? c0973u2.m2427b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM2427b6 = resourceId9 != -1 ? c0973u2.m2427b(context, resourceId9) : null;
        if (drawableM2427b5 != null || drawableM2427b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM2427b5 == null) {
                drawableM2427b5 = compoundDrawablesRelative[0];
            }
            if (drawableM2427b2 == null) {
                drawableM2427b2 = compoundDrawablesRelative[1];
            }
            if (drawableM2427b6 == null) {
                drawableM2427b6 = compoundDrawablesRelative[2];
            }
            if (drawableM2427b4 == null) {
                drawableM2427b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM2427b5, drawableM2427b2, drawableM2427b6, drawableM2427b4);
        } else if (drawableM2427b != null || drawableM2427b2 != null || drawableM2427b3 != null || drawableM2427b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM2427b == null) {
                    drawableM2427b = compoundDrawables[0];
                }
                if (drawableM2427b2 == null) {
                    drawableM2427b2 = compoundDrawables[1];
                }
                if (drawableM2427b3 == null) {
                    drawableM2427b3 = compoundDrawables[2];
                }
                if (drawableM2427b4 == null) {
                    drawableM2427b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM2427b, drawableM2427b2, drawableM2427b3, drawableM2427b4);
            } else {
                if (drawableM2427b2 == null) {
                    drawableM2427b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM2427b4 == null) {
                    drawableM2427b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM2427b2, compoundDrawablesRelative2[2], drawableM2427b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0016e.m160I(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0384n.m1087f(textView, colorStateList);
            } else if (textView instanceof InterfaceC0391u) {
                ((InterfaceC0391u) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeM2415c = AbstractC0966r0.m2415c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0384n.m1088g(textView, modeM2415c);
            } else if (textView instanceof InterfaceC0391u) {
                ((InterfaceC0391u) textView).setSupportCompoundDrawablesTintMode(modeM2415c);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i10 = typedValuePeekValue.data;
                int i11 = i10 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i10);
                i5 = i11;
                i4 = -1;
                typedArrayObtainStyledAttributes4.recycle();
                if (dimensionPixelSize2 != i4) {
                    AbstractC0383m.m1035b0(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != i4) {
                    AbstractC0383m.m1036c0(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == -1.0f) {
                    if (i5 == i4) {
                        AbstractC0383m.m1037d0(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC0387q.m1095a(textView, i5, dimensionPixelSize);
                        return;
                    } else {
                        AbstractC0383m.m1037d0(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i4 = -1;
            dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i4 = -1;
            dimensionPixelSize = -1.0f;
        }
        i5 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i4) {
        }
        if (dimensionPixelSize3 != i4) {
        }
        if (dimensionPixelSize == -1.0f) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2357g(Context context, int i2) {
        String string;
        ColorStateList colorStateListM844g;
        ColorStateList colorStateListM844g2;
        ColorStateList colorStateListM844g3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0641a.f2502w);
        C0270l c0270l = new C0270l(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f3686a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListM844g3 = c0270l.m844g(3)) != null) {
                textView.setTextColor(colorStateListM844g3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListM844g2 = c0270l.m844g(5)) != null) {
                textView.setLinkTextColor(colorStateListM844g2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListM844g = c0270l.m844g(4)) != null) {
                textView.setHintTextColor(colorStateListM844g);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2363n(context, c0270l);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0910Y.m2343d(textView, string);
        }
        c0270l.m851o();
        Typeface typeface = this.f3697l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3695j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2358i(int i2, int i3, int i4, int i5) {
        C0945k0 c0945k0 = this.f3694i;
        if (c0945k0.m2394j()) {
            DisplayMetrics displayMetrics = c0945k0.f3767j.getResources().getDisplayMetrics();
            c0945k0.m2395k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0945k0.m2392h()) {
                c0945k0.m2388a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2359j(int[] iArr, int i2) {
        C0945k0 c0945k0 = this.f3694i;
        if (c0945k0.m2394j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0945k0.f3767j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0945k0.f3763f = C0945k0.m2385b(iArrCopyOf);
                if (!c0945k0.m2393i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0945k0.f3764g = false;
            }
            if (c0945k0.m2392h()) {
                c0945k0.m2388a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2360k(int i2) {
        C0945k0 c0945k0 = this.f3694i;
        if (c0945k0.m2394j()) {
            if (i2 == 0) {
                c0945k0.f3758a = 0;
                c0945k0.f3761d = -1.0f;
                c0945k0.f3762e = -1.0f;
                c0945k0.f3760c = -1.0f;
                c0945k0.f3763f = new int[0];
                c0945k0.f3759b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(AbstractC0529T.m1416e("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c0945k0.f3767j.getResources().getDisplayMetrics();
            c0945k0.m2395k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0945k0.m2392h()) {
                c0945k0.m2388a();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2361l(ColorStateList colorStateList) {
        if (this.f3693h == null) {
            this.f3693h = new C0916a1();
        }
        C0916a1 c0916a1 = this.f3693h;
        c0916a1.f3699a = colorStateList;
        c0916a1.f3702d = colorStateList != null;
        this.f3687b = c0916a1;
        this.f3688c = c0916a1;
        this.f3689d = c0916a1;
        this.f3690e = c0916a1;
        this.f3691f = c0916a1;
        this.f3692g = c0916a1;
    }

    /* JADX INFO: renamed from: m */
    public final void m2362m(PorterDuff.Mode mode) {
        if (this.f3693h == null) {
            this.f3693h = new C0916a1();
        }
        C0916a1 c0916a1 = this.f3693h;
        c0916a1.f3700b = mode;
        c0916a1.f3701c = mode != null;
        this.f3687b = c0916a1;
        this.f3688c = c0916a1;
        this.f3689d = c0916a1;
        this.f3690e = c0916a1;
        this.f3691f = c0916a1;
        this.f3692g = c0916a1;
    }

    /* JADX INFO: renamed from: n */
    public final void m2363n(Context context, C0270l c0270l) {
        String string;
        int i2 = this.f3695j;
        TypedArray typedArray = (TypedArray) c0270l.f837b;
        this.f3695j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3696k = i4;
            if (i4 != -1) {
                this.f3695j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3698m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3697l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3697l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3697l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3697l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f3696k;
        int i8 = this.f3695j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM847j = c0270l.m847j(i6, this.f3695j, new C0904V(this, i7, i8, new WeakReference(this.f3686a)));
                if (typefaceM847j != null) {
                    if (i3 < 28 || this.f3696k == -1) {
                        this.f3697l = typefaceM847j;
                    } else {
                        this.f3697l = AbstractC0912Z.m2348a(Typeface.create(typefaceM847j, 0), this.f3696k, (this.f3695j & 2) != 0);
                    }
                }
                this.f3698m = this.f3697l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3697l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3696k == -1) {
            this.f3697l = Typeface.create(string, this.f3695j);
        } else {
            this.f3697l = AbstractC0912Z.m2348a(Typeface.create(string, 0), this.f3696k, (this.f3695j & 2) != 0);
        }
    }
}
