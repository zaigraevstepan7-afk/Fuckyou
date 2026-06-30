package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.reddit.secondpage.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class uc1 {
    public static final float A(long j, float f, hx hxVar) {
        float fC;
        long jB = g02.b(j);
        if (h02.a(jB, 4294967296L)) {
            if (hxVar.l() <= 1.05d) {
                return hxVar.d0(j);
            }
            fC = g02.c(j) / g02.c(hxVar.m0(f));
        } else {
            if (!h02.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = g02.c(j);
        }
        return fC * f;
    }

    public static void B(sp1 sp1Var, sp1 sp1Var2, sa0 sa0Var) {
        if (sp1Var != sp1Var2) {
            sp1Var2.getClass();
            sp1.q(sp1Var);
            sp1Var2.c();
        } else if (sp1Var instanceof f22) {
            ((f22) sp1Var).r = sa0Var;
        } else if (sp1Var instanceof g22) {
            ((g22) sp1Var).h = sa0Var;
        } else {
            yc.g(sp1Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void C(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(lk.l0(j)), i, i2, 33);
        }
    }

    public static final void D(Spannable spannable, long j, hx hxVar, int i, int i2) {
        long jB = g02.b(j);
        if (h02.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(nu0.I(hxVar.d0(j)), false), i, i2, 33);
        } else if (h02.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(g02.c(j)), i, i2, 33);
        }
    }

    public static final void E(Spannable spannable, as0 as0Var, int i, int i2) {
        if (as0Var != null) {
            ArrayList arrayList = new ArrayList(ql.Y(as0Var, 10));
            Iterator it = as0Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((zr0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void F(rl1 rl1Var, int i, xi1 xi1Var) {
        rl1 rl1Var2;
        iy0 iy0Var = new iy0(new rl1[16]);
        List listI = rl1Var.i(false, false);
        while (true) {
            iy0Var.d(iy0Var.g, listI);
            while (true) {
                int i2 = iy0Var.g;
                if (i2 == 0) {
                    return;
                }
                rl1Var2 = (rl1) iy0Var.k(i2 - 1);
                boolean zY = nu0.y(rl1Var2);
                nl1 nl1Var = rl1Var2.d;
                zx0 zx0Var = nl1Var.e;
                if (!zY && !zx0Var.c(vl1.j)) {
                    c01 c01VarD = rl1Var2.d();
                    if (c01VarD == null) {
                        throw s91.g("Expected semantics node to have a coordinator.");
                    }
                    sh0 sh0VarE0 = lk.e0(al.k(c01VarD, true));
                    if (sh0VarE0.a < sh0VarE0.c && sh0VarE0.b < sh0VarE0.d) {
                        Object objG = nl1Var.e.g(ml1.e);
                        if (objG == null) {
                            objG = null;
                        }
                        wa0 wa0Var = (wa0) objG;
                        Object objG2 = zx0Var.g(vl1.w);
                        wi1 wi1Var = (wi1) (objG2 != null ? objG2 : null);
                        if (wa0Var == null || wi1Var == null || ((Number) wi1Var.b.a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = 1 + i;
                        xi1Var.i(new yi1(rl1Var2, i3, sh0VarE0, c01VarD));
                        F(rl1Var2, i3, xi1Var);
                    }
                }
            }
            listI = rl1Var2.i(false, false);
        }
    }

    public static final void a(ye0 ye0Var, long j, long j2, ob0 ob0Var, int i) {
        ob0Var.X(-884076118);
        int i2 = i | (ob0Var.f(ye0Var) ? 4 : 2) | (ob0Var.e(j) ? 32 : 16) | (ob0Var.e(j2) ? 256 : 128);
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            uu0 uu0VarD = sg.d(v20.j, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            qv0 qv0Var = qv0.a;
            tv0 tv0VarP = bk.P(ob0Var, qv0Var);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(zpVar);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP);
            tv0 tv0VarE = ko1.e(qv0Var, 72.0f);
            wr wrVar = hu0.a;
            qc1.b(ob0Var, xi0.p(tv0VarE, j, lk.m0(wr.m(), ob0Var)));
            ue0.a(ye0Var, null, ko1.e(qv0Var, 36.0f), j2, ob0Var, (i2 & 14) | 432 | ((i2 << 3) & 7168), 0);
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new da2(ye0Var, j, j2, i);
        }
    }

    public static final long b(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = u12.c;
        return jFloatToRawIntBits;
    }

    public static final void c(z2 z2Var, ha0 ha0Var, ha0 ha0Var2, ob0 ob0Var, int i) {
        z2Var.getClass();
        ha0Var.getClass();
        ob0Var.X(855978260);
        int i2 = i | (ob0Var.f(z2Var) ? 4 : 2) | (ob0Var.h(ha0Var) ? 32 : 16) | (ob0Var.h(ha0Var2) ? 256 : 128);
        int i3 = 0;
        if (!ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ob0Var.Q();
        } else if (z2Var.equals(w2.a)) {
            ob0Var.W(-2038608104);
            ob0Var.p(false);
        } else {
            boolean z = z2Var instanceof y2;
            l91 l91Var = kp.a;
            if (z) {
                ob0Var.W(-2038606417);
                ye0 ye0VarL = c2.l();
                ys1 ys1Var = mu0.b;
                long j = ((ju0) ob0Var.j(ys1Var)).a.c;
                long j2 = ((ju0) ob0Var.j(ys1Var)).a.d;
                y2 y2Var = (y2) z2Var;
                String str = y2Var.a;
                String str2 = y2Var.b;
                String str3 = y2Var.c;
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objK = ob0Var.K();
                if (z2 || objK == l91Var) {
                    objK = new aa2(z2Var, ha0Var, i3);
                    ob0Var.f0(objK);
                }
                d(ye0VarL, j, j2, str, str2, str3, (ha0) objK, ha0Var, null, ob0Var, (i2 << 18) & 29360128);
                ob0Var.p(false);
            } else if (z2Var instanceof u2) {
                ob0Var.W(-2038591182);
                ye0 ye0VarX = xk.x();
                ys1 ys1Var2 = mu0.b;
                long j3 = ((ju0) ob0Var.j(ys1Var2)).a.y;
                long j4 = ((ju0) ob0Var.j(ys1Var2)).a.z;
                u2 u2Var = (u2) z2Var;
                String str4 = u2Var.a;
                String str5 = u2Var.b;
                String str6 = u2Var.c;
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objK2 = ob0Var.K();
                if (z3 || objK2 == l91Var) {
                    objK2 = new aa2(z2Var, ha0Var, 1);
                    ob0Var.f0(objK2);
                }
                d(ye0VarX, j3, j4, str4, str5, str6, (ha0) objK2, ha0Var, null, ob0Var, (i2 << 18) & 29360128);
                ob0Var.p(false);
            } else if (z2Var instanceof x2) {
                ob0Var.W(-2038557234);
                f((x2) z2Var, ob0Var, i2 & 14);
                ob0Var.p(false);
            } else if (!(z2Var instanceof v2)) {
                ob0Var.W(-2038607725);
                ob0Var.p(false);
                ez1.a();
                return;
            } else {
                ob0Var.W(-2038555341);
                e((v2) z2Var, ha0Var2, ob0Var, (i2 & 14) | ((i2 >> 3) & 112));
                ob0Var.p(false);
            }
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new o8(z2Var, ha0Var, ha0Var2, i, 11);
        }
    }

    public static final void d(ye0 ye0Var, long j, long j2, String str, String str2, String str3, ha0 ha0Var, ha0 ha0Var2, ha0 ha0Var3, ob0 ob0Var, int i) {
        int i2;
        String str4;
        String str5;
        String str6;
        ha0 ha0Var4;
        ha0 ha0Var5;
        ha0 ha0Var6;
        ob0Var.X(-1211055699);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(ye0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str4 = str;
            i2 |= ob0Var.f(str4) ? 2048 : 1024;
        } else {
            str4 = str;
        }
        if ((i & 24576) == 0) {
            str5 = str2;
            i2 |= ob0Var.f(str5) ? 16384 : 8192;
        } else {
            str5 = str2;
        }
        if ((196608 & i) == 0) {
            str6 = str3;
            i2 |= ob0Var.f(str6) ? 131072 : 65536;
        } else {
            str6 = str3;
        }
        if ((1572864 & i) == 0) {
            ha0Var4 = ha0Var;
            i2 |= ob0Var.h(ha0Var4) ? 1048576 : 524288;
        } else {
            ha0Var4 = ha0Var;
        }
        if ((12582912 & i) == 0) {
            ha0Var5 = ha0Var2;
            i2 |= ob0Var.h(ha0Var5) ? 8388608 : 4194304;
        } else {
            ha0Var5 = ha0Var2;
        }
        int i3 = i2 | 905969664;
        if (ob0Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new e2(7);
                ob0Var.f0(objK);
            }
            ha0 ha0Var7 = (ha0) objK;
            int i4 = ((i3 >> 21) & 14) | 3072;
            t2.a(ha0Var5, null, null, lk.d0(771343975, new ea2(ye0Var, j, j2, str4, str5, ha0Var7, ha0Var4, str6), ob0Var), ob0Var, i4, 6);
            ha0Var6 = ha0Var7;
        } else {
            ob0Var.Q();
            ha0Var6 = ha0Var3;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new hi1(ye0Var, j, j2, str, str2, str3, ha0Var, ha0Var2, ha0Var6, i);
        }
    }

    public static final void e(v2 v2Var, ha0 ha0Var, ob0 ob0Var, int i) {
        int i2;
        ob0 ob0Var2;
        ob0Var.X(591285965);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(v2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(ha0Var) ? 32 : 16;
        }
        int i3 = 1;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new e2(7);
                ob0Var.f0(objK);
            }
            ob0Var2 = ob0Var;
            t2.a((ha0) objK, null, new dy(4), lk.d0(1583777747, new ca2(v2Var, ha0Var, i3), ob0Var), ob0Var2, 3462, 2);
        } else {
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new go(i, 5, v2Var, ha0Var);
        }
    }

    public static final void f(x2 x2Var, ob0 ob0Var, int i) {
        int i2;
        ob0 ob0Var2;
        ob0Var.X(32030913);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(x2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (ob0Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = new e2(7);
                ob0Var.f0(objK);
            }
            ob0Var2 = ob0Var;
            t2.a((ha0) objK, null, new dy(4), lk.d0(-1317901113, new fa2(x2Var, i4), ob0Var), ob0Var2, 3462, 2);
        } else {
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new f5(i, i3, x2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float g(y61 y61Var, boolean z, xd0[] xd0VarArr, float f) {
        float f2 = Float.NaN;
        for (xd0 xd0Var : xd0VarArr) {
            float fC = y61Var.c(xd0Var);
            if (Float.isNaN(f2)) {
                f2 = fC;
            } else if (z == (fC > f2)) {
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static void h(StringBuilder sb, Object obj, sa0 sa0Var) {
        if (sa0Var != null) {
            sb.append((CharSequence) sa0Var.i(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static boolean i(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static final void j(xc0 xc0Var, z42 z42Var) {
        List list = z42Var.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b52 b52Var = (b52) list.get(i);
            if (b52Var instanceof d52) {
                z41 z41Var = new z41();
                d52 d52Var = (d52) b52Var;
                z41Var.d = d52Var.f;
                z41Var.n = true;
                z41Var.c();
                z41Var.s.a.setFillType(d52Var.g == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                z41Var.c();
                z41Var.c();
                z41Var.b = d52Var.h;
                z41Var.c();
                z41Var.c = d52Var.i;
                z41Var.c();
                z41Var.g = d52Var.j;
                z41Var.c();
                z41Var.e = d52Var.k;
                z41Var.c();
                z41Var.f = d52Var.l;
                z41Var.o = true;
                z41Var.c();
                z41Var.h = d52Var.m;
                z41Var.o = true;
                z41Var.c();
                z41Var.i = d52Var.n;
                z41Var.o = true;
                z41Var.c();
                z41Var.j = d52Var.o;
                z41Var.o = true;
                z41Var.c();
                z41Var.k = d52Var.p;
                z41Var.p = true;
                z41Var.c();
                z41Var.l = d52Var.q;
                z41Var.p = true;
                z41Var.c();
                z41Var.m = d52Var.r;
                z41Var.p = true;
                z41Var.c();
                xc0Var.e(i, z41Var);
            } else if (b52Var instanceof z42) {
                xc0 xc0Var2 = new xc0();
                z42 z42Var2 = (z42) b52Var;
                xc0Var2.k = z42Var2.e;
                xc0Var2.c();
                xc0Var2.l = z42Var2.f;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.o = z42Var2.i;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.p = z42Var2.j;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.q = z42Var2.k;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.r = z42Var2.l;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.m = z42Var2.g;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.n = z42Var2.h;
                xc0Var2.s = true;
                xc0Var2.c();
                xc0Var2.f = z42Var2.m;
                xc0Var2.g = true;
                xc0Var2.c();
                j(xc0Var2, z42Var2);
                xc0Var.e(i, xc0Var2);
            }
        }
    }

    public static final t62 k(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            t62 t62Var = tag instanceof t62 ? (t62) tag : null;
            if (t62Var != null) {
                return t62Var;
            }
            Object objS = af1.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static sp1 l() {
        return (sp1) aq1.b.h();
    }

    public static final Object m(nl1 nl1Var, zl1 zl1Var) {
        Object objG = nl1Var.e.g(zl1Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static tc1 n(Context context, AttributeSet attributeSet, int i, int i2) {
        tc1 tc1Var = new tc1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sb1.a, i, i2);
        tc1Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        tc1Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        tc1Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        tc1Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return tc1Var;
    }

    public static final long o(double d) {
        return y((float) d, 4294967296L);
    }

    public static final long p(int i) {
        return y(i, 4294967296L);
    }

    public static File q(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final boolean r(float f, float f2, w6 w6Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        w6 w6VarA = y6.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            y6.b("Invalid rectangle, make sure no value is NaN");
        }
        if (w6VarA.b == null) {
            w6VarA.b = new RectF();
        }
        RectF rectF = w6VarA.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = w6VarA.a;
        RectF rectF2 = w6VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        w6 w6VarA2 = y6.a();
        w6VarA2.f(w6Var, w6VarA, 1);
        boolean zIsEmpty = w6VarA2.a.isEmpty();
        w6VarA2.g();
        w6VarA.g();
        return !zIsEmpty;
    }

    public static final boolean s(ry1 ry1Var, boolean z) {
        zk0 zk0VarC;
        jo0 jo0Var = ry1Var.d;
        if (jo0Var == null || (zk0VarC = jo0Var.c()) == null) {
            return false;
        }
        pc1 pc1VarY = qc1.y(zk0VarC);
        long jL = ry1Var.l(z);
        float f = pc1VarY.a;
        float f2 = pc1VarY.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = pc1VarY.b;
        float f4 = pc1VarY.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static final boolean t(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static sp1 u(sp1 sp1Var) {
        if (sp1Var instanceof f22) {
            f22 f22Var = (f22) sp1Var;
            if (f22Var.t == xc.q()) {
                f22Var.r = null;
                return sp1Var;
            }
        }
        if (sp1Var instanceof g22) {
            g22 g22Var = (g22) sp1Var;
            if (g22Var.i == xc.q()) {
                g22Var.h = null;
                return sp1Var;
            }
        }
        sp1 sp1VarG = aq1.g(sp1Var, null, false);
        sp1VarG.j();
        return sp1VarG;
    }

    public static MappedByteBuffer v(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final long w(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : vl.b(vl.d(j) * f, j);
    }

    public static Object x(ox oxVar, ha0 ha0Var) {
        sp1 f22Var;
        sp1 sp1Var = (sp1) aq1.b.h();
        if (sp1Var instanceof f22) {
            f22 f22Var2 = (f22) sp1Var;
            if (f22Var2.t == xc.q()) {
                sa0 sa0Var = f22Var2.r;
                sa0 sa0Var2 = f22Var2.s;
                try {
                    ((f22) sp1Var).r = aq1.k(oxVar, sa0Var, true);
                    ((f22) sp1Var).s = sa0Var2;
                    return ha0Var.a();
                } finally {
                    f22Var2.r = sa0Var;
                    f22Var2.s = sa0Var2;
                }
            }
        }
        if (sp1Var == null || (sp1Var instanceof ey0)) {
            f22Var = new f22(sp1Var instanceof ey0 ? (ey0) sp1Var : null, oxVar, null, true, false);
        } else {
            f22Var = sp1Var.u(oxVar);
        }
        try {
            sp1 sp1VarJ = f22Var.j();
            try {
                Object objA = ha0Var.a();
                sp1.q(sp1VarJ);
                f22Var.c();
                return objA;
            } catch (Throwable th) {
                sp1.q(sp1VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            f22Var.c();
            throw th2;
        }
    }

    public static final long y(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        h02[] h02VarArr = g02.b;
        return jFloatToRawIntBits;
    }

    public static final c52 z(ye0 ye0Var, ob0 ob0Var) {
        hx hxVar = (hx) ob0Var.j(aq.h);
        boolean zE = ob0Var.e((((long) Float.floatToRawIntBits(hxVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(ye0Var.j)) << 32));
        Object objK = ob0Var.K();
        if (zE || objK == kp.a) {
            xc0 xc0Var = new xc0();
            j(xc0Var, ye0Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(hxVar.y(ye0Var.b))) << 32) | (((long) Float.floatToRawIntBits(hxVar.y(ye0Var.c))) & 4294967295L);
            float fIntBitsToFloat = ye0Var.d;
            float fIntBitsToFloat2 = ye0Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            c52 c52Var = new c52(xc0Var);
            String str = ye0Var.a;
            long j = ye0Var.g;
            wf wfVar = j != 16 ? new wf(ye0Var.h, j) : null;
            boolean z = ye0Var.i;
            c52Var.e.setValue(new io1(jFloatToRawIntBits));
            c52Var.f.setValue(Boolean.valueOf(z));
            w42 w42Var = c52Var.g;
            w42Var.g.setValue(wfVar);
            w42Var.i.setValue(new io1(jFloatToRawIntBits2));
            w42Var.c = str;
            ob0Var.f0(c52Var);
            objK = c52Var;
        }
        return (c52) objK;
    }
}
