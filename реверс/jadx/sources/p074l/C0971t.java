package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p009F.AbstractC0074a;

/* JADX INFO: renamed from: l.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0971t {

    /* JADX INFO: renamed from: a */
    public final int[] f3848a = {R.drawable.resc, R.drawable.resc, R.drawable.resc};

    /* JADX INFO: renamed from: b */
    public final int[] f3849b = {R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc};

    /* JADX INFO: renamed from: c */
    public final int[] f3850c = {R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc};

    /* JADX INFO: renamed from: d */
    public final int[] f3851d = {R.drawable.resc, R.drawable.resc, R.drawable.resc};

    /* JADX INFO: renamed from: e */
    public final int[] f3852e = {R.drawable.resc, R.drawable.resc};

    /* JADX INFO: renamed from: f */
    public final int[] f3853f = {R.drawable.resc, R.drawable.resc, R.drawable.resc, R.drawable.resc};

    /* JADX INFO: renamed from: a */
    public static boolean m2418a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2419b(Context context, int i2) {
        int iM2346c = AbstractC0911Y0.m2346c(context, R.attr.resc);
        return new ColorStateList(new int[][]{AbstractC0911Y0.f3676b, AbstractC0911Y0.f3678d, AbstractC0911Y0.f3677c, AbstractC0911Y0.f3680f}, new int[]{AbstractC0911Y0.m2345b(context, R.attr.resc), AbstractC0074a.m354c(iM2346c, i2), AbstractC0074a.m354c(iM2346c, i2), i2});
    }

    /* JADX INFO: renamed from: c */
    public static LayerDrawable m2420c(C0899S0 c0899s0, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableM2323f = c0899s0.m2323f(context, R.drawable.resc);
        Drawable drawableM2323f2 = c0899s0.m2323f(context, R.drawable.resc);
        if ((drawableM2323f instanceof BitmapDrawable) && drawableM2323f.getIntrinsicWidth() == dimensionPixelSize && drawableM2323f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM2323f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM2323f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2323f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM2323f2 instanceof BitmapDrawable) && drawableM2323f2.getIntrinsicWidth() == dimensionPixelSize && drawableM2323f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM2323f2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM2323f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2323f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: e */
    public static void m2421e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0973u.f3858b;
        }
        drawableMutate.setColorFilter(C0973u.m2424c(i2, mode));
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m2422d(Context context, int i2) {
        if (i2 == R.drawable.resc) {
            return AbstractC0016e.m160I(context, R.color.resc);
        }
        if (i2 == R.drawable.resc) {
            return AbstractC0016e.m160I(context, R.color.resc);
        }
        if (i2 != R.drawable.resc) {
            if (i2 == R.drawable.resc) {
                return m2419b(context, AbstractC0911Y0.m2346c(context, R.attr.resc));
            }
            if (i2 == R.drawable.resc) {
                return m2419b(context, 0);
            }
            if (i2 == R.drawable.resc) {
                return m2419b(context, AbstractC0911Y0.m2346c(context, R.attr.resc));
            }
            if (i2 == R.drawable.resc || i2 == R.drawable.resc) {
                return AbstractC0016e.m160I(context, R.color.resc);
            }
            if (m2418a(this.f3849b, i2)) {
                return AbstractC0911Y0.m2347d(context, R.attr.resc);
            }
            if (m2418a(this.f3852e, i2)) {
                return AbstractC0016e.m160I(context, R.color.resc);
            }
            if (m2418a(this.f3853f, i2)) {
                return AbstractC0016e.m160I(context, R.color.resc);
            }
            if (i2 == R.drawable.resc) {
                return AbstractC0016e.m160I(context, R.color.resc);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM2347d = AbstractC0911Y0.m2347d(context, R.attr.resc);
        if (colorStateListM2347d == null || !colorStateListM2347d.isStateful()) {
            iArr[0] = AbstractC0911Y0.f3676b;
            iArr2[0] = AbstractC0911Y0.m2345b(context, R.attr.resc);
            iArr[1] = AbstractC0911Y0.f3679e;
            iArr2[1] = AbstractC0911Y0.m2346c(context, R.attr.resc);
            iArr[2] = AbstractC0911Y0.f3680f;
            iArr2[2] = AbstractC0911Y0.m2346c(context, R.attr.resc);
        } else {
            int[] iArr3 = AbstractC0911Y0.f3676b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM2347d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC0911Y0.f3679e;
            iArr2[1] = AbstractC0911Y0.m2346c(context, R.attr.resc);
            iArr[2] = AbstractC0911Y0.f3680f;
            iArr2[2] = colorStateListM2347d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
