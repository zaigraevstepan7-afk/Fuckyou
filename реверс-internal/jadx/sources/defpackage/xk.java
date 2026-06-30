package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.widget.EdgeEffect;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class xk {
    public static ye0 a;
    public static ye0 b;

    public static final float A(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int B(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static double C(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dJ = pv.J(d);
        double d3 = ((dJ + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dH = H(d3, dJ);
        double dAbs = Math.abs(dH - d2);
        if (dH < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dU = ((pv.u(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dU < 0.0d || dU > 100.0d) {
            return -1.0d;
        }
        return dU;
    }

    public static float D(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return l20.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static tv0 E(tv0 tv0Var, d7 d7Var) {
        return tv0Var.c(new h81(d7Var));
    }

    public static final void F(mp1 mp1Var, vc vcVar, int i) {
        while (true) {
            int i2 = mp1Var.v;
            if (i > i2 && i < mp1Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            mp1Var.M();
            if (mp1Var.y(mp1Var.v)) {
                vcVar.q();
            }
            mp1Var.j();
        }
    }

    public static double G(double d, double d2) {
        double d3 = (d + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d5 = d4 * 100.0d;
        double d6 = (d2 + 16.0d) / 116.0d;
        double d7 = d6 * d6 * d6;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((116.0d * d6) - 16.0d) / 903.2962962962963d;
        }
        return H(d5, d7 * 100.0d);
    }

    public static double H(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    public static final Object I(b61 b61Var, nb1 nb1Var) {
        nb1Var.getClass();
        Object objB = b61Var.get(nb1Var);
        if (objB == null) {
            objB = nb1Var.b();
        }
        return ((s42) objB).a(b61Var);
    }

    public static byte[] J(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                yc.l(s91.i("Not enough bytes to read: ", i));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] K(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long L(InputStream inputStream, int i) {
        byte[] bArrJ = J(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrJ[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final mb0 M(ob0 ob0Var) {
        ob0 ob0Var2;
        ob0Var.T(206, mp.e);
        if (ob0Var.S) {
            mp1.z(ob0Var.I);
        }
        Object objC = ob0Var.C();
        sb0 te1Var = objC instanceof sb0 ? (sb0) objC : null;
        if (te1Var == null) {
            ob0Var2 = ob0Var;
            te1Var = new te1(new lb0(new mb0(ob0Var2, ob0Var.T, ob0Var.q, ob0Var.C, ob0Var.h.x)), -1);
            ob0Var2.g0(te1Var);
        } else {
            ob0Var2 = ob0Var;
        }
        id1 id1Var = te1Var.a;
        id1Var.getClass();
        mb0 mb0Var = ((lb0) id1Var).e;
        mb0Var.f.setValue(ob0Var2.l());
        ob0Var2.p(false);
        return mb0Var;
    }

    public static final long N(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        c20 c20Var = c20.NANOSECONDS;
        if (j4 >= 0) {
            return el.T(j3, c20Var);
        }
        c20 c20Var2 = c20.MILLISECONDS;
        if (c20Var.compareTo(c20Var2) < 0) {
            long j5 = (j / 1000000) - (j2 / 1000000);
            long j6 = (j % 1000000) - (j2 % 1000000);
            wr wrVar = z10.e;
            return z10.c(el.T(j5, c20Var2), el.T(j6, c20Var));
        }
        long jZ = z(j3);
        wr wrVar2 = z10.e;
        long j7 = ((-(jZ >> 1)) << 1) + ((long) (((int) jZ) & 1));
        int i = b20.a;
        return j7;
    }

    public static final bc1 O(y41 y41Var, js jsVar, ls1 ls1Var, Float f) {
        mj.b.getClass();
        lj ljVar = lj.a;
        n81 n81Var = new n81(5, y41Var, d40.e);
        qs1 qs1VarG = c2.g(f);
        lt ltVar = (lt) n81Var.c;
        f70 f70Var = (f70) n81Var.b;
        yt ytVar = ls1Var.equals(xn1.a) ? yt.e : yt.h;
        wa0 m6Var = new m6(ls1Var, f70Var, qs1VarG, f, null, 9);
        lt ltVarW = lk.W(jsVar, ltVar);
        jr1 yn0Var = ytVar == yt.f ? new yn0(ltVarW, m6Var) : new jr1(ltVarW, true);
        yn0Var.o0(ytVar, yn0Var, m6Var);
        return new bc1(qs1VarG, yn0Var);
    }

    public static final long P(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final b61 Q(pb1[] pb1VarArr, b61 b61Var, b61 b61Var2) {
        b61 b61Var3 = b61.h;
        a61 a61Var = new a61(b61Var3);
        a61Var.k = b61Var3;
        for (pb1 pb1Var : pb1VarArr) {
            nb1 nb1Var = pb1Var.a;
            if (pb1Var.g || !b61Var.containsKey(nb1Var)) {
                a61Var.put(nb1Var, nb1Var.d(pb1Var, (s42) b61Var2.get(nb1Var)));
            }
        }
        return a61Var.a();
    }

    public static void R(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void S(ByteArrayOutputStream byteArrayOutputStream, int i) {
        R(byteArrayOutputStream, i, 2);
    }

    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void b(final tv0 tv0Var, un0 un0Var, final e41 e41Var, final dd ddVar, sf sfVar, aw awVar, boolean z, v5 v5Var, final sa0 sa0Var, ob0 ob0Var, final int i) {
        final un0 un0Var2;
        final sf sfVar2;
        final aw awVar2;
        final boolean z2;
        final v5 v5Var2;
        v5 v5Var3;
        int i2;
        un0 un0Var3;
        boolean z3;
        aw awVar3;
        v5 v5Var4;
        ob0Var.X(53695811);
        int i3 = i | (ob0Var.f(tv0Var) ? 4 : 2) | 46861328 | (ob0Var.h(sa0Var) ? 536870912 : 268435456);
        if (ob0Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            ob0Var.S();
            if ((i & 1) == 0 || ob0Var.x()) {
                pn0 pn0Var = wn0.a;
                Object[] objArr = new Object[0];
                n81 n81Var = un0.x;
                boolean zD = ob0Var.d(0) | ob0Var.d(0);
                Object objK = ob0Var.K();
                Object obj = kp.a;
                if (zD || objK == obj) {
                    objK = new e2(16);
                    ob0Var.f0(objK);
                }
                un0 un0Var4 = (un0) kd1.y(objArr, n81Var, (ha0) objK, ob0Var, 0);
                sfVar2 = v20.q;
                float f = er1.a;
                hx hxVar = (hx) ob0Var.j(aq.h);
                boolean zC = ob0Var.c(hxVar.b());
                Object objK2 = ob0Var.K();
                if (zC || objK2 == obj) {
                    objK2 = new rv(new y41(hxVar));
                    ob0Var.f0(objK2);
                }
                rv rvVar = (rv) objK2;
                boolean zF = ob0Var.f(rvVar);
                Object objK3 = ob0Var.K();
                if (zF || objK3 == obj) {
                    objK3 = new aw(rvVar);
                    ob0Var.f0(objK3);
                }
                aw awVar4 = (aw) objK3;
                bq bqVar = s31.a;
                ob0Var.W(282942128);
                w5 w5Var = (w5) ob0Var.j(s31.a);
                if (w5Var == null) {
                    ob0Var.p(false);
                    v5Var3 = null;
                } else {
                    boolean zF2 = ob0Var.f(w5Var);
                    Object objK4 = ob0Var.K();
                    if (zF2 || objK4 == obj) {
                        Object v5Var5 = new v5(w5Var.a, w5Var.b, w5Var.c, w5Var.d);
                        ob0Var.f0(v5Var5);
                        objK4 = v5Var5;
                    }
                    v5Var3 = (v5) objK4;
                    ob0Var.p(false);
                }
                i2 = i3 & (-238551153);
                un0Var3 = un0Var4;
                z3 = true;
                awVar3 = awVar4;
                v5Var4 = v5Var3;
            } else {
                ob0Var.Q();
                sfVar2 = sfVar;
                awVar3 = awVar;
                z3 = z;
                v5Var4 = v5Var;
                i2 = i3 & (-238551153);
                un0Var3 = un0Var;
            }
            ob0Var.q();
            lk.l(tv0Var, un0Var3, e41Var, awVar3, z3, v5Var4, sfVar2, ddVar, sa0Var, ob0Var, 806907264 | (i2 & 14), 6 | ((i2 >> 18) & 7168));
            awVar2 = awVar3;
            z2 = z3;
            v5Var2 = v5Var4;
            un0Var2 = un0Var3;
        } else {
            ob0Var.Q();
            un0Var2 = un0Var;
            sfVar2 = sfVar;
            awVar2 = awVar;
            z2 = z;
            v5Var2 = v5Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(un0Var2, e41Var, ddVar, sfVar2, awVar2, z2, v5Var2, sa0Var, i) { // from class: im0
                public final /* synthetic */ un0 f;
                public final /* synthetic */ e41 g;
                public final /* synthetic */ dd h;
                public final /* synthetic */ sf i;
                public final /* synthetic */ aw j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ v5 l;
                public final /* synthetic */ sa0 m;

                @Override // defpackage.wa0
                public final Object h(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iV = al.V(24961);
                    xk.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ob0) obj2, iV);
                    return t32.a;
                }
            };
        }
    }

    public static final void c(jo joVar, ob0 ob0Var, int i) {
        ob0Var.X(-709502251);
        byte b2 = 0;
        int i2 = 1;
        if (ob0Var.N(i & 1, (i & 3) != 2)) {
            nb1 nb1Var = mh1.a;
            Object obj = (jh1) ob0Var.j(nb1Var);
            ob0Var.W(1967007413);
            Object[] objArr = new Object[0];
            Object objK = ob0Var.K();
            Object obj2 = kp.a;
            if (objK == obj2) {
                objK = new e2(29);
                ob0Var.f0(objK);
            }
            ih1 ih1Var = (ih1) kd1.y(objArr, ih1.i, (ha0) objK, ob0Var, 384);
            ih1Var.g = (jh1) ob0Var.j(nb1Var);
            ob0Var.p(false);
            Object[] objArr2 = {obj};
            n81 n81Var = new n81(4, new pc(23, b2), new d(13, obj, ih1Var));
            boolean zH = ob0Var.h(obj) | ob0Var.h(ih1Var);
            Object objK2 = ob0Var.K();
            if (zH || objK2 == obj2) {
                objK2 = new f8(10, obj, ih1Var);
                ob0Var.f0(objK2);
            }
            Object obj3 = (xn0) kd1.y(objArr2, n81Var, (ha0) objK2, ob0Var, 0);
            lk.i(nb1Var.a(obj3), lk.d0(-412824043, new fi(joVar, obj3, 9), ob0Var), ob0Var, 56);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new oe0(joVar, i, i2);
        }
    }

    public static void d(mp1 mp1Var, List list, tp tpVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = mp1Var.c((jb0) list.get(i));
            int iN = mp1Var.N(mp1Var.b, mp1Var.r(iC));
            Object obj = iN < mp1Var.g(mp1Var.b, mp1Var.r(iC + 1)) ? mp1Var.c[mp1Var.h(iN)] : kp.a;
            dc1 dc1Var = obj instanceof dc1 ? (dc1) obj : null;
            if (dc1Var != null) {
                dc1Var.a = tpVar;
            }
        }
    }

    public static final bc1 e(qs1 qs1Var) {
        return new bc1(qs1Var, null);
    }

    public static f70 f(f70 f70Var, int i) {
        ph phVar;
        if (i < 0 && i != -2 && i != -1) {
            yc.e(s91.i("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        ph phVar2 = ph.e;
        if (i == -1) {
            i = 0;
            phVar = ph.f;
        } else {
            phVar = phVar2;
        }
        if (f70Var instanceof ib0) {
            return ib0.i((ib0) f70Var, null, i, phVar, 1);
        }
        d40 d40Var = (2 & 2) != 0 ? d40.e : null;
        if ((2 & 4) != 0) {
            i = -3;
        }
        if ((2 & 8) == 0) {
            phVar2 = phVar;
        }
        return new rj(f70Var, d40Var, i, phVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable g(f70 f70Var, g70 g70Var, ls lsVar) throws Throwable {
        m70 m70Var;
        zc1 zc1Var;
        CancellationException cancellationExceptionP;
        if (lsVar instanceof m70) {
            m70Var = (m70) lsVar;
            int i = m70Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                m70Var.j = i - Integer.MIN_VALUE;
            } else {
                m70Var = new m70(lsVar);
            }
        }
        Object obj = m70Var.i;
        int i2 = m70Var.j;
        if (i2 == 0) {
            xc.G(obj);
            zc1 zc1Var2 = new zc1();
            try {
                g70 gzVar = new gz(g70Var, zc1Var2);
                m70Var.h = zc1Var2;
                m70Var.j = 1;
                Object objC = f70Var.c(gzVar, m70Var);
                wt wtVar = wt.e;
                if (objC == wtVar) {
                    return wtVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                zc1Var = zc1Var2;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zc1Var = m70Var.h;
            try {
                xc.G(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) zc1Var.e;
        if (th3 == null || !th3.equals(th)) {
            lt ltVar = m70Var.f;
            ltVar.getClass();
            oj0 oj0Var = (oj0) ltVar.l(v20.O);
            if (oj0Var == null || !oj0Var.isCancelled() || (cancellationExceptionP = oj0Var.p()) == null || !cancellationExceptionP.equals(th)) {
                if (th3 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    al.h(th3, th);
                    throw th3;
                }
                al.h(th, th3);
                throw th;
            }
        }
        throw th;
    }

    public static final tv0 h(tv0 tv0Var, ym1 ym1Var) {
        return c2.n(tv0Var, 0.0f, 0.0f, ym1Var, true, 1042431);
    }

    public static final tv0 i(tv0 tv0Var) {
        return c2.n(tv0Var, 0.0f, 0.0f, null, true, 1044479);
    }

    public static byte[] j(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static m90 k(Context context) {
        ProviderInfo providerInfo;
        k90 k90Var;
        ApplicationInfo applicationInfo;
        int i = 4;
        wr wvVar = Build.VERSION.SDK_INT >= 28 ? new wv(i) : new wr(i);
        PackageManager packageManager = context.getPackageManager();
        bk.n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            k90Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrN = wvVar.n(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrN) {
                    arrayList.add(signature.toByteArray());
                }
                k90Var = new k90(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                k90Var = null;
            }
        }
        if (k90Var == null) {
            return null;
        }
        return new m90(new l90(context, k90Var));
    }

    public static o62 l(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (o62) objNewInstance;
            } catch (IllegalAccessException e) {
                yc.i("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                yc.i("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            yc.i("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static double m(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dJ = pv.J(d);
        double d3 = ((dJ + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dH = H(dJ, d3);
        double dAbs = Math.abs(dH - d2);
        if (dH < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dU = ((pv.u(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dU < 0.0d || dU > 100.0d) {
            return -1.0d;
        }
        return dU;
    }

    public static final f70 n(f70 f70Var) {
        return ((f70Var instanceof os1) || (f70Var instanceof hz)) ? f70Var : new hz(f70Var);
    }

    public static final void o(p10 p10Var, nc0 nc0Var) {
        long j;
        Canvas canvas;
        boolean z;
        boolean z2;
        Canvas canvas2;
        float f;
        cj cjVarI = p10Var.E().i();
        nc0 nc0Var2 = (nc0) p10Var.E().b;
        pc0 pc0Var = nc0Var.a;
        if (nc0Var.s) {
            return;
        }
        long j2 = nc0Var.h;
        Canvas canvasA = o3.a(cjVarI);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j3 = nc0Var.t;
            float f2 = (int) (j3 >> 32);
            float f3 = f2 - nc0Var.v;
            float f4 = (int) (j3 & 4294967295L);
            float f5 = f4 - nc0Var.w;
            long j4 = nc0Var.u;
            float f6 = f2 + ((int) (j4 >> 32)) + nc0Var.x;
            float f7 = f4 + ((int) (j4 & 4294967295L)) + nc0Var.y;
            float fA = pc0Var.a();
            wl wlVarX = pc0Var.x();
            int iL = pc0Var.L();
            if (fA >= 1.0f && iL == 3 && wlVarX == null) {
                canvas2 = canvasA;
                if (pc0Var.u() != 1) {
                    canvas2.save();
                    f = f3;
                    canvasA = canvas2;
                }
                canvasA.translate(f, f5);
                Matrix matrixC = pc0Var.C();
                matrixC.preTranslate(nc0Var.v, nc0Var.w);
                canvasA.concat(matrixC);
                nc0Var.h = w01.d(nc0Var.h, (((long) Float.floatToRawIntBits(nc0Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(nc0Var.v)) << 32));
            } else {
                canvas2 = canvasA;
            }
            p6 p6VarL = nc0Var.p;
            if (p6VarL == null) {
                p6VarL = wi0.l();
                nc0Var.p = p6VarL;
            }
            p6VarL.d(fA);
            p6VarL.e(iL);
            p6VarL.g(wlVarX);
            Paint paint = p6VarL.a;
            f = f3;
            canvasA = canvas2;
            canvasA.saveLayer(f, f5, f6, f7, paint);
            canvasA.translate(f, f5);
            Matrix matrixC2 = pc0Var.C();
            matrixC2.preTranslate(nc0Var.v, nc0Var.w);
            canvasA.concat(matrixC2);
            nc0Var.h = w01.d(nc0Var.h, (((long) Float.floatToRawIntBits(nc0Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(nc0Var.v)) << 32));
        }
        nc0Var.a();
        if (!pc0Var.H()) {
            try {
                nc0Var.a.w(nc0Var.b, nc0Var.c, nc0Var, nc0Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = pc0Var.G() > 0.0f;
        if (z3) {
            cjVarI.r();
        }
        boolean z4 = !zIsHardwareAccelerated && nc0Var.A;
        if (z4) {
            cjVarI.l();
            hk hkVarD = nc0Var.d();
            if (hkVarD instanceof o31) {
                cj.k(cjVarI, ((o31) hkVarD).b);
            } else if (hkVarD instanceof p31) {
                w6 w6VarA = nc0Var.m;
                if (w6VarA != null) {
                    w6VarA.h();
                } else {
                    w6VarA = y6.a();
                    nc0Var.m = w6VarA;
                }
                w6.c(w6VarA, ((p31) hkVarD).b);
                cjVarI.s(w6VarA);
            } else {
                if (!(hkVarD instanceof n31)) {
                    ez1.a();
                    return;
                }
                cjVarI.s(((n31) hkVarD).b);
            }
        }
        if (nc0Var2 != null) {
            gk gkVar = nc0Var2.r;
            if (!gkVar.a) {
                mg0.a("Only add dependencies during a tracking");
            }
            ay0 ay0Var = (ay0) gkVar.d;
            if (ay0Var != null) {
                ay0Var.a(nc0Var);
            } else if (((nc0) gkVar.b) != null) {
                ay0 ay0Var2 = qi1.a;
                ay0 ay0Var3 = new ay0();
                nc0 nc0Var3 = (nc0) gkVar.b;
                nc0Var3.getClass();
                ay0Var3.a(nc0Var3);
                ay0Var3.a(nc0Var);
                gkVar.d = ay0Var3;
                gkVar.b = null;
            } else {
                gkVar.b = nc0Var;
            }
            ay0 ay0Var4 = (ay0) gkVar.e;
            if (ay0Var4 != null) {
                z2 = !ay0Var4.l(nc0Var);
            } else if (((nc0) gkVar.c) != nc0Var) {
                z2 = true;
            } else {
                gkVar.c = null;
                z2 = false;
            }
            if (z2) {
                nc0Var.q++;
            }
        }
        if (((n3) cjVarI).a.isHardwareAccelerated()) {
            j = j2;
            canvas = canvasA;
            z = z3;
            pc0Var.s(cjVarI);
        } else {
            ej ejVar = nc0Var.o;
            if (ejVar == null) {
                ejVar = new ej();
                nc0Var.o = ejVar;
            }
            oc ocVar = ejVar.f;
            hx hxVar = nc0Var.b;
            al0 al0Var = nc0Var.c;
            long jP = P(nc0Var.u);
            hx hxVarK = ocVar.k();
            al0 al0VarO = ocVar.o();
            canvas = canvasA;
            cj cjVarI2 = ocVar.i();
            j = j2;
            long jQ = ocVar.q();
            z = z3;
            nc0 nc0Var4 = (nc0) ocVar.b;
            ocVar.z(hxVar);
            ocVar.A(al0Var);
            ocVar.y(cjVarI);
            ocVar.B(jP);
            ocVar.b = nc0Var;
            cjVarI.l();
            try {
                nc0Var.c(ejVar);
            } finally {
                cjVarI.i();
                ocVar.z(hxVarK);
                ocVar.A(al0VarO);
                ocVar.y(cjVarI2);
                ocVar.B(jQ);
                ocVar.b = nc0Var4;
            }
        }
        if (z4) {
            cjVarI.i();
        }
        if (z) {
            cjVarI.n();
        }
        if (!zIsHardwareAccelerated) {
            canvas.restore();
        }
        nc0Var.h = j;
    }

    public static final boolean p(long j, long j2) {
        return j == j2;
    }

    public static final float q(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(f70 f70Var, wa0 wa0Var, ls lsVar) {
        w70 w70Var;
        zc1 zc1Var;
        a e;
        r70 r70Var;
        s30 s30Var = c2.t;
        if (lsVar instanceof w70) {
            w70Var = (w70) lsVar;
            int i = w70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w70Var.k = i - Integer.MIN_VALUE;
            } else {
                w70Var = new w70(lsVar);
            }
        }
        Object obj = w70Var.j;
        int i2 = w70Var.k;
        int i3 = 1;
        if (i2 == 0) {
            xc.G(obj);
            zc1 zc1Var2 = new zc1();
            zc1Var2.e = s30Var;
            r70 r70Var2 = new r70(i3, wa0Var, zc1Var2);
            try {
                w70Var.h = zc1Var2;
                w70Var.i = r70Var2;
                w70Var.k = 1;
                Object objC = f70Var.c(r70Var2, w70Var);
                Object obj2 = wt.e;
                if (objC == obj2) {
                    return obj2;
                }
                zc1Var = zc1Var2;
            } catch (a e2) {
                zc1Var = zc1Var2;
                e = e2;
                r70Var = r70Var2;
                if (e.e == r70Var) {
                    throw e;
                }
                lt ltVar = w70Var.f;
                ltVar.getClass();
                bk.t(ltVar);
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r70Var = w70Var.i;
            zc1Var = w70Var.h;
            try {
                xc.G(obj);
            } catch (a e3) {
                e = e3;
                if (e.e == r70Var) {
                }
            }
        }
        Object obj3 = zc1Var.e;
        if (obj3 != s30Var) {
            return obj3;
        }
        yc.h("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(y41 y41Var, ls lsVar) throws Throwable {
        v70 v70Var;
        zc1 zc1Var;
        a e;
        j6 j6Var;
        s30 s30Var = c2.t;
        if (lsVar instanceof v70) {
            v70Var = (v70) lsVar;
            int i = v70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v70Var.k = i - Integer.MIN_VALUE;
            } else {
                v70Var = new v70(lsVar);
            }
        }
        Object obj = v70Var.j;
        int i2 = v70Var.k;
        if (i2 == 0) {
            xc.G(obj);
            zc1Var = new zc1();
            zc1Var.e = s30Var;
            j6 j6Var2 = new j6(2, zc1Var);
            try {
                v70Var.h = zc1Var;
                v70Var.i = j6Var2;
                v70Var.k = 1;
                Object objC = y41Var.c(j6Var2, v70Var);
                Object obj2 = wt.e;
                if (objC == obj2) {
                    return obj2;
                }
            } catch (a e2) {
                e = e2;
                j6Var = j6Var2;
                if (e.e == j6Var) {
                    throw e;
                }
                lt ltVar = v70Var.f;
                ltVar.getClass();
                bk.t(ltVar);
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6Var = v70Var.i;
            zc1Var = v70Var.h;
            try {
                xc.G(obj);
            } catch (a e3) {
                e = e3;
                if (e.e == j6Var) {
                }
            }
        }
        Object obj3 = zc1Var.e;
        if (obj3 != s30Var) {
            return obj3;
        }
        yc.h("Expected at least one element");
        return null;
    }

    public static ld0 t(ld0 ld0Var) {
        ld0Var.getClass();
        double dRint = Math.rint(ld0Var.b);
        return (((90.0d > dRint ? 1 : (90.0d == dRint ? 0 : -1)) <= 0 && (dRint > 111.0d ? 1 : (dRint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(ld0Var.c) > 16.0d ? 1 : (Math.rint(ld0Var.c) == 16.0d ? 0 : -1)) > 0) && (Math.rint(ld0Var.d) < 65.0d)) ? hk.u(ld0Var.b, ld0Var.c, 70.0d) : ld0Var;
    }

    public static final Rect u(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static float v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return l20.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int w(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final ye0 x() {
        ye0 ye0Var = b;
        if (ye0Var != null) {
            return ye0Var;
        }
        xe0 xe0Var = new xe0("Rounded.PriorityHigh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = a52.a;
        long j = vl.b;
        uq1 uq1Var = new uq1(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new f51(12.0f, 19.0f));
        arrayList.add(new n51(-2.0f, 0.0f));
        arrayList.add(new j51(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
        arrayList.add(new j51(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
        xe0.a(xe0Var, arrayList, uq1Var);
        uq1 uq1Var2 = new uq1(j);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new f51(12.0f, 3.0f));
        arrayList2.add(new k51(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f));
        arrayList2.add(new r51(8.0f));
        arrayList2.add(new k51(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f));
        arrayList2.add(new p51(2.0f, -0.9f, 2.0f, -2.0f));
        arrayList2.add(new s51(5.0f));
        arrayList2.add(new k51(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f));
        arrayList2.add(b51.c);
        xe0.a(xe0Var, arrayList2, uq1Var2);
        ye0 ye0VarB = xe0Var.b();
        b = ye0VarB;
        return ye0VarB;
    }

    public static final void y(lt ltVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = qt.a.iterator();
        while (it.hasNext()) {
            try {
                ((pt) it.next()).o(ltVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    al.h(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            al.h(th, new zx(ltVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static final long z(long j) {
        if (j < 0) {
            wr wrVar = z10.e;
            return z10.g;
        }
        wr wrVar2 = z10.e;
        return z10.f;
    }
}
