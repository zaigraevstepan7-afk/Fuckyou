package p015I0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p000A.C0001b;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: I0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0119o {

    /* JADX INFO: renamed from: a */
    public final C0127w[] f396a = new C0127w[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f397b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f398c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f399d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f400e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f401f = new Path();

    /* JADX INFO: renamed from: g */
    public final C0127w f402g = new C0127w();

    /* JADX INFO: renamed from: h */
    public final float[] f403h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f404i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f405j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f406k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f407l = true;

    public C0119o() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f396a[i2] = new C0127w();
            this.f397b[i2] = new Matrix();
            this.f398c[i2] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m496a(C0117m c0117m, float f, RectF rectF, C0001b c0001b, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0127w[] c0127wArr;
        int i2;
        char c2;
        float[] fArr;
        int i3;
        path.rewind();
        Path path2 = this.f400e;
        path2.rewind();
        Path path3 = this.f401f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = this.f398c;
            matrixArr2 = this.f397b;
            c0127wArr = this.f396a;
            i2 = 4;
            c2 = 0;
            fArr = this.f403h;
            if (i4 >= 4) {
                break;
            }
            InterfaceC0107c interfaceC0107c = i4 != 1 ? i4 != 2 ? i4 != 3 ? c0117m.f388f : c0117m.f387e : c0117m.f390h : c0117m.f389g;
            AbstractC0016e abstractC0016e = i4 != 1 ? i4 != 2 ? i4 != 3 ? c0117m.f384b : c0117m.f383a : c0117m.f386d : c0117m.f385c;
            C0127w c0127w = c0127wArr[i4];
            abstractC0016e.getClass();
            abstractC0016e.mo207M(c0127w, f, interfaceC0107c.mo453a(rectF));
            int i5 = i4 + 1;
            float f2 = (i5 % 4) * 90;
            matrixArr2[i4].reset();
            PointF pointF = this.f399d;
            if (i4 == 1) {
                i3 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                i3 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                i3 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            C0127w c0127w2 = c0127wArr[i3];
            fArr[0] = c0127w2.f428c;
            fArr[1] = c0127w2.f429d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f2);
            i4 = i5;
        }
        int i6 = 0;
        while (i6 < i2) {
            C0127w c0127w3 = c0127wArr[i6];
            fArr[c2] = c0127w3.f426a;
            fArr[1] = c0127w3.f427b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path.moveTo(fArr[c2], fArr[1]);
            } else {
                path.lineTo(fArr[c2], fArr[1]);
            }
            c0127wArr[i6].m502b(matrixArr2[i6], path);
            if (c0001b != null) {
                C0127w c0127w4 = c0127wArr[i6];
                Matrix matrix = matrixArr2[i6];
                C0112h c0112h = (C0112h) c0001b.f1b;
                BitSet bitSet = c0112h.f349d;
                c0127w4.getClass();
                bitSet.set(i6, false);
                c0127w4.m501a(c0127w4.f431f);
                c0112h.f347b[i6] = new C0120p(new ArrayList(c0127w4.f433h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            C0127w c0127w5 = c0127wArr[i6];
            fArr[0] = c0127w5.f428c;
            fArr[1] = c0127w5.f429d;
            matrixArr2[i6].mapPoints(fArr);
            C0127w c0127w6 = c0127wArr[i8];
            float f3 = c0127w6.f426a;
            float[] fArr2 = this.f404i;
            fArr2[0] = f3;
            fArr2[1] = c0127w6.f427b;
            matrixArr2[i8].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            C0127w[] c0127wArr2 = c0127wArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C0127w c0127w7 = c0127wArr2[i6];
            fArr[0] = c0127w7.f428c;
            fArr[1] = c0127w7.f429d;
            matrixArr3[i6].mapPoints(fArr);
            float fAbs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            C0127w c0127w8 = this.f402g;
            c0127w8.m504d(0.0f, 0.0f, 270.0f, 0.0f);
            C0109e c0109e = i6 != 1 ? i6 != 2 ? i6 != 3 ? c0117m.f392j : c0117m.f391i : c0117m.f394l : c0117m.f393k;
            c0109e.mo460d(fMax, fAbs, f, c0127w8);
            Path path4 = this.f405j;
            path4.reset();
            c0127w8.m502b(matrixArr[i6], path4);
            if (this.f407l && (c0109e.mo459c() || m497b(path4, i6) || m497b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c0127w8.f426a;
                fArr[1] = c0127w8.f427b;
                matrixArr[i6].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0127w8.m502b(matrixArr[i6], path2);
            } else {
                c0127w8.m502b(matrixArr[i6], path);
            }
            if (c0001b != null) {
                Matrix matrix2 = matrixArr[i6];
                C0112h c0112h2 = (C0112h) c0001b.f1b;
                c0112h2.f349d.set(i6 + 4, false);
                c0127w8.m501a(c0127w8.f431f);
                c0112h2.f348c[i6] = new C0120p(new ArrayList(c0127w8.f433h), new Matrix(matrix2));
            }
            i6 = i7;
            c0127wArr = c0127wArr2;
            matrixArr2 = matrixArr3;
            i2 = 4;
            c2 = 0;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m497b(Path path, int i2) {
        Path path2 = this.f406k;
        path2.reset();
        this.f396a[i2].m502b(this.f397b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
