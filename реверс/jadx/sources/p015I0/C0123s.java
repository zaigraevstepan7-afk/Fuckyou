package p015I0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: I0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0123s extends AbstractC0125u {

    /* JADX INFO: renamed from: h */
    public static final RectF f414h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f415b;

    /* JADX INFO: renamed from: c */
    public final float f416c;

    /* JADX INFO: renamed from: d */
    public final float f417d;

    /* JADX INFO: renamed from: e */
    public final float f418e;

    /* JADX INFO: renamed from: f */
    public float f419f;

    /* JADX INFO: renamed from: g */
    public float f420g;

    public C0123s(float f, float f2, float f3, float f4) {
        this.f415b = f;
        this.f416c = f2;
        this.f417d = f3;
        this.f418e = f4;
    }

    @Override // p015I0.AbstractC0125u
    /* JADX INFO: renamed from: a */
    public final void mo500a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f423a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f414h;
        rectF.set(this.f415b, this.f416c, this.f417d, this.f418e);
        path.arcTo(rectF, this.f419f, this.f420g, false);
        path.transform(matrix);
    }
}
