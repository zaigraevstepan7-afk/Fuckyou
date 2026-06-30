package p015I0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p014H0.C0104a;

/* JADX INFO: renamed from: I0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0122r extends AbstractC0126v {

    /* JADX INFO: renamed from: c */
    public final C0124t f411c;

    /* JADX INFO: renamed from: d */
    public final float f412d;

    /* JADX INFO: renamed from: e */
    public final float f413e;

    public C0122r(C0124t c0124t, float f, float f2) {
        this.f411c = c0124t;
        this.f412d = f;
        this.f413e = f2;
    }

    @Override // p015I0.AbstractC0126v
    /* JADX INFO: renamed from: a */
    public final void mo498a(Matrix matrix, C0104a c0104a, int i2, Canvas canvas) {
        C0124t c0124t = this.f411c;
        float f = c0124t.f422c;
        float f2 = this.f413e;
        float f3 = c0124t.f421b;
        float f4 = this.f412d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f425a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m499b());
        c0104a.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = C0104a.f303i;
        iArr[0] = c0104a.f312f;
        iArr[1] = c0104a.f311e;
        iArr[2] = c0104a.f310d;
        Paint paint = c0104a.f309c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0104a.f304j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m499b() {
        C0124t c0124t = this.f411c;
        return (float) Math.toDegrees(Math.atan((c0124t.f422c - this.f413e) / (c0124t.f421b - this.f412d)));
    }
}
