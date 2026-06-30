package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends sk0 implements wa0 {
    public static final r9 A;
    public static final r9 B;
    public static final r9 C;
    public static final r9 D;
    public static final r9 E;
    public static final r9 F;
    public static final r9 G;
    public static final r9 H;
    public static final r9 I;
    public static final r9 J;
    public static final r9 g;
    public static final r9 h;
    public static final r9 i;
    public static final r9 j;
    public static final r9 k;
    public static final r9 l;
    public static final r9 m;
    public static final r9 n;
    public static final r9 o;
    public static final r9 p;
    public static final r9 q;
    public static final r9 r;
    public static final r9 s;
    public static final r9 t;
    public static final r9 u;
    public static final r9 v;
    public static final r9 w;
    public static final r9 x;
    public static final r9 y;
    public static final r9 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 2;
        g = new r9(i2, 0);
        h = new r9(i2, 1);
        i = new r9(i2, 2);
        j = new r9(i2, 3);
        k = new r9(i2, 4);
        l = new r9(i2, 5);
        m = new r9(i2, 6);
        n = new r9(i2, 7);
        o = new r9(i2, 8);
        p = new r9(i2, 9);
        q = new r9(i2, 10);
        r = new r9(i2, 11);
        s = new r9(i2, 12);
        t = new r9(i2, 13);
        u = new r9(i2, 14);
        v = new r9(i2, 15);
        w = new r9(i2, 16);
        x = new r9(i2, 17);
        y = new r9(i2, 18);
        z = new r9(i2, 19);
        A = new r9(i2, 20);
        B = new r9(i2, 21);
        C = new r9(i2, 22);
        D = new r9(i2, 23);
        E = new r9(i2, 24);
        F = new r9(i2, 25);
        G = new r9(i2, 26);
        H = new r9(i2, 27);
        I = new r9(i2, 28);
        J = new r9(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [iy0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [iy0] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [sv0] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [sv0] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f;
        t32 t32Var = t32.a;
        switch (i2) {
            case 0:
                long j2 = ((vh0) obj).a;
                long j3 = ((vh0) obj2).a;
                Map map = z62.a;
                return pv.D(0.0f, 400.0f, new vh0(4294967297L), 1);
            case 1:
                k40 k40Var = (k40) obj2;
                if (((k40) obj) == k40Var && k40Var == k40.g) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                String str = (String) obj;
                rv0 rv0Var = (rv0) obj2;
                if (str.length() == 0) {
                    return rv0Var.toString();
                }
                return str + ", " + rv0Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ob0 ob0Var = (ob0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                }
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ob0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob0Var2.Q();
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ob0 ob0Var3 = (ob0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!ob0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ob0Var3.Q();
                }
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ob0 ob0Var4 = (ob0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!ob0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ob0Var4.Q();
                }
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                ((ql0) ((ep) obj)).getClass();
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((ql0) ((ep) obj)).g0((uu0) obj2);
                return t32Var;
            case el.a /* 9 */:
                ((ql0) ((ep) obj)).h0((tv0) obj2);
                return t32Var;
            case el.b /* 10 */:
                xp xpVar = (xp) obj2;
                ql0 ql0Var = (ql0) ((ep) obj);
                ql0Var.E = xpVar;
                xz0 xz0Var = ql0Var.I;
                ys1 ys1Var = aq.h;
                b61 b61Var = (b61) xpVar;
                b61Var.getClass();
                ql0Var.d0((hx) xk.I(b61Var, ys1Var));
                b61 b61Var2 = (b61) xpVar;
                al0 al0Var = (al0) xk.I(b61Var2, aq.n);
                if (ql0Var.C != al0Var) {
                    ql0Var.C = al0Var;
                    ql0Var.G();
                    ql0 ql0VarU = ql0Var.u();
                    if (ql0VarU != null) {
                        ql0VarU.D();
                    } else {
                        w31 w31Var = ql0Var.r;
                        if (w31Var != null) {
                            ((h4) w31Var).invalidate();
                        }
                    }
                    ql0Var.E();
                    for (sv0 sv0Var = xz0Var.f; sv0Var != null; sv0Var = sv0Var.j) {
                        sv0Var.u0();
                    }
                }
                ql0Var.i0((j62) xk.I(b61Var2, aq.t));
                sv0 sv0Var2 = xz0Var.f;
                if ((sv0Var2.h & 32768) != 0) {
                    while (sv0Var2 != null) {
                        if ((sv0Var2.g & 32768) != 0) {
                            ?? K = sv0Var2;
                            ?? iy0Var = 0;
                            while (K != 0) {
                                if (K instanceof vp) {
                                    sv0 sv0Var3 = ((sv0) ((vp) K)).e;
                                    if (sv0Var3.r) {
                                        d01.c(sv0Var3);
                                    } else {
                                        sv0Var3.n = true;
                                    }
                                } else if ((K.g & 32768) != 0 && (K instanceof yw)) {
                                    sv0 sv0Var4 = ((yw) K).t;
                                    int i3 = 0;
                                    iy0Var = iy0Var;
                                    K = K;
                                    while (sv0Var4 != null) {
                                        if ((sv0Var4.g & 32768) != 0) {
                                            i3++;
                                            iy0Var = iy0Var;
                                            if (i3 == 1) {
                                                K = sv0Var4;
                                            } else {
                                                if (iy0Var == 0) {
                                                    iy0Var = new iy0(new sv0[16]);
                                                }
                                                if (K != 0) {
                                                    iy0Var.b(K);
                                                    K = 0;
                                                }
                                                iy0Var.b(sv0Var4);
                                            }
                                        }
                                        sv0Var4 = sv0Var4.j;
                                        iy0Var = iy0Var;
                                        K = K;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                K = bl.k(iy0Var);
                            }
                        }
                        if ((sv0Var2.h & 32768) != 0) {
                            sv0Var2 = sv0Var2.j;
                        }
                    }
                }
                return t32Var;
            case 11:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = f40.e;
                }
                return pl.l0(collection, list);
            case el.c /* 12 */:
                return (b5) obj;
            case 13:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 14:
                return (as) obj;
            case 15:
                return (y5) obj;
            case 16:
                return (t32) obj;
            case 17:
                return (t32) obj;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 20:
                return (t32) obj;
            case 21:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 22:
                yf1 yf1Var = (yf1) obj;
                int i4 = ((yf1) obj2).a;
                return yf1Var;
            case 23:
                return (ym1) obj;
            case 24:
                return (String) obj;
            case 25:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 26:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 27:
                return (String) obj;
            case 28:
                if (obj != null || obj2 != null) {
                    yc.d();
                }
                return null;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
