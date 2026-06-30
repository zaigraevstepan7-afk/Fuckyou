package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p036T.AbstractC0376f;
import p036T.AbstractC0383m;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0983z {

    /* JADX INFO: renamed from: a */
    public final ImageView f3887a;

    /* JADX INFO: renamed from: b */
    public C0916a1 f3888b;

    /* JADX INFO: renamed from: c */
    public C0916a1 f3889c;

    /* JADX INFO: renamed from: d */
    public int f3890d = 0;

    public C0983z(ImageView imageView) {
        this.f3887a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m2436a() {
        ImageView imageView = this.f3887a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0966r0.m2413a(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 && i2 == 21) {
                if (this.f3889c == null) {
                    this.f3889c = new C0916a1();
                }
                C0916a1 c0916a1 = this.f3889c;
                c0916a1.f3699a = null;
                c0916a1.f3702d = false;
                c0916a1.f3700b = null;
                c0916a1.f3701c = false;
                ColorStateList colorStateListM1012a = AbstractC0376f.m1012a(imageView);
                if (colorStateListM1012a != null) {
                    c0916a1.f3702d = true;
                    c0916a1.f3699a = colorStateListM1012a;
                }
                PorterDuff.Mode modeM1013b = AbstractC0376f.m1013b(imageView);
                if (modeM1013b != null) {
                    c0916a1.f3701c = true;
                    c0916a1.f3700b = modeM1013b;
                }
                if (c0916a1.f3702d || c0916a1.f3701c) {
                    C0973u.m2426e(drawable, c0916a1, imageView.getDrawableState());
                    return;
                }
            }
            C0916a1 c0916a12 = this.f3888b;
            if (c0916a12 != null) {
                C0973u.m2426e(drawable, c0916a12, imageView.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2437b(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = this.f3887a;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0641a.f2485f;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, i2);
        AbstractC0240S.m784o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0270lM838m.f837b, i2);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = AbstractC0383m.m1057w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC0966r0.m2413a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListM844g = c0270lM838m.m844g(2);
                int i3 = Build.VERSION.SDK_INT;
                AbstractC0376f.m1014c(imageView, colorStateListM844g);
                if (i3 == 21 && (drawable2 = imageView.getDrawable()) != null && AbstractC0376f.m1012a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeM2415c = AbstractC0966r0.m2415c(typedArray.getInt(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                AbstractC0376f.m1015d(imageView, modeM2415c);
                if (i4 == 21 && (drawable = imageView.getDrawable()) != null && AbstractC0376f.m1012a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            c0270lM838m.m851o();
        } catch (Throwable th) {
            c0270lM838m.m851o();
            throw th;
        }
    }
}
