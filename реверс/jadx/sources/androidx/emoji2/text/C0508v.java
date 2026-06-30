package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p000A.C0010k;
import p001A0.AbstractC0016e;
import p044X.C0406a;

/* JADX INFO: renamed from: androidx.emoji2.text.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0508v extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0507u f1558b;

    /* JADX INFO: renamed from: e */
    public TextPaint f1561e;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f1557a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f1559c = -1;

    /* JADX INFO: renamed from: d */
    public float f1560d = 1.0f;

    public C0508v(C0507u c0507u) {
        AbstractC0016e.m180j(c0507u, "rasterizer cannot be null");
        this.f1558b = c0507u;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i3, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1561e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1561e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i4, f + this.f1559c, i6, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C0496j.m1303a().getClass();
        float f2 = i5;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C0507u c0507u = this.f1558b;
        C0010k c0010k = c0507u.f1555b;
        Typeface typeface = (Typeface) c0010k.f25d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0010k.f23b, c0507u.f1554a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1557a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0507u c0507u = this.f1558b;
        this.f1560d = fAbs / (c0507u.m1322b().m694a(14) != 0 ? ((ByteBuffer) r8.f768d).getShort(r1 + r8.f765a) : (short) 0);
        C0406a c0406aM1322b = c0507u.m1322b();
        int iM694a = c0406aM1322b.m694a(14);
        if (iM694a != 0) {
            ((ByteBuffer) c0406aM1322b.f768d).getShort(iM694a + c0406aM1322b.f765a);
        }
        short s2 = (short) ((c0507u.m1322b().m694a(12) != 0 ? ((ByteBuffer) r5.f768d).getShort(r7 + r5.f765a) : (short) 0) * this.f1560d);
        this.f1559c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
