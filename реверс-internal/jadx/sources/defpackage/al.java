package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EdgeEffect;
import android.window.BackEvent;
import com.reddit.secondpage.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class al {
    public static f6 a;
    public static n3 b;
    public static ej c;
    public static boolean d;
    public static Method e;

    public static final ys0 A(ys0 ys0Var) {
        ql0 ql0Var = ys0Var.w.w;
        while (true) {
            ql0 ql0VarU = ql0Var.u();
            ql0 ql0Var2 = null;
            if ((ql0VarU != null ? ql0VarU.l : null) == null) {
                ys0 ys0VarU0 = ql0Var.I.d.U0();
                ys0VarU0.getClass();
                return ys0VarU0;
            }
            ql0 ql0VarU2 = ql0Var.u();
            if (ql0VarU2 != null) {
                ql0Var2 = ql0VarU2.l;
            }
            ql0Var2.getClass();
            ql0 ql0VarU3 = ql0Var.u();
            ql0VarU3.getClass();
            ql0Var = ql0VarU3.l;
            ql0Var.getClass();
        }
    }

    public static final void B(lt ltVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (th instanceof ly) {
            th = ((ly) th).e;
        }
        try {
            pt ptVar = (pt) ltVar.l(v20.A);
            if (ptVar != null) {
                ptVar.o(ltVar, th);
            } else {
                xk.y(ltVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                h(runtimeException, th);
                th = runtimeException;
            }
            xk.y(ltVar, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(o10 o10Var) {
        if (((sv0) o10Var).e.r) {
            bl.N(o10Var, 1).d1();
        }
    }

    public static final float[] D(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static hm0 E(ha0 ha0Var) {
        l91 l91Var = l91.u;
        a42 a42Var = new a42();
        a42Var.e = ha0Var;
        a42Var.f = l91Var;
        return a42Var;
    }

    public static jv1 F(ha0 ha0Var) {
        ha0Var.getClass();
        return new jv1(ha0Var);
    }

    public static double[] G(double[] dArr, double[][] dArr2) {
        dArr.getClass();
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d7, d8, (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0])};
    }

    public static final float[] H(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] I(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static final long J(uf0 uf0Var, k31 k31Var, tf0 tf0Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = uf0Var.g;
        if (k31Var != null) {
            int i = tf0Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (k31Var == k31.f) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = w01.d(L(uf0Var, k31Var, tf0Var), j2);
        if (z || !uf0Var.i) {
            return jD;
        }
        return 0L;
    }

    public static je0 K(byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream = null;
        try {
            httpURLConnectionA = x61.a(new URL("https://interhack.shop/api/start"));
            httpURLConnectionA.setRequestMethod("POST");
            httpURLConnectionA.setDoOutput(true);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setConnectTimeout(15000);
            httpURLConnectionA.setReadTimeout(30000);
            httpURLConnectionA.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnectionA.setRequestProperty("Content-Length", String.valueOf(bArr.length));
            try {
                OutputStream outputStream = httpURLConnectionA.getOutputStream();
                try {
                    outputStream.write(bArr);
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = httpURLConnectionA.getResponseCode();
                    InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnectionA.getErrorStream() : httpURLConnectionA.getInputStream();
                    je0 je0Var = new je0(responseCode, errorStream != null ? M(errorStream) : "", httpURLConnectionA.getHeaderField("Content-Type"));
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    httpURLConnectionA.disconnect();
                    return je0Var;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                if (httpURLConnectionA == null) {
                    throw th;
                }
                httpURLConnectionA.disconnect();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionA = null;
        }
    }

    public static final long L(uf0 uf0Var, k31 k31Var, tf0 tf0Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (k31Var == null) {
            return uf0Var.c;
        }
        int i = tf0Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (uf0Var.c >> 32));
        } else {
            if (i != 2) {
                return uf0Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (uf0Var.c & 4294967295L));
        }
        if (k31Var == k31.f) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static String M(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
            }
            bufferedReader.close();
            return sb.toString();
        } finally {
        }
    }

    public static final void N(xi xiVar, ks ksVar, boolean z) {
        Object objU = xiVar.u();
        Throwable thF = xiVar.f(objU);
        Object oe1Var = thF != null ? new oe1(thF) : xiVar.h(objU);
        if (!z) {
            ksVar.g(oe1Var);
            return;
        }
        ksVar.getClass();
        my myVar = (my) ksVar;
        ls lsVar = myVar.i;
        Object obj = myVar.k;
        lt ltVarE = lsVar.e();
        Object objM = xi0.M(ltVarE, obj);
        p32 p32VarP0 = objM != xi0.b0 ? lk.p0(lsVar, ltVarE, objM) : null;
        try {
            lsVar.g(oe1Var);
            if (p32VarP0 == null || p32VarP0.q0()) {
                xi0.G(ltVarE, objM);
            }
        } catch (Throwable th) {
            if (p32VarP0 == null || p32VarP0.q0()) {
                xi0.G(ltVarE, objM);
            }
            throw th;
        }
    }

    public static final void O(f31 f31Var, int i, Object obj) {
        f31Var.h[(f31Var.i - f31Var.d[f31Var.e - 1].b) + i] = obj;
    }

    public static final void P(f31 f31Var, int i, Object obj, int i2, Object obj2) {
        int i3 = f31Var.i - f31Var.d[f31Var.e - 1].b;
        Object[] objArr = f31Var.h;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final int Q(gx0 gx0Var) {
        int iC;
        int i = gx0Var.b;
        int iC2 = gx0Var.c(0);
        while (gx0Var.b != 0 && gx0Var.c(0) == iC2) {
            int i2 = gx0Var.b;
            if (i2 == 0) {
                yc.h("IntList is empty.");
                return 0;
            }
            gx0Var.e(0, gx0Var.a[i2 - 1]);
            gx0Var.d(gx0Var.b - 1);
            int i3 = gx0Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = gx0Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = gx0Var.c(i7);
                if (i6 >= i3 || (iC = gx0Var.c(i6)) <= iC4) {
                    if (iC4 > iC3) {
                        gx0Var.e(i5, iC4);
                        gx0Var.e(i7, iC3);
                        i5 = i7;
                    }
                } else if (iC > iC3) {
                    gx0Var.e(i5, iC);
                    gx0Var.e(i6, iC3);
                    i5 = i6;
                }
            }
        }
        return iC2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wk R(hb hbVar) {
        long j;
        List list = hbVar.g;
        f40 f40Var = f40.e;
        List list2 = list == null ? f40Var : list;
        CharSequence charSequence = hbVar.f;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            qt0 qt0Var = new qt0(23, false);
            qt0Var.f = Parcel.obtain();
            if (list == null) {
                list = f40Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                gb gbVar = (gb) list.get(i);
                zq1 zq1Var = (zq1) gbVar.a;
                int i2 = gbVar.b;
                int i3 = gbVar.c;
                ((Parcel) qt0Var.f).recycle();
                qt0Var.f = Parcel.obtain();
                cz1 cz1Var = zq1Var.a;
                long j2 = zq1Var.l;
                long j3 = zq1Var.h;
                long j4 = zq1Var.b;
                List list3 = list;
                int i4 = size;
                long jB = cz1Var.b();
                SpannableString spannableString2 = spannableString;
                int i5 = i;
                long j5 = vl.g;
                if (vl.c(jB, j5)) {
                    j = j5;
                } else {
                    qt0Var.m((byte) 1);
                    j = j5;
                    ((Parcel) qt0Var.f).writeLong(zq1Var.a.b());
                }
                long j6 = g02.c;
                byte b2 = 2;
                if (!g02.a(j4, j6)) {
                    qt0Var.m((byte) 2);
                    qt0Var.o(j4);
                }
                aa0 aa0Var = zq1Var.c;
                if (aa0Var != null) {
                    qt0Var.m((byte) 3);
                    ((Parcel) qt0Var.f).writeInt(aa0Var.e);
                }
                y90 y90Var = zq1Var.d;
                if (y90Var != null) {
                    int i6 = y90Var.a;
                    qt0Var.m((byte) 4);
                    qt0Var.m((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                z90 z90Var = zq1Var.e;
                if (z90Var != null) {
                    int i7 = z90Var.a;
                    qt0Var.m((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b2 = 1;
                        } else if (i7 != 1) {
                            b2 = i7 == 2 ? (byte) 3 : (byte) 0;
                        }
                        qt0Var.m(b2);
                    }
                }
                String str = zq1Var.g;
                if (str != null) {
                    qt0Var.m((byte) 6);
                    ((Parcel) qt0Var.f).writeString(str);
                }
                if (!g02.a(j3, j6)) {
                    qt0Var.m((byte) 7);
                    qt0Var.o(j3);
                }
                df dfVar = zq1Var.i;
                if (dfVar != null) {
                    float f = dfVar.a;
                    qt0Var.m((byte) 8);
                    qt0Var.n(f);
                }
                dz1 dz1Var = zq1Var.j;
                if (dz1Var != null) {
                    qt0Var.m((byte) 9);
                    qt0Var.n(dz1Var.a);
                    qt0Var.n(dz1Var.b);
                }
                if (!vl.c(j2, j)) {
                    qt0Var.m((byte) 10);
                    ((Parcel) qt0Var.f).writeLong(j2);
                }
                ax1 ax1Var = zq1Var.m;
                if (ax1Var != null) {
                    qt0Var.m((byte) 11);
                    ((Parcel) qt0Var.f).writeInt(ax1Var.a);
                }
                um1 um1Var = zq1Var.n;
                if (um1Var != null) {
                    qt0Var.m((byte) 12);
                    ((Parcel) qt0Var.f).writeLong(um1Var.a);
                    long j7 = um1Var.b;
                    qt0Var.n(Float.intBitsToFloat((int) (j7 >> 32)));
                    qt0Var.n(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    qt0Var.n(um1Var.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) qt0Var.f).marshall(), 0)), i2, i3, 33);
                i = i5 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i4;
            }
            charSequence = spannableString;
        }
        return new wk(ClipData.newPlainText("plain text", charSequence));
    }

    public static final vy0 S(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new vy0(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static String T(long j) {
        return "PointerId(value=" + j + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [bp, zb1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList U(ip1 ip1Var, int i, Integer num) {
        ?? zb1Var = new zb1(ip1Var);
        int iQ = ip1Var.q(i);
        jb0 jb0VarA = ip1Var.a(i);
        while (i >= 0) {
            zb1Var.f(ip1Var.i(i), ip1Var.k(i) ? ip1Var.p(ip1Var.b, i) : kp.a, ip1Var.a.g(i), num);
            if (iQ >= 0) {
                jb0 jb0Var = jb0VarA;
                jb0VarA = ip1Var.a(iQ);
                i = iQ;
                iQ = ip1Var.q(iQ);
                num = jb0Var;
            } else {
                i = iQ;
                num = jb0VarA;
            }
        }
        return (ArrayList) zb1Var.a;
    }

    public static final int V(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void a(iq iqVar, int i, int i2, ha0 ha0Var, ha0 ha0Var2, ha0 ha0Var3, ha0 ha0Var4, jo joVar, tv0 tv0Var, ob0 ob0Var, int i3) {
        int i4;
        jo joVar2;
        tv0 tv0Var2;
        jo joVarD0;
        iqVar.getClass();
        ha0Var.getClass();
        ha0Var2.getClass();
        ha0Var3.getClass();
        ha0Var4.getClass();
        ob0Var.X(-1350061992);
        int i5 = 2;
        if ((i3 & 6) == 0) {
            i4 = (ob0Var.f(iqVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= ob0Var.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= ob0Var.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= ob0Var.h(ha0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= ob0Var.h(ha0Var2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= ob0Var.h(ha0Var3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= ob0Var.h(ha0Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            joVar2 = joVar;
            i4 |= ob0Var.h(joVar2) ? 8388608 : 4194304;
        } else {
            joVar2 = joVar;
        }
        int i6 = i4 | 100663296;
        int i7 = 0;
        if (ob0Var.N(i6 & 1, (38347923 & i6) != 38347922)) {
            if (iqVar.c > 0) {
                ob0Var.W(-1622526474);
                joVarD0 = lk.d0(1262284951, new gq(iqVar, i7), ob0Var);
                ob0Var.p(false);
            } else {
                ob0Var.W(-1622469682);
                ob0Var.p(false);
                joVarD0 = null;
            }
            int i8 = i6 >> 3;
            int i9 = i6 >> 9;
            sq0.g(ha0Var, kd1.z(i, i2, ob0Var, (i8 & 14) | 384 | (i8 & 112)), false, joVar2, lk.d0(1701354059, new o8(ha0Var2, ha0Var3, ha0Var4, i5), ob0Var), joVarD0, null, kd1.m(ob0Var), null, null, lk.d0(-790759084, new gq(iqVar, 1), ob0Var), ob0Var, ((i6 >> 18) & 896) | (i9 & 14) | 196608 | (i9 & 57344), 30536);
            tv0Var2 = qv0.a;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hq(iqVar, i, i2, ha0Var, ha0Var2, ha0Var3, ha0Var4, joVar, tv0Var2, i3);
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2, hx hxVar) {
        float f3 = m20.a;
        double dB = hxVar.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d2 = ((double) m20.a) * dB;
        float fExp = (float) (Math.exp((m20.b / m20.c) * Math.log(dAbs / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? pb.c(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int I = nu0.I(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(I);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(I);
        }
        return f;
    }

    public static final int c(int i, iy0 iy0Var) {
        int i2 = iy0Var.g - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = iy0Var.e;
            int i5 = ((mi0) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((mi0) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final boolean d(uf0 uf0Var) {
        return uf0Var.h && !uf0Var.d;
    }

    public static final boolean e(d02 d02Var) {
        m71 m71Var;
        a81 a81Var = d02Var.c;
        u30 u30Var = (a81Var == null || (m71Var = a81Var.b) == null) ? null : new u30(m71Var.b);
        boolean z = false;
        if (u30Var != null && u30Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static em f(em emVar) {
        h72 h72Var = xi0.r;
        if (xk.p(emVar.b, 12884901888L)) {
            cf1 cf1Var = (cf1) emVar;
            h72 h72Var2 = cf1Var.d;
            if (!o(h72Var2, h72Var)) {
                return new cf1(cf1Var.a, cf1Var.h, h72Var, H(n(l2.c.b, h72Var2.a(), h72Var.a()), cf1Var.i), cf1Var.k, cf1Var.n, cf1Var.e, cf1Var.f, cf1Var.g, -1);
            }
        }
        return emVar;
    }

    public static final void g(gx0 gx0Var, int i) {
        if (gx0Var.b == 0 || !(gx0Var.c(0) == i || gx0Var.c(gx0Var.b - 1) == i)) {
            int i2 = gx0Var.b;
            gx0Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = gx0Var.c(i3);
                if (i <= iC) {
                    break;
                }
                gx0Var.e(i2, iC);
                i2 = i3;
            }
            gx0Var.e(i2, i);
        }
    }

    public static void h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = lj0.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = e71.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(ls lsVar) {
        ww wwVar;
        if (lsVar instanceof ww) {
            wwVar = (ww) lsVar;
            int i = wwVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                wwVar.i = i - Integer.MIN_VALUE;
            } else {
                wwVar = new ww(lsVar);
            }
        }
        Object obj = wwVar.h;
        int i2 = wwVar.i;
        if (i2 == 0) {
            xc.G(obj);
            wwVar.i = 1;
            xi xiVar = new xi(1, bl.E(wwVar));
            xiVar.v();
            if (xiVar.t() == wt.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            xc.G(obj);
        }
        yc.j();
    }

    public static final pc1 j(zk0 zk0Var) {
        zk0 zk0VarJ = zk0Var.j();
        return zk0VarJ != null ? zk0VarJ.I(zk0Var, true) : new pc1(0.0f, 0.0f, (int) (zk0Var.K() >> 32), (int) (zk0Var.K() & 4294967295L));
    }

    public static final pc1 k(zk0 zk0Var, boolean z) {
        zk0 zk0VarW = w(zk0Var);
        float fK = (int) (zk0VarW.K() >> 32);
        float fK2 = (int) (zk0VarW.K() & 4294967295L);
        pc1 pc1VarI = zk0VarW.I(zk0Var, z);
        float f = pc1VarI.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fK) {
                f = fK;
            }
        }
        float f2 = pc1VarI.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fK2) {
                f2 = fK2;
            }
        }
        float f3 = pc1VarI.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fK) {
                fK = f3;
            }
            f3 = fK;
        }
        float f4 = pc1VarI.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fK2) {
                fK2 = f5;
            }
            f4 = fK2;
        }
        if (f == f3 || f2 == f4) {
            return pc1.e;
        }
        long jH = zk0VarW.h((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jH2 = zk0VarW.h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jH3 = zk0VarW.h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jH4 = zk0VarW.h((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jH3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jH4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jH3 & 4294967295L));
        return new pc1(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bp, zb1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [jb0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List l(mp1 mp1Var, Integer num, int i, Integer num2) {
        int iE;
        int iS;
        sx0 sx0Var;
        if (mp1Var.w || mp1Var.p() == 0) {
            return f40.e;
        }
        ?? zb1Var = new zb1(mp1Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = mp1Var.v;
            if (iE < 0) {
                iE = mp1Var.E(mp1Var.b, i);
            }
        }
        if (num == 0) {
            int iN = mp1Var.i - mp1Var.N(mp1Var.b, mp1Var.r(i));
            hx0 hx0Var = mp1Var.s;
            num = Integer.valueOf(iN + ((hx0Var == null || (sx0Var = (sx0) hx0Var.b(i)) == null) ? 0 : sx0Var.b));
        }
        int iR = mp1Var.r(i) * 5;
        int[] iArr = mp1Var.b;
        if (iR < iArr.length) {
            iS = mp1Var.s(i);
        } else {
            int iE2 = iE >= 0 ? mp1Var.E(iArr, iE) : iE;
            iS = mp1Var.s(iE);
            int i2 = iE;
            iE = iE2;
            i = i2;
        }
        while (i >= 0) {
            zb1Var.f(iS, (mp1Var.b[(mp1Var.r(i) * 5) + 1] & 536870912) != 0 ? mp1Var.t(i) : kp.a, mp1Var.O(i), num);
            num = mp1Var.b(i);
            if (iE >= 0) {
                int iE3 = mp1Var.E(mp1Var.b, iE);
                iS = mp1Var.s(iE);
                int i3 = iE;
                iE = iE3;
                i = i3;
            } else {
                i = iE;
            }
        }
        return (ArrayList) zb1Var.a;
    }

    public static final boolean m(uf0 uf0Var) {
        return !uf0Var.h && uf0Var.d;
    }

    public static final float[] n(float[] fArr, float[] fArr2, float[] fArr3) {
        I(fArr, fArr2);
        I(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrD = D(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return H(fArrD, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final boolean o(h72 h72Var, h72 h72Var2) {
        if (h72Var == h72Var2) {
            return true;
        }
        return Math.abs(h72Var.a - h72Var2.a) < 0.001f && Math.abs(h72Var.b - h72Var2.b) < 0.001f;
    }

    public static final boolean p(pc1 pc1Var, float f, float f2) {
        float f3 = pc1Var.a;
        if (f > pc1Var.c || f3 > f) {
            return false;
        }
        return f2 <= pc1Var.d && pc1Var.b <= f2;
    }

    public static final hr q(em emVar, em emVar2) {
        return emVar == emVar2 ? new fr(emVar, emVar, 1) : (xk.p(emVar.b, 12884901888L) && xk.p(emVar2.b, 12884901888L)) ? new gr((cf1) emVar, (cf1) emVar2) : new hr(emVar, emVar2, 0);
    }

    public static final d90 r(Context context) {
        l91 l91Var = new l91(18);
        context.getApplicationContext();
        return new d90(l91Var, new b6(Build.VERSION.SDK_INT >= 31 ? ba0.a.a(context) : 0));
    }

    public static final Object s(long j, ks ksVar) {
        if (j > 0) {
            xi xiVar = new xi(1, bl.E(ksVar));
            xiVar.v();
            if (j < Long.MAX_VALUE) {
                y(xiVar.i).d(j, xiVar);
            }
            Object objT = xiVar.t();
            if (objT == wt.e) {
                return objT;
            }
        }
        return t32.a;
    }

    public static boolean t(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = h62.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = g62.d;
            g62 g62Var = (g62) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (g62Var == null) {
                g62Var = new g62();
                g62Var.a = null;
                g62Var.b = null;
                g62Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, g62Var);
            }
            WeakReference weakReference2 = g62Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                g62Var.c = new WeakReference(keyEvent);
                if (g62Var.b == null) {
                    g62Var.b = new SparseArray();
                }
                SparseArray sparseArray = g62Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    yc.d();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.l(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ya1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [mj] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [mj] */
    /* JADX WARN: Type inference failed for: r8v3, types: [mj] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(g70 g70Var, ya1 ya1Var, boolean z, ls lsVar) throws Throwable {
        h70 h70Var;
        qh it;
        ?? r8;
        qh qhVar;
        g70 g70Var2;
        Object objB;
        if (lsVar instanceof h70) {
            h70Var = (h70) lsVar;
            int i = h70Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                h70Var.m = i - Integer.MIN_VALUE;
            } else {
                h70Var = new h70(lsVar);
            }
        }
        Object obj = h70Var.l;
        int i2 = h70Var.m;
        CancellationException cancellationException = null;
        wt wtVar = wt.e;
        try {
            if (i2 == 0) {
                xc.G(obj);
                if (g70Var instanceof s02) {
                    throw ((s02) g70Var).e;
                }
                it = ya1Var.iterator();
                ya1Var = ya1Var;
                h70Var.h = g70Var;
                h70Var.i = ya1Var;
                h70Var.j = it;
                h70Var.k = z;
                h70Var.m = 1;
                objB = it.b(h70Var);
                if (objB != wtVar) {
                }
            } else if (i2 == 1) {
                z = h70Var.k;
                qhVar = h70Var.j;
                mj mjVar = h70Var.i;
                g70Var2 = h70Var.h;
                xc.G(obj);
                r8 = mjVar;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = h70Var.k;
                qhVar = h70Var.j;
                mj mjVar2 = h70Var.i;
                g70Var2 = h70Var.h;
                xc.G(obj);
                ?? r82 = mjVar2;
                it = qhVar;
                g70Var = g70Var2;
                ya1Var = r82;
                h70Var.h = g70Var;
                h70Var.i = ya1Var;
                h70Var.j = it;
                h70Var.k = z;
                h70Var.m = 1;
                objB = it.b(h70Var);
                if (objB != wtVar) {
                    return wtVar;
                }
                g70Var2 = g70Var;
                qhVar = it;
                obj = objB;
                r8 = ya1Var;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        r8.a(null);
                    }
                    return t32.a;
                }
                Object objC = qhVar.c();
                h70Var.h = g70Var2;
                h70Var.i = r8;
                h70Var.j = qhVar;
                h70Var.k = z;
                h70Var.m = 2;
                r82 = r8;
            }
        } finally {
        }
    }

    public static final boolean v(long j, long j2) {
        return j == j2;
    }

    public static final zk0 w(zk0 zk0Var) {
        zk0 zk0Var2;
        zk0 zk0VarJ = zk0Var.j();
        while (true) {
            zk0 zk0Var3 = zk0VarJ;
            zk0Var2 = zk0Var;
            zk0Var = zk0Var3;
            if (zk0Var == null) {
                break;
            }
            zk0VarJ = zk0Var.j();
        }
        c01 c01Var = zk0Var2 instanceof c01 ? (c01) zk0Var2 : null;
        if (c01Var == null) {
            return zk0Var2;
        }
        c01 c01Var2 = c01Var.y;
        while (true) {
            c01 c01Var3 = c01Var2;
            c01 c01Var4 = c01Var;
            c01Var = c01Var3;
            if (c01Var == null) {
                return c01Var4;
            }
            c01Var2 = c01Var.y;
        }
    }

    public static final Integer x(ip1 ip1Var, op opVar, int i, int i2) {
        Integer numX;
        int[] iArr = ip1Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (ip1Var.j(i) && ip1Var.i(i) == 206 && xi0.o(ip1Var.p(iArr, i), mp.e)) {
                Object objH = ip1Var.h(i, 0);
                sb0 sb0Var = objH instanceof sb0 ? (sb0) objH : null;
                id1 id1Var = sb0Var != null ? sb0Var.a : null;
                lb0 lb0Var = id1Var instanceof lb0 ? (lb0) id1Var : null;
                if (lb0Var != null && lb0Var.e == opVar) {
                    return Integer.valueOf(i);
                }
            }
            if (ip1Var.d(i) && (numX = x(ip1Var, opVar, i + 1, i3)) != null) {
                return Integer.valueOf(numX.intValue());
            }
            i = i3;
        }
    }

    public static final vw y(lt ltVar) {
        jt jtVarL = ltVar.l(v20.z);
        vw vwVar = jtVarL instanceof vw ? (vw) jtVarL : null;
        return vwVar == null ? yv.a : vwVar;
    }

    public static final y8 z(lt ltVar) {
        y8 y8Var = (y8) ltVar.l(v20.P);
        if (y8Var != null) {
            return y8Var;
        }
        yc.l("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }
}
