package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r6 {
    public final v6 a;
    public final int b;
    public final long c;
    public final nz1 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r6(v6 v6Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        zq1 zq1Var;
        int i8;
        int i9;
        int i10;
        char c;
        zq1 zq1Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        nz1 nz1VarA;
        int i11;
        r6 r6Var;
        int i12;
        int i13;
        int i14;
        Layout layout;
        sm1[] sm1VarArr;
        CharSequence charSequence;
        List list;
        pc1 pc1Var;
        float fK;
        int iC;
        float fJ;
        int iC2;
        int i15;
        this.a = v6Var;
        this.b = i;
        this.c = j;
        if (kr.i(j) != 0 || kr.j(j) != 0) {
            og0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            og0.a("maxLines should be greater than 0");
        }
        d02 d02Var = v6Var.b;
        CharSequence charSequence2 = v6Var.h;
        if (i2 == 2) {
            i3 = 0;
            if (!g02.a(d02Var.a.h, uc1.p(0)) && !g02.a(d02Var.a.h, g02.c) && (i15 = d02Var.b.a) != 0 && i15 != 5 && i15 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!kd1.s(spannableString, kf0.class)) {
                    spannableString.setSpan(new kf0(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        p41 p41Var = d02Var.b;
        zq1 zq1Var3 = d02Var.a;
        int i16 = p41Var.a;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = p41Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = p41Var.g;
        int i22 = i21 & 255;
        if (i22 != 1) {
            if (i22 == 2) {
                i4 = i21;
                i5 = i19;
                i6 = 1;
            } else if (i22 == 3) {
                i4 = i21;
                i5 = i19;
                i6 = 2;
            } else {
                i4 = i21;
                i5 = i19;
                i6 = i3;
            }
        }
        int i23 = (i4 >> 8) & 255;
        if (i23 != 1) {
            if (i23 == 2) {
                i17 = 1;
            } else if (i23 == 3) {
                i17 = 2;
            } else if (i23 != 4) {
                i17 = i3;
            }
        }
        int i24 = (i4 >> 16) & 255;
        if (i24 != 1) {
            i7 = 2;
            if (i24 == 2) {
                zq1Var = zq1Var3;
                i8 = i18;
                i9 = 1;
            }
            if (i2 != i7) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i2 != 4) {
                    i10 = i20;
                    c = ' ';
                    zq1Var2 = zq1Var;
                    truncateAt = null;
                    nz1VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
                    Layout layout2 = nz1VarA.f;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || v6Var.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        r6Var = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        r6Var = this;
                        i12 = i;
                        i13 = i11;
                        nz1VarA = r6Var.a(i13, i5, truncateAt, i12, i10, i6, i17, i9, TextUtils.concat(charSequenceArr));
                    }
                    int i25 = nz1VarA.g;
                    if (i2 != i14 || nz1VarA.a() <= kr.g(j) || i12 <= 1) {
                        r6Var.d = nz1VarA;
                    } else {
                        int iG = kr.g(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                i26 = i25;
                                break;
                            } else if (nz1VarA.e(i26) > iG) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        if (i26 >= 0 && i26 != r6Var.b) {
                            nz1VarA = r6Var.a(i13, i5, truncateAt, i26 < 1 ? 1 : i26, i10, i6, i17, i9, r6Var.e);
                        }
                        r6Var.d = nz1VarA;
                    }
                    r6Var.a.g.c(zq1Var2.a.c(), (((long) Float.floatToRawIntBits(r6Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(r6Var.d())) << c), zq1Var2.a.a());
                    layout = r6Var.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), sm1.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            sm1VarArr = (sm1[]) ((Spanned) text2).getSpans(0, layout.getText().length(), sm1.class);
                        }
                    } else {
                        sm1VarArr = null;
                    }
                    if (sm1VarArr != null) {
                        for (sm1 sm1Var : sm1VarArr) {
                            sm1Var.g.setValue(new io1((((long) Float.floatToRawIntBits(r6Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(r6Var.d())) << c)));
                        }
                    }
                    charSequence = r6Var.e;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), c71.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            c71 c71Var = (c71) obj;
                            int spanStart = spanned2.getSpanStart(c71Var);
                            int spanEnd = spanned2.getSpanEnd(c71Var);
                            int iG2 = r6Var.d.g(spanStart);
                            boolean z = iG2 >= r6Var.b;
                            boolean z2 = r6Var.d.f.getEllipsisCount(iG2) > 0 && spanEnd > r6Var.d.f.getEllipsisStart(iG2) + r6Var.d.f.getLineStart(iG2);
                            boolean z3 = spanEnd > r6Var.d.f(iG2);
                            if (z2 || z3 || z) {
                                pc1Var = null;
                            } else {
                                boolean z4 = r6Var.d.f.getParagraphDirection(iG2) == 1;
                                boolean zIsRtlCharAt = r6Var.d.f.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fJ = r6Var.d.k(spanStart, false);
                                        iC2 = c71Var.c();
                                    } else {
                                        nz1 nz1Var = r6Var.d;
                                        if (zIsRtlCharAt) {
                                            fJ = nz1Var.j(spanStart, false);
                                            iC2 = c71Var.c();
                                        } else {
                                            fK = nz1Var.k(spanStart, false);
                                            iC = c71Var.c();
                                        }
                                    }
                                    fK = fJ - iC2;
                                    nz1 nz1Var2 = r6Var.d;
                                    c71Var.getClass();
                                    float fD = nz1Var2.d(iG2) - c71Var.b();
                                    pc1Var = new pc1(fK, fD, fJ, c71Var.b() + fD);
                                } else {
                                    fK = r6Var.d.j(spanStart, false);
                                    iC = c71Var.c();
                                }
                                fJ = iC + fK;
                                nz1 nz1Var22 = r6Var.d;
                                c71Var.getClass();
                                float fD2 = nz1Var22.d(iG2) - c71Var.b();
                                pc1Var = new pc1(fK, fD2, fJ, c71Var.b() + fD2);
                            }
                            arrayList.add(pc1Var);
                        }
                        list = arrayList;
                    } else {
                        list = f40.e;
                    }
                    r6Var.f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            zq1Var2 = zq1Var;
            truncateAt = truncateAt2;
            nz1VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
            Layout layout22 = nz1VarA.f;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                r6Var = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = nz1VarA.g;
            if (i2 != i14) {
                r6Var.d = nz1VarA;
            }
            r6Var.a.g.c(zq1Var2.a.c(), (((long) Float.floatToRawIntBits(r6Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(r6Var.d())) << c), zq1Var2.a.a());
            layout = r6Var.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            if (sm1VarArr != null) {
            }
            charSequence = r6Var.e;
            if (charSequence instanceof Spanned) {
            }
            r6Var.f = list;
        }
        i7 = 2;
        zq1Var = zq1Var3;
        i8 = i18;
        i9 = i3;
        if (i2 != i7) {
        }
        i10 = i20;
        c = ' ';
        zq1Var2 = zq1Var;
        truncateAt = truncateAt2;
        nz1VarA = a(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
        Layout layout222 = nz1VarA.f;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = nz1VarA.g;
        if (i2 != i14) {
        }
        r6Var.a.g.c(zq1Var2.a.c(), (((long) Float.floatToRawIntBits(r6Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(r6Var.d())) << c), zq1Var2.a.a());
        layout = r6Var.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        if (sm1VarArr != null) {
        }
        charSequence = r6Var.e;
        if (charSequence instanceof Spanned) {
        }
        r6Var.f = list;
    }

    public final nz1 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        m71 m71Var;
        float fD = d();
        v6 v6Var = this.a;
        r8 r8Var = v6Var.g;
        int i8 = v6Var.l;
        fl0 fl0Var = v6Var.i;
        d02 d02Var = v6Var.b;
        s6 s6Var = t6.a;
        a81 a81Var = d02Var.c;
        return new nz1(charSequence, fD, r8Var, i, truncateAt, i8, (a81Var == null || (m71Var = a81Var.b) == null) ? false : m71Var.a, i3, i5, i6, i7, i4, i2, fl0Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Type inference failed for: r10v26, types: [i6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(pc1 pc1Var, int i, ez1 ez1Var) {
        fk1 kc0Var;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderK;
        RectF rectFR = el.R(pc1Var);
        int i3 = 1;
        boolean z = i != 0 && i == 1;
        final ud udVar = new ud(i3, ez1Var);
        nz1 nz1Var = this.d;
        TextPaint textPaint = nz1Var.a;
        Layout layout = nz1Var.f;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 12;
        if (i4 >= 34) {
            if (z) {
                segmentFinderK = new rb(new n81(i5, layout.getText(), nz1Var.l()));
            } else {
                h6.o();
                segmentFinderK = h6.k(h6.j(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFR, segmentFinderK, new Layout.TextInclusionStrategy() { // from class: i6
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) udVar.h(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            me meVarC = nz1Var.c();
            if (z) {
                kc0Var = new n81(i5, layout.getText(), nz1Var.l());
            } else {
                CharSequence text = layout.getText();
                kc0Var = i4 >= 29 ? new kc0(text, textPaint) : new lc0(text);
            }
            fk1 fk1Var = kc0Var;
            int lineForVertical = layout.getLineForVertical((int) rectFR.top);
            if (rectFR.top <= nz1Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < nz1Var.g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFR.bottom);
                if (lineForVertical2 != 0 || rectFR.bottom >= nz1Var.i(0)) {
                    int iV = xc.v(nz1Var, layout, meVarC, i6, rectFR, fk1Var, udVar, true);
                    while (true) {
                        i2 = i6;
                        if (iV != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iV = xc.v(nz1Var, layout, meVarC, i6, rectFR, fk1Var, udVar, true);
                    }
                    if (iV == -1) {
                        rangeForRect = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iV2 = xc.v(nz1Var, layout, meVarC, i7, rectFR, fk1Var, udVar, false);
                        while (iV2 == -1 && i2 < i7) {
                            i7--;
                            iV2 = xc.v(nz1Var, layout, meVarC, i7, rectFR, fk1Var, udVar, false);
                        }
                        if (iV2 != -1) {
                            rangeForRect = new int[]{fk1Var.a(iV + 1), fk1Var.b(iV2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? wz1.b : af1.g(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return kr.h(this.c);
    }

    public final void e(cj cjVar) {
        Canvas canvasA = o3.a(cjVar);
        nz1 nz1Var = this.d;
        if (nz1Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = nz1Var.h;
        if (canvasA.getClipBounds(nz1Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = rz1.a;
            Object fw1Var = threadLocal.get();
            if (fw1Var == null) {
                fw1Var = new fw1();
                threadLocal.set(fw1Var);
            }
            fw1 fw1Var2 = (fw1) fw1Var;
            fw1Var2.a = canvasA;
            try {
                nz1Var.f.draw(fw1Var2);
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                fw1Var2.a = null;
            }
        }
        if (nz1Var.d) {
            canvasA.restore();
        }
    }

    public final void f(cj cjVar, long j, um1 um1Var, ax1 ax1Var, q10 q10Var) {
        r8 r8Var = this.a.g;
        int i = r8Var.c;
        r8Var.d(j);
        r8Var.f(um1Var);
        r8Var.g(ax1Var);
        r8Var.e(q10Var);
        r8Var.b(3);
        e(cjVar);
        r8Var.b(i);
    }

    public final void g(cj cjVar, lh lhVar, float f, um1 um1Var, ax1 ax1Var, q10 q10Var) {
        r8 r8Var = this.a.g;
        int i = r8Var.c;
        float fD = d();
        r8Var.c(lhVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        r8Var.f(um1Var);
        r8Var.g(ax1Var);
        r8Var.e(q10Var);
        r8Var.b(3);
        e(cjVar);
        r8Var.b(i);
    }
}
