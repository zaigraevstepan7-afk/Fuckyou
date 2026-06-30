package p015I0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p000A.C0001b;
import p001A0.AbstractC0013b;
import p001A0.AbstractC0015d;
import p003B0.C0019a;
import p009F.AbstractC0074a;
import p011G.InterfaceC0095d;
import p014H0.C0104a;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: I0.h */
/* JADX INFO: loaded from: classes.dex */
public class C0112h extends Drawable implements InterfaceC0095d, InterfaceC0128x {

    /* JADX INFO: renamed from: w */
    public static final Paint f345w;

    /* JADX INFO: renamed from: a */
    public C0111g f346a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0126v[] f347b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0126v[] f348c;

    /* JADX INFO: renamed from: d */
    public final BitSet f349d;

    /* JADX INFO: renamed from: e */
    public boolean f350e;

    /* JADX INFO: renamed from: f */
    public final Matrix f351f;

    /* JADX INFO: renamed from: g */
    public final Path f352g;

    /* JADX INFO: renamed from: h */
    public final Path f353h;

    /* JADX INFO: renamed from: i */
    public final RectF f354i;

    /* JADX INFO: renamed from: j */
    public final RectF f355j;

    /* JADX INFO: renamed from: k */
    public final Region f356k;

    /* JADX INFO: renamed from: l */
    public final Region f357l;

    /* JADX INFO: renamed from: m */
    public C0117m f358m;

    /* JADX INFO: renamed from: n */
    public final Paint f359n;

    /* JADX INFO: renamed from: o */
    public final Paint f360o;

    /* JADX INFO: renamed from: p */
    public final C0104a f361p;

    /* JADX INFO: renamed from: q */
    public final C0001b f362q;

    /* JADX INFO: renamed from: r */
    public final C0119o f363r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f364s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f365t;

    /* JADX INFO: renamed from: u */
    public final RectF f366u;

    /* JADX INFO: renamed from: v */
    public boolean f367v;

    static {
        Paint paint = new Paint(1);
        f345w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0112h() {
        this(new C0117m());
    }

    /* JADX INFO: renamed from: a */
    public void mo269a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final void m470b(RectF rectF, Path path) {
        C0111g c0111g = this.f346a;
        this.f363r.m496a(c0111g.f328a, c0111g.f336i, rectF, this.f362q, path);
        if (this.f346a.f335h != 1.0f) {
            Matrix matrix = this.f351f;
            matrix.reset();
            float f = this.f346a.f335h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f366u, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m471c(int i2) {
        int i3;
        C0111g c0111g = this.f346a;
        float f = c0111g.f340m + 0.0f + c0111g.f339l;
        C0019a c0019a = c0111g.f329b;
        if (c0019a == null || !c0019a.f46a || AbstractC0074a.m356e(i2, 255) != c0019a.f49d) {
            return i2;
        }
        float fMin = (c0019a.f50e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int iM1030I = AbstractC0383m.m1030I(AbstractC0074a.m356e(i2, 255), c0019a.f47b, fMin);
        if (fMin > 0.0f && (i3 = c0019a.f48c) != 0) {
            iM1030I = AbstractC0074a.m354c(AbstractC0074a.m356e(i3, C0019a.f45f), iM1030I);
        }
        return AbstractC0074a.m356e(iM1030I, iAlpha);
    }

    /* JADX INFO: renamed from: d */
    public final void m472d(Canvas canvas) {
        if (this.f349d.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f346a.f343p;
        Path path = this.f352g;
        C0104a c0104a = this.f361p;
        if (i2 != 0) {
            canvas.drawPath(path, c0104a.f307a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            AbstractC0126v abstractC0126v = this.f347b[i3];
            int i4 = this.f346a.f342o;
            Matrix matrix = AbstractC0126v.f424b;
            abstractC0126v.mo498a(matrix, c0104a, i4, canvas);
            this.f348c[i3].mo498a(matrix, c0104a, this.f346a.f342o, canvas);
        }
        if (this.f367v) {
            double d2 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d2)) * ((double) this.f346a.f343p));
            int iCos = (int) (Math.cos(Math.toRadians(d2)) * ((double) this.f346a.f343p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f345w);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint = this.f359n;
        paint.setColorFilter(this.f364s);
        int alpha = paint.getAlpha();
        int i2 = this.f346a.f338k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f360o;
        paint2.setColorFilter(this.f365t);
        paint2.setStrokeWidth(this.f346a.f337j);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f346a.f338k;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f350e;
        Path path = this.f352g;
        if (z2) {
            float f = -(m477i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0117m c0117m = this.f346a.f328a;
            C0116l c0116lM495e = c0117m.m495e();
            InterfaceC0107c c0106b = c0117m.f387e;
            if (!(c0106b instanceof C0114j)) {
                c0106b = new C0106b(f, c0106b);
            }
            c0116lM495e.f375e = c0106b;
            InterfaceC0107c c0106b2 = c0117m.f388f;
            if (!(c0106b2 instanceof C0114j)) {
                c0106b2 = new C0106b(f, c0106b2);
            }
            c0116lM495e.f376f = c0106b2;
            InterfaceC0107c c0106b3 = c0117m.f390h;
            if (!(c0106b3 instanceof C0114j)) {
                c0106b3 = new C0106b(f, c0106b3);
            }
            c0116lM495e.f378h = c0106b3;
            InterfaceC0107c c0106b4 = c0117m.f389g;
            if (!(c0106b4 instanceof C0114j)) {
                c0106b4 = new C0106b(f, c0106b4);
            }
            c0116lM495e.f377g = c0106b4;
            C0117m c0117mM489a = c0116lM495e.m489a();
            this.f358m = c0117mM489a;
            float f2 = this.f346a.f336i;
            RectF rectF = this.f355j;
            rectF.set(m475g());
            float strokeWidth = m477i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f363r.m496a(c0117mM489a, f2, rectF, null, this.f353h);
            m470b(m475g(), path);
            this.f350e = false;
        }
        C0111g c0111g = this.f346a;
        int i4 = c0111g.f341n;
        if (i4 != 1 && c0111g.f342o > 0) {
            if (i4 != 2) {
                int i5 = Build.VERSION.SDK_INT;
                if (!c0111g.f328a.m494d(m475g()) && !path.isConvex() && i5 < 29) {
                    canvas.save();
                    double d2 = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d2)) * ((double) this.f346a.f343p)), (int) (Math.cos(Math.toRadians(d2)) * ((double) this.f346a.f343p)));
                    if (this.f367v) {
                        RectF rectF2 = this.f366u;
                        int iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth < 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f346a.f342o * 2) + ((int) rectF2.width()) + iWidth, (this.f346a.f342o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.f346a.f342o) - iWidth;
                        float f4 = (getBounds().top - this.f346a.f342o) - iHeight;
                        canvas2.translate(-f3, -f4);
                        m472d(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        m472d(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        C0111g c0111g2 = this.f346a;
        Paint.Style style = c0111g2.f344q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m473e(canvas, paint, path, c0111g2.f328a, m475g());
        }
        if (m477i()) {
            mo474f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m473e(Canvas canvas, Paint paint, Path path, C0117m c0117m, RectF rectF) {
        if (!c0117m.m494d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo453a = c0117m.f388f.mo453a(rectF) * this.f346a.f336i;
            canvas.drawRoundRect(rectF, fMo453a, fMo453a, paint);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo474f(Canvas canvas) {
        Paint paint = this.f360o;
        Path path = this.f353h;
        C0117m c0117m = this.f358m;
        RectF rectF = this.f355j;
        rectF.set(m475g());
        float strokeWidth = m477i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m473e(canvas, paint, path, c0117m, rectF);
    }

    /* JADX INFO: renamed from: g */
    public final RectF m475g() {
        RectF rectF = this.f354i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f346a.f338k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f346a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C0111g c0111g = this.f346a;
        if (c0111g.f341n == 2) {
            return;
        }
        if (c0111g.f328a.m494d(m475g())) {
            outline.setRoundRect(getBounds(), m476h() * this.f346a.f336i);
            return;
        }
        RectF rectFM475g = m475g();
        Path path = this.f352g;
        m470b(rectFM475g, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AbstractC0015d.m151a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                AbstractC0013b.m121a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0013b.m121a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f346a.f334g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f356k;
        region.set(bounds);
        RectF rectFM475g = m475g();
        Path path = this.f352g;
        m470b(rectFM475g, path);
        Region region2 = this.f357l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final float m476h() {
        return this.f346a.f328a.f387e.mo453a(m475g());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m477i() {
        Paint.Style style = this.f346a.f344q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f360o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f350e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f346a.f332e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f346a.getClass();
        ColorStateList colorStateList2 = this.f346a.f331d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f346a.f330c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m478j(Context context) {
        this.f346a.f329b = new C0019a(context);
        m487s();
    }

    /* JADX INFO: renamed from: k */
    public final void m479k(float f) {
        C0111g c0111g = this.f346a;
        if (c0111g.f340m != f) {
            c0111g.f340m = f;
            m487s();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m480l(ColorStateList colorStateList) {
        C0111g c0111g = this.f346a;
        if (c0111g.f330c != colorStateList) {
            c0111g.f330c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m481m(float f) {
        C0111g c0111g = this.f346a;
        if (c0111g.f336i != f) {
            c0111g.f336i = f;
            this.f350e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f346a = new C0111g(this.f346a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m482n() {
        this.f361p.m452a(-12303292);
        this.f346a.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public final void m483o() {
        C0111g c0111g = this.f346a;
        if (c0111g.f341n != 2) {
            c0111g.f341n = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f350e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = m485q(iArr) || m486r();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    /* JADX INFO: renamed from: p */
    public final void m484p(ColorStateList colorStateList) {
        C0111g c0111g = this.f346a;
        if (c0111g.f331d != colorStateList) {
            c0111g.f331d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m485q(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f346a.f330c == null || color2 == (colorForState2 = this.f346a.f330c.getColorForState(iArr, (color2 = (paint2 = this.f359n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f346a.f331d == null || color == (colorForState = this.f346a.f331d.getColorForState(iArr, (color = (paint = this.f360o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m486r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f364s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f365t;
        C0111g c0111g = this.f346a;
        ColorStateList colorStateList = c0111g.f332e;
        PorterDuff.Mode mode = c0111g.f333f;
        Paint paint = this.f359n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM471c = m471c(color);
            porterDuffColorFilter = iM471c != color ? new PorterDuffColorFilter(iM471c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m471c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f364s = porterDuffColorFilter;
        this.f346a.getClass();
        this.f365t = null;
        this.f346a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f364s) && Objects.equals(porterDuffColorFilter3, this.f365t)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final void m487s() {
        C0111g c0111g = this.f346a;
        float f = c0111g.f340m + 0.0f;
        c0111g.f342o = (int) Math.ceil(0.75f * f);
        this.f346a.f343p = (int) Math.ceil(f * 0.25f);
        m486r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        C0111g c0111g = this.f346a;
        if (c0111g.f338k != i2) {
            c0111g.f338k = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f346a.getClass();
        super.invalidateSelf();
    }

    @Override // p015I0.InterfaceC0128x
    public final void setShapeAppearanceModel(C0117m c0117m) {
        this.f346a.f328a = c0117m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f346a.f332e = colorStateList;
        m486r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0111g c0111g = this.f346a;
        if (c0111g.f333f != mode) {
            c0111g.f333f = mode;
            m486r();
            super.invalidateSelf();
        }
    }

    public C0112h(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(C0117m.m492b(context, attributeSet, i2, i3).m489a());
    }

    public C0112h(C0117m c0117m) {
        this(new C0111g(c0117m));
    }

    public C0112h(C0111g c0111g) {
        C0119o c0119o;
        this.f347b = new AbstractC0126v[4];
        this.f348c = new AbstractC0126v[4];
        this.f349d = new BitSet(8);
        this.f351f = new Matrix();
        this.f352g = new Path();
        this.f353h = new Path();
        this.f354i = new RectF();
        this.f355j = new RectF();
        this.f356k = new Region();
        this.f357l = new Region();
        Paint paint = new Paint(1);
        this.f359n = paint;
        Paint paint2 = new Paint(1);
        this.f360o = paint2;
        this.f361p = new C0104a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0119o = AbstractC0118n.f395a;
        } else {
            c0119o = new C0119o();
        }
        this.f363r = c0119o;
        this.f366u = new RectF();
        this.f367v = true;
        this.f346a = c0111g;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m486r();
        m485q(getState());
        this.f362q = new C0001b(4, this);
    }
}
