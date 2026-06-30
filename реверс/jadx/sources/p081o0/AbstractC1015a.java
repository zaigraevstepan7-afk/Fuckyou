package p081o0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p052b0.C0595a;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1015a {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f4046a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C0595a f4047b = new C0595a(C0595a.f2034d);

    /* JADX INFO: renamed from: c */
    public static final C0595a f4048c = new C0595a();

    /* JADX INFO: renamed from: d */
    public static final C0595a f4049d = new C0595a(C0595a.f2035e);

    /* JADX INFO: renamed from: e */
    public static final DecelerateInterpolator f4050e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m2461a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m2462b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m2461a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m2463c(int i2, int i3, float f) {
        return Math.round(f * (i3 - i2)) + i2;
    }
}
