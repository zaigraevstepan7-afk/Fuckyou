package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l91 implements hq1, kt, e92, a1, b90, bd, dd {
    public static volatile String h = "su";
    public final /* synthetic */ int e;
    public static final l91 f = new l91(1);
    public static final l91 g = new l91(2);
    public static final l91 i = new l91(3);
    public static final l91 j = new l91(4);
    public static final l91 k = new l91(5);
    public static final yc l = new yc(25);
    public static final yc m = new yc(26);
    public static final yc n = new yc(27);
    public static final yc o = new yc(28);
    public static final l91 p = new l91(7);
    public static final l91 q = new l91(8);
    public static final l91 r = new l91(9);
    public static final ez1 s = new ez1(0);
    public static final ez1 t = new ez1(1);
    public static final l91 u = new l91(11);
    public static final l91 v = new l91(12);
    public static final ez1 w = new ez1(4);
    public static final l91 x = new l91(14);
    public static final f92 y = new f92();

    public l91() {
        this.e = 22;
        new dt0(16);
        long[] jArr = pi1.a;
        new zx0();
    }

    public static final ms i(double d) {
        return d == 1.5d ? new ms(1.5d, 1.5d, 3.0d, 5.5d) : d == 3.0d ? new ms(3.0d, 3.0d, 4.5d, 7.0d) : d == 4.5d ? new ms(4.5d, 4.5d, 7.0d, 11.0d) : d == 6.0d ? new ms(6.0d, 6.0d, 7.0d, 11.0d) : d == 7.0d ? new ms(7.0d, 7.0d, 11.0d, 21.0d) : d == 9.0d ? new ms(9.0d, 9.0d, 11.0d, 21.0d) : d == 11.0d ? new ms(11.0d, 11.0d, 21.0d, 21.0d) : d == 21.0d ? new ms(21.0d, 21.0d, 21.0d, 21.0d) : new ms(d, d, 7.0d, 21.0d);
    }

    public static final double j(ld0 ld0Var, boolean z, g20 g20Var) {
        double dQ = q(ld0Var);
        return g20Var == g20.g ? z ? (dQ < 105.0d || dQ >= 125.0d) ? 14 : 6 : 18 : 12;
    }

    public static final double k(ld0 ld0Var, g20 g20Var) {
        double dS = s(ld0Var);
        int i2 = 28;
        if (g20Var != g20.g && (dS < 250.0d || dS >= 270.0d)) {
            i2 = 20;
        }
        return i2;
    }

    public static fx1 l(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, ob0 ob0Var, int i2) {
        long j10 = vl.g;
        return m(((ju0) ob0Var.j(mu0.b)).a, (xz1) ob0Var.j(yz1.a)).a(j10, j10, j10, j10, j2, j3, (i2 & 64) != 0 ? j10 : j4, (i2 & 128) != 0 ? j10 : j5, j10, j10, null, j6, j7, j8, j9, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10);
    }

    public static fx1 m(bm bmVar, xz1 xz1Var) {
        fx1 fx1Var = bmVar.d0;
        if (fx1Var != null) {
            if (xi0.o(fx1Var.k, xz1Var)) {
                return fx1Var;
            }
            fx1 fx1VarA = fx1Var.a(fx1Var.a, fx1Var.b, fx1Var.c, fx1Var.d, fx1Var.e, fx1Var.f, fx1Var.g, fx1Var.h, fx1Var.i, fx1Var.j, xz1Var, fx1Var.l, fx1Var.m, fx1Var.n, fx1Var.o, fx1Var.p, fx1Var.q, fx1Var.r, fx1Var.s, fx1Var.t, fx1Var.u, fx1Var.v, fx1Var.w, fx1Var.x, fx1Var.y, fx1Var.z, fx1Var.A, fx1Var.B, fx1Var.C, fx1Var.D, fx1Var.E, fx1Var.F, fx1Var.G, fx1Var.H, fx1Var.I, fx1Var.J, fx1Var.K, fx1Var.L, fx1Var.M, fx1Var.N, fx1Var.O, fx1Var.P, fx1Var.Q);
            bmVar.d0 = fx1VarA;
            return fx1VarA;
        }
        long jB = dm.b(bmVar, u4.I);
        long jB2 = dm.b(bmVar, u4.N);
        cm cmVar = u4.q;
        long jB3 = dm.b(bmVar, cmVar);
        float f2 = u4.r;
        long jB4 = vl.b(f2, jB3);
        long jB5 = dm.b(bmVar, u4.C);
        cm cmVar2 = u4.m;
        long jB6 = dm.b(bmVar, cmVar2);
        long jB7 = dm.b(bmVar, cmVar2);
        long jB8 = dm.b(bmVar, cmVar2);
        long jB9 = dm.b(bmVar, cmVar2);
        long jB10 = dm.b(bmVar, u4.l);
        long jB11 = dm.b(bmVar, u4.B);
        long jB12 = dm.b(bmVar, u4.H);
        long jB13 = dm.b(bmVar, u4.k);
        long jB14 = vl.b(u4.p, dm.b(bmVar, u4.o));
        long jB15 = dm.b(bmVar, u4.A);
        long jB16 = dm.b(bmVar, u4.K);
        long jB17 = dm.b(bmVar, u4.S);
        long jB18 = vl.b(u4.v, dm.b(bmVar, u4.u));
        long jB19 = dm.b(bmVar, u4.E);
        long jB20 = dm.b(bmVar, u4.M);
        long jB21 = dm.b(bmVar, u4.U);
        long jB22 = vl.b(u4.z, dm.b(bmVar, u4.y));
        long jB23 = dm.b(bmVar, u4.G);
        long jB24 = dm.b(bmVar, u4.J);
        long jB25 = dm.b(bmVar, u4.R);
        long jB26 = vl.b(u4.t, dm.b(bmVar, u4.s));
        long jB27 = dm.b(bmVar, u4.D);
        cm cmVar3 = u4.O;
        long jB28 = dm.b(bmVar, cmVar3);
        long jB29 = dm.b(bmVar, cmVar3);
        long jB30 = vl.b(f2, dm.b(bmVar, cmVar));
        long jB31 = dm.b(bmVar, cmVar3);
        long jB32 = dm.b(bmVar, u4.L);
        long jB33 = dm.b(bmVar, u4.T);
        long jB34 = vl.b(u4.x, dm.b(bmVar, u4.w));
        long jB35 = dm.b(bmVar, u4.F);
        cm cmVar4 = u4.P;
        long jB36 = dm.b(bmVar, cmVar4);
        long jB37 = dm.b(bmVar, cmVar4);
        long jB38 = vl.b(f2, dm.b(bmVar, cmVar4));
        long jB39 = dm.b(bmVar, cmVar4);
        cm cmVar5 = u4.Q;
        fx1 fx1Var2 = new fx1(jB, jB2, jB4, jB5, jB6, jB7, jB8, jB9, jB10, jB11, xz1Var, jB12, jB13, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, jB22, jB23, jB24, jB25, jB26, jB27, jB28, jB29, jB30, jB31, jB32, jB33, jB34, jB35, jB36, jB37, jB38, jB39, dm.b(bmVar, cmVar5), dm.b(bmVar, cmVar5), vl.b(f2, dm.b(bmVar, cmVar5)), dm.b(bmVar, cmVar5));
        bmVar.d0 = fx1Var2;
        return fx1Var2;
    }

    public static double o(double d, double d2, double d3, boolean z) {
        ld0 ld0VarU = hk.u(d, d2, d3);
        double d4 = d3;
        while (true) {
            double d5 = ld0VarU.c;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            ld0 ld0VarU2 = hk.u(d, d2, d3);
            if (d5 < ld0VarU2.c) {
                d4 = d3;
                ld0VarU = ld0VarU2;
            }
        }
        return d4;
    }

    public static View p(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = h4.Q0;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                h4.Q0 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (xi0.o(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewP = p(viewGroup.getChildAt(i3), i2);
                    if (viewP != null) {
                        return viewP;
                    }
                }
            }
        }
        return null;
    }

    public static double q(ld0 ld0Var) {
        return lk.S(ld0Var, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    public static boolean r() {
        try {
            if (h4.K0 == null) {
                h4.K0 = Class.forName("android.os.SystemProperties");
            }
            if (h4.L0 == null) {
                Class cls = h4.K0;
                h4.L0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = h4.L0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return xi0.o(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static double s(ld0 ld0Var) {
        return lk.S(ld0Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    public static wx0 u(FileInputStream fileInputStream) throws au {
        byte[] bArr;
        try {
            o91 o91VarO = o91.o(fileInputStream);
            wx0 wx0Var = new wx0(false);
            j91[] j91VarArr = (j91[]) Arrays.copyOf(new j91[0], 0);
            wx0Var.b();
            if (j91VarArr.length > 0) {
                j91 j91Var = j91VarArr[0];
                throw null;
            }
            Map mapM = o91VarO.m();
            mapM.getClass();
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                t91 t91Var = (t91) entry.getValue();
                str.getClass();
                t91Var.getClass();
                int iC = t91Var.C();
                switch (iC == 0 ? -1 : k91.a[s91.w(iC)]) {
                    case -1:
                        throw new au("Value case is null.", null);
                    case 0:
                    default:
                        ez1.a();
                        return null;
                    case 1:
                        wx0Var.e(new i91(str), Boolean.valueOf(t91Var.t()));
                        break;
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        wx0Var.e(new i91(str), Float.valueOf(t91Var.x()));
                        break;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        wx0Var.e(new i91(str), Double.valueOf(t91Var.w()));
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        wx0Var.e(new i91(str), Integer.valueOf(t91Var.y()));
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        wx0Var.e(new i91(str), Long.valueOf(t91Var.z()));
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        wx0Var.e(new i91(str), t91Var.A());
                        break;
                    case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                        i91 i91Var = new i91(str);
                        ji0 ji0VarN = t91Var.B().n();
                        ji0VarN.getClass();
                        wx0Var.e(i91Var, pl.p0(ji0VarN));
                        break;
                    case t91.BYTES_FIELD_NUMBER /* 8 */:
                        i91 i91Var2 = new i91(str);
                        ji jiVarU = t91Var.u();
                        int size = jiVarU.size();
                        if (size == 0) {
                            bArr = ki0.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            jiVarU.e(bArr2, size);
                            bArr = bArr2;
                        }
                        wx0Var.e(i91Var2, bArr);
                        break;
                    case el.a /* 9 */:
                        throw new au("Value not set.", null);
                }
            }
            return new wx0(new LinkedHashMap(wx0Var.a()), true);
        } catch (fj0 e) {
            throw new au("Unable to parse preferences proto.", e);
        }
    }

    public static String v(String str) {
        return str == null ? "''" : s91.l("'", jt1.J(str, "'", "'\"'\"'"), "'");
    }

    public static double w(g12 g12Var, double d, double d2) {
        return lk.y(o(g12Var.a, g12Var.b * 1.0d, 100.0d, true), d, d2);
    }

    public static double x(g12 g12Var, double d, double d2) {
        return lk.y(o(g12Var.a, g12Var.b, 0.0d, false), d, d2);
    }

    public static void y(Object obj, n32 n32Var) {
        xb0 xb0VarA;
        Map mapA = ((wx0) obj).a();
        m91 m91VarN = o91.n();
        for (Map.Entry entry : mapA.entrySet()) {
            i91 i91Var = (i91) entry.getKey();
            Object value = entry.getValue();
            String str = i91Var.a;
            if (value instanceof Boolean) {
                r91 r91VarD = t91.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                r91VarD.c();
                t91.q((t91) r91VarD.f, zBooleanValue);
                xb0VarA = r91VarD.a();
            } else if (value instanceof Float) {
                r91 r91VarD2 = t91.D();
                float fFloatValue = ((Number) value).floatValue();
                r91VarD2.c();
                t91.r((t91) r91VarD2.f, fFloatValue);
                xb0VarA = r91VarD2.a();
            } else if (value instanceof Double) {
                r91 r91VarD3 = t91.D();
                double dDoubleValue = ((Number) value).doubleValue();
                r91VarD3.c();
                t91.o((t91) r91VarD3.f, dDoubleValue);
                xb0VarA = r91VarD3.a();
            } else if (value instanceof Integer) {
                r91 r91VarD4 = t91.D();
                int iIntValue = ((Number) value).intValue();
                r91VarD4.c();
                t91.s((t91) r91VarD4.f, iIntValue);
                xb0VarA = r91VarD4.a();
            } else if (value instanceof Long) {
                r91 r91VarD5 = t91.D();
                long jLongValue = ((Number) value).longValue();
                r91VarD5.c();
                t91.l((t91) r91VarD5.f, jLongValue);
                xb0VarA = r91VarD5.a();
            } else if (value instanceof String) {
                r91 r91VarD6 = t91.D();
                r91VarD6.c();
                t91.m((t91) r91VarD6.f, (String) value);
                xb0VarA = r91VarD6.a();
            } else if (value instanceof Set) {
                r91 r91VarD7 = t91.D();
                p91 p91VarO = q91.o();
                p91VarO.c();
                q91.l((q91) p91VarO.f, (Set) value);
                r91VarD7.c();
                t91.n((t91) r91VarD7.f, (q91) p91VarO.a());
                xb0VarA = r91VarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    yc.l("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                r91 r91VarD8 = t91.D();
                byte[] bArr = (byte[]) value;
                ji jiVarC = ji.c(bArr, 0, bArr.length);
                r91VarD8.c();
                t91.p((t91) r91VarD8.f, jiVarC);
                xb0VarA = r91VarD8.a();
            }
            m91VarN.getClass();
            m91VarN.c();
            o91.l((o91) m91VarN.f).put(str, (t91) xb0VarA);
        }
        o91 o91Var = (o91) m91VarN.a();
        int iA = o91Var.a(null);
        Logger logger = nl.f;
        if (iA > 4096) {
            iA = 4096;
        }
        nl nlVar = new nl(n32Var, iA);
        o91Var.b(nlVar);
        if (nlVar.d > 0) {
            nlVar.k();
        }
    }

    @Override // defpackage.bd, defpackage.dd
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.bd
    public void b(xu0 xu0Var, int i2, int[] iArr, al0 al0Var, int[] iArr2) {
        if (al0Var == al0.e) {
            pv.z(i2, iArr, iArr2, false);
        } else {
            pv.z(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.hq1
    public boolean c(Object obj, Object obj2) {
        switch (this.e) {
            case 1:
                return obj == obj2;
            default:
                return xi0.o(obj, obj2);
        }
    }

    @Override // defpackage.e92
    public a92 d(Context context, ix ixVar) {
        ixVar.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            og.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            return new a92(new mg((i2 >= 30 ? pg.e : i2 >= 29 ? v20.u : i2 >= 28 ? v20.t : v20.s).e(activity)), ixVar.g(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            yc.p("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new a92(new Rect(0, 0, point.x, point.y), ixVar.g(context));
    }

    @Override // defpackage.dd
    public void e(int i2, xu0 xu0Var, int[] iArr, int[] iArr2) {
        pv.z(i2, iArr, iArr2, false);
    }

    public void f(final boolean z, jx0 jx0Var, final fx1 fx1Var, final ym1 ym1Var, ob0 ob0Var, int i2) {
        ob0Var.X(-818661242);
        int i3 = i2 | (ob0Var.g(z) ? 4 : 2) | (ob0Var.g(false) ? 32 : 16) | (ob0Var.f(jx0Var) ? 256 : 128) | (ob0Var.f(fx1Var) ? 16384 : 8192) | (ob0Var.f(ym1Var) ? 131072 : 65536);
        if (ob0Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            ob0Var.S();
            if ((i2 & 1) != 0 && !ob0Var.x()) {
                ob0Var.Q();
            }
            ob0Var.q();
            boolean z2 = (i3 & 896) == 256;
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (z2 || objK == obj) {
                objK = new hy0(jx0Var);
                ob0Var.f0(objK);
            }
            hy0 hy0Var = (hy0) objK;
            final p60 p60VarW = bl.W(jw0.g, ob0Var);
            boolean zH = ((i3 & 14) == 4) | ((((57344 & i3) ^ 24576) > 16384 && ob0Var.f(fx1Var)) || (i3 & 24576) == 16384) | ((((458752 & i3) ^ 196608) > 131072 && ob0Var.f(ym1Var)) || (i3 & 196608) == 131072) | ((i3 & 112) == 32) | ob0Var.h(p60VarW);
            Object objK2 = ob0Var.K();
            if (zH || objK2 == obj) {
                objK2 = new mt1() { // from class: ix1
                    @Override // defpackage.mt1
                    public final void a(ce1 ce1Var) {
                        fx1 fx1Var2 = fx1Var;
                        long j2 = fx1Var2.g;
                        p60 p60Var = p60VarW;
                        wa waVar = ce1Var.p;
                        wa waVar2 = ce1Var.q;
                        i42 i42Var = i42.a;
                        if (waVar == i42Var) {
                            if ((ce1Var.o & 8) != 0) {
                                hx0 hx0Var = ce1Var.k;
                                if (hx0Var == null || (waVar = (wa) hx0Var.b(53)) == null) {
                                    waVar = de1.a;
                                }
                            } else {
                                waVar = null;
                            }
                        }
                        if (waVar2 == i42Var) {
                            if ((ce1Var.o & 8) != 0) {
                                hx0 hx0Var2 = ce1Var.l;
                                if (hx0Var2 == null || (waVar2 = (wa) hx0Var2.b(53)) == null) {
                                    waVar2 = de1.a;
                                }
                            } else {
                                waVar2 = null;
                            }
                        }
                        ce1Var.o = (waVar == null || waVar2 == null) ? ce1Var.o & (-9) : ce1Var.o | 8;
                        ce1Var.f(53, waVar, waVar2);
                        yt1 yt1Var = ce1Var.g;
                        if (yt1Var != null) {
                            yt1Var.b |= 8;
                            yt1Var.E = ym1Var;
                        }
                        boolean z3 = z;
                        ce1Var.a(!z3 ? j2 : fx1Var2.f);
                        xt1 xt1Var = ce1Var.f;
                        xt1Var.getClass();
                        if ((xt1Var.C.c.g() & 4) != 0) {
                            wa waVar3 = ce1Var.p;
                            wa waVar4 = ce1Var.q;
                            try {
                                ce1Var.p = p60Var;
                                ce1Var.q = p60Var;
                                if (z3) {
                                    j2 = fx1Var2.e;
                                }
                                ce1Var.a(j2);
                            } finally {
                                ce1Var.p = waVar3;
                                ce1Var.q = waVar4;
                            }
                        }
                    }
                };
                ob0Var.f0(objK2);
            }
            mt1 mt1Var = (mt1) objK2;
            sg.a((mt1Var == lt1.a ? qv0.a : new pt1(hy0Var, mt1Var).c(qt1.a)).c(new qf0(z, jx0Var, fx1Var, ym1Var)), ob0Var, 0);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hv1(this, z, jx0Var, fx1Var, ym1Var, i2);
        }
    }

    public void g(final String str, final wa0 wa0Var, final boolean z, final boolean z2, final ez1 ez1Var, final jx0 jx0Var, final wa0 wa0Var2, final wa0 wa0Var3, final wa0 wa0Var4, final wa0 wa0Var5, final ym1 ym1Var, final fx1 fx1Var, c41 c41Var, wa0 wa0Var6, ob0 ob0Var, final int i2) {
        int i3;
        wa0 wa0Var7;
        boolean z3;
        final c41 c41Var2;
        final wa0 wa0Var8;
        c41 e41Var;
        int i4;
        wa0 wa0VarD0;
        ob0Var.X(1806980801);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            wa0Var7 = wa0Var;
            i3 |= ob0Var.h(wa0Var7) ? 32 : 16;
        } else {
            wa0Var7 = wa0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z3 = z2;
            i3 |= ob0Var.g(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.f(ez1Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= ob0Var.f(jx0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= ob0Var.g(false) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= ob0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= ob0Var.h(wa0Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= ob0Var.h(wa0Var3) ? 536870912 : 268435456;
        }
        int i5 = 100663296 | (ob0Var.h(null) ? 4 : 2) | (ob0Var.h(null) ? 32 : 16) | (ob0Var.h(wa0Var4) ? 256 : 128) | (ob0Var.h(wa0Var5) ? 2048 : 1024) | (ob0Var.f(ym1Var) ? 16384 : 8192) | (ob0Var.f(fx1Var) ? 131072 : 65536) | 13107200;
        if (ob0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                e41Var = new e41(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i5 & (-3670017);
                wa0VarD0 = lk.d0(417908150, new wa0() { // from class: gx1
                    @Override // defpackage.wa0
                    public final Object h(Object obj, Object obj2) {
                        ob0 ob0Var2 = (ob0) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (ob0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            l91.r.f(z, jx0Var, fx1Var, ym1Var, ob0Var2, 114822144);
                        } else {
                            ob0Var2.Q();
                        }
                        return t32.a;
                    }
                }, ob0Var);
            } else {
                ob0Var.Q();
                i4 = i5 & (-3670017);
                e41Var = c41Var;
                wa0VarD0 = wa0Var6;
            }
            ob0Var.q();
            boolean z4 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objK = ob0Var.K();
            if (z4 || objK == kp.a) {
                hb hbVar = new hb(str);
                ez1Var.getClass();
                objK = new v12(hbVar, y01.a);
                ob0Var.f0(objK);
            }
            String str2 = ((v12) objK).a.f;
            zx1 zx1Var = new zx1();
            ob0Var.W(-1353147063);
            ob0Var.p(false);
            int i6 = i3 >> 9;
            int i7 = i4 << 21;
            c41Var2 = e41Var;
            xc.a(str2, wa0Var7, zx1Var, null, wa0Var2, wa0Var3, wa0Var4, wa0Var5, z3, z, jx0Var, c41Var2, fx1Var, wa0VarD0, ob0Var, ((i3 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i6 & 7168) | ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | ((i3 >> 3) & 57344) | ((i4 << 3) & 3670016) | 12582912);
            wa0Var8 = wa0VarD0;
        } else {
            ob0Var.Q();
            c41Var2 = c41Var;
            wa0Var8 = wa0Var6;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0() { // from class: hx1
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(i2 | 1);
                    this.e.g(str, wa0Var, z, z2, ez1Var, jx0Var, wa0Var2, wa0Var3, wa0Var4, wa0Var5, ym1Var, fx1Var, c41Var2, wa0Var8, (ob0) obj, iV);
                    return t32.a;
                }
            };
        }
    }

    public void h(Drawable drawable, ob0 ob0Var, int i2) {
        ob0Var.X(257732500);
        int i3 = 2;
        int i4 = (ob0Var.h(drawable) ? 4 : 2) | i2;
        if (ob0Var.N(i4 & 1, (i4 & 3) != 2)) {
            tv0 tv0VarE = ko1.e(qv0.a, es.e);
            boolean zH = ob0Var.h(drawable);
            Object objK = ob0Var.K();
            if (zH || objK == kp.a) {
                objK = new wt1(i3, drawable);
                ob0Var.f0(objK);
            }
            sg.a(pv.i(tv0VarE, (sa0) objK), ob0Var, 0);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fi(i2, 13, this, drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(dr0 dr0Var, ls lsVar) {
        ag1 ag1Var;
        int i2;
        Iterator it;
        if (lsVar instanceof ag1) {
            ag1Var = (ag1) lsVar;
            int i3 = ag1Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ag1Var.m = i3 - Integer.MIN_VALUE;
            } else {
                ag1Var = new ag1(this, lsVar);
            }
        }
        Object objP = ag1Var.k;
        int i4 = ag1Var.m;
        ks ksVar = null;
        if (i4 == 0) {
            xc.G(objP);
            Iterator it2 = dr0Var.o.iterator();
            i2 = 0;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i4 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = ag1Var.j;
            Object next = ag1Var.i;
            it = ag1Var.h;
            xc.G(objP);
            if (((Boolean) objP).booleanValue()) {
                return next;
            }
            if (it.hasNext()) {
                next = it.next();
                ag1Var.h = it;
                ag1Var.i = next;
                ag1Var.j = i2;
                ag1Var.m = 1;
                lw lwVar = qy.a;
                objP = nu0.P(fw.g, new ba1((String) next, ksVar, 4), ag1Var);
                wt wtVar = wt.e;
                if (objP == wtVar) {
                    return wtVar;
                }
                if (((Boolean) objP).booleanValue()) {
                }
                if (it.hasNext()) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(ls lsVar) {
        dg1 dg1Var;
        if (lsVar instanceof dg1) {
            dg1Var = (dg1) lsVar;
            int i2 = dg1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dg1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                dg1Var = new dg1(this, lsVar);
            }
        }
        Object objP = dg1Var.h;
        int i3 = dg1Var.j;
        ks ksVar = null;
        int i4 = 1;
        try {
            if (i3 == 0) {
                xc.G(objP);
                dg1Var.j = 1;
                lw lwVar = qy.a;
                objP = nu0.P(fw.g, new q71(new String[]{"am start -n com.axlebolt.standoff2/com.google.firebase.MessagingUnityPlayerActivity"}, ksVar, i4), dg1Var);
                wt wtVar = wt.e;
                if (objP == wtVar) {
                    return wtVar;
                }
            } else {
                if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(objP);
            }
            new Integer(((Number) objP).intValue());
        } catch (Throwable unused) {
        }
        return t32.a;
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "ReferentialEqualityPolicy";
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return "StructuralEqualityPolicy";
            case 21:
                return "Arrangement#Center";
            case 28:
                return "Empty";
            case 29:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l91(int i2) {
        this.e = i2;
    }
}
