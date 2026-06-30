package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class nu0 {
    public static final jo b;
    public static final jo c;
    public static final jo d;
    public static final jo e;
    public static final jo f;
    public static final s30 h;
    public static final s30 i;
    public static final oc k;
    public static oc l;
    public static final xj a = new xj();
    public static final x80 g = new x80(9);
    public static final m7 j = new m7(3);
    public static final t61 m = new t61(6);
    public static final t61 n = new t61(16);
    public static final t61 o = new t61(17);
    public static final t61 p = new t61(18);
    public static final pc1 q = new pc1(0.0f, 0.0f, 10.0f, 10.0f);
    public static final m02 r = new m02(0, new long[0], new Object[0]);
    public static final cm s = cm.j;
    public static final float t = 0.38f;

    static {
        byte b2 = 0;
        b = new jo(-1339366597, false, new pc(5, b2));
        c = new jo(-39202156, false, new pc(10, b2));
        d = new jo(1582488484, false, new pc(11, b2));
        e = new jo(414328099, false, new pc(12, b2));
        f = new jo(-1514016380, false, new pc(13, b2));
        int i2 = 1;
        h = new s30("REMOVED_TASK", i2);
        i = new s30("CLOSED_EMPTY", i2);
        Object obj = null;
        k = new oc(obj, obj, obj);
    }

    public static jr1 A(vt vtVar, lt ltVar, yt ytVar, wa0 wa0Var, int i2) {
        if ((i2 & 1) != 0) {
            ltVar = d40.e;
        }
        if ((i2 & 2) != 0) {
            ytVar = yt.e;
        }
        lt ltVarW = lk.W(vtVar, ltVar);
        jr1 yn0Var = ytVar == yt.f ? new yn0(ltVarW, wa0Var) : new jr1(ltVarW, true);
        yn0Var.o0(ytVar, yn0Var, wa0Var);
        return yn0Var;
    }

    public static final tv0 B(tv0 tv0Var, ha0 ha0Var, sa0 sa0Var, long j2, long j3, kt1 kt1Var, kt1 kt1Var2, float f2, float f3, float f4, float f5) {
        return tv0Var.c(new rx(f2, f3, f4, f5, j2, j3, ha0Var, sa0Var, kt1Var, kt1Var2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String C(String str) {
        if (str == null || str.length() == 0) {
            return "Unknown server response.";
        }
        switch (str.hashCode()) {
            case -1996826431:
                if (str.equals("data_not_found")) {
                    return "Data not found.";
                }
                break;
            case -1865767626:
                if (str.equals("ip_banned")) {
                    return "Your IP is banned.";
                }
                break;
            case -1855640203:
                if (str.equals("key_is_frozen")) {
                    return "Key is frozen.";
                }
                break;
            case -1730737339:
                if (str.equals("invalid_decrypt")) {
                    return "Invalid encrypted payload.";
                }
                break;
            case -1651946290:
                if (str.equals("invalid_timestamp")) {
                    return "Invalid request timestamp.";
                }
                break;
            case -1645225241:
                if (str.equals("key_taken")) {
                    return "Key is already used.";
                }
                break;
            case -1396343010:
                if (str.equals("banned")) {
                    return "Your device is banned.";
                }
                break;
            case -1303877609:
                if (str.equals("key_invalid")) {
                    return "Key is invalid.";
                }
                break;
            case -835865053:
                if (str.equals("key_success")) {
                    return "Authorization successful.";
                }
                break;
            case -609462882:
                if (str.equals("invalid_device")) {
                    return "Device is not allowed.";
                }
                break;
            case -549014015:
                if (str.equals("invalid_fields")) {
                    return "Invalid request fields.";
                }
                break;
            case -277930683:
                if (str.equals("key_expired")) {
                    return "Key has expired.";
                }
                break;
            case 526735602:
                if (str.equals("invalid_data")) {
                    return "Invalid data.";
                }
                break;
            case 526931504:
                if (str.equals("invalid_json")) {
                    return "Invalid JSON.";
                }
                break;
        }
        return "Server refused: ".concat(str);
    }

    public static void D(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static tv0 E(tv0 tv0Var, g41 g41Var, wr wrVar, wl wlVar, int i2) {
        return tv0Var.c(new h41(g41Var, v20.j, wrVar, 1.0f, wlVar));
    }

    public static final l8 F(ha0 ha0Var, ob0 ob0Var, int i2) {
        View view = (View) ob0Var.j(w4.f);
        boolean zF = ob0Var.f(view);
        Object objK = ob0Var.K();
        Object obj = kp.a;
        if (zF || objK == obj) {
            objK = new l8(view, null, ha0Var);
            ob0Var.f0(objK);
        }
        l8 l8Var = (l8) objK;
        boolean zH = ob0Var.h(l8Var);
        Object objK2 = ob0Var.K();
        if (zH || objK2 == obj) {
            objK2 = new d8(l8Var, 3);
            ob0Var.f0(objK2);
        }
        wi0.c(l8Var, (sa0) objK2, ob0Var);
        return l8Var;
    }

    public static int I(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        yc.p("Cannot round NaN value.");
        return 0;
    }

    public static final Object J(w80 w80Var, int i2, sa0 sa0Var) {
        int i3;
        int i4;
        Object objI;
        sv0 sv0VarK;
        om0 om0VarP0;
        int size;
        int i5;
        xz0 xz0Var;
        if (!w80Var.e.r) {
            ng0.b("visitAncestors called on an unattached node");
        }
        sv0 sv0Var = w80Var.e.i;
        ql0 ql0VarP = bl.P(w80Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objI = null;
            if (ql0VarP == null) {
                sv0VarK = null;
                break;
            }
            if ((ql0VarP.I.f.h & 1024) != 0) {
                while (sv0Var != null) {
                    if ((sv0Var.g & 1024) != 0) {
                        sv0VarK = sv0Var;
                        iy0 iy0Var = null;
                        while (sv0VarK != null) {
                            if (sv0VarK instanceof w80) {
                                break loop0;
                            }
                            if ((sv0VarK.g & 1024) != 0 && (sv0VarK instanceof yw)) {
                                int i6 = 0;
                                for (sv0 sv0Var2 = ((yw) sv0VarK).t; sv0Var2 != null; sv0Var2 = sv0Var2.j) {
                                    if ((sv0Var2.g & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
                                }
                            }
                            sv0VarK = bl.k(iy0Var);
                        }
                    }
                    sv0Var = sv0Var.i;
                }
            }
            ql0VarP = ql0VarP.u();
            sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
        }
        w80 w80Var2 = (w80) sv0VarK;
        if ((w80Var2 == null || !xi0.o(w80Var2.P0(), w80Var.P0())) && (om0VarP0 = w80Var.P0()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i7 = 2;
                            } else if (i2 == 2) {
                                i7 = 1;
                            } else {
                                yc.l("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (om0VarP0.s.a.g().n <= 0 || om0VarP0.s.a.g().k.isEmpty() || !om0VarP0.r) {
                return sa0Var.i(om0.v);
            }
            boolean zM0 = om0VarP0.M0(i7);
            in0 in0Var = om0VarP0.s;
            int iMin = zM0 ? Math.min(in0Var.a.g().n - 1, ((qn0) pl.i0(in0Var.a.g().k)).a) : Math.max(0, ((s41) in0Var.a.e.b).g());
            zc1 zc1Var = new zc1();
            wg wgVar = om0VarP0.t;
            wgVar.getClass();
            km0 km0Var = new km0(iMin, iMin);
            wgVar.a.b(km0Var);
            zc1Var.e = km0Var;
            un0 un0Var = om0VarP0.s.a;
            if (un0Var.g().k.isEmpty()) {
                i4 = 0;
            } else {
                pn0 pn0VarG = un0Var.g();
                int i8 = (int) (pn0VarG.o == k31.e ? pn0VarG.i() & 4294967295L : pn0VarG.i() >> 32);
                pn0 pn0VarG2 = un0Var.g();
                List list = pn0VarG2.k;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size2; i10++) {
                        i9 += ((qn0) list.get(i10)).k;
                    }
                    size = (i9 / list.size()) + pn0VarG2.q;
                }
                if (size != 0 && (i5 = i8 / size) >= 1) {
                    i4 = i5;
                }
            }
            int i11 = i4 * 2;
            int i12 = om0VarP0.s.a.g().n;
            if (i11 > i12) {
                i11 = i12;
            }
            while (objI == null && om0VarP0.L0((km0) zc1Var.e, i7) && i3 < i11) {
                km0 km0Var2 = (km0) zc1Var.e;
                int i13 = km0Var2.a;
                int i14 = km0Var2.b;
                if (om0VarP0.M0(i7)) {
                    i14++;
                } else {
                    i13--;
                }
                wg wgVar2 = om0VarP0.t;
                wgVar2.getClass();
                km0 km0Var3 = new km0(i13, i14);
                wgVar2.a.b(km0Var3);
                om0VarP0.t.a.j((km0) zc1Var.e);
                zc1Var.e = km0Var3;
                i3++;
                bl.P(om0VarP0).k();
                objI = sa0Var.i(new nm0(om0VarP0, zc1Var, i7));
            }
            om0VarP0.t.a.j((km0) zc1Var.e);
            bl.P(om0VarP0).k();
            return objI;
        }
        return null;
    }

    public static final BlendMode K(int i2) {
        return i2 == 0 ? BlendMode.CLEAR : i2 == 1 ? BlendMode.SRC : i2 == 2 ? BlendMode.DST : i2 == 3 ? BlendMode.SRC_OVER : i2 == 4 ? BlendMode.DST_OVER : i2 == 5 ? BlendMode.SRC_IN : i2 == 6 ? BlendMode.DST_IN : i2 == 7 ? BlendMode.SRC_OUT : i2 == 8 ? BlendMode.DST_OUT : i2 == 9 ? BlendMode.SRC_ATOP : i2 == 10 ? BlendMode.DST_ATOP : i2 == 11 ? BlendMode.XOR : i2 == 12 ? BlendMode.PLUS : i2 == 13 ? BlendMode.MODULATE : i2 == 14 ? BlendMode.SCREEN : i2 == 15 ? BlendMode.OVERLAY : i2 == 16 ? BlendMode.DARKEN : i2 == 17 ? BlendMode.LIGHTEN : i2 == 18 ? BlendMode.COLOR_DODGE : i2 == 19 ? BlendMode.COLOR_BURN : i2 == 20 ? BlendMode.HARD_LIGHT : i2 == 21 ? BlendMode.SOFT_LIGHT : i2 == 22 ? BlendMode.DIFFERENCE : i2 == 23 ? BlendMode.EXCLUSION : i2 == 24 ? BlendMode.MULTIPLY : i2 == 25 ? BlendMode.HUE : i2 == 26 ? BlendMode.SATURATION : i2 == 27 ? BlendMode.COLOR : i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode L(int i2) {
        return i2 == 0 ? PorterDuff.Mode.CLEAR : i2 == 1 ? PorterDuff.Mode.SRC : i2 == 2 ? PorterDuff.Mode.DST : i2 == 3 ? PorterDuff.Mode.SRC_OVER : i2 == 4 ? PorterDuff.Mode.DST_OVER : i2 == 5 ? PorterDuff.Mode.SRC_IN : i2 == 6 ? PorterDuff.Mode.DST_IN : i2 == 7 ? PorterDuff.Mode.SRC_OUT : i2 == 8 ? PorterDuff.Mode.DST_OUT : i2 == 9 ? PorterDuff.Mode.SRC_ATOP : i2 == 10 ? PorterDuff.Mode.DST_ATOP : i2 == 11 ? PorterDuff.Mode.XOR : i2 == 12 ? PorterDuff.Mode.ADD : i2 == 14 ? PorterDuff.Mode.SCREEN : i2 == 15 ? PorterDuff.Mode.OVERLAY : i2 == 16 ? PorterDuff.Mode.DARKEN : i2 == 17 ? PorterDuff.Mode.LIGHTEN : i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final tv0 M(boolean z, jx0 jx0Var, yf1 yf1Var, sa0 sa0Var) {
        return nv0.a.c(new c12(z, jx0Var, yf1Var, sa0Var));
    }

    public static void N(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            N((View) parent, fArr, fArr2, iArr);
            u4.c(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            u4.c(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            u4.c(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            u4.c(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        u4.t(matrix, fArr2);
        u4.p(fArr, fArr2);
    }

    public static final tv0 O(tv0 tv0Var, ri0 ri0Var) {
        return tv0Var.c(new ti0(ri0Var));
    }

    public static final Object P(lt ltVar, wa0 wa0Var, ks ksVar) {
        lt ltVarE = ksVar.e();
        lt ltVarJ = !((Boolean) ltVar.q(new pc(19, (byte) 0), Boolean.FALSE)).booleanValue() ? ltVarE.j(ltVar) : lk.J(ltVarE, ltVar, false);
        bk.t(ltVarJ);
        if (ltVarJ == ltVarE) {
            ui1 ui1Var = new ui1(ksVar, ltVarJ);
            return kd1.D(ui1Var, true, ui1Var, wa0Var);
        }
        v20 v20Var = v20.z;
        if (xi0.o(ltVarJ.l(v20Var), ltVarE.l(v20Var))) {
            p32 p32Var = new p32(ksVar, ltVarJ);
            lt ltVar2 = p32Var.i;
            Object objM = xi0.M(ltVar2, null);
            try {
                return kd1.D(p32Var, true, p32Var, wa0Var);
            } finally {
                xi0.G(ltVar2, objM);
            }
        }
        ny nyVar = new ny(ksVar, ltVarJ);
        try {
            s22.H(bl.E(bl.t(nyVar, nyVar, wa0Var)), t32.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ny.k;
            do {
                int i2 = atomicIntegerFieldUpdater.get(nyVar);
                if (i2 != 0) {
                    if (i2 != 2) {
                        yc.l("Already suspended");
                        return null;
                    }
                    Object objS = s22.S(nyVar.P());
                    if (objS instanceof on) {
                        throw ((on) objS).a;
                    }
                    return objS;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(nyVar, 0, 1));
            return wt.e;
        } catch (Throwable th) {
            th = th;
            if (th instanceof ly) {
                th = ((ly) th).e;
            }
            nyVar.g(xc.p(th));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q(Context context, Executor executor, ab1 ab1Var, boolean z) {
        boolean z2;
        ?? A;
        xx[] xxVarArrE;
        xx[] xxVarArr;
        xx[] xxVarArr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        Throwable th;
        Throwable th2;
        ?? r72;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r73;
        wx wxVar;
        ?? r74;
        String str;
        FileInputStream fileInputStreamA;
        ?? r75;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                ab1Var.f(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                } else {
                    z5 = false;
                    if (z5) {
                        context.getPackageName();
                        eb1.c(context, false);
                        return;
                    }
                }
            }
            context.getPackageName();
            byte[] bArr2 = s22.h0;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            wx wxVar2 = new wx(assets, executor, ab1Var, name, file2);
            byte[] bArr3 = wxVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        wxVar2.b(4, null);
                    }
                    wxVar2.f = true;
                    try {
                        A = wxVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        ab1Var.f(6, e2);
                        A = 0;
                    } catch (IOException e3) {
                        ab1Var.f(7, e3);
                        A = 0;
                    }
                    try {
                        if (A != 0) {
                            try {
                            } catch (IOException e4) {
                                ab1Var.f(7, e4);
                                try {
                                    A.close();
                                } catch (IOException e5) {
                                    ab1Var.f(7, e5);
                                }
                                xxVarArrE = null;
                            } catch (IllegalStateException e6) {
                                ab1Var.f(8, e6);
                                A.close();
                                xxVarArrE = null;
                            }
                            if (!Arrays.equals(bArr2, xk.J(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            xxVarArrE = s22.E(A, xk.J(A, 4), wxVar2.e);
                            try {
                                A.close();
                            } catch (IOException e7) {
                                ab1Var.f(7, e7);
                            }
                            wxVar2.g = xxVarArrE;
                        }
                        xxVarArr = wxVar2.g;
                        if (xxVarArr != null && (A = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamA = wxVar2.a(assets, "dexopt/baseline.profm");
                                r74 = str;
                            } catch (FileNotFoundException e8) {
                                ab1Var.f(9, e8);
                                r74 = A;
                            } catch (IOException e9) {
                                ab1Var.f(7, e9);
                                r74 = A;
                            } catch (IllegalStateException e10) {
                                wxVar2.g = null;
                                ab1Var.f(8, e10);
                                r74 = A;
                            }
                            if (fileInputStreamA == null) {
                                try {
                                    if (!Arrays.equals(s22.i0, xk.J(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrJ = xk.J(fileInputStreamA, 4);
                                    wxVar2.g = s22.B(fileInputStreamA, bArrJ, bArr3, xxVarArr);
                                    fileInputStreamA.close();
                                    wxVar = wxVar2;
                                    A = bArrJ;
                                    if (wxVar != null) {
                                        wxVar2 = wxVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamA != null) {
                                    fileInputStreamA.close();
                                    r74 = str;
                                }
                                wxVar = null;
                                A = r74;
                                if (wxVar != null) {
                                }
                            }
                        }
                        ab1 ab1Var2 = wxVar2.b;
                        xxVarArr2 = wxVar2.g;
                        byte[] bArr4 = wxVar2.c;
                        ?? r76 = A;
                        r76 = A;
                        if (xxVarArr2 != null && bArr4 != null) {
                            byteArrayOutputStream = wxVar2.f;
                            if (byteArrayOutputStream != 0) {
                                yc.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e11) {
                                ab1Var2.f(7, e11);
                                r73 = byteArrayOutputStream;
                            } catch (IllegalStateException e12) {
                                ab1Var2.f(8, e12);
                                r73 = byteArrayOutputStream;
                            }
                            if (s22.Q(byteArrayOutputStream, bArr4, xxVarArr2)) {
                                wxVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r73 = byteArrayOutputStream;
                                wxVar2.g = null;
                                r76 = r73;
                            } else {
                                ab1Var2.f(5, null);
                                wxVar2.g = null;
                                byteArrayOutputStream.close();
                                r76 = byteArrayOutputStream;
                            }
                        }
                        bArr = wxVar2.h;
                        if (bArr != null) {
                            z3 = false;
                            r72 = 1;
                        } else {
                            try {
                                if (!wxVar2.f) {
                                    yc.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(wxVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i2 = byteArrayInputStream.read(bArr5);
                                                                                    if (i2 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i2);
                                                                                    }
                                                                                }
                                                                                r72 = 1;
                                                                                wxVar2.b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                wxVar2.h = null;
                                                                                wxVar2.g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                    th2 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th2;
                                                                    } catch (Throwable th9) {
                                                                        th2.addSuppressed(th9);
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        r76 = 1;
                                        wxVar2.b(6, e);
                                        r7 = r76;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        eb1.c(context, (z4 || !z) ? 0 : r75);
                                    } catch (IOException e14) {
                                        e = e14;
                                        r76 = 1;
                                        wxVar2.b(7, e);
                                        r7 = r76;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        eb1.c(context, (z4 || !z) ? 0 : r75);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    wxVar2.b(6, e);
                                    r7 = r76;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    eb1.c(context, (z4 || !z) ? 0 : r75);
                                } catch (IOException e16) {
                                    e = e16;
                                    wxVar2.b(7, e);
                                    r7 = r76;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    eb1.c(context, (z4 || !z) ? 0 : r75);
                                }
                            } finally {
                                wxVar2.h = null;
                                wxVar2.g = null;
                            }
                        }
                        if (z3) {
                            D(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r75 = r72;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            wxVar2.b(4, null);
                        }
                        wxVar2.f = true;
                        A = wxVar2.a(assets, "dexopt/baseline.prof");
                        if (A != 0) {
                        }
                        xxVarArr = wxVar2.g;
                        if (xxVarArr != null) {
                            str = "dexopt/baseline.profm";
                            fileInputStreamA = wxVar2.a(assets, "dexopt/baseline.profm");
                            r74 = str;
                            if (fileInputStreamA == null) {
                            }
                        }
                        ab1 ab1Var22 = wxVar2.b;
                        xxVarArr2 = wxVar2.g;
                        byte[] bArr42 = wxVar2.c;
                        ?? r762 = A;
                        r762 = A;
                        if (xxVarArr2 != null) {
                            byteArrayOutputStream = wxVar2.f;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr = wxVar2.h;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                        r75 = r72;
                    } catch (IOException unused2) {
                        z2 = true;
                        wxVar2.b(4, null);
                    }
                }
                eb1.c(context, (z4 || !z) ? 0 : r75);
            }
            wxVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r75 = z2;
            eb1.c(context, (z4 || !z) ? 0 : r75);
        } catch (PackageManager.NameNotFoundException e17) {
            ab1Var.f(7, e17);
            eb1.c(context, false);
        }
    }

    public static final void a(d22 d22Var, sa0 sa0Var, sa0 sa0Var2, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        Object obj = v20.f;
        ob0Var.X(511725103);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(d22Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        qv0 qv0Var = qv0.a;
        if (i4 == 0) {
            i3 |= ob0Var.f(qv0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(sa0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.f(obj) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.h(sa0Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= ob0Var.h(joVar) ? 131072 : 65536;
        }
        if (ob0Var.N(i3 & 1, (74899 & i3) != 74898)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = a4.r;
                ob0Var.f0(objK);
            }
            c(d22Var, qv0Var, sa0Var, sa0Var2, (sa0) objK, joVar, ob0Var, ((i3 << 3) & 3670016) | 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3));
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new l9(d22Var, sa0Var, sa0Var2, joVar, i2);
        }
    }

    public static final void b(Object obj, tv0 tv0Var, sa0 sa0Var, b3 b3Var, String str, sa0 sa0Var2, jo joVar, ob0 ob0Var, int i2) {
        tv0 tv0Var2;
        sa0 sa0Var3;
        b3 b3Var2;
        sa0 sa0Var4;
        ob0Var.X(1501828832);
        int i3 = i2 | (ob0Var.f(obj) ? 4 : 2) | 200112;
        if (ob0Var.N(i3 & 1, (599187 & i3) != 599186)) {
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                objK = a4.p;
                ob0Var.f0(objK);
            }
            sa0 sa0Var5 = (sa0) objK;
            uf ufVar = v20.f;
            Object objK2 = ob0Var.K();
            if (objK2 == l91Var) {
                objK2 = a4.q;
                ob0Var.f0(objK2);
            }
            sa0 sa0Var6 = (sa0) objK2;
            sa0Var3 = sa0Var5;
            a(kd1.F(obj, str, ob0Var, (i3 & 14) | 48), sa0Var3, sa0Var6, joVar, ob0Var, 224688);
            tv0Var2 = qv0.a;
            sa0Var4 = sa0Var6;
            b3Var2 = ufVar;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            sa0Var3 = sa0Var;
            b3Var2 = b3Var;
            sa0Var4 = sa0Var2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new k9(obj, tv0Var2, sa0Var3, b3Var2, str, sa0Var4, joVar, i2);
        }
    }

    public static final void c(d22 d22Var, tv0 tv0Var, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3, jo joVar, ob0 ob0Var, int i2) {
        sa0 sa0Var4;
        ob0 ob0Var2;
        int i3;
        z12 z12Var;
        Object obj;
        zx0 zx0Var;
        mq1 mq1Var;
        v41 v41Var;
        ba baVar;
        z12 z12Var2;
        l91 l91Var;
        mq1 mq1Var2;
        z12 z12VarG;
        ob0 ob0Var3;
        boolean z;
        int i4;
        int i5;
        uf ufVar = v20.f;
        ob0Var.X(1935038908);
        int i6 = (i2 & 6) == 0 ? (ob0Var.f(d22Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= ob0Var.f(tv0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= ob0Var.h(sa0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= ob0Var.f(ufVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= ob0Var.h(sa0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= ob0Var.h(sa0Var3) ? 131072 : 65536;
        }
        jo joVar2 = joVar;
        if ((1572864 & i2) == 0) {
            i6 |= ob0Var.h(joVar2) ? 1048576 : 524288;
        }
        if (ob0Var.N(i6 & 1, (599187 & i6) != 599186)) {
            int i7 = i6 & 14;
            boolean z2 = i7 == 4;
            Object objK = ob0Var.K();
            l91 l91Var2 = kp.a;
            if (z2 || objK == l91Var2) {
                objK = new ba(d22Var);
                ob0Var.f0(objK);
            }
            ba baVar2 = (ba) objK;
            boolean z3 = i7 == 4;
            Object objK2 = ob0Var.K();
            Object obj2 = objK2;
            if (z3 || objK2 == l91Var2) {
                Object[] objArr = {d22Var.c()};
                mq1 mq1Var3 = new mq1();
                mq1Var3.addAll(nd.a0(objArr));
                ob0Var.f0(mq1Var3);
                obj2 = mq1Var3;
            }
            mq1 mq1Var4 = (mq1) obj2;
            v41 v41Var2 = d22Var.e;
            v41 v41Var3 = d22Var.d;
            boolean zF = (i7 == 4) | ob0Var.f(v41Var2.getValue());
            Object objK3 = ob0Var.K();
            if (zF || objK3 == l91Var2) {
                long[] jArr = pi1.a;
                objK3 = new zx0();
                ob0Var.f0(objK3);
            }
            zx0 zx0Var2 = (zx0) objK3;
            if (!mq1Var4.contains(d22Var.c())) {
                mq1Var4.clear();
                mq1Var4.add(d22Var.c());
            }
            if (xi0.o(d22Var.c(), v41Var3.getValue()) && v41Var2.getValue() == null) {
                if (mq1Var4.size() != 1 || !xi0.o(mq1Var4.get(0), d22Var.c())) {
                    mq1Var4.clear();
                    mq1Var4.add(d22Var.c());
                }
                if (zx0Var2.e != 1 || zx0Var2.c(d22Var.c())) {
                    zx0Var2.a();
                }
                baVar2.getClass();
            }
            Object value = v41Var2.getValue();
            if (value == null || value.equals(d22Var.c())) {
                i3 = i6;
            } else {
                ListIterator listIterator = mq1Var4.listIterator();
                int i8 = 0;
                while (true) {
                    rd0 rd0Var = (rd0) listIterator;
                    if (!rd0Var.hasNext()) {
                        i3 = i6;
                        i5 = -1;
                        break;
                    }
                    i3 = i6;
                    if (xi0.o(sa0Var2.i(rd0Var.next()), sa0Var2.i(value))) {
                        i5 = i8;
                        break;
                    } else {
                        i8++;
                        i6 = i3;
                    }
                }
                if (i5 == -1) {
                    mq1Var4.add(value);
                } else if (!xi0.o(mq1Var4.get(i5), value)) {
                    mq1Var4.set(i5, value);
                }
            }
            if (!xi0.o(d22Var.c(), v41Var3.getValue())) {
                ListIterator listIterator2 = mq1Var4.listIterator();
                int i9 = 0;
                while (true) {
                    rd0 rd0Var2 = (rd0) listIterator2;
                    if (!rd0Var2.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (xi0.o(sa0Var2.i(rd0Var2.next()), sa0Var2.i(v41Var3.getValue()))) {
                            i4 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i4 == -1) {
                    mq1Var4.add(v41Var3.getValue());
                } else if (!xi0.o(mq1Var4.get(i4), v41Var3.getValue()) || i4 != mq1Var4.size() - 1) {
                    mq1Var4.remove(i4);
                    mq1Var4.add(v41Var3.getValue());
                }
            }
            Object value2 = v41Var2.getValue();
            boolean zF2 = ob0Var.f(value2);
            Object objK4 = ob0Var.K();
            if (zF2 || objK4 == l91Var2) {
                objK4 = value2 != null ? new y51(baVar2, v41Var3.getValue(), value2) : null;
                ob0Var.f0(objK4);
            }
            y51 y51Var = (y51) objK4;
            boolean zF3 = ob0Var.f(y51Var) | ((i3 & 458752) == 131072);
            Object objK5 = ob0Var.K();
            if (!zF3 && objK5 != l91Var2) {
                obj = objK5;
                z12Var = null;
            } else if (y51Var != null && sa0Var3.i(y51Var) != null) {
                yc.d();
                return;
            } else {
                z12Var = null;
                ob0Var.f0(null);
                obj = null;
            }
            if (obj != null) {
                yc.d();
                return;
            }
            if (zx0Var2.b(v41Var3.getValue()) && zx0Var2.b(d22Var.c()) && (value2 == null || zx0Var2.b(value2))) {
                ob0Var.W(-298958042);
                ob0Var.p(false);
                zx0Var = zx0Var2;
                mq1Var = mq1Var4;
                v41Var = v41Var2;
                baVar = baVar2;
                sa0Var4 = sa0Var;
                z12Var2 = z12Var;
                l91Var = l91Var2;
            } else {
                ob0Var.W(-302678073);
                zx0Var2.a();
                int size = mq1Var4.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10;
                    Object obj3 = mq1Var4.get(i11);
                    zx0 zx0Var3 = zx0Var2;
                    v41 v41Var4 = v41Var2;
                    jo joVar3 = joVar2;
                    mq1 mq1Var5 = mq1Var4;
                    l91 l91Var3 = l91Var2;
                    ba baVar3 = baVar2;
                    zx0Var3.m(obj3, lk.d0(427839334, new k9(obj3, d22Var, y51Var, sa0Var, baVar3, mq1Var5, joVar3), ob0Var));
                    i10 = i11 + 1;
                    mq1Var4 = mq1Var5;
                    zx0Var2 = zx0Var3;
                    baVar2 = baVar3;
                    v41Var2 = v41Var4;
                    joVar2 = joVar;
                    l91Var2 = l91Var3;
                    z12Var = z12Var;
                }
                ba baVar4 = baVar2;
                zx0Var = zx0Var2;
                mq1Var = mq1Var4;
                v41Var = v41Var2;
                baVar = baVar4;
                sa0Var4 = sa0Var;
                z12Var2 = z12Var;
                l91Var = l91Var2;
                ob0Var.p(false);
            }
            boolean zF4 = ob0Var.f(d22Var.f()) | ob0Var.f(baVar) | ob0Var.f(v41Var.getValue());
            Object objK6 = ob0Var.K();
            if (zF4 || objK6 == l91Var) {
                objK6 = (yr) sa0Var4.i(baVar);
                ob0Var.f0(objK6);
            }
            yr yrVar = (yr) objK6;
            d22 d22Var2 = baVar.a;
            boolean zF5 = ob0Var.f(baVar);
            Object objK7 = ob0Var.K();
            if (zF5 || objK7 == l91Var) {
                objK7 = xc.B(Boolean.FALSE);
                ob0Var.f0(objK7);
            }
            fy0 fy0Var = (fy0) objK7;
            fy0 fy0VarD = xc.D(yrVar.d, ob0Var);
            if (xi0.o(d22Var2.c(), d22Var2.d.getValue())) {
                fy0Var.setValue(Boolean.FALSE);
            } else if (fy0VarD.getValue() != null) {
                fy0Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) fy0Var.getValue()).booleanValue();
            tv0 tv0Var2 = qv0.a;
            if (zBooleanValue) {
                ob0Var.W(1353077497);
                mq1Var2 = mq1Var;
                ob0 ob0Var4 = ob0Var;
                z12VarG = kd1.g(baVar.a, c2.W, null, ob0Var4, 0, 2);
                boolean zF6 = ob0Var4.f(z12VarG);
                Object objK8 = ob0Var4.K();
                if (zF6 || objK8 == l91Var) {
                    objK8 = xk.i(tv0Var2);
                    ob0Var4.f0(objK8);
                }
                tv0Var2 = (tv0) objK8;
                ob0Var4.p(false);
                ob0Var3 = ob0Var4;
            } else {
                ob0 ob0Var5 = ob0Var;
                mq1Var2 = mq1Var;
                ob0Var5.W(1353343539);
                ob0Var5.p(false);
                z12VarG = z12Var2;
                ob0Var3 = ob0Var5;
            }
            tv0 tv0VarC = tv0Var.c(tv0Var2.c(new x9(z12VarG, fy0VarD, baVar)));
            Object objK9 = ob0Var3.K();
            if (objK9 == l91Var) {
                objK9 = new t9(baVar);
                ob0Var3.f0(objK9);
            }
            t9 t9Var = (t9) objK9;
            int iHashCode = Long.hashCode(ob0Var3.T);
            b61 b61VarL = ob0Var3.l();
            tv0 tv0VarP = bk.P(ob0Var3, tv0VarC);
            ep.c.getClass();
            zp zpVar = dp.b;
            ob0Var3.Z();
            if (ob0Var3.S) {
                ob0Var3.k(zpVar);
            } else {
                ob0Var3.i0();
            }
            xc.E(dp.f, ob0Var3, t9Var);
            xc.E(dp.e, ob0Var3, b61VarL);
            xc.z(ob0Var3, Integer.valueOf(iHashCode), dp.g);
            xc.C(ob0Var3, dp.h);
            xc.E(dp.d, ob0Var3, tv0VarP);
            ob0Var3.W(758586195);
            int size2 = mq1Var2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj4 = mq1Var2.get(i12);
                ob0Var3.U(1420119555, sa0Var2.i(obj4));
                wa0 wa0Var = (wa0) zx0Var.g(obj4);
                if (wa0Var == null) {
                    ob0Var3.W(1074069702);
                    z = false;
                } else {
                    z = false;
                    ob0Var3.W(1420120731);
                    wa0Var.h(ob0Var3, 0);
                }
                ob0Var3.p(z);
                ob0Var3.p(z);
            }
            ob0Var3.p(false);
            ob0Var3.p(true);
            ob0Var2 = ob0Var3;
        } else {
            sa0Var4 = sa0Var;
            ob0 ob0Var6 = ob0Var;
            ob0Var6.Q();
            ob0Var2 = ob0Var6;
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new q9(d22Var, tv0Var, sa0Var4, sa0Var2, sa0Var3, joVar, i2);
        }
    }

    public static rh d(int i2, int i3, ph phVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        ph phVar2 = ph.e;
        if (i4 != 0) {
            phVar = phVar2;
        }
        if (i2 == -2) {
            if (phVar != phVar2) {
                return new er(1, phVar);
            }
            mj.b.getClass();
            return new rh(lj.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? phVar == phVar2 ? new rh(i2) : new er(i2, phVar) : new rh(Integer.MAX_VALUE) : phVar == phVar2 ? new rh(0) : new er(1, phVar);
        }
        if (phVar == phVar2) {
            return new er(1, ph.f);
        }
        yc.p("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void e(ha0 ha0Var, dy dyVar, jo joVar, ob0 ob0Var, int i2) {
        ob0Var.X(826668973);
        int i3 = 2;
        int i4 = i2 | (ob0Var.h(ha0Var) ? 4 : 2) | (ob0Var.f(dyVar) ? 32 : 16);
        int i5 = 0;
        if (ob0Var.N(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) ob0Var.j(w4.f);
            hx hxVar = (hx) ob0Var.j(aq.h);
            al0 al0Var = (al0) ob0Var.j(aq.n);
            mb0 mb0VarM = xk.M(ob0Var);
            fy0 fy0VarD = xc.D(joVar, ob0Var);
            Object[] objArr = new Object[0];
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (objK == obj) {
                objK = v4.l;
                ob0Var.f0(objK);
            }
            UUID uuid = (UUID) kd1.w(objArr, (ha0) objK, ob0Var);
            boolean zF = ob0Var.f(view) | ob0Var.f(hxVar) | ob0Var.d(dyVar.g) | ob0Var.f(null);
            Object objK2 = ob0Var.K();
            if (zF || objK2 == obj) {
                fy fyVar = new fy(ha0Var, dyVar, view, al0Var, hxVar, uuid);
                jo joVar2 = new jo(-1338939603, true, new q(i3, fy0VarD));
                cy cyVar = fyVar.l;
                cyVar.setParentCompositionContext(mb0VarM);
                cyVar.o.setValue(joVar2);
                cyVar.s = true;
                cyVar.e();
                ob0Var.f0(fyVar);
                objK2 = fyVar;
            }
            fy fyVar2 = (fy) objK2;
            boolean zH = ob0Var.h(fyVar2);
            Object objK3 = ob0Var.K();
            if (zH || objK3 == obj) {
                objK3 = new j5(fyVar2, i5);
                ob0Var.f0(objK3);
            }
            wi0.c(fyVar2, (sa0) objK3, ob0Var);
            boolean zH2 = ob0Var.h(fyVar2) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | ob0Var.d(al0Var.ordinal());
            Object objK4 = ob0Var.K();
            if (zH2 || objK4 == obj) {
                objK4 = new k5(fyVar2, ha0Var, dyVar, al0Var);
                ob0Var.f0(objK4);
            }
            wi0.m((ha0) objK4, ob0Var);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new l5(ha0Var, dyVar, joVar, i2, 0);
        }
    }

    public static final void f(tv0 tv0Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(joVar) ? 32 : 16;
        }
        int i4 = 0;
        if (ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            g(tv0Var, joVar, ob0Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new m8(tv0Var, joVar, i2, i4);
        }
    }

    public static final void g(tv0 tv0Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(771959668);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(joVar) ? 256 : 128;
        }
        int i4 = 0;
        int i5 = 1;
        if (ob0Var.N(i3 & 1, (i3 & 147) != 146)) {
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                v41 v41Var = new v41(null, v20.S);
                ob0Var.f0(v41Var);
                objK = v41Var;
            }
            fy0 fy0Var = (fy0) objK;
            Object objK2 = ob0Var.K();
            if (objK2 == l91Var) {
                objK2 = new n8(fy0Var, i4);
                ob0Var.f0(objK2);
            }
            lk.i(uw1.b.a(F((ha0) objK2, ob0Var, 0)), lk.d0(-291176396, new o8(tv0Var, fy0Var, joVar, i4), ob0Var), ob0Var, 56);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new m8(tv0Var, joVar, i2, i5);
        }
    }

    public static final void h(tv0 tv0Var, wa0 wa0Var, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(tv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(wa0Var) ? 32 : 16;
        }
        if (ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = n5.b;
                ob0Var.f0(objK);
            }
            uu0 uu0Var = (uu0) objK;
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP = bk.P(ob0Var, tv0Var);
            ep.c.getClass();
            zp zpVar = dp.b;
            int i4 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            wa0Var.h(ob0Var, Integer.valueOf((i4 >> 6) & 14));
            ob0Var.p(true);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new o5(tv0Var, wa0Var, i2);
        }
    }

    public static final void i(sl0 sl0Var, float f2, long j2, float f3, float f4, kt1 kt1Var, long j3) {
        float fMin = Math.min(kt1Var.a, sl0Var.y(f3));
        float f5 = kt1Var.a;
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = (Float.intBitsToFloat(i2) - fMin) - (fMin == f5 ? 0.0f : f5 / 4.0f);
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) * f2) + f4;
        if (fIntBitsToFloat <= fIntBitsToFloat2) {
            fMin = Math.max(0.0f, fMin - (fIntBitsToFloat2 - fIntBitsToFloat));
            fIntBitsToFloat = fIntBitsToFloat2;
        }
        if (fMin > 0.0f) {
            if (kt1Var.c == 1) {
                float f6 = fMin / 2.0f;
                p10.c0(sl0Var, j3, f6, (((long) Float.floatToRawIntBits(fIntBitsToFloat + f6)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f)) & 4294967295L), 120);
            } else {
                p10.e0(sl0Var, j3, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 & 4294967295L)) - fMin) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L), 120);
            }
        }
    }

    public static tv0 j(uf ufVar) {
        return new qg(ufVar);
    }

    public static final oh1 n(cx0 cx0Var) {
        LinkedHashMap linkedHashMap = cx0Var.a;
        vh1 vh1Var = (vh1) linkedHashMap.get(n);
        Bundle bundle = null;
        if (vh1Var == null) {
            yc.p("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        t62 t62Var = (t62) linkedHashMap.get(o);
        if (t62Var == null) {
            yc.p("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(p);
        String str = (String) linkedHashMap.get(qt0.h);
        if (str == null) {
            yc.p("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        th1 th1VarI = vh1Var.c().i("androidx.lifecycle.internal.SavedStateHandlesProvider");
        qh1 qh1Var = th1VarI instanceof qh1 ? (qh1) th1VarI : null;
        if (qh1Var == null) {
            yc.l("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = w(t62Var).b;
        oh1 oh1Var = (oh1) linkedHashMap2.get(str);
        if (oh1Var != null) {
            return oh1Var;
        }
        qh1Var.b();
        Bundle bundle3 = qh1Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = s22.j((j41[]) Arrays.copyOf(new j41[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                qh1Var.c = null;
            }
            bundle = bundle4;
        }
        oh1 oh1VarJ = pd1.j(bundle, bundle2);
        linkedHashMap2.put(str, oh1VarJ);
        return oh1VarJ;
    }

    public static final tv0 o(tv0 tv0Var, boolean z, jx0 jx0Var) {
        return tv0Var.c(z ? new y80(jx0Var) : qv0.a);
    }

    public static final hx0 p(ul1 ul1Var, sa0 sa0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            rl1 rl1VarA = ul1Var.a();
            ql0 ql0Var = rl1VarA.c;
            if (ql0Var.K() && ql0Var.J()) {
                pc1 pc1VarG = rl1VarA.g();
                hx0 hx0Var = new hx0(48);
                y41 y41Var = new y41(10);
                y41Var.C(lk.e0(pc1VarG));
                s(sa0Var, hx0Var, new y41(10), y41Var, rl1VarA, rl1VarA);
                return hx0Var;
            }
            hx0 hx0Var2 = nh0.a;
            hx0Var2.getClass();
            return hx0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void q(sa0 sa0Var, hx0 hx0Var, y41 y41Var, y41 y41Var2, rl1 rl1Var, rl1 rl1Var2) {
        y41 y41Var3 = y41Var;
        Region region = (Region) y41Var3.f;
        y41 y41Var4 = y41Var2;
        Region region2 = (Region) y41Var4.f;
        ql0 ql0Var = rl1Var2.c;
        ql0 ql0Var2 = rl1Var2.c;
        if (!ql0Var.K() || !ql0Var2.J() || region2.isEmpty()) {
            if (rl1Var2.o()) {
                r(hx0Var, rl1Var, rl1Var2);
                return;
            }
            return;
        }
        pc1 pc1VarM = rl1Var2.m();
        if (pc1VarM.f()) {
            Object objF = rl1Var2.f();
            if (objF == null) {
                tg0 tg0Var = ql0Var2.I.c;
                pc1VarM = al.w(tg0Var).I(tg0Var, false);
            } else {
                sv0 sv0Var = ((sv0) objF).e;
                Object objG = rl1Var2.d.e.g(ml1.b);
                if (objG == null) {
                    objG = null;
                }
                pc1VarM = kd1.j(sv0Var, objG != null, false);
            }
        }
        sh0 sh0VarE0 = lk.e0(pc1VarM);
        y41Var3.C(sh0VarE0);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = rl1Var2.f;
            if (i2 == rl1Var.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            hx0Var.i(i2, new tl1(rl1Var2, new sh0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listJ = rl1.j(4, rl1Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) sa0Var.i(listJ.get(size))).booleanValue()) {
                    q(sa0Var, hx0Var, y41Var3, y41Var4, rl1Var, (rl1) listJ.get(size));
                }
                size--;
                y41Var3 = y41Var;
                y41Var4 = y41Var2;
            }
            if (z(rl1Var2)) {
                region2.op(sh0VarE0.a, sh0VarE0.b, sh0VarE0.c, sh0VarE0.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void r(hx0 hx0Var, rl1 rl1Var, rl1 rl1Var2) {
        ql0 ql0Var;
        rl1 rl1VarL = rl1Var2.l();
        pc1 pc1VarG = (rl1VarL == null || (ql0Var = rl1VarL.c) == null || !ql0Var.K()) ? q : rl1VarL.g();
        int i2 = rl1Var2.f;
        if (i2 == rl1Var.f) {
            i2 = -1;
        }
        hx0Var.i(i2, new tl1(rl1Var2, lk.e0(pc1VarG)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(sa0 sa0Var, hx0 hx0Var, y41 y41Var, y41 y41Var2, rl1 rl1Var, rl1 rl1Var2) {
        boolean z;
        pc1 pc1VarJ;
        c01 c01VarD;
        sa0 sa0Var2 = sa0Var;
        hx0 hx0Var2 = hx0Var;
        int i2 = rl1Var.f;
        Region region = (Region) y41Var.f;
        y41 y41Var3 = y41Var2;
        Region region2 = (Region) y41Var3.f;
        ql0 ql0Var = rl1Var2.c;
        nl1 nl1Var = rl1Var2.d;
        ql0 ql0Var2 = rl1Var2.c;
        int i3 = rl1Var2.f;
        boolean z2 = (ql0Var.K() && ql0Var2.J()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z2 || rl1Var2.o()) {
                sh0 sh0VarE0 = lk.e0(rl1Var2.m());
                y41Var.C(sh0VarE0);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (rl1Var2.o()) {
                        r(hx0Var2, rl1Var, rl1Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            hx0Var2.i(i3, new tl1(rl1Var2, new sh0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                hx0Var2.i(i3, new tl1(rl1Var2, new sh0(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = rl1.j(4, rl1Var2);
                if (nl1Var.g) {
                    rl1 rl1VarL = rl1Var2.l();
                    while (true) {
                        if (rl1VarL == null) {
                            rl1VarL = null;
                            break;
                        }
                        zx0 zx0Var = rl1VarL.d.e;
                        if (zx0Var.c(vl1.w) || zx0Var.c(vl1.v)) {
                            break;
                        } else {
                            rl1VarL = rl1VarL.l();
                        }
                    }
                    if (rl1VarL == null) {
                        z = false;
                        if (z) {
                            y41 y41Var4 = new y41(10);
                            Object objF = rl1Var2.f();
                            if (objF == null) {
                                tg0 tg0Var = ql0Var2.I.c;
                                pc1VarJ = al.w(tg0Var).I(tg0Var, false);
                            } else {
                                sv0 sv0Var = ((sv0) objF).e;
                                Object objG = nl1Var.e.g(ml1.b);
                                pc1VarJ = kd1.j(sv0Var, (objG == null ? null : objG) != null, false);
                            }
                            y41Var4.C(lk.e0(pc1VarJ));
                            int size = listJ.size() - 1;
                            while (-1 < size) {
                                if (!((Boolean) sa0Var2.i(listJ.get(size))).booleanValue()) {
                                    q(sa0Var2, hx0Var2, new y41(10), y41Var4, rl1Var, (rl1) listJ.get(size));
                                }
                                size--;
                                hx0Var2 = hx0Var;
                            }
                        } else {
                            int size2 = listJ.size() - 1;
                            while (-1 < size2) {
                                if (!((Boolean) sa0Var2.i(listJ.get(size2))).booleanValue()) {
                                    s(sa0Var2, hx0Var, y41Var, y41Var3, rl1Var, (rl1) listJ.get(size2));
                                }
                                size2--;
                                sa0Var2 = sa0Var;
                                y41Var3 = y41Var2;
                            }
                        }
                    } else {
                        c01 c01VarD2 = rl1Var2.d();
                        if (c01VarD2 == null) {
                            c01VarD2 = null;
                            c01VarD = rl1VarL.d();
                            if (c01VarD == null) {
                                c01VarD = null;
                                if (c01VarD2 == null && c01VarD != null) {
                                    pc1 pc1VarI = c01VarD.I(c01VarD2, false);
                                    z = !pc1VarI.equals(pc1VarI.e(qc1.a(0L, xk.P(c01VarD.g))));
                                }
                                if (z) {
                                }
                            } else {
                                if (!c01VarD.W0().r) {
                                    c01VarD = null;
                                }
                                if (c01VarD == null) {
                                }
                                if (c01VarD2 == null) {
                                    z = false;
                                    if (z) {
                                    }
                                }
                            }
                        } else {
                            if (!c01VarD2.W0().r) {
                                c01VarD2 = null;
                            }
                            if (c01VarD2 == null) {
                            }
                            c01VarD = rl1VarL.d();
                            if (c01VarD == null) {
                            }
                        }
                    }
                }
                if (z(rl1Var2)) {
                    region2.op(sh0VarE0.a, sh0VarE0.b, sh0VarE0.c, sh0VarE0.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList t(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        ie1 ie1Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        je1 je1Var = new je1(resources, theme);
        synchronized (ke1.c) {
            try {
                SparseArray sparseArray = (SparseArray) ke1.b.get(je1Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (ie1Var = (ie1) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (ie1Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || ie1Var.c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = ie1Var.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = ke1.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = wm.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (ke1.c) {
            try {
                WeakHashMap weakHashMap = ke1.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(je1Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(je1Var, sparseArray2);
                }
                sparseArray2.append(i2, new ie1(colorStateListA, je1Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListA;
    }

    public static Drawable u(Context context, int i2) {
        return he1.c().d(context, i2);
    }

    public static final Object v(Object obj) {
        if (obj instanceof xj) {
            return null;
        }
        return obj;
    }

    public static final rh1 w(t62 t62Var) {
        qt0 qt0VarE = i32.e(t62Var, new sw(1), 4);
        return (rh1) ((vu) qt0VarE.f).h(ad1.a(rh1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final tv0 x() {
        return new ni0();
    }

    public static final boolean y(rl1 rl1Var) {
        c01 c01VarD = rl1Var.d();
        zx0 zx0Var = rl1Var.d.e;
        return (c01VarD != null ? c01VarD.e1() : false) || zx0Var.c(vl1.q) || zx0Var.c(vl1.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean z(rl1 rl1Var) {
        if (!y(rl1Var)) {
            nl1 nl1Var = rl1Var.d;
            if (nl1Var.g) {
                return true;
            }
            zx0 zx0Var = nl1Var.e;
            Object[] objArr = zx0Var.b;
            Object[] objArr2 = zx0Var.c;
            long[] jArr = zx0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((zl1) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public abstract void G(m0 m0Var, m0 m0Var2);

    public abstract void H(m0 m0Var, Thread thread);

    public abstract boolean k(n0 n0Var, j0 j0Var);

    public abstract boolean l(n0 n0Var, Object obj, Object obj2);

    public abstract boolean m(n0 n0Var, m0 m0Var, m0 m0Var2);
}
