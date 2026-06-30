package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class wr implements kt, a01, z01 {
    public final /* synthetic */ int e;

    public /* synthetic */ wr(int i) {
        this.e = i;
    }

    public static final float i(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static long j(fu fuVar, float f) {
        float[] fArr = fuVar.a;
        int i = 1;
        long jA = z60.a(fArr[0], fArr[1]);
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long jC = fuVar.c(f4);
            float fZ = hk.z(hk.I(jC, jA));
            if (fZ >= f3) {
                return z60.a(f4 - ((1.0f - (f3 / fZ)) / 3.0f), f);
            }
            f3 -= fZ;
            f2 += fZ;
            if (i == 3) {
                return z60.a(1.0f, f2);
            }
            i++;
            jA = jC;
        }
    }

    public static pg1 l(wr wrVar, List list, int i, int i2) {
        char c;
        long j;
        List listK;
        float f;
        float f2;
        ArrayList arrayList;
        int i3;
        char c2 = ' ';
        long j2 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
        int i4 = 0;
        float f3 = 360.0f;
        if ((i2 & 8) == 0) {
            aq0 aq0VarN = hk.n();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                char c3 = c2;
                gu0 gu0Var = (gu0) list.get(i5);
                wr wrVar2 = hu0.a;
                long j3 = j2;
                long jD = w01.d(gu0Var.a, jFloatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (jD & j3)), Float.intBitsToFloat((int) (jD >> c3)))) * 180.0f) / 3.1415927f));
                i5++;
                c2 = c3;
                j2 = j3;
            }
            c = c2;
            j = j2;
            float f4 = 3.1415927f;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(Float.valueOf(w01.c(w01.d(((gu0) list.get(i6)).a, jFloatToRawIntBits))));
            }
            int i7 = i * 2;
            float f5 = 360.0f / i7;
            int i8 = 0;
            while (i8 < i7) {
                Iterator it = new rh0(i4, list.size() - 1, 1).iterator();
                while (true) {
                    qh0 qh0Var = (qh0) it;
                    if (qh0Var.g) {
                        int iNextInt = qh0Var.nextInt();
                        int i9 = i8 % 2;
                        if (i9 != 0) {
                            iNextInt = (list.size() - 1) - iNextInt;
                        }
                        if (iNextInt > 0 || i9 == 0) {
                            wr wrVar3 = hu0.a;
                            f = f4;
                            float fFloatValue = (((i8 * f5) + (i9 == 0 ? ((Number) arrayList2.get(iNextInt)).floatValue() : (((Number) arrayList2.get(i4)).floatValue() * 2.0f) + (f5 - ((Number) arrayList2.get(iNextInt)).floatValue()))) / f3) * 2.0f * f;
                            f2 = f3;
                            arrayList = arrayList2;
                            double d = fFloatValue;
                            i3 = i8;
                            aq0VarN.add(new gu0(w01.e(w01.f(((Number) arrayList3.get(iNextInt)).floatValue(), (((long) Float.floatToRawIntBits((float) Math.sin(d))) & j) | (((long) Float.floatToRawIntBits((float) Math.cos(d))) << c)), jFloatToRawIntBits), ((gu0) list.get(iNextInt)).b));
                        } else {
                            f = f4;
                            i3 = i8;
                            f2 = f3;
                            arrayList = arrayList2;
                        }
                        i8 = i3;
                        f3 = f2;
                        f4 = f;
                        arrayList2 = arrayList;
                        i4 = 0;
                    }
                }
                i8++;
                i4 = 0;
            }
            listK = hk.k(aq0VarN);
        } else {
            c = ' ';
            j = 4294967295L;
            int size3 = list.size();
            rh0 rh0VarO0 = lk.o0(0, size3 * i);
            ArrayList arrayList4 = new ArrayList(ql.Y(rh0VarO0, 10));
            Iterator it2 = rh0VarO0.iterator();
            while (true) {
                qh0 qh0Var2 = (qh0) it2;
                if (!qh0Var2.g) {
                    break;
                }
                int iNextInt2 = qh0Var2.nextInt();
                wr wrVar4 = hu0.a;
                int i10 = iNextInt2 % size3;
                long jD2 = w01.d(((gu0) list.get(i10)).a, jFloatToRawIntBits);
                int i11 = (int) (jD2 >> 32);
                long j4 = jFloatToRawIntBits;
                double d2 = ((((iNextInt2 / size3) * 360.0f) / i) / 360.0f) * 2.0f * 3.1415927f;
                int i12 = (int) (jD2 & 4294967295L);
                arrayList4.add(new gu0(w01.e((((long) Float.floatToRawIntBits((Float.intBitsToFloat(i11) * ((float) Math.cos(d2))) - (Float.intBitsToFloat(i12) * ((float) Math.sin(d2))))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i12) * ((float) Math.cos(d2))) + (Float.intBitsToFloat(i11) * ((float) Math.sin(d2))))) & 4294967295L), j4), ((gu0) list.get(i10)).b));
                jFloatToRawIntBits = j4;
                size3 = size3;
            }
            listK = arrayList4;
        }
        long j5 = jFloatToRawIntBits;
        int size4 = listK.size() * 2;
        float[] fArr = new float[size4];
        for (int i13 = 0; i13 < size4; i13++) {
            long j6 = ((gu0) listK.get(i13 / 2)).a;
            fArr[i13] = Float.intBitsToFloat((int) (i13 % 2 == 0 ? j6 >> c : j6 & j));
        }
        aq0 aq0VarN2 = hk.n();
        Iterator it3 = listK.iterator();
        while (it3.hasNext()) {
            aq0VarN2.add(((gu0) it3.next()).b);
        }
        return af1.a(fArr, ft.b, hk.k(aq0VarN2), Float.intBitsToFloat((int) (j5 >> c)), Float.intBitsToFloat((int) (j5 & j)));
    }

    public static pg1 m() {
        pg1 pg1Var = hu0.m;
        if (pg1Var != null) {
            return pg1Var;
        }
        pg1 pg1VarB = xc.F(12, hu0.c).c(new l2(hu0.e, 2)).b();
        hu0.m = pg1VarB;
        return pg1VarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(m30 m30Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z2) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z2) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z2 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z3 = true;
                                    }
                                } else {
                                    if (z3) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                b32[] b32VarArr = (b32[]) editable.getSpans(selectionStart, iMin, b32.class);
                if (b32VarArr != null && b32VarArr.length > 0) {
                    for (b32 b32Var : b32VarArr) {
                        int spanStart = editable.getSpanStart(b32Var);
                        int spanEnd = editable.getSpanEnd(b32Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    m30Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    m30Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.a01
    public boolean a(sv0 sv0Var) {
        return false;
    }

    @Override // defpackage.a01
    public int b() {
        return 8;
    }

    @Override // defpackage.a01
    public boolean c(sv0 sv0Var) {
        return nu0.z(pd1.d(bl.P(sv0Var), false));
    }

    @Override // defpackage.a01
    public void d(ql0 ql0Var, long j, td0 td0Var, int i, boolean z) {
        xz0 xz0Var = ql0Var.I;
        c01 c01Var = xz0Var.d;
        ue1 ue1Var = c01.U;
        xz0Var.d.b1(c01.Y, c01Var.T0(j), td0Var, 1, z);
    }

    @Override // defpackage.a01
    public boolean f(td0 td0Var, ql0 ql0Var) {
        return false;
    }

    @Override // defpackage.a01
    public boolean h(ql0 ql0Var) {
        nl1 nl1VarW = ql0Var.w();
        boolean z = false;
        if (nl1VarW != null && nl1VarW.h) {
            z = true;
        }
        return !z;
    }

    public long k(long j, long j2) {
        switch (this.e) {
            case 0:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = ni1.a;
                return jFloatToRawIntBits;
            case 1:
                float fI = el.i(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI)) & 4294967295L);
                int i2 = ni1.a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i3 = ni1.a;
                    return jFloatToRawIntBits3;
                }
                float fI2 = el.i(j, j2);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fI2)) << 32) | (((long) Float.floatToRawIntBits(fI2)) & 4294967295L);
                int i4 = ni1.a;
                return jFloatToRawIntBits4;
        }
    }

    public Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public pg1 o() {
        pg1 pg1Var = hu0.n;
        if (pg1Var != null) {
            return pg1Var;
        }
        pg1 pg1VarB = l(this, hk.H(new gu0((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & 4294967295L), new ft(2, 0.053f)), new gu0((((long) Float.floatToRawIntBits(0.176f)) << 32) | (((long) Float.floatToRawIntBits(0.055f)) & 4294967295L), new ft(2, 0.053f))), 10, 12).b();
        hu0.n = pg1VarB;
        return pg1VarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0225, code lost:
    
        if (defpackage.ek0.a(defpackage.hk.d(r15.getKeyCode()), defpackage.ek0.o) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0331, code lost:
    
        if (defpackage.ek0.a(r14, defpackage.ek0.N) == false) goto L302;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fk0 q(KeyEvent keyEvent) {
        fk0 fk0Var;
        int i = this.e;
        fk0 fk0Var2 = fk0.SELECT_LINE_START;
        fk0 fk0Var3 = fk0.SELECT_LINE_END;
        fk0 fk0Var4 = fk0.NEW_LINE;
        fk0 fk0Var5 = fk0.DELETE_PREV_CHAR;
        switch (i) {
            case 16:
                int iF = bk.F(keyEvent);
                fk0 fk0Var6 = fk0.REDO;
                if (iF != 10) {
                    fk0 fk0Var7 = fk0.COPY;
                    fk0 fk0Var8 = fk0.CUT;
                    fk0 fk0Var9 = fk0.PASTE;
                    if (iF == 2) {
                        long jD = hk.d(keyEvent.getKeyCode());
                        if (!ek0.a(jD, ek0.j) && !ek0.a(jD, ek0.x) && !ek0.a(jD, ek0.N)) {
                            if (!ek0.a(jD, ek0.l)) {
                                if (!ek0.a(jD, ek0.m)) {
                                    if (ek0.a(jD, ek0.i)) {
                                        return fk0.SELECT_ALL;
                                    }
                                    if (!ek0.a(jD, ek0.n)) {
                                        if (ek0.a(jD, ek0.o)) {
                                            return fk0.UNDO;
                                        }
                                        return null;
                                    }
                                    return fk0Var6;
                                }
                                return fk0Var8;
                            }
                            return fk0Var9;
                        }
                        return fk0Var7;
                    }
                    if (iF == 8) {
                        long jD2 = hk.d(keyEvent.getKeyCode());
                        if (ek0.a(jD2, ek0.f) || ek0.a(jD2, ek0.H)) {
                            return fk0.SELECT_LEFT_CHAR;
                        }
                        if (ek0.a(jD2, ek0.g) || ek0.a(jD2, ek0.I)) {
                            return fk0.SELECT_RIGHT_CHAR;
                        }
                        if (ek0.a(jD2, ek0.d) || ek0.a(jD2, ek0.F)) {
                            return fk0.SELECT_UP;
                        }
                        if (ek0.a(jD2, ek0.e) || ek0.a(jD2, ek0.G)) {
                            return fk0.SELECT_DOWN;
                        }
                        if (ek0.a(jD2, ek0.C) || ek0.a(jD2, ek0.L)) {
                            return fk0.SELECT_PAGE_UP;
                        }
                        if (ek0.a(jD2, ek0.D) || ek0.a(jD2, ek0.M)) {
                            return fk0.SELECT_PAGE_DOWN;
                        }
                        if (ek0.a(jD2, ek0.v) || ek0.a(jD2, ek0.J)) {
                            return fk0Var2;
                        }
                        if (ek0.a(jD2, ek0.w) || ek0.a(jD2, ek0.K)) {
                            return fk0Var3;
                        }
                        if (!ek0.a(jD2, ek0.x)) {
                            break;
                        }
                        return fk0Var9;
                    }
                    if (iF == 0) {
                        long jD3 = hk.d(keyEvent.getKeyCode());
                        if (ek0.a(jD3, ek0.f) || ek0.a(jD3, ek0.H)) {
                            return fk0.LEFT_CHAR;
                        }
                        if (ek0.a(jD3, ek0.g) || ek0.a(jD3, ek0.I)) {
                            return fk0.RIGHT_CHAR;
                        }
                        if (ek0.a(jD3, ek0.d) || ek0.a(jD3, ek0.F)) {
                            return fk0.UP;
                        }
                        if (ek0.a(jD3, ek0.e) || ek0.a(jD3, ek0.G)) {
                            return fk0.DOWN;
                        }
                        if (ek0.a(jD3, ek0.h)) {
                            return fk0.CENTER;
                        }
                        if (ek0.a(jD3, ek0.C) || ek0.a(jD3, ek0.L)) {
                            return fk0.PAGE_UP;
                        }
                        if (ek0.a(jD3, ek0.D) || ek0.a(jD3, ek0.M)) {
                            return fk0.PAGE_DOWN;
                        }
                        if (ek0.a(jD3, ek0.v) || ek0.a(jD3, ek0.J)) {
                            return fk0.LINE_START;
                        }
                        if (ek0.a(jD3, ek0.w) || ek0.a(jD3, ek0.K)) {
                            return fk0.LINE_END;
                        }
                        if (ek0.a(jD3, ek0.r) || ek0.a(jD3, ek0.E)) {
                            return fk0Var4;
                        }
                        if (ek0.a(jD3, ek0.s)) {
                            return fk0Var5;
                        }
                        if (ek0.a(jD3, ek0.t)) {
                            return fk0.DELETE_NEXT_CHAR;
                        }
                        if (!ek0.a(jD3, ek0.A)) {
                            if (!ek0.a(jD3, ek0.y)) {
                                if (!ek0.a(jD3, ek0.z)) {
                                    if (ek0.a(jD3, ek0.p)) {
                                        return fk0.TAB;
                                    }
                                }
                                return fk0Var7;
                            }
                            return fk0Var8;
                        }
                        return fk0Var9;
                    }
                    return null;
                }
                break;
                break;
            default:
                int iF2 = bk.F(keyEvent);
                if (iF2 == 9) {
                    long jD4 = hk.d(keyEvent.getKeyCode());
                    fk0Var = ek0.a(jD4, ek0.f) ? fk0.SELECT_LINE_LEFT : ek0.a(jD4, ek0.g) ? fk0.SELECT_LINE_RIGHT : ek0.a(jD4, ek0.d) ? fk0.SELECT_HOME : ek0.a(jD4, ek0.e) ? fk0.SELECT_END : null;
                } else if (iF2 == 1) {
                    long jD5 = hk.d(keyEvent.getKeyCode());
                    if (ek0.a(jD5, ek0.f)) {
                        fk0Var = fk0.LINE_LEFT;
                    } else if (ek0.a(jD5, ek0.g)) {
                        fk0Var = fk0.LINE_RIGHT;
                    } else if (ek0.a(jD5, ek0.d)) {
                        fk0Var = fk0.HOME;
                    } else if (ek0.a(jD5, ek0.e)) {
                        fk0Var = fk0.END;
                    } else if (ek0.a(jD5, ek0.s)) {
                        fk0Var = fk0.DELETE_FROM_LINE_START;
                    }
                }
                if (fk0Var != null) {
                    return fk0Var;
                }
                qt0 qt0Var = u4.Z;
                int iF3 = bk.F(keyEvent);
                long jD6 = hk.d(keyEvent.getKeyCode());
                if (ek0.a(jD6, ek0.s)) {
                    fk0Var4 = (iF3 == 0 || iF3 == 8 || iF3 == 12) ? fk0Var5 : (iF3 == 2 || iF3 == 10) ? fk0.DELETE_PREV_WORD : null;
                } else if ((!ek0.a(jD6, ek0.r) && !ek0.a(jD6, ek0.E)) || (iF3 != 0 && iF3 != 8 && iF3 != 2 && iF3 != 10)) {
                }
                if (fk0Var4 != null) {
                    return fk0Var4;
                }
                int iF4 = bk.F(keyEvent);
                if (iF4 == 10) {
                    long jD7 = hk.d(keyEvent.getKeyCode());
                    fk0Var2 = (ek0.a(jD7, ek0.f) || ek0.a(jD7, ek0.H)) ? fk0.SELECT_LEFT_WORD : (ek0.a(jD7, ek0.g) || ek0.a(jD7, ek0.I)) ? fk0.SELECT_RIGHT_WORD : (ek0.a(jD7, ek0.d) || ek0.a(jD7, ek0.F)) ? fk0.SELECT_PREV_PARAGRAPH : (ek0.a(jD7, ek0.e) || ek0.a(jD7, ek0.G)) ? fk0.SELECT_NEXT_PARAGRAPH : null;
                } else if (iF4 == 2) {
                    long jD8 = hk.d(keyEvent.getKeyCode());
                    if (ek0.a(jD8, ek0.f) || ek0.a(jD8, ek0.H)) {
                        fk0Var2 = fk0.LEFT_WORD;
                    } else if (ek0.a(jD8, ek0.g) || ek0.a(jD8, ek0.I)) {
                        fk0Var2 = fk0.RIGHT_WORD;
                    } else if (ek0.a(jD8, ek0.d) || ek0.a(jD8, ek0.F)) {
                        fk0Var2 = fk0.PREV_PARAGRAPH;
                    } else if (ek0.a(jD8, ek0.e) || ek0.a(jD8, ek0.G)) {
                        fk0Var2 = fk0.NEXT_PARAGRAPH;
                    } else if (ek0.a(jD8, ek0.k)) {
                        fk0Var2 = fk0Var5;
                    } else if (ek0.a(jD8, ek0.t)) {
                        fk0Var2 = fk0.DELETE_NEXT_WORD;
                    } else if (ek0.a(jD8, ek0.B)) {
                        fk0Var2 = fk0.DESELECT;
                    }
                } else if (iF4 == 8) {
                    long jD9 = hk.d(keyEvent.getKeyCode());
                    if (!ek0.a(jD9, ek0.v) && !ek0.a(jD9, ek0.J)) {
                        if (ek0.a(jD9, ek0.w) || ek0.a(jD9, ek0.K)) {
                            fk0Var2 = fk0Var3;
                        }
                    }
                } else if (iF4 == 1 && ek0.a(hk.d(keyEvent.getKeyCode()), ek0.t)) {
                    fk0Var2 = fk0.DELETE_TO_LINE_END;
                }
                return fk0Var2 == null ? ((wr) qt0Var.f).q(keyEvent) : fk0Var2;
        }
    }

    @Override // defpackage.z01
    public int e(int i) {
        return i;
    }

    @Override // defpackage.z01
    public int g(int i) {
        return i;
    }
}
