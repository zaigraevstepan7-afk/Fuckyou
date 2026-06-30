package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public zb e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final np0[] o;
    public final Rect p = new Rect();
    public me q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3 A[PHI: r14
      0x01a3: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:102:0x01b5, B:95:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nz1(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, fl0 fl0Var) throws Throwable {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutO;
        np0[] np0VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        Throwable th;
        char c;
        long j;
        int i14;
        int i15;
        long jA;
        ?? IsFallbackLineSpacingEnabled;
        long jA2;
        int i16;
        ?? r6;
        int i17;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = rz1.b(i2);
        Layout.Alignment alignment = ew1.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ew1.b : ew1.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, ef.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = fl0Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || fl0Var.c() > f || z2) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutO = xc.o(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    og0.a("negative width");
                }
                if (iCeil < 0) {
                    og0.a("negative ellipsized width");
                }
                layoutO = Build.VERSION.SDK_INT >= 33 ? e1.e(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f = layoutO;
            Trace.endSection();
            int iMin = Math.min(layoutO.getLineCount(), i9);
            this.g = iMin;
            int i18 = iMin - 1;
            this.d = iMin >= i9 && (layoutO.getEllipsisCount(i18) > 0 || layoutO.getLineEnd(i18) != charSequence.length());
            if (layoutO.getText() instanceof Spanned) {
                CharSequence text = layoutO.getText();
                text.getClass();
                if (kd1.s((Spanned) text, np0.class) || layoutO.getText().length() <= 0) {
                    CharSequence text2 = layoutO.getText();
                    text2.getClass();
                    i10 = 0;
                    np0VarArr = (np0[]) ((Spanned) text2).getSpans(0, layoutO.getText().length(), np0.class);
                }
            } else {
                np0VarArr = null;
                i10 = 0;
            }
            this.o = np0VarArr;
            if (np0VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                np0 np0Var = np0VarArr.length == 0 ? null : np0VarArr[i10];
                if (np0Var != null) {
                    if (np0Var.g) {
                        i11 = 2;
                        i17 = np0Var.j == 2 ? 1 : i17;
                        i12 = i17;
                    } else {
                        i11 = 2;
                    }
                    i17 = i10;
                    i12 = i17;
                }
            }
            if (np0VarArr == null) {
                i13 = i10;
            } else {
                np0 np0Var2 = np0VarArr.length == 0 ? null : np0VarArr[i10];
                if (np0Var2 != null && np0Var2.h && np0Var2.j == i11) {
                    i13 = 1;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jA3 = rz1.b;
                if (z) {
                    th = null;
                    c = ' ';
                    j = 4294967295L;
                    i14 = 1;
                    i15 = 33;
                } else if (this.l) {
                    i15 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutO).isFallbackLineSpacingEnabled() : i10;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        th = null;
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                    } else {
                        TextPaint paint = layoutO.getPaint();
                        CharSequence text3 = layoutO.getText();
                        th = null;
                        c = ' ';
                        Rect rectU = xk.u(paint, text3, layoutO.getLineStart(i10), layoutO.getLineEnd(i10));
                        int lineAscent = layoutO.getLineAscent(i10);
                        j = 4294967295L;
                        int i19 = rectU.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : layoutO.getTopPadding();
                        i14 = 1;
                        rectU = iMin != 1 ? xk.u(paint, text3, layoutO.getLineStart(i18), layoutO.getLineEnd(i18)) : rectU;
                        int lineDescent = layoutO.getLineDescent(i18);
                        int i20 = rectU.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : layoutO.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = rz1.a(topPadding, bottomPadding);
                        }
                    }
                } else {
                    i15 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutO;
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i21 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                jA = rz1.a(i12 != 0 ? i10 : (int) (jA3 >> c), i13 != 0 ? i10 : (int) (jA3 & j));
            } else {
                jA = rz1.b;
                th = null;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i15 = 33;
            }
            if (np0VarArr != null) {
                int length2 = np0VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i22 = iMax2; i22 < length2; i22++) {
                    np0 np0Var3 = np0VarArr[i22];
                    int i23 = np0Var3.o;
                    iMax = i23 < 0 ? Math.max(iMax, Math.abs(i23)) : iMax;
                    int i24 = np0Var3.p;
                    if (i24 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i24));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? rz1.b : rz1.a(iMax, iMax2);
            } else {
                jA2 = rz1.b;
            }
            this.h = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.i = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            np0[] np0VarArr2 = this.o;
            int i25 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || np0VarArr2 == null || np0VarArr2.length == 0) {
                i16 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (np0VarArr2.length == 0) {
                    yc.h("Array is empty.");
                    throw th;
                }
                np0 np0Var4 = np0VarArr2[i10];
                spannableString.setSpan(new np0(np0Var4.e, spannableString.length(), (i25 == 0 || !np0Var4.h) ? np0Var4.h : i10, np0Var4.h, np0Var4.i, np0Var4.j), i10, spannableString.length(), i15);
                i16 = i10;
                StaticLayout staticLayoutO = xc.o(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, yk0.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutO.getLineAscent(i16);
                fontMetricsInt.descent = staticLayoutO.getLineDescent(i16);
                fontMetricsInt.top = staticLayoutO.getLineTop(i16);
                fontMetricsInt.bottom = staticLayoutO.getLineBottom(i16);
                r6 = fontMetricsInt;
            }
            this.n = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) h(i18)) : i16;
            this.m = r6;
            Layout layout2 = this.f;
            this.j = lk.M(layout2, i18, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = lk.N(layout3, i18, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final me c() {
        me meVar = this.q;
        if (meVar != null) {
            return meVar;
        }
        me meVar2 = new me();
        meVar2.a = this.f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iO = ct1.O(((Layout) meVar2.a).getText(), '\n', length, 4);
            length = iO < 0 ? ((Layout) meVar2.a).getText().length() : iO + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) meVar2.a).getText().length());
        meVar2.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        meVar2.c = arrayList2;
        meVar2.d = new boolean[((ArrayList) meVar2.b).size()];
        ((ArrayList) meVar2.b).size();
        this.q = meVar2;
        return meVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : i(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = rz1.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return e(i) - i(i);
    }

    public final float i(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().h(i, true, z);
    }

    public final float k(int i, boolean z) {
        return b(g(i)) + c().h(i, false, z);
    }

    public final zb l() {
        zb zbVar = this.e;
        if (zbVar != null) {
            return zbVar;
        }
        Layout layout = this.f;
        zb zbVar2 = new zb(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = zbVar2;
        return zbVar2;
    }
}
