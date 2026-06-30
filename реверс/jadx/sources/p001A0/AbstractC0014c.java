package p001A0;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0014c {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m132h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation m133i(int i2, Interpolator interpolator, long j2) {
        return new WindowInsetsAnimation(i2, interpolator, j2);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m134j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m136l() {
    }
}
