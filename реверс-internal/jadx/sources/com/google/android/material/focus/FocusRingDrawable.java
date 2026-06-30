package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.b;
import defpackage.bn1;
import defpackage.el;
import defpackage.ng1;
import defpackage.s80;
import defpackage.t80;
import defpackage.tb1;
import defpackage.u80;
import defpackage.v20;
import defpackage.zm1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable s = new ColorDrawable(0);
    public static final int[] t = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator u = new OvershootInterpolator(4.0f);
    public static final s80 v = new s80("interpolation");
    public final Paint e;
    public final RectF f;
    public final Rect g;
    public final Path h;
    public final Path i;
    public final Matrix j;
    public final bn1 k;
    public float l;
    public ObjectAnimator m;
    public float n;
    public boolean o;
    public boolean p;
    public boolean q;
    public u80 r;

    public FocusRingDrawable(u80 u80Var, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new RectF();
        this.g = new Rect();
        this.h = new Path();
        this.i = new Path();
        this.j = new Matrix();
        this.k = bn1.b();
        this.l = -1.0f;
        this.n = 1.0f;
        this.p = false;
        this.q = false;
        u80 u80Var2 = new u80(u80Var);
        this.r = u80Var2;
        Drawable.ConstantState constantState = u80Var2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.r.j)) {
            return;
        }
        paint.setStrokeWidth(this.r.j);
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static float d(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.r.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.g;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyTheme(Resources.Theme theme) {
        TypedValue typedValueM;
        super.applyTheme(theme);
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(tb1.e);
        int i = this.r.d;
        boolean z = false;
        if (i != Integer.MIN_VALUE && (typedValueM = el.M(theme, i)) != null) {
            u80 u80Var = this.r;
            u80Var.c = typedValueM.data != 0;
            u80Var.e = true;
        }
        u80 u80Var2 = this.r;
        if (!u80Var2.e) {
            boolean z2 = u80Var2.c;
            TypedValue typedValueM2 = el.M(theme, com.reddit.secondpage.R.attr.focusRingsEnabled);
            if (typedValueM2 == null || typedValueM2.type != 18) {
                z = z2;
            } else if (typedValueM2.data != 0) {
                z = true;
            }
            u80Var2.c = z;
        }
        u80 u80Var3 = this.r;
        if (u80Var3.c) {
            int color = u80Var3.f;
            int i2 = u80Var3.g;
            if (color == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    color = theme.resolveAttribute(i2, typedValue, true) ? typedValue.data : typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            u80Var3.f = color;
            u80 u80Var4 = this.r;
            int color2 = u80Var4.h;
            int i3 = u80Var4.i;
            if (color2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    color2 = theme.resolveAttribute(i3, typedValue2, true) ? typedValue2.data : typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            u80Var4.h = color2;
            u80 u80Var5 = this.r;
            u80Var5.j = d(u80Var5.j, theme, u80Var5.k, typedArrayObtainStyledAttributes, 6, com.reddit.secondpage.R.dimen.mtrl_focus_ring_outer_stroke_width);
            u80 u80Var6 = this.r;
            u80Var6.l = d(u80Var6.l, theme, u80Var6.m, typedArrayObtainStyledAttributes, 3, com.reddit.secondpage.R.dimen.mtrl_focus_ring_inner_stroke_width);
            u80 u80Var7 = this.r;
            u80Var7.n = d(u80Var7.n, theme, u80Var7.o, typedArrayObtainStyledAttributes, 7, 0);
            u80 u80Var8 = this.r;
            u80Var8.p = d(u80Var8.p, theme, u80Var8.q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.r.p)) {
                this.r.p = 0.0f;
            }
            u80 u80Var9 = this.r;
            u80Var9.r = d(u80Var9.r, theme, u80Var9.s, typedArrayObtainStyledAttributes, 2, com.reddit.secondpage.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            u80 u80Var10 = this.r;
            int i4 = u80Var10.u;
            int[] iArr = tb1.h;
            if (i4 != Integer.MIN_VALUE) {
                u80Var10.t = zm1.c(theme.obtainStyledAttributes(i4, iArr), new b(0.0f)).a();
            } else {
                int i5 = u80Var10.v;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = com.reddit.secondpage.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueM3 = el.M(theme, i5);
                if (typedValueM3 != null) {
                    this.r.t = zm1.c(theme.obtainStyledAttributes(typedValueM3.resourceId, iArr), new b(0.0f)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        if (Float.isNaN(this.r.j)) {
            return;
        }
        paint.setStrokeWidth(this.r.j);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.f;
        a(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.h;
        path.transform(matrix, path2);
        float f4 = f2 * this.n;
        Paint paint = this.e;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        u80 u80Var = this.r;
        if (u80Var.c && this.p) {
            float f2 = u80Var.p;
            float f3 = u80Var.j / 2.0f;
            float f4 = this.n;
            float f5 = (f3 * f4) + f2;
            float f6 = ((u80Var.l / 2.0f) * f4) + f2 + u80Var.r;
            Path path = this.i;
            if (path.isEmpty()) {
                path = null;
            }
            Path path2 = path;
            u80 u80Var2 = this.r;
            if (path2 != null) {
                b(canvas, path2, f6, u80Var2.l, u80Var2.h);
                u80 u80Var3 = this.r;
                b(canvas, path2, f5, u80Var3.j, u80Var3.f);
                return;
            }
            if (Float.isNaN(u80Var2.n)) {
                f = this.l;
                if (f < 0.0f) {
                    Drawable drawable = getDrawable();
                    f = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f = this.r.n;
            }
            float fMax = Math.max(0.0f, f - (this.r.j / 2.0f));
            u80 u80Var4 = this.r;
            float f7 = u80Var4.l;
            int i = u80Var4.h;
            RectF rectF = this.f;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.n;
            Paint paint = this.e;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
            u80 u80Var5 = this.r;
            float f9 = u80Var5.j;
            int i2 = u80Var5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.n);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void e(zm1 zm1Var) {
        RectF rectF = this.f;
        a(rectF);
        zm1Var.getClass();
        boolean zE = zm1Var.e(rectF);
        Path path = this.i;
        if (!zE) {
            this.k.a(zm1Var, 1.0f, rectF, null, path);
            this.l = -1.0f;
            return;
        }
        u80 u80Var = this.r;
        float f = ((u80Var.j / 2.0f) * this.n) + u80Var.p;
        rectF.inset(f, f);
        this.l = zm1Var.f.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        u80 u80Var = this.r;
        if (u80Var.a == null) {
            return null;
        }
        u80Var.b = getChangingConfigurations();
        return this.r;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.r.c;
        } catch (NoSuchMethodError unused) {
            return this.r.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = tb1.e;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.r.d = c(typedArrayObtainStyledAttributes, 0);
        if (this.r.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            u80 u80Var = this.r;
            u80Var.c = typedArrayObtainStyledAttributes.getBoolean(0, u80Var.c);
            this.r.e = true;
        }
        this.r.g = c(typedArrayObtainStyledAttributes, 5);
        u80 u80Var2 = this.r;
        if (u80Var2.g == Integer.MIN_VALUE) {
            u80Var2.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.r.i = c(typedArrayObtainStyledAttributes, 1);
        u80 u80Var3 = this.r;
        if (u80Var3.i == Integer.MIN_VALUE) {
            u80Var3.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.r.k = c(typedArrayObtainStyledAttributes, 6);
        u80 u80Var4 = this.r;
        if (u80Var4.k == Integer.MIN_VALUE) {
            u80Var4.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.r.m = c(typedArrayObtainStyledAttributes, 3);
        u80 u80Var5 = this.r;
        if (u80Var5.m == Integer.MIN_VALUE) {
            u80Var5.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.r.m = c(typedArrayObtainStyledAttributes, 3);
        u80 u80Var6 = this.r;
        if (u80Var6.m == Integer.MIN_VALUE) {
            u80Var6.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.r.o = c(typedArrayObtainStyledAttributes, 7);
        u80 u80Var7 = this.r;
        if (u80Var7.o == Integer.MIN_VALUE) {
            u80Var7.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.r.q = c(typedArrayObtainStyledAttributes, 4);
        u80 u80Var8 = this.r;
        if (u80Var8.q == Integer.MIN_VALUE) {
            u80Var8.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.r.s = c(typedArrayObtainStyledAttributes, 2);
        u80 u80Var9 = this.r;
        if (u80Var9.s == Integer.MIN_VALUE) {
            u80Var9.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.r.v = c(typedArrayObtainStyledAttributes, 8);
        this.r.u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.r.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = s;
            setDrawable(colorDrawable);
            this.r.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.r.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.m = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.q && super.mutate() == this) {
            this.r = new u80(this.r);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.r.a = drawable.getConstantState();
            }
            this.q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        zm1 zm1Var;
        super.onBoundsChange(rect);
        u80 u80Var = this.r;
        if (u80Var.c) {
            zm1 zm1Var2 = u80Var.t;
            if (zm1Var2 != null) {
                e(zm1Var2);
                return;
            }
            Drawable drawable = getDrawable();
            int i = 0;
            zm1 zm1Var3 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    ng1 ng1Var = new ng1();
                    ng1 ng1Var2 = new ng1();
                    ng1 ng1Var3 = new ng1();
                    ng1 ng1Var4 = new ng1();
                    v20 v20Var = new v20(i);
                    v20 v20Var2 = new v20(i);
                    v20 v20Var3 = new v20(i);
                    v20 v20Var4 = new v20(i);
                    float radius = outline.getRadius();
                    b bVar = new b(radius);
                    b bVar2 = new b(radius);
                    b bVar3 = new b(radius);
                    b bVar4 = new b(radius);
                    zm1Var = new zm1(1);
                    zm1Var.b = ng1Var;
                    zm1Var.c = ng1Var2;
                    zm1Var.d = ng1Var3;
                    zm1Var.e = ng1Var4;
                    zm1Var.f = bVar;
                    zm1Var.g = bVar2;
                    zm1Var.h = bVar3;
                    zm1Var.i = bVar4;
                    zm1Var.j = v20Var;
                    zm1Var.k = v20Var2;
                    zm1Var.l = v20Var3;
                    zm1Var.m = v20Var4;
                    zm1Var3 = zm1Var;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    ng1 ng1Var5 = new ng1();
                    ng1 ng1Var6 = new ng1();
                    ng1 ng1Var7 = new ng1();
                    ng1 ng1Var8 = new ng1();
                    v20 v20Var5 = new v20(i);
                    v20 v20Var6 = new v20(i);
                    v20 v20Var7 = new v20(i);
                    v20 v20Var8 = new v20(i);
                    b bVar5 = new b(Math.min(cornerRadii[0], cornerRadii[1]));
                    b bVar6 = new b(Math.min(cornerRadii[2], cornerRadii[3]));
                    b bVar7 = new b(Math.min(cornerRadii[4], cornerRadii[5]));
                    b bVar8 = new b(Math.min(cornerRadii[6], cornerRadii[7]));
                    zm1Var = new zm1(1);
                    zm1Var.b = ng1Var5;
                    zm1Var.c = ng1Var6;
                    zm1Var.d = ng1Var7;
                    zm1Var.e = ng1Var8;
                    zm1Var.f = bVar5;
                    zm1Var.g = bVar6;
                    zm1Var.h = bVar7;
                    zm1Var.i = bVar8;
                    zm1Var.j = v20Var5;
                    zm1Var.k = v20Var6;
                    zm1Var.l = v20Var7;
                    zm1Var.m = v20Var8;
                    zm1Var3 = zm1Var;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        ng1 ng1Var9 = new ng1();
                        ng1 ng1Var10 = new ng1();
                        ng1 ng1Var11 = new ng1();
                        ng1 ng1Var12 = new ng1();
                        v20 v20Var9 = new v20(i);
                        v20 v20Var10 = new v20(i);
                        v20 v20Var11 = new v20(i);
                        v20 v20Var12 = new v20(i);
                        b bVar9 = new b(cornerRadius);
                        b bVar10 = new b(cornerRadius);
                        b bVar11 = new b(cornerRadius);
                        b bVar12 = new b(cornerRadius);
                        zm1 zm1Var4 = new zm1(1);
                        zm1Var4.b = ng1Var9;
                        zm1Var4.c = ng1Var10;
                        zm1Var4.d = ng1Var11;
                        zm1Var4.e = ng1Var12;
                        zm1Var4.f = bVar9;
                        zm1Var4.g = bVar10;
                        zm1Var4.h = bVar11;
                        zm1Var4.i = bVar12;
                        zm1Var4.j = v20Var9;
                        zm1Var4.k = v20Var10;
                        zm1Var4.l = v20Var11;
                        zm1Var4.m = v20Var12;
                        zm1Var3 = zm1Var4;
                    }
                }
            }
            if (zm1Var3 != null) {
                e(zm1Var3);
            } else {
                this.l = -1.0f;
                this.i.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        u80 u80Var = this.r;
        if (!u80Var.c) {
            this.p = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(u80Var.x, iArr);
        boolean z = this.p != zStateSetMatches;
        this.p = zStateSetMatches;
        if (z && iArr.length > 0 && !this.o) {
            ObjectAnimator objectAnimator = this.m;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.m = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, v, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(u);
                objectAnimatorOfFloat.addListener(new t80(this));
                this.m = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.n = 1.0f;
            }
        }
        this.o = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.e = new Paint(1);
        this.f = new RectF();
        this.g = new Rect();
        this.h = new Path();
        this.i = new Path();
        this.j = new Matrix();
        this.k = bn1.b();
        this.l = -1.0f;
        this.n = 1.0f;
        this.p = false;
        this.q = false;
        this.r = new u80(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
