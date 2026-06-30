package p024N;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: N.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0294x {
    /* JADX INFO: renamed from: a */
    public static float m916a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    /* JADX INFO: renamed from: b */
    public static float m917b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m918c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
