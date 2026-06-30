package p075l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0016e;
import p007E.AbstractC0056b;
import p007E.AbstractC0057c;
import p011G.AbstractC0092a;
import p084q.C1027f;

/* JADX INFO: renamed from: l0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1001q extends AbstractC0992h {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f3973j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public C0999o f3974b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f3975c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f3976d;

    /* JADX INFO: renamed from: e */
    public boolean f3977e;

    /* JADX INFO: renamed from: f */
    public boolean f3978f;

    /* JADX INFO: renamed from: g */
    public final float[] f3979g;

    /* JADX INFO: renamed from: h */
    public final Matrix f3980h;

    /* JADX INFO: renamed from: i */
    public final Rect f3981i;

    public C1001q() {
        this.f3978f = true;
        this.f3979g = new float[9];
        this.f3980h = new Matrix();
        this.f3981i = new Rect();
        C0999o c0999o = new C0999o();
        c0999o.f3962c = null;
        c0999o.f3963d = f3973j;
        c0999o.f3961b = new C0998n();
        this.f3974b = c0999o;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m2446a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3918a;
        if (drawable == null) {
            return false;
        }
        AbstractC0092a.m423b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f3981i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3976d;
        if (colorFilter == null) {
            colorFilter = this.f3975c;
        }
        Matrix matrix = this.f3980h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3979g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0016e.m167S(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0999o c0999o = this.f3974b;
        Bitmap bitmap = c0999o.f3965f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0999o.f3965f.getHeight()) {
            c0999o.f3965f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0999o.f3970k = true;
        }
        if (this.f3978f) {
            C0999o c0999o2 = this.f3974b;
            if (c0999o2.f3970k || c0999o2.f3966g != c0999o2.f3962c || c0999o2.f3967h != c0999o2.f3963d || c0999o2.f3969j != c0999o2.f3964e || c0999o2.f3968i != c0999o2.f3961b.getRootAlpha()) {
                C0999o c0999o3 = this.f3974b;
                c0999o3.f3965f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0999o3.f3965f);
                C0998n c0998n = c0999o3.f3961b;
                c0998n.m2445a(c0998n.f3951g, C0998n.f3944p, canvas2, iMin, iMin2);
                C0999o c0999o4 = this.f3974b;
                c0999o4.f3966g = c0999o4.f3962c;
                c0999o4.f3967h = c0999o4.f3963d;
                c0999o4.f3968i = c0999o4.f3961b.getRootAlpha();
                c0999o4.f3969j = c0999o4.f3964e;
                c0999o4.f3970k = false;
            }
        } else {
            C0999o c0999o5 = this.f3974b;
            c0999o5.f3965f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0999o5.f3965f);
            C0998n c0998n2 = c0999o5.f3961b;
            c0998n2.m2445a(c0998n2.f3951g, C0998n.f3944p, canvas3, iMin, iMin2);
        }
        C0999o c0999o6 = this.f3974b;
        if (c0999o6.f3961b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0999o6.f3971l == null) {
                Paint paint2 = new Paint();
                c0999o6.f3971l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0999o6.f3971l.setAlpha(c0999o6.f3961b.getRootAlpha());
            c0999o6.f3971l.setColorFilter(colorFilter);
            paint = c0999o6.f3971l;
        }
        canvas.drawBitmap(c0999o6.f3965f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getAlpha() : this.f3974b.f3961b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3974b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3918a;
        return drawable != null ? AbstractC0092a.m424c(drawable) : this.f3976d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3918a != null && Build.VERSION.SDK_INT >= 24) {
            return new C1000p(this.f3918a.getConstantState());
        }
        this.f3974b.f3960a = getChangingConfigurations();
        return this.f3974b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3974b.f3961b.f3953i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3974b.f3961b.f3952h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3974b.f3964e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0999o c0999o = this.f3974b;
        if (c0999o == null) {
            return false;
        }
        C0998n c0998n = c0999o.f3961b;
        if (c0998n.f3958n == null) {
            c0998n.f3958n = Boolean.valueOf(c0998n.f3951g.mo2442a());
        }
        if (c0998n.f3958n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f3974b.f3962c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3977e && super.mutate() == this) {
            C0999o c0999o = this.f3974b;
            C0999o c0999o2 = new C0999o();
            c0999o2.f3962c = null;
            c0999o2.f3963d = f3973j;
            if (c0999o != null) {
                c0999o2.f3960a = c0999o.f3960a;
                C0998n c0998n = new C0998n(c0999o.f3961b);
                c0999o2.f3961b = c0998n;
                if (c0999o.f3961b.f3949e != null) {
                    c0998n.f3949e = new Paint(c0999o.f3961b.f3949e);
                }
                if (c0999o.f3961b.f3948d != null) {
                    c0999o2.f3961b.f3948d = new Paint(c0999o.f3961b.f3948d);
                }
                c0999o2.f3962c = c0999o.f3962c;
                c0999o2.f3963d = c0999o.f3963d;
                c0999o2.f3964e = c0999o.f3964e;
            }
            this.f3974b = c0999o2;
            this.f3977e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0999o c0999o = this.f3974b;
        ColorStateList colorStateList = c0999o.f3962c;
        if (colorStateList == null || (mode = c0999o.f3963d) == null) {
            z2 = false;
        } else {
            this.f3975c = m2446a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0998n c0998n = c0999o.f3961b;
        if (c0998n.f3958n == null) {
            c0998n.f3958n = Boolean.valueOf(c0998n.f3951g.mo2442a());
        }
        if (c0998n.f3958n.booleanValue()) {
            boolean zMo2443b = c0999o.f3961b.f3951g.mo2443b(iArr);
            c0999o.f3970k |= zMo2443b;
            if (zMo2443b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f3974b.f3961b.getRootAlpha() != i2) {
            this.f3974b.f3961b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3974b.f3964e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3976d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0016e.m203y0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m429h(drawable, colorStateList);
            return;
        }
        C0999o c0999o = this.f3974b;
        if (c0999o.f3962c != colorStateList) {
            c0999o.f3962c = colorStateList;
            this.f3975c = m2446a(colorStateList, c0999o.f3963d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m430i(drawable, mode);
            return;
        }
        C0999o c0999o = this.f3974b;
        if (c0999o.f3963d != mode) {
            c0999o.f3963d = mode;
            this.f3975c = m2446a(c0999o.f3962c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3918a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0998n c0998n;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f3918a;
        if (drawable != null) {
            AbstractC0092a.m425d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0999o c0999o = this.f3974b;
        c0999o.f3961b = new C0998n();
        TypedArray typedArrayM330g = AbstractC0056b.m330g(resources, theme, attributeSet, AbstractC0985a.f3893a);
        C0999o c0999o2 = this.f3974b;
        C0998n c0998n2 = c0999o2.f3961b;
        int i3 = !AbstractC0056b.m327d(xmlPullParser, "tintMode") ? -1 : typedArrayM330g.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0999o2.f3963d = mode;
        ColorStateList colorStateListM339a = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM330g.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i4 >= 28 && i4 <= 31) {
                colorStateListM339a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM330g.getResources();
                int resourceId = typedArrayM330g.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0057c.f193a;
                try {
                    colorStateListM339a = AbstractC0057c.m339a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM339a;
        if (colorStateList != null) {
            c0999o2.f3962c = colorStateList;
        }
        boolean z2 = c0999o2.f3964e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = typedArrayM330g.getBoolean(5, z2);
        }
        c0999o2.f3964e = z2;
        float f = c0998n2.f3954j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM330g.getFloat(7, f);
        }
        c0998n2.f3954j = f;
        float f2 = c0998n2.f3955k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM330g.getFloat(8, f2);
        }
        c0998n2.f3955k = f2;
        if (c0998n2.f3954j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM330g.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c0998n2.f3952h = typedArrayM330g.getDimension(3, c0998n2.f3952h);
            float dimension = typedArrayM330g.getDimension(2, c0998n2.f3953i);
            c0998n2.f3953i = dimension;
            if (c0998n2.f3952h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM330g.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0998n2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM330g.getFloat(4, alpha);
                }
                c0998n2.setAlpha(alpha);
                String string = typedArrayM330g.getString(0);
                if (string != null) {
                    c0998n2.f3957m = string;
                    c0998n2.f3959o.put(string, c0998n2);
                }
                typedArrayM330g.recycle();
                c0999o.f3960a = getChangingConfigurations();
                c0999o.f3970k = true;
                C0999o c0999o3 = this.f3974b;
                C0998n c0998n3 = c0999o3.f3961b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0998n3.f3951g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != 3); i5 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0995k c0995k = (C0995k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i2 = depth;
                        C1027f c1027f = c0998n3.f3959o;
                        if (zEquals) {
                            C0994j c0994j = new C0994j();
                            c0994j.f3920e = 0.0f;
                            c0994j.f3922g = 1.0f;
                            c0994j.f3923h = 1.0f;
                            c0998n = c0998n3;
                            c0994j.f3924i = 0.0f;
                            c0994j.f3925j = 1.0f;
                            c0994j.f3926k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0994j.f3927l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c0994j.f3928m = join2;
                            c0994j.f3929n = 4.0f;
                            TypedArray typedArrayM330g2 = AbstractC0056b.m330g(resources, theme, attributeSet, AbstractC0985a.f3895c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM330g2.getString(0);
                                if (string2 != null) {
                                    c0994j.f3942b = string2;
                                }
                                String string3 = typedArrayM330g2.getString(2);
                                if (string3 != null) {
                                    c0994j.f3941a = AbstractC0016e.m202y(string3);
                                }
                                c0994j.f3921f = AbstractC0056b.m325b(typedArrayM330g2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c0994j.f3923h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM330g2.getFloat(12, f3);
                                }
                                c0994j.f3923h = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM330g2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c0994j.f3927l;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c0994j.f3927l = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM330g2.getInt(9, -1) : -1;
                                Paint.Join join3 = c0994j.f3928m;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c0994j.f3928m = join;
                                float f4 = c0994j.f3929n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM330g2.getFloat(10, f4);
                                }
                                c0994j.f3929n = f4;
                                c0994j.f3919d = AbstractC0056b.m325b(typedArrayM330g2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c0994j.f3922g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM330g2.getFloat(11, f5);
                                }
                                c0994j.f3922g = f5;
                                float f6 = c0994j.f3920e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM330g2.getFloat(4, f6);
                                }
                                c0994j.f3920e = f6;
                                float f7 = c0994j.f3925j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM330g2.getFloat(6, f7);
                                }
                                c0994j.f3925j = f7;
                                float f8 = c0994j.f3926k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM330g2.getFloat(7, f8);
                                }
                                c0994j.f3926k = f8;
                                float f9 = c0994j.f3924i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM330g2.getFloat(5, f9);
                                }
                                c0994j.f3924i = f9;
                                int i8 = c0994j.f3943c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM330g2.getInt(13, i8);
                                }
                                c0994j.f3943c = i8;
                            }
                            typedArrayM330g2.recycle();
                            c0995k.f3931b.add(c0994j);
                            if (c0994j.getPathName() != null) {
                                c1027f.put(c0994j.getPathName(), c0994j);
                            }
                            c0999o3.f3960a = c0999o3.f3960a;
                            z3 = false;
                        } else {
                            c0998n = c0998n3;
                            if ("clip-path".equals(name)) {
                                C0993i c0993i = new C0993i();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM330g3 = AbstractC0056b.m330g(resources, theme, attributeSet, AbstractC0985a.f3896d);
                                    String string4 = typedArrayM330g3.getString(0);
                                    if (string4 != null) {
                                        c0993i.f3942b = string4;
                                    }
                                    String string5 = typedArrayM330g3.getString(1);
                                    if (string5 != null) {
                                        c0993i.f3941a = AbstractC0016e.m202y(string5);
                                    }
                                    c0993i.f3943c = !AbstractC0056b.m327d(xmlPullParser, "fillType") ? 0 : typedArrayM330g3.getInt(2, 0);
                                    typedArrayM330g3.recycle();
                                }
                                c0995k.f3931b.add(c0993i);
                                if (c0993i.getPathName() != null) {
                                    c1027f.put(c0993i.getPathName(), c0993i);
                                }
                                c0999o3.f3960a = c0999o3.f3960a;
                            } else if ("group".equals(name)) {
                                C0995k c0995k2 = new C0995k();
                                TypedArray typedArrayM330g4 = AbstractC0056b.m330g(resources, theme, attributeSet, AbstractC0985a.f3894b);
                                float f10 = c0995k2.f3932c;
                                if (AbstractC0056b.m327d(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM330g4.getFloat(5, f10);
                                }
                                c0995k2.f3932c = f10;
                                c0995k2.f3933d = typedArrayM330g4.getFloat(1, c0995k2.f3933d);
                                c0995k2.f3934e = typedArrayM330g4.getFloat(2, c0995k2.f3934e);
                                float f11 = c0995k2.f3935f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM330g4.getFloat(3, f11);
                                }
                                c0995k2.f3935f = f11;
                                float f12 = c0995k2.f3936g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM330g4.getFloat(4, f12);
                                }
                                c0995k2.f3936g = f12;
                                float f13 = c0995k2.f3937h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM330g4.getFloat(6, f13);
                                }
                                c0995k2.f3937h = f13;
                                float f14 = c0995k2.f3938i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM330g4.getFloat(7, f14);
                                }
                                c0995k2.f3938i = f14;
                                String string6 = typedArrayM330g4.getString(0);
                                if (string6 != null) {
                                    c0995k2.f3940k = string6;
                                }
                                c0995k2.m2444c();
                                typedArrayM330g4.recycle();
                                c0995k.f3931b.add(c0995k2);
                                arrayDeque.push(c0995k2);
                                if (c0995k2.getGroupName() != null) {
                                    c1027f.put(c0995k2.getGroupName(), c0995k2);
                                }
                                c0999o3.f3960a = c0999o3.f3960a;
                            }
                        }
                    } else {
                        c0998n = c0998n3;
                        i2 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    c0998n3 = c0998n;
                    depth = i2;
                }
                if (!z3) {
                    this.f3975c = m2446a(c0999o.f3962c, c0999o.f3963d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM330g.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM330g.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1001q(C0999o c0999o) {
        this.f3978f = true;
        this.f3979g = new float[9];
        this.f3980h = new Matrix();
        this.f3981i = new Rect();
        this.f3974b = c0999o;
        this.f3975c = m2446a(c0999o.f3962c, c0999o.f3963d);
    }
}
