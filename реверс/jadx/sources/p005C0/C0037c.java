package p005C0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p010F0.C0086a;
import p020L.AbstractC0177k;
import p024N.AbstractC0240S;
import p052b0.C0595a;
import p081o0.AbstractC1015a;

/* JADX INFO: renamed from: C0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0037c {

    /* JADX INFO: renamed from: A */
    public CharSequence f81A;

    /* JADX INFO: renamed from: B */
    public CharSequence f82B;

    /* JADX INFO: renamed from: C */
    public boolean f83C;

    /* JADX INFO: renamed from: E */
    public Bitmap f85E;

    /* JADX INFO: renamed from: F */
    public float f86F;

    /* JADX INFO: renamed from: G */
    public float f87G;

    /* JADX INFO: renamed from: H */
    public float f88H;

    /* JADX INFO: renamed from: I */
    public float f89I;

    /* JADX INFO: renamed from: J */
    public float f90J;

    /* JADX INFO: renamed from: K */
    public int f91K;

    /* JADX INFO: renamed from: L */
    public int[] f92L;

    /* JADX INFO: renamed from: M */
    public boolean f93M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f94N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f95O;

    /* JADX INFO: renamed from: P */
    public LinearInterpolator f96P;

    /* JADX INFO: renamed from: Q */
    public LinearInterpolator f97Q;

    /* JADX INFO: renamed from: R */
    public float f98R;

    /* JADX INFO: renamed from: S */
    public float f99S;

    /* JADX INFO: renamed from: T */
    public float f100T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f101U;

    /* JADX INFO: renamed from: V */
    public float f102V;

    /* JADX INFO: renamed from: W */
    public float f103W;

    /* JADX INFO: renamed from: X */
    public float f104X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f105Y;

    /* JADX INFO: renamed from: Z */
    public float f106Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f107a;

    /* JADX INFO: renamed from: a0 */
    public float f108a0;

    /* JADX INFO: renamed from: b */
    public float f109b;

    /* JADX INFO: renamed from: b0 */
    public float f110b0;

    /* JADX INFO: renamed from: c */
    public final Rect f111c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f112c0;

    /* JADX INFO: renamed from: d */
    public final Rect f113d;

    /* JADX INFO: renamed from: e */
    public final RectF f115e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f122j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f123k;

    /* JADX INFO: renamed from: l */
    public float f124l;

    /* JADX INFO: renamed from: m */
    public float f125m;

    /* JADX INFO: renamed from: n */
    public float f126n;

    /* JADX INFO: renamed from: o */
    public float f127o;

    /* JADX INFO: renamed from: p */
    public float f128p;

    /* JADX INFO: renamed from: q */
    public float f129q;

    /* JADX INFO: renamed from: r */
    public Typeface f130r;

    /* JADX INFO: renamed from: s */
    public Typeface f131s;

    /* JADX INFO: renamed from: t */
    public Typeface f132t;

    /* JADX INFO: renamed from: u */
    public Typeface f133u;

    /* JADX INFO: renamed from: v */
    public Typeface f134v;

    /* JADX INFO: renamed from: w */
    public Typeface f135w;

    /* JADX INFO: renamed from: x */
    public Typeface f136x;

    /* JADX INFO: renamed from: y */
    public C0086a f137y;

    /* JADX INFO: renamed from: f */
    public int f117f = 16;

    /* JADX INFO: renamed from: g */
    public int f119g = 16;

    /* JADX INFO: renamed from: h */
    public float f120h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f121i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f138z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f84D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f114d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f116e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f118f0 = C0042h.f147l;

    public C0037c(TextInputLayout textInputLayout) {
        this.f107a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f94N = textPaint;
        this.f95O = new TextPaint(textPaint);
        this.f113d = new Rect();
        this.f111c = new Rect();
        this.f115e = new RectF();
        m258g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m252a(int i2, int i3, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i3) * f) + (Color.alpha(i2) * f2)), Math.round((Color.red(i3) * f) + (Color.red(i2) * f2)), Math.round((Color.green(i3) * f) + (Color.green(i2) * f2)), Math.round((Color.blue(i3) * f) + (Color.blue(i2) * f2)));
    }

    /* JADX INFO: renamed from: f */
    public static float m253f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC1015a.m2461a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m254b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        boolean z2 = this.f107a.getLayoutDirection() == 1;
        if (this.f84D) {
            return (z2 ? AbstractC0177k.f599d : AbstractC0177k.f598c).m620b(charSequence, charSequence.length());
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m255c(float f, boolean z2) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z3;
        StaticLayout staticLayoutM267a;
        Layout.Alignment alignment;
        if (this.f81A == null) {
            return;
        }
        float fWidth = this.f113d.width();
        float fWidth2 = this.f111c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f121i;
            f3 = this.f102V;
            this.f86F = 1.0f;
            typeface = this.f130r;
        } else {
            float f4 = this.f120h;
            float f5 = this.f103W;
            Typeface typeface2 = this.f133u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f86F = 1.0f;
            } else {
                this.f86F = m253f(this.f120h, this.f121i, f, this.f97Q) / this.f120h;
            }
            float f6 = this.f121i / this.f120h;
            fWidth = (z2 || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f94N;
        if (fWidth > 0.0f) {
            boolean z4 = this.f87G != f2;
            boolean z5 = this.f104X != f3;
            boolean z6 = this.f136x != typeface;
            StaticLayout staticLayout = this.f105Y;
            z3 = z4 || z5 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f93M;
            this.f87G = f2;
            this.f104X = f3;
            this.f136x = typeface;
            this.f93M = false;
            textPaint.setLinearText(this.f86F != 1.0f);
        } else {
            z3 = false;
        }
        if (this.f82B == null || z3) {
            textPaint.setTextSize(this.f87G);
            textPaint.setTypeface(this.f136x);
            textPaint.setLetterSpacing(this.f104X);
            boolean zM254b = m254b(this.f81A);
            this.f83C = zM254b;
            int i2 = this.f114d0;
            if (i2 <= 1 || zM254b) {
                i2 = 1;
            }
            try {
                if (i2 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f117f, zM254b ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f83C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f83C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                C0042h c0042h = new C0042h(this.f81A, textPaint, (int) fWidth);
                c0042h.f161k = this.f138z;
                c0042h.f160j = zM254b;
                c0042h.f155e = alignment;
                c0042h.f159i = false;
                c0042h.f156f = i2;
                c0042h.f157g = this.f116e0;
                c0042h.f158h = this.f118f0;
                staticLayoutM267a = c0042h.m267a();
            } catch (C0041g e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayoutM267a = null;
            }
            staticLayoutM267a.getClass();
            this.f105Y = staticLayoutM267a;
            this.f82B = staticLayoutM267a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m256d() {
        TextPaint textPaint = this.f95O;
        textPaint.setTextSize(this.f121i);
        textPaint.setTypeface(this.f130r);
        textPaint.setLetterSpacing(this.f102V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m257e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f92L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m258g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f132t;
            if (typeface != null) {
                this.f131s = AbstractC0016e.m179i0(configuration, typeface);
            }
            Typeface typeface2 = this.f135w;
            if (typeface2 != null) {
                this.f134v = AbstractC0016e.m179i0(configuration, typeface2);
            }
            Typeface typeface3 = this.f131s;
            if (typeface3 == null) {
                typeface3 = this.f132t;
            }
            this.f130r = typeface3;
            Typeface typeface4 = this.f134v;
            if (typeface4 == null) {
                typeface4 = this.f135w;
            }
            this.f133u = typeface4;
            m259h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m259h(boolean z2) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f107a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        m255c(1.0f, z2);
        CharSequence charSequence = this.f82B;
        TextPaint textPaint = this.f94N;
        if (charSequence != null && (staticLayout = this.f105Y) != null) {
            this.f112c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f138z);
        }
        CharSequence charSequence2 = this.f112c0;
        if (charSequence2 != null) {
            this.f106Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f106Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f119g, this.f83C ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.f113d;
        if (i2 == 48) {
            this.f125m = rect.top;
        } else if (i2 != 80) {
            this.f125m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f125m = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f127o = rect.centerX() - (this.f106Z / 2.0f);
        } else if (i3 != 5) {
            this.f127o = rect.left;
        } else {
            this.f127o = rect.right - this.f106Z;
        }
        m255c(0.0f, z2);
        float height = this.f105Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f105Y;
        if (staticLayout2 == null || this.f114d0 <= 1) {
            CharSequence charSequence3 = this.f82B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f105Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f117f, this.f83C ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.f111c;
        if (i4 == 48) {
            this.f124l = rect2.top;
        } else if (i4 != 80) {
            this.f124l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f124l = textPaint.descent() + (rect2.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f126n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i5 != 5) {
            this.f126n = rect2.left;
        } else {
            this.f126n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f85E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f85E = null;
        }
        m263l(this.f109b);
        float f = this.f109b;
        float fM253f = m253f(rect2.left, rect.left, f, this.f96P);
        RectF rectF = this.f115e;
        rectF.left = fM253f;
        rectF.top = m253f(this.f124l, this.f125m, f, this.f96P);
        rectF.right = m253f(rect2.right, rect.right, f, this.f96P);
        rectF.bottom = m253f(rect2.bottom, rect.bottom, f, this.f96P);
        this.f128p = m253f(this.f126n, this.f127o, f, this.f96P);
        this.f129q = m253f(this.f124l, this.f125m, f, this.f96P);
        m263l(f);
        C0595a c0595a = AbstractC1015a.f4047b;
        this.f108a0 = 1.0f - m253f(0.0f, 1.0f, 1.0f - f, c0595a);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        textInputLayout.postInvalidateOnAnimation();
        this.f110b0 = m253f(1.0f, 0.0f, f, c0595a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f123k;
        ColorStateList colorStateList2 = this.f122j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m252a(m257e(colorStateList2), m257e(this.f123k), f));
        } else {
            textPaint.setColor(m257e(colorStateList));
        }
        float f2 = this.f102V;
        float f3 = this.f103W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m253f(f3, f2, f, c0595a));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f88H = AbstractC1015a.m2461a(0.0f, this.f98R, f);
        this.f89I = AbstractC1015a.m2461a(0.0f, this.f99S, f);
        this.f90J = AbstractC1015a.m2461a(0.0f, this.f100T, f);
        int iM252a = m252a(0, m257e(this.f101U), f);
        this.f91K = iM252a;
        textPaint.setShadowLayer(this.f88H, this.f89I, this.f90J, iM252a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m260i(ColorStateList colorStateList) {
        if (this.f123k == colorStateList && this.f122j == colorStateList) {
            return;
        }
        this.f123k = colorStateList;
        this.f122j = colorStateList;
        m259h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m261j(Typeface typeface) {
        C0086a c0086a = this.f137y;
        if (c0086a != null) {
            c0086a.f265m = true;
        }
        if (this.f132t == typeface) {
            return false;
        }
        this.f132t = typeface;
        Typeface typefaceM179i0 = AbstractC0016e.m179i0(this.f107a.getContext().getResources().getConfiguration(), typeface);
        this.f131s = typefaceM179i0;
        if (typefaceM179i0 == null) {
            typefaceM179i0 = this.f132t;
        }
        this.f130r = typefaceM179i0;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m262k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f109b) {
            this.f109b = f;
            float f2 = this.f111c.left;
            Rect rect = this.f113d;
            float fM253f = m253f(f2, rect.left, f, this.f96P);
            RectF rectF = this.f115e;
            rectF.left = fM253f;
            rectF.top = m253f(this.f124l, this.f125m, f, this.f96P);
            rectF.right = m253f(r2.right, rect.right, f, this.f96P);
            rectF.bottom = m253f(r2.bottom, rect.bottom, f, this.f96P);
            this.f128p = m253f(this.f126n, this.f127o, f, this.f96P);
            this.f129q = m253f(this.f124l, this.f125m, f, this.f96P);
            m263l(f);
            C0595a c0595a = AbstractC1015a.f4047b;
            this.f108a0 = 1.0f - m253f(0.0f, 1.0f, 1.0f - f, c0595a);
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            TextInputLayout textInputLayout = this.f107a;
            textInputLayout.postInvalidateOnAnimation();
            this.f110b0 = m253f(1.0f, 0.0f, f, c0595a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f123k;
            ColorStateList colorStateList2 = this.f122j;
            TextPaint textPaint = this.f94N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m252a(m257e(colorStateList2), m257e(this.f123k), f));
            } else {
                textPaint.setColor(m257e(colorStateList));
            }
            float f3 = this.f102V;
            float f4 = this.f103W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m253f(f4, f3, f, c0595a));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f88H = AbstractC1015a.m2461a(0.0f, this.f98R, f);
            this.f89I = AbstractC1015a.m2461a(0.0f, this.f99S, f);
            this.f90J = AbstractC1015a.m2461a(0.0f, this.f100T, f);
            int iM252a = m252a(0, m257e(this.f101U), f);
            this.f91K = iM252a;
            textPaint.setShadowLayer(this.f88H, this.f89I, this.f90J, iM252a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m263l(float f) {
        m255c(f, false);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        this.f107a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: m */
    public final void m264m(Typeface typeface) {
        boolean z2;
        boolean zM261j = m261j(typeface);
        if (this.f135w != typeface) {
            this.f135w = typeface;
            Typeface typefaceM179i0 = AbstractC0016e.m179i0(this.f107a.getContext().getResources().getConfiguration(), typeface);
            this.f134v = typefaceM179i0;
            if (typefaceM179i0 == null) {
                typefaceM179i0 = this.f135w;
            }
            this.f133u = typefaceM179i0;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zM261j || z2) {
            m259h(false);
        }
    }
}
