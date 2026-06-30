package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 {
    public final nn1[] a = new nn1[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final nn1 g = new nn1();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public bn1() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new nn1();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static bn1 b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? an1.a : new bn1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(zm1 zm1Var, float f, RectF rectF, du0 du0Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        nn1[] nn1VarArr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr = this.h;
            nn1VarArr = this.a;
            matrixArr2 = this.b;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            gt gtVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? zm1Var.g : zm1Var.f : zm1Var.i : zm1Var.h;
            bk bkVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? zm1Var.c : zm1Var.b : zm1Var.e : zm1Var.d;
            nn1 nn1Var = nn1VarArr[i3];
            bkVar.getClass();
            bkVar.B(nn1Var, f, gtVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            nn1 nn1Var2 = nn1VarArr[i2];
            fArr[0] = nn1Var2.b;
            fArr[1] = nn1Var2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            nn1 nn1Var3 = nn1VarArr[i5];
            nn1Var3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = nn1Var3.a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            nn1VarArr[i5].b(matrixArr2[i5], path);
            if (du0Var != null) {
                nn1 nn1Var4 = nn1VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                fu0 fu0Var = du0Var.a;
                f2 = 0.0f;
                BitSet bitSet = fu0Var.e;
                nn1Var4.getClass();
                bitSet.set(i5, (boolean) c);
                mn1[] mn1VarArr = fu0Var.c;
                nn1Var4.a(nn1Var4.e);
                mn1VarArr[i5] = new gn1(new ArrayList(nn1Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            nn1 nn1Var5 = nn1VarArr[i5];
            fArr[0] = nn1Var5.b;
            fArr[1] = nn1Var5.c;
            matrixArr2[i5].mapPoints(fArr);
            nn1 nn1Var6 = nn1VarArr[i7];
            nn1Var6.getClass();
            float[] fArr2 = this.i;
            fArr2[0] = f2;
            fArr2[1] = nn1Var6.a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            nn1[] nn1VarArr2 = nn1VarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            nn1 nn1Var7 = nn1VarArr2[i5];
            fArr[0] = nn1Var7.b;
            fArr[1] = nn1Var7.c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            nn1 nn1Var8 = this.g;
            nn1Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? zm1Var.k : zm1Var.j : zm1Var.m : zm1Var.l).getClass();
            nn1Var8.c(fMax, 0.0f);
            Path path4 = this.j;
            path4.reset();
            nn1Var8.b(matrixArr3[i5], path4);
            if (this.l && (c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = nn1Var8.a;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                nn1Var8.b(matrixArr3[i5], path2);
            } else {
                nn1Var8.b(matrixArr3[i5], path);
            }
            if (du0Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                fu0 fu0Var2 = du0Var.a;
                c2 = 0;
                fu0Var2.e.set(i5 + 4, false);
                mn1[] mn1VarArr2 = fu0Var2.d;
                nn1Var8.a(nn1Var8.e);
                mn1VarArr2[i5] = new gn1(new ArrayList(nn1Var8.g), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i5 = i6;
            c = c2;
            nn1VarArr = nn1VarArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
