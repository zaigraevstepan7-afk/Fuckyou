package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import com.reddit.secondpage.R;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class el {
    public static final int a = 9;
    public static final int b = 10;
    public static final int c = 12;

    public static final ip A(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (ip) weakReference.get();
        }
        return null;
    }

    public static final float B(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final void C(il0 il0Var) {
        bl.N(il0Var, 2).d1();
    }

    public static final void D(il0 il0Var) {
        bl.P(il0Var).G();
    }

    public static final boolean E(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final boolean F(long j) {
        return (j & 2) != 0;
    }

    public static final boolean G(long j) {
        return (j & 1) != 0;
    }

    public static final boolean H(ql0 ql0Var) {
        int iOrdinal = ql0Var.J.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            ez1.a();
                            return false;
                        }
                        ql0 ql0VarU = ql0Var.u();
                        if (ql0VarU != null) {
                            return H(ql0VarU);
                        }
                        yc.p("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void I(long j, hb hbVar, boolean z, n nVar) {
        if (z) {
            int i = wz1.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(hbVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < hbVar.f.length() ? Character.codePointAt(hbVar, iCharCount2) : 10;
            if (bk.N(iCodePointBefore) && (bk.M(iCodePointAt) || bk.L(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(hbVar, iCharCount);
                    }
                } while (bk.N(iCodePointBefore));
                j = af1.g(iCharCount, iCharCount2);
            } else if (bk.N(iCodePointAt) && (bk.M(iCodePointBefore) || bk.L(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == hbVar.f.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(hbVar, iCharCount2);
                    }
                } while (bk.N(iCodePointAt));
                j = af1.g(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        nVar.i(new hd0(new w20[]{new rm1(i2, i2), new ex(wz1.d(j), 0)}));
    }

    public static final Object J(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b4 A[PHI: r14 r15
      0x02b4: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:106:0x0268, B:119:0x02b2] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:106:0x0268, B:119:0x02b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0450  */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void K(ViewStructure viewStructure, ql0 ql0Var, AutofillId autofillId, String str, sc1 sc1Var) {
        int i;
        ?? r38;
        long j;
        long j2;
        char c2;
        long j3;
        boolean zBooleanValue;
        b5 b5Var;
        hb hbVar;
        y5 y5Var;
        e12 e12Var;
        yf1 yf1Var;
        boolean z;
        as asVar;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        boolean z3;
        String[] strArrA;
        String strH;
        String[] strArrA2;
        String[] strArrA3;
        zx0 zx0Var;
        int i2;
        int i3;
        zx0 zx0Var2;
        boolean z4;
        b5 b5Var2;
        e12 e12Var2;
        hb hbVar2;
        y5 y5Var2;
        yf1 yf1Var2;
        boolean z5;
        zl1 zl1Var = vl1.a;
        zl1 zl1Var2 = ml1.a;
        nl1 nl1VarW = ql0Var.w();
        boolean z6 = true;
        if (nl1VarW == null || (zx0Var2 = nl1VarW.e) == null) {
            i = 2;
            r38 = 1;
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            b5Var = null;
            hbVar = null;
            y5Var = null;
            e12Var = null;
            yf1Var = null;
            z = false;
            asVar = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        } else {
            j = 128;
            Object[] objArr = zx0Var2.b;
            Object[] objArr2 = zx0Var2.c;
            long[] jArr = zx0Var2.a;
            j2 = 255;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i4 = 0;
                b5Var2 = null;
                z = false;
                e12Var2 = null;
                hbVar2 = null;
                y5Var2 = null;
                asVar = null;
                bool = null;
                yf1Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c2 = 7;
                while (true) {
                    long j4 = jArr[i4];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj2 = objArr[i7];
                                Object obj3 = objArr2[i7];
                                zl1 zl1Var3 = (zl1) obj2;
                                if (xi0.o(zl1Var3, vl1.s)) {
                                    obj3.getClass();
                                    b5Var2 = (b5) obj3;
                                } else if (xi0.o(zl1Var3, vl1.a)) {
                                    obj3.getClass();
                                    String str2 = (String) pl.d0((List) obj3);
                                    if (str2 != null) {
                                        viewStructure.setContentDescription(str2);
                                    }
                                } else if (xi0.o(zl1Var3, vl1.r)) {
                                    obj3.getClass();
                                    asVar = (as) obj3;
                                } else if (xi0.o(zl1Var3, vl1.t)) {
                                    obj3.getClass();
                                    y5Var2 = (y5) obj3;
                                } else if (xi0.o(zl1Var3, vl1.G)) {
                                    obj3.getClass();
                                    hbVar2 = (hb) obj3;
                                } else if (xi0.o(zl1Var3, vl1.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (xi0.o(zl1Var3, vl1.P)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (xi0.o(zl1Var3, vl1.L)) {
                                    z2 = z6;
                                } else if (xi0.o(zl1Var3, vl1.o)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (xi0.o(zl1Var3, vl1.z)) {
                                    obj3.getClass();
                                    yf1Var2 = (yf1) obj3;
                                } else if (xi0.o(zl1Var3, vl1.J)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (xi0.o(zl1Var3, vl1.K)) {
                                    obj3.getClass();
                                    e12Var2 = (e12) obj3;
                                } else if (xi0.o(zl1Var3, ml1.b)) {
                                    viewStructure.setClickable(z6);
                                } else if (xi0.o(zl1Var3, ml1.c)) {
                                    viewStructure.setLongClickable(z6);
                                } else if (xi0.o(zl1Var3, ml1.w)) {
                                    viewStructure.setFocusable(z6);
                                } else if (xi0.o(zl1Var3, ml1.k)) {
                                    z = z6;
                                }
                                z5 = z6;
                                if (Build.VERSION.SDK_INT >= 34 && xi0.o(zl1Var3, wl1.c)) {
                                    obj = obj3;
                                }
                            } else {
                                z5 = z6;
                            }
                            j4 >>= 8;
                            i6++;
                            z6 = z5;
                        }
                        z4 = z6;
                        z4 = z4;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        z4 = z6 ? 1 : 0;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    z6 = z4 ? 1 : 0;
                }
            } else {
                z4 = true;
                c2 = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                b5Var2 = null;
                z = false;
                e12Var2 = null;
                hbVar2 = null;
                y5Var2 = null;
                asVar = null;
                bool = null;
                yf1Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            b5Var = b5Var2;
            e12Var = e12Var2;
            hbVar = hbVar2;
            y5Var = y5Var2;
            yf1Var = yf1Var2;
            r38 = z4;
        }
        nl1 nl1VarW2 = ql0Var.w();
        if (nl1VarW2 != null && nl1VarW2.g && !nl1VarW2.h) {
            nl1VarW2 = nl1VarW2.b();
            sx0 sx0Var = new sx0(((iy0) ((qx0) ql0Var.n()).f).g);
            sx0Var.c(ql0Var.n());
            while (sx0Var.i()) {
                ql0 ql0Var2 = (ql0) sx0Var.k(sx0Var.b - 1);
                nl1 nl1VarW3 = ql0Var2.w();
                if (nl1VarW3 != null && !nl1VarW3.g) {
                    nl1VarW2.e(nl1VarW3);
                    if (!nl1VarW3.h) {
                        sx0Var.c(ql0Var2.n());
                    }
                }
            }
        }
        if (nl1VarW2 == null || (zx0Var = nl1VarW2.e) == null) {
            list = null;
        } else {
            Object[] objArr3 = zx0Var.b;
            Object[] objArr4 = zx0Var.c;
            long[] jArr2 = zx0Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 8;
                list = null;
                int i9 = 0;
                while (true) {
                    long j5 = jArr2[i9];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c2) & j5 & j3) != j3) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j5 & j2) < j) {
                                int i12 = (i9 << 3) + i11;
                                Object obj4 = objArr5[i12];
                                Object obj5 = objArr4[i12];
                                i3 = i8;
                                zl1 zl1Var4 = (zl1) obj4;
                                i2 = i11;
                                if (xi0.o(zl1Var4, vl1.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (xi0.o(zl1Var4, vl1.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i2 = i11;
                                i3 = i8;
                            }
                            j5 >>= i3;
                            i11 = i2 + 1;
                            i8 = i3;
                        }
                        if (i10 != i8) {
                            break;
                        }
                        int i13 = i9;
                        if (i13 == length2) {
                            break;
                        }
                        i9 = i13 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            }
        }
        Integer numValueOf = Integer.valueOf(ql0Var.f);
        if (ql0Var.u() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = b5Var != null ? Integer.valueOf(b5Var.a) : z ? Integer.valueOf((int) r38) : e12Var != null ? Integer.valueOf(i) : null;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (hbVar != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(s22.R(hbVar.f)));
        }
        if (y5Var != null) {
            viewStructure.setAutofillValue(y5Var.a);
        }
        if (asVar != null && (strArrA3 = bk.A(asVar)) != null) {
            viewStructure.setAutofillHints(strArrA3);
        }
        ql0 ql0Var3 = (ql0) sc1Var.a.b(ql0Var.f);
        if (ql0Var3 != null && ql0Var3.k != -4) {
            g6 g6Var = sc1Var.c;
            int iE = sc1Var.e(ql0Var3);
            long[] jArr4 = (long[]) g6Var.b;
            long j6 = jArr4[iE];
            long j7 = jArr4[iE + 1];
            int i14 = (int) (j6 >> 32);
            int i15 = (int) j6;
            viewStructure.setDimens(i14, i15, 0, 0, ((int) (j7 >> 32)) - i14, ((int) j7) - i15);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (e12Var == null) {
            if (bool != null && (yf1Var == null || yf1Var.a != 4)) {
                z3 = true;
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            as.a.getClass();
            strArrA = bk.A(zr.b);
            strArrA.getClass();
            if (strArrA.length != 0) {
                yc.h("Array is empty.");
                return;
            }
            boolean z7 = (z2 || ((asVar == null || (strArrA2 = bk.A(asVar)) == null || nd.V(strArrA2, strArrA[0]) < 0) ? false : z3)) ? z3 : false;
            viewStructure.setDataIsSensitive((z7 || zBooleanValue) ? z3 : false);
            viewStructure.setVisibility(ql0Var.I.d.e1() ? 4 : 0);
            if (list != null) {
                int size = list.size();
                String str3 = "";
                for (int i16 = 0; i16 < size; i16++) {
                    str3 = ((Object) str3) + ((hb) list.get(i16)).f + "\n";
                }
                viewStructure.setText(str3);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((qx0) ql0Var.n()).isEmpty() && yf1Var != null && (strH = xc.H(yf1Var.a)) != null) {
                viewStructure.setClassName(strH);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z7) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT < 35 || obj == null) {
                return;
            }
            yc.d();
            return;
        }
        viewStructure.setCheckable(r38);
        viewStructure.setChecked(e12Var == e12.e);
        z3 = true;
        as.a.getClass();
        strArrA = bk.A(zr.b);
        strArrA.getClass();
        if (strArrA.length != 0) {
        }
    }

    public static final View L(sv0 sv0Var) {
        if (!sv0Var.e.r) {
            ng0.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) tl0.a(bl.P(sv0Var));
    }

    public static TypedValue M(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static void N(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            h1.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            h1.g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            P(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            P(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            P(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        P(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void O(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            y20.b(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void P(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final Rect Q(sh0 sh0Var) {
        return new Rect(sh0Var.a, sh0Var.b, sh0Var.c, sh0Var.d);
    }

    public static final RectF R(pc1 pc1Var) {
        return new RectF(pc1Var.a, pc1Var.b, pc1Var.c, pc1Var.d);
    }

    public static final pc1 S(RectF rectF) {
        return new pc1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r4
      0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long T(long j, c20 c20Var) {
        long j2;
        TimeUnit timeUnit = c20Var.e;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            wr wrVar = z10.e;
            long j3 = jConvert2 << 1;
            int i = b20.a;
            return j3;
        }
        if (c20Var.compareTo(c20.MILLISECONDS) < 0) {
            return t(lk.B(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = c20Var.ordinal();
        long j4 = 0;
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                yc.g(c20Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (jAbs == 0) {
            jAbs = j4;
        } else {
            j4 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j2 <= 4611686018427387903L) {
                    jAbs = j2;
                }
            } else if (j2 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j2;
                } else if (iNumberOfLeadingZeros <= 63) {
                    jAbs *= j2;
                    if (jAbs > 4611686018427387903L) {
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
            }
        }
        return t(jSignum * jAbs);
    }

    public static String U(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return s91.l("CornerRadius.circular(", hk.X(Float.intBitsToFloat(i)), ")");
        }
        return "CornerRadius.elliptical(" + hk.X(Float.intBitsToFloat(i)) + ", " + hk.X(Float.intBitsToFloat(i2)) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V(il0 il0Var, sa0 sa0Var) {
        c01 c01Var;
        if (((sv0) il0Var).e.r && (c01Var = bl.N(il0Var, 2).x) != null) {
            c01Var.v1(sa0Var, true);
        }
    }

    public static final fu a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new fu(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f6 b(int i, int i2, int i3) {
        ColorSpace rgb;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        cf1 cf1Var = gm.e;
        c2.u(i3);
        Bitmap.Config configU = c2.u(i3);
        if (xi0.o(cf1Var, cf1Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (xi0.o(cf1Var, gm.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (xi0.o(cf1Var, gm.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (xi0.o(cf1Var, gm.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (xi0.o(cf1Var, gm.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (xi0.o(cf1Var, gm.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (xi0.o(cf1Var, gm.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (xi0.o(cf1Var, gm.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (xi0.o(cf1Var, gm.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (xi0.o(cf1Var, gm.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (xi0.o(cf1Var, gm.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (xi0.o(cf1Var, gm.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (xi0.o(cf1Var, gm.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (xi0.o(cf1Var, gm.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (xi0.o(cf1Var, gm.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!xi0.o(cf1Var, gm.n)) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    ColorSpace colorSpace2 = xi0.o(cf1Var, gm.v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : xi0.o(cf1Var, gm.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    }
                } else if (i4 >= 36) {
                    ColorSpace colorSpace3 = xi0.o(cf1Var, gm.x) ? ColorSpace.get(ColorSpace.Named.OK_LAB) : null;
                    if (colorSpace3 != null) {
                        colorSpace = colorSpace3;
                    }
                } else if (cf1Var != null) {
                    String str = cf1Var.a;
                    float[] fArrA = cf1Var.d.a();
                    t12 t12Var = cf1Var.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = t12Var != null ? new ColorSpace.Rgb.TransferParameters(t12Var.b, t12Var.c, t12Var.d, t12Var.e, t12Var.f, t12Var.g, t12Var.a) : null;
                    float[] fArr = cf1Var.i;
                    final int i5 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, cf1Var.h, fArrA, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = cf1Var.h;
                        final bf1 bf1Var = cf1Var.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: fm
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i6 = i5;
                                sa0 sa0Var = bf1Var;
                                switch (i6) {
                                }
                                return ((Number) sa0Var.i(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final bf1 bf1Var2 = cf1Var.o;
                        final int i6 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: fm
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i62 = i6;
                                sa0 sa0Var = bf1Var2;
                                switch (i62) {
                                }
                                return ((Number) sa0Var.i(Double.valueOf(d))).doubleValue();
                            }
                        }, cf1Var.e, cf1Var.f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new f6(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configU, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new f6(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configU, true, colorSpace));
    }

    public static final void c(Boolean bool, Object obj, xo0 xo0Var, sa0 sa0Var, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(696924721);
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ob0Var.h(sa0Var) ? 2048 : 1024;
        }
        if (ob0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                xo0Var = (xo0) ob0Var.j(tr0.a);
            } else {
                ob0Var.Q();
            }
            int i3 = i2 & (-897);
            ob0Var.q();
            boolean zF = ob0Var.f(bool) | ob0Var.f(obj) | ob0Var.f(xo0Var);
            Object objK = ob0Var.K();
            if (zF || objK == kp.a) {
                objK = new dp0(xo0Var.g());
                ob0Var.f0(objK);
            }
            d(xo0Var, (dp0) objK, sa0Var, ob0Var, (i3 >> 3) & 896);
        } else {
            ob0Var.Q();
        }
        xo0 xo0Var2 = xo0Var;
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fo(bool, obj, xo0Var2, sa0Var, i);
        }
    }

    public static final void d(xo0 xo0Var, dp0 dp0Var, sa0 sa0Var, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(228371534);
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(xo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(dp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(sa0Var) ? 256 : 128;
        }
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = ob0Var.h(dp0Var) | ((i2 & 896) == 256) | ob0Var.h(xo0Var);
            Object objK = ob0Var.K();
            if (zH || objK == kp.a) {
                objK = new kf(xo0Var, dp0Var, sa0Var);
                ob0Var.f0(objK);
            }
            wi0.d(xo0Var, dp0Var, (sa0) objK, ob0Var);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(xo0Var, dp0Var, sa0Var, i, 9);
        }
    }

    public static final void e(String str, String str2, boolean z, sa0 sa0Var, int i, tv0 tv0Var, boolean z2, ob0 ob0Var, int i2) {
        int i3;
        tv0 tv0Var2;
        boolean z3;
        sa0Var.getClass();
        ob0Var.X(1744302933);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.h(sa0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.d(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ob0Var.d(2) ? 131072 : 65536;
        }
        int i4 = i3 | 114819072;
        byte b2 = 0;
        if (ob0Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            ob0Var.W(-280228131);
            ob0Var.p(false);
            eq0 eq0VarM = kd1.m(ob0Var);
            int i5 = i4 >> 12;
            tq0 tq0VarZ = kd1.z(i, 2, ob0Var, (i5 & 14) | 384 | (i5 & 112));
            boolean z4 = ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
            Object objK = ob0Var.K();
            if (z4 || objK == kp.a) {
                objK = new g31(sa0Var, z, b2);
                ob0Var.f0(objK);
            }
            sq0.g((ha0) objK, tq0VarZ, true, null, lk.d0(987715458, new tc(sa0Var, z), ob0Var), lk.d0(1077775748, new td(str2, 3, b2), ob0Var), null, eq0VarM, null, null, lk.d0(1904903385, new td(str, 4, b2), ob0Var), ob0Var, 12779520 | (i5 & 896) | ((i4 >> 15) & 7168), 30528);
            tv0Var2 = qv0.a;
            z3 = true;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            z3 = z2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new h31(str, str2, z, sa0Var, i, tv0Var2, z3, i2);
        }
    }

    public static final void f(tv0 tv0Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        tv0 tv0Var2;
        jo joVar2;
        ob0Var.X(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                v41 v41Var = new v41(null, v20.S);
                ob0Var.f0(v41Var);
                objK = v41Var;
            }
            fy0 fy0Var = (fy0) objK;
            Object objK2 = ob0Var.K();
            if (objK2 == l91Var) {
                objK2 = new n8(fy0Var, 10);
                ob0Var.f0(objK2);
            }
            ha0 ha0Var = (ha0) objK2;
            z81 z81Var = qw.a;
            hf hfVarG = pv.g(c2.i, ob0Var, 6);
            tv0Var2 = tv0Var;
            joVar2 = joVar;
            lk.j(new pb1[]{uw1.b.a(nu0.F(ha0Var, ob0Var, 2)), uw1.a.a(hfVarG)}, lk.d0(1070596993, new pq0(tv0Var2, fy0Var, joVar2, hfVarG, ha0Var), ob0Var), ob0Var, 56);
        } else {
            tv0Var2 = tv0Var;
            joVar2 = joVar;
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new m8(tv0Var2, joVar2, i, i3);
        }
    }

    public static final void g(tv0 tv0Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(155925518);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        int i3 = 3;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ob0Var.j(uw1.a) != null;
            boolean z2 = ob0Var.j(uw1.b) != null;
            if (z && z2) {
                ob0Var.W(-1977187922);
                uu0 uu0VarD = sg.d(v20.f, true);
                int iHashCode = Long.hashCode(ob0Var.T);
                b61 b61VarL = ob0Var.l();
                tv0 tv0VarP = bk.P(ob0Var, tv0Var);
                ep.c.getClass();
                zp zpVar = dp.b;
                ob0Var.Z();
                if (ob0Var.S) {
                    ob0Var.k(zpVar);
                } else {
                    ob0Var.i0();
                }
                xc.E(dp.f, ob0Var, uu0VarD);
                xc.E(dp.e, ob0Var, b61VarL);
                xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
                xc.C(ob0Var, dp.h);
                xc.E(dp.d, ob0Var, tv0VarP);
                joVar.h(ob0Var, Integer.valueOf((i2 >> 3) & 14));
                ob0Var.p(true);
                ob0Var.p(false);
            } else if (z) {
                ob0Var.W(-1976997706);
                nu0.f(tv0Var, joVar, ob0Var, i2 & 126);
                ob0Var.p(false);
            } else if (z2) {
                ob0Var.W(-1976846922);
                qw.d(tv0Var, joVar, ob0Var, i2 & 126);
                ob0Var.p(false);
            } else {
                ob0Var.W(-1976716505);
                f(tv0Var, joVar, ob0Var, i2 & 126);
                ob0Var.p(false);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new m8(tv0Var, joVar, i, i3);
        }
    }

    public static final long h(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : lk.B(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final float i(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final boolean j(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final sv0 k(xw xwVar, int i) {
        sv0 sv0Var = ((sv0) xwVar).e.j;
        if (sv0Var == null || (sv0Var.h & i) == 0) {
            return null;
        }
        while (sv0Var != null) {
            int i2 = sv0Var.g;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return sv0Var;
            }
            sv0Var = sv0Var.j;
        }
        return null;
    }

    public static IOException l(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException m(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? l(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : parentFile.canWrite() ? l(file, iOException) : l(file, iOException) : l(file, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(ev1 ev1Var, f81 f81Var, ye yeVar) {
        da0 da0Var;
        wt wtVar;
        int size;
        int i;
        if (yeVar instanceof da0) {
            da0Var = (da0) yeVar;
            int i2 = da0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                da0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                da0Var = new da0(yeVar);
            }
        }
        Object objA = da0Var.j;
        int i3 = da0Var.k;
        if (i3 == 0) {
            xc.G(objA);
            List list = ev1Var.j.w.a;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((l81) list.get(i4)).d) {
                    da0Var.h = ev1Var;
                    da0Var.i = f81Var;
                    da0Var.k = 1;
                    objA = ev1Var.a(f81Var, da0Var);
                    wtVar = wt.e;
                    if (objA == wtVar) {
                    }
                    List list2 = ((e81) objA).a;
                    size = list2.size();
                    i = 0;
                    while (i < size) {
                    }
                    return t32.a;
                }
            }
            return t32.a;
        }
        if (i3 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f81 f81Var2 = da0Var.i;
        ev1 ev1Var2 = da0Var.h;
        xc.G(objA);
        f81Var = f81Var2;
        ev1Var = ev1Var2;
        List list22 = ((e81) objA).a;
        size = list22.size();
        i = 0;
        while (i < size) {
            if (((l81) list22.get(i)).d) {
                da0Var.h = ev1Var;
                da0Var.i = f81Var;
                da0Var.k = 1;
                objA = ev1Var.a(f81Var, da0Var);
                wtVar = wt.e;
                if (objA == wtVar) {
                    return wtVar;
                }
                List list222 = ((e81) objA).a;
                size = list222.size();
                i = 0;
                while (i < size) {
                }
            } else {
                i++;
            }
        }
        return t32.a;
    }

    public static final Object o(q81 q81Var, wa0 wa0Var, ks ksVar) {
        Object objL0 = ((fv1) q81Var).L0(new ea0(ksVar.e(), wa0Var, null, 0), ksVar);
        return objL0 == wt.e ? objL0 : t32.a;
    }

    public static final void p(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                al.h(th, th2);
            }
        }
    }

    public static final fy0 q(jx0 jx0Var, ob0 ob0Var, int i) {
        Object objK = ob0Var.K();
        l91 l91Var = kp.a;
        if (objK == l91Var) {
            objK = xc.B(Boolean.FALSE);
            ob0Var.f0(objK);
        }
        fy0 fy0Var = (fy0) objK;
        int i2 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && ob0Var.f(jx0Var)) || (i & 6) == 4;
        Object objK2 = ob0Var.K();
        if (z || objK2 == l91Var) {
            objK2 = new f80(jx0Var, fy0Var, null, i2);
            ob0Var.f0(objK2);
        }
        wi0.i((wa0) objK2, ob0Var, jx0Var);
        return fy0Var;
    }

    public static final int r(long j, long j2) {
        boolean zG = G(j);
        if (zG != G(j2)) {
            return zG ? -1 : 1;
        }
        return (Math.min(B(j), B(j2)) >= 0.0f && F(j) != F(j2)) ? F(j) ? -1 : 1 : (int) Math.signum(B(j) - B(j2));
    }

    public static int s(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final long t(long j) {
        long j2 = (j << 1) + 1;
        z10.e.getClass();
        int i = b20.a;
        return j2;
    }

    public static final boolean u(long j, long j2) {
        return j == j2;
    }

    public static int v(HandwritingGesture handwritingGesture, n nVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        nVar.i(new in(fallbackText, 1));
        return 5;
    }

    public static final int w(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objS = af1.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return i3;
    }

    public static final int x(int i, kn0 kn0Var, Object obj) {
        int iB;
        return (obj == null || kn0Var.c() == 0 || (i < kn0Var.c() && obj.equals(kn0Var.d(i))) || (iB = kn0Var.d.b(obj)) == -1) ? i : iB;
    }

    public static final View y(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(w(view, R.id.view_tree_lifecycle_owner), w(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (A(view) == null) {
                i++;
                Object objS = af1.s(view);
                View view4 = view2;
                view2 = view;
                view = objS instanceof View ? (View) objS : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final ArrayList z(pi0 pi0Var) {
        pi0Var.getClass();
        ql0 ql0VarC0 = ((ws0) pi0Var).C0();
        boolean zH = H(ql0VarC0);
        qx0 qx0Var = (qx0) ql0VarC0.o();
        iy0 iy0Var = (iy0) qx0Var.f;
        ArrayList arrayList = new ArrayList(iy0Var.g);
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ql0 ql0Var = (ql0) qx0Var.get(i2);
            arrayList.add(zH ? ql0Var.l() : ql0Var.m());
        }
        return arrayList;
    }
}
