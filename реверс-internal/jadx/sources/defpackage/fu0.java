package defpackage;

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
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends Drawable {
    public static final Paint y;
    public static final wr[] z;
    public final du0 a;
    public eu0 b;
    public final mn1[] c;
    public final mn1[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final wm1 q;
    public final du0 r;
    public final bn1 s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public final RectF v;
    public final boolean w;
    public zm1 x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        z = new wr[4];
        int i = 0;
        while (true) {
            wr[] wrVarArr = z;
            if (i >= wrVarArr.length) {
                return;
            }
            wrVarArr[i] = new wr(22);
            i++;
        }
    }

    public fu0(eu0 eu0Var) {
        this.a = new du0(this);
        this.c = new mn1[4];
        this.d = new mn1[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new wm1();
        this.s = bn1.b();
        this.v = new RectF();
        this.w = true;
        this.b = eu0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        j();
        i(getState());
        this.r = new du0(this);
    }

    public final void a(RectF rectF, Path path) {
        zm1 zm1Var = this.b.a;
        zm1Var.getClass();
        this.s.a(zm1Var, this.b.h, rectF, this.r, path);
        if (this.b.g != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.g;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.v, true);
    }

    public final float b(RectF rectF, zm1 zm1Var) {
        if (zm1Var.e(rectF)) {
            return zm1Var.f.a(rectF);
        }
        return -1.0f;
    }

    public final int c(int i) {
        this.b.getClass();
        eu0 eu0Var = this.b;
        eu0Var.getClass();
        a30 a30Var = eu0Var.b;
        if (a30Var == null || !a30Var.a || ym.d(i, 255) != a30Var.c) {
            return i;
        }
        return ym.d(ym.b(ym.d(a30Var.b, Math.round(Color.alpha(r3) * 0.0f)), ym.d(i, 255)), Color.alpha(i));
    }

    public final void d(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w("fu0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.k;
        Path path = this.i;
        wm1 wm1Var = this.q;
        if (i != 0) {
            canvas.drawPath(path, wm1Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mn1 mn1Var = this.c[i2];
            int i3 = this.b.j;
            Matrix matrix = mn1.b;
            mn1Var.a(matrix, wm1Var, i3, canvas);
            this.d[i2].a(matrix, wm1Var, this.b.j, canvas);
        }
        if (this.w) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.k));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.k));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, y);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z2;
        float f;
        float fB;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint = this.o;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.b.i;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint2 = this.p;
        paint2.setColorFilter(porterDuffColorFilter2);
        this.b.getClass();
        paint2.setStrokeWidth(0.0f);
        int alpha2 = paint2.getAlpha();
        int i2 = this.b.i;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        if (!f()) {
            zm1 zm1Var = this.b.a;
            getState();
            zm1Var.getClass();
            z2 = !zm1Var.e(e());
        }
        Paint.Style style = this.b.l;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z3 = this.f;
            Path path = this.i;
            if (z3) {
                if (z2) {
                    a(e(), path);
                }
                this.f = false;
            }
            if (f()) {
                canvas.save();
                canvas.translate((int) (((double) this.b.k) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.k)));
                if (this.w) {
                    Rect bounds = getBounds();
                    RectF rectF = this.v;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        StringBuilder sbN = s91.n("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", iWidth, " extra height: ", iHeight, " path bounds: ");
                        sbN.append(rectF);
                        throw new IllegalStateException(sbN.toString());
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.b.j * 2) + ((int) rectF.width()) + iWidth, (this.b.j * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    f = 0.0f;
                    int i4 = this.b.j;
                    float f2 = (i3 - i4) - iWidth;
                    float f3 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f2, -f3);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                    zm1 zm1Var2 = this.b.a;
                    zm1Var2.getClass();
                    RectF rectFE = e();
                    fB = b(rectFE, zm1Var2);
                    if (fB >= f) {
                    }
                } else {
                    d(canvas);
                    canvas.restore();
                    f = 0.0f;
                    zm1 zm1Var22 = this.b.a;
                    zm1Var22.getClass();
                    RectF rectFE2 = e();
                    fB = b(rectFE2, zm1Var22);
                    if (fB >= f) {
                    }
                }
            } else {
                f = 0.0f;
                zm1 zm1Var222 = this.b.a;
                zm1Var222.getClass();
                RectF rectFE22 = e();
                fB = b(rectFE22, zm1Var222);
                if (fB >= f) {
                    float f4 = fB * this.b.h;
                    canvas.drawRoundRect(rectFE22, f4, f4, paint);
                } else {
                    canvas.drawPath(path, paint);
                }
            }
        } else {
            f = 0.0f;
        }
        if (g()) {
            boolean z4 = this.g;
            RectF rectF2 = this.l;
            Path path2 = this.j;
            if (z4) {
                zm1 zm1Var3 = this.b.a;
                zm1Var3.getClass();
                zm1 zm1VarF = zm1Var3.f();
                gt gtVar = zm1Var3.f;
                du0 du0Var = this.a;
                zm1VarF.f = du0Var.a(gtVar);
                zm1VarF.g = du0Var.a(zm1Var3.g);
                zm1VarF.i = du0Var.a(zm1Var3.i);
                zm1VarF.h = du0Var.a(zm1Var3.h);
                zm1 zm1VarA = zm1VarF.a();
                this.x = zm1VarA;
                if (z2) {
                    float f5 = this.b.h;
                    rectF2.set(e());
                    float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : f;
                    rectF2.inset(strokeWidth, strokeWidth);
                    this.s.a(zm1VarA, f5, rectF2, null, path2);
                }
                this.g = false;
            }
            zm1 zm1Var4 = this.x;
            rectF2.set(e());
            float strokeWidth2 = g() ? paint2.getStrokeWidth() / 2.0f : f;
            rectF2.inset(strokeWidth2, strokeWidth2);
            float fB2 = b(rectF2, zm1Var4);
            if (fB2 >= f) {
                float f6 = fB2 * this.b.h;
                canvas.drawRoundRect(rectF2, f6, f6, paint2);
            } else {
                canvas.drawPath(path2, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean f() {
        eu0 eu0Var = this.b;
        eu0Var.getClass();
        if (eu0Var.j <= 0) {
            return false;
        }
        zm1 zm1Var = this.b.a;
        getState();
        zm1Var.getClass();
        return (zm1Var.e(e()) || this.i.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public final boolean g() {
        Paint.Style style = this.b.l;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.b.getClass();
        RectF rectFE = e();
        if (rectFE.isEmpty()) {
            return;
        }
        zm1 zm1Var = this.b.a;
        zm1Var.getClass();
        float fB = b(rectFE, zm1Var);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.b.h);
            return;
        }
        boolean z2 = this.f;
        Path path = this.i;
        if (z2) {
            a(rectFE, path);
            this.f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            w10.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                v10.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            v10.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.f;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF rectFE = e();
        Path path = this.i;
        a(rectFE, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.b.b = new a30(context);
        this.b.getClass();
        this.b.j = (int) Math.ceil(0.0d);
        this.b.k = (int) Math.ceil(0.0d);
        j();
        if (!f()) {
            zm1 zm1Var = this.b.a;
            getState();
            zm1Var.getClass();
            if (zm1Var.e(e())) {
                super.invalidateSelf();
                return;
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        if (this.b.c == null || color == (colorForState = this.b.c.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            z2 = false;
        } else {
            paint.setColor(colorForState);
            z2 = true;
        }
        this.b.getClass();
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.d;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.c;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        this.b.a.getClass();
        return false;
    }

    public final boolean j() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        eu0 eu0Var = this.b;
        ColorStateList colorStateList = eu0Var.d;
        PorterDuff.Mode mode = eu0Var.e;
        if (colorStateList == null || mode == null) {
            int color = this.o.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        eu0 eu0Var = this.b;
        eu0 eu0Var2 = new eu0();
        eu0Var2.c = null;
        eu0Var2.d = null;
        eu0Var2.e = PorterDuff.Mode.SRC_IN;
        eu0Var2.f = null;
        eu0Var2.g = 1.0f;
        eu0Var2.h = 1.0f;
        eu0Var2.i = 255;
        eu0Var2.j = 0;
        eu0Var2.k = 0;
        eu0Var2.l = Paint.Style.FILL_AND_STROKE;
        eu0Var2.a = eu0Var.a;
        eu0Var2.b = eu0Var.b;
        eu0Var2.c = eu0Var.c;
        eu0Var2.e = eu0Var.e;
        eu0Var2.d = eu0Var.d;
        eu0Var2.i = eu0Var.i;
        eu0Var2.g = eu0Var.g;
        eu0Var2.k = eu0Var.k;
        eu0Var2.h = eu0Var.h;
        eu0Var2.j = eu0Var.j;
        eu0Var2.l = eu0Var.l;
        Rect rect = eu0Var.f;
        if (rect != null) {
            eu0Var2.f = new Rect(rect);
        }
        this.b = eu0Var2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        this.b.a.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        this.b.a.getClass();
        boolean z2 = i(iArr) || j();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        eu0 eu0Var = this.b;
        if (eu0Var.i != i) {
            eu0Var.i = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.d = colorStateList;
        j();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        eu0 eu0Var = this.b;
        if (eu0Var.e != mode) {
            eu0Var.e = mode;
            j();
            super.invalidateSelf();
        }
    }

    public fu0(zm1 zm1Var) {
        eu0 eu0Var = new eu0();
        eu0Var.c = null;
        eu0Var.d = null;
        eu0Var.e = PorterDuff.Mode.SRC_IN;
        eu0Var.f = null;
        eu0Var.g = 1.0f;
        eu0Var.h = 1.0f;
        eu0Var.i = 255;
        eu0Var.j = 0;
        eu0Var.k = 0;
        eu0Var.l = Paint.Style.FILL_AND_STROKE;
        eu0Var.a = zm1Var;
        eu0Var.b = null;
        this(eu0Var);
    }
}
