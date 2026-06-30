package defpackage;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p7 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p7(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    @Override // defpackage.ha0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() throws Throwable {
        ha0 ha0Var;
        Object obj;
        boolean z = true;
        switch (this.e) {
            case 0:
                al.C((q7) this.f);
                return t32.a;
            case 1:
                return ((lw1) this.f).t0();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                Activity activity = (Activity) this.f;
                if (activity != null) {
                    activity.finishAndRemoveTask();
                }
                return t32.a;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return (pc1) this.f;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((jo0) this.f).d();
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new ky1((k31) this.f, 0.0f);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ww1) this.f).close();
                return t32.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                File file = (File) this.f;
                synchronized (b60.d) {
                    b60.c.remove(file.getAbsolutePath());
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(kd1.l(((vt) this.f).f()));
            case el.a /* 9 */:
                Object systemService = ((View) ((xg0) this.f).f).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case el.b /* 10 */:
                return Integer.valueOf(((un0) this.f).g().n);
            case 11:
                return new BaseInputConnection(((ko0) this.f).a, false);
            case el.c /* 12 */:
                return new l11((n11) this.f);
            case 13:
                File file2 = (File) ((p7) this.f).a();
                String name = file2.getName();
                name.getClass();
                if (ct1.U(name).equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 14:
                return new File(((Context) this.f).getApplicationContext().getFilesDir(), "datastore/".concat("zenin_prefs".concat(".preferences_pb")));
            case 15:
                gh1 gh1Var = (gh1) this.f;
                yh1 yh1Var = gh1Var.e;
                Object obj2 = gh1Var.h;
                if (obj2 != null) {
                    return yh1Var.f(gh1Var, obj2);
                }
                yc.p("Value should be initialized");
                return null;
            case 16:
                n81 n81Var = ((nh1) this.f).g;
                if (n81Var == null) {
                    return null;
                }
                Bundle bundleJ = s22.j((j41[]) Arrays.copyOf(new j41[0], 0));
                n81Var.l(bundleJ);
                if (bundleJ.isEmpty()) {
                    return null;
                }
                return bundleJ;
            case 17:
                vh1 vh1Var = (vh1) this.f;
                vh1Var.g().a(new oc1(0, vh1Var));
                return t32.a;
            case 18:
                jj1 jj1Var = (jj1) this.f;
                w5 w5Var = (w5) hk.o(jj1Var, s31.a);
                jj1Var.D = w5Var;
                jj1Var.E = w5Var != null ? new v5(w5Var.a, w5Var.b, w5Var.c, w5Var.d) : null;
                return t32.a;
            case 19:
                return (ViewParent) this.f;
            case 20:
                sm1 sm1Var = (sm1) this.f;
                v41 v41Var = sm1Var.g;
                if (((io1) v41Var.getValue()).a == 9205357640488583168L || io1.c(((io1) v41Var.getValue()).a)) {
                    return null;
                }
                return sm1Var.e.c(((io1) v41Var.getValue()).a);
            case 21:
                hp1 hp1Var = (hp1) this.f;
                if (!((Boolean) hp1Var.n.getValue()).booleanValue() && (ha0Var = hp1Var.a) != null) {
                    ha0Var.a();
                }
                return t32.a;
            case 22:
                qq1 qq1Var = (qq1) this.f;
                while (true) {
                    Object obj3 = qq1Var.g;
                    synchronized (obj3) {
                        try {
                            if (qq1Var.c) {
                                obj = obj3;
                            } else {
                                qq1Var.c = z;
                                try {
                                    iy0 iy0Var = qq1Var.f;
                                    Object[] objArr = iy0Var.e;
                                    int i = iy0Var.g;
                                    int i2 = 0;
                                    while (i2 < i) {
                                        pq1 pq1Var = (pq1) objArr[i2];
                                        ay0 ay0Var = pq1Var.g;
                                        sa0 sa0Var = pq1Var.a;
                                        Object[] objArr2 = ay0Var.b;
                                        long[] jArr = ay0Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i3 = 0;
                                            while (true) {
                                                long j = jArr[i3];
                                                obj = obj3;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                    for (int i5 = 0; i5 < i4; i5++) {
                                                        if ((j & 255) < 128) {
                                                            try {
                                                                sa0Var.i(objArr2[(i3 << 3) + i5]);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                qq1Var.c = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i4 == 8) {
                                                        if (i3 != length) {
                                                            i3++;
                                                            obj3 = obj;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        ay0Var.b();
                                        i2++;
                                        obj3 = obj;
                                    }
                                    obj = obj3;
                                    try {
                                        qq1Var.c = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj3;
                                }
                            }
                            if (!qq1Var.b()) {
                                return t32.a;
                            }
                            z = true;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj3;
                        }
                    }
                }
                break;
            case 23:
                xt1 xt1Var = (xt1) this.f;
                nc0 nc0Var = xt1Var.z;
                if (nc0Var != null) {
                    return nc0Var;
                }
                nc0 nc0VarC = ((h4) bl.Q(xt1Var)).getGraphicsContext().c();
                xt1Var.z = nc0VarC;
                return nc0VarC;
            case 24:
                af1.A(((RemoteAction) this.f).getActionIntent());
                return t32.a;
            case 25:
                zw1 zw1Var = (zw1) this.f;
                return zw1Var.r ? ef1.c(zw1Var) : kw1.b;
            case 26:
                return new tz(xk.A(24.0f, 16.0f, ((rx1) this.f).a()));
            case 27:
                c02 c02Var = (c02) this.f;
                c02Var.C = null;
                kd1.t(c02Var);
                el.D(c02Var);
                al.C(c02Var);
                return Boolean.TRUE;
            case 28:
                ((d12) this.f).R.i(Boolean.valueOf(!r0.Q));
                return t32.a;
            default:
                return Float.valueOf(lk.z(((x2) this.f).c.floatValue(), 0.0f, 1.0f));
        }
    }
}
