package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v6 implements n41 {
    public final String a;
    public final d02 b;
    public final List c;
    public final List d;
    public final c90 e;
    public final hx f;
    public final r8 g;
    public final CharSequence h;
    public final fl0 i;
    public oc j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0872 A[LOOP:6: B:421:0x0870->B:422:0x0872, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0883  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v6(String str, d02 d02Var, List list, List list2, c90 c90Var, hx hxVar) {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        boolean z;
        Typeface typeface;
        CharSequence charSequence;
        long j;
        int i2;
        fz1 fz1Var;
        p41 p41Var;
        ArrayList arrayList;
        int size;
        int i3;
        ArrayList arrayList2;
        zq1 zq1Var;
        int i4;
        int size2;
        int i5;
        boolean z2;
        fz1 fz1Var2;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        List list3;
        boolean z3;
        hx hxVar2;
        p41 p41Var2;
        int i11;
        m71 m71Var;
        CharSequence charSequence2;
        m71 m71Var2;
        this.a = str;
        this.b = d02Var;
        this.c = list;
        this.d = list2;
        this.e = c90Var;
        this.f = hxVar;
        float fB = hxVar.b();
        r8 r8Var = new r8(1);
        ((TextPaint) r8Var).density = fB;
        r8Var.b = ax1.b;
        r8Var.c = 3;
        r8Var.d = um1.d;
        this.g = r8Var;
        boolean zE = al.e(d02Var);
        zq1 zq1Var2 = d02Var.a;
        p41 p41Var3 = d02Var.b;
        if (zE) {
            qt0 qt0Var = j30.a;
            qt0 qt0Var2 = j30.a;
            ns1 ns1VarR = (ns1) qt0Var2.f;
            if (ns1VarR == null) {
                if (g30.d()) {
                    ns1VarR = qt0Var2.r();
                    qt0Var2.f = ns1VarR;
                } else {
                    ns1VarR = xi0.p;
                }
            }
            zBooleanValue = ((Boolean) ns1VarR.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.k = zBooleanValue;
        int i12 = p41Var3.b;
        as0 as0Var = zq1Var2.k;
        if (i12 != 4) {
            if (i12 != 5) {
                if (i12 == 1) {
                    i = 0;
                } else if (i12 == 2) {
                    i = 1;
                } else {
                    if (i12 != 3 && i12 != 0) {
                        yc.l("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((as0Var == null || (locale = ((zr0) as0Var.e.get(0)).a) == null) ? Locale.getDefault() : locale);
                    i = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        this.l = i;
        u6 u6Var = new u6(this);
        uz1 uz1Var = p41Var3.i;
        uz1Var = uz1Var == null ? uz1.c : uz1Var;
        r8Var.setFlags(uz1Var.b ? r8Var.getFlags() | 128 : r8Var.getFlags() & (-129));
        int i13 = uz1Var.a;
        if (i13 == 1) {
            r8Var.setFlags(r8Var.getFlags() | 64);
            r8Var.setHinting(0);
        } else if (i13 == 2) {
            r8Var.getFlags();
            r8Var.setHinting(1);
        } else if (i13 == 3) {
            r8Var.getFlags();
            r8Var.setHinting(0);
        } else {
            r8Var.getFlags();
        }
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj = null;
                break;
            }
            obj = list.get(i14);
            if (((gb) obj).a instanceof zq1) {
                break;
            } else {
                i14++;
            }
        }
        boolean z4 = obj != null;
        long j2 = zq1Var2.b;
        aa0 aa0Var = zq1Var2.c;
        y90 y90Var = zq1Var2.d;
        String str2 = zq1Var2.g;
        as0 as0Var2 = zq1Var2.k;
        cz1 cz1Var = zq1Var2.a;
        dz1 dz1Var = zq1Var2.j;
        long j3 = zq1Var2.h;
        long jB = g02.b(j2);
        boolean z5 = z4;
        if (h02.a(jB, 4294967296L)) {
            r8Var.setTextSize(hxVar.d0(j2));
        } else if (h02.a(jB, 8589934592L)) {
            r8Var.setTextSize(g02.c(j2) * r8Var.getTextSize());
        }
        lv1 lv1Var = zq1Var2.f;
        if (lv1Var == null && y90Var == null && aa0Var == null) {
            z = z5;
        } else {
            aa0 aa0Var2 = aa0Var == null ? aa0.g : aa0Var;
            int i15 = y90Var != null ? y90Var.a : 0;
            z90 z90Var = zq1Var2.e;
            int i16 = z90Var != null ? z90Var.a : 65535;
            v6 v6Var = u6Var.e;
            z = z5;
            d32 d32VarB = ((d90) v6Var.e).b(lv1Var, aa0Var2, i15, i16);
            if (d32VarB instanceof d32) {
                Object obj2 = d32VarB.e;
                obj2.getClass();
                typeface = (Typeface) obj2;
            } else {
                oc ocVar = new oc(d32VarB, v6Var.j);
                v6Var.j = ocVar;
                Object obj3 = ocVar.c;
                obj3.getClass();
                typeface = (Typeface) obj3;
            }
            r8Var.setTypeface(typeface);
        }
        if (as0Var2 != null) {
            as0 as0Var3 = as0.g;
            if (!as0Var2.equals(f71.a.j())) {
                ArrayList arrayList3 = new ArrayList(ql.Y(as0Var2, 10));
                Iterator it = as0Var2.e.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((zr0) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                r8Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            r8Var.setFontFeatureSettings(str2);
        }
        if (dz1Var != null && !dz1Var.equals(dz1.c)) {
            r8Var.setTextScaleX(r8Var.getTextScaleX() * dz1Var.a);
            r8Var.setTextSkewX(r8Var.getTextSkewX() + dz1Var.b);
        }
        r8Var.d(cz1Var.b());
        r8Var.c(cz1Var.c(), 9205357640488583168L, cz1Var.a());
        r8Var.f(zq1Var2.n);
        r8Var.g(zq1Var2.m);
        r8Var.e(zq1Var2.p);
        if (h02.a(g02.b(j3), 4294967296L) && g02.c(j3) != 0.0f) {
            float textScaleX = r8Var.getTextScaleX() * r8Var.getTextSize();
            float fD0 = hxVar.d0(j3);
            if (textScaleX != 0.0f) {
                r8Var.setLetterSpacing(fD0 / textScaleX);
            }
        } else if (h02.a(g02.b(j3), 8589934592L)) {
            r8Var.setLetterSpacing(g02.c(j3));
        }
        long j4 = zq1Var2.l;
        df dfVar = zq1Var2.i;
        boolean z6 = z && h02.a(g02.b(j3), 4294967296L) && g02.c(j3) != 0.0f;
        long j5 = vl.g;
        boolean z7 = (vl.c(j4, j5) || vl.c(j4, vl.f)) ? false : true;
        boolean z8 = (dfVar == null || Float.compare(dfVar.a, 0.0f) == 0) ? false : true;
        zq1 zq1Var3 = (z6 || z7 || z8) ? new zq1(0L, 0L, null, null, null, null, null, z6 ? j3 : g02.c, z8 ? dfVar : null, null, null, z7 ? j4 : j5, null, null, 63103) : null;
        List list4 = this.c;
        if (zq1Var3 != null) {
            int size5 = list4.size() + 1;
            ArrayList arrayList4 = new ArrayList(size5);
            int i17 = 0;
            while (i17 < size5) {
                arrayList4.add(i17 == 0 ? new gb(0, this.a.length(), zq1Var3) : (gb) this.c.get(i17 - 1));
                i17++;
            }
            list4 = arrayList4;
        }
        String str3 = this.a;
        float textSize = this.g.getTextSize();
        d02 d02Var2 = this.b;
        List list5 = this.d;
        hx hxVar3 = this.f;
        boolean z9 = this.k;
        s6 s6Var = t6.a;
        if (z9 && g30.d()) {
            a81 a81Var = d02Var2.c;
            u30 u30Var = (a81Var == null || (m71Var2 = a81Var.b) == null) ? null : new u30(m71Var2.b);
            CharSequence charSequenceG = g30.a().g(str3, 0, str3.length(), (u30Var != null && u30Var.a == 2) ? 1 : 0);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (list4.isEmpty() && list5.isEmpty() && xi0.o(d02Var2.b.d, fz1.c)) {
            charSequence2 = charSequence;
            if ((d02Var2.b.c & 1095216660480L) != 0) {
            }
        } else {
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            zq1 zq1Var4 = d02Var2.a;
            p41 p41Var4 = d02Var2.b;
            if (xi0.o(zq1Var4.m, ax1.c)) {
                j = 0;
                spannableString.setSpan(t6.a, 0, str3.length(), 33);
            } else {
                j = 0;
            }
            a81 a81Var2 = d02Var2.c;
            if (((a81Var2 == null || (m71Var = a81Var2.b) == null) ? false : m71Var.a) && p41Var4.f == null) {
                float fA = uc1.A(p41Var4.c, textSize, hxVar3);
                if (!Float.isNaN(fA)) {
                    spannableString.setSpan(new ip0(fA), 0, spannableString.length(), 33);
                }
            } else {
                mp0 mp0Var = p41Var4.f;
                mp0Var = mp0Var == null ? mp0.d : mp0Var;
                float fA2 = uc1.A(p41Var4.c, textSize, hxVar3);
                if (!Float.isNaN(fA2)) {
                    if (spannableString.length() != 0) {
                        if (spannableString.length() == 0) {
                            yc.h("Char sequence is empty.");
                            throw null;
                        }
                        int length = spannableString.charAt(spannableString.length() + (-1)) == '\n' ? spannableString.length() + 1 : spannableString.length();
                        int i18 = length;
                        int i19 = mp0Var.b;
                        i2 = 0;
                        spannableString.setSpan(new np0(fA2, i18, (i19 & 1) > 0, (i19 & 16) > 0, mp0Var.a, mp0Var.c), 0, spannableString.length(), 33);
                    }
                }
                fz1Var = p41Var4.d;
                if (fz1Var == null) {
                    int i20 = i2;
                    long j6 = fz1Var.a;
                    long j7 = fz1Var.b;
                    if ((g02.a(j6, uc1.p(i20)) && g02.a(j7, uc1.p(i20))) || (j6 & 1095216660480L) == j || (j7 & 1095216660480L) == j) {
                        p41Var = p41Var4;
                    } else {
                        long jB2 = g02.b(j6);
                        p41Var = p41Var4;
                        float fD02 = h02.a(jB2, 4294967296L) ? hxVar3.d0(j6) : h02.a(jB2, 8589934592L) ? g02.c(j6) * textSize : 0.0f;
                        long jB3 = g02.b(j7);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fD02), (int) Math.ceil(h02.a(jB3, 4294967296L) ? hxVar3.d0(j7) : h02.a(jB3, 8589934592L) ? g02.c(j7) * textSize : 0.0f)), 0, spannableString.length(), 33);
                    }
                } else {
                    p41Var = p41Var4;
                }
                arrayList = new ArrayList(list4.size());
                size = list4.size();
                for (i3 = 0; i3 < size; i3++) {
                    gb gbVar = (gb) list4.get(i3);
                    Object obj4 = gbVar.a;
                    if (obj4 instanceof zq1) {
                        zq1 zq1Var5 = (zq1) obj4;
                        if (zq1Var5.f != null || zq1Var5.d != null || zq1Var5.c != null || ((zq1) obj4).e != null) {
                            arrayList.add(gbVar);
                        }
                    }
                }
                zq1 zq1Var6 = d02Var2.a;
                lv1 lv1Var2 = zq1Var6.f;
                zq1 zq1Var7 = (lv1Var2 != null && zq1Var6.d == null && zq1Var6.c == null && zq1Var6.e == null) ? null : new zq1(0L, 0L, zq1Var6.c, zq1Var6.d, zq1Var6.e, lv1Var2, null, 0L, null, null, null, 0L, null, null, 65475);
                fs fsVar = new fs(2, spannableString, u6Var);
                if (arrayList.size() <= 1) {
                    int size6 = arrayList.size();
                    int i21 = size6 * 2;
                    int[] iArr = new int[i21];
                    int size7 = arrayList.size();
                    for (int i22 = 0; i22 < size7; i22++) {
                        gb gbVar2 = (gb) arrayList.get(i22);
                        iArr[i22] = gbVar2.b;
                        iArr[i22 + size6] = gbVar2.c;
                    }
                    if (i21 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i21 == 0) {
                        yc.h("Array is empty.");
                        throw null;
                    }
                    int i23 = iArr[0];
                    int i24 = 0;
                    while (i24 < i21) {
                        int i25 = iArr[i24];
                        if (i25 == i23) {
                            arrayList2 = arrayList;
                            zq1Var = zq1Var7;
                            i4 = i24;
                        } else {
                            int size8 = arrayList.size();
                            zq1 zq1VarC = zq1Var7;
                            int i26 = 0;
                            while (i26 < size8) {
                                ArrayList arrayList5 = arrayList;
                                gb gbVar3 = (gb) arrayList.get(i26);
                                zq1 zq1Var8 = zq1Var7;
                                int i27 = gbVar3.b;
                                int i28 = i24;
                                int i29 = gbVar3.c;
                                if (i27 != i29 && ib.b(i23, i25, i27, i29)) {
                                    zq1 zq1Var9 = (zq1) gbVar3.a;
                                    zq1VarC = zq1VarC != null ? zq1VarC.c(zq1Var9) : zq1Var9;
                                }
                                i26++;
                                arrayList = arrayList5;
                                zq1Var7 = zq1Var8;
                                i24 = i28;
                            }
                            arrayList2 = arrayList;
                            zq1Var = zq1Var7;
                            i4 = i24;
                            if (zq1VarC != null) {
                                fsVar.f(zq1VarC, Integer.valueOf(i23), Integer.valueOf(i25));
                            }
                            i23 = i25;
                        }
                        i24 = i4 + 1;
                        arrayList = arrayList2;
                        zq1Var7 = zq1Var;
                    }
                } else if (!arrayList.isEmpty()) {
                    zq1 zq1Var10 = (zq1) ((gb) arrayList.get(0)).a;
                    fsVar.f(zq1Var7 != null ? zq1Var7.c(zq1Var10) : zq1Var10, Integer.valueOf(((gb) arrayList.get(0)).b), Integer.valueOf(((gb) arrayList.get(0)).c));
                }
                size2 = list4.size();
                i5 = 0;
                z2 = false;
                while (i5 < size2) {
                    gb gbVar4 = (gb) list4.get(i5);
                    Object obj5 = gbVar4.a;
                    if (obj5 instanceof zq1) {
                        int i30 = gbVar4.b;
                        int i31 = gbVar4.c;
                        if (i30 < 0 || i30 >= spannableString.length() || i31 <= i30 || i31 > spannableString.length()) {
                            i9 = size2;
                            i10 = i5;
                            list3 = list4;
                            z3 = z2;
                            hxVar2 = hxVar3;
                            p41Var2 = p41Var;
                        } else {
                            zq1 zq1Var11 = (zq1) obj5;
                            long j8 = zq1Var11.h;
                            df dfVar2 = zq1Var11.i;
                            cz1 cz1Var2 = zq1Var11.a;
                            if (dfVar2 != null) {
                                i9 = size2;
                                spannableString.setSpan(new ef(0, dfVar2.a), i30, i31, 33);
                            } else {
                                i9 = size2;
                            }
                            i10 = i5;
                            uc1.C(spannableString, cz1Var2.b(), i30, i31);
                            lh lhVarC = cz1Var2.c();
                            float fA3 = cz1Var2.a();
                            if (lhVarC != null) {
                                if (lhVarC instanceof uq1) {
                                    uc1.C(spannableString, ((uq1) lhVarC).a, i30, i31);
                                } else {
                                    spannableString.setSpan(new sm1((mh) lhVarC, fA3), i30, i31, 33);
                                }
                            }
                            ax1 ax1Var = zq1Var11.m;
                            if (ax1Var != null) {
                                int i32 = ax1Var.a;
                                bx1 bx1Var = new bx1((i32 | 1) == i32, (i32 | 2) == i32);
                                i11 = 33;
                                spannableString.setSpan(bx1Var, i30, i31, 33);
                            } else {
                                i11 = 33;
                            }
                            int i33 = i11;
                            p41Var2 = p41Var;
                            uc1.D(spannableString, zq1Var11.b, hxVar3, i30, i31);
                            String str4 = zq1Var11.g;
                            if (str4 != null) {
                                spannableString.setSpan(new f90(0, str4), i30, i31, i33);
                            }
                            dz1 dz1Var2 = zq1Var11.j;
                            if (dz1Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(dz1Var2.a), i30, i31, i33);
                                spannableString.setSpan(new ef(1, dz1Var2.b), i30, i31, i33);
                            }
                            uc1.E(spannableString, zq1Var11.k, i30, i31);
                            hxVar2 = hxVar3;
                            long j9 = zq1Var11.l;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(lk.l0(j9)), i30, i31, i33);
                            }
                            um1 um1Var = zq1Var11.n;
                            if (um1Var != null) {
                                long j10 = um1Var.b;
                                list3 = list4;
                                int iL0 = lk.l0(um1Var.a);
                                z3 = z2;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = um1Var.c;
                                xm1 xm1Var = new xm1(iL0, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                i33 = 33;
                                spannableString.setSpan(xm1Var, i30, i31, 33);
                            } else {
                                list3 = list4;
                                z3 = z2;
                            }
                            q10 q10Var = zq1Var11.p;
                            if (q10Var != null) {
                                spannableString.setSpan(new r10(q10Var), i30, i31, i33);
                            }
                            z2 = (h02.a(g02.b(j8), 4294967296L) || h02.a(g02.b(j8), 8589934592L)) ? true : z2;
                        }
                        z2 = z3;
                    }
                    i5 = i10 + 1;
                    list4 = list3;
                    p41Var = p41Var2;
                    hxVar3 = hxVar2;
                    size2 = i9;
                }
                List list6 = list4;
                hx hxVar4 = hxVar3;
                p41 p41Var5 = p41Var;
                if (z2) {
                    int size9 = list6.size();
                    int i34 = 0;
                    while (i34 < size9) {
                        List list7 = list6;
                        gb gbVar5 = (gb) list7.get(i34);
                        db dbVar = (db) gbVar5.a;
                        if (dbVar instanceof zq1) {
                            int i35 = gbVar5.b;
                            int i36 = gbVar5.c;
                            if (i35 < 0 || i35 >= spannableString.length() || i36 <= i35 || i36 > spannableString.length()) {
                                i7 = size9;
                                i8 = i34;
                            } else {
                                long j11 = ((zq1) dbVar).h;
                                long jB4 = g02.b(j11);
                                i7 = size9;
                                i8 = i34;
                                Object mo0Var = h02.a(jB4, 4294967296L) ? new mo0(hxVar4.d0(j11)) : h02.a(jB4, 8589934592L) ? new lo0(g02.c(j11)) : null;
                                if (mo0Var != null) {
                                    spannableString.setSpan(mo0Var, i35, i36, 33);
                                }
                            }
                        }
                        i34 = i8 + 1;
                        list6 = list7;
                        size9 = i7;
                    }
                }
                List list8 = list6;
                fz1Var2 = p41Var5.d;
                if (fz1Var2 != null) {
                    long j12 = fz1Var2.a;
                    long jB5 = g02.b(j12);
                    if (h02.a(jB5, 4294967296L)) {
                        hxVar4.d0(j12);
                    } else if (h02.a(jB5, 8589934592L)) {
                        g02.c(j12);
                    }
                }
                size3 = list8.size();
                for (i6 = 0; i6 < size3; i6++) {
                    Object obj6 = ((gb) list8.get(i6)).a;
                }
                charSequence2 = spannableString;
                if (list5.size() > 0) {
                    gb gbVar6 = (gb) list5.get(0);
                    if (gbVar6.a != null) {
                        yc.d();
                        throw null;
                    }
                    for (Object obj7 : spannableString.getSpans(gbVar6.b, gbVar6.c, b32.class)) {
                        spannableString.removeSpan((b32) obj7);
                    }
                    throw null;
                }
            }
            i2 = 0;
            fz1Var = p41Var4.d;
            if (fz1Var == null) {
            }
            arrayList = new ArrayList(list4.size());
            size = list4.size();
            while (i3 < size) {
            }
            zq1 zq1Var62 = d02Var2.a;
            lv1 lv1Var22 = zq1Var62.f;
            if (lv1Var22 != null) {
                fs fsVar2 = new fs(2, spannableString, u6Var);
                if (arrayList.size() <= 1) {
                }
                size2 = list4.size();
                i5 = 0;
                z2 = false;
                while (i5 < size2) {
                }
                List list62 = list4;
                hx hxVar42 = hxVar3;
                p41 p41Var52 = p41Var;
                if (z2) {
                }
                List list82 = list62;
                fz1Var2 = p41Var52.d;
                if (fz1Var2 != null) {
                }
                size3 = list82.size();
                while (i6 < size3) {
                }
                charSequence2 = spannableString;
                if (list5.size() > 0) {
                }
            }
        }
        this.h = charSequence2;
        this.i = new fl0(charSequence2, this.g, this.l);
    }

    @Override // defpackage.n41
    public final float a() {
        fl0 fl0Var = this.i;
        float f = fl0Var.e;
        TextPaint textPaint = fl0Var.b;
        if (!Float.isNaN(f)) {
            return fl0Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = fl0Var.a;
        lineInstance.setText(new zj(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, nu0.j);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new rh0(i, next, 1));
            } else {
                rh0 rh0Var = (rh0) priorityQueue.peek();
                if (rh0Var != null && rh0Var.f - rh0Var.e < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new rh0(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                yc.m();
                return 0.0f;
            }
            rh0 rh0Var2 = (rh0) it.next();
            desiredWidth = Layout.getDesiredWidth(fl0Var.b(), rh0Var2.e, rh0Var2.f, textPaint);
            while (it.hasNext()) {
                rh0 rh0Var3 = (rh0) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(fl0Var.b(), rh0Var3.e, rh0Var3.f, textPaint));
            }
        }
        fl0Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.n41
    public final boolean b() {
        oc ocVar = this.j;
        if (ocVar != null ? ocVar.t() : false) {
            return true;
        }
        if (!this.k && al.e(this.b)) {
            qt0 qt0Var = j30.a;
            qt0 qt0Var2 = j30.a;
            ns1 ns1VarR = (ns1) qt0Var2.f;
            if (ns1VarR == null) {
                if (g30.d()) {
                    ns1VarR = qt0Var2.r();
                    qt0Var2.f = ns1VarR;
                } else {
                    ns1VarR = xi0.p;
                }
            }
            if (((Boolean) ns1VarR.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n41
    public final float c() {
        return this.i.c();
    }
}
