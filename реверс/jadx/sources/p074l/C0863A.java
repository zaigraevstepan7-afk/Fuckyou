package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: l.A */
/* JADX INFO: loaded from: classes.dex */
public class C0863A extends ImageView {

    /* JADX INFO: renamed from: a */
    public final C0959p f3494a;

    /* JADX INFO: renamed from: b */
    public final C0983z f3495b;

    /* JADX INFO: renamed from: c */
    public boolean f3496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0863A(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0913Z0.m2349a(context);
        this.f3496c = false;
        AbstractC0911Y0.m2344a(this, getContext());
        C0959p c0959p = new C0959p(this);
        this.f3494a = c0959p;
        c0959p.m2406d(attributeSet, i2);
        C0983z c0983z = new C0983z(this);
        this.f3495b = c0983z;
        c0983z.m2437b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            c0959p.m2403a();
        }
        C0983z c0983z = this.f3495b;
        if (c0983z != null) {
            c0983z.m2436a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            return c0959p.m2404b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            return c0959p.m2405c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0916a1 c0916a1;
        C0983z c0983z = this.f3495b;
        if (c0983z == null || (c0916a1 = c0983z.f3888b) == null) {
            return null;
        }
        return c0916a1.f3699a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0916a1 c0916a1;
        C0983z c0983z = this.f3495b;
        if (c0983z == null || (c0916a1 = c0983z.f3888b) == null) {
            return null;
        }
        return c0916a1.f3700b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f3495b.f3887a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            c0959p.m2407e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            c0959p.m2408f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0983z c0983z = this.f3495b;
        if (c0983z != null) {
            c0983z.m2436a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0983z c0983z = this.f3495b;
        if (c0983z != null && drawable != null && !this.f3496c) {
            c0983z.f3890d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0983z != null) {
            c0983z.m2436a();
            if (this.f3496c) {
                return;
            }
            ImageView imageView = c0983z.f3887a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0983z.f3890d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f3496c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0983z c0983z = this.f3495b;
        if (c0983z != null) {
            ImageView imageView = c0983z.f3887a;
            if (i2 != 0) {
                Drawable drawableM1057w = AbstractC0383m.m1057w(imageView.getContext(), i2);
                if (drawableM1057w != null) {
                    AbstractC0966r0.m2413a(drawableM1057w);
                }
                imageView.setImageDrawable(drawableM1057w);
            } else {
                imageView.setImageDrawable(null);
            }
            c0983z.m2436a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0983z c0983z = this.f3495b;
        if (c0983z != null) {
            c0983z.m2436a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            c0959p.m2410h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0959p c0959p = this.f3494a;
        if (c0959p != null) {
            c0959p.m2411i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0983z c0983z = this.f3495b;
        if (c0983z != null) {
            if (c0983z.f3888b == null) {
                c0983z.f3888b = new C0916a1();
            }
            C0916a1 c0916a1 = c0983z.f3888b;
            c0916a1.f3699a = colorStateList;
            c0916a1.f3702d = true;
            c0983z.m2436a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0983z c0983z = this.f3495b;
        if (c0983z != null) {
            if (c0983z.f3888b == null) {
                c0983z.f3888b = new C0916a1();
            }
            C0916a1 c0916a1 = c0983z.f3888b;
            c0916a1.f3700b = mode;
            c0916a1.f3701c = true;
            c0983z.m2436a();
        }
    }
}
