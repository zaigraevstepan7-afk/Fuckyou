package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import com.reddit.secondpage.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class pv {
    public static final en1 A;
    public static final t61 B;
    public static final Object C;
    public static final q60 D;
    public static final float E = 24.0f;
    public static final float F = 24.0f;
    public static Method G;
    public static Method H;
    public static boolean I;
    public static final zc c;
    public static final cm n;
    public static final float o;
    public static final cm p;
    public static final float q;
    public static final cm r;
    public static final wr s;
    public static final m7 t;
    public static final Object u;
    public static final StackTraceElement[] v;
    public static final zd0 w;
    public static final en1 x;
    public static final float y;
    public static final float z;
    public static final ks[] a = new ks[0];
    public static final zc b = new zc(3);
    public static final ad d = new ad();
    public static final l91 e = new l91(21);
    public static final float[][] f = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] g = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] h = {95.047f, 100.0f, 108.883f};
    public static final float[][] i = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final double[][] j = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] k = {95.047d, 100.0d, 108.883d};
    public static final jo l = new jo(-1012960755, false, new pc(7, 0));
    public static final cm m = cm.o;

    static {
        int i2 = 2;
        c = new zc(i2);
        cm cmVar = cm.i;
        n = cmVar;
        o = 0.1f;
        p = cmVar;
        q = 0.38f;
        r = cm.h;
        s = new wr(17);
        t = new m7(5);
        u = new Object();
        v = new StackTraceElement[0];
        w = new zd0(i2);
        x = en1.g;
        y = 8.0f;
        z = 24.0f;
        A = en1.j;
        B = new t61(24);
        C = new Object();
        D = new q60();
    }

    public static final nt0 A(c2 c2Var, sa0 sa0Var, ob0 ob0Var) {
        Object h2Var;
        Object obj;
        xc.D(c2Var, ob0Var);
        Object objD = xc.D(sa0Var, ob0Var);
        Object[] objArr = new Object[0];
        Object objK = ob0Var.K();
        Object obj2 = kp.a;
        if (objK == obj2) {
            objK = new e2(1);
            ob0Var.f0(objK);
        }
        Object obj3 = (String) kd1.w(objArr, (ha0) objK, ob0Var);
        k2 k2Var = (k2) ob0Var.j(sr0.a);
        if (k2Var == null) {
            ob0Var.W(1213380307);
            Object baseContext = (Context) ob0Var.j(w4.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof k2) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            k2Var = (k2) baseContext;
        } else {
            ob0Var.W(1213379439);
        }
        ob0Var.p(false);
        if (k2Var == null) {
            yc.l("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object obj4 = ((bo) k2Var).l;
        Object objK2 = ob0Var.K();
        if (objK2 == obj2) {
            objK2 = new d2();
            ob0Var.f0(objK2);
        }
        d2 d2Var = (d2) objK2;
        Object objK3 = ob0Var.K();
        if (objK3 == obj2) {
            objK3 = new nt0(d2Var);
            ob0Var.f0(objK3);
        }
        nt0 nt0Var = (nt0) objK3;
        boolean zH = ob0Var.h(d2Var) | ob0Var.h(obj4) | ob0Var.f(obj3) | ob0Var.h(c2Var) | ob0Var.f(objD);
        Object objK4 = ob0Var.K();
        if (zH || objK4 == obj2) {
            obj = c2Var;
            h2Var = new h2(d2Var, obj4, obj3, obj, objD, 0);
            ob0Var.f0(h2Var);
        } else {
            h2Var = objK4;
            obj = c2Var;
        }
        sa0 sa0Var2 = (sa0) h2Var;
        boolean zF = ob0Var.f(obj4) | ob0Var.f(obj3) | ob0Var.f(obj);
        Object objK5 = ob0Var.K();
        if (zF || objK5 == obj2) {
            objK5 = new xy(sa0Var2);
            ob0Var.f0(objK5);
        }
        return nt0Var;
    }

    public static final hj1 B(ob0 ob0Var) {
        Object[] objArr = new Object[0];
        boolean zD = ob0Var.d(0);
        Object objK = ob0Var.K();
        if (zD || objK == kp.a) {
            objK = new lh1(1);
            ob0Var.f0(objK);
        }
        return (hj1) kd1.y(objArr, hj1.k, (ha0) objK, ob0Var, 0);
    }

    public static final long C(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static gr1 D(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new gr1(f2, f3, obj);
    }

    public static final tv0 E(tv0 tv0Var, n81 n81Var, cv cvVar, my1 my1Var, vs vsVar) {
        return tv0Var.c(new yw1(n81Var, cvVar, my1Var, vsVar));
    }

    public static final String F(ks ksVar) {
        Object oe1Var;
        if (ksVar instanceof my) {
            return ((my) ksVar).toString();
        }
        try {
            oe1Var = ksVar + '@' + n(ksVar);
        } catch (Throwable th) {
            oe1Var = new oe1(th);
        }
        if (pe1.a(oe1Var) != null) {
            oe1Var = ksVar.getClass().getName() + '@' + n(ksVar);
        }
        return (String) oe1Var;
    }

    public static q22 G(int i2, int i3, j20 j20Var) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            j20Var = k20.a;
        }
        return new q22(i2, i4, j20Var);
    }

    public static tv0 H(tv0 tv0Var, hj1 hj1Var) {
        return tv0Var.c(xk.h(qv0.a, zd0.c)).c(new ij1(null, null, hj1Var.e, k31.e, hj1Var, true, true)).c(new wj1(hj1Var));
    }

    public static float I() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static double J(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((116.0d * d3) - 16.0d) / 903.2962962962963d;
        }
        return d4 * 100.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r7v0, types: [ob0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ob0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v6, types: [ob0] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ob0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void a(List list, boolean z2, List list2, int i2, sa0 sa0Var, sa0 sa0Var2, wa0 wa0Var, wa0 wa0Var2, sa0 sa0Var3, ha0 ha0Var, ha0 ha0Var2, wa0 wa0Var3, String str, sa0 sa0Var4, ha0 ha0Var3, tv0 tv0Var, ob0 ob0Var, int i3) {
        wa0 wa0Var4;
        wa0 wa0Var5;
        tv0 tv0Var2;
        ?? r7;
        int i4;
        Object obj;
        boolean z3;
        Object obj2;
        boolean z4;
        l91 l91Var;
        int i5;
        int i6;
        nt0 nt0Var;
        nt0 nt0Var2;
        ?? r0;
        cd cdVar;
        ?? r12;
        fy0 fy0Var;
        fy0 fy0Var2;
        fy0 fy0Var3;
        fy0 fy0Var4;
        ?? r122;
        ?? r72;
        fy0 fy0Var5;
        Object obj3;
        ye0 ye0VarB;
        ?? r73 = ob0Var;
        list.getClass();
        list2.getClass();
        sa0Var.getClass();
        sa0Var2.getClass();
        wa0Var.getClass();
        wa0Var2.getClass();
        sa0Var3.getClass();
        ha0Var.getClass();
        ha0Var2.getClass();
        wa0Var3.getClass();
        sa0Var4.getClass();
        ha0Var3.getClass();
        r73.X(-999342427);
        int i7 = i3 | (r73.h(list) ? 4 : 2) | (r73.g(z2) ? 32 : 16) | (r73.h(list2) ? 256 : 128) | (r73.d(i2) ? 2048 : 1024) | (r73.h(sa0Var) ? 16384 : 8192) | (r73.h(sa0Var2) ? 131072 : 65536) | (r73.h(wa0Var) ? 1048576 : 524288) | (r73.h(wa0Var2) ? 8388608 : 4194304) | (r73.h(sa0Var3) ? 67108864 : 33554432) | (r73.h(ha0Var) ? 536870912 : 268435456);
        int i8 = (r73.h(ha0Var2) ? 4 : 2) | (r73.h(wa0Var3) ? 32 : 16) | (r73.f(str) ? 256 : 128) | (r73.h(sa0Var4) ? 2048 : 1024) | (r73.h(ha0Var3) ? 16384 : 8192) | 196608;
        if (r73.N(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 74899) == 74898) ? false : true)) {
            rd rdVar = (rd) list2.get(i2);
            Object objK = r73.K();
            l91 l91Var2 = kp.a;
            ks ksVar = null;
            Object obj4 = objK;
            if (objK == l91Var2) {
                v41 v41VarB = xc.B(null);
                r73.f0(v41VarB);
                obj4 = v41VarB;
            }
            fy0 fy0Var6 = (fy0) obj4;
            Object objK2 = r73.K();
            Object obj5 = objK2;
            if (objK2 == l91Var2) {
                v41 v41VarB2 = xc.B(null);
                r73.f0(v41VarB2);
                obj5 = v41VarB2;
            }
            fy0 fy0Var7 = (fy0) obj5;
            Object objK3 = r73.K();
            Object obj6 = objK3;
            if (objK3 == l91Var2) {
                v41 v41VarB3 = xc.B(null);
                r73.f0(v41VarB3);
                obj6 = v41VarB3;
            }
            fy0 fy0Var8 = (fy0) obj6;
            c2 c2Var = new c2(1);
            boolean z5 = (i7 & 458752) == 131072;
            Object objK4 = r73.K();
            if (z5 || objK4 == l91Var2) {
                i4 = 0;
                tq tqVar = new tq(sa0Var2, i4);
                r73.f0(tqVar);
                obj = tqVar;
            } else {
                i4 = 0;
                obj = objK4;
            }
            nt0 nt0VarA = A(c2Var, (sa0) obj, r73);
            c2 c2Var2 = new c2(i4);
            boolean z6 = (i7 & 29360128) == 8388608;
            Object objK5 = r73.K();
            int i9 = 6;
            Object obj7 = objK5;
            if (z6 || objK5 == l91Var2) {
                d dVar = new d(i9, wa0Var2, fy0Var7);
                r73.f0(dVar);
                obj7 = dVar;
            }
            nt0 nt0VarA2 = A(c2Var2, (sa0) obj7, r73);
            Integer numValueOf = Integer.valueOf(i2);
            int i10 = i8 & 57344;
            boolean z7 = ((i7 & 1879048192) == 536870912) | (i10 == 16384);
            Object objK6 = r73.K();
            Object obj8 = objK6;
            if (z7 || objK6 == l91Var2) {
                zd zdVar = new zd(ha0Var3, ha0Var, ksVar, 1);
                r73.f0(zdVar);
                obj8 = zdVar;
            }
            wi0.i((wa0) obj8, r73, numValueOf);
            boolean z8 = i10 == 16384;
            Object objK7 = r73.K();
            if (z8 || objK7 == l91Var2) {
                z3 = false;
                uq uqVar = new uq(ha0Var3, false ? 1 : 0);
                r73.f0(uqVar);
                obj2 = uqVar;
            } else {
                z3 = false;
                obj2 = objK7;
            }
            wi0.c(t32.a, (sa0) obj2, r73);
            j60 j60Var = ko1.c;
            uu0 uu0VarD = sg.d(v20.f, z3);
            int iHashCode = Long.hashCode(r73.T);
            b61 b61VarL = r73.l();
            tv0 tv0VarP = bk.P(r73, j60Var);
            ep.c.getClass();
            zp zpVar = dp.b;
            r73.Z();
            if (r73.S) {
                r73.k(zpVar);
            } else {
                r73.i0();
            }
            r9 r9Var = dp.f;
            xc.E(r9Var, r73, uu0VarD);
            r9 r9Var2 = dp.e;
            xc.E(r9Var2, r73, b61VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            r9 r9Var3 = dp.g;
            xc.E(r9Var3, r73, numValueOf2);
            a4 a4Var = dp.h;
            xc.C(r73, a4Var);
            r9 r9Var4 = dp.d;
            xc.E(r9Var4, r73, tv0VarP);
            tv0 tv0VarD = xi0.D(ko1.i(nu0.j(v20.g).c(ko1.b), 600.0f).c(ko1.a), 16.0f, 12.0f);
            bn bnVarA = zm.a(new cd(12.0f, new yc(0)), v20.q, r73, 6);
            int iHashCode2 = Long.hashCode(r73.T);
            b61 b61VarL2 = r73.l();
            tv0 tv0VarP2 = bk.P(r73, tv0VarD);
            r73.Z();
            if (r73.S) {
                r73.k(zpVar);
            } else {
                r73.i0();
            }
            xc.E(r9Var, r73, bnVarA);
            xc.E(r9Var2, r73, b61VarL2);
            s91.q(iHashCode2, r73, r9Var3, r73, a4Var);
            xc.E(r9Var4, r73, tv0VarP2);
            tg1 tg1VarA = sg1.a(b, v20.p, r73, 48);
            int iHashCode3 = Long.hashCode(r73.T);
            b61 b61VarL3 = r73.l();
            qv0 qv0Var = qv0.a;
            tv0 tv0VarP3 = bk.P(r73, qv0Var);
            r73.Z();
            if (r73.S) {
                r73.k(zpVar);
            } else {
                r73.i0();
            }
            xc.E(r9Var, r73, tg1VarA);
            xc.E(r9Var2, r73, b61VarL3);
            s91.q(iHashCode3, r73, r9Var3, r73, a4Var);
            xc.E(r9Var4, r73, tv0VarP3);
            wi0.e(ha0Var2, v20.l(r73), null, false, null, nu0.b, r73, (i8 & 14) | 1572864, 60);
            qc1.b(r73, ko1.h(qv0Var, 12.0f));
            mz1.b(rdVar.b + " (" + list.size() + ")", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ju0) r73.j(mu0.b)).b.g, r73, 0, 0, 131070);
            qc1.b(r73, new fm0(1.0f, true));
            if (z2) {
                r73.W(463216743);
                ib1.a(ko1.e(qv0Var, 20.0f), 0L, 2.0f, 0L, 0, 0.0f, r73, 390, 58);
                z4 = false;
                r73.p(false);
            } else {
                z4 = false;
                r73.W(463330141);
                r73.p(false);
            }
            r73.p(true);
            if (list2.size() > 1) {
                r73.W(374095357);
                boolean z9 = z4;
                ArrayList arrayList = new ArrayList(ql.Y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rd) it.next()).b);
                }
                l91Var = l91Var2;
                i5 = 1;
                i6 = i8;
                boolean z10 = z9;
                nt0Var = nt0VarA;
                nt0Var2 = nt0VarA2;
                xi0.c(arrayList, i2, sa0Var, null, r73, (i7 >> 6) & 1008);
                r73.p(z10);
                r0 = z10;
            } else {
                l91Var = l91Var2;
                boolean z11 = z4;
                i5 = 1;
                i6 = i8;
                nt0Var = nt0VarA;
                nt0Var2 = nt0VarA2;
                r73.W(374314465);
                r73.p(z11);
                r0 = z11;
            }
            boolean zH = r73.h(nt0Var) | r73.h(rdVar);
            Object objK8 = r73.K();
            Object obj9 = objK8;
            if (zH || objK8 == l91Var) {
                f8 f8Var = new f8(6, nt0Var, rdVar);
                r73.f0(f8Var);
                obj9 = f8Var;
            }
            float f2 = yh.a;
            gi giVarC = yh.c(r73);
            j60 j60Var2 = ko1.a;
            c2.c((ha0) obj9, giVarC, ko1.b(j60Var2, 52.0f), false, null, null, null, lk.d0(1574793873, new wi(i5, rdVar), r73), r73, 805306752, 504);
            if (!list.isEmpty() || z2) {
                r73.W(375718920);
                tv0 tv0VarA = cn.a(qv0Var);
                e41 e41VarG = xi0.g(16.0f);
                cd cdVar2 = new cd(2.0f, new yc(r0));
                int i11 = ((((((((r73.h(list) ? 1 : 0) | (r73.h(rdVar) ? 1 : 0) ? 1 : 0) | ((i6 & 7168) == 2048 ? 1 : r0)) == true ? 1 : 0) | (r73.h(nt0Var2) ? 1 : 0) ? 1 : 0) | ((i7 & 234881024) == 67108864 ? 1 : r0)) == true ? 1 : 0) | (r73.h(wa0Var3) ? 1 : 0) ? 1 : 0) | ((i6 & 896) == 256 ? 1 : r0);
                Object objK9 = r73.K();
                if (i11 != 0 || objK9 == l91Var) {
                    cdVar = cdVar2;
                    r12 = r0 == true ? 1 : 0;
                    fy0Var = fy0Var6;
                    fy0Var2 = fy0Var8;
                    vq vqVar = new vq(list, rdVar, sa0Var4, nt0Var2, sa0Var3, fy0Var, fy0Var2, fy0Var7, wa0Var3, str);
                    r73.f0(vqVar);
                    objK9 = vqVar;
                } else {
                    r12 = r0;
                    cdVar = cdVar2;
                    fy0Var = fy0Var6;
                    fy0Var2 = fy0Var8;
                }
                fy0Var3 = fy0Var;
                wa0Var4 = wa0Var3;
                fy0Var4 = fy0Var2;
                xk.b(tv0VarA, null, e41VarG, cdVar, null, null, false, null, (sa0) objK9, r73, 24960);
                ?? r74 = r73;
                r74.p(r12);
                r72 = r74;
                r122 = r12;
            } else {
                r73.W(374830150);
                tv0 tv0VarA2 = cn.a(j60Var2);
                bn bnVarA2 = zm.a(e, v20.r, r73, 54);
                int iHashCode4 = Long.hashCode(r73.T);
                b61 b61VarL4 = r73.l();
                tv0 tv0VarP4 = bk.P(r73, tv0VarA2);
                ep.c.getClass();
                zp zpVar2 = dp.b;
                r73.Z();
                if (r73.S) {
                    r73.k(zpVar2);
                } else {
                    r73.i0();
                }
                xc.E(dp.f, r73, bnVarA2);
                xc.E(dp.e, r73, b61VarL4);
                xc.E(dp.g, r73, Integer.valueOf(iHashCode4));
                xc.C(r73, dp.h);
                xc.E(dp.d, r73, tv0VarP4);
                int iOrdinal = rdVar.a.ordinal();
                if (iOrdinal == 0) {
                    ye0VarB = lk.a;
                    if (ye0VarB == null) {
                        xe0 xe0Var = new xe0("Rounded.FolderOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = a52.a;
                        long j2 = vl.b;
                        uq1 uq1Var = new uq1(j2);
                        y41 y41Var = new y41((int) r0);
                        y41Var.y(2.81f, 2.81f);
                        y41Var.r(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        y41Var.q(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
                        y41Var.x(0.85f, 0.85f);
                        y41Var.q(2.1f, 5.35f, 2.01f, 5.66f, 2.01f, 6.0f);
                        y41Var.w(2.0f, 18.0f);
                        y41Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        y41Var.v(13.17f);
                        y41Var.x(2.61f, 2.61f);
                        y41Var.r(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        y41Var.r(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        y41Var.w(2.81f, 2.81f);
                        y41Var.m();
                        xe0.a(xe0Var, (ArrayList) y41Var.f, uq1Var);
                        uq1 uq1Var2 = new uq1(j2);
                        y41 y41Var2 = new y41((int) r0);
                        y41Var2.y(20.0f, 6.0f);
                        y41Var2.v(-8.0f);
                        y41Var2.x(-1.41f, -1.41f);
                        y41Var2.q(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
                        y41Var2.u(6.83f);
                        y41Var2.x(14.93f, 14.93f);
                        y41Var2.q(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f);
                        y41Var2.E(8.0f);
                        y41Var2.q(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
                        y41Var2.m();
                        xe0.a(xe0Var, (ArrayList) y41Var2.f, uq1Var2);
                        ye0VarB = xe0Var.b();
                        lk.a = ye0VarB;
                    }
                } else if (iOrdinal == i5) {
                    ye0VarB = bk.C();
                } else {
                    if (iOrdinal != 2) {
                        ez1.a();
                        return;
                    }
                    ye0VarB = hk.a;
                    if (ye0VarB == null) {
                        xe0 xe0Var2 = new xe0("Rounded.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = a52.a;
                        uq1 uq1Var3 = new uq1(vl.b);
                        y41 y41Var3 = new y41((int) r0);
                        y41Var3.y(12.0f, 5.0f);
                        y41Var3.F(8.55f);
                        y41Var3.r(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f);
                        y41Var3.r(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f);
                        y41Var3.r(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f);
                        y41Var3.r(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f);
                        y41Var3.E(7.0f);
                        y41Var3.v(2.0f);
                        y41Var3.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        y41Var3.A(-0.9f, -2.0f, -2.0f, -2.0f);
                        y41Var3.v(-2.0f);
                        y41Var3.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        y41Var3.m();
                        xe0.a(xe0Var2, (ArrayList) y41Var3.f, uq1Var3);
                        ye0VarB = xe0Var2.b();
                        hk.a = ye0VarB;
                    }
                }
                ye0 ye0Var = ye0VarB;
                ys1 ys1Var = mu0.b;
                kd1.a(ye0Var, null, ((ju0) r73.j(ys1Var)).a.G, ((ju0) r73.j(ys1Var)).a.s, 0.0f, 0.0f, r73, 0, 50);
                qc1.b(r73, ko1.b(qv0Var, 16.0f));
                String lowerCase = rdVar.b.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                mz1.b("No " + lowerCase + " yet", null, ((ju0) r73.j(ys1Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ju0) r73.j(ys1Var)).b.j, r73, 0, 0, 131066);
                r73.p(true);
                r73.p(r0);
                r122 = r0;
                r72 = r73;
                fy0Var3 = fy0Var6;
                fy0Var4 = fy0Var8;
                wa0Var4 = wa0Var3;
            }
            r72.p(true);
            r72.p(true);
            iq iqVar = (iq) fy0Var3.getValue();
            if (iqVar == null) {
                r72.W(1309532147);
                r72.p(r122);
                wa0Var5 = wa0Var;
            } else {
                r72.W(1309532148);
                int i14 = (r72.f(iqVar) ? 1 : 0) | ((i7 & 3670016) == 1048576 ? 1 : r122);
                Object objK10 = r72.K();
                if (i14 != 0 || objK10 == l91Var) {
                    wa0Var5 = wa0Var;
                    fy0Var5 = fy0Var3;
                    kf kfVar = new kf(wa0Var5, iqVar, fy0Var5);
                    r72.f0(kfVar);
                    obj3 = kfVar;
                } else {
                    wa0Var5 = wa0Var;
                    fy0Var5 = fy0Var3;
                    obj3 = objK10;
                }
                sa0 sa0Var5 = (sa0) obj3;
                Object objK11 = r72.K();
                Object obj10 = objK11;
                if (objK11 == l91Var) {
                    n8 n8Var = new n8(fy0Var5, 5);
                    r72.f0(n8Var);
                    obj10 = n8Var;
                }
                pd1.a(iqVar, sa0Var5, (ha0) obj10, r72, 384);
                r72.p(r122);
            }
            iq iqVar2 = (iq) fy0Var4.getValue();
            if (iqVar2 == null) {
                r72.W(1309813224);
                r72.p(r122);
            } else {
                r72.W(1309813225);
                Object objK12 = r72.K();
                Object obj11 = objK12;
                if (objK12 == l91Var) {
                    n8 n8Var2 = new n8(fy0Var4, 6);
                    r72.f0(n8Var2);
                    obj11 = n8Var2;
                }
                xi0.j(iqVar2, wa0Var4, (ha0) obj11, r72, 384 | (i6 & 112));
                r72.p(r122);
            }
            tv0Var2 = qv0Var;
            r7 = r72;
        } else {
            wa0Var4 = wa0Var3;
            wa0Var5 = wa0Var;
            r73.Q();
            tv0Var2 = tv0Var;
            r7 = r73;
        }
        dc1 dc1VarR = r7.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wq(list, z2, list2, i2, sa0Var, sa0Var2, wa0Var5, wa0Var2, sa0Var3, ha0Var, ha0Var2, wa0Var4, str, sa0Var4, ha0Var3, tv0Var2, i3);
        }
    }

    public static final void b(tv0 tv0Var, nb1 nb1Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        jo joVar2 = c2.h;
        ob0Var.X(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.f(nb1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(joVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.h(joVar) ? 2048 : 1024;
        }
        if (ob0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                Object v41Var = new v41(null, v20.S);
                ob0Var.f0(v41Var);
                objK = v41Var;
            }
            hf hfVarG = g(joVar2, ob0Var, (i3 >> 6) & 14);
            lk.i(nb1Var.a(hfVarG), lk.d0(274270255, new jf(tv0Var, (fy0) objK, joVar, hfVarG), ob0Var), ob0Var, 56);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(tv0Var, nb1Var, joVar, i2, 2);
        }
    }

    public static final void c(tv0 tv0Var, wa0 wa0Var, ob0 ob0Var, int i2) {
        ob0Var.X(-1298353104);
        int i3 = i2 | 6 | (ob0Var.h(wa0Var) ? 32 : 16);
        if (ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new ku1(v20.T);
                ob0Var.f0(objK);
            }
            qv0 qv0Var = qv0.a;
            d((ku1) objK, qv0Var, wa0Var, ob0Var, (i3 << 3) & 1008);
            tv0Var = qv0Var;
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new z4(tv0Var, wa0Var, i2, 4);
        }
    }

    public static final void d(ku1 ku1Var, tv0 tv0Var, wa0 wa0Var, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.h(ku1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(wa0Var) ? 256 : 128;
        }
        if (ob0Var.N(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(ob0Var.T);
            mb0 mb0VarM = xk.M(ob0Var);
            tv0 tv0VarP = bk.P(ob0Var, tv0Var);
            b61 b61VarL = ob0Var.l();
            zp zpVar = zp.o;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(ku1Var.c, ob0Var, ku1Var);
            xc.E(ku1Var.d, ob0Var, mb0VarM);
            xc.E(ku1Var.e, ob0Var, wa0Var);
            ep.c.getClass();
            xc.E(dp.e, ob0Var, b61VarL);
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            ob0Var.p(true);
            if (ob0Var.z()) {
                ob0Var.W(-1259187287);
                ob0Var.p(false);
            } else {
                ob0Var.W(-1259245908);
                boolean zH = ob0Var.h(ku1Var);
                Object objK = ob0Var.K();
                if (zH || objK == kp.a) {
                    objK = new a7(14, ku1Var);
                    ob0Var.f0(objK);
                }
                wi0.m((ha0) objK, ob0Var);
                ob0Var.p(false);
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hu1(ku1Var, tv0Var, wa0Var, i2);
        }
    }

    public static final boolean e(rl1 rl1Var) {
        nl1 nl1VarK = rl1Var.k();
        return !nl1VarK.e.c(vl1.j);
    }

    public static final boolean f(rl1 rl1Var, Resources resources) {
        Object objG = rl1Var.d.e.g(vl1.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !nu0.y(rl1Var) && (rl1Var.d.g || (rl1Var.q() && ((list != null ? (String) pl.d0(list) : null) != null || q(rl1Var) != null || p(rl1Var, resources) != null || o(rl1Var))));
    }

    public static final hf g(jo joVar, ob0 ob0Var, int i2) {
        int i3 = 4;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && ob0Var.f(joVar)) || (i2 & 6) == 4;
        Object objK = ob0Var.K();
        Object obj = kp.a;
        if (z2 || objK == obj) {
            objK = new hf(joVar);
            ob0Var.f0(objK);
        }
        hf hfVar = (hf) objK;
        boolean zF = ob0Var.f(hfVar);
        Object objK2 = ob0Var.K();
        if (zF || objK2 == obj) {
            objK2 = new n(i3, hfVar);
            ob0Var.f0(objK2);
        }
        wi0.c(hfVar, (sa0) objK2, ob0Var);
        return hfVar;
    }

    public static int h(double d2) {
        double d3 = d2 / 100.0d;
        return (int) lk.y(Math.rint((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0.0d, 255.0d);
    }

    public static final tv0 i(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new k10(sa0Var));
    }

    public static final void j(vw0 vw0Var, cj cjVar, lh lhVar, float f2, um1 um1Var, ax1 ax1Var, q10 q10Var) {
        ArrayList arrayList = vw0Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l41 l41Var = (l41) arrayList.get(i2);
            l41Var.a.g(cjVar, lhVar, f2, um1Var, ax1Var, q10Var);
            cjVar.f(0.0f, l41Var.a.b());
        }
    }

    public static final tv0 k(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new s10(sa0Var));
    }

    public static final tv0 l(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new t10(sa0Var));
    }

    public static void m(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!I) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    G = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    H = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    G = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    H = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = G;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = H;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            I = true;
        }
        if (z2) {
            try {
                Method method4 = G;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = H) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean o(rl1 rl1Var) {
        Object objG = rl1Var.d.e.g(vl1.K);
        if (objG == null) {
            objG = null;
        }
        e12 e12Var = (e12) objG;
        zx0 zx0Var = rl1Var.d.e;
        Object objG2 = zx0Var.g(vl1.z);
        if (objG2 == null) {
            objG2 = null;
        }
        yf1 yf1Var = (yf1) objG2;
        boolean z2 = e12Var != null;
        Object objG3 = zx0Var.g(vl1.J);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (yf1Var != null && yf1Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String p(rl1 rl1Var, Resources resources) {
        nl1 nl1Var = rl1Var.d;
        nl1 nl1Var2 = rl1Var.d;
        Object objG = nl1Var.e.g(vl1.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        zx0 zx0Var = nl1Var2.e;
        Object objG2 = zx0Var.g(vl1.K);
        if (objG2 == null) {
            objG2 = null;
        }
        e12 e12Var = (e12) objG2;
        Object objG3 = zx0Var.g(vl1.z);
        if (objG3 == null) {
            objG3 = null;
        }
        yf1 yf1Var = (yf1) objG3;
        if (e12Var != null) {
            int iOrdinal = e12Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ez1.a();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (yf1Var != null && yf1Var.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (yf1Var != null && yf1Var.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = zx0Var.g(vl1.J);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((yf1Var == null || yf1Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = zx0Var.g(vl1.c);
        if (objG5 == null) {
            objG5 = null;
        }
        fb1 fb1Var = (fb1) objG5;
        if (fb1Var != null) {
            if (fb1Var != fb1.c) {
                if (objG == null) {
                    fl flVar = fb1Var.b;
                    float f2 = flVar.b;
                    float f3 = flVar.a;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (fb1Var.a - f3) / (flVar.b - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(f4 == 0.0f ? 0 : f4 == 1.0f ? 100 : lk.A(Math.round(f4 * 100.0f), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        zl1 zl1Var = vl1.G;
        if (zx0Var.c(zl1Var)) {
            zx0 zx0Var2 = new rl1(rl1Var.a, true, rl1Var.c, nl1Var2).k().e;
            Object objG6 = zx0Var2.g(vl1.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = zx0Var2.g(vl1.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = zx0Var2.g(zl1Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final hb q(rl1 rl1Var) {
        Object objG = rl1Var.d.e.g(vl1.G);
        if (objG == null) {
            objG = null;
        }
        hb hbVar = (hb) objG;
        Object objG2 = rl1Var.d.e.g(vl1.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return hbVar == null ? list != null ? (hb) pl.d0(list) : null : hbVar;
    }

    public static tv0 r(tv0 tv0Var, jx0 jx0Var) {
        return tv0Var.c(new ee0(jx0Var));
    }

    public static fg0 s(a20 a20Var, int i2) {
        return new fg0(a20Var, sd1.e);
    }

    public static int t(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = h;
        return ym.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static double u(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double v(int i2) {
        double d2 = ((double) i2) / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static float w(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final int x(qn0 qn0Var) {
        return qn0Var.l + qn0Var.m;
    }

    public static final tv0 y(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new s11(sa0Var));
    }

    public static void z(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }
}
