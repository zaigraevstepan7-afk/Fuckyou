package p082p;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1020c extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f4076a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m2470a(float f, float f2, boolean z2) {
        if (!z2) {
            return f;
        }
        return (float) (((1.0d - f4076a) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: b */
    public static float m2471b(float f, float f2, boolean z2) {
        if (!z2) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f4076a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
