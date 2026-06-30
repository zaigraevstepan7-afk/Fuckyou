package p024N;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: N.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0243V {
    /* JADX INFO: renamed from: a */
    public static int m793a(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static int m794b(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
    }
}
