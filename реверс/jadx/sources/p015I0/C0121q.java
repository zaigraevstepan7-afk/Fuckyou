package p015I0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p014H0.C0104a;

/* JADX INFO: renamed from: I0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0121q extends AbstractC0126v {

    /* JADX INFO: renamed from: c */
    public final C0123s f410c;

    public C0121q(C0123s c0123s) {
        this.f410c = c0123s;
    }

    @Override // p015I0.AbstractC0126v
    /* JADX INFO: renamed from: a */
    public final void mo498a(Matrix matrix, C0104a c0104a, int i2, Canvas canvas) {
        C0123s c0123s = this.f410c;
        float f = c0123s.f419f;
        float f2 = c0123s.f420g;
        RectF rectF = new RectF(c0123s.f415b, c0123s.f416c, c0123s.f417d, c0123s.f418e);
        c0104a.getClass();
        boolean z2 = f2 < 0.0f;
        Path path = c0104a.f313g;
        int[] iArr = C0104a.f305k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c0104a.f312f;
            iArr[2] = c0104a.f311e;
            iArr[3] = c0104a.f310d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i2;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c0104a.f310d;
            iArr[2] = c0104a.f311e;
            iArr[3] = c0104a.f312f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i2 / fWidth);
        float[] fArr = C0104a.f306l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0104a.f308b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0104a.f314h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
