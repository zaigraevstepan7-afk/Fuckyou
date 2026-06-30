package p015I0;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: I0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0124t extends AbstractC0125u {

    /* JADX INFO: renamed from: b */
    public float f421b;

    /* JADX INFO: renamed from: c */
    public float f422c;

    @Override // p015I0.AbstractC0125u
    /* JADX INFO: renamed from: a */
    public final void mo500a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f423a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f421b, this.f422c);
        path.transform(matrix);
    }
}
