package p074l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910Y {
    /* JADX INFO: renamed from: a */
    public static int m2340a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m2341b(TextView textView, int i2, int i3, int i4, int i5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: c */
    public static void m2342c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2343d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
