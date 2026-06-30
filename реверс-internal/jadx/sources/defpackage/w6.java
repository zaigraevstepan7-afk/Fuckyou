package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w6 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public w6(Path path) {
        this.a = path;
    }

    public static void a(w6 w6Var, w6 w6Var2) {
        Path path = w6Var.a;
        if (!(w6Var2 instanceof w6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(w6Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(w6 w6Var, pc1 pc1Var) {
        float f = pc1Var.a;
        float f2 = pc1Var.d;
        float f3 = pc1Var.c;
        float f4 = pc1Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            y6.b("Invalid rectangle, make sure no value is NaN");
        }
        if (w6Var.b == null) {
            w6Var.b = new RectF();
        }
        RectF rectF = w6Var.b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = w6Var.a;
        RectF rectF2 = w6Var.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(w6 w6Var, hg1 hg1Var) {
        if (w6Var.b == null) {
            w6Var.b = new RectF();
        }
        RectF rectF = w6Var.b;
        rectF.getClass();
        float f = hg1Var.a;
        long j = hg1Var.h;
        long j2 = hg1Var.g;
        long j3 = hg1Var.f;
        long j4 = hg1Var.e;
        rectF.set(f, hg1Var.b, hg1Var.c, hg1Var.d);
        if (w6Var.c == null) {
            w6Var.c = new float[8];
        }
        float[] fArr = w6Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = w6Var.a;
        RectF rectF2 = w6Var.b;
        rectF2.getClass();
        float[] fArr2 = w6Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final pc1 d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new pc1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(w6 w6Var, w6 w6Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(w6Var instanceof w6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = w6Var.a;
        if (w6Var2 instanceof w6) {
            return this.a.op(path, w6Var2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void g() {
        this.a.reset();
    }

    public final void h() {
        this.a.rewind();
    }

    public final void i(float[] fArr) {
        if (this.d == null) {
            this.d = new Matrix();
        }
        Matrix matrix = this.d;
        matrix.getClass();
        u4.s(matrix, fArr);
        Matrix matrix2 = this.d;
        matrix2.getClass();
        this.a.transform(matrix2);
    }

    public final void j(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
