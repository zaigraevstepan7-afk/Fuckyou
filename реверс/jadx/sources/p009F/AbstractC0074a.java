package p009F;

import android.graphics.Color;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0074a {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f236a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static int m352a(double d2, double d3, double d4) {
        double d5 = (((-0.4986d) * d4) + (((-1.5372d) * d3) + (3.2406d * d2))) / 100.0d;
        double d6 = ((0.0415d * d4) + ((1.8758d * d3) + ((-0.9689d) * d2))) / 100.0d;
        double d7 = ((1.057d * d4) + (((-0.204d) * d3) + (0.0557d * d2))) / 100.0d;
        double dPow = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double dPow2 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double dPow3 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : 12.92d * d7;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* JADX INFO: renamed from: b */
    public static int m353b(int i2, int i3, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i3) * f) + (Color.alpha(i2) * f2)), (int) ((Color.red(i3) * f) + (Color.red(i2) * f2)), (int) ((Color.green(i3) * f) + (Color.green(i2) * f2)), (int) ((Color.blue(i3) * f) + (Color.blue(i2) * f2)));
    }

    /* JADX INFO: renamed from: c */
    public static int m354c(int i2, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int i4 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i4, m355d(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, i4), m355d(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, i4), m355d(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, i4));
    }

    /* JADX INFO: renamed from: d */
    public static int m355d(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((255 - i3) * (i4 * i5)) + ((i2 * 255) * i3)) / (i6 * 255);
    }

    /* JADX INFO: renamed from: e */
    public static int m356e(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
