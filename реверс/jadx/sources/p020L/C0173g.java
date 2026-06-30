package p020L;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import p010F0.AbstractC0091f;

/* JADX INFO: renamed from: L.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0173g {

    /* JADX INFO: renamed from: a */
    public final TextPaint f589a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f590b;

    /* JADX INFO: renamed from: c */
    public final int f591c;

    /* JADX INFO: renamed from: d */
    public final int f592d;

    public C0173g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0091f.m407h(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f589a = textPaint;
        this.f590b = textDirectionHeuristic;
        this.f591c = i2;
        this.f592d = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r7.f592d != r8.f592d) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj != this) {
            if (obj instanceof C0173g) {
                C0173g c0173g = (C0173g) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    if (this.f591c == c0173g.f591c) {
                    }
                    if (z2 && this.f590b == c0173g.f590b) {
                    }
                }
                TextPaint textPaint = this.f589a;
                if (textPaint.getTextSize() == c0173g.f589a.getTextSize()) {
                    float textScaleX = textPaint.getTextScaleX();
                    TextPaint textPaint2 = c0173g.f589a;
                    z2 = textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i2 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null);
                    if (z2) {
                    }
                }
                if (z2) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f590b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f592d;
        int i4 = this.f591c;
        TextPaint textPaint = this.f589a;
        return i2 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f589a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i2 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f590b);
        sb.append(", breakStrategy=" + this.f591c);
        sb.append(", hyphenationFrequency=" + this.f592d);
        sb.append("}");
        return sb.toString();
    }

    public C0173g(PrecomputedText.Params params) {
        this.f589a = params.getTextPaint();
        this.f590b = params.getTextDirection();
        this.f591c = params.getBreakStrategy();
        this.f592d = params.getHyphenationFrequency();
    }
}
