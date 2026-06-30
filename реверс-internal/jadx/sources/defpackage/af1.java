package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.reddit.secondpage.R;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class af1 {
    public static ye0 a;

    public static void A(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(ev1 ev1Var, ex1 ex1Var, e81 e81Var, ye yeVar) {
        bl1 bl1Var;
        l81 l81Var;
        if (yeVar instanceof bl1) {
            bl1Var = (bl1) yeVar;
            int i = bl1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bl1Var.l = i - Integer.MIN_VALUE;
            } else {
                bl1Var = new bl1(yeVar);
            }
        }
        Object objB = bl1Var.k;
        int i2 = bl1Var.l;
        int i3 = 1;
        wt wtVar = wt.e;
        try {
            if (i2 == 0) {
                xc.G(objB);
                l81Var = (l81) pl.c0(e81Var.a);
                long j = l81Var.a;
                bl1Var.h = ev1Var;
                bl1Var.i = ex1Var;
                bl1Var.j = l81Var;
                bl1Var.l = 1;
                objB = s00.b(ev1Var, j, bl1Var);
                if (objB == wtVar) {
                }
                return wtVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ex1Var = bl1Var.i;
                ev1Var = bl1Var.h;
                xc.G(objB);
                if (((Boolean) objB).booleanValue()) {
                    List list = ev1Var.j.w.a;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        l81 l81Var2 = (l81) list.get(i4);
                        if (lk.s(l81Var2)) {
                            l81Var2.a();
                        }
                    }
                    ex1Var.a();
                } else {
                    ex1Var.onCancel();
                }
                return t32.a;
            }
            l81 l81Var3 = bl1Var.j;
            ex1Var = bl1Var.i;
            ev1 ev1Var2 = bl1Var.h;
            xc.G(objB);
            l81Var = l81Var3;
            ev1Var = ev1Var2;
            l81 l81Var4 = (l81) objB;
            if (l81Var4 != null) {
                long j2 = l81Var4.c;
                if (w01.c(w01.d(l81Var.c, j2)) < s00.f(ev1Var.f(), l81Var.i)) {
                    ex1Var.d(j2, el1.a);
                    long j3 = l81Var4.a;
                    ns0 ns0Var = new ns0(ex1Var, i3);
                    bl1Var.h = ev1Var;
                    bl1Var.i = ex1Var;
                    bl1Var.j = null;
                    bl1Var.l = 2;
                    objB = s00.d(ev1Var, j3, ns0Var, bl1Var);
                }
            }
            return t32.a;
        } catch (CancellationException e) {
            ex1Var.onCancel();
            throw e;
        }
    }

    public static final Boolean E(int i, o9 o9Var, w80 w80Var, pc1 pc1Var) {
        int iOrdinal = w80Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                w80 w80VarW = hk.w(w80Var);
                if (w80VarW == null) {
                    yc.l("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = w80VarW.Q0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolE = E(i, o9Var, w80VarW, pc1Var);
                        if (!xi0.o(boolE, Boolean.FALSE)) {
                            return boolE;
                        }
                        if (pc1Var == null) {
                            if (w80VarW.Q0() != v80.f) {
                                yc.l("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            w80 w80VarS = hk.s(w80VarW);
                            if (w80VarS == null) {
                                yc.l("ActiveParent must have a focusedChild");
                                return null;
                            }
                            pc1Var = hk.t(w80VarS);
                        }
                        return Boolean.valueOf(r(i, o9Var, w80Var, pc1Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            ez1.a();
                            return null;
                        }
                        yc.l("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (pc1Var == null) {
                    pc1Var = hk.t(w80VarW);
                }
                return Boolean.valueOf(r(i, o9Var, w80Var, pc1Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return w80Var.N0().a ? (Boolean) o9Var.i(w80Var) : pc1Var == null ? Boolean.valueOf(q(w80Var, i, o9Var)) : Boolean.valueOf(z(i, o9Var, w80Var, pc1Var));
                }
                ez1.a();
                return null;
            }
        }
        return Boolean.valueOf(q(w80Var, i, o9Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(long j, wa0 wa0Var, ls lsVar) {
        y02 y02Var;
        zc1 zc1Var;
        x02 x02Var;
        if (lsVar instanceof y02) {
            y02Var = (y02) lsVar;
            int i = y02Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                y02Var.j = i - Integer.MIN_VALUE;
            } else {
                y02Var = new y02(lsVar);
            }
        }
        Object obj = y02Var.i;
        int i2 = y02Var.j;
        if (i2 == 0) {
            xc.G(obj);
            if (j > 0) {
                zc1 zc1Var2 = new zc1();
                try {
                    y02Var.h = zc1Var2;
                    y02Var.j = 1;
                    x02Var = new x02(j, y02Var);
                    zc1Var2.e = x02Var;
                } catch (w02 e) {
                    e = e;
                }
                try {
                    bk.I(x02Var, true, new dz(al.y(x02Var.j.e()).c(x02Var.k, x02Var, x02Var.i)));
                    Object objD = kd1.D(x02Var, false, x02Var, wa0Var);
                    wt wtVar = wt.e;
                    return objD == wtVar ? wtVar : objD;
                } catch (w02 e2) {
                    e = e2;
                    zc1Var = zc1Var2;
                    if (e.e != zc1Var.e) {
                    }
                    return null;
                }
            }
            return null;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zc1Var = y02Var.h;
        try {
            xc.G(obj);
            return obj;
        } catch (w02 e3) {
            e = e3;
        }
        if (e.e != zc1Var.e) {
            throw e;
        }
        return null;
    }

    public static final Object G(long j, wa0 wa0Var, m6 m6Var) {
        wr wrVar = z10.e;
        long jB = 0;
        boolean z = j > 0;
        if (z) {
            jB = z10.b(z10.c(j, el.T(999999L, c20.NANOSECONDS)));
        } else if (z) {
            ez1.a();
            return null;
        }
        return F(jB, wa0Var, m6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pg1 a(float[] fArr, ft ftVar, AbstractList abstractList, float f, float f2) {
        float f3;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        List listG;
        fu fuVarA;
        ft ftVar2;
        float f4 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        ftVar.getClass();
        pg1 pg1Var = null;
        if (fArr.length < 6) {
            yc.p("Polygons must have at least 3 vertices");
            return null;
        }
        int i2 = 2;
        int i3 = 1;
        if (fArr.length % 2 == 1) {
            yc.p("The vertices array should have even size");
            return null;
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            yc.p("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList4 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            ft ftVar3 = (abstractList == null || (ftVar2 = (ft) abstractList.get(i5)) == null) ? ftVar : ftVar2;
            int i6 = (((i5 + length) - 1) % length) * 2;
            int i7 = i5 + 1;
            int i8 = (i7 % length) * 2;
            int i9 = i5 * 2;
            arrayList4.add(new ig1(z60.a(fArr[i6], fArr[i6 + 1]), z60.a(fArr[i9], fArr[i9 + 1]), z60.a(fArr[i8], fArr[i8 + 1]), ftVar3));
            i5 = i7;
            f4 = f4;
        }
        float f5 = f4;
        rh0 rh0VarO0 = lk.o0(0, length);
        ArrayList arrayList5 = new ArrayList(ql.Y(rh0VarO0, 10));
        Iterator it = rh0VarO0.iterator();
        while (true) {
            qh0 qh0Var = (qh0) it;
            f3 = 0.0f;
            if (!qh0Var.g) {
                break;
            }
            int iNextInt = qh0Var.nextInt();
            int i10 = (iNextInt + 1) % length;
            float f6 = ((ig1) arrayList4.get(iNextInt)).h + ((ig1) arrayList4.get(i10)).h;
            float fC = ((ig1) arrayList4.get(i10)).c() + ((ig1) arrayList4.get(iNextInt)).c();
            int i11 = iNextInt * 2;
            float f7 = fArr[i11];
            float f8 = fArr[i11 + 1];
            int i12 = i10 * 2;
            float f9 = f7 - fArr[i12];
            float f10 = f8 - fArr[i12 + 1];
            float f11 = q42.b;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            arrayList5.add(f6 > fSqrt ? new j41(Float.valueOf(fSqrt / f6), Float.valueOf(0.0f)) : fC > fSqrt ? new j41(fValueOf, Float.valueOf((fSqrt - f6) / (fC - f6))) : new j41(fValueOf, fValueOf));
        }
        for (int i13 = 0; i13 < length; i13 = i + 1) {
            float[] fArrCopyOf = new float[i2];
            int i14 = i4;
            int i15 = i14;
            while (i14 < i2) {
                pg1 pg1Var2 = pg1Var;
                j41 j41Var = (j41) arrayList5.get((((i13 + length) - 1) + i14) % length);
                int i16 = i4;
                float f12 = f3;
                int i17 = i2;
                float fC2 = ((((ig1) arrayList4.get(i13)).c() - ((ig1) arrayList4.get(i13)).h) * ((Number) j41Var.f).floatValue()) + (((ig1) arrayList4.get(i13)).h * ((Number) j41Var.e).floatValue());
                int i18 = i15 + 1;
                if (fArrCopyOf.length < i18) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i18, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i15] = fC2;
                i14++;
                f3 = f12;
                i15 = i18;
                i4 = i16;
                pg1Var = pg1Var2;
                i2 = i17;
            }
            int i19 = i2;
            pg1 pg1Var3 = pg1Var;
            int i20 = i4;
            float f13 = f3;
            ig1 ig1Var = (ig1) arrayList4.get(i13);
            if (i15 <= 0) {
                yc.o("Index must be between 0 and size");
                return pg1Var3;
            }
            float f14 = fArrCopyOf[i20];
            if (i3 >= i15) {
                yc.o("Index must be between 0 and size");
                return pg1Var3;
            }
            float f15 = fArrCopyOf[i3];
            long j = ig1Var.e;
            long j2 = ig1Var.d;
            int i21 = i3;
            float f16 = ig1Var.f;
            ArrayList arrayList6 = arrayList3;
            long j3 = ig1Var.b;
            float fMin = Math.min(f14, f15);
            float f17 = ig1Var.h;
            if (f17 < 1.0E-4f || fMin < 1.0E-4f || f16 < 1.0E-4f) {
                i = i13;
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                ig1Var.i = j3;
                float fD = hk.D(j3);
                float fE = hk.E(j3);
                float fD2 = hk.D(j3);
                float fE2 = hk.E(j3);
                listG = hk.G(el.a(fD, fE, q42.b(fD, fD2, 0.33333334f), q42.b(fE, fE2, 0.33333334f), q42.b(fD, fD2, 0.6666667f), q42.b(fE, fE2, 0.6666667f), fD2, fE2));
            } else {
                float fMin2 = Math.min(fMin, f17);
                float fA = ig1Var.a(f14);
                float fA2 = ig1Var.a(f15);
                float f18 = (f16 * fMin2) / f17;
                float f19 = q42.b;
                int i22 = i13;
                float fSqrt2 = (float) Math.sqrt((fMin2 * fMin2) + (f18 * f18));
                arrayList = arrayList5;
                long jP = hk.p(2.0f, hk.N(j2, j));
                float fZ = hk.z(jP);
                if (fZ <= f13) {
                    yc.p("Can't get the direction of a 0-length vector");
                    return pg1Var3;
                }
                ig1Var.i = hk.N(j3, hk.W(fSqrt2, hk.p(fZ, jP)));
                long jN = hk.N(j3, hk.W(fMin2, j2));
                long jN2 = hk.N(j3, hk.W(fMin2, j));
                fu fuVarB = ig1.b(fMin2, fA, ig1Var.b, ig1Var.a, jN, jN2, ig1Var.i, f18);
                fu fuVarB2 = ig1.b(fMin2, fA2, ig1Var.b, ig1Var.c, jN2, jN, ig1Var.i, f18);
                float fA3 = fuVarB2.a();
                float fB = fuVarB2.b();
                float[] fArr2 = fuVarB2.a;
                fu fuVarA2 = el.a(fA3, fB, fArr2[4], fArr2[5], fArr2[i19], fArr2[3], fArr2[i20], fArr2[i21]);
                float fD3 = hk.D(ig1Var.i);
                float fE3 = hk.E(ig1Var.i);
                float fA4 = fuVarB.a();
                float fB2 = fuVarB.b();
                float[] fArr3 = fuVarA2.a;
                float f20 = fArr3[i20];
                float f21 = fArr3[i21];
                long jA = q42.a(fA4 - fD3, fB2 - fE3);
                float f22 = f20 - fD3;
                float f23 = f21 - fE3;
                arrayList2 = arrayList4;
                i = i22;
                long jA2 = q42.a(f22, f23);
                long jA3 = z60.a(-hk.E(jA), hk.D(jA));
                long jA4 = z60.a(-hk.E(jA2), hk.D(jA2));
                int i23 = (hk.E(jA3) * f23) + (hk.D(jA3) * f22) >= f13 ? i21 : i20;
                float fQ = hk.q(jA, jA2);
                if (fQ > 0.999f) {
                    fuVarA = el.a(fA4, fB2, q42.b(fA4, f20, 0.33333334f), q42.b(fB2, f21, 0.33333334f), q42.b(fA4, f20, 0.6666667f), q42.b(fB2, f21, 0.6666667f), f20, f21);
                } else {
                    float fSqrt3 = (((((float) Math.sqrt(2.0f * r6)) - ((float) Math.sqrt(f5 - (fQ * fQ)))) * ((((float) Math.sqrt((r13 * r13) + (r12 * r12))) * 4.0f) / 3.0f)) / (f5 - fQ)) * (i23 != 0 ? f5 : -1.0f);
                    fuVarA = el.a(fA4, fB2, (hk.D(jA3) * fSqrt3) + fA4, (hk.E(jA3) * fSqrt3) + fB2, f20 - (hk.D(jA4) * fSqrt3), f21 - (hk.E(jA4) * fSqrt3), f20, f21);
                }
                listG = hk.H(fuVarB, fuVarA, fuVarA2);
            }
            arrayList6.add(listG);
            f3 = f13;
            arrayList3 = arrayList6;
            arrayList5 = arrayList;
            arrayList4 = arrayList2;
            i4 = i20;
            pg1Var = pg1Var3;
            i3 = i21;
            i2 = i19;
        }
        ArrayList arrayList7 = arrayList3;
        int i24 = i2;
        pg1 pg1Var4 = pg1Var;
        int i25 = i3;
        int i26 = i4;
        float f24 = f3;
        ArrayList arrayList8 = new ArrayList();
        int i27 = i26;
        while (i27 < length) {
            int i28 = i27 + 1;
            int i29 = i28 % length;
            int i30 = i27 * 2;
            long jA5 = z60.a(fArr[i30], fArr[i30 + 1]);
            int i31 = (((i27 + length) - 1) % length) * 2;
            long jA6 = z60.a(fArr[i31], fArr[i31 + 1]);
            int i32 = i29 * 2;
            long jA7 = z60.a(fArr[i32], fArr[i32 + 1]);
            float f25 = q42.b;
            long jI = hk.I(jA5, jA6);
            long jI2 = hk.I(jA7, jA5);
            arrayList8.add(new t50((List) arrayList7.get(i27), (hk.E(jI2) * hk.D(jI)) - (hk.D(jI2) * hk.E(jI)) > f24 ? i25 : i26));
            float fA5 = ((fu) pl.i0((List) arrayList7.get(i27))).a();
            float fB3 = ((fu) pl.i0((List) arrayList7.get(i27))).b();
            float f26 = ((fu) pl.c0((List) arrayList7.get(i29))).a[i26];
            float f27 = ((fu) pl.c0((List) arrayList7.get(i29))).a[i25];
            arrayList8.add(new u50(hk.G(el.a(fA5, fB3, q42.b(fA5, f26, 0.33333334f), q42.b(fB3, f27, 0.33333334f), q42.b(fA5, f26, 0.6666667f), q42.b(fB3, f27, 0.6666667f), f26, f27))));
            i27 = i28;
        }
        long jM = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? m(fArr) : z60.a(f, f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM & 4294967295L));
        if (arrayList8.size() < i24) {
            yc.p("Polygons must have at least 2 features");
            return pg1Var4;
        }
        aq0 aq0VarN = hk.n();
        int size = arrayList8.size();
        int i33 = i26;
        while (i33 < size) {
            Object obj = arrayList8.get(i33);
            i33++;
            for (fu fuVar : ((v50) obj).a) {
                aq0VarN.add(Float.valueOf(fuVar.a[i26]));
                aq0VarN.add(Float.valueOf(fuVar.a[i25]));
            }
        }
        aq0 aq0VarK = hk.k(aq0VarN);
        aq0VarK.getClass();
        float[] fArr4 = new float[aq0VarK.size()];
        Iterator<E> it2 = aq0VarK.iterator();
        int i34 = i26;
        while (it2.hasNext()) {
            fArr4[i34] = ((Number) it2.next()).floatValue();
            i34++;
        }
        if (Float.isNaN(fIntBitsToFloat)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (m(fArr4) >> 32));
        }
        if (Float.isNaN(fIntBitsToFloat2)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (m(fArr4) & 4294967295L));
        }
        return new pg1(arrayList8, z60.a(fIntBitsToFloat, fIntBitsToFloat2));
    }

    public static final void b(tv0 tv0Var, wa0 wa0Var, wa0 wa0Var2, wa0 wa0Var3, wa0 wa0Var4, int i, long j, long j2, k72 k72Var, jo joVar, ob0 ob0Var, int i2) {
        tv0 tv0Var2;
        wa0 wa0Var5;
        wa0 wa0Var6;
        wa0 wa0Var7;
        wa0 wa0Var8;
        int i3;
        long j3;
        long j4;
        k72 k72Var2;
        wa0 wa0Var9;
        wa0 wa0Var10;
        wa0 wa0Var11;
        wa0 wa0Var12;
        long j5;
        long jA;
        k72 s32Var;
        tv0 tv0Var3;
        int i4;
        ob0Var.X(-1211482744);
        int i5 = i2 | 38497718;
        if (ob0Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                wa0Var9 = nu0.c;
                wa0Var10 = nu0.d;
                wa0Var11 = nu0.e;
                wa0Var12 = nu0.f;
                j5 = ((ju0) ob0Var.j(mu0.b)).a.n;
                jA = dm.a(j5, ob0Var);
                WeakHashMap weakHashMap = t82.v;
                s32Var = new s32(i32.f(ob0Var).g, i32.f(ob0Var).b);
                tv0Var3 = qv0.a;
                i4 = 2;
            } else {
                ob0Var.Q();
                tv0Var3 = tv0Var;
                wa0Var9 = wa0Var;
                wa0Var10 = wa0Var2;
                wa0Var11 = wa0Var3;
                wa0Var12 = wa0Var4;
                i4 = i;
                j5 = j;
                jA = j2;
                s32Var = k72Var;
            }
            ob0Var.q();
            boolean zF = ob0Var.f(s32Var);
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (zF || objK == obj) {
                objK = new ky0(s32Var);
                ob0Var.f0(objK);
            }
            ky0 ky0Var = (ky0) objK;
            boolean zF2 = ob0Var.f(ky0Var) | ob0Var.f(s32Var);
            Object objK2 = ob0Var.K();
            if (zF2 || objK2 == obj) {
                objK2 = new d(19, ky0Var, s32Var);
                ob0Var.f0(objK2);
            }
            vu1.a(wi0.D(tv0Var3, (sa0) objK2), null, j5, jA, lk.d0(848889571, new ho(i4, wa0Var9, joVar, wa0Var11, wa0Var12, ky0Var, wa0Var10), ob0Var), ob0Var, 12582912, 114);
            wa0Var5 = wa0Var9;
            wa0Var6 = wa0Var10;
            wa0Var7 = wa0Var11;
            wa0Var8 = wa0Var12;
            j3 = j5;
            j4 = jA;
            tv0Var2 = tv0Var3;
            i3 = i4;
            k72Var2 = s32Var;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            wa0Var5 = wa0Var;
            wa0Var6 = wa0Var2;
            wa0Var7 = wa0Var3;
            wa0Var8 = wa0Var4;
            i3 = i;
            j3 = j;
            j4 = j2;
            k72Var2 = k72Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hi1(tv0Var2, wa0Var5, wa0Var6, wa0Var7, wa0Var8, i3, j3, j4, k72Var2, joVar, i2);
        }
    }

    public static final void c(final int i, final wa0 wa0Var, final jo joVar, final wa0 wa0Var2, final wa0 wa0Var3, final k72 k72Var, final wa0 wa0Var4, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(-280287501);
        int i4 = i2 | (ob0Var.d(i) ? 4 : 2) | (ob0Var.h(wa0Var) ? 32 : 16) | (ob0Var.h(joVar) ? 256 : 128) | (ob0Var.h(wa0Var2) ? 2048 : 1024) | (ob0Var.h(wa0Var3) ? 16384 : 8192) | (ob0Var.f(k72Var) ? 131072 : 65536) | (ob0Var.h(wa0Var4) ? 1048576 : 524288);
        if (ob0Var.N(i4 & 1, (599187 & i4) != 599186)) {
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                objK = new ki1();
                ob0Var.f0(objK);
            }
            final ki1 ki1Var = (ki1) objK;
            boolean z = ((i4 & 458752) == 131072) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object objK2 = ob0Var.K();
            if (z || objK2 == l91Var) {
                i3 = 0;
                objK2 = new wa0() { // from class: ii1
                    @Override // defpackage.wa0
                    public final Object h(Object obj, Object obj2) {
                        Object obj3;
                        int i5;
                        Object obj4;
                        Object obj5;
                        final o50 o50Var;
                        Object obj6;
                        int i6;
                        final Integer numValueOf;
                        int iN;
                        int iA;
                        Object obj7;
                        Object obj8;
                        int iN2;
                        int iN3;
                        final lu1 lu1Var = (lu1) obj;
                        kr krVar = (kr) obj2;
                        int iH = kr.h(krVar.a);
                        int iG = kr.g(krVar.a);
                        long jA = kr.a(krVar.a, 0, 0, 0, 0, 10);
                        al0 layoutDirection = lu1Var.getLayoutDirection();
                        final k72 k72Var2 = k72Var;
                        int iD = k72Var2.d(lu1Var, layoutDirection);
                        int iC = k72Var2.c(lu1Var, lu1Var.getLayoutDirection());
                        int iA2 = k72Var2.a(lu1Var);
                        List listG = lu1Var.G(wa0Var, li1.e);
                        ArrayList arrayList = new ArrayList(listG.size());
                        int size = listG.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList.add(((pu0) listG.get(i7)).e(jA));
                        }
                        int i8 = 1;
                        if (arrayList.isEmpty()) {
                            i5 = 1;
                            obj3 = null;
                        } else {
                            obj3 = arrayList.get(0);
                            int i9 = ((z61) obj3).f;
                            int size2 = arrayList.size() - 1;
                            i5 = 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj9 = arrayList.get(i8);
                                    int i10 = ((z61) obj9).f;
                                    if (i9 < i10) {
                                        i9 = i10;
                                        obj3 = obj9;
                                    }
                                    if (i8 == size2) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        }
                        z61 z61Var = (z61) obj3;
                        int i11 = z61Var != null ? z61Var.f : 0;
                        List listG2 = lu1Var.G(wa0Var2, li1.g);
                        final ArrayList arrayList2 = new ArrayList(listG2.size());
                        int size3 = listG2.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            int i13 = iC;
                            arrayList2.add(((pu0) listG2.get(i12)).e(lr.i((-iD) - i13, -iA2, jA)));
                            i12++;
                            iH = iH;
                            iC = i13;
                            iG = iG;
                            arrayList = arrayList;
                        }
                        int i14 = iC;
                        final int i15 = iH;
                        final int i16 = iG;
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList2.get(0);
                            int i17 = ((z61) obj4).f;
                            int size4 = arrayList2.size() - 1;
                            if (i5 <= size4) {
                                Object obj10 = obj4;
                                int i18 = i17;
                                int i19 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i19);
                                    int i20 = ((z61) obj11).f;
                                    if (i18 < i20) {
                                        obj10 = obj11;
                                        i18 = i20;
                                    }
                                    if (i19 == size4) {
                                        break;
                                    }
                                    i19++;
                                }
                                obj4 = obj10;
                            }
                        }
                        z61 z61Var2 = (z61) obj4;
                        int i21 = z61Var2 != null ? z61Var2.f : 0;
                        if (arrayList2.isEmpty()) {
                            obj5 = null;
                        } else {
                            obj5 = arrayList2.get(0);
                            int i22 = ((z61) obj5).e;
                            int size5 = arrayList2.size() - 1;
                            if (1 <= size5) {
                                Object obj12 = obj5;
                                int i23 = i22;
                                int i24 = 1;
                                while (true) {
                                    Object obj13 = arrayList2.get(i24);
                                    int i25 = ((z61) obj13).e;
                                    if (i23 < i25) {
                                        obj12 = obj13;
                                        i23 = i25;
                                    }
                                    if (i24 == size5) {
                                        break;
                                    }
                                    i24++;
                                }
                                obj5 = obj12;
                            }
                        }
                        z61 z61Var3 = (z61) obj5;
                        int i26 = z61Var3 != null ? z61Var3.e : 0;
                        List listG3 = lu1Var.G(wa0Var3, li1.h);
                        final ArrayList arrayList4 = new ArrayList(listG3.size());
                        int size6 = listG3.size();
                        int i27 = 0;
                        while (i27 < size6) {
                            int i28 = i21;
                            int i29 = iD;
                            z61 z61VarE = ((pu0) listG3.get(i27)).e(lr.i((-iD) - i14, -iA2, jA));
                            if (z61VarE.f == 0 || z61VarE.e == 0) {
                                z61VarE = null;
                            }
                            if (z61VarE != null) {
                                arrayList4.add(z61VarE);
                            }
                            i27++;
                            i21 = i28;
                            iD = i29;
                        }
                        int i30 = iD;
                        int i31 = i21;
                        boolean zIsEmpty = arrayList4.isEmpty();
                        int i32 = i;
                        if (zIsEmpty) {
                            o50Var = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i33 = ((z61) obj7).e;
                                int size7 = arrayList4.size() - 1;
                                if (1 <= size7) {
                                    Object obj14 = obj7;
                                    int i34 = i33;
                                    int i35 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i35);
                                        int i36 = ((z61) obj15).e;
                                        if (i34 < i36) {
                                            i34 = i36;
                                            obj14 = obj15;
                                        }
                                        if (i35 == size7) {
                                            break;
                                        }
                                        i35++;
                                    }
                                    obj7 = obj14;
                                }
                            }
                            obj7.getClass();
                            int i37 = ((z61) obj7).e;
                            if (arrayList4.isEmpty()) {
                                obj8 = null;
                            } else {
                                obj8 = arrayList4.get(0);
                                int i38 = ((z61) obj8).f;
                                int size8 = arrayList4.size() - 1;
                                if (1 <= size8) {
                                    Object obj16 = obj8;
                                    int i39 = i38;
                                    int i40 = 1;
                                    while (true) {
                                        Object obj17 = arrayList4.get(i40);
                                        int i41 = ((z61) obj17).f;
                                        if (i39 < i41) {
                                            i39 = i41;
                                            obj16 = obj17;
                                        }
                                        if (i40 == size8) {
                                            break;
                                        }
                                        i40++;
                                    }
                                    obj8 = obj16;
                                }
                            }
                            obj8.getClass();
                            int i42 = ((z61) obj8).f;
                            al0 al0Var = al0.e;
                            if (i32 != 0) {
                                if (i32 != 2 && i32 != 3) {
                                    iN3 = (((i15 - i37) + i30) - i14) / 2;
                                } else if (lu1Var.getLayoutDirection() == al0Var) {
                                    iN3 = ((i15 - lu1Var.N(16.0f)) - i37) - i14;
                                } else {
                                    iN2 = lu1Var.N(16.0f);
                                    iN3 = iN2 + i30;
                                }
                                o50Var = new o50(iN3, i42);
                            } else if (lu1Var.getLayoutDirection() == al0Var) {
                                iN2 = lu1Var.N(16.0f);
                                iN3 = iN2 + i30;
                                o50Var = new o50(iN3, i42);
                            } else {
                                iN3 = ((i15 - lu1Var.N(16.0f)) - i37) - i14;
                                o50Var = new o50(iN3, i42);
                            }
                        }
                        List listG4 = lu1Var.G(wa0Var4, li1.i);
                        final ArrayList arrayList5 = new ArrayList(listG4.size());
                        int size9 = listG4.size();
                        for (int i43 = 0; i43 < size9; i43++) {
                            arrayList5.add(((pu0) listG4.get(i43)).e(jA));
                        }
                        if (arrayList5.isEmpty()) {
                            i6 = i26;
                            obj6 = null;
                        } else {
                            obj6 = arrayList5.get(0);
                            int i44 = ((z61) obj6).f;
                            int size10 = arrayList5.size() - 1;
                            if (1 <= size10) {
                                int i45 = 1;
                                while (true) {
                                    Object obj18 = arrayList5.get(i45);
                                    i6 = i26;
                                    int i46 = ((z61) obj18).f;
                                    if (i44 < i46) {
                                        i44 = i46;
                                        obj6 = obj18;
                                    }
                                    if (i45 == size10) {
                                        break;
                                    }
                                    i45++;
                                    i26 = i6;
                                }
                            } else {
                                i6 = i26;
                            }
                        }
                        z61 z61Var4 = (z61) obj6;
                        final Integer numValueOf2 = z61Var4 != null ? Integer.valueOf(z61Var4.f) : null;
                        if (o50Var != null) {
                            int i47 = o50Var.f;
                            if (numValueOf2 == null || i32 == 3) {
                                iN = lu1Var.N(16.0f) + i47;
                                iA = k72Var2.a(lu1Var);
                            } else {
                                iN = numValueOf2.intValue() + i47;
                                iA = lu1Var.N(16.0f);
                            }
                            numValueOf = Integer.valueOf(iA + iN);
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = i31 != 0 ? i31 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : k72Var2.a(lu1Var)) : 0;
                        hh0 hh0Var = new hh0(k72Var2, lu1Var);
                        final int i48 = iIntValue;
                        e41 e41Var = new e41(xi0.r(hh0Var, lu1Var.getLayoutDirection()), arrayList3.isEmpty() ? hh0Var.d() : lu1Var.s0(i11), xi0.q(hh0Var, lu1Var.getLayoutDirection()), numValueOf2 != null ? lu1Var.s0(numValueOf2.intValue()) : hh0Var.c());
                        ki1 ki1Var2 = ki1Var;
                        ki1Var2.a.setValue(e41Var);
                        List listG5 = lu1Var.G(new jo(-278021671, true, new fi(joVar, ki1Var2, 11)), li1.f);
                        final ArrayList arrayList6 = new ArrayList(listG5.size());
                        int size11 = listG5.size();
                        for (int i49 = 0; i49 < size11; i49++) {
                            arrayList6.add(((pu0) listG5.get(i49)).e(jA));
                        }
                        final int i50 = i6;
                        return lu1Var.f0(i15, i16, g40.e, new sa0() { // from class: ji1
                            @Override // defpackage.sa0
                            public final Object i(Object obj19) {
                                int i51;
                                y61 y61Var = (y61) obj19;
                                ArrayList arrayList7 = arrayList6;
                                int size12 = arrayList7.size();
                                for (int i52 = 0; i52 < size12; i52++) {
                                    y61Var.g((z61) arrayList7.get(i52), 0, 0, 0.0f);
                                }
                                ArrayList arrayList8 = arrayList3;
                                int size13 = arrayList8.size();
                                for (int i53 = 0; i53 < size13; i53++) {
                                    y61Var.g((z61) arrayList8.get(i53), 0, 0, 0.0f);
                                }
                                ArrayList arrayList9 = arrayList2;
                                int size14 = arrayList9.size();
                                int i54 = 0;
                                while (true) {
                                    i51 = i16;
                                    if (i54 >= size14) {
                                        break;
                                    }
                                    z61 z61Var5 = (z61) arrayList9.get(i54);
                                    int i55 = i15 - i50;
                                    lu1 lu1Var2 = lu1Var;
                                    al0 layoutDirection2 = lu1Var2.getLayoutDirection();
                                    k72 k72Var3 = k72Var2;
                                    y61Var.g(z61Var5, ((k72Var3.d(lu1Var2, layoutDirection2) + i55) - k72Var3.c(lu1Var2, lu1Var2.getLayoutDirection())) / 2, i51 - i48, 0.0f);
                                    i54++;
                                }
                                ArrayList arrayList10 = arrayList5;
                                int size15 = arrayList10.size();
                                for (int i56 = 0; i56 < size15; i56++) {
                                    z61 z61Var6 = (z61) arrayList10.get(i56);
                                    Integer num = numValueOf2;
                                    y61Var.g(z61Var6, 0, i51 - (num != null ? num.intValue() : 0), 0.0f);
                                }
                                o50 o50Var2 = o50Var;
                                if (o50Var2 != null) {
                                    ArrayList arrayList11 = arrayList4;
                                    int size16 = arrayList11.size();
                                    for (int i57 = 0; i57 < size16; i57++) {
                                        z61 z61Var7 = (z61) arrayList11.get(i57);
                                        int i58 = o50Var2.e;
                                        Integer num2 = numValueOf;
                                        num2.getClass();
                                        y61Var.g(z61Var7, i58, i51 - num2.intValue(), 0.0f);
                                    }
                                }
                                return t32.a;
                            }
                        });
                    }
                };
                ob0Var.f0(objK2);
            } else {
                i3 = 0;
            }
            pv.c(null, (wa0) objK2, ob0Var, i3);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ho(i, wa0Var, joVar, wa0Var2, wa0Var3, k72Var, wa0Var4, i2);
        }
    }

    public static final void d(tv0 tv0Var, jo joVar, ob0 ob0Var, int i) {
        ob0Var.X(-1854833411);
        int i2 = (ob0Var.f(tv0Var) ? 4 : 2) | i;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = n5.h;
                ob0Var.f0(objK);
            }
            uu0 uu0Var = (uu0) objK;
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
            xc.E(dp.f, ob0Var, uu0Var);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            joVar.h(ob0Var, 6);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new fi(i, 12, tv0Var, joVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final sa0 sa0Var, final tv0 tv0Var, boolean z, d02 d02Var, final wa0 wa0Var, wa0 wa0Var2, wa0 wa0Var3, wa0 wa0Var4, ez1 ez1Var, nk0 nk0Var, lk0 lk0Var, final boolean z2, int i, int i2, final ym1 ym1Var, final fx1 fx1Var, ob0 ob0Var, final int i3, final int i4, final int i5) {
        String str2;
        int i6;
        int i7;
        wa0 wa0Var5;
        wa0 wa0Var6;
        wa0 wa0Var7;
        int i8;
        int i9;
        nk0 nk0Var2;
        int i10;
        ob0 ob0Var2;
        final boolean z3;
        final d02 d02Var2;
        final ez1 ez1Var2;
        final int i11;
        final wa0 wa0Var8;
        final wa0 wa0Var9;
        final nk0 nk0Var3;
        final wa0 wa0Var10;
        final lk0 lk0Var2;
        final int i12;
        dc1 dc1VarR;
        d02 d02Var3;
        ez1 ez1Var3;
        final wa0 wa0Var11;
        final int i13;
        final lk0 lk0Var3;
        final int i14;
        jx0 jx0Var;
        ez1 ez1Var4;
        long j;
        ob0Var.X(-154966360);
        if ((i3 & 6) == 0) {
            str2 = str;
            i6 = (ob0Var.f(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= ob0Var.h(sa0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= ob0Var.f(tv0Var) ? 256 : 128;
        }
        int i15 = i6 | 27648;
        if ((i3 & 196608) == 0) {
            i15 = 93184 | i6;
        }
        int i16 = i15 | 1572864;
        if ((i3 & 12582912) == 0) {
            i7 = 1572864;
            wa0Var5 = wa0Var;
            i16 |= ob0Var.h(wa0Var5) ? 8388608 : 4194304;
        } else {
            i7 = 1572864;
            wa0Var5 = wa0Var;
        }
        int i17 = i5 & 256;
        if (i17 != 0) {
            i16 |= 100663296;
            wa0Var6 = wa0Var2;
        } else {
            wa0Var6 = wa0Var2;
            if ((i3 & 100663296) == 0) {
                i16 |= ob0Var.h(wa0Var6) ? 67108864 : 33554432;
            }
        }
        int i18 = i16 | 805306368;
        int i19 = i4 | 6;
        int i20 = i5 & 2048;
        if (i20 != 0) {
            i19 = i4 | 54;
            wa0Var7 = wa0Var3;
        } else {
            wa0Var7 = wa0Var3;
            if ((i4 & 48) == 0) {
                i19 |= ob0Var.h(wa0Var7) ? 32 : 16;
            }
        }
        int i21 = i19;
        int i22 = i5 & 4096;
        if (i22 != 0) {
            i21 |= 384;
            i8 = i22;
        } else {
            i8 = i22;
            if ((i4 & 384) == 0) {
                i21 |= ob0Var.h(wa0Var4) ? 256 : 128;
            }
            if ((i5 & 8192) == 0) {
                i21 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i21 |= ob0Var.g(false) ? 2048 : 1024;
            }
            int i23 = i21 | 24576;
            i9 = i5 & 32768;
            if (i9 != 0) {
                if ((i4 & 196608) == 0) {
                    nk0Var2 = nk0Var;
                    i23 |= ob0Var.f(nk0Var2) ? 131072 : 65536;
                }
                i10 = i23 | i7;
                if ((i4 & 12582912) == 0) {
                    i10 |= ob0Var.g(z2) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) == 0) {
                    i10 |= 33554432;
                }
                boolean z4 = true;
                if (ob0Var.N(i18 & 1, ((i18 & 306783379) == 306783378 && ((i10 | 805306368) & 306783379) == 306783378 && (((6 | (ob0Var.f(ym1Var) ? ' ' : (char) 16)) | (ob0Var.f(fx1Var) ? 256 : 128)) & 147) == 146) ? false : true)) {
                    ob0Var.S();
                    if ((i3 & 1) == 0 || ob0Var.x()) {
                        d02Var3 = (d02) ob0Var.j(mz1.a);
                        if (i17 != 0) {
                            wa0Var6 = null;
                        }
                        if (i20 != 0) {
                            wa0Var7 = null;
                        }
                        wa0 wa0Var12 = i8 == 0 ? wa0Var4 : null;
                        ez1Var3 = l91.w;
                        if (i9 != 0) {
                            nk0Var2 = nk0.c;
                        }
                        wa0Var11 = wa0Var12;
                        i13 = z2 ? 1 : Integer.MAX_VALUE;
                        lk0Var3 = lk0.a;
                        i14 = 1;
                    } else {
                        ob0Var.Q();
                        z4 = z;
                        d02Var3 = d02Var;
                        wa0Var11 = wa0Var4;
                        ez1Var3 = ez1Var;
                        lk0Var3 = lk0Var;
                        i13 = i;
                        i14 = i2;
                    }
                    final nk0 nk0Var4 = nk0Var2;
                    final wa0 wa0Var13 = wa0Var6;
                    ob0Var.q();
                    ob0Var.W(488158419);
                    Object objK = ob0Var.K();
                    if (objK == kp.a) {
                        objK = new jx0();
                        ob0Var.f0(objK);
                    }
                    jx0 jx0Var2 = (jx0) objK;
                    boolean z5 = false;
                    ob0Var.p(false);
                    ob0Var.W(1401225826);
                    long jB = d02Var3.b();
                    if (jB != 16) {
                        jx0Var = jx0Var2;
                        ez1Var4 = ez1Var3;
                    } else {
                        boolean zBooleanValue = ((Boolean) el.q(jx0Var2, ob0Var, 0).getValue()).booleanValue();
                        if (z4) {
                            jx0Var = jx0Var2;
                            ez1Var4 = ez1Var3;
                            j = zBooleanValue ? fx1Var.a : fx1Var.b;
                        } else {
                            jx0Var = jx0Var2;
                            ez1Var4 = ez1Var3;
                            j = fx1Var.c;
                        }
                        jB = j;
                        z5 = false;
                    }
                    long j2 = jB;
                    ob0Var.p(z5);
                    final d02 d02VarD = d02Var3.d(new d02(j2, 0L, null, 0L, 0, 0L, 16777214));
                    final wa0 wa0Var14 = wa0Var5;
                    final wa0 wa0Var15 = wa0Var7;
                    final ez1 ez1Var5 = ez1Var4;
                    final jx0 jx0Var3 = jx0Var;
                    final String str3 = str2;
                    final boolean z6 = z4;
                    ob0Var2 = ob0Var;
                    lk.i(yz1.a.a(fx1Var.k), lk.d0(1459735400, new wa0() { // from class: wx1
                        @Override // defpackage.wa0
                        public final Object h(Object obj, Object obj2) {
                            ob0 ob0Var3 = (ob0) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (ob0Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                ob0Var3.j(w4.a);
                                ((Resources) ob0Var3.j(w4.c)).getString(R.string.default_error_message);
                                tv0 tv0VarA = ko1.a(tv0Var, 280.0f, 56.0f);
                                final fx1 fx1Var2 = fx1Var;
                                uq1 uq1Var = new uq1(fx1Var2.i);
                                final String str4 = str3;
                                final boolean z7 = z6;
                                final boolean z8 = z2;
                                final ez1 ez1Var6 = ez1Var5;
                                final jx0 jx0Var4 = jx0Var3;
                                final wa0 wa0Var16 = wa0Var14;
                                final wa0 wa0Var17 = wa0Var13;
                                final wa0 wa0Var18 = wa0Var15;
                                final wa0 wa0Var19 = wa0Var11;
                                final ym1 ym1Var2 = ym1Var;
                                mf.a(str4, sa0Var, tv0VarA, z7, d02VarD, nk0Var4, lk0Var3, z8, i13, i14, ez1Var6, null, jx0Var4, uq1Var, lk.d0(1451491557, new xa0() { // from class: yx1
                                    @Override // defpackage.xa0
                                    public final Object f(Object obj3, Object obj4, Object obj5) {
                                        wa0 wa0Var20 = (wa0) obj3;
                                        ob0 ob0Var4 = (ob0) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= ob0Var4.h(wa0Var20) ? 4 : 2;
                                        }
                                        if (ob0Var4.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            l91.r.g(str4, wa0Var20, z7, z8, ez1Var6, jx0Var4, wa0Var16, wa0Var17, wa0Var18, wa0Var19, ym1Var2, fx1Var2, null, null, ob0Var4, (iIntValue2 << 3) & 112);
                                        } else {
                                            ob0Var4.Q();
                                        }
                                        return t32.a;
                                    }
                                }, ob0Var3), ob0Var3, 0);
                            } else {
                                ob0Var3.Q();
                            }
                            return t32.a;
                        }
                    }, ob0Var2), ob0Var2, 56);
                    int i24 = i14;
                    nk0Var3 = nk0Var4;
                    wa0Var8 = wa0Var13;
                    i12 = i24;
                    z3 = z6;
                    i11 = i13;
                    ez1Var2 = ez1Var5;
                    wa0Var10 = wa0Var11;
                    d02Var2 = d02Var3;
                    lk0Var2 = lk0Var3;
                    wa0Var9 = wa0Var15;
                } else {
                    ob0Var2 = ob0Var;
                    ob0Var2.Q();
                    z3 = z;
                    d02Var2 = d02Var;
                    ez1Var2 = ez1Var;
                    i11 = i;
                    wa0Var8 = wa0Var6;
                    wa0Var9 = wa0Var7;
                    nk0Var3 = nk0Var2;
                    wa0Var10 = wa0Var4;
                    lk0Var2 = lk0Var;
                    i12 = i2;
                }
                dc1VarR = ob0Var2.r();
                if (dc1VarR != null) {
                    dc1VarR.d = new wa0() { // from class: xx1
                        @Override // defpackage.wa0
                        public final Object h(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iV = al.V(i3 | 1);
                            int iV2 = al.V(i4);
                            af1.e(str, sa0Var, tv0Var, z3, d02Var2, wa0Var, wa0Var8, wa0Var9, wa0Var10, ez1Var2, nk0Var3, lk0Var2, z2, i11, i12, ym1Var, fx1Var, (ob0) obj, iV, iV2, i5);
                            return t32.a;
                        }
                    };
                    return;
                }
                return;
            }
            i23 = 221184 | i21;
            nk0Var2 = nk0Var;
            i10 = i23 | i7;
            if ((i4 & 12582912) == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            boolean z42 = true;
            if (ob0Var.N(i18 & 1, ((i18 & 306783379) == 306783378 && ((i10 | 805306368) & 306783379) == 306783378 && (((6 | (ob0Var.f(ym1Var) ? ' ' : (char) 16)) | (ob0Var.f(fx1Var) ? 256 : 128)) & 147) == 146) ? false : true)) {
            }
            dc1VarR = ob0Var2.r();
            if (dc1VarR != null) {
            }
        }
        if ((i5 & 8192) == 0) {
        }
        int i232 = i21 | 24576;
        i9 = i5 & 32768;
        if (i9 != 0) {
        }
        nk0Var2 = nk0Var;
        i10 = i232 | i7;
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        boolean z422 = true;
        if (ob0Var.N(i18 & 1, ((i18 & 306783379) == 306783378 && ((i10 | 805306368) & 306783379) == 306783378 && (((6 | (ob0Var.f(ym1Var) ? ' ' : (char) 16)) | (ob0Var.f(fx1Var) ? 256 : 128)) & 147) == 146) ? false : true)) {
        }
        dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x052f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(wa0 wa0Var, wa0 wa0Var2, xa0 xa0Var, final wa0 wa0Var3, final wa0 wa0Var4, final wa0 wa0Var5, final wa0 wa0Var6, final boolean z, final zx1 zx1Var, final rx1 rx1Var, final rx1 rx1Var2, final rx1 rx1Var3, final jo joVar, wa0 wa0Var7, final c41 c41Var, ob0 ob0Var, final int i, final int i2) {
        int i3;
        int i4;
        wa0 wa0Var8;
        xa0 xa0Var2;
        wa0 wa0Var9;
        wa0 wa0Var10;
        ob0 ob0Var2;
        Object cy1Var;
        l91 l91Var;
        qv0 qv0Var;
        uf ufVar;
        c41 c41Var2;
        int i5;
        uf ufVar2;
        uf ufVar3;
        al0 al0Var;
        boolean z2;
        wa0 wa0Var11;
        wa0 wa0Var12;
        uf ufVar4;
        boolean z3;
        float f;
        float f2;
        boolean z4;
        Object obj;
        boolean z5;
        Object objK;
        uf ufVar5 = v20.j;
        uf ufVar6 = v20.f;
        ob0Var.X(-1552532491);
        int i6 = i & 6;
        qv0 qv0Var2 = qv0.a;
        if (i6 == 0) {
            i3 = i | (ob0Var.f(qv0Var2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.h(wa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var.h(wa0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ob0Var.h(xa0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var.h(wa0Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ob0Var.h(wa0Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ob0Var.h(wa0Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ob0Var.h(wa0Var6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ob0Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ob0Var.f(zx1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? ob0Var.f(rx1Var) : ob0Var.h(rx1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? ob0Var.f(rx1Var2) : ob0Var.h(rx1Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? ob0Var.f(rx1Var3) : ob0Var.h(rx1Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ob0Var.h(joVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ob0Var.h(wa0Var7) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ob0Var.f(c41Var) ? 131072 : 65536;
        }
        int i7 = i4;
        if (ob0Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true)) {
            long j = ((ju0) ob0Var.j(mu0.b)).b.l.b.c;
            long j2 = u22.l;
            if ((j & 1095216660480L) != 4294967296L) {
                j = j2;
            }
            float fJ = ((hx) ob0Var.j(aq.h)).J(j) / 2.0f;
            int i8 = i7 & 14;
            boolean zC = ((458752 & i7) == 131072) | ((i3 & 1879048192) == 536870912) | ((i3 & 234881024) == 67108864) | (i8 == 4 || ((i7 & 8) != 0 && ob0Var.f(rx1Var))) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && ob0Var.f(rx1Var2))) | ((i7 & 896) == 256 || ((i7 & 512) != 0 && ob0Var.f(rx1Var3))) | ob0Var.c(fJ);
            Object objK2 = ob0Var.K();
            l91 l91Var2 = kp.a;
            if (zC || objK2 == l91Var2) {
                ob0Var2 = ob0Var;
                l91Var = l91Var2;
                qv0Var = qv0Var2;
                ufVar = ufVar5;
                c41Var2 = c41Var;
                i5 = i8;
                ufVar2 = ufVar6;
                cy1Var = new cy1(z, zx1Var, rx1Var, rx1Var2, rx1Var3, c41Var2, fJ);
                ob0Var2.f0(cy1Var);
            } else {
                cy1Var = objK2;
                ufVar = ufVar5;
                i5 = i8;
                ob0Var2 = ob0Var;
                l91Var = l91Var2;
                qv0Var = qv0Var2;
                ufVar2 = ufVar6;
                c41Var2 = c41Var;
            }
            cy1 cy1Var2 = (cy1) cy1Var;
            al0 al0Var2 = (al0) ob0Var2.j(aq.n);
            int iHashCode = Long.hashCode(ob0Var2.T);
            b61 b61VarL = ob0Var2.l();
            tv0 tv0VarP = bk.P(ob0Var2, qv0Var);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var2.Z();
            if (ob0Var2.S) {
                ob0Var2.k(zpVar);
            } else {
                ob0Var2.i0();
            }
            r9 r9Var = dp.f;
            xc.E(r9Var, ob0Var2, cy1Var2);
            r9 r9Var2 = dp.e;
            xc.E(r9Var2, ob0Var2, b61VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            r9 r9Var3 = dp.g;
            xc.E(r9Var3, ob0Var2, numValueOf);
            a4 a4Var = dp.h;
            xc.C(ob0Var2, a4Var);
            r9 r9Var4 = dp.d;
            xc.E(r9Var4, ob0Var2, tv0VarP);
            joVar.h(ob0Var2, Integer.valueOf((i7 >> 9) & 14));
            nv0 nv0Var = nv0.a;
            if (wa0Var3 != null) {
                ob0Var2.W(993153366);
                tv0 tv0VarA = xi0.A(qv0Var, "Leading");
                ud0 ud0Var = bi0.a;
                tv0 tv0VarC = tv0VarA.c(nv0Var);
                ufVar3 = ufVar2;
                uu0 uu0VarD = sg.d(ufVar, false);
                int iHashCode2 = Long.hashCode(ob0Var2.T);
                b61 b61VarL2 = ob0Var2.l();
                tv0 tv0VarP2 = bk.P(ob0Var2, tv0VarC);
                ob0Var2.Z();
                al0Var = al0Var2;
                if (ob0Var2.S) {
                    ob0Var2.k(zpVar);
                } else {
                    ob0Var2.i0();
                }
                xc.E(r9Var, ob0Var2, uu0VarD);
                xc.E(r9Var2, ob0Var2, b61VarL2);
                s91.q(iHashCode2, ob0Var2, r9Var3, ob0Var2, a4Var);
                xc.E(r9Var4, ob0Var2, tv0VarP2);
                wa0Var11 = wa0Var3;
                wa0Var11.h(ob0Var2, Integer.valueOf((i3 >> 12) & 14));
                ob0Var2.p(true);
                z2 = false;
                ob0Var2.p(false);
            } else {
                ufVar3 = ufVar2;
                al0Var = al0Var2;
                z2 = false;
                wa0Var11 = wa0Var3;
                ob0Var2.W(993399382);
                ob0Var2.p(false);
            }
            if (wa0Var4 != null) {
                ob0Var2.W(993442100);
                tv0 tv0VarA2 = xi0.A(qv0Var, "Trailing");
                ud0 ud0Var2 = bi0.a;
                tv0 tv0VarC2 = tv0VarA2.c(nv0Var);
                uu0 uu0VarD2 = sg.d(ufVar, z2);
                int iHashCode3 = Long.hashCode(ob0Var2.T);
                b61 b61VarL3 = ob0Var2.l();
                tv0 tv0VarP3 = bk.P(ob0Var2, tv0VarC2);
                ob0Var2.Z();
                if (ob0Var2.S) {
                    ob0Var2.k(zpVar);
                } else {
                    ob0Var2.i0();
                }
                xc.E(r9Var, ob0Var2, uu0VarD2);
                xc.E(r9Var2, ob0Var2, b61VarL3);
                s91.q(iHashCode3, ob0Var2, r9Var3, ob0Var2, a4Var);
                xc.E(r9Var4, ob0Var2, tv0VarP3);
                wa0Var12 = wa0Var4;
                wa0Var12.h(ob0Var2, Integer.valueOf((i3 >> 15) & 14));
                ob0Var2.p(true);
                ob0Var2.p(false);
            } else {
                wa0Var12 = wa0Var4;
                ob0Var2.W(993690038);
                ob0Var2.p(z2);
            }
            al0 al0Var3 = al0Var;
            float fR = xi0.r(c41Var2, al0Var3);
            float fQ = xi0.q(c41Var2, al0Var3);
            float f3 = ((tz) ob0Var2.j(bi0.c)).e;
            if (Float.isNaN(f3)) {
                f3 = 0.0f;
            }
            float f4 = (f3 - pv.z) / 2.0f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (wa0Var11 != null) {
                fR -= f4;
                if (fR < 0.0f) {
                    fR = 0.0f;
                }
            }
            if (wa0Var12 != null) {
                fQ -= f4;
                if (fQ < 0.0f) {
                    fQ = 0.0f;
                }
            }
            if (wa0Var5 != null) {
                ob0Var2.W(994466433);
                tv0 tv0VarF = xi0.F(ko1.j(ko1.c(xi0.A(qv0Var, "Prefix"), 24.0f, Float.NaN)), fR, 2.0f, 10);
                ufVar4 = ufVar3;
                uu0 uu0VarD3 = sg.d(ufVar4, false);
                int iHashCode4 = Long.hashCode(ob0Var2.T);
                b61 b61VarL4 = ob0Var2.l();
                tv0 tv0VarP4 = bk.P(ob0Var2, tv0VarF);
                ob0Var2.Z();
                if (ob0Var2.S) {
                    ob0Var2.k(zpVar);
                } else {
                    ob0Var2.i0();
                }
                xc.E(r9Var, ob0Var2, uu0VarD3);
                xc.E(r9Var2, ob0Var2, b61VarL4);
                s91.q(iHashCode4, ob0Var2, r9Var3, ob0Var2, a4Var);
                xc.E(r9Var4, ob0Var2, tv0VarP4);
                wa0Var5.h(ob0Var2, Integer.valueOf((i3 >> 18) & 14));
                ob0Var2.p(true);
                z3 = false;
                ob0Var2.p(false);
            } else {
                ufVar4 = ufVar3;
                z3 = false;
                ob0Var2.W(994794134);
                ob0Var2.p(false);
            }
            if (wa0Var6 != null) {
                ob0Var2.W(994837379);
                tv0 tv0VarF2 = xi0.F(ko1.j(ko1.c(xi0.A(qv0Var, "Suffix"), 24.0f, Float.NaN)), 2.0f, fQ, 10);
                uu0 uu0VarD4 = sg.d(ufVar4, z3);
                int iHashCode5 = Long.hashCode(ob0Var2.T);
                b61 b61VarL5 = ob0Var2.l();
                tv0 tv0VarP5 = bk.P(ob0Var2, tv0VarF2);
                ob0Var2.Z();
                if (ob0Var2.S) {
                    ob0Var2.k(zpVar);
                } else {
                    ob0Var2.i0();
                }
                xc.E(r9Var, ob0Var2, uu0VarD4);
                xc.E(r9Var2, ob0Var2, b61VarL5);
                s91.q(iHashCode5, ob0Var2, r9Var3, ob0Var2, a4Var);
                xc.E(r9Var4, ob0Var2, tv0VarP5);
                wa0Var6.h(ob0Var2, Integer.valueOf((i3 >> 21) & 14));
                ob0Var2.p(true);
                ob0Var2.p(false);
            } else {
                ob0Var2.W(995163158);
                ob0Var2.p(z3);
            }
            tv0 tv0VarF3 = xi0.F(qv0Var, fR, fQ, 10);
            if (wa0Var2 != null) {
                ob0Var2.W(995662971);
                tv0 tv0VarA3 = xi0.A(qv0Var, "Label");
                if (i5 != 4) {
                    if ((i7 & 8) != 0) {
                        obj = rx1Var;
                        if (ob0Var2.h(obj)) {
                        }
                        f = fR;
                        objK = ob0Var2.K();
                        if (z5 || objK == l91Var) {
                            objK = new p7(26, obj);
                            ob0Var2.f0(objK);
                        }
                        f2 = fQ;
                        tv0 tv0VarC3 = ko1.j(s22.y(tv0VarA3, new wi(9, (ha0) objK))).c(tv0VarF3);
                        uu0 uu0VarD5 = sg.d(ufVar4, false);
                        int iHashCode6 = Long.hashCode(ob0Var2.T);
                        b61 b61VarL6 = ob0Var2.l();
                        tv0 tv0VarP6 = bk.P(ob0Var2, tv0VarC3);
                        ob0Var2.Z();
                        if (ob0Var2.S) {
                            ob0Var2.i0();
                        } else {
                            ob0Var2.k(zpVar);
                        }
                        xc.E(r9Var, ob0Var2, uu0VarD5);
                        xc.E(r9Var2, ob0Var2, b61VarL6);
                        s91.q(iHashCode6, ob0Var2, r9Var3, ob0Var2, a4Var);
                        xc.E(r9Var4, ob0Var2, tv0VarP6);
                        wa0Var10 = wa0Var2;
                        wa0Var10.h(ob0Var2, Integer.valueOf((i3 >> 6) & 14));
                        ob0Var2.p(true);
                        ob0Var2.p(false);
                    } else {
                        obj = rx1Var;
                    }
                    z5 = false;
                    f = fR;
                    objK = ob0Var2.K();
                    if (z5) {
                        objK = new p7(26, obj);
                        ob0Var2.f0(objK);
                        f2 = fQ;
                        tv0 tv0VarC32 = ko1.j(s22.y(tv0VarA3, new wi(9, (ha0) objK))).c(tv0VarF3);
                        uu0 uu0VarD52 = sg.d(ufVar4, false);
                        int iHashCode62 = Long.hashCode(ob0Var2.T);
                        b61 b61VarL62 = ob0Var2.l();
                        tv0 tv0VarP62 = bk.P(ob0Var2, tv0VarC32);
                        ob0Var2.Z();
                        if (ob0Var2.S) {
                        }
                        xc.E(r9Var, ob0Var2, uu0VarD52);
                        xc.E(r9Var2, ob0Var2, b61VarL62);
                        s91.q(iHashCode62, ob0Var2, r9Var3, ob0Var2, a4Var);
                        xc.E(r9Var4, ob0Var2, tv0VarP62);
                        wa0Var10 = wa0Var2;
                        wa0Var10.h(ob0Var2, Integer.valueOf((i3 >> 6) & 14));
                        ob0Var2.p(true);
                        ob0Var2.p(false);
                    }
                } else {
                    obj = rx1Var;
                }
                z5 = true;
                f = fR;
                objK = ob0Var2.K();
                if (z5) {
                }
            } else {
                wa0Var10 = wa0Var2;
                f = fR;
                f2 = fQ;
                ob0Var2.W(996057942);
                ob0Var2.p(false);
            }
            tv0 tv0VarF4 = xi0.F(ko1.j(ko1.c(qv0Var, 24.0f, Float.NaN)), wa0Var5 == null ? f : 0.0f, wa0Var6 == null ? f2 : 0.0f, 10);
            if (xa0Var != null) {
                ob0Var2.W(996427927);
                xa0Var2 = xa0Var;
                xa0Var2.f(xi0.A(qv0Var, "Hint").c(tv0VarF4), ob0Var2, Integer.valueOf((i3 >> 6) & 112));
                ob0Var2.p(false);
            } else {
                xa0Var2 = xa0Var;
                ob0Var2.W(996519222);
                ob0Var2.p(false);
            }
            tv0 tv0VarC4 = xi0.A(qv0Var, "TextField").c(tv0VarF4);
            uu0 uu0VarD6 = sg.d(ufVar4, true);
            int iHashCode7 = Long.hashCode(ob0Var2.T);
            b61 b61VarL7 = ob0Var2.l();
            tv0 tv0VarP7 = bk.P(ob0Var2, tv0VarC4);
            ob0Var2.Z();
            if (ob0Var2.S) {
                ob0Var2.k(zpVar);
            } else {
                ob0Var2.i0();
            }
            xc.E(r9Var, ob0Var2, uu0VarD6);
            xc.E(r9Var2, ob0Var2, b61VarL7);
            s91.q(iHashCode7, ob0Var2, r9Var3, ob0Var2, a4Var);
            xc.E(r9Var4, ob0Var2, tv0VarP7);
            wa0Var8 = wa0Var;
            wa0Var8.h(ob0Var2, Integer.valueOf((i3 >> 3) & 14));
            ob0Var2.p(true);
            if (wa0Var7 != null) {
                ob0Var2.W(996767873);
                tv0 tv0VarB = xi0.B(ko1.j(ko1.c(xi0.A(qv0Var, "Supporting"), 16.0f, Float.NaN)), new e41(16.0f, 4.0f, 16.0f, 0.0f));
                uu0 uu0VarD7 = sg.d(ufVar4, false);
                int iHashCode8 = Long.hashCode(ob0Var2.T);
                b61 b61VarL8 = ob0Var2.l();
                tv0 tv0VarP8 = bk.P(ob0Var2, tv0VarB);
                ob0Var2.Z();
                if (ob0Var2.S) {
                    ob0Var2.k(zpVar);
                } else {
                    ob0Var2.i0();
                }
                xc.E(r9Var, ob0Var2, uu0VarD7);
                xc.E(r9Var2, ob0Var2, b61VarL8);
                s91.q(iHashCode8, ob0Var2, r9Var3, ob0Var2, a4Var);
                xc.E(r9Var4, ob0Var2, tv0VarP8);
                wa0Var9 = wa0Var7;
                wa0Var9.h(ob0Var2, Integer.valueOf((i7 >> 12) & 14));
                z4 = true;
                ob0Var2.p(true);
                ob0Var2.p(false);
            } else {
                wa0Var9 = wa0Var7;
                z4 = true;
                ob0Var2.W(997157078);
                ob0Var2.p(false);
            }
            ob0Var2.p(z4);
        } else {
            wa0Var8 = wa0Var;
            xa0Var2 = xa0Var;
            wa0Var9 = wa0Var7;
            wa0Var10 = wa0Var2;
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            final xa0 xa0Var3 = xa0Var2;
            final wa0 wa0Var13 = wa0Var9;
            final wa0 wa0Var14 = wa0Var10;
            final wa0 wa0Var15 = wa0Var8;
            dc1VarR.d = new wa0() { // from class: vx1
                @Override // defpackage.wa0
                public final Object h(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iV = al.V(i | 1);
                    int iV2 = al.V(i2);
                    af1.f(wa0Var15, wa0Var14, xa0Var3, wa0Var3, wa0Var4, wa0Var5, wa0Var6, z, zx1Var, rx1Var, rx1Var2, rx1Var3, joVar, wa0Var13, c41Var, (ob0) obj2, iV, iV2);
                    return t32.a;
                }
            };
        }
    }

    public static final long g(int i, int i2) {
        if (i < 0 || i2 < 0) {
            og0.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = wz1.c;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(ev1 ev1Var, ye yeVar) {
        yk1 yk1Var;
        wt wtVar;
        int size;
        int i;
        if (yeVar instanceof yk1) {
            yk1Var = (yk1) yeVar;
            int i2 = yk1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yk1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                yk1Var = new yk1(yeVar);
            }
        }
        Object objA = yk1Var.i;
        int i3 = yk1Var.j;
        if (i3 == 0) {
            xc.G(objA);
            yk1Var.h = ev1Var;
            yk1Var.j = 1;
            objA = ev1Var.a(f81.f, yk1Var);
            wtVar = wt.e;
            if (objA == wtVar) {
            }
            e81 e81Var = (e81) objA;
            List list = e81Var.a;
            size = list.size();
            i = 0;
            while (i < size) {
            }
            return e81Var;
        }
        if (i3 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ev1Var = yk1Var.h;
        xc.G(objA);
        e81 e81Var2 = (e81) objA;
        List list2 = e81Var2.a;
        size = list2.size();
        i = 0;
        while (i < size) {
            if (lk.q((l81) list2.get(i))) {
                i++;
            } else {
                yk1Var.h = ev1Var;
                yk1Var.j = 1;
                objA = ev1Var.a(f81.f, yk1Var);
                wtVar = wt.e;
                if (objA == wtVar) {
                    return wtVar;
                }
                e81 e81Var22 = (e81) objA;
                List list22 = e81Var22.a;
                size = list22.size();
                i = 0;
                while (i < size) {
                }
            }
        }
        return e81Var22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(ev1 ev1Var, ex1 ex1Var, e81 e81Var, int i, ye yeVar) {
        cl1 cl1Var;
        long j;
        yc1 yc1Var;
        if (yeVar instanceof cl1) {
            cl1Var = (cl1) yeVar;
            int i2 = cl1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cl1Var.m = i2 - Integer.MIN_VALUE;
            } else {
                cl1Var = new cl1(yeVar);
            }
        }
        Object objI = cl1Var.l;
        int i3 = cl1Var.m;
        t32 t32Var = t32.a;
        int i4 = 2;
        wt wtVar = wt.e;
        try {
            if (i3 == 0) {
                xc.G(objI);
                l81 l81Var = (l81) pl.c0(e81Var.a);
                j = l81Var.a;
                ex1Var.d(l81Var.c, i > 2 ? l91.n : l91.m);
                yc1Var = new yc1();
                yc1Var.e = 9205357640488583168L;
                long jC = ev1Var.f().c();
                dl1 dl1Var = new dl1(j, yc1Var, null);
                cl1Var.h = ev1Var;
                cl1Var.i = ex1Var;
                cl1Var.j = yc1Var;
                cl1Var.k = j;
                cl1Var.m = 1;
                objI = ev1Var.i(jC, dl1Var, cl1Var);
                if (objI == wtVar) {
                }
                return wtVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ex1Var = cl1Var.i;
                ev1Var = cl1Var.h;
                xc.G(objI);
                if (!((Boolean) objI).booleanValue()) {
                    ex1Var.onCancel();
                    return t32Var;
                }
                List list = ev1Var.j.w.a;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    l81 l81Var2 = (l81) list.get(i5);
                    if (lk.s(l81Var2)) {
                        l81Var2.a();
                    }
                }
                ex1Var.a();
                return t32Var;
            }
            long j2 = cl1Var.k;
            yc1Var = cl1Var.j;
            ex1 ex1Var2 = cl1Var.i;
            ev1 ev1Var2 = cl1Var.h;
            try {
                xc.G(objI);
                j = j2;
                ex1Var = ex1Var2;
                ev1Var = ev1Var2;
            } catch (CancellationException e) {
                e = e;
                ex1Var = ex1Var2;
                ex1Var.onCancel();
                throw e;
            }
            kz kzVar = (kz) objI;
            if (kzVar == null) {
                kzVar = kz.g;
            }
            if (kzVar == kz.h) {
                ex1Var.onCancel();
                return t32Var;
            }
            if (kzVar == kz.e) {
                ex1Var.a();
                return t32Var;
            }
            if (kzVar == kz.f) {
                ex1Var.e(yc1Var.e);
            }
            ns0 ns0Var = new ns0(ex1Var, i4);
            cl1Var.h = ev1Var;
            cl1Var.i = ex1Var;
            cl1Var.j = null;
            cl1Var.m = 2;
            objI = s00.d(ev1Var, j, ns0Var, cl1Var);
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    public static float j(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.yc.l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.yc.l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean k(pc1 pc1Var, pc1 pc1Var2, pc1 pc1Var3, int i) {
        boolean zL = l(i, pc1Var3, pc1Var);
        float f = pc1Var3.b;
        float f2 = pc1Var3.d;
        float f3 = pc1Var3.a;
        float f4 = pc1Var3.c;
        float f5 = pc1Var.d;
        float f6 = pc1Var.b;
        float f7 = pc1Var.c;
        float f8 = pc1Var.a;
        if (!zL && l(i, pc1Var2, pc1Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            yc.l("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean l(int i, pc1 pc1Var, pc1 pc1Var2) {
        if (i == 3 || i == 4) {
            return pc1Var.d > pc1Var2.b && pc1Var.b < pc1Var2.d;
        }
        if (i == 5 || i == 6) {
            return pc1Var.c > pc1Var2.a && pc1Var.a < pc1Var2.c;
        }
        yc.l("This function should only be used for 2-D focus search");
        return false;
    }

    public static final long m(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return z60.a(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    public static final long n(int i, long j) {
        int i2 = wz1.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : g(i4, i);
    }

    public static final void o(w80 w80Var, iy0 iy0Var) {
        if (!w80Var.e.r) {
            ng0.b("visitChildren called on an unattached node");
        }
        iy0 iy0Var2 = new iy0(new sv0[16]);
        sv0 sv0Var = w80Var.e;
        sv0 sv0Var2 = sv0Var.j;
        if (sv0Var2 == null) {
            bl.h(iy0Var2, sv0Var);
        } else {
            iy0Var2.b(sv0Var2);
        }
        while (true) {
            int i = iy0Var2.g;
            if (i == 0) {
                return;
            }
            sv0 sv0VarK = (sv0) iy0Var2.k(i - 1);
            if ((sv0VarK.h & 1024) == 0) {
                bl.h(iy0Var2, sv0VarK);
            } else {
                while (true) {
                    if (sv0VarK == null) {
                        break;
                    }
                    if ((sv0VarK.g & 1024) != 0) {
                        iy0 iy0Var3 = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof w80) {
                                w80 w80Var2 = (w80) sv0VarK;
                                if (w80Var2.r && !bl.P(w80Var2).R) {
                                    if (w80Var2.N0().a) {
                                        iy0Var.b(w80Var2);
                                    } else {
                                        o(w80Var2, iy0Var);
                                    }
                                }
                            } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                int i2 = 0;
                                for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                    if ((sv0Var3.g & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            sv0VarK = sv0Var3;
                                        } else {
                                            if (iy0Var3 == null) {
                                                iy0Var3 = new iy0(new sv0[16]);
                                            }
                                            if (sv0VarK != null) {
                                                iy0Var3.b(sv0VarK);
                                                sv0VarK = null;
                                            }
                                            iy0Var3.b(sv0Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var3);
                        }
                    } else {
                        sv0VarK = sv0VarK.j;
                    }
                }
            }
        }
    }

    public static final w80 p(iy0 iy0Var, pc1 pc1Var, int i) {
        pc1 pc1VarH;
        w80 w80Var = null;
        if (i == 3) {
            pc1VarH = pc1Var.h((pc1Var.c - pc1Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            pc1VarH = pc1Var.h(-((pc1Var.c - pc1Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            pc1VarH = pc1Var.h(0.0f, (pc1Var.d - pc1Var.b) + 1.0f);
        } else {
            if (i != 6) {
                yc.l("This function should only be used for 2-D focus search");
                return null;
            }
            pc1VarH = pc1Var.h(0.0f, -((pc1Var.d - pc1Var.b) + 1.0f));
        }
        Object[] objArr = iy0Var.e;
        int i2 = iy0Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            w80 w80Var2 = (w80) objArr[i3];
            if (hk.F(w80Var2)) {
                pc1 pc1VarT = hk.t(w80Var2);
                if (t(pc1VarT, pc1VarH, pc1Var, i)) {
                    w80Var = w80Var2;
                    pc1VarH = pc1VarT;
                }
            }
        }
        return w80Var;
    }

    public static final boolean q(w80 w80Var, int i, sa0 sa0Var) {
        pc1 pc1Var;
        iy0 iy0Var = new iy0(new w80[16]);
        o(w80Var, iy0Var);
        int i2 = iy0Var.g;
        if (i2 <= 1) {
            w80 w80Var2 = (w80) (i2 == 0 ? null : iy0Var.e[0]);
            if (w80Var2 != null) {
                return ((Boolean) sa0Var.i(w80Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                pc1 pc1VarT = hk.t(w80Var);
                float f = pc1VarT.a;
                float f2 = pc1VarT.b;
                pc1Var = new pc1(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    yc.l("This function should only be used for 2-D focus search");
                    return false;
                }
                pc1 pc1VarT2 = hk.t(w80Var);
                float f3 = pc1VarT2.c;
                float f4 = pc1VarT2.d;
                pc1Var = new pc1(f3, f4, f3, f4);
            }
            w80 w80VarP = p(iy0Var, pc1Var, i);
            if (w80VarP != null) {
                return ((Boolean) sa0Var.i(w80VarP)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean r(int i, o9 o9Var, w80 w80Var, pc1 pc1Var) {
        if (z(i, o9Var, w80Var, pc1Var)) {
            return true;
        }
        Boolean bool = (Boolean) nu0.J(w80Var, i, new u11(((m80) ((h4) bl.Q(w80Var)).getFocusOwner()).f(), w80Var, pc1Var, i, o9Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final ViewParent s(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final boolean t(pc1 pc1Var, pc1 pc1Var2, pc1 pc1Var3, int i) {
        if (!u(i, pc1Var, pc1Var3)) {
            return false;
        }
        if (u(i, pc1Var2, pc1Var3) && !k(pc1Var3, pc1Var, pc1Var2, i)) {
            return !k(pc1Var3, pc1Var2, pc1Var, i) && v(i, pc1Var3, pc1Var) < v(i, pc1Var3, pc1Var2);
        }
        return true;
    }

    public static final boolean u(int i, pc1 pc1Var, pc1 pc1Var2) {
        if (i == 3) {
            float f = pc1Var2.c;
            float f2 = pc1Var2.a;
            float f3 = pc1Var.c;
            return (f > f3 || f2 >= f3) && f2 > pc1Var.a;
        }
        if (i == 4) {
            float f4 = pc1Var2.a;
            float f5 = pc1Var2.c;
            float f6 = pc1Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < pc1Var.c;
        }
        if (i == 5) {
            float f7 = pc1Var2.d;
            float f8 = pc1Var2.b;
            float f9 = pc1Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > pc1Var.b;
        }
        if (i != 6) {
            yc.l("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = pc1Var2.b;
        float f11 = pc1Var2.d;
        float f12 = pc1Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < pc1Var.d;
    }

    public static final long v(int i, pc1 pc1Var, pc1 pc1Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = pc1Var.a;
            f2 = pc1Var2.c;
        } else if (i == 4) {
            f = pc1Var2.a;
            f2 = pc1Var.c;
        } else if (i == 5) {
            f = pc1Var.b;
            f2 = pc1Var2.d;
        } else {
            if (i != 6) {
                yc.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = pc1Var2.b;
            f2 = pc1Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = pc1Var.b;
            f3 = ((pc1Var.d - f7) / 2.0f) + f7;
            f4 = pc1Var2.b;
            f5 = pc1Var2.d;
        } else {
            if (i != 5 && i != 6) {
                yc.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = pc1Var.a;
            f3 = ((pc1Var.c - f8) / 2.0f) + f8;
            f4 = pc1Var2.a;
            f5 = pc1Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static boolean w(byte b) {
        return b > -65;
    }

    public static lm1 x(wa0 wa0Var) {
        lm1 lm1Var = new lm1();
        lm1Var.g = bl.t(lm1Var, lm1Var, wa0Var);
        return lm1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(ev1 ev1Var, go1 go1Var, g6 g6Var, e81 e81Var, ye yeVar) {
        al1 al1Var;
        yc ycVar;
        boolean z;
        vc1 vc1Var;
        jo0 jo0Var;
        boolean z2;
        ev1 ev1Var2 = ev1Var;
        go1 go1Var2 = go1Var;
        yc ycVar2 = l91.l;
        if (yeVar instanceof al1) {
            al1Var = (al1) yeVar;
            int i = al1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                al1Var.l = i - Integer.MIN_VALUE;
            } else {
                al1Var = new al1(yeVar);
            }
        }
        al1 al1Var2 = al1Var;
        Object objD = al1Var2.k;
        int i2 = al1Var2.l;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    xc.G(objD);
                    l81 l81Var = (l81) e81Var.a.get(0);
                    int i4 = e81Var.e & 1;
                    wt wtVar = wt.e;
                    if (i4 != 0) {
                        long j = l81Var.c;
                        ry1 ry1Var = (ry1) go1Var2.d;
                        jo0 jo0Var2 = ry1Var.d;
                        if (jo0Var2 == null || jo0Var2.d() == null || !ry1Var.k()) {
                            z2 = false;
                        } else {
                            ry1Var.s = -1;
                            o80 o80Var = ry1Var.k;
                            if (o80Var != null) {
                                o80.a(o80Var);
                            }
                            go1Var2.c(ry1Var.n(), j, false, l91.l);
                            z2 = true;
                        }
                        if (z2) {
                            l81Var.a();
                            long j2 = l81Var.a;
                            n nVar = new n(25, go1Var2);
                            al1Var2.h = ev1Var2;
                            al1Var2.i = go1Var2;
                            al1Var2.l = 1;
                            objD = s00.d(ev1Var2, j2, nVar, al1Var2);
                            if (objD == wtVar) {
                                return wtVar;
                            }
                            if (((Boolean) objD).booleanValue()) {
                            }
                        }
                    } else {
                        int i5 = g6Var.a;
                        if (i5 != 1) {
                            ycVar = i5 != 2 ? l91.n : l91.m;
                        } else {
                            ycVar = ycVar2;
                        }
                        long j3 = l81Var.c;
                        ry1 ry1Var2 = (ry1) go1Var2.d;
                        if (!ry1Var2.k() || ry1Var2.n().a.f.length() == 0 || (jo0Var = ry1Var2.d) == null || jo0Var.d() == null) {
                            z = false;
                        } else {
                            o80 o80Var2 = ry1Var2.k;
                            if (o80Var2 != null) {
                                o80.a(o80Var2);
                            }
                            ry1Var2.n = j3;
                            ry1Var2.s = -1;
                            ry1Var2.h(true);
                            long jC = go1Var2.c(ry1Var2.n(), ry1Var2.n, true, ycVar);
                            if (i5 >= 2) {
                                go1Var2.b = true;
                                go1Var2.c = new wz1(jC);
                            }
                            z = true;
                        }
                        if (z) {
                            vc1Var = new vc1();
                            vc1Var.e = !ycVar.equals(ycVar2);
                            long j4 = l81Var.a;
                            kf kfVar = new kf(go1Var2, ycVar, vc1Var, 13);
                            al1Var2.h = ev1Var2;
                            al1Var2.i = go1Var2;
                            al1Var2.j = vc1Var;
                            al1Var2.l = 2;
                            objD = s00.d(ev1Var2, j4, kfVar, al1Var2);
                        }
                    }
                } else if (i2 == 1) {
                    go1Var2 = al1Var2.i;
                    ev1Var2 = al1Var2.h;
                    xc.G(objD);
                    if (((Boolean) objD).booleanValue()) {
                        List list = ev1Var2.j.w.a;
                        int size = list.size();
                        while (i3 < size) {
                            l81 l81Var2 = (l81) list.get(i3);
                            if (lk.s(l81Var2)) {
                                l81Var2.a();
                            }
                            i3++;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vc1 vc1Var2 = al1Var2.j;
                    go1Var2 = al1Var2.i;
                    ev1 ev1Var3 = al1Var2.h;
                    xc.G(objD);
                    vc1Var = vc1Var2;
                    ev1Var2 = ev1Var3;
                    if (((Boolean) objD).booleanValue() && vc1Var.e) {
                        List list2 = ev1Var2.j.w.a;
                        int size2 = list2.size();
                        while (i3 < size2) {
                            l81 l81Var3 = (l81) list2.get(i3);
                            if (lk.s(l81Var3)) {
                                l81Var3.a();
                            }
                            i3++;
                        }
                    }
                    go1Var2.b();
                }
                return t32.a;
            } finally {
            }
        } finally {
        }
    }

    public static final boolean z(int i, o9 o9Var, w80 w80Var, pc1 pc1Var) {
        w80 w80VarP;
        iy0 iy0Var = new iy0(new w80[16]);
        if (!w80Var.e.r) {
            ng0.b("visitChildren called on an unattached node");
        }
        iy0 iy0Var2 = new iy0(new sv0[16]);
        sv0 sv0Var = w80Var.e;
        sv0 sv0Var2 = sv0Var.j;
        if (sv0Var2 == null) {
            bl.h(iy0Var2, sv0Var);
        } else {
            iy0Var2.b(sv0Var2);
        }
        while (true) {
            int i2 = iy0Var2.g;
            if (i2 == 0) {
                break;
            }
            sv0 sv0VarK = (sv0) iy0Var2.k(i2 - 1);
            if ((sv0VarK.h & 1024) == 0) {
                bl.h(iy0Var2, sv0VarK);
            } else {
                while (true) {
                    if (sv0VarK == null) {
                        break;
                    }
                    if ((sv0VarK.g & 1024) != 0) {
                        iy0 iy0Var3 = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof w80) {
                                w80 w80Var2 = (w80) sv0VarK;
                                if (w80Var2.r) {
                                    iy0Var.b(w80Var2);
                                }
                            } else if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                int i3 = 0;
                                for (sv0 sv0Var3 = ((yw) sv0VarK).t; sv0Var3 != null; sv0Var3 = sv0Var3.j) {
                                    if ((sv0Var3.g & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            sv0VarK = sv0Var3;
                                        } else {
                                            if (iy0Var3 == null) {
                                                iy0Var3 = new iy0(new sv0[16]);
                                            }
                                            if (sv0VarK != null) {
                                                iy0Var3.b(sv0VarK);
                                                sv0VarK = null;
                                            }
                                            iy0Var3.b(sv0Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var3);
                        }
                    } else {
                        sv0VarK = sv0VarK.j;
                    }
                }
            }
        }
        while (iy0Var.g != 0 && (w80VarP = p(iy0Var, pc1Var, i)) != null) {
            if (w80VarP.N0().a) {
                return ((Boolean) o9Var.i(w80VarP)).booleanValue();
            }
            if (r(i, o9Var, w80VarP, pc1Var)) {
                return true;
            }
            iy0Var.j(w80VarP);
        }
        return false;
    }

    public abstract void B(boolean z);

    public abstract void C(boolean z);
}
