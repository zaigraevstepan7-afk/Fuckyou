package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import android.text.Spanned;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.reddit.secondpage.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc1 {
    public static long a;
    public static Method b;

    public qc1() {
        new ConcurrentHashMap();
    }

    public static final pc1 a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new pc1(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void b(ob0 ob0Var, tv0 tv0Var) {
        n5 n5Var = n5.i;
        int iHashCode = Long.hashCode(ob0Var.T);
        tv0 tv0VarP = bk.P(ob0Var, tv0Var);
        b61 b61VarL = ob0Var.l();
        ep.c.getClass();
        zp zpVar = dp.b;
        ob0Var.Z();
        if (ob0Var.S) {
            ob0Var.k(zpVar);
        } else {
            ob0Var.i0();
        }
        xc.E(dp.f, ob0Var, n5Var);
        xc.E(dp.e, ob0Var, b61VarL);
        xc.C(ob0Var, dp.h);
        xc.E(dp.d, ob0Var, tv0VarP);
        xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
        ob0Var.p(true);
    }

    public static final void c(boolean z, ee1 ee1Var, ry1 ry1Var, ob0 ob0Var, int i) {
        int i2;
        qz1 qz1VarD;
        ob0Var.X(-1344558920);
        if ((i & 6) == 0) {
            i2 = (ob0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.d(ee1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(ry1Var) ? 256 : 128;
        }
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | ob0Var.f(ry1Var);
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (zF || objK == l91Var) {
                objK = new oy1(ry1Var, z);
                ob0Var.f0(objK);
            }
            ex1 ex1Var = (ex1) objK;
            boolean zH = (i3 == 4) | ob0Var.h(ry1Var);
            Object objK2 = ob0Var.K();
            if (zH || objK2 == l91Var) {
                objK2 = new sy1(ry1Var, z);
                ob0Var.f0(objK2);
            }
            a11 a11Var = (a11) objK2;
            boolean zG = wz1.g(ry1Var.n().b);
            int i4 = (int) (z ? ry1Var.n().b >> 32 : ry1Var.n().b & 4294967295L);
            jo0 jo0Var = ry1Var.d;
            float fH = 0.0f;
            if (jo0Var != null && (qz1VarD = jo0Var.d()) != null) {
                pz1 pz1Var = qz1VarD.a;
                if (i4 >= 0) {
                    oz1 oz1Var = pz1Var.a;
                    vw0 vw0Var = pz1Var.b;
                    if (oz1Var.a.f.length() != 0) {
                        int iMin = Math.min(vw0Var.d(i4), Math.min(vw0Var.b - 1, vw0Var.f - 1));
                        if (i4 <= vw0Var.c(iMin, false)) {
                            vw0Var.l(iMin);
                            ArrayList arrayList = vw0Var.h;
                            l41 l41Var = (l41) arrayList.get(bk.v(iMin, arrayList));
                            fH = l41Var.a.d.h(iMin - l41Var.d);
                        }
                    }
                }
            }
            float f = fH;
            boolean zH2 = ob0Var.h(ex1Var);
            Object objK3 = ob0Var.K();
            if (zH2 || objK3 == l91Var) {
                objK3 = new u5(5, ex1Var);
                ob0Var.f0(objK3);
            }
            xi0.h(a11Var, z, ee1Var, zG, 0L, f, bv1.a(qv0.a, ex1Var, (PointerInputEventHandler) objK3), ob0Var, (i2 << 3) & 1008);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new y7(z, ee1Var, ry1Var, i);
        }
    }

    public static final void d(zx0 zx0Var, Object obj, Object obj2) {
        int iF = zx0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : zx0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof ay0) {
                ((ay0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                ay0 ay0Var = new ay0();
                ay0Var.a(obj3);
                ay0Var.a(obj2);
                obj2 = ay0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            zx0Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        zx0Var.b[i] = obj;
        zx0Var.c[i] = obj2;
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final int f(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static zx0 g() {
        long[] jArr = pi1.a;
        return new zx0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, oc] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static final int l(String str, int i) {
        ?? r5;
        ?? r52;
        int spanEnd;
        g30 g30VarO = o();
        Integer num = null;
        if (g30VarO != null) {
            if (!(g30VarO.c() == 1)) {
                yc.l("Not initialized yet");
                return 0;
            }
            bk.n(str, "charSequence cannot be null");
            ?? r4 = g30VarO.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r52 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                b32[] b32VarArr = (b32[]) spanned.getSpans(i, i + 1, b32.class);
                if (b32VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(b32VarArr[0]);
                    r52 = str;
                } else {
                    ?? r53 = str;
                    spanEnd = ((r30) r4.u(r53, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new r30(i))).g;
                    r52 = r53;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r52;
            if (spanEnd != -1) {
                num = numValueOf;
                r5 = r52;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int m(String str, int i) {
        g30 g30VarO = o();
        Integer num = null;
        if (g30VarO != null) {
            Integer numValueOf = Integer.valueOf(g30VarO.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final vh1 n(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            vh1 vh1Var = tag instanceof vh1 ? (vh1) tag : null;
            if (vh1Var != null) {
                return vh1Var;
            }
            Object objS = af1.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final g30 o() {
        if (!g30.d()) {
            return null;
        }
        g30 g30VarA = g30.a();
        if (g30VarA.c() == 1) {
            return g30VarA;
        }
        return null;
    }

    public static final int p(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return n12.a();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean r(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final um1 s(um1 um1Var, um1 um1Var2, float f) {
        long jU = lk.U(f, um1Var.a, um1Var2.a);
        long j = um1Var.b;
        long j2 = um1Var2.b;
        float fA = xk.A(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fA2 = xk.A(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new um1(xk.A(um1Var.c, um1Var2.c, f), jU, (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA2) & 4294967295L));
    }

    public static vu0 t(qg1 qg1Var, int i, int i2, int i3, int i4, int i5, xu0 xu0Var, List list, z61[] z61VarArr, int i6) {
        int i7;
        float f;
        long j;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j2 = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            pu0 pu0Var = (pu0) list2.get(i11);
            float fM = ef1.m(ef1.k(pu0Var));
            if (fM > 0.0f) {
                f2 += fM;
                i12++;
                j = j2;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                z61 z61VarE = z61VarArr[i11];
                j = j2;
                if (z61VarE == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    z61VarE = pu0Var.e(qg1Var.e(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                z61 z61Var = z61VarE;
                int i15 = qg1Var.i(z61Var);
                int iF = qg1Var.f(z61Var);
                iArr[i8] = i15;
                int i16 = i14 - i15;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i5, i16);
                i13 += i15 + iMin;
                iMax = Math.max(iMax, iF);
                z61VarArr[i8] = z61Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i17 = i12;
        if (i17 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j4 = ((long) (i17 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i18 = 0; i18 < i6; i18++) {
                jRound -= (long) Math.round(ef1.m(ef1.k((pu0) list2.get(i18))) * f3);
            }
            int i19 = iMax;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i6) {
                if (z61VarArr[i20] == null) {
                    pu0 pu0Var2 = (pu0) list2.get(i20);
                    rg1 rg1VarK = ef1.k(pu0Var2);
                    float fM2 = ef1.m(rg1VarK);
                    if (fM2 <= 0.0f) {
                        lg0.b("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fM2 * f) + iSignum);
                    z61 z61VarE2 = pu0Var2.e(qg1Var.e((!(rg1VarK != null ? rg1VarK.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int i22 = qg1Var.i(z61VarE2);
                    int iF2 = qg1Var.f(z61VarE2);
                    iArr[i20] = i22;
                    i21 += i22;
                    int iMax3 = Math.max(i19, iF2);
                    z61VarArr[i20] = z61VarE2;
                    i19 = iMax3;
                } else {
                    f = f3;
                }
                i20++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (((long) i21) + j4);
            int i23 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i23) {
                i7 = i23;
            }
            iMax = i19;
        }
        int i24 = i7 + i13;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax4 = Math.max(i24, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        qg1Var.c(iMax4, xu0Var, iArr, iArr2);
        return qg1Var.a(z61VarArr, xu0Var, iArr2, iMax4, iMax5);
    }

    public static List u(mp1 mp1Var, int i, mp1 mp1Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iU = mp1Var.u(i);
        int i4 = i + iU;
        int iF = mp1Var.f(i);
        int iF2 = mp1Var.f(i4);
        int i5 = iF2 - iF;
        boolean z5 = i >= 0 && (mp1Var.b[(mp1Var.r(i) * 5) + 1] & 201326592) != 0;
        mp1Var2.w(iU);
        mp1Var2.x(i5, mp1Var2.t);
        if (mp1Var.g < i4) {
            mp1Var.B(i4);
        }
        if (mp1Var.k < iF2) {
            mp1Var.C(iF2, i4);
        }
        int[] iArr = mp1Var2.b;
        int i6 = mp1Var2.t;
        int i7 = i6 * 5;
        nd.K(i7, i * 5, i4 * 5, mp1Var.b, iArr);
        Object[] objArr = mp1Var2.c;
        int i8 = mp1Var2.i;
        System.arraycopy(mp1Var.c, iF, objArr, i8, i5);
        int i9 = mp1Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iU;
        int iG = i8 - mp1Var2.g(iArr, i6);
        int i12 = mp1Var2.m;
        int i13 = mp1Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iG2 = mp1Var2.g(iArr, i15) + iG;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = mp1Var2.k;
            }
            iArr2[(i15 * 5) + 4] = mp1.i(iG2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        mp1Var2.m = i14;
        int iA = lp1.a(mp1Var.d, i, mp1Var.p());
        int iA2 = lp1.a(mp1Var.d, i4, mp1Var.p());
        if (iA < iA2) {
            ArrayList arrayList = mp1Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i17 = iA; i17 < iA2; i17++) {
                jb0 jb0Var = (jb0) arrayList.get(i17);
                jb0Var.a += i10;
                arrayList2.add(jb0Var);
            }
            mp1Var2.d.addAll(lp1.a(mp1Var2.d, mp1Var2.t, mp1Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = f40.e;
        }
        if (!list.isEmpty()) {
            HashMap map = mp1Var.e;
            HashMap map2 = mp1Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = mp1Var2.v;
        mp1Var2.O(i9);
        int iE = mp1Var.E(mp1Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                mp1Var.P();
                mp1Var.a(iE - mp1Var.t);
                mp1Var.P();
            }
            mp1Var.a(i - mp1Var.t);
            boolean zH = mp1Var.H();
            if (z7) {
                mp1Var.M();
                mp1Var.j();
                mp1Var.M();
                mp1Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = mp1Var.I(i, iU);
            mp1Var.J(iF, i5, i - 1);
            z4 = zI;
        }
        if (z4) {
            mp.a("Unexpectedly removed anchors");
        }
        int i20 = mp1Var2.o;
        int i21 = iArr3[i7 + 1];
        mp1Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            mp1Var2.t = i11;
            mp1Var2.i = i8 + i5;
        }
        if (z6) {
            mp1Var2.T(i9);
        }
        return list;
    }

    public static final boolean v(zx0 zx0Var, Object obj, Object obj2) {
        Object objG = zx0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof ay0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            zx0Var.k(obj);
            return true;
        }
        ay0 ay0Var = (ay0) objG;
        boolean zL = ay0Var.l(obj2);
        if (zL && ay0Var.g()) {
            zx0Var.k(obj);
        }
        return zL;
    }

    public static final void w(zx0 zx0Var, Object obj) {
        boolean zG;
        long[] jArr = zx0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = zx0Var.b[i4];
                        Object obj3 = zx0Var.c[i4];
                        if (obj3 instanceof ay0) {
                            ay0 ay0Var = (ay0) obj3;
                            ay0Var.l(obj);
                            zG = ay0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            zx0Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d02 x(d02 d02Var, al0 al0Var) {
        long j;
        fz1 fz1Var;
        int i;
        int i2;
        uz1 uz1Var;
        zq1 zq1Var = d02Var.a;
        cz1 cz1Var = ar1.d;
        cz1 cz1Var2 = zq1Var.a;
        if (cz1Var2.equals(bz1.a)) {
            cz1Var2 = ar1.d;
        }
        cz1 cz1Var3 = cz1Var2;
        long j2 = zq1Var.b;
        h02[] h02VarArr = g02.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = ar1.a;
        }
        long j3 = j2;
        aa0 aa0Var = zq1Var.c;
        if (aa0Var == null) {
            aa0Var = aa0.g;
        }
        aa0 aa0Var2 = aa0Var;
        y90 y90Var = zq1Var.d;
        y90 y90Var2 = new y90(y90Var != null ? y90Var.a : 0);
        z90 z90Var = zq1Var.e;
        z90 z90Var2 = new z90(z90Var != null ? z90Var.a : 65535);
        lv1 lv1Var = zq1Var.f;
        if (lv1Var == null) {
            lv1Var = lv1.a;
        }
        lv1 lv1Var2 = lv1Var;
        String str = zq1Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = zq1Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = ar1.b;
        }
        long j5 = j4;
        df dfVar = zq1Var.i;
        float f = dfVar != null ? dfVar.a : 0.0f;
        df dfVar2 = new df(Float.isNaN(f) ? 0.0f : f);
        dz1 dz1Var = zq1Var.j;
        if (dz1Var == null) {
            dz1Var = dz1.c;
        }
        dz1 dz1Var2 = dz1Var;
        as0 as0VarJ = zq1Var.k;
        if (as0VarJ == null) {
            as0 as0Var = as0.g;
            as0VarJ = f71.a.j();
        }
        as0 as0Var2 = as0VarJ;
        long j6 = zq1Var.l;
        if (j6 == 16) {
            j6 = ar1.c;
        }
        long j7 = j6;
        ax1 ax1Var = zq1Var.m;
        if (ax1Var == null) {
            ax1Var = ax1.b;
        }
        ax1 ax1Var2 = ax1Var;
        um1 um1Var = zq1Var.n;
        if (um1Var == null) {
            um1Var = um1.d;
        }
        um1 um1Var2 = um1Var;
        v71 v71Var = zq1Var.o;
        q10 q10Var = zq1Var.p;
        if (q10Var == null) {
            q10Var = i60.a;
        }
        zq1 zq1Var2 = new zq1(cz1Var3, j3, aa0Var2, y90Var2, z90Var2, lv1Var2, str2, j5, dfVar2, dz1Var2, as0Var2, j7, ax1Var2, um1Var2, v71Var, q10Var);
        p41 p41Var = d02Var.b;
        int i3 = q41.b;
        int i4 = p41Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = p41Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = al0Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        ez1.a();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = p41Var.c;
            if ((j & 1095216660480L) == 0) {
                j = q41.a;
            }
            fz1Var = p41Var.d;
            if (fz1Var == null) {
                fz1Var = fz1.c;
            }
            m71 m71Var = p41Var.e;
            mp0 mp0Var = p41Var.f;
            i = p41Var.g;
            if (i == 0) {
                i = hp0.b;
            }
            i2 = p41Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            uz1Var = p41Var.i;
            if (uz1Var == null) {
                uz1Var = uz1.c;
            }
            return new d02(zq1Var2, new p41(i4, i6, j, fz1Var, m71Var, mp0Var, i, i2, uz1Var), d02Var.c);
        }
        int iOrdinal2 = al0Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            ez1.a();
            return null;
        }
        i6 = i5;
        j = p41Var.c;
        if ((j & 1095216660480L) == 0) {
        }
        fz1Var = p41Var.d;
        if (fz1Var == null) {
        }
        m71 m71Var2 = p41Var.e;
        mp0 mp0Var2 = p41Var.f;
        i = p41Var.g;
        if (i == 0) {
        }
        i2 = p41Var.h;
        if (i2 == 0) {
        }
        uz1Var = p41Var.i;
        if (uz1Var == null) {
        }
        return new d02(zq1Var2, new p41(i4, i6, j, fz1Var, m71Var2, mp0Var2, i, i2, uz1Var), d02Var.c);
    }

    public static final pc1 y(zk0 zk0Var) {
        pc1 pc1VarK = al.k(zk0Var, true);
        long jG = zk0Var.g(pc1VarK.d());
        float f = pc1VarK.c;
        float f2 = pc1VarK.d;
        long jG2 = zk0Var.g((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new pc1(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jG2 >> 32)), Float.intBitsToFloat((int) (jG2 & 4294967295L)));
    }

    public abstract Typeface h(Context context, s90 s90Var, Resources resources, int i);

    public abstract Typeface i(Context context, ca0[] ca0VarArr, int i);

    public Typeface j(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface k(Context context, Resources resources, int i, String str);
}
