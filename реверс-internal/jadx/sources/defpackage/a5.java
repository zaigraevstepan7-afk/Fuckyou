package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a5 implements iw, View.OnAttachStateChangeListener, Runnable {
    public final h4 e;
    public final w3 f;
    public xg0 g;
    public final sx0 h = new sx0();
    public final long i = 100;
    public x4 j = x4.e;
    public boolean k = true;
    public long l;
    public hx0 m;
    public long n;
    public final hx0 o;
    public sl1 p;
    public boolean q;

    public a5(h4 h4Var, w3 w3Var) {
        this.e = h4Var;
        this.f = w3Var;
        new Handler(Looper.getMainLooper());
        hx0 hx0Var = nh0.a;
        hx0Var.getClass();
        this.m = hx0Var;
        this.o = new hx0();
        this.p = new sl1(h4Var.getSemanticsOwner().a(), hx0Var);
    }

    @Override // defpackage.iw
    public final void a(xo0 xo0Var) {
        l(this.e.getSemanticsOwner().a());
        g();
        this.g = null;
    }

    @Override // defpackage.iw
    public final void b(xo0 xo0Var) {
        this.g = (xg0) this.f.a();
        k(-1, this.e.getSemanticsOwner().a());
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(mh0 mh0Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        mh0 mh0Var2 = mh0Var;
        int[] iArr3 = mh0Var2.b;
        long[] jArr = mh0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        sl1 sl1Var = (sl1) this.o.b(i7);
                        tl1 tl1Var = (tl1) mh0Var2.b(i7);
                        rl1 rl1Var = tl1Var != null ? tl1Var.a : null;
                        if (rl1Var == null) {
                            throw s91.g("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = rl1Var.f;
                        zx0 zx0Var = rl1Var.d.e;
                        if (sl1Var == null) {
                            Object[] objArr = zx0Var.b;
                            long[] jArr2 = zx0Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                zl1 zl1Var = (zl1) objArr[(i10 << 3) + i12];
                                                zl1 zl1Var2 = vl1.C;
                                                if (xi0.o(zl1Var, zl1Var2)) {
                                                    Object objG = zx0Var.g(zl1Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    j(String.valueOf(list != null ? (hb) pl.d0(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = zx0Var.b;
                            long[] jArr3 = zx0Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                zl1 zl1Var3 = (zl1) objArr2[(i13 << 3) + i15];
                                                zl1 zl1Var4 = vl1.C;
                                                if (xi0.o(zl1Var3, zl1Var4)) {
                                                    Object objG2 = sl1Var.a.e.g(zl1Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    hb hbVar = list2 != null ? (hb) pl.d0(list2) : null;
                                                    Object objG3 = zx0Var.g(zl1Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    hb hbVar2 = list3 != null ? (hb) pl.d0(list3) : null;
                                                    if (!xi0.o(hbVar, hbVar2)) {
                                                        j(String.valueOf(hbVar2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 == length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    mh0Var2 = mh0Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            mh0Var2 = mh0Var;
            iArr3 = iArr;
        }
    }

    public final mh0 f() {
        if (this.k) {
            this.k = false;
            this.m = nu0.p(this.e.getSemanticsOwner(), a4.j);
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    public final void g() {
        xg0 xg0Var = this.g;
        if (xg0Var == null) {
            return;
        }
        Object obj = xg0Var.g;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        sx0 sx0Var = this.h;
        if (sx0Var.i()) {
            Object[] objArr = sx0Var.a;
            int i = sx0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                or orVar = (or) objArr[i2];
                int iOrdinal = orVar.c.ordinal();
                if (iOrdinal == 0) {
                    y41 y41Var = orVar.d;
                    if (y41Var != null) {
                        ViewStructure viewStructure = (ViewStructure) y41Var.f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            qr.d(m3.f(obj), viewStructure);
                        }
                    }
                } else {
                    if (iOrdinal != 1) {
                        ez1.a();
                        return;
                    }
                    AutofillId autofillIdZ = xg0Var.z(orVar.a);
                    if (autofillIdZ != null && Build.VERSION.SDK_INT >= 29) {
                        qr.e(m3.f(obj), autofillIdZ);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                qr.g(m3.f(obj), ((View) xg0Var.f).getAutofillId(), new long[]{Long.MIN_VALUE});
            }
            sx0Var.d();
        }
    }

    public final void h() {
        Handler handler = this.e.getHandler();
        if (handler == null || this.g == null || this.q) {
            return;
        }
        this.q = true;
        long jUptimeMillis = (this.l + this.i) - SystemClock.uptimeMillis();
        if (jUptimeMillis <= 0) {
            handler.post(this);
        } else {
            handler.postDelayed(this, jUptimeMillis);
        }
    }

    public final void i(rl1 rl1Var, sl1 sl1Var) {
        int i = 0;
        z4 z4Var = new z4(i, sl1Var, this);
        rl1Var.getClass();
        List listJ = rl1.j(4, rl1Var);
        int size = listJ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listJ.get(i3);
            if (f().a(((rl1) obj).f)) {
                z4Var.h(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listJ2 = rl1.j(4, rl1Var);
        int size2 = listJ2.size();
        while (i < size2) {
            rl1 rl1Var2 = (rl1) listJ2.get(i);
            mh0 mh0VarF = f();
            int i4 = rl1Var2.f;
            if (mh0VarF.a(i4)) {
                hx0 hx0Var = this.o;
                if (hx0Var.a(i4)) {
                    Object objB = hx0Var.b(i4);
                    if (objB == null) {
                        throw s91.g("node not present in pruned tree before this change");
                    }
                    i(rl1Var2, (sl1) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void j(String str, int i) {
        xg0 xg0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (xg0Var = this.g) != null) {
            AutofillId autofillIdZ = xg0Var.z(i);
            if (autofillIdZ == null) {
                throw s91.g("Invalid content capture ID");
            }
            if (i2 >= 29) {
                qr.f(m3.f(xg0Var.g), autofillIdZ, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, rl1 rl1Var) {
        sa0 sa0Var;
        int i2;
        pc1 pc1VarA;
        y41 y41Var;
        String strH;
        sa0 sa0Var2;
        if (this.g != null) {
            zx0 zx0Var = rl1Var.d.e;
            Object objG = zx0Var.g(vl1.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.j == x4.e && xi0.o(bool, Boolean.TRUE)) {
                Object objG2 = zx0Var.g(ml1.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                r0 r0Var = (r0) objG2;
                if (r0Var != null && (sa0Var2 = (sa0) r0Var.b) != null) {
                }
            } else if (this.j == x4.f && xi0.o(bool, Boolean.FALSE)) {
                Object objG3 = zx0Var.g(ml1.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                r0 r0Var2 = (r0) objG3;
                if (r0Var2 != null && (sa0Var = (sa0) r0Var2.b) != null) {
                }
            }
            int i3 = rl1Var.f;
            xg0 xg0Var = this.g;
            if (xg0Var != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.e.getAutofillId();
                rl1 rl1VarL = rl1Var.l();
                int i4 = rl1Var.f;
                if (rl1VarL == null || (autofillId = xg0Var.z(rl1VarL.f)) != null) {
                    y41 y41Var2 = i2 >= 29 ? new y41(25, qr.c(m3.f(xg0Var.g), autofillId, i4)) : null;
                    if (y41Var2 == null) {
                        y41Var = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) y41Var2.f;
                        nl1 nl1Var = rl1Var.d;
                        zl1 zl1Var = vl1.L;
                        zx0 zx0Var2 = nl1Var.e;
                        if (!zx0Var2.c(zl1Var)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.n);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objG4 = zx0Var2.g(vl1.A);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            String str = (String) objG4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objG5 = zx0Var2.g(vl1.n);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (((Boolean) objG5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objG6 = zx0Var2.g(vl1.C);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            List list = (List) objG6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(vq0.a(list, "\n", null, 62));
                            }
                            Object objG7 = zx0Var2.g(vl1.G);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            hb hbVar = (hb) objG7;
                            if (hbVar != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(hbVar);
                            }
                            Object objG8 = zx0Var2.g(vl1.a);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            List list2 = (List) objG8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(vq0.a(list2, "\n", null, 62));
                            }
                            Object objG9 = zx0Var2.g(vl1.z);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            yf1 yf1Var = (yf1) objG9;
                            if (yf1Var != null && (strH = xc.H(yf1Var.a)) != null) {
                                viewStructure.setClassName(strH);
                            }
                            pz1 pz1VarW = xc.w(nl1Var);
                            if (pz1VarW != null) {
                                oz1 oz1Var = pz1VarW.a;
                                d02 d02Var = oz1Var.b;
                                hx hxVar = oz1Var.g;
                                viewStructure.setTextStyle(hxVar.l() * hxVar.b() * g02.c(d02Var.a.b), 0, 0, 0);
                            }
                            c01 c01VarD = rl1Var.d();
                            if (c01VarD == null) {
                                pc1VarA = pc1.e;
                                float f = pc1VarA.a;
                                float f2 = pc1VarA.b;
                                viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (pc1VarA.c - f), (int) (pc1VarA.d - f2));
                                y41Var = y41Var2;
                            } else {
                                c01 c01Var = c01VarD.W0().r ? c01VarD : null;
                                if (c01Var != null) {
                                    pc1VarA = rl1Var.a(c01Var);
                                }
                                float f3 = pc1VarA.a;
                                float f22 = pc1VarA.b;
                                viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (pc1VarA.c - f3), (int) (pc1VarA.d - f22));
                                y41Var = y41Var2;
                            }
                        }
                    }
                }
            }
            if (y41Var != null) {
                this.h.a(new or(i3, this.n, pr.e, y41Var));
            }
            List listJ = rl1.j(4, rl1Var);
            int size = listJ.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listJ.get(i6);
                if (f().a(((rl1) obj).f)) {
                    k(i5, (rl1) obj);
                    i5++;
                }
            }
        }
    }

    public final void l(rl1 rl1Var) {
        if (this.g != null) {
            this.h.a(new or(rl1Var.f, this.n, pr.f, null));
            List listJ = rl1.j(4, rl1Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                l((rl1) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        hx0 hx0Var = this.o;
        hx0Var.c();
        mh0 mh0VarF = f();
        int[] iArr = mh0VarF.b;
        Object[] objArr = mh0VarF.c;
        long[] jArr = mh0VarF.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            hx0Var.i(iArr[i4], new sl1(((tl1) objArr[i4]).a, f()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.p = new sl1(this.e.getSemanticsOwner().a(), f());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.e.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long[] jArr;
        long[] jArr2;
        h4 h4Var = this.e;
        this.l = SystemClock.uptimeMillis();
        int i = 0;
        this.q = false;
        if (this.g != null) {
            g();
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                h4Var.r(true);
                hx0 hx0Var = this.o;
                int[] iArr = hx0Var.b;
                long[] jArr3 = hx0Var.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr3[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = i;
                            while (i4 < i3) {
                                if ((255 & j) < 128) {
                                    int i5 = iArr[(i2 << 3) + i4];
                                    if (f().a(i5)) {
                                        jArr2 = jArr3;
                                    } else {
                                        jArr2 = jArr3;
                                        this.h.a(new or(i5, this.n, pr.f, null));
                                        h();
                                    }
                                }
                                j >>= 8;
                                i4++;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        jArr3 = jArr;
                        i = 0;
                    }
                }
                Trace.beginSection("ContentCapture:sendAppearEvents");
                i(h4Var.getSemanticsOwner().a(), this.p);
                Trace.endSection();
                d(f());
                m();
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
