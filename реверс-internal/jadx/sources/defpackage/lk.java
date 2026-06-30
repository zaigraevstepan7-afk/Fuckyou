package defpackage;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Process;
import android.text.InputFilter;
import android.text.Layout;
import android.view.DragEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class lk implements fk1 {
    public static ye0 a;

    public static int A(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long B(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static Comparable C(Float f, fl flVar) {
        flVar.getClass();
        float f2 = flVar.b;
        float f3 = flVar.a;
        if (f3 <= f2) {
            return (!fl.a(f, Float.valueOf(f3)) || fl.a(Float.valueOf(f3), f)) ? (!fl.a(Float.valueOf(f2), f) || fl.a(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + flVar + '.');
    }

    public static final fy0 D(jx0 jx0Var, ob0 ob0Var, int i) {
        Object objK = ob0Var.K();
        l91 l91Var = kp.a;
        if (objK == l91Var) {
            objK = xc.B(Boolean.FALSE);
            ob0Var.f0(objK);
        }
        fy0 fy0Var = (fy0) objK;
        int i2 = 1;
        boolean z = (((i & 14) ^ 6) > 4 && ob0Var.f(jx0Var)) || (i & 6) == 4;
        Object objK2 = ob0Var.K();
        if (z || objK2 == l91Var) {
            objK2 = new f80(jx0Var, fy0Var, null, i2);
            ob0Var.f0(objK2);
        }
        wi0.i((wa0) objK2, ob0Var, jx0Var);
        return fy0Var;
    }

    public static final long E(long j, long j2) {
        float f;
        float f2;
        long jA = vl.a(j, vl.f(j2));
        float fD = vl.d(j2);
        float fD2 = vl.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = vl.h(jA);
        float fH2 = vl.h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = vl.g(jA);
        float fG2 = vl.g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = vl.e(jA);
        float fE2 = vl.e(j2);
        if (f4 != 0.0f) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return m(f, f2, f5, f4, vl.f(j2));
    }

    public static final int F(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        return nu0.I((f3 * (i - 1 <= 1 ? r3 : 1)) + (f2 * i3) + f);
    }

    public static void G(sl0 sl0Var, hk hkVar, lh lhVar, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = hkVar instanceof o31;
        i60 i60Var = i60.a;
        if (z) {
            pc1 pc1Var = ((o31) hkVar).b;
            float f3 = pc1Var.a;
            sl0Var.p0(lhVar, (((long) Float.floatToRawIntBits(pc1Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), j0(pc1Var), f2, i60Var, null, 3);
            return;
        }
        if (!(hkVar instanceof p31)) {
            if (hkVar instanceof n31) {
                sl0Var.A(((n31) hkVar).b, lhVar, f2, i60Var, null, 3);
                return;
            } else {
                ez1.a();
                return;
            }
        }
        p31 p31Var = (p31) hkVar;
        w6 w6Var = p31Var.c;
        if (w6Var != null) {
            sl0Var.A(w6Var, lhVar, f2, i60Var, null, 3);
            return;
        }
        hg1 hg1Var = p31Var.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hg1Var.h >> 32));
        float f4 = hg1Var.a;
        sl0Var.W(lhVar, (((long) Float.floatToRawIntBits(hg1Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(hg1Var.b())) << 32) | (((long) Float.floatToRawIntBits(hg1Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f2, i60Var, null, 3);
    }

    public static void H(sl0 sl0Var, hk hkVar, long j) {
        if (hkVar instanceof o31) {
            pc1 pc1Var = ((o31) hkVar).b;
            sl0Var.L(j, (((long) Float.floatToRawIntBits(pc1Var.a)) << 32) | (((long) Float.floatToRawIntBits(pc1Var.b)) & 4294967295L), j0(pc1Var), 3);
            return;
        }
        boolean z = hkVar instanceof p31;
        i60 i60Var = i60.a;
        if (!z) {
            if (hkVar instanceof n31) {
                sl0Var.T(((n31) hkVar).b, j, i60Var);
                return;
            } else {
                ez1.a();
                return;
            }
        }
        p31 p31Var = (p31) hkVar;
        w6 w6Var = p31Var.c;
        if (w6Var != null) {
            sl0Var.T(w6Var, j, i60Var);
            return;
        }
        hg1 hg1Var = p31Var.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hg1Var.h >> 32));
        float f = hg1Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(hg1Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(hg1Var.b())) << 32) | (((long) Float.floatToRawIntBits(hg1Var.a())) & 4294967295L);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        ej ejVar = sl0Var.e;
        int i = (int) (jFloatToRawIntBits >> 32);
        int i2 = (int) (jFloatToRawIntBits & 4294967295L);
        ejVar.e.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)), ej.a(ejVar, j, i60Var, 3));
    }

    public static final long I(long j, boolean z, int i, float f) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && kr.d(j)) ? kr.h(j) : Integer.MAX_VALUE;
        if (kr.j(j) != iH) {
            iH = A(qc1.f(f), kr.j(j), iH);
        }
        return bl.x(0, iH, 0, kr.g(j));
    }

    public static final lt J(lt ltVar, lt ltVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 19;
        byte b = 0;
        boolean zBooleanValue = ((Boolean) ltVar.q(new pc(i, b), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ltVar2.q(new pc(i, b), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return ltVar.j(ltVar2);
        }
        pc pcVar = new pc(17, b);
        d40 d40Var = d40.e;
        lt ltVar3 = (lt) ltVar.q(pcVar, d40Var);
        Object objQ = ltVar2;
        if (zBooleanValue2) {
            objQ = ltVar2.q(new pc(18, b), d40Var);
        }
        return ltVar3.j((lt) objQ);
    }

    public static final boolean K(w80 w80Var, o9 o9Var) {
        int iOrdinal = w80Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                w80 w80VarW = hk.w(w80Var);
                if (w80VarW != null) {
                    return K(w80VarW, o9Var) || L(w80Var, w80VarW, 1, o9Var);
                }
                yc.l("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return w80Var.N0().a ? ((Boolean) o9Var.i(w80Var)).booleanValue() : Z(w80Var, o9Var);
                }
                ez1.a();
                return false;
            }
        }
        return Z(w80Var, o9Var);
    }

    public static final boolean L(w80 w80Var, w80 w80Var2, int i, o9 o9Var) {
        if (f0(w80Var, w80Var2, i, o9Var)) {
            return true;
        }
        Boolean bool = (Boolean) nu0.J(w80Var, i, new u11(((m80) ((h4) bl.Q(w80Var)).getFocusOwner()).f(), w80Var, w80Var2, i, o9Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final float M(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = rz1.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : lf0.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float N(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = rz1.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? lf0.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Class P(mk mkVar) {
        Class clsA = mkVar.a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class Q(mk mkVar) {
        mkVar.getClass();
        Class clsA = mkVar.a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final long R(qt0 qt0Var) {
        DragEvent dragEvent = (DragEvent) qt0Var.f;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static double S(ld0 ld0Var, double[] dArr, double[] dArr2) {
        double d;
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        double d2 = ld0Var.b;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                d = d2;
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                d = dArr2[i] % 360.0d;
                if (d < 0.0d) {
                    d += 360.0d;
                }
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    public static final boolean T(l81 l81Var, long j, long j2) {
        int i = l81Var.i == 1 ? 1 : 0;
        long j3 = l81Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long U(float f, long j, long j2) {
        b11 b11Var = gm.x;
        long jA = vl.a(j, b11Var);
        long jA2 = vl.a(j2, b11Var);
        float fD = vl.d(jA);
        float fH = vl.h(jA);
        float fG = vl.g(jA);
        float fE = vl.e(jA);
        float fD2 = vl.d(jA2);
        float fH2 = vl.h(jA2);
        float fG2 = vl.g(jA2);
        float fE2 = vl.e(jA2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return vl.a(m(xk.A(fH, fH2, f), xk.A(fG, fG2, f), xk.A(fE, fE2, f), xk.A(fD, fD2, f), b11Var), vl.f(j2));
    }

    public static final float V(ex0 ex0Var, ex0 ex0Var2, float f) {
        int iNextInt;
        int i;
        ex0Var.getClass();
        ex0Var2.getClass();
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = o0(0, ex0Var.b).iterator();
        while (true) {
            qh0 qh0Var = (qh0) it;
            if (!qh0Var.g) {
                yc.h("Collection contains no element matching the predicate.");
                return 0.0f;
            }
            iNextInt = qh0Var.nextInt();
            float fB = ex0Var.b(iNextInt);
            i = iNextInt + 1;
            float fB2 = ex0Var.b(i % ex0Var.b);
            if (fB2 >= fB) {
                if (fB <= f && f <= fB2) {
                    break;
                }
            } else if (f >= fB || f <= fB2) {
                break;
            }
        }
        int i2 = i % ex0Var.b;
        float fC = q42.c(ex0Var.b(i2) - ex0Var.b(iNextInt));
        return q42.c((q42.c(ex0Var2.b(i2) - ex0Var2.b(iNextInt)) * (fC < 0.001f ? 0.5f : q42.c(f - ex0Var.b(iNextInt)) / fC)) + ex0Var2.b(iNextInt));
    }

    public static final lt W(vt vtVar, lt ltVar) {
        lt ltVarJ = J(vtVar.f(), ltVar, true);
        lw lwVar = qy.a;
        return (ltVarJ == lwVar || ltVarJ.l(v20.z) != null) ? ltVarJ : ltVarJ.j(lwVar);
    }

    public static final boolean Y(w80 w80Var, o9 o9Var) {
        Object[] objArr = new w80[16];
        if (!w80Var.e.r) {
            ng0.b("visitChildren called on an unattached node");
        }
        iy0 iy0Var = new iy0(new sv0[16]);
        sv0 sv0Var = w80Var.e;
        sv0 sv0Var2 = sv0Var.j;
        if (sv0Var2 == null) {
            bl.h(iy0Var, sv0Var);
        } else {
            iy0Var.b(sv0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = iy0Var.g;
            if (i2 == 0) {
                break;
            }
            sv0 sv0VarK = (sv0) iy0Var.k(i2 - 1);
            if ((sv0VarK.h & 1024) == 0) {
                bl.h(iy0Var, sv0VarK);
            } else {
                while (true) {
                    if (sv0VarK == null) {
                        break;
                    }
                    if ((sv0VarK.g & 1024) != 0) {
                        iy0 iy0Var2 = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof w80) {
                                w80 w80Var2 = (w80) sv0VarK;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = w80Var2;
                                i = i3;
                            } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                int i4 = 0;
                                for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                    if ((sv0Var3.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            sv0VarK = sv0Var3;
                                        } else {
                                            if (iy0Var2 == null) {
                                                iy0Var2 = new iy0(new sv0[16]);
                                            }
                                            if (sv0VarK != null) {
                                                iy0Var2.b(sv0VarK);
                                                sv0VarK = null;
                                            }
                                            iy0Var2.b(sv0Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var2);
                        }
                    } else {
                        sv0VarK = sv0VarK.j;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, x80.b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                w80 w80Var3 = (w80) objArr[i5];
                if (hk.F(w80Var3) && o(w80Var3, o9Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean Z(w80 w80Var, o9 o9Var) {
        Object[] objArr = new w80[16];
        if (!w80Var.e.r) {
            ng0.b("visitChildren called on an unattached node");
        }
        iy0 iy0Var = new iy0(new sv0[16]);
        sv0 sv0Var = w80Var.e;
        sv0 sv0Var2 = sv0Var.j;
        if (sv0Var2 == null) {
            bl.h(iy0Var, sv0Var);
        } else {
            iy0Var.b(sv0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = iy0Var.g;
            if (i2 == 0) {
                break;
            }
            sv0 sv0VarK = (sv0) iy0Var.k(i2 - 1);
            if ((sv0VarK.h & 1024) == 0) {
                bl.h(iy0Var, sv0VarK);
            } else {
                while (true) {
                    if (sv0VarK == null) {
                        break;
                    }
                    if ((sv0VarK.g & 1024) != 0) {
                        iy0 iy0Var2 = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof w80) {
                                w80 w80Var2 = (w80) sv0VarK;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = w80Var2;
                                i = i3;
                            } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                int i4 = 0;
                                for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                    if ((sv0Var3.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            sv0VarK = sv0Var3;
                                        } else {
                                            if (iy0Var2 == null) {
                                                iy0Var2 = new iy0(new sv0[16]);
                                            }
                                            if (sv0VarK != null) {
                                                iy0Var2.b(sv0VarK);
                                                sv0VarK = null;
                                            }
                                            iy0Var2.b(sv0Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var2);
                        }
                    } else {
                        sv0VarK = sv0VarK.j;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, x80.b);
        for (int i5 = 0; i5 < i; i5++) {
            w80 w80Var3 = (w80) objArr[i5];
            if (hk.F(w80Var3) && K(w80Var3, o9Var)) {
                return true;
            }
        }
        return false;
    }

    public static final long a0(l81 l81Var, boolean z) {
        long jD = w01.d(l81Var.c, l81Var.g);
        if (z || !l81Var.c()) {
            return jD;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(float f, float f2, float f3, float f4, em emVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int i4;
        int i5;
        int i6;
        int i7;
        float fB2;
        float fA2;
        int i8;
        int i9;
        int i10;
        float f5;
        if (emVar.c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i11 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = i11 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i13 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i14 = vl.h;
            return j;
        }
        if (((int) (emVar.b >> 32)) != 3) {
            mg0.a("Color only works with ColorSpaces with 3 components");
        }
        int i15 = emVar.c;
        if (i15 == -1) {
            mg0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fB3 = emVar.b(0);
        float fA3 = emVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fA3);
        int i16 = iFloatToRawIntBits >>> 31;
        int i17 = (iFloatToRawIntBits >>> 23) & 255;
        int i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    fB = emVar.b(1);
                    fA = emVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
                    int i20 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i21 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                fB2 = emVar.b(2);
                                fA2 = emVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA2);
                                int i23 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        i = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            short s3 = (short) i10;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i27 = vl.h;
                                            return j2;
                                        }
                                        i9 = i26;
                                        i = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (i << 10);
                                short s32 = (short) i10;
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i272 = vl.h;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fB2 = emVar.b(2);
                    fA2 = emVar.a(2);
                    if (f3 >= fB2) {
                    }
                    if (fB2 <= fA2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fA2);
                    int i232 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (i << 10);
                    short s322 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2722 = vl.h;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s4 = (short) i3;
        fB = emVar.b(1);
        fA = emVar.a(1);
        if (f2 >= fB) {
        }
        if (fB <= fA) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fA);
        int i202 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i212 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fB2 = emVar.b(2);
        fA2 = emVar.a(2);
        if (f3 >= fB2) {
        }
        if (fB2 <= fA2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fA2);
        int i2322 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (i << 10);
        short s3222 = (short) i10;
        if (f4 >= 0.0f) {
        }
        long j2222 = (((long) i15) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i27222 = vl.h;
        return j2222;
    }

    public static final float c0(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    public static final jo d0(int i, eb0 eb0Var, ob0 ob0Var) {
        Object objK = ob0Var.K();
        if (objK == kp.a) {
            objK = new jo(i, true, eb0Var);
            ob0Var.f0(objK);
        }
        jo joVar = (jo) objK;
        if (!joVar.g.equals(eb0Var)) {
            joVar.g = eb0Var;
            if (joVar.f) {
                dc1 dc1Var = joVar.h;
                if (dc1Var != null) {
                    tp tpVar = dc1Var.a;
                    if (tpVar != null) {
                        tpVar.s(dc1Var, null);
                    }
                    joVar.h = null;
                }
                ArrayList arrayList = joVar.i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        dc1 dc1Var2 = (dc1) arrayList.get(i2);
                        tp tpVar2 = dc1Var2.a;
                        if (tpVar2 != null) {
                            tpVar2.s(dc1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return joVar;
    }

    public static final sh0 e0(pc1 pc1Var) {
        return new sh0(Math.round(pc1Var.a), Math.round(pc1Var.b), Math.round(pc1Var.c), Math.round(pc1Var.d));
    }

    public static final long f(int i) {
        long j = ((long) i) << 32;
        int i2 = vl.h;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f0(w80 w80Var, w80 w80Var2, int i, o9 o9Var) {
        sv0 sv0Var;
        ql0 ql0VarP;
        xz0 xz0Var;
        if (w80Var.Q0() != v80.f) {
            yc.l("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new w80[16];
        if (!w80Var.e.r) {
            ng0.b("visitChildren called on an unattached node");
        }
        iy0 iy0Var = new iy0(new sv0[16]);
        sv0 sv0Var2 = w80Var.e;
        sv0 sv0Var3 = sv0Var2.j;
        if (sv0Var3 == null) {
            bl.h(iy0Var, sv0Var2);
        } else {
            iy0Var.b(sv0Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = iy0Var.g;
            sv0Var = null;
            if (i3 == 0) {
                break;
            }
            sv0 sv0VarK = (sv0) iy0Var.k(i3 - 1);
            if ((sv0VarK.h & 1024) == 0) {
                bl.h(iy0Var, sv0VarK);
            } else {
                while (true) {
                    if (sv0VarK == null) {
                        break;
                    }
                    if ((sv0VarK.g & 1024) != 0) {
                        iy0 iy0Var2 = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof w80) {
                                w80 w80Var3 = (w80) sv0VarK;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = w80Var3;
                                i2 = i4;
                            } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                int i5 = 0;
                                for (sv0 sv0Var4 = ((yw) sv0VarK).t; sv0Var4 != null; sv0Var4 = sv0Var4.j) {
                                    if ((sv0Var4.g & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            sv0VarK = sv0Var4;
                                        } else {
                                            if (iy0Var2 == null) {
                                                iy0Var2 = new iy0(new sv0[16]);
                                            }
                                            if (sv0VarK != null) {
                                                iy0Var2.b(sv0VarK);
                                                sv0VarK = null;
                                            }
                                            iy0Var2.b(sv0Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var2);
                        }
                    } else {
                        sv0VarK = sv0VarK.j;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i2, x80.b);
        if (i != 1) {
            if (i != 2) {
                yc.l("This function should only be used for 1-D focus search");
                return false;
            }
            rh0 rh0VarO0 = o0(0, i2);
            int i6 = rh0VarO0.e;
            int i7 = rh0VarO0.f;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        w80 w80Var4 = (w80) objArr[i7];
                        if (hk.F(w80Var4) && o(w80Var4, o9Var)) {
                            break;
                        }
                    }
                    if (xi0.o(objArr[i7], w80Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!w80Var.e.r) {
                }
                sv0 sv0Var5 = w80Var.e.i;
                ql0VarP = bl.P(w80Var);
                loop5: while (true) {
                    if (ql0VarP == null) {
                    }
                }
                if (sv0Var != null) {
                }
            }
            return false;
        }
        rh0 rh0VarO02 = o0(0, i2);
        int i8 = rh0VarO02.e;
        int i9 = rh0VarO02.f;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    w80 w80Var5 = (w80) objArr[i8];
                    if (hk.F(w80Var5) && K(w80Var5, o9Var)) {
                        break;
                    }
                }
                if (xi0.o(objArr[i8], w80Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && w80Var.N0().a) {
            if (!w80Var.e.r) {
                ng0.b("visitAncestors called on an unattached node");
            }
            sv0 sv0Var52 = w80Var.e.i;
            ql0VarP = bl.P(w80Var);
            loop5: while (true) {
                if (ql0VarP == null) {
                    break;
                }
                if ((ql0VarP.I.f.h & 1024) != 0) {
                    while (sv0Var52 != null) {
                        if ((sv0Var52.g & 1024) != 0) {
                            sv0 sv0VarK2 = sv0Var52;
                            iy0 iy0Var3 = null;
                            while (sv0VarK2 != null) {
                                if (sv0VarK2 instanceof w80) {
                                    sv0Var = sv0VarK2;
                                    break loop5;
                                }
                                if ((sv0VarK2.g & 1024) != 0 && (sv0VarK2 instanceof yw)) {
                                    int i10 = 0;
                                    for (sv0 sv0Var6 = ((yw) sv0VarK2).t; sv0Var6 != null; sv0Var6 = sv0Var6.j) {
                                        if ((sv0Var6.g & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                sv0VarK2 = sv0Var6;
                                            } else {
                                                if (iy0Var3 == null) {
                                                    iy0Var3 = new iy0(new sv0[16]);
                                                }
                                                if (sv0VarK2 != null) {
                                                    iy0Var3.b(sv0VarK2);
                                                    sv0VarK2 = null;
                                                }
                                                iy0Var3.b(sv0Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                sv0VarK2 = bl.k(iy0Var3);
                            }
                        }
                        sv0Var52 = sv0Var52.i;
                    }
                }
                ql0VarP = ql0VarP.u();
                sv0Var52 = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
            }
            if (sv0Var != null) {
                return ((Boolean) o9Var.i(w80Var)).booleanValue();
            }
        }
        return false;
    }

    public static final long g(long j) {
        long j2 = j << 32;
        int i = vl.h;
        return j2;
    }

    public static long h(int i, int i2, int i3) {
        return f(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(pb1 pb1Var, wa0 wa0Var, ob0 ob0Var, int i) {
        s42 s42Var;
        boolean z;
        dc1 dc1VarR;
        ob0Var.X(-149765515);
        wh0 wh0Var = ob0Var.x;
        b61 b61VarL = ob0Var.l();
        ob0Var.T(201, mp.b);
        Object objK = ob0Var.K();
        if (xi0.o(objK, kp.a)) {
            s42Var = null;
        } else {
            objK.getClass();
            s42Var = (s42) objK;
        }
        nb1 nb1Var = pb1Var.a;
        s42 s42VarD = nb1Var.d(pb1Var, s42Var);
        boolean zEquals = s42VarD.equals(s42Var);
        if (!zEquals) {
            ob0Var.f0(s42VarD);
        }
        int i2 = 1;
        if (!ob0Var.S) {
            ip1 ip1Var = ob0Var.G;
            Object objB = ip1Var.b(ip1Var.b, ip1Var.g);
            objB.getClass();
            b61 b61Var = (b61) objB;
            if (!(ob0Var.z() && zEquals) && (pb1Var.g || !b61VarL.containsKey(nb1Var))) {
                b61VarL = b61VarL.d(nb1Var, s42VarD);
            } else if ((zEquals && !ob0Var.w) || !ob0Var.w) {
                b61VarL = b61Var;
            }
            if (ob0Var.y || b61Var != b61VarL) {
                z = true;
            }
            if (z && !ob0Var.S) {
                ob0Var.I(b61VarL);
            }
            wh0Var.c(ob0Var.w ? 1 : 0);
            ob0Var.w = z;
            ob0Var.K = b61VarL;
            ob0Var.R(202, 0, mp.c, b61VarL);
            wa0Var.h(ob0Var, Integer.valueOf((i >> 3) & 14));
            ob0Var.p(false);
            ob0Var.p(false);
            ob0Var.w = wh0Var.b() != 0;
            ob0Var.K = null;
            dc1VarR = ob0Var.r();
            if (dc1VarR == null) {
                dc1VarR.d = new go(i, i2, pb1Var, wa0Var);
                return;
            }
            return;
        }
        if (pb1Var.g || !b61VarL.containsKey(nb1Var)) {
            b61VarL = b61VarL.d(nb1Var, s42VarD);
        }
        ob0Var.J = true;
        z = false;
        if (z) {
            ob0Var.I(b61VarL);
        }
        wh0Var.c(ob0Var.w ? 1 : 0);
        ob0Var.w = z;
        ob0Var.K = b61VarL;
        ob0Var.R(202, 0, mp.c, b61VarL);
        wa0Var.h(ob0Var, Integer.valueOf((i >> 3) & 14));
        ob0Var.p(false);
        ob0Var.p(false);
        ob0Var.w = wh0Var.b() != 0;
        ob0Var.K = null;
        dc1VarR = ob0Var.r();
        if (dc1VarR == null) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String i0(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(pb1[] pb1VarArr, wa0 wa0Var, ob0 ob0Var, int i) {
        b61 b61VarD;
        boolean z;
        dc1 dc1VarR;
        ob0Var.X(415205898);
        wh0 wh0Var = ob0Var.x;
        b61 b61VarL = ob0Var.l();
        ob0Var.T(201, mp.b);
        boolean z2 = ob0Var.S;
        w11 w11Var = mp.d;
        if (z2) {
            b61 b61VarQ = xk.Q(pb1VarArr, b61VarL, b61.h);
            b61VarL.getClass();
            a61 a61Var = new a61(b61VarL);
            a61Var.k = b61VarL;
            a61Var.putAll(b61VarQ);
            b61VarD = a61Var.a();
            ob0Var.T(204, w11Var);
            ob0Var.C();
            ob0Var.g0(b61VarD);
            ob0Var.C();
            ob0Var.g0(b61VarQ);
            ob0Var.p(false);
            ob0Var.J = true;
        } else {
            ip1 ip1Var = ob0Var.G;
            Object objH = ip1Var.h(ip1Var.g, 0);
            objH.getClass();
            b61 b61Var = (b61) objH;
            ip1 ip1Var2 = ob0Var.G;
            Object objH2 = ip1Var2.h(ip1Var2.g, 1);
            objH2.getClass();
            b61 b61Var2 = (b61) objH2;
            b61 b61VarQ2 = xk.Q(pb1VarArr, b61VarL, b61Var2);
            if (!ob0Var.z() || ob0Var.y || !b61Var2.equals(b61VarQ2)) {
                b61VarL.getClass();
                a61 a61Var2 = new a61(b61VarL);
                a61Var2.k = b61VarL;
                a61Var2.putAll(b61VarQ2);
                b61VarD = a61Var2.a();
                ob0Var.T(204, w11Var);
                ob0Var.C();
                ob0Var.g0(b61VarD);
                ob0Var.C();
                ob0Var.g0(b61VarQ2);
                ob0Var.p(false);
                if (ob0Var.y || !xi0.o(b61VarD, b61Var)) {
                    z = true;
                }
                if (z && !ob0Var.S) {
                    ob0Var.I(b61VarD);
                }
                wh0Var.c(ob0Var.w ? 1 : 0);
                ob0Var.w = z;
                ob0Var.K = b61VarD;
                ob0Var.R(202, 0, mp.c, b61VarD);
                wa0Var.h(ob0Var, Integer.valueOf((i >> 3) & 14));
                ob0Var.p(false);
                ob0Var.p(false);
                ob0Var.w = wh0Var.b() != 0;
                ob0Var.K = null;
                dc1VarR = ob0Var.r();
                if (dc1VarR == null) {
                    dc1VarR.d = new go(i, 2, pb1VarArr, wa0Var);
                    return;
                }
                return;
            }
            ob0Var.l = ob0Var.G.s() + ob0Var.l;
            b61VarD = b61Var;
        }
        z = false;
        if (z) {
            ob0Var.I(b61VarD);
        }
        wh0Var.c(ob0Var.w ? 1 : 0);
        ob0Var.w = z;
        ob0Var.K = b61VarD;
        ob0Var.R(202, 0, mp.c, b61VarD);
        wa0Var.h(ob0Var, Integer.valueOf((i >> 3) & 14));
        ob0Var.p(false);
        ob0Var.p(false);
        ob0Var.w = wh0Var.b() != 0;
        ob0Var.K = null;
        dc1VarR = ob0Var.r();
        if (dc1VarR == null) {
        }
    }

    public static final long j0(pc1 pc1Var) {
        float f = pc1Var.c - pc1Var.a;
        return (((long) Float.floatToRawIntBits(pc1Var.d - pc1Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void k(ry1 ry1Var, jo joVar, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(2080741862);
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(ry1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        int i3 = 1;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            bl.a(ry1Var, joVar, ob0Var, i2 & 126);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new jn(ry1Var, joVar, i, i3);
        }
    }

    public static ph0 k0(rh0 rh0Var) {
        rh0Var.getClass();
        return new ph0(rh0Var.e, rh0Var.f, rh0Var.g > 0 ? 2 : -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final tv0 tv0Var, final un0 un0Var, final e41 e41Var, final aw awVar, final boolean z, final v5 v5Var, final sf sfVar, final dd ddVar, sa0 sa0Var, ob0 ob0Var, final int i, final int i2) {
        int i3;
        int i4;
        sa0 sa0Var2;
        int i5;
        int i6;
        Object obj;
        boolean z2;
        boolean zF;
        Object objK;
        dn0 dn0Var;
        boolean z3;
        ln0 ln0Var;
        tv0 tv0VarO;
        un0 un0Var2 = un0Var;
        ob0Var.X(924924659);
        if ((i & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.f(un0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var.f(e41Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ob0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var.g(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ob0Var.f(awVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ob0Var.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ob0Var.f(v5Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ob0Var.f(sfVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ob0Var.f(ddVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = i4 | 432;
        if ((i2 & 3072) == 0) {
            sa0Var2 = sa0Var;
            i7 |= ob0Var.h(sa0Var2) ? 2048 : 1024;
        } else {
            sa0Var2 = sa0Var;
        }
        if (ob0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            ob0Var.S();
            if ((i & 1) != 0 && !ob0Var.x()) {
                ob0Var.Q();
            }
            int i8 = i3 & (-234881025);
            ob0Var.q();
            int i9 = i8 >> 3;
            int i10 = i9 & 14;
            int i11 = i10 | ((i7 >> 6) & 112);
            fy0 fy0VarD = xc.D(sa0Var, ob0Var);
            boolean z4 = (((i11 & 14) ^ 6) > 4 && ob0Var.f(un0Var2)) || (i11 & 6) == 4;
            Object objK2 = ob0Var.K();
            Object obj2 = kp.a;
            if (z4 || objK2 == obj2) {
                jm0 jm0Var = new jm0();
                i5 = i10;
                jm0Var.a = new s41(Integer.MAX_VALUE);
                jm0Var.b = new s41(Integer.MAX_VALUE);
                l91 l91Var = l91.f;
                i6 = i7;
                n8 n8Var = new n8(fy0VarD, 9);
                oc ocVar = iq1.a;
                objK2 = new ln0(0, 0, ns1.class, new qx(new ke(new qx(n8Var, l91Var), un0Var2, jm0Var, 4), l91Var), "value", "getValue()Ljava/lang/Object;");
                ob0Var.f0(objK2);
            } else {
                i5 = i10;
                i6 = i7;
            }
            ln0 ln0Var2 = (ln0) objK2;
            int i12 = i8 >> 9;
            int i13 = i5 | (i12 & 112);
            boolean z5 = ((((i13 & 112) ^ 48) > 32 && ob0Var.g(true)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > 4 && ob0Var.f(un0Var2)) || (i13 & 6) == 4);
            Object objK3 = ob0Var.K();
            if (z5 || objK3 == obj2) {
                objK3 = new dn0(un0Var2);
                ob0Var.f0(objK3);
            }
            dn0 dn0Var2 = (dn0) objK3;
            Object objK4 = ob0Var.K();
            if (objK4 == obj2) {
                objK4 = wi0.v(ob0Var);
                ob0Var.f0(objK4);
            }
            vt vtVar = (vt) objK4;
            mc0 mc0Var = (mc0) ob0Var.j(aq.g);
            t61 t61Var = !((Boolean) ob0Var.j(aq.x)).booleanValue() ? at1.a : null;
            int i14 = i6 << 18;
            int i15 = (i8 & 65520) | (i12 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i6 << 27) & 1879048192);
            boolean z6 = ((((i15 & 112) ^ 48) > 32 && ob0Var.f(un0Var2)) || (i15 & 48) == 32) | ((((i15 & 896) ^ 384) > 256 && ob0Var.f(e41Var)) || (i15 & 384) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && ob0Var.g(false)) || (i15 & 3072) == 2048);
            if (((57344 & i15) ^ 24576) <= 16384 || !ob0Var.g(true)) {
                boolean z7 = (i15 & 24576) == 16384;
                boolean zD = ((((i15 & 3670016) ^ 1572864) > 1048576 && ob0Var.f(sfVar)) || (i15 & 1572864) == 1048576) | z6 | z7 | ob0Var.d(0);
                if (((i15 & 29360128) ^ 12582912) > 8388608) {
                    obj = null;
                    if (ob0Var.f(null)) {
                        z2 = true;
                    }
                    zF = zD | z2 | (((i15 & 234881024) ^ 100663296) <= 67108864 && ob0Var.f(obj)) | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && ob0Var.f(ddVar)) || (i15 & 805306368) == 536870912) | ob0Var.f(mc0Var) | ob0Var.f(t61Var);
                    objK = ob0Var.K();
                    if (zF || objK == obj2) {
                        dn0Var = dn0Var2;
                        z3 = true;
                        Object on0Var = new on0(un0Var2, e41Var, ln0Var2, ddVar, vtVar, mc0Var, t61Var, sfVar);
                        un0Var2 = un0Var2;
                        ln0Var = ln0Var2;
                        ob0Var.f0(on0Var);
                        objK = on0Var;
                    } else {
                        ln0Var = ln0Var2;
                        dn0Var = dn0Var2;
                        z3 = true;
                    }
                    on0 on0Var2 = (on0) objK;
                    qv0 qv0Var = qv0.a;
                    k31 k31Var = k31.e;
                    if (z) {
                        ob0Var.W(-2076718545);
                        ob0Var.p(false);
                        tv0VarO = qv0Var;
                    } else {
                        ob0Var.W(-2077147368);
                        if ((((i9 & 14) ^ 6) <= 4 || !ob0Var.f(un0Var2)) && (i9 & 6) != 4) {
                            z3 = false;
                        }
                        boolean zD2 = z3 | ob0Var.d(0);
                        Object objK5 = ob0Var.K();
                        if (zD2 || objK5 == obj2) {
                            objK5 = new in0(un0Var2);
                            ob0Var.f0(objK5);
                        }
                        tv0VarO = c2.o((in0) objK5, un0Var2.o, k31Var);
                        ob0Var.p(false);
                    }
                    bk.d(ln0Var, u4.n(wi0.B(tv0Var.c(un0Var2.l).c(un0Var2.m), ln0Var, dn0Var, k31Var, z).c(tv0VarO), un0Var2.n).c(k31Var != k31.e ? xk.h(qv0Var, zd0.c) : xk.h(qv0Var, zd0.b)).c(new ij1(v5Var, awVar, un0Var2.g, k31Var, un0Var2, z, false)), un0Var2.p, on0Var2, ob0Var, 0);
                } else {
                    obj = null;
                }
                z2 = false;
                if (((i15 & 234881024) ^ 100663296) <= 67108864) {
                    if (((i15 & 1879048192) ^ 805306368) <= 536870912) {
                        zF = zD | z2 | (((i15 & 234881024) ^ 100663296) <= 67108864 && ob0Var.f(obj)) | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && ob0Var.f(ddVar)) || (i15 & 805306368) == 536870912) | ob0Var.f(mc0Var) | ob0Var.f(t61Var);
                        objK = ob0Var.K();
                        if (zF) {
                            dn0Var = dn0Var2;
                            z3 = true;
                            Object on0Var3 = new on0(un0Var2, e41Var, ln0Var2, ddVar, vtVar, mc0Var, t61Var, sfVar);
                            un0Var2 = un0Var2;
                            ln0Var = ln0Var2;
                            ob0Var.f0(on0Var3);
                            objK = on0Var3;
                            on0 on0Var22 = (on0) objK;
                            qv0 qv0Var2 = qv0.a;
                            k31 k31Var2 = k31.e;
                            if (z) {
                            }
                            bk.d(ln0Var, u4.n(wi0.B(tv0Var.c(un0Var2.l).c(un0Var2.m), ln0Var, dn0Var, k31Var2, z).c(tv0VarO), un0Var2.n).c(k31Var2 != k31.e ? xk.h(qv0Var2, zd0.c) : xk.h(qv0Var2, zd0.b)).c(new ij1(v5Var, awVar, un0Var2.g, k31Var2, un0Var2, z, false)), un0Var2.p, on0Var22, ob0Var, 0);
                        }
                    } else {
                        zF = zD | z2 | (((i15 & 234881024) ^ 100663296) <= 67108864 && ob0Var.f(obj)) | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && ob0Var.f(ddVar)) || (i15 & 805306368) == 536870912) | ob0Var.f(mc0Var) | ob0Var.f(t61Var);
                        objK = ob0Var.K();
                        if (zF) {
                        }
                    }
                }
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            final sa0 sa0Var3 = sa0Var2;
            dc1VarR.d = new wa0() { // from class: mn0
                @Override // defpackage.wa0
                public final Object h(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    lk.l(tv0Var, un0Var, e41Var, awVar, z, v5Var, sfVar, ddVar, sa0Var3, (ob0) obj3, al.V(i | 1), al.V(i2));
                    return t32.a;
                }
            };
        }
    }

    public static final int l0(long j) {
        float[] fArr = gm.a;
        return (int) (vl.a(j, gm.e) >>> 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m(float f, float f2, float f3, float f4, em emVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (emVar.c()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i10 = vl.h;
            return j;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = iFloatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i17 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i18 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i20 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & iFloatToRawIntBits3;
                                if (i8 != 255) {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                            } else {
                                                i14 = i22;
                                            }
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | 8388608) >> (1 - i22);
                                            if ((i23 & 4096) != 0) {
                                                i23 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) emVar.c) & 63);
                                    int i24 = vl.h;
                                    return jMax;
                                }
                                i15 = i21 == 0 ? 0 : 512;
                                i14 = 31;
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long jMax2 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) emVar.c) & 63);
                                int i242 = vl.h;
                                return jMax2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i202 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & iFloatToRawIntBits32;
                    if (i8 != 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long jMax22 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) emVar.c) & 63);
                    int i2422 = vl.h;
                    return jMax22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += 8192;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i172 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i182 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2022 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & iFloatToRawIntBits322;
        if (i8 != 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long jMax222 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) emVar.c) & 63);
        int i24222 = vl.h;
        return jMax222;
    }

    public static final iu0 m0(pg1 pg1Var, ob0 ob0Var) {
        boolean zF = ob0Var.f(pg1Var) | ob0Var.d(0);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            objK = new iu0(pg1Var);
            ob0Var.f0(objK);
        }
        return (iu0) objK;
    }

    public static final tx0 n(tx0 tx0Var) {
        int i = tx0Var.g;
        if (i == 0) {
            tx0 tx0Var2 = j31.a;
            tx0Var2.getClass();
            return tx0Var2;
        }
        tx0 tx0Var3 = new tx0(i);
        Object[] objArr = tx0Var.b;
        long[] jArr = tx0Var.c;
        int i2 = tx0Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            tx0Var3.g(objArr[i2]);
            i2 = i3;
        }
        return tx0Var3;
    }

    public static String n0(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : i == 10 ? "PasswordVisible" : i == 11 ? "PostalAddress" : i == 12 ? "PersonName" : i == 13 ? "EmailSubject" : i == 14 ? "ShortMessage" : i == 15 ? "LongMessage" : i == 16 ? "Filter" : i == 17 ? "Phonetic" : i == 18 ? "DateTime" : i == 19 ? "Date" : i == 20 ? "Time" : i == 21 ? "NumberSigned" : i == 22 ? "DecimalSigned" : i == 23 ? "DecimalPassword" : i == 24 ? "NumberPasswordSigned" : i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean o(w80 w80Var, o9 o9Var) {
        int iOrdinal = w80Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                w80 w80VarW = hk.w(w80Var);
                if (w80VarW == null) {
                    yc.l("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = w80VarW.Q0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                ez1.a();
                                return false;
                            }
                            yc.l("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (o(w80VarW, o9Var) || L(w80Var, w80VarW, 2, o9Var) || (w80VarW.N0().a && ((Boolean) o9Var.i(w80VarW)).booleanValue())) {
                        return true;
                    }
                }
                return L(w80Var, w80VarW, 2, o9Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    ez1.a();
                    return false;
                }
                if (!Y(w80Var, o9Var)) {
                    if (!(w80Var.N0().a ? ((Boolean) o9Var.i(w80Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return Y(w80Var, o9Var);
    }

    public static rh0 o0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new rh0(i, i2 - 1, 1);
        }
        rh0 rh0Var = rh0.h;
        return rh0.h;
    }

    public static final int p(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final p32 p0(ks ksVar, lt ltVar, Object obj) {
        p32 p32Var = null;
        if ((ksVar instanceof xt) && ltVar.l(bj.g) != null) {
            xt xtVarD = (xt) ksVar;
            while (true) {
                if ((xtVarD instanceof ny) || (xtVarD = xtVarD.d()) == null) {
                    break;
                }
                if (xtVarD instanceof p32) {
                    p32Var = (p32) xtVarD;
                    break;
                }
            }
            if (p32Var != null) {
                p32Var.s0(ltVar, obj);
            }
        }
        return p32Var;
    }

    public static final boolean q(l81 l81Var) {
        return (l81Var.c() || l81Var.h || !l81Var.d) ? false : true;
    }

    public static final void q0(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            qg0.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        qg0.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final boolean r(l81 l81Var) {
        return !l81Var.h && l81Var.d;
    }

    public static final void r0(ex0 ex0Var) {
        ex0Var.getClass();
        int i = ex0Var.b;
        if (i == 0) {
            yc.h("FloatList is empty.");
            return;
        }
        float f = ex0Var.a[i - 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fB = ex0Var.b(i2);
            if (fB < 0.0f || fB >= 1.0f) {
                yc.e("FloatMapping - Progress outside of range: ".concat(ex0.c(ex0Var, 31)));
                return;
            }
            if (c0(fB, f) <= 1.0E-4f) {
                yc.e("FloatMapping - Progress repeats a value: ".concat(ex0.c(ex0Var, 31)));
                return;
            } else if (fB < f && (i3 = i3 + 1) > 1) {
                yc.e("FloatMapping - Progress wraps more than once: ".concat(ex0.c(ex0Var, 31)));
                return;
            } else {
                i2++;
                f = fB;
            }
        }
    }

    public static final boolean s(l81 l81Var) {
        return (l81Var.c() || !l81Var.h || l81Var.d) ? false : true;
    }

    public static final Exception s0(String str, FileNotFoundException fileNotFoundException) throws IllegalAccessException, InvocationTargetException {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            al.h(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new hy(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final boolean t(l81 l81Var) {
        return l81Var.h && !l81Var.d;
    }

    public static final void u(int i, int i2) {
        if (i < 0 || i >= i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
        }
    }

    public static final void v(int i, int i2) {
        if (i < 0 || i > i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
        }
    }

    public static final void w(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbN = s91.n("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbN.append(i3);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        if (i <= i2) {
            return;
        }
        yc.p(s91.j("fromIndex: ", i, " > toIndex: ", i2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String x(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static double y(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float z(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public abstract InputFilter[] O(InputFilter[] inputFilterArr);

    public abstract int X(int i);

    @Override // defpackage.fk1
    public int a(int i) {
        return b0(i);
    }

    @Override // defpackage.fk1
    public int b(int i) {
        return X(i);
    }

    public abstract int b0(int i);

    @Override // defpackage.fk1
    public int d(int i) {
        int iX = X(i);
        if (iX == -1 || X(iX) == -1) {
            return -1;
        }
        return iX;
    }

    @Override // defpackage.fk1
    public int e(int i) {
        int iB0 = b0(i);
        if (iB0 == -1 || b0(iB0) == -1) {
            return -1;
        }
        return iB0;
    }

    public abstract void g0(boolean z);

    public abstract void h0(boolean z);
}
