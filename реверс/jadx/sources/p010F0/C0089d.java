package p010F0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p001A0.AbstractC0016e;
import p007E.AbstractC0071q;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: F0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0089d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f272a;

    /* JADX INFO: renamed from: b */
    public final String f273b;

    /* JADX INFO: renamed from: c */
    public final int f274c;

    /* JADX INFO: renamed from: d */
    public final int f275d;

    /* JADX INFO: renamed from: e */
    public final float f276e;

    /* JADX INFO: renamed from: f */
    public final float f277f;

    /* JADX INFO: renamed from: g */
    public final float f278g;

    /* JADX INFO: renamed from: h */
    public final boolean f279h;

    /* JADX INFO: renamed from: i */
    public final float f280i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f281j;

    /* JADX INFO: renamed from: k */
    public float f282k;

    /* JADX INFO: renamed from: l */
    public final int f283l;

    /* JADX INFO: renamed from: m */
    public boolean f284m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f285n;

    public C0089d(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC1013a.f4014D);
        this.f282k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f281j = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 3);
        AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 5);
        this.f274c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f275d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f283l = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f273b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f272a = AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 6);
        this.f276e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f277f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f278g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, AbstractC1013a.f4039u);
        this.f279h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f280i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m380a() {
        String str;
        Typeface typeface = this.f285n;
        int i2 = this.f274c;
        if (typeface == null && (str = this.f273b) != null) {
            this.f285n = Typeface.create(str, i2);
        }
        if (this.f285n == null) {
            int i3 = this.f275d;
            if (i3 == 1) {
                this.f285n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f285n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f285n = Typeface.DEFAULT;
            } else {
                this.f285n = Typeface.MONOSPACE;
            }
            this.f285n = Typeface.create(this.f285n, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m381b(Context context) {
        if (this.f284m) {
            return this.f285n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM350b = AbstractC0071q.m350b(context, this.f283l);
                this.f285n = typefaceM350b;
                if (typefaceM350b != null) {
                    this.f285n = Typeface.create(typefaceM350b, this.f274c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f273b, e2);
            }
        }
        m380a();
        this.f284m = true;
        return this.f285n;
    }

    /* JADX INFO: renamed from: c */
    public final void m382c(Context context, AbstractC0016e abstractC0016e) {
        if (m383d(context)) {
            m381b(context);
        } else {
            m380a();
        }
        int i2 = this.f283l;
        if (i2 == 0) {
            this.f284m = true;
        }
        if (this.f284m) {
            abstractC0016e.mo223l0(this.f285n, true);
            return;
        }
        try {
            C0087b c0087b = new C0087b(this, abstractC0016e);
            ThreadLocal threadLocal = AbstractC0071q.f219a;
            if (context.isRestricted()) {
                c0087b.m336a(-4);
            } else {
                AbstractC0071q.m351c(context, i2, new TypedValue(), 0, c0087b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f284m = true;
            abstractC0016e.mo222k0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f273b, e2);
            this.f284m = true;
            abstractC0016e.mo222k0(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m383d(Context context) {
        Typeface typefaceM351c = null;
        int i2 = this.f283l;
        if (i2 != 0) {
            ThreadLocal threadLocal = AbstractC0071q.f219a;
            if (!context.isRestricted()) {
                typefaceM351c = AbstractC0071q.m351c(context, i2, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM351c != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m384e(Context context, TextPaint textPaint, AbstractC0016e abstractC0016e) {
        m385f(context, textPaint, abstractC0016e);
        ColorStateList colorStateList = this.f281j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f272a;
        textPaint.setShadowLayer(this.f278g, this.f276e, this.f277f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m385f(Context context, TextPaint textPaint, AbstractC0016e abstractC0016e) {
        if (m383d(context)) {
            m386g(context, textPaint, m381b(context));
            return;
        }
        m380a();
        m386g(context, textPaint, this.f285n);
        m382c(context, new C0088c(this, context, textPaint, abstractC0016e));
    }

    /* JADX INFO: renamed from: g */
    public final void m386g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM179i0 = AbstractC0016e.m179i0(context.getResources().getConfiguration(), typeface);
        if (typefaceM179i0 != null) {
            typeface = typefaceM179i0;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f274c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f282k);
        if (this.f279h) {
            textPaint.setLetterSpacing(this.f280i);
        }
    }
}
