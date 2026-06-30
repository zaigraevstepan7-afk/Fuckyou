package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 extends mn1 {
    public final jn1 c;

    public hn1(jn1 jn1Var) {
        this.c = jn1Var;
    }

    @Override // defpackage.mn1
    public final void a(Matrix matrix, wm1 wm1Var, int i, Canvas canvas) {
        jn1 jn1Var = this.c;
        float f = jn1Var.f;
        float f2 = jn1Var.g;
        RectF rectF = new RectF(jn1Var.b, jn1Var.c, jn1Var.d, jn1Var.e);
        Paint paint = wm1Var.b;
        boolean z = f2 < 0.0f;
        Path path = wm1Var.g;
        int[] iArr = wm1.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = wm1Var.f;
            iArr[2] = wm1Var.e;
            iArr[3] = wm1Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = wm1Var.d;
            iArr[2] = wm1Var.e;
            iArr[3] = wm1Var.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = wm1.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, wm1Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
