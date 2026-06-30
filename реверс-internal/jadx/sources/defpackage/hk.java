package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class hk {
    public static ye0 a;

    public static Set A() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int B(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final Object C(pu0 pu0Var) {
        Object objI = pu0Var.i();
        el0 el0Var = objI instanceof el0 ? (el0) objI : null;
        if (el0Var != null) {
            return el0Var.s;
        }
        return null;
    }

    public static final float D(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float E(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean F(w80 w80Var) {
        ql0 ql0Var;
        c01 c01Var;
        ql0 ql0Var2;
        c01 c01Var2 = w80Var.l;
        return (c01Var2 == null || (ql0Var = c01Var2.w) == null || !ql0Var.K() || (c01Var = w80Var.l) == null || (ql0Var2 = c01Var.w) == null || !ql0Var2.J()) ? false : true;
    }

    public static List G(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List H(Object... objArr) {
        if (objArr.length <= 0) {
            return f40.e;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final long I(long j, long j2) {
        return z60.a(D(j) - D(j2), E(j) - E(j2));
    }

    public static lt J(jt jtVar, kt ktVar) {
        ktVar.getClass();
        return xi0.o(jtVar.getKey(), ktVar) ? d40.e : jtVar;
    }

    public static ArrayList K(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ed(objArr));
    }

    public static lt L(jt jtVar, lt ltVar) {
        ltVar.getClass();
        return ltVar == d40.e ? jtVar : (lt) ltVar.q(new pc(16, (byte) 0), jtVar);
    }

    public static final long M(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long N(long j, long j2) {
        return z60.a(D(j2) + D(j), E(j2) + E(j));
    }

    public static final void O(int i, int i2) {
        if (i2 < 0) {
            yc.p(s91.h(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            yc.o(s91.k("toIndex (", i2, ") is greater than size (", i, ")."));
        }
    }

    public static jv0 P(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    jv0 jv0Var = new jv0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    jv0Var.h = byteBufferDuplicate;
                    jv0Var.e = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    jv0Var.f = i6;
                    jv0Var.g = ((ByteBuffer) jv0Var.h).getShort(i6);
                    return jv0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final Object Q(Object obj) {
        return obj instanceof on ? xc.p(((on) obj).a) : obj;
    }

    public static final void R(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long S(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final String T(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + "@" + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final int U(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static void V() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final long W(float f, long j) {
        return z60.a(D(j) * f, E(j) * f);
    }

    public static final String X(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static kx a() {
        return new kx(1.0f, 1.0f);
    }

    public static final void b(g41 g41Var, tv0 tv0Var, wr wrVar, ob0 ob0Var, int i) {
        uf ufVar = v20.j;
        ob0Var.X(1142754848);
        int i2 = (ob0Var.f(ufVar) ? 2048 : 1024) | (ob0Var.h(g41Var) ? 4 : 2) | i | (ob0Var.c(1.0f) ? 131072 : 65536) | (ob0Var.f(null) ? 1048576 : 524288);
        if (ob0Var.N(i2 & 1, (599187 & i2) != 599186)) {
            ob0Var.W(1899381698);
            ob0Var.p(false);
            tv0 tv0VarE = nu0.E(xk.i(tv0Var.c(qv0.a)), g41Var, wrVar, null, 2);
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = n5.g;
                ob0Var.f0(objK);
            }
            uu0 uu0Var = (uu0) objK;
            int iHashCode = Long.hashCode(ob0Var.T);
            tv0 tv0VarP = bk.P(ob0Var, tv0VarE);
            b61 b61VarL = ob0Var.l();
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
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new o8(g41Var, tv0Var, wrVar, i);
        }
    }

    public static final void c(f6 f6Var, tv0 tv0Var, wr wrVar, ob0 ob0Var) {
        boolean zF = ob0Var.f(f6Var);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            Bitmap bitmap = f6Var.a;
            vf vfVar = new vf(f6Var, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
            vfVar.g = 1;
            ob0Var.f0(vfVar);
            objK = vfVar;
        }
        b((vf) objK, tv0Var, wrVar, ob0Var, 25016);
    }

    public static final long d(int i) {
        long j = ((long) i) << 32;
        int i2 = ek0.O;
        return j;
    }

    public static final void e(Object obj, int i, ym0 ym0Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(872548579);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(ym0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.h(joVar) ? 2048 : 1024;
        }
        if (ob0Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = ob0Var.f(obj) | ob0Var.f(ym0Var);
            Object objK = ob0Var.K();
            Object obj2 = kp.a;
            if (zF || objK == obj2) {
                objK = new xm0(obj, ym0Var);
                ob0Var.f0(objK);
            }
            xm0 xm0Var = (xm0) objK;
            xm0Var.c = i;
            v41 v41Var = xm0Var.g;
            nb1 nb1Var = u61.a;
            xm0 xm0Var2 = (xm0) ob0Var.j(nb1Var);
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            try {
                if (xm0Var2 != ((xm0) v41Var.getValue())) {
                    v41Var.setValue(xm0Var2);
                    if (xm0Var.d > 0) {
                        xm0 xm0Var3 = xm0Var.e;
                        if (xm0Var3 != null) {
                            xm0Var3.b();
                        }
                        if (xm0Var2 != null) {
                            xm0Var2.a();
                        } else {
                            xm0Var2 = null;
                        }
                        xm0Var.e = xm0Var2;
                    }
                }
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                boolean zF2 = ob0Var.f(xm0Var);
                Object objK2 = ob0Var.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new n(14, xm0Var);
                    ob0Var.f0(objK2);
                }
                wi0.c(xm0Var, (sa0) objK2, ob0Var);
                lk.i(nb1Var.a(xm0Var), joVar, ob0Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                throw th;
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ij(obj, i, ym0Var, joVar, i2, 1);
        }
    }

    public static final boolean f(a00 a00Var, long j) {
        if (!a00Var.e.r) {
            return false;
        }
        tg0 tg0Var = bl.P(a00Var).I.c;
        if (!tg0Var.Z.r) {
            return false;
        }
        long jM = tg0Var.M(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM & 4294967295L));
        long j2 = a00Var.u;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(List list, tu tuVar, ls lsVar) throws Throwable {
        mu muVar;
        List list2;
        zc1 zc1Var;
        Iterator it;
        Throwable th;
        if (lsVar instanceof mu) {
            muVar = (mu) lsVar;
            int i = muVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                muVar.k = i - Integer.MIN_VALUE;
            } else {
                muVar = new mu(lsVar);
            }
        }
        Object obj = muVar.j;
        int i2 = muVar.k;
        ks ksVar = null;
        Object obj2 = wt.e;
        if (i2 == 0) {
            xc.G(obj);
            ArrayList arrayList = new ArrayList();
            l6 l6Var = new l6(list, arrayList, ksVar, 5);
            muVar.h = arrayList;
            muVar.k = 1;
            if (tuVar.a(l6Var, muVar) == obj2) {
                return obj2;
            }
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = muVar.i;
                zc1Var = (zc1) muVar.h;
                try {
                    xc.G(obj);
                } catch (Throwable th2) {
                    Object obj3 = zc1Var.e;
                    if (obj3 == null) {
                        zc1Var.e = th2;
                    } else {
                        al.h((Throwable) obj3, th2);
                    }
                }
                while (it.hasNext()) {
                    sa0 sa0Var = (sa0) it.next();
                    muVar.h = zc1Var;
                    muVar.i = it;
                    muVar.k = 2;
                    if (sa0Var.i(muVar) == obj2) {
                        return obj2;
                    }
                }
                th = (Throwable) zc1Var.e;
                if (th != null) {
                    return t32.a;
                }
                throw th;
            }
            list2 = (List) muVar.h;
            xc.G(obj);
        }
        zc1Var = new zc1();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) zc1Var.e;
        if (th != null) {
        }
    }

    public static final String h(Object[] objArr, int i, int i2, c0 c0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == c0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int i(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    public static ArrayList j(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ed(objArr));
    }

    public static aq0 k(aq0 aq0Var) {
        aq0Var.g();
        aq0Var.g = true;
        return aq0Var.f > 0 ? aq0Var : aq0.h;
    }

    public static tv0 l(tv0 tv0Var) {
        return tv0Var.c(new jk(new p1(6)));
    }

    public static bk m(int i) {
        return i != 0 ? i != 1 ? new ng1() : new ku() : new ng1();
    }

    public static aq0 n() {
        return new aq0(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object o(vp vpVar, nb1 nb1Var) {
        if (!((sv0) vpVar).e.r) {
            ng0.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        b61 b61Var = (b61) bl.P(vpVar).E;
        b61Var.getClass();
        return xk.I(b61Var, nb1Var);
    }

    public static final long p(float f, long j) {
        return z60.a(D(j) / f, E(j) / f);
    }

    public static final float q(long j, long j2) {
        return (E(j2) * E(j)) + (D(j2) * D(j));
    }

    public static final Object r(y41 y41Var, wa0 wa0Var, ls lsVar) {
        return y41Var.g(new h91(wa0Var, null, 1), lsVar);
    }

    public static final w80 s(w80 w80Var) {
        w80 w80VarF = ((m80) ((h4) bl.Q(w80Var)).getFocusOwner()).f();
        if (w80VarF == null || !w80VarF.r) {
            return null;
        }
        return w80VarF;
    }

    public static final pc1 t(w80 w80Var) {
        c01 c01Var;
        if (w80Var.r && (c01Var = w80Var.l) != null) {
            zk0 zk0VarW = al.w(c01Var);
            if (!zk0VarW.B()) {
                zk0VarW = null;
            }
            if (zk0VarW != null) {
                return w80Var.O0(zk0VarW);
            }
        }
        return pc1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cc, code lost:
    
        r2 = r1[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d5, code lost:
    
        if (r2 > 100.01d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01db, code lost:
    
        if (r1[1] > 100.01d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e1, code lost:
    
        if (r1[2] <= 100.01d) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e4, code lost:
    
        r1 = (defpackage.pv.h(r1[2]) & 255) | ((((defpackage.pv.h(r2) & 255) << 16) | (-16777216)) | ((defpackage.pv.h(r1[1]) & 255) << 8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ld0 u(double d, double d2, double d3) {
        int iH;
        int iH2;
        int iH3;
        int i;
        double d4;
        double d5;
        int i2;
        double[] dArr;
        int iCeil;
        double dFloor;
        double d6;
        double[] dArr2;
        double[] dArr3;
        double[] dArr4 = u4.X;
        double d7 = d % 360.0d;
        if (d7 < 0.0d) {
            d7 += 360.0d;
        }
        if (d2 >= 1.0E-4d && d3 >= 1.0E-4d && d3 <= 99.9999d) {
            double d8 = (d7 / 180.0d) * 3.141592653589793d;
            double d9 = (d3 + 16.0d) / 116.0d;
            double d10 = d9 * d9 * d9;
            if (d10 <= 0.008856451679035631d) {
                d10 = ((116.0d * d9) - 16.0d) / 903.2962962962963d;
            }
            double d11 = d10 * 100.0d;
            double dSqrt = Math.sqrt(d11) * 11.0d;
            x62 x62Var = x62.k;
            double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, x62Var.a), 0.73d);
            double dCos = (Math.cos(d8 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * x62Var.f * x62Var.d;
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d8);
            int i3 = 0;
            while (true) {
                i = 8;
                if (i3 >= 5) {
                    d4 = d8;
                    d5 = d11;
                    i2 = 1;
                    dArr = dArr4;
                    break;
                }
                d5 = d11;
                double d12 = dSqrt / 100.0d;
                dArr = dArr4;
                double d13 = dPow;
                double dPow2 = Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / Math.sqrt(d12)) * dPow, 1.1111111111111112d);
                d4 = d8;
                double dPow3 = (Math.pow(d12, (1.0d / x62Var.e) / x62Var.j) * x62Var.b) / x62Var.c;
                double d14 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((108.0d * dPow2) * dSin) + (((11.0d * dPow2) * dCos2) + (23.0d * dCos)));
                double d15 = d14 * dCos2;
                double d16 = d14 * dSin;
                double d17 = dPow3 * 460.0d;
                i2 = 1;
                double[] dArrG = al.G(new double[]{u4.l(((288.0d * d16) + ((451.0d * d15) + d17)) / 1403.0d), u4.l(((d17 - (891.0d * d15)) - (261.0d * d16)) / 1403.0d), u4.l(((d17 - (d15 * 220.0d)) - (d16 * 6300.0d)) / 1403.0d)}, u4.W);
                double d18 = dArrG[0];
                if (d18 < 0.0d) {
                    break;
                }
                double d19 = dArrG[1];
                if (d19 < 0.0d) {
                    break;
                }
                double d20 = dArrG[2];
                if (d20 < 0.0d) {
                    break;
                }
                double d21 = (dArr[2] * d20) + (dArr[1] * d19) + (dArr[0] * d18);
                if (d21 <= 0.0d) {
                    break;
                }
                if (i3 == 4) {
                    break;
                }
                double d22 = d21 - d5;
                if (Math.abs(d22) < 0.002d) {
                    break;
                }
                dSqrt -= (d22 * dSqrt) / (d21 * 2.0d);
                i3++;
                dArr4 = dArr;
                d11 = d5;
                dPow = d13;
                d8 = d4;
            }
            iH3 = 0;
            if (iH3 == 0) {
                double[] dArr5 = new double[3];
                double d23 = -1.0d;
                dArr5[0] = -1.0d;
                dArr5[i2] = -1.0d;
                dArr5[2] = -1.0d;
                double[] dArr6 = dArr5;
                double d24 = 0.0d;
                double d25 = 0.0d;
                boolean z = false;
                int i4 = 0;
                int i5 = i2;
                while (i4 < 12) {
                    double d26 = dArr[0];
                    double d27 = dArr[i2];
                    double d28 = dArr[2];
                    double d29 = i4 % 4 <= i2 ? 0.0d : 100.0d;
                    double d30 = i4 % 2 == 0 ? 0.0d : 100.0d;
                    if (i4 < 4) {
                        double d31 = ((d5 - (d27 * d29)) - (d28 * d30)) / d26;
                        if (u4.m(d31)) {
                            d6 = d23;
                            dArr2 = new double[]{d31, d29, d30};
                        } else {
                            d6 = d23;
                            dArr2 = new double[]{d6, d6, d6};
                        }
                    } else {
                        d6 = d23;
                        if (i4 < i) {
                            double d32 = ((d5 - (d26 * d30)) - (d28 * d29)) / d27;
                            if (u4.m(d32)) {
                                dArr3 = new double[]{d30, d32, d29};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{d6, d6, d6};
                            }
                        } else {
                            double d33 = ((d5 - (d26 * d29)) - (d27 * d30)) / d28;
                            if (u4.m(d33)) {
                                dArr3 = new double[]{d29, d30, d33};
                                dArr2 = dArr3;
                            } else {
                                dArr2 = new double[]{d6, d6, d6};
                            }
                        }
                    }
                    if (dArr2[0] >= 0.0d) {
                        double dJ = u4.j(dArr2);
                        if (!z) {
                            dArr5 = dArr2;
                            dArr6 = dArr5;
                            d24 = dJ;
                            d25 = d24;
                            z = true;
                        } else if (i5 != 0 || u4.e(d24, dJ, d25)) {
                            double d34 = d24;
                            double d35 = d4;
                            d24 = d34;
                            d4 = d35;
                            if (u4.e(d34, d35, dJ)) {
                                dArr6 = dArr2;
                                d25 = dJ;
                            } else {
                                dArr5 = dArr2;
                                d24 = dJ;
                            }
                            i5 = 0;
                        }
                    }
                    i4++;
                    d23 = d6;
                    i = 8;
                    i2 = 1;
                }
                double[][] dArr7 = {dArr5, dArr6};
                double[] dArr8 = dArr7[0];
                double dJ2 = u4.j(dArr8);
                double[] dArr9 = dArr7[1];
                for (int i6 = 0; i6 < 3; i6++) {
                    double d36 = dArr8[i6];
                    double d37 = dArr9[i6];
                    if (d36 != d37) {
                        if (d36 < d37) {
                            iCeil = (int) Math.floor(u4.v(d36) - 0.5d);
                            dFloor = Math.ceil(u4.v(dArr9[i6]) - 0.5d);
                        } else {
                            iCeil = (int) Math.ceil(u4.v(d36) - 0.5d);
                            dFloor = Math.floor(u4.v(dArr9[i6]) - 0.5d);
                        }
                        int i7 = (int) dFloor;
                        for (int i8 = 0; i8 < 8 && Math.abs(i7 - iCeil) > 1; i8++) {
                            int iFloor = (int) Math.floor(((double) (iCeil + i7)) / 2.0d);
                            double d38 = u4.Y[iFloor];
                            double d39 = dArr8[i6];
                            double d40 = (d38 - d39) / (dArr9[i6] - d39);
                            double d41 = dArr8[0];
                            double d42 = ((dArr9[0] - d41) * d40) + d41;
                            double d43 = dArr8[1];
                            double d44 = ((dArr9[1] - d43) * d40) + d43;
                            double d45 = dArr8[2];
                            double[] dArr10 = {d42, d44, ((dArr9[2] - d45) * d40) + d45};
                            double dJ3 = u4.j(dArr10);
                            double d46 = dJ2;
                            if (u4.e(d46, d4, dJ3)) {
                                i7 = iFloor;
                                dArr9 = dArr10;
                                dJ2 = d46;
                            } else {
                                iCeil = iFloor;
                                dArr8 = dArr10;
                                dJ2 = dJ3;
                            }
                        }
                        dJ2 = dJ2;
                    }
                }
                double[] dArr11 = {(dArr8[0] + dArr9[0]) / 2.0d, (dArr8[1] + dArr9[1]) / 2.0d, (dArr8[2] + dArr9[2]) / 2.0d};
                iH2 = ((pv.h(dArr11[0]) & 255) << 16) | (-16777216) | ((pv.h(dArr11[1]) & 255) << 8);
                iH = pv.h(dArr11[2]) & 255;
            }
            return new ld0(iH3);
        }
        iH = pv.h(pv.J(d3)) & 255;
        iH2 = (iH << 16) | (-16777216) | (iH << 8);
        iH3 = iH | iH2;
        return new ld0(iH3);
    }

    public static jt v(jt jtVar, kt ktVar) {
        ktVar.getClass();
        if (xi0.o(jtVar.getKey(), ktVar)) {
            return jtVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w80 w(w80 w80Var) {
        boolean z = w80Var.e.r;
        if (z) {
            if (!z) {
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
            loop0: while (true) {
                int i = iy0Var.g;
                if (i == 0) {
                    break;
                }
                sv0 sv0VarK = (sv0) iy0Var.k(i - 1);
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
                                    if (w80Var2.e.r) {
                                        int iOrdinal = w80Var2.Q0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            break loop0;
                                        }
                                        if (iOrdinal != 3) {
                                            ez1.a();
                                            return null;
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
                                    if (i2 == 1) {
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
        }
        return null;
    }

    public static final long y(f20 f20Var, h20 h20Var) {
        h20Var.getClass();
        sa0 sa0Var = f20Var.j;
        HashMap map = f20Var.k;
        ld0 ld0VarE = (ld0) map.get(h20Var);
        if (ld0VarE == null) {
            ld0VarE = (h20Var.l == hm.f ? u4.g : u4.f).e(f20Var, h20Var);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(h20Var, ld0VarE);
        }
        int iA = ld0VarE.a;
        Double d = sa0Var != null ? (Double) sa0Var.i(h20Var) : null;
        if (sa0Var != null && d != null) {
            iA = (iA & 16777215) | (lk.A((int) Math.rint(d.doubleValue() * 255.0d), 0, 255) << 24);
        }
        return lk.f(iA);
    }

    public static final float z(long j) {
        return (float) Math.sqrt((E(j) * E(j)) + (D(j) * D(j)));
    }

    public abstract pc1 x();
}
