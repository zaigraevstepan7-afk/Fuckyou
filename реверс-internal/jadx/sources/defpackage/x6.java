package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    public final PathMeasure a;

    public x6(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final boolean a(float f, float f2, w6 w6Var) {
        if (!(w6Var instanceof w6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.a.getSegment(f, f2, w6Var.a, true);
    }
}
