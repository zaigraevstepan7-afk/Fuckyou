package p075l0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p007E.C0058d;
import p009F.C0079f;
import p084q.C1027f;

/* JADX INFO: renamed from: l0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0998n {

    /* JADX INFO: renamed from: p */
    public static final Matrix f3944p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f3945a;

    /* JADX INFO: renamed from: b */
    public final Path f3946b;

    /* JADX INFO: renamed from: c */
    public final Matrix f3947c;

    /* JADX INFO: renamed from: d */
    public Paint f3948d;

    /* JADX INFO: renamed from: e */
    public Paint f3949e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f3950f;

    /* JADX INFO: renamed from: g */
    public final C0995k f3951g;

    /* JADX INFO: renamed from: h */
    public float f3952h;

    /* JADX INFO: renamed from: i */
    public float f3953i;

    /* JADX INFO: renamed from: j */
    public float f3954j;

    /* JADX INFO: renamed from: k */
    public float f3955k;

    /* JADX INFO: renamed from: l */
    public int f3956l;

    /* JADX INFO: renamed from: m */
    public String f3957m;

    /* JADX INFO: renamed from: n */
    public Boolean f3958n;

    /* JADX INFO: renamed from: o */
    public final C1027f f3959o;

    public C0998n() {
        this.f3947c = new Matrix();
        this.f3952h = 0.0f;
        this.f3953i = 0.0f;
        this.f3954j = 0.0f;
        this.f3955k = 0.0f;
        this.f3956l = 255;
        this.f3957m = null;
        this.f3958n = null;
        this.f3959o = new C1027f(0);
        this.f3951g = new C0995k();
        this.f3945a = new Path();
        this.f3946b = new Path();
    }

    /* JADX INFO: renamed from: a */
    public final void m2445a(C0995k c0995k, Matrix matrix, Canvas canvas, int i2, int i3) {
        float f;
        int i4;
        float f2;
        C0995k c0995k2 = c0995k;
        char c2 = 1;
        c0995k2.f3930a.set(matrix);
        Matrix matrix2 = c0995k2.f3930a;
        matrix2.preConcat(c0995k2.f3939j);
        canvas.save();
        char c3 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0995k2.f3931b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0996l abstractC0996l = (AbstractC0996l) arrayList.get(i5);
            if (abstractC0996l instanceof C0995k) {
                m2445a((C0995k) abstractC0996l, matrix2, canvas, i2, i3);
            } else if (abstractC0996l instanceof AbstractC0997m) {
                AbstractC0997m abstractC0997m = (AbstractC0997m) abstractC0996l;
                float f3 = i2 / this.f3954j;
                float f4 = i3 / this.f3955k;
                float fMin = Math.min(f3, f4);
                Matrix matrix3 = this.f3947c;
                matrix3.set(matrix2);
                matrix3.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c3], fArr[c2]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    abstractC0997m.getClass();
                    Path path = this.f3945a;
                    path.reset();
                    C0079f[] c0079fArr = abstractC0997m.f3941a;
                    if (c0079fArr != null) {
                        C0079f.m364b(c0079fArr, path);
                    }
                    Path path2 = this.f3946b;
                    path2.reset();
                    if (abstractC0997m instanceof C0993i) {
                        path2.setFillType(abstractC0997m.f3943c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        C0994j c0994j = (C0994j) abstractC0997m;
                        float f6 = c0994j.f3924i;
                        if (f6 != 0.0f || c0994j.f3925j != 1.0f) {
                            float f7 = c0994j.f3926k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c0994j.f3925j + f7) % 1.0f;
                            if (this.f3950f == null) {
                                this.f3950f = new PathMeasure();
                            }
                            this.f3950f.setPath(path, false);
                            float length = this.f3950f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.f3950f.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f3950f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.f3950f.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix3);
                        C0058d c0058d = c0994j.f3921f;
                        if ((c0058d.f194a == null && c0058d.f196c == 0) ? false : true) {
                            if (this.f3949e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f3949e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f3949e;
                            Shader shader = c0058d.f194a;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0994j.f3923h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0058d.f196c;
                                float f12 = c0994j.f3923h;
                                PorterDuff.Mode mode = C1001q.f3973j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0994j.f3943c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            i4 = 16777215;
                            f2 = 255.0f;
                        }
                        C0058d c0058d2 = c0994j.f3919d;
                        if (c0058d2.f194a != null || c0058d2.f196c != 0) {
                            if (this.f3948d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3948d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3948d;
                            Paint.Join join = c0994j.f3928m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0994j.f3927l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0994j.f3929n);
                            Shader shader2 = c0058d2.f194a;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0994j.f3922g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0058d2.f196c;
                                float f13 = c0994j.f3922g;
                                PorterDuff.Mode mode2 = C1001q.f3973j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0994j.f3920e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5++;
                c0995k2 = c0995k;
                c2 = 1;
                c3 = 0;
            }
            i5++;
            c0995k2 = c0995k;
            c2 = 1;
            c3 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3956l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f3956l = i2;
    }

    public C0998n(C0998n c0998n) {
        this.f3947c = new Matrix();
        this.f3952h = 0.0f;
        this.f3953i = 0.0f;
        this.f3954j = 0.0f;
        this.f3955k = 0.0f;
        this.f3956l = 255;
        this.f3957m = null;
        this.f3958n = null;
        C1027f c1027f = new C1027f(0);
        this.f3959o = c1027f;
        this.f3951g = new C0995k(c0998n.f3951g, c1027f);
        this.f3945a = new Path(c0998n.f3945a);
        this.f3946b = new Path(c0998n.f3946b);
        this.f3952h = c0998n.f3952h;
        this.f3953i = c0998n.f3953i;
        this.f3954j = c0998n.f3954j;
        this.f3955k = c0998n.f3955k;
        this.f3956l = c0998n.f3956l;
        this.f3957m = c0998n.f3957m;
        String str = c0998n.f3957m;
        if (str != null) {
            c1027f.put(str, this);
        }
        this.f3958n = c0998n.f3958n;
    }
}
