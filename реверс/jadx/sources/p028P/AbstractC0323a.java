package p028P;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: P.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0323a {
    /* JADX INFO: renamed from: a */
    public static Interpolator m980a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m981b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static Interpolator m982c(Path path) {
        return new PathInterpolator(path);
    }
}
