package p036T;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: T.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0386p {
    /* JADX INFO: renamed from: b */
    public static String[] m1092b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: c */
    public static PrecomputedText.Params m1093c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: d */
    public static void m1094d(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m1091a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
