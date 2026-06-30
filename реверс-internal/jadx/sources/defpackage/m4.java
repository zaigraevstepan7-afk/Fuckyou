package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.reddit.secondpage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m4 extends u0 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, Runnable {
    public static final gx0 T;
    public boolean A;
    public long B;
    public boolean C;
    public j4 D;
    public hx0 E;
    public final ix0 F;
    public final fx0 G;
    public final fx0 H;
    public final String I;
    public final String J;
    public final oc K;
    public final hx0 L;
    public sl1 M;
    public boolean N;
    public final fx0 O;
    public final ix0 P;
    public final p Q;
    public final ArrayList R;
    public final l4 S;
    public final h4 h;
    public int i = Integer.MIN_VALUE;
    public final l4 j = new l4(this, 0);
    public final AccessibilityManager k;
    public long l;
    public List m;
    public final i4 n;
    public int o;
    public int p;
    public m1 q;
    public m1 r;
    public boolean s;
    public final hx0 t;
    public final hx0 u;
    public final dr1 v;
    public final dr1 w;
    public int x;
    public Integer y;
    public final md z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        gx0 gx0Var = lh0.a;
        gx0 gx0Var2 = new gx0(32);
        int i = gx0Var2.b;
        if (i < 0) {
            yc.o("");
            return;
        }
        int i2 = i + 32;
        gx0Var2.b(i2);
        int[] iArr2 = gx0Var2.a;
        int i3 = gx0Var2.b;
        if (i != i3) {
            nd.K(i2, i, i3, iArr2, iArr2);
        }
        nd.N(i, 0, 12, iArr, iArr2);
        gx0Var2.b += 32;
        T = gx0Var2;
    }

    public m4(h4 h4Var) {
        this.h = h4Var;
        Object systemService = h4Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.k = (AccessibilityManager) systemService;
        this.l = 100L;
        new Handler(Looper.getMainLooper());
        this.n = new i4(this);
        this.o = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.t = new hx0();
        this.u = new hx0();
        this.v = new dr1();
        this.w = new dr1();
        this.x = -1;
        this.z = new md();
        int i = 1;
        this.C = true;
        hx0 hx0Var = nh0.a;
        hx0Var.getClass();
        this.E = hx0Var;
        this.F = new ix0();
        this.G = new fx0();
        this.H = new fx0();
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.K = new oc(18);
        this.L = new hx0();
        this.M = new sl1(h4Var.getSemanticsOwner().a(), hx0Var);
        int i2 = kh0.a;
        this.O = new fx0();
        this.P = new ix0();
        h4Var.addOnAttachStateChangeListener(this);
        this.Q = new p(i, this);
        this.R = new ArrayList();
        this.S = new l4(this, i);
    }

    public static Rect F(hk hkVar, float f, float f2) {
        if (!(hkVar instanceof o31) && !(hkVar instanceof p31)) {
            return null;
        }
        pc1 pc1VarX = hkVar.x();
        return new Rect((int) (pc1VarX.a + f), (int) (pc1VarX.b + f2), (int) (pc1VarX.c + f), (int) (pc1VarX.d + f2));
    }

    public static float[] H(hk hkVar) {
        if (!(hkVar instanceof p31)) {
            return null;
        }
        hg1 hg1Var = ((p31) hkVar).b;
        long j = hg1Var.h;
        long j2 = hg1Var.g;
        long j3 = hg1Var.f;
        long j4 = hg1Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region I(hk hkVar, float f, float f2) {
        if (!(hkVar instanceof n31)) {
            return null;
        }
        n31 n31Var = (n31) hkVar;
        pc1 pc1VarH = n31Var.x().h(f, f2);
        Region region = new Region(new Rect((int) (pc1VarH.a + 0.0f), (int) (pc1VarH.b + 0.0f), (int) (pc1VarH.c + 0.0f), (int) (pc1VarH.d + 0.0f)));
        Region region2 = new Region();
        w6 w6Var = n31Var.b;
        if (!(w6Var instanceof w6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = w6Var.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String n(rl1 rl1Var) {
        hb hbVar;
        if (rl1Var != null) {
            nl1 nl1Var = rl1Var.d;
            zx0 zx0Var = nl1Var.e;
            zl1 zl1Var = vl1.a;
            if (zx0Var.c(zl1Var)) {
                return vq0.a((List) nl1Var.c(zl1Var), ",", null, 62);
            }
            zl1 zl1Var2 = vl1.G;
            if (zx0Var.c(zl1Var2)) {
                Object objG = zx0Var.g(zl1Var2);
                if (objG == null) {
                    objG = null;
                }
                hb hbVar2 = (hb) objG;
                if (hbVar2 != null) {
                    return hbVar2.f;
                }
            } else {
                Object objG2 = zx0Var.g(vl1.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (hbVar = (hb) pl.d0(list)) != null) {
                    return hbVar.f;
                }
            }
        }
        return null;
    }

    public static final boolean r(wi1 wi1Var, float f) {
        ha0 ha0Var = wi1Var.a;
        if (f >= 0.0f || ((Number) ha0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) ha0Var.a()).floatValue() < ((Number) wi1Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean s(wi1 wi1Var) {
        ha0 ha0Var = wi1Var.a;
        if (((Number) ha0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) ha0Var.a()).floatValue();
        ((Number) wi1Var.b.a()).floatValue();
        return false;
    }

    public static final boolean t(wi1 wi1Var) {
        ha0 ha0Var = wi1Var.a;
        if (((Number) ha0Var.a()).floatValue() < ((Number) wi1Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) ha0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void y(m4 m4Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        m4Var.x(i, i2, num, null);
    }

    public final void A(int i) {
        j4 j4Var = this.D;
        if (j4Var != null) {
            rl1 rl1Var = j4Var.a;
            if (i != rl1Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - j4Var.f <= 1000) {
                AccessibilityEvent accessibilityEventI = i(u(rl1Var.f), 131072);
                accessibilityEventI.setFromIndex(j4Var.d);
                accessibilityEventI.setToIndex(j4Var.e);
                accessibilityEventI.setAction(j4Var.b);
                accessibilityEventI.setMovementGranularity(j4Var.c);
                accessibilityEventI.getText().add(n(rl1Var));
                w(accessibilityEventI);
            }
        }
        this.D = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(mh0 mh0Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        nl1 nl1Var;
        rl1 rl1Var;
        int i8;
        int i9;
        int i10;
        int i11;
        zx0 zx0Var;
        ql0 ql0Var;
        int i12;
        nl1 nl1Var2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i13;
        int i14;
        ql0 ql0Var2;
        int i15;
        Integer num6;
        int i16;
        zx0 zx0Var2;
        ej1 ej1Var;
        boolean z;
        ej1 ej1Var2;
        eb0 eb0Var;
        int i17;
        String str;
        int i18;
        int i19;
        AccessibilityEvent accessibilityEventJ;
        m4 m4Var = this;
        mh0 mh0Var2 = mh0Var;
        Integer num7 = 64;
        ArrayList arrayList4 = m4Var.R;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = mh0Var2.b;
        long[] jArr3 = mh0Var2.a;
        int i20 = 2;
        int length = jArr3.length - 2;
        int i21 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j2 = jArr3[i22];
            int i23 = i20;
            int i24 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8;
                int i26 = 8 - ((~(i22 - i24)) >>> 31);
                long j3 = j2;
                int i27 = i21;
                while (i27 < i26) {
                    if ((j3 & 255) < 128) {
                        int i28 = iArr3[(i22 << 3) + i27];
                        sl1 sl1Var = (sl1) m4Var.L.b(i28);
                        if (sl1Var == null) {
                            i3 = i27;
                            num3 = num7;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i26;
                            i5 = i21;
                            i6 = i22;
                            num4 = num8;
                            i7 = i25;
                        } else {
                            nl1 nl1Var3 = sl1Var.a;
                            zx0 zx0Var3 = nl1Var3.e;
                            tl1 tl1Var = (tl1) mh0Var2.b(i28);
                            int i29 = i25;
                            rl1 rl1Var2 = tl1Var != null ? tl1Var.a : null;
                            if (rl1Var2 == null) {
                                throw s91.g("no value for specified key");
                            }
                            ql0 ql0Var3 = rl1Var2.c;
                            nl1 nl1Var4 = rl1Var2.d;
                            iArr2 = iArr3;
                            int i30 = rl1Var2.f;
                            jArr2 = jArr3;
                            zx0 zx0Var4 = nl1Var4.e;
                            i6 = i22;
                            Object[] objArr = zx0Var4.b;
                            Object[] objArr2 = zx0Var4.c;
                            long[] jArr4 = zx0Var4.a;
                            i3 = i27;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                ql0 ql0Var4 = ql0Var3;
                                i4 = i26;
                                int i31 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i31];
                                    rl1Var = rl1Var2;
                                    int i32 = i31;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            if ((j4 & 255) < 128) {
                                                int i35 = (i32 << 3) + i34;
                                                Object obj = objArr[i35];
                                                int i36 = length2;
                                                Object obj2 = objArr2[i35];
                                                nl1Var2 = nl1Var3;
                                                zl1 zl1Var = (zl1) obj;
                                                j = j4;
                                                zl1 zl1Var2 = vl1.v;
                                                if (xi0.o(zl1Var, zl1Var2) || xi0.o(zl1Var, vl1.w)) {
                                                    int size = arrayList5.size();
                                                    i14 = i34;
                                                    int i37 = 0;
                                                    while (true) {
                                                        if (i37 >= size) {
                                                            ej1Var = null;
                                                            break;
                                                        }
                                                        int i38 = size;
                                                        if (((ej1) arrayList5.get(i37)).e == i28) {
                                                            ej1Var = (ej1) arrayList5.get(i37);
                                                            break;
                                                        } else {
                                                            i37++;
                                                            size = i38;
                                                        }
                                                    }
                                                    if (ej1Var != null) {
                                                        z = false;
                                                    } else {
                                                        ej1Var = new ej1(i28, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(ej1Var);
                                                } else {
                                                    i14 = i34;
                                                    z = false;
                                                }
                                                if (z) {
                                                    zl1 zl1Var3 = vl1.d;
                                                    if (xi0.o(zl1Var, zl1Var3)) {
                                                        obj2.getClass();
                                                        String str2 = (String) obj2;
                                                        boolean zC = zx0Var3.c(zl1Var3);
                                                        int i39 = i29;
                                                        if (zC) {
                                                            m4Var.z(i28, i39, str2);
                                                        }
                                                    } else {
                                                        int i40 = i29;
                                                        if (xi0.o(zl1Var, vl1.b)) {
                                                            y(m4Var, m4Var.u(i28), 2048, num7, i40);
                                                            y(m4Var, m4Var.u(i28), 2048, num8, i40);
                                                        } else if (xi0.o(zl1Var, vl1.K)) {
                                                            y(m4Var, m4Var.u(i28), 2048, 8192, 8);
                                                            y(m4Var, m4Var.u(i28), 2048, num8, 8);
                                                        } else if (xi0.o(zl1Var, vl1.M)) {
                                                            y(m4Var, m4Var.u(i28), 2048, 3072, 8);
                                                        } else if (xi0.o(zl1Var, vl1.c)) {
                                                            y(m4Var, m4Var.u(i28), 2048, num7, 8);
                                                            y(m4Var, m4Var.u(i28), 2048, num8, 8);
                                                        } else {
                                                            zl1 zl1Var4 = vl1.J;
                                                            arrayList3 = arrayList5;
                                                            if (xi0.o(zl1Var, zl1Var4)) {
                                                                Object objG = zx0Var4.g(vl1.z);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                yf1 yf1Var = (yf1) objG;
                                                                if (yf1Var != null && yf1Var.a == 4) {
                                                                    Object objG2 = zx0Var4.g(zl1Var4);
                                                                    if (objG2 == null) {
                                                                        objG2 = null;
                                                                    }
                                                                    if (xi0.o(objG2, Boolean.TRUE)) {
                                                                        AccessibilityEvent accessibilityEventI = m4Var.i(m4Var.u(i28), 4);
                                                                        rl1 rl1Var3 = rl1Var;
                                                                        ql0Var2 = ql0Var4;
                                                                        rl1 rl1Var4 = new rl1(rl1Var3.a, true, ql0Var2, nl1Var4);
                                                                        Object objG3 = rl1Var4.k().e.g(vl1.a);
                                                                        if (objG3 == null) {
                                                                            objG3 = null;
                                                                        }
                                                                        List list = (List) objG3;
                                                                        rl1Var = rl1Var3;
                                                                        String strA = list != null ? vq0.a(list, ",", null, 62) : null;
                                                                        Object objG4 = rl1Var4.k().e.g(vl1.C);
                                                                        if (objG4 == null) {
                                                                            objG4 = null;
                                                                        }
                                                                        List list2 = (List) objG4;
                                                                        i13 = i33;
                                                                        String strA2 = list2 != null ? vq0.a(list2, ",", null, 62) : null;
                                                                        if (strA != null) {
                                                                            accessibilityEventI.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventI.getText().add(strA2);
                                                                        }
                                                                        m4Var.w(accessibilityEventI);
                                                                    } else {
                                                                        i13 = i33;
                                                                        ql0Var2 = ql0Var4;
                                                                        y(m4Var, m4Var.u(i28), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    i13 = i33;
                                                                    ql0Var2 = ql0Var4;
                                                                    y(m4Var, m4Var.u(i28), 2048, num7, 8);
                                                                    y(m4Var, m4Var.u(i28), 2048, num8, 8);
                                                                }
                                                            } else {
                                                                i13 = i33;
                                                                ql0Var2 = ql0Var4;
                                                                if (xi0.o(zl1Var, vl1.a)) {
                                                                    int iU = m4Var.u(i28);
                                                                    obj2.getClass();
                                                                    m4Var.x(iU, 2048, 4, (List) obj2);
                                                                } else {
                                                                    zl1 zl1Var5 = vl1.G;
                                                                    String str3 = "";
                                                                    if (xi0.o(zl1Var, zl1Var5)) {
                                                                        if (zx0Var4.c(ml1.k)) {
                                                                            Object objG5 = zx0Var3.g(zl1Var5);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            hb hbVar = (hb) objG5;
                                                                            if (hbVar == null) {
                                                                                hbVar = "";
                                                                            }
                                                                            Object objG6 = zx0Var4.g(zl1Var5);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            CharSequence charSequence = (hb) objG6;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence charSequenceJ = J(charSequence);
                                                                            int length3 = hbVar.length();
                                                                            int length4 = charSequence.length();
                                                                            int i41 = length3 > length4 ? length4 : length3;
                                                                            Integer num9 = num8;
                                                                            int i42 = 0;
                                                                            while (true) {
                                                                                num5 = num7;
                                                                                if (i42 >= i41) {
                                                                                    i18 = length3;
                                                                                    break;
                                                                                }
                                                                                i18 = length3;
                                                                                if (hbVar.charAt(i42) != charSequence.charAt(i42)) {
                                                                                    break;
                                                                                }
                                                                                i42++;
                                                                                length3 = i18;
                                                                                num7 = num5;
                                                                            }
                                                                            int i43 = 0;
                                                                            while (true) {
                                                                                if (i43 >= i41 - i42) {
                                                                                    i19 = i43;
                                                                                    break;
                                                                                }
                                                                                i19 = i43;
                                                                                if (hbVar.charAt((i18 - 1) - i43) != charSequence.charAt((length4 - 1) - i19)) {
                                                                                    break;
                                                                                } else {
                                                                                    i43 = i19 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i18 - i19) - i42;
                                                                            int i45 = (length4 - i19) - i42;
                                                                            zl1 zl1Var6 = vl1.L;
                                                                            boolean zC2 = zx0Var3.c(zl1Var6);
                                                                            boolean zC3 = zx0Var4.c(zl1Var6);
                                                                            boolean zC4 = zx0Var3.c(vl1.G);
                                                                            boolean z2 = zC4 && !zC2 && zC3;
                                                                            boolean z3 = zC4 && zC2 && !zC3;
                                                                            if (z2 || z3) {
                                                                                zx0Var2 = zx0Var3;
                                                                                i16 = i28;
                                                                                num8 = num9;
                                                                                accessibilityEventJ = m4Var.j(m4Var.u(i28), num8, num9, Integer.valueOf(length4), charSequenceJ);
                                                                            } else {
                                                                                accessibilityEventJ = m4Var.i(m4Var.u(i28), 16);
                                                                                accessibilityEventJ.setFromIndex(i42);
                                                                                accessibilityEventJ.setRemovedCount(i44);
                                                                                accessibilityEventJ.setAddedCount(i45);
                                                                                accessibilityEventJ.setBeforeText(hbVar);
                                                                                accessibilityEventJ.getText().add(charSequenceJ);
                                                                                i16 = i28;
                                                                                zx0Var2 = zx0Var3;
                                                                                num8 = num9;
                                                                            }
                                                                            accessibilityEventJ.setClassName("android.widget.EditText");
                                                                            m4Var.w(accessibilityEventJ);
                                                                            if (z2 || z3) {
                                                                                long j5 = ((wz1) nl1Var4.c(vl1.H)).a;
                                                                                accessibilityEventJ.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventJ.setToIndex((int) (j5 & 4294967295L));
                                                                                m4Var.w(accessibilityEventJ);
                                                                            }
                                                                        } else {
                                                                            i16 = i28;
                                                                            zx0Var2 = zx0Var3;
                                                                            num5 = num7;
                                                                            y(m4Var, m4Var.u(i16), 2048, Integer.valueOf(i23), 8);
                                                                        }
                                                                        num6 = num8;
                                                                        i15 = i36;
                                                                    } else {
                                                                        i16 = i28;
                                                                        zx0Var2 = zx0Var3;
                                                                        num5 = num7;
                                                                        i15 = i36;
                                                                        zl1 zl1Var7 = vl1.H;
                                                                        if (xi0.o(zl1Var, zl1Var7)) {
                                                                            Object objG7 = zx0Var4.g(zl1Var5);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            hb hbVar2 = (hb) objG7;
                                                                            if (hbVar2 != null && (str = hbVar2.f) != null) {
                                                                                str3 = str;
                                                                            }
                                                                            long j6 = ((wz1) nl1Var4.c(zl1Var7)).a;
                                                                            num6 = num8;
                                                                            m4Var = this;
                                                                            m4Var.w(m4Var.j(m4Var.u(i16), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), J(str3)));
                                                                            m4Var.A(i30);
                                                                        } else {
                                                                            num6 = num8;
                                                                            if (xi0.o(zl1Var, zl1Var2) || xi0.o(zl1Var, vl1.w)) {
                                                                                m4Var.q(ql0Var2);
                                                                                int size2 = arrayList4.size();
                                                                                int i46 = 0;
                                                                                while (true) {
                                                                                    if (i46 >= size2) {
                                                                                        ej1Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((ej1) arrayList4.get(i46)).e == i16) {
                                                                                            ej1Var2 = (ej1) arrayList4.get(i46);
                                                                                            break;
                                                                                        }
                                                                                        i46++;
                                                                                    }
                                                                                }
                                                                                ej1Var2.getClass();
                                                                                Object objG8 = zx0Var4.g(zl1Var2);
                                                                                if (objG8 == null) {
                                                                                    objG8 = null;
                                                                                }
                                                                                ej1Var2.i = (wi1) objG8;
                                                                                Object objG9 = zx0Var4.g(vl1.w);
                                                                                if (objG9 == null) {
                                                                                    objG9 = null;
                                                                                }
                                                                                ej1Var2.j = (wi1) objG9;
                                                                                if (ej1Var2.f.contains(ej1Var2)) {
                                                                                    m4Var.h.getSnapshotObserver().a.c(ej1Var2, m4Var.S, new y3(1, ej1Var2, m4Var));
                                                                                }
                                                                            } else if (xi0.o(zl1Var, vl1.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i17 = 8;
                                                                                    m4Var.w(m4Var.i(m4Var.u(i30), 8));
                                                                                } else {
                                                                                    i17 = 8;
                                                                                }
                                                                                y(m4Var, m4Var.u(i30), 2048, num6, i17);
                                                                            } else {
                                                                                zl1 zl1Var8 = ml1.x;
                                                                                if (xi0.o(zl1Var, zl1Var8)) {
                                                                                    List list3 = (List) nl1Var4.c(zl1Var8);
                                                                                    Object objG10 = zx0Var2.g(zl1Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        ay0 ay0Var = qi1.a;
                                                                                        ay0 ay0Var2 = new ay0();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            yc.d();
                                                                                            return;
                                                                                        }
                                                                                        ay0 ay0Var3 = new ay0();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            yc.d();
                                                                                            return;
                                                                                        }
                                                                                        i10 = !ay0Var2.equals(ay0Var3) ? 1 : 0;
                                                                                    } else if (!list3.isEmpty()) {
                                                                                        i10 = 1;
                                                                                    }
                                                                                } else if (obj2 instanceof r0) {
                                                                                    r0 r0Var = (r0) obj2;
                                                                                    Object objG11 = zx0Var2.g(zl1Var);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (r0Var != objG11) {
                                                                                        if (objG11 instanceof r0) {
                                                                                            String str4 = r0Var.a;
                                                                                            r0 r0Var2 = (r0) objG11;
                                                                                            eb0 eb0Var2 = r0Var2.b;
                                                                                            if (xi0.o(str4, r0Var2.a) && (((eb0Var = r0Var.b) != null || eb0Var2 == null) && (eb0Var == null || eb0Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        i10 = 1;
                                                                                    }
                                                                                    i10 = 0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num8;
                                                            i16 = i28;
                                                            zx0Var2 = zx0Var3;
                                                            num5 = num7;
                                                            i15 = i36;
                                                        }
                                                    }
                                                    i16 = i28;
                                                    num5 = num7;
                                                    arrayList3 = arrayList5;
                                                    i13 = i33;
                                                    ql0Var2 = ql0Var4;
                                                    i15 = i36;
                                                    num6 = num8;
                                                    zx0Var2 = zx0Var3;
                                                } else {
                                                    Object objG12 = zx0Var3.g(zl1Var);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (xi0.o(obj2, objG12)) {
                                                        i16 = i28;
                                                        num5 = num7;
                                                        arrayList3 = arrayList5;
                                                        i13 = i33;
                                                        ql0Var2 = ql0Var4;
                                                        i15 = i36;
                                                        num6 = num8;
                                                        zx0Var2 = zx0Var3;
                                                    }
                                                }
                                            } else {
                                                nl1Var2 = nl1Var3;
                                                num5 = num7;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i13 = i33;
                                                i14 = i34;
                                                ql0Var2 = ql0Var4;
                                                i15 = length2;
                                                num6 = num8;
                                                i16 = i28;
                                                zx0Var2 = zx0Var3;
                                            }
                                            i29 = 8;
                                            i28 = i16;
                                            ql0Var4 = ql0Var2;
                                            nl1Var3 = nl1Var2;
                                            j4 = j >> 8;
                                            i34 = i14 + 1;
                                            length2 = i15;
                                            num8 = num6;
                                            zx0Var3 = zx0Var2;
                                            i33 = i13;
                                            arrayList5 = arrayList3;
                                            num7 = num5;
                                        }
                                        i9 = i28;
                                        nl1Var = nl1Var3;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        ql0Var = ql0Var4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length2;
                                        num4 = num8;
                                        int i47 = i33;
                                        zx0Var = zx0Var3;
                                        if (i47 != i29) {
                                            break;
                                        }
                                    } else {
                                        i9 = i28;
                                        nl1Var = nl1Var3;
                                        zx0Var = zx0Var3;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        ql0Var = ql0Var4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length2;
                                        num4 = num8;
                                    }
                                    if (i32 == i12) {
                                        break;
                                    }
                                    num8 = num4;
                                    i28 = i9;
                                    zx0Var3 = zx0Var;
                                    ql0Var4 = ql0Var;
                                    rl1Var2 = rl1Var;
                                    nl1Var3 = nl1Var;
                                    arrayList5 = arrayList2;
                                    i29 = 8;
                                    i31 = i32 + 1;
                                    length2 = i12;
                                    num7 = num3;
                                }
                            } else {
                                nl1Var = nl1Var3;
                                num3 = num7;
                                arrayList2 = arrayList5;
                                i4 = i26;
                                rl1Var = rl1Var2;
                                i8 = 1;
                                num4 = num8;
                                i9 = i28;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = nl1Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    } else {
                                        if (!rl1Var.k().e.c((zl1) ((Map.Entry) it.next()).getKey())) {
                                            i11 = i8;
                                            break;
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                int iU2 = m4Var.u(i9);
                                i7 = 8;
                                y(m4Var, iU2, 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    }
                    j3 >>= i7;
                    i27 = i3 + 1;
                    mh0Var2 = mh0Var;
                    i21 = i5;
                    num8 = num4;
                    i25 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i6;
                    i26 = i4;
                    arrayList5 = arrayList2;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i21;
                int i48 = i22;
                num2 = num8;
                if (i26 != i25) {
                    return;
                } else {
                    i2 = i48;
                }
            } else {
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i21;
                num2 = num8;
                i2 = i22;
            }
            if (i2 == i24) {
                return;
            }
            i22 = i2 + 1;
            mh0Var2 = mh0Var;
            length = i24;
            i21 = i;
            num8 = num2;
            i20 = i23;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num7 = num;
        }
    }

    public final void C(ql0 ql0Var, ix0 ix0Var) {
        nl1 nl1VarW;
        if (ql0Var.J()) {
            this.h.getAndroidViewsHandler();
            ql0 ql0Var2 = null;
            if (!ql0Var.I.d(8)) {
                ql0Var = ql0Var.u();
                while (true) {
                    if (ql0Var == null) {
                        ql0Var = null;
                        break;
                    } else if (ql0Var.I.d(8)) {
                        break;
                    } else {
                        ql0Var = ql0Var.u();
                    }
                }
            }
            if (ql0Var == null || (nl1VarW = ql0Var.w()) == null) {
                return;
            }
            if (!nl1VarW.g) {
                ql0 ql0VarU = ql0Var.u();
                while (true) {
                    if (ql0VarU != null) {
                        nl1 nl1VarW2 = ql0VarU.w();
                        if (nl1VarW2 != null && nl1VarW2.g) {
                            ql0Var2 = ql0VarU;
                            break;
                        }
                        ql0VarU = ql0VarU.u();
                    } else {
                        break;
                    }
                }
                if (ql0Var2 != null) {
                    ql0Var = ql0Var2;
                }
            }
            int i = ql0Var.f;
            if (ix0Var.a(i)) {
                y(this, u(i), 2048, 1, 8);
            }
        }
    }

    public final void D(ql0 ql0Var) {
        if (ql0Var.J()) {
            this.h.getAndroidViewsHandler();
            int i = ql0Var.f;
            wi1 wi1Var = (wi1) this.t.b(i);
            wi1 wi1Var2 = (wi1) this.u.b(i);
            if (wi1Var == null && wi1Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventI = i(i, 4096);
            if (wi1Var != null) {
                accessibilityEventI.setScrollX((int) ((Number) wi1Var.a.a()).floatValue());
                accessibilityEventI.setMaxScrollX((int) ((Number) wi1Var.b.a()).floatValue());
            }
            if (wi1Var2 != null) {
                accessibilityEventI.setScrollY((int) ((Number) wi1Var2.a.a()).floatValue());
                accessibilityEventI.setMaxScrollY((int) ((Number) wi1Var2.b.a()).floatValue());
            }
            w(accessibilityEventI);
        }
    }

    public final boolean E(rl1 rl1Var, int i, int i2, boolean z) {
        String strN;
        nl1 nl1Var = rl1Var.d;
        int i3 = rl1Var.f;
        zl1 zl1Var = ml1.j;
        if (nl1Var.e.c(zl1Var) && pv.e(rl1Var)) {
            xa0 xa0Var = (xa0) ((r0) rl1Var.d.c(zl1Var)).b;
            if (xa0Var != null) {
                return ((Boolean) xa0Var.f(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.x) && (strN = n(rl1Var)) != null) {
            if (i < 0 || i != i2 || i2 > strN.length()) {
                i = -1;
            }
            this.x = i;
            boolean z2 = strN.length() > 0;
            w(j(u(i3), z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(strN.length()) : null, strN));
            A(i3);
            return true;
        }
        return false;
    }

    public final Rect G(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        h4 h4Var = this.h;
        long jQ = h4Var.q(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jQ2 = h4Var.q((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ2 >> 32);
        int i3 = (int) (jQ & 4294967295L);
        int i4 = (int) (jQ2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int iNumberOfTrailingZeros;
        char c2;
        ix0 ix0Var = new ix0();
        ix0 ix0Var2 = this.F;
        int[] iArr = ix0Var2.b;
        long[] jArr3 = ix0Var2.a;
        int length = jArr3.length - 2;
        hx0 hx0Var = this.L;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i4];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            c2 = c3;
                            tl1 tl1Var = (tl1) m().b(i7);
                            rl1 rl1Var = tl1Var != null ? tl1Var.a : null;
                            if (rl1Var != null) {
                                if (!rl1Var.d.e.c(vl1.d)) {
                                    ix0Var.a(i7);
                                    sl1 sl1Var = (sl1) hx0Var.b(i7);
                                    if (sl1Var != null) {
                                        Object objG = sl1Var.a.e.g(vl1.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    z(i7, 32, obj);
                                }
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i6++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = ix0Var.b;
        long[] jArr4 = ix0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr4[i8];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j6 & j2) < j) {
                            int i11 = iArr2[(i8 << 3) + i10];
                            int iHashCode = Integer.hashCode(i11) * (-862048943);
                            int i12 = iHashCode ^ (iHashCode << 16);
                            int i13 = i12 & 127;
                            int i14 = ix0Var2.c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = ix0Var2.a;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (ix0Var2.b[iNumberOfTrailingZeros] == i11) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i2;
                                jArr4 = jArr2;
                                i14 = i2;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                ix0Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i3;
                        }
                        j6 = j4 >> i;
                        i10++;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i9 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr4 = jArr;
                i3 = 8;
            }
        }
        hx0Var.c();
        mh0 mh0VarM = m();
        int[] iArr3 = mh0VarM.b;
        Object[] objArr = mh0VarM.c;
        long[] jArr6 = mh0VarM.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            rl1 rl1Var2 = ((tl1) objArr[i25]).a;
                            nl1 nl1Var = rl1Var2.d;
                            zl1 zl1Var = vl1.d;
                            if (nl1Var.e.c(zl1Var) && ix0Var2.a(i26)) {
                                z(i26, 16, (String) rl1Var2.d.c(zl1Var));
                            }
                            hx0Var.i(i26, new sl1(rl1Var2, m()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.M = new sl1(this.h.getSemanticsOwner().a(), m());
    }

    @Override // defpackage.u0
    public final qt0 a(View view) {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, m1 m1Var, String str, Bundle bundle) {
        rl1 rl1Var;
        RectF[] rectFArr;
        int i2;
        int i3;
        int i4;
        pz1 pz1Var;
        pc1 pc1Var;
        AccessibilityNodeInfo accessibilityNodeInfo = m1Var.a;
        tl1 tl1Var = (tl1) m().b(i);
        if (tl1Var == null || (rl1Var = tl1Var.a) == null) {
            return;
        }
        ql0 ql0Var = rl1Var.c;
        nl1 nl1Var = rl1Var.d;
        zx0 zx0Var = nl1Var.e;
        String strN = n(rl1Var);
        if (xi0.o(str, this.I)) {
            int iD = this.G.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (xi0.o(str, this.J)) {
            int iD2 = this.H.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = zx0Var.c(ml1.a);
        h4 h4Var = this.h;
        int i5 = 0;
        if (zC && bundle != null && xi0.o(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i7 > 0 && i6 >= 0) {
                if (i6 < (strN != null ? strN.length() : Integer.MAX_VALUE)) {
                    pz1 pz1VarW = xc.w(nl1Var);
                    if (pz1VarW == null) {
                        rectFArr = null;
                    } else {
                        tg0 tg0Var = ql0Var.I.c;
                        if (!tg0Var.Z.r) {
                            tg0Var = null;
                        }
                        if (tg0Var != null) {
                            long jM = tg0Var.M(0L);
                            pc1 pc1VarG = rl1Var.g();
                            RectF[] rectFArr2 = new RectF[i7];
                            while (i5 < i7) {
                                int i8 = i6 + i5;
                                if (i8 >= pz1VarW.a.a.f.length()) {
                                    i3 = i6;
                                    i4 = i7;
                                    pz1Var = pz1VarW;
                                    pc1Var = pc1VarG;
                                    i2 = i5;
                                } else {
                                    pc1 pc1VarI = pz1VarW.b(i8).i(jM);
                                    pc1 pc1VarE = pc1VarI.g(pc1VarG) ? pc1VarI.e(pc1VarG) : null;
                                    if (pc1VarE != null) {
                                        i2 = i5;
                                        long jQ = h4Var.q((((long) Float.floatToRawIntBits(pc1VarE.a)) << 32) | (((long) Float.floatToRawIntBits(pc1VarE.b)) & 4294967295L));
                                        long jQ2 = h4Var.q((((long) Float.floatToRawIntBits(pc1VarE.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(pc1VarE.c)) << 32));
                                        int i9 = (int) (jQ >> 32);
                                        i3 = i6;
                                        i4 = i7;
                                        int i10 = (int) (jQ2 >> 32);
                                        pz1Var = pz1VarW;
                                        pc1Var = pc1VarG;
                                        int i11 = (int) (jQ & 4294967295L);
                                        int i12 = (int) (jQ2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)));
                                    }
                                }
                                i5 = i2 + 1;
                                pz1VarW = pz1Var;
                                i7 = i4;
                                pc1VarG = pc1Var;
                                i6 = i3;
                            }
                            rectFArr = rectFArr2;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        zl1 zl1Var = vl1.A;
        if (zx0Var.c(zl1Var) && bundle != null && xi0.o(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = zx0Var.g(zl1Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (xi0.o(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, rl1Var.f);
            return;
        }
        if (xi0.o(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = zx0Var.g(vl1.Q);
            ym1 ym1Var = (ym1) (objG2 == null ? null : objG2);
            if (ym1Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                pc1 pc1VarO = o(rl1Var, rect, ym1Var);
                float f = pc1VarO.b;
                float f2 = pc1VarO.a;
                hk hkVarA = ym1Var.a(pc1VarO.c(), ql0Var.C, h4Var.getDensity());
                if (hkVarA instanceof o31) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", F(hkVarA, f2, f));
                    return;
                } else if (hkVarA instanceof p31) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", F(hkVarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", H(hkVarA));
                    return;
                } else if (!(hkVarA instanceof n31)) {
                    ez1.a();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I(hkVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (xi0.o(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = zx0Var.g(vl1.Q);
            ym1 ym1Var2 = (ym1) (objG3 == null ? null : objG3);
            if (ym1Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                pc1 pc1VarO2 = o(rl1Var, rect2, ym1Var2);
                Rect rectF = F(ym1Var2.a(pc1VarO2.c(), ql0Var.C, h4Var.getDensity()), pc1VarO2.a, pc1VarO2.b);
                if (rectF != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectF);
                    return;
                }
                return;
            }
            return;
        }
        if (xi0.o(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = zx0Var.g(vl1.Q);
            ym1 ym1Var3 = (ym1) (objG4 == null ? null : objG4);
            if (ym1Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrH = H(ym1Var3.a(o(rl1Var, rect3, ym1Var3).c(), ql0Var.C, h4Var.getDensity()));
                if (fArrH != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrH);
                    return;
                }
                return;
            }
            return;
        }
        if (xi0.o(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = zx0Var.g(vl1.Q);
            ym1 ym1Var4 = (ym1) (objG5 == null ? null : objG5);
            if (ym1Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                pc1 pc1VarO3 = o(rl1Var, rect4, ym1Var4);
                Region regionI = I(ym1Var4.a(pc1VarO3.c(), ql0Var.C, h4Var.getDensity()), pc1VarO3.a, pc1VarO3.b);
                if (regionI != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionI);
                }
            }
        }
    }

    public final Rect f(tl1 tl1Var) {
        sh0 sh0Var = tl1Var.b;
        return G(sh0Var.a, sh0Var.b, sh0Var.c, sh0Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(boolean z, int i, long j) {
        zl1 zl1Var;
        int i2;
        if (xi0.o(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mh0 mh0VarM = m();
            if (!w01.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    zl1Var = vl1.w;
                } else {
                    if (z) {
                        ez1.a();
                        return false;
                    }
                    zl1Var = vl1.v;
                }
                Object[] objArr = mh0VarM.c;
                long[] jArr = mh0VarM.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    tl1 tl1Var = (tl1) objArr[(i3 << 3) + i6];
                                    sh0 sh0Var = tl1Var.b;
                                    float f = sh0Var.a;
                                    i2 = i4;
                                    float f2 = sh0Var.b;
                                    float f3 = sh0Var.c;
                                    float f4 = sh0Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = tl1Var.a.d.e.g(zl1Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        wi1 wi1Var = (wi1) objG;
                                        if (wi1Var != null) {
                                            ha0 ha0Var = wi1Var.a;
                                            if (i < 0) {
                                                if (((Number) ha0Var.a()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) ha0Var.a()).floatValue() < ((Number) wi1Var.b.a()).floatValue()) {
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void h() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p()) {
                v(this.h.getSemanticsOwner().a(), this.M);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                B(m());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    K();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent i(int i, int i2) {
        tl1 tl1Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        h4 h4Var = this.h;
        accessibilityEventObtain.setPackageName(h4Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(h4Var, i);
        if (p() && (tl1Var = (tl1) m().b(i)) != null) {
            rl1 rl1Var = tl1Var.a;
            accessibilityEventObtain.setPassword(rl1Var.d.e.c(vl1.L));
            Object objG = rl1Var.d.e.g(vl1.o);
            if (objG == null) {
                objG = null;
            }
            boolean zO = xi0.o(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                v0.i(accessibilityEventObtain, zO);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent j(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventI = i(i, 8192);
        if (num != null) {
            accessibilityEventI.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventI.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventI.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventI.getText().add(charSequence);
        }
        return accessibilityEventI;
    }

    public final int k(rl1 rl1Var) {
        nl1 nl1Var = rl1Var.d;
        if (!nl1Var.e.c(vl1.a)) {
            zl1 zl1Var = vl1.H;
            if (nl1Var.e.c(zl1Var)) {
                return (int) (((wz1) nl1Var.c(zl1Var)).a & 4294967295L);
            }
        }
        return this.x;
    }

    public final int l(rl1 rl1Var) {
        nl1 nl1Var = rl1Var.d;
        if (!nl1Var.e.c(vl1.a)) {
            zl1 zl1Var = vl1.H;
            if (nl1Var.e.c(zl1Var)) {
                return (int) (((wz1) nl1Var.c(zl1Var)).a >> 32);
            }
        }
        return this.x;
    }

    public final mh0 m() {
        if (this.C) {
            this.C = false;
            h4 h4Var = this.h;
            this.E = nu0.p(h4Var.getSemanticsOwner(), a4.h);
            if (p()) {
                hx0 hx0Var = this.E;
                Resources resources = h4Var.getContext().getResources();
                fx0 fx0Var = this.G;
                fx0Var.a();
                fx0 fx0Var2 = this.H;
                fx0Var2.a();
                tl1 tl1Var = (tl1) hx0Var.b(-1);
                rl1 rl1Var = tl1Var != null ? tl1Var.a : null;
                rl1Var.getClass();
                ArrayList arrayListB = cm1.b(rl1Var, new g3(3, hx0Var), new g3(4, resources), hk.G(rl1Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((rl1) arrayListB.get(i - 1)).f;
                        int i3 = ((rl1) arrayListB.get(i)).f;
                        fx0Var.f(i2, i3);
                        fx0Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pc1 o(rl1 rl1Var, Rect rect, ym1 ym1Var) {
        k4 k4Var = new k4(ym1Var);
        ql0 ql0Var = rl1Var.c;
        sv0 sv0Var = ql0Var.I.f;
        xw xwVar = null;
        if ((sv0Var.h & 8) != 0) {
            loop0: while (true) {
                if (sv0Var == null) {
                    break;
                }
                if ((sv0Var.g & 8) != 0) {
                    sv0 sv0VarK = sv0Var;
                    iy0 iy0Var = null;
                    while (sv0VarK != null) {
                        if (sv0VarK instanceof pl1) {
                            ((pl1) sv0VarK).g0(k4Var);
                            if (k4Var.e) {
                                xwVar = sv0VarK;
                                break loop0;
                            }
                        } else if ((sv0VarK.g & 8) != 0 && (sv0VarK instanceof yw)) {
                            int i = 0;
                            for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                if ((sv0Var2.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        sv0VarK = sv0Var2;
                                    } else {
                                        if (iy0Var == null) {
                                            iy0Var = new iy0(new sv0[16]);
                                        }
                                        if (sv0VarK != null) {
                                            iy0Var.b(sv0VarK);
                                            sv0VarK = null;
                                        }
                                        iy0Var.b(sv0Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        sv0VarK = bl.k(iy0Var);
                    }
                    if ((sv0Var.h & 8) != 0) {
                        break;
                    }
                    sv0Var = sv0Var.j;
                } else if ((sv0Var.h & 8) != 0) {
                }
            }
        }
        xw xwVar2 = (pl1) xwVar;
        if (xwVar2 == null || !((sv0) xwVar2).e.r) {
            return al.k(ql0Var.I.d, false);
        }
        c01 c01VarO = bl.O(xwVar2);
        pc1 pc1VarI = al.w(c01VarO).I(c01VarO, false);
        Rect rectG = G(pc1VarI.a, pc1VarI.b, pc1VarI.c, pc1VarI.d);
        float f = rectG.left - rect.left;
        float f2 = rectG.top - rect.top;
        return new pc1(f, f2, rectG.width() + f, rectG.height() + f2);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            this.m = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        h4 h4Var = this.h;
        Handler handler = h4Var.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        Handler handler2 = h4Var.getHandler();
        if (handler2 != null) {
            handler2.removeCallbacks(this.Q);
        }
        this.A = false;
        this.N = false;
        AccessibilityManager accessibilityManager = this.k;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final boolean p() {
        AccessibilityManager accessibilityManager = this.k;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.m;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.m = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void q(ql0 ql0Var) {
        if (this.z.add(ql0Var) && p() && !this.A) {
            this.A = true;
            long jUptimeMillis = (this.B + this.l) - SystemClock.uptimeMillis();
            h4 h4Var = this.h;
            if (jUptimeMillis < 0) {
                h4Var.post(this);
            } else {
                h4Var.postDelayed(this, jUptimeMillis);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ix0 ix0Var;
        md mdVar = this.z;
        this.A = false;
        this.B = SystemClock.uptimeMillis();
        try {
            if (p()) {
                int i = mdVar.g;
                int i2 = 0;
                while (true) {
                    ix0Var = this.P;
                    if (i2 >= i) {
                        break;
                    }
                    ql0 ql0Var = (ql0) mdVar.f[i2];
                    C(ql0Var, ix0Var);
                    D(ql0Var);
                    i2++;
                }
                ix0Var.d = 0;
                long[] jArr = ix0Var.a;
                if (jArr != pi1.a) {
                    nd.S(jArr, -9187201950435737472L);
                    long[] jArr2 = ix0Var.a;
                    int i3 = ix0Var.c;
                    int i4 = i3 >> 3;
                    long j = 255 << ((i3 & 7) << 3);
                    jArr2[i4] = (jArr2[i4] & (~j)) | j;
                }
                ix0Var.e = pi1.a(ix0Var.c) - ix0Var.d;
                if (!this.N) {
                    this.N = true;
                    this.Q.run();
                }
            }
            mdVar.clear();
            this.t.c();
            this.u.c();
            mdVar.clear();
        } catch (Throwable th) {
            mdVar.clear();
            throw th;
        }
    }

    public final int u(int i) {
        if (i == this.h.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(rl1 rl1Var, sl1 sl1Var) {
        int[] iArr = uh0.a;
        ix0 ix0Var = new ix0();
        List listJ = rl1.j(4, rl1Var);
        ql0 ql0Var = rl1Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            rl1 rl1Var2 = (rl1) listJ.get(i);
            mh0 mh0VarM = m();
            int i2 = rl1Var2.f;
            if (mh0VarM.a(i2)) {
                if (!sl1Var.b.b(i2)) {
                    q(ql0Var);
                    return;
                }
                ix0Var.a(i2);
            }
        }
        ix0 ix0Var2 = sl1Var.b;
        int[] iArr2 = ix0Var2.b;
        long[] jArr = ix0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !ix0Var.b(iArr2[(i3 << 3) + i5])) {
                            q(ql0Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = rl1.j(4, rl1Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            rl1 rl1Var3 = (rl1) listJ2.get(i6);
            sl1 sl1Var2 = (sl1) this.L.b(rl1Var3.f);
            if (sl1Var2 != null && m().a(rl1Var3.f)) {
                v(rl1Var3, sl1Var2);
            }
        }
    }

    public final boolean w(AccessibilityEvent accessibilityEvent) {
        if (!p()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.s = true;
        }
        try {
            return ((Boolean) this.j.i(accessibilityEvent)).booleanValue();
        } finally {
            this.s = false;
        }
    }

    public final boolean x(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !p()) {
            return false;
        }
        AccessibilityEvent accessibilityEventI = i(i, i2);
        if (num != null) {
            accessibilityEventI.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventI.setContentDescription(vq0.a(list, ",", null, 62));
        }
        return w(accessibilityEventI);
    }

    public final void z(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventI = i(u(i), 32);
        accessibilityEventI.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventI.getText().add(str);
        }
        w(accessibilityEventI);
    }
}
