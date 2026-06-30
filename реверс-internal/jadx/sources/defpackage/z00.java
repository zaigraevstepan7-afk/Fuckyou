package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z00 extends yw implements p81, cg0, vp, e10 {
    public boolean A;
    public boolean B;
    public c00 C;
    public long D = 0;
    public bc0 E;
    public bc0 F;
    public f00 G;
    public e00 H;
    public d00 I;
    public xk J;
    public y41 K;
    public m12 L;
    public bg0 M;
    public k31 u;
    public sa0 v;
    public boolean w;
    public jx0 x;
    public rh y;
    public b10 z;

    public z00(sa0 sa0Var, boolean z, jx0 jx0Var, k31 k31Var) {
        this.u = k31Var;
        this.v = sa0Var;
        this.w = z;
        this.x = jx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O0(z00 z00Var, ls lsVar) throws Throwable {
        v00 v00Var;
        if (lsVar instanceof v00) {
            v00Var = (v00) lsVar;
            int i = v00Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                v00Var.j = i - Integer.MIN_VALUE;
            } else {
                v00Var = new v00(z00Var, lsVar);
            }
        }
        Object obj = v00Var.h;
        int i2 = v00Var.j;
        if (i2 == 0) {
            xc.G(obj);
            b10 b10Var = z00Var.z;
            if (b10Var != null) {
                jx0 jx0Var = z00Var.x;
                if (jx0Var != null) {
                    a10 a10Var = new a10(b10Var);
                    v00Var.j = 1;
                    Object objA = jx0Var.a(a10Var, v00Var);
                    wt wtVar = wt.e;
                    if (objA == wtVar) {
                        return wtVar;
                    }
                }
            }
            z00Var.Y0(new j00(0L, false));
            return t32.a;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xc.G(obj);
        z00Var.z = null;
        z00Var.Y0(new j00(0L, false));
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P0(z00 z00Var, i00 i00Var, ls lsVar) {
        w00 w00Var;
        jx0 jx0Var;
        b10 b10Var;
        i00 i00Var2;
        b10 b10Var2;
        if (lsVar instanceof w00) {
            w00Var = (w00) lsVar;
            int i = w00Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                w00Var.l = i - Integer.MIN_VALUE;
            } else {
                w00Var = new w00(z00Var, lsVar);
            }
        }
        Object obj = w00Var.j;
        int i2 = w00Var.l;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(obj);
            b10 b10Var3 = z00Var.z;
            if (b10Var3 != null && (jx0Var = z00Var.x) != null) {
                a10 a10Var = new a10(b10Var3);
                w00Var.h = i00Var;
                w00Var.l = 1;
                if (jx0Var.a(a10Var, w00Var) != wtVar) {
                }
                return wtVar;
            }
            z00Var.z = b10Var;
            z00Var.X0(i00Var.a);
            return t32.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b10Var2 = w00Var.i;
            i00Var2 = w00Var.h;
            xc.G(obj);
            b10Var = b10Var2;
            i00Var = i00Var2;
            z00Var.z = b10Var;
            z00Var.X0(i00Var.a);
            return t32.a;
        }
        i00Var = w00Var.h;
        xc.G(obj);
        b10Var = new b10();
        jx0 jx0Var2 = z00Var.x;
        if (jx0Var2 != null) {
            w00Var.h = i00Var;
            w00Var.i = b10Var;
            w00Var.l = 2;
            if (jx0Var2.a(b10Var, w00Var) != wtVar) {
                i00Var2 = i00Var;
                b10Var2 = b10Var;
                b10Var = b10Var2;
                i00Var = i00Var2;
            }
            return wtVar;
        }
        z00Var.z = b10Var;
        z00Var.X0(i00Var.a);
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q0(z00 z00Var, j00 j00Var, ls lsVar) throws Throwable {
        x00 x00Var;
        if (lsVar instanceof x00) {
            x00Var = (x00) lsVar;
            int i = x00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                x00Var.k = i - Integer.MIN_VALUE;
            } else {
                x00Var = new x00(z00Var, lsVar);
            }
        }
        Object obj = x00Var.i;
        int i2 = x00Var.k;
        if (i2 == 0) {
            xc.G(obj);
            b10 b10Var = z00Var.z;
            if (b10Var != null) {
                jx0 jx0Var = z00Var.x;
                if (jx0Var != null) {
                    c10 c10Var = new c10(b10Var);
                    x00Var.h = j00Var;
                    x00Var.k = 1;
                    Object objA = jx0Var.a(c10Var, x00Var);
                    wt wtVar = wt.e;
                    if (objA == wtVar) {
                        return wtVar;
                    }
                }
            }
            z00Var.Y0(j00Var);
            return t32.a;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j00Var = x00Var.h;
        xc.G(obj);
        z00Var.z = null;
        z00Var.Y0(j00Var);
        return t32.a;
    }

    public static void V0(z00 z00Var, l81 l81Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        e00 e00Var = z00Var.H;
        if (e00Var == null) {
            e00Var = new e00();
            e00Var.c = null;
            e00Var.d = Long.MAX_VALUE;
            e00Var.e = false;
            z00Var.H = e00Var;
        }
        e00Var.c = l81Var;
        e00Var.d = j;
        m12 m12Var = z00Var.L;
        k31 k31Var = z00Var.u;
        if (m12Var == null) {
            z00Var.L = new m12(k31Var);
        } else {
            m12Var.a = k31Var;
            m12Var.b = j2;
        }
        e00Var.e = false;
        z00Var.J = e00Var;
    }

    @Override // defpackage.cg0
    public final void C() {
        bg0 bg0Var = this.M;
        if (bg0Var != null) {
            bg0Var.a();
            z00 z00Var = bg0Var.e;
            if (z00Var.A) {
                z00Var.W0(g00.a);
            }
            bg0Var.k = null;
            qn qnVar = bg0Var.n;
            qnVar.a = 0;
            ((kx0) qnVar.b).b = 0;
        }
    }

    @Override // defpackage.sv0
    public final void E0() {
        this.A = false;
        R0();
        bc0 bc0Var = this.F;
        if (bc0Var != null) {
            M0(bc0Var);
        }
        bc0 bc0Var2 = this.E;
        if (bc0Var2 != null) {
            M0(bc0Var2);
        }
        this.F = null;
        this.E = null;
    }

    @Override // defpackage.cg0
    public final void F(g6 g6Var, f81 f81Var) {
        Object obj;
        Object obj2;
        char c;
        long j;
        float f;
        float fIntBitsToFloat;
        bg0 bg0Var;
        Object obj3;
        f81 f81Var2;
        bg0 bg0Var2;
        Object obj4;
        Object obj5;
        int i = g6Var.a;
        ArrayList arrayList = (ArrayList) g6Var.b;
        if (this.w) {
            if (this.M == null) {
                this.M = new bg0(this);
            }
            if (this.F == null) {
                bg0 bg0Var3 = this.M;
                bg0Var3.getClass();
                bc0 bc0Var = new bc0(bg0Var3);
                L0(bc0Var);
                this.F = bc0Var;
            }
            bg0 bg0Var4 = this.M;
            if (bg0Var4 != null) {
                z00 z00Var = bg0Var4.e;
                if (bg0Var4.j == null) {
                    wf0 wf0Var = bg0Var4.f;
                    if (wf0Var == null) {
                        wf0Var = new wf0();
                        wf0Var.c = vf0.g;
                        wf0Var.d = false;
                        wf0Var.e = false;
                        bg0Var4.f = wf0Var;
                    }
                    bg0Var4.j = wf0Var;
                }
                xk xkVar = bg0Var4.j;
                if (xkVar == null) {
                    yc.p("currentDragState should not be null");
                    return;
                }
                boolean z = xkVar instanceof wf0;
                f81 f81Var3 = f81.e;
                boolean z2 = true;
                f81 f81Var4 = f81.f;
                if (z) {
                    wf0 wf0Var2 = (wf0) xkVar;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!al.m((uf0) arrayList.get(i2))) {
                            return;
                        }
                    }
                    uf0 uf0Var = (uf0) pl.c0(arrayList);
                    int i3 = ag0.a[wf0Var2.c.ordinal()];
                    vf0 vf0Var = vf0.f;
                    vf0 vf0Var2 = vf0.e;
                    vf0 vf0Var3 = i3 == 1 ? !z00Var.d1() ? vf0Var2 : vf0Var : wf0Var2.c;
                    wf0Var2.c = vf0Var3;
                    if (f81Var == f81Var3) {
                        if (vf0Var3 == vf0Var) {
                            uf0Var.i = true;
                            wf0Var2.d = true;
                        }
                        wf0Var2.e = true;
                    }
                    if (f81Var == f81Var4) {
                        if (vf0Var3 == vf0Var2) {
                            bg0.c(bg0Var4, uf0Var, uf0Var.a, 0L, 12);
                            return;
                        }
                        if (wf0Var2.d) {
                            bg0Var4.f(uf0Var, uf0Var, new tf0(i), 0L);
                            bg0Var4.e(uf0Var, new tf0(i), 0L);
                            long j2 = uf0Var.a;
                            zf0 zf0Var = bg0Var4.g;
                            if (zf0Var == null) {
                                zf0Var = new zf0();
                                zf0Var.c = Long.MAX_VALUE;
                                bg0Var4.g = zf0Var;
                            }
                            zf0Var.c = j2;
                            bg0Var4.j = zf0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = xkVar instanceof yf0;
                f81 f81Var5 = f81.g;
                if (z3) {
                    yf0 yf0Var = (yf0) xkVar;
                    if (f81Var == f81Var3) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            bg0Var = bg0Var4;
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i4);
                        bg0Var = bg0Var4;
                        if (al.v(((uf0) obj3).a, yf0Var.d)) {
                            break;
                        }
                        i4++;
                        bg0Var4 = bg0Var;
                    }
                    uf0 uf0Var2 = (uf0) obj3;
                    if (uf0Var2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = arrayList.get(i5);
                            if (((uf0) obj5).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        uf0Var2 = (uf0) obj5;
                        if (uf0Var2 == null) {
                            bg0Var.a();
                            return;
                        }
                        yf0Var.d = uf0Var2.a;
                    }
                    uf0 uf0Var3 = uf0Var2;
                    if (f81Var != f81Var4) {
                        f81Var2 = f81Var5;
                        bg0Var2 = bg0Var;
                    } else if (uf0Var3.i) {
                        f81Var2 = f81Var5;
                        bg0Var2 = bg0Var;
                        uf0 uf0Var4 = yf0Var.c;
                        if (uf0Var4 == null) {
                            yc.p("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = yf0Var.d;
                        m12 m12Var = bg0Var2.l;
                        if (m12Var == null) {
                            yc.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        bg0Var2.b(uf0Var4, j3, m12Var);
                    } else if (al.d(uf0Var3)) {
                        int size4 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = arrayList.get(i6);
                            if (((uf0) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i6++;
                        }
                        uf0 uf0Var5 = (uf0) obj4;
                        if (uf0Var5 == null) {
                            bg0Var.a();
                        } else {
                            yf0Var.d = uf0Var5.a;
                        }
                        f81Var2 = f81Var5;
                        bg0Var2 = bg0Var;
                    } else {
                        j62 j62Var = (j62) hk.o(z00Var, aq.t);
                        float f2 = s00.a;
                        float fD = j62Var.d();
                        bg0Var2 = bg0Var;
                        m12 m12Var2 = bg0Var2.l;
                        if (m12Var2 == null) {
                            yc.p("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = m12.a(m12Var2, al.J(uf0Var3, z00Var.u, new tf0(i), true), fD);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            uf0Var3.i = true;
                            uf0 uf0Var6 = yf0Var.c;
                            uf0Var6.getClass();
                            f81Var2 = f81Var5;
                            bg0Var2.f(uf0Var6, uf0Var3, new tf0(i), jA);
                            bg0Var2.e(uf0Var3, new tf0(i), jA);
                            long j4 = uf0Var3.a;
                            zf0 zf0Var2 = bg0Var2.g;
                            if (zf0Var2 == null) {
                                zf0Var2 = new zf0();
                                zf0Var2.c = Long.MAX_VALUE;
                                bg0Var2.g = zf0Var2;
                            }
                            zf0Var2.c = j4;
                            bg0Var2.j = zf0Var2;
                        } else {
                            f81Var2 = f81Var5;
                            yf0Var.e = true;
                        }
                    }
                    if (f81Var == f81Var2 && yf0Var.e) {
                        if (!uf0Var3.i) {
                            yf0Var.e = false;
                            return;
                        }
                        uf0 uf0Var7 = yf0Var.c;
                        if (uf0Var7 == null) {
                            yc.p("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j5 = yf0Var.d;
                        m12 m12Var3 = bg0Var2.l;
                        if (m12Var3 != null) {
                            bg0Var2.b(uf0Var7, j5, m12Var3);
                            return;
                        } else {
                            yc.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (xkVar instanceof xf0) {
                    xf0 xf0Var = (xf0) xkVar;
                    if (f81Var != f81Var5) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            break;
                        }
                        if (((uf0) arrayList.get(i7)).i) {
                            z2 = false;
                            break;
                        }
                        i7++;
                    }
                    int size6 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size6) {
                            break;
                        }
                        if (!((uf0) arrayList.get(i8)).d) {
                            i8++;
                        } else if (!arrayList.isEmpty()) {
                            if (z2) {
                                long jL = al.L((uf0) pl.c0(arrayList), z00Var.u, new tf0(i));
                                uf0 uf0Var8 = xf0Var.c;
                                uf0Var8.getClass();
                                long jD = w01.d(jL, al.L(uf0Var8, z00Var.u, new tf0(i)));
                                uf0 uf0Var9 = xf0Var.c;
                                if (uf0Var9 != null) {
                                    bg0.c(bg0Var4, uf0Var9, xf0Var.d, jD, 8);
                                    return;
                                } else {
                                    yc.p("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    bg0Var4.a();
                    return;
                }
                if (!(xkVar instanceof zf0)) {
                    ez1.a();
                    return;
                }
                zf0 zf0Var3 = (zf0) xkVar;
                if (f81Var != f81Var4) {
                    return;
                }
                long j6 = zf0Var3.c;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i9);
                    if (al.v(((uf0) obj).a, j6)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                uf0 uf0Var10 = (uf0) obj;
                if (uf0Var10 == null) {
                    return;
                }
                long j7 = uf0Var10.c;
                boolean zD = al.d(uf0Var10);
                g00 g00Var = g00.a;
                if (!zD) {
                    if (uf0Var10.i) {
                        z00Var.W0(g00Var);
                        return;
                    } else {
                        if (w01.c(al.J(uf0Var10, z00Var.u, new tf0(i), true)) == 0.0f) {
                            return;
                        }
                        bg0Var4.e(uf0Var10, new tf0(i), al.J(uf0Var10, z00Var.u, new tf0(i), false));
                        uf0Var10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i10);
                    if (((uf0) obj2).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                uf0 uf0Var11 = (uf0) obj2;
                if (uf0Var11 != null) {
                    zf0Var3.c = uf0Var11.a;
                    return;
                }
                if (uf0Var10.i || !al.d(uf0Var10)) {
                    z00Var.W0(g00Var);
                } else {
                    y41 y41VarD = bg0Var4.d();
                    k31 k31Var = z00Var.u;
                    qn qnVar = bg0Var4.m;
                    sx0 sx0Var = (sx0) qnVar.b;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                    long j8 = 4294967295L;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    if (al.m(uf0Var10)) {
                        qnVar.a = 0;
                        sx0Var.d();
                    }
                    if (al.d(uf0Var10) || al.m(uf0Var10)) {
                        c = ' ';
                        j = 4294967295L;
                        f = 0.0f;
                    } else {
                        if (sx0Var.b == 3) {
                            int i11 = qnVar.a;
                            qnVar.a = i11 + 1;
                            sx0Var.n(i11, uf0Var10);
                        } else {
                            sx0Var.a(uf0Var10);
                        }
                        if (qnVar.a == 3) {
                            qnVar.a = 0;
                        }
                        Object[] objArr = sx0Var.a;
                        int i12 = sx0Var.b;
                        int i13 = 0;
                        float fIntBitsToFloat4 = 0.0f;
                        while (i13 < i12) {
                            char c3 = c2;
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (((uf0) objArr[i13]).c >> c3)) + fIntBitsToFloat4;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i14 = sx0Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                        Object[] objArr2 = sx0Var.a;
                        float fIntBitsToFloat5 = 0.0f;
                        int i15 = 0;
                        while (i15 < i14) {
                            long j9 = j8;
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((uf0) objArr2[i15]).c & j9));
                            i15++;
                            j8 = j9;
                        }
                        j = j8;
                        fIntBitsToFloat3 = fIntBitsToFloat5 / sx0Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j);
                    if (k31Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                        }
                        jFloatToRawIntBits = k31Var == k31.f ? (((long) Float.floatToRawIntBits(f)) & j) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j);
                    }
                    ((ft0) y41VarD.f).a(uf0Var10.b, jFloatToRawIntBits);
                    float fA = ((j62) hk.o(z00Var, aq.t)).a();
                    long j10 = bg0Var4.d().j(kd1.c(fA, fA));
                    ft0 ft0Var = (ft0) bg0Var4.d().f;
                    q52 q52Var = ft0Var.a;
                    ou[] ouVarArr = q52Var.d;
                    Arrays.fill(ouVarArr, 0, ouVarArr.length, (Object) null);
                    q52Var.e = 0;
                    q52 q52Var2 = ft0Var.b;
                    ou[] ouVarArr2 = q52Var2.d;
                    Arrays.fill(ouVarArr2, 0, ouVarArr2.length, (Object) null);
                    q52Var2.e = 0;
                    ft0Var.c = 0L;
                    z00Var.W0(new j00(g10.a(j10), true));
                }
                bg0Var4.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(e81 e81Var, f81 f81Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        f00 f00Var;
        Object obj4;
        Object obj5;
        boolean z2 = true;
        this.B = true;
        if (this.w) {
            if (this.E == null) {
                bc0 bc0Var = new bc0(this);
                L0(bc0Var);
                this.E = bc0Var;
            }
            int i = 0;
            if (this.J == null) {
                c00 c00Var = this.C;
                if (c00Var == null) {
                    c00Var = new c00();
                    c00Var.c = b00.g;
                    c00Var.d = false;
                    c00Var.e = false;
                    this.C = c00Var;
                }
                this.J = c00Var;
            }
            xk xkVar = this.J;
            if (xkVar == null) {
                yc.p("currentDragState should not be null");
                return;
            }
            boolean z3 = xkVar instanceof c00;
            f81 f81Var2 = f81.e;
            f81 f81Var3 = f81.f;
            if (z3) {
                c00 c00Var2 = (c00) xkVar;
                if (!e81Var.a.isEmpty() && xv1.e(e81Var, false)) {
                    l81 l81Var = (l81) pl.c0(e81Var.a);
                    int i2 = u00.a[c00Var2.c.ordinal()];
                    b00 b00Var = b00.f;
                    b00 b00Var2 = b00.e;
                    b00 b00Var3 = i2 == 1 ? !d1() ? b00Var2 : b00Var : c00Var2.c;
                    c00Var2.c = b00Var3;
                    if (f81Var == f81Var2) {
                        if (b00Var3 == b00Var) {
                            l81Var.a();
                            c00Var2.d = true;
                        }
                        c00Var2.e = true;
                    }
                    if (f81Var == f81Var3) {
                        if (b00Var3 == b00Var2) {
                            V0(this, l81Var, l81Var.a, 0L, 12);
                            return;
                        }
                        if (c00Var2.d) {
                            c1(l81Var, l81Var, 0L);
                            b1(0L, l81Var);
                            long j2 = l81Var.a;
                            f00 f00Var2 = this.G;
                            if (f00Var2 == null) {
                                f00Var2 = new f00();
                                f00Var2.c = Long.MAX_VALUE;
                                this.G = f00Var2;
                            }
                            f00Var2.c = j2;
                            this.J = f00Var2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z4 = xkVar instanceof e00;
            f81 f81Var4 = f81.g;
            if (!z4) {
                if (xkVar instanceof d00) {
                    d00 d00Var = (d00) xkVar;
                    if (f81Var != f81Var4) {
                        return;
                    }
                    List list = e81Var.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (((l81) list.get(i3)).c()) {
                            z2 = false;
                            break;
                        }
                        i3++;
                    }
                    int size2 = list.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!((l81) list.get(i)).d) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z2) {
                                long j3 = ((l81) pl.c0(list)).c;
                                l81 l81Var2 = d00Var.c;
                                l81Var2.getClass();
                                long jD = w01.d(j3, l81Var2.c);
                                l81 l81Var3 = d00Var.c;
                                if (l81Var3 != null) {
                                    V0(this, l81Var3, d00Var.d, jD, 8);
                                    return;
                                } else {
                                    yc.p("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    T0();
                    return;
                }
                if (!(xkVar instanceof f00)) {
                    ez1.a();
                    return;
                }
                f00 f00Var3 = (f00) xkVar;
                if (f81Var != f81Var3) {
                    return;
                }
                long j4 = f00Var3.c;
                List list2 = e81Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (al.v(((l81) obj).a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                l81 l81Var4 = (l81) obj;
                if (l81Var4 == null) {
                    return;
                }
                boolean zT = lk.t(l81Var4);
                Object obj6 = g00.a;
                if (!zT) {
                    if (l81Var4.c()) {
                        Z0().t(obj6);
                        return;
                    } else {
                        if (w01.c(lk.a0(l81Var4, true)) == 0.0f) {
                            return;
                        }
                        b1(lk.a0(l81Var4, false), l81Var4);
                        l81Var4.a();
                        return;
                    }
                }
                List list3 = e81Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i5);
                    if (((l81) obj2).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                l81 l81Var5 = (l81) obj2;
                if (l81Var5 != null) {
                    f00Var3.c = l81Var5.a;
                    return;
                }
                if (l81Var4.c() || !lk.t(l81Var4)) {
                    Z0().t(obj6);
                } else {
                    pd1.h(a1(), l81Var4);
                    float fA = ((j62) hk.o(this, aq.t)).a();
                    long j5 = a1().j(kd1.c(fA, fA));
                    ft0 ft0Var = (ft0) a1().f;
                    q52 q52Var = ft0Var.a;
                    ou[] ouVarArr = q52Var.d;
                    Arrays.fill(ouVarArr, 0, ouVarArr.length, (Object) null);
                    q52Var.e = 0;
                    q52 q52Var2 = ft0Var.b;
                    ou[] ouVarArr2 = q52Var2.d;
                    Arrays.fill(ouVarArr2, 0, ouVarArr2.length, (Object) null);
                    q52Var2.e = 0;
                    ft0Var.c = 0L;
                    Z0().t(new j00(g10.a(j5), false));
                    this.B = false;
                }
                T0();
                return;
            }
            e00 e00Var = (e00) xkVar;
            if (f81Var == f81Var2) {
                return;
            }
            List list4 = e81Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i6);
                if (al.v(((l81) obj3).a, e00Var.d)) {
                    break;
                } else {
                    i6++;
                }
            }
            l81 l81Var6 = (l81) obj3;
            if (l81Var6 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list4.get(i7);
                    if (((l81) obj5).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                l81Var6 = (l81) obj5;
                if (l81Var6 == null) {
                    T0();
                    return;
                }
                e00Var.d = l81Var6.a;
            }
            if (f81Var == f81Var3) {
                if (l81Var6.c()) {
                    l81 l81Var7 = e00Var.c;
                    if (l81Var7 == null) {
                        yc.p("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j6 = e00Var.d;
                    m12 m12Var = this.L;
                    if (m12Var == null) {
                        yc.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    U0(l81Var7, j6, m12Var);
                } else if (lk.t(l81Var6)) {
                    int size7 = list4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj7 = list4.get(i8);
                        if (((l81) obj7).d) {
                            obj4 = obj7;
                            break;
                        }
                        i8++;
                    }
                    l81 l81Var8 = (l81) obj4;
                    if (l81Var8 == null) {
                        T0();
                    } else {
                        e00Var.d = l81Var8.a;
                    }
                } else {
                    float f = s00.f((j62) hk.o(this, aq.t), l81Var6.i);
                    m12 m12Var2 = this.L;
                    if (m12Var2 == null) {
                        yc.p("Touch slop detector not initialized.");
                        return;
                    }
                    long jA = m12.a(m12Var2, lk.a0(l81Var6, true), f);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        this.D = w01.e(this.D, lk.a0(l81Var6, false));
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.D & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r11 >> 32))))) * 57.29578f;
                        k31 k31Var = this.u;
                        if (k31Var == null) {
                            z = true;
                            vc1 vc1Var = new vc1();
                            t00 t00Var = new t00(fAtan2, vc1Var, i);
                            f10 f10Var = g10.a;
                            pd1.t(this, bc0.t, new tq(new n(9, t00Var), 2));
                            if (z && vc1Var.e) {
                                e00Var.e = true;
                            } else {
                                l81Var6.a();
                                l81 l81Var9 = e00Var.c;
                                l81Var9.getClass();
                                c1(l81Var9, l81Var6, jA);
                                b1(jA, l81Var6);
                                long j7 = l81Var6.a;
                                f00Var = this.G;
                                if (f00Var == null) {
                                    f00Var = new f00();
                                    f00Var.c = Long.MAX_VALUE;
                                    this.G = f00Var;
                                }
                                f00Var.c = j7;
                                this.J = f00Var;
                            }
                        } else {
                            f10 f10Var2 = g10.a;
                            if (k31Var != k31.f ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            }
                            vc1 vc1Var2 = new vc1();
                            t00 t00Var2 = new t00(fAtan2, vc1Var2, i);
                            f10 f10Var3 = g10.a;
                            pd1.t(this, bc0.t, new tq(new n(9, t00Var2), 2));
                            if (z) {
                                l81Var6.a();
                                l81 l81Var92 = e00Var.c;
                                l81Var92.getClass();
                                c1(l81Var92, l81Var6, jA);
                                b1(jA, l81Var6);
                                long j72 = l81Var6.a;
                                f00Var = this.G;
                                if (f00Var == null) {
                                }
                                f00Var.c = j72;
                                this.J = f00Var;
                            }
                        }
                    } else {
                        e00Var.e = true;
                        this.D = w01.e(this.D, lk.a0(l81Var6, true));
                    }
                }
            }
            if (f81Var == f81Var4 && e00Var.e) {
                if (!l81Var6.c()) {
                    e00Var.e = false;
                    return;
                }
                l81 l81Var10 = e00Var.c;
                if (l81Var10 == null) {
                    yc.p("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j8 = e00Var.d;
                m12 m12Var3 = this.L;
                if (m12Var3 != null) {
                    U0(l81Var10, j8, m12Var3);
                } else {
                    yc.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public final void R0() {
        b10 b10Var = this.z;
        if (b10Var != null) {
            jx0 jx0Var = this.x;
            if (jx0Var != null) {
                jx0Var.b(new a10(b10Var));
            }
            this.z = null;
        }
    }

    public abstract Object S0(y00 y00Var, y00 y00Var2);

    public final void T0() {
        this.D = 0L;
        c00 c00Var = this.C;
        b00 b00Var = b00.g;
        if (c00Var == null) {
            c00Var = new c00();
            c00Var.c = b00Var;
            c00Var.d = false;
            c00Var.e = false;
            this.C = c00Var;
        }
        c00Var.c = b00Var;
        c00Var.d = false;
        c00Var.e = false;
        this.J = c00Var;
    }

    public final void U0(l81 l81Var, long j, m12 m12Var) {
        d00 d00Var = this.I;
        if (d00Var == null) {
            d00Var = new d00();
            d00Var.c = null;
            d00Var.d = Long.MAX_VALUE;
            this.I = d00Var;
        }
        d00Var.c = l81Var;
        d00Var.d = j;
        m12Var.b = 0L;
        this.J = d00Var;
    }

    public final void W0(k00 k00Var) {
        if ((k00Var instanceof i00) && !this.A) {
            this.A = true;
            e1();
        }
        Z0().t(k00Var);
    }

    public abstract void X0(long j);

    public abstract void Y0(j00 j00Var);

    public final mj Z0() {
        rh rhVar = this.y;
        if (rhVar != null) {
            return rhVar;
        }
        yc.p("Events channel not initialized.");
        return null;
    }

    public final y41 a1() {
        y41 y41Var = this.K;
        if (y41Var != null) {
            return y41Var;
        }
        yc.p("Velocity Tracker not initialized.");
        return null;
    }

    public final void b1(long j, l81 l81Var) {
        this.D = w01.e(this.D, j);
        pd1.h(a1(), l81Var);
        Z0().t(new h00(j, false));
    }

    public final void c1(l81 l81Var, l81 l81Var2, long j) {
        if (this.K == null) {
            this.K = new y41(24);
        }
        pd1.h(a1(), l81Var);
        long jD = w01.d(l81Var2.c, j);
        if (((Boolean) this.v.i(new s81(l81Var.i))).booleanValue()) {
            if (!this.A) {
                if (this.y == null) {
                    this.y = nu0.d(Integer.MAX_VALUE, 6, null);
                }
                e1();
            }
            Z0().t(new i00(jD));
        }
    }

    public abstract boolean d1();

    public final void e1() {
        this.A = true;
        if (this.y == null) {
            this.y = nu0.d(Integer.MAX_VALUE, 6, null);
        }
        nu0.A(z0(), null, null, new y00(this, null), 3);
    }

    public final void f1(sa0 sa0Var, boolean z, jx0 jx0Var, k31 k31Var, boolean z2) {
        this.v = sa0Var;
        boolean z3 = true;
        if (this.w != z) {
            this.w = z;
            if (!z) {
                bc0 bc0Var = this.F;
                if (bc0Var != null) {
                    M0(bc0Var);
                }
                bc0 bc0Var2 = this.E;
                if (bc0Var2 != null) {
                    M0(bc0Var2);
                }
                this.F = null;
                this.E = null;
                R0();
                this.M = null;
            }
            z2 = true;
        }
        if (!xi0.o(this.x, jx0Var)) {
            R0();
            this.x = jx0Var;
        }
        if (this.u != k31Var) {
            this.u = k31Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.B;
            g00 g00Var = g00.a;
            if (z4) {
                T0();
                if (this.A) {
                    Z0().t(g00Var);
                }
                this.K = null;
            }
            bg0 bg0Var = this.M;
            if (bg0Var != null) {
                bg0Var.a();
                z00 z00Var = bg0Var.e;
                if (z00Var.A) {
                    z00Var.W0(g00Var);
                }
                bg0Var.k = null;
                qn qnVar = bg0Var.n;
                qnVar.a = 0;
                ((kx0) qnVar.b).b = 0;
            }
        }
    }

    @Override // defpackage.p81
    public final void h0() {
        if (this.B) {
            T0();
            if (this.A) {
                Z0().t(g00.a);
            }
            this.K = null;
        }
        this.B = false;
    }

    @Override // defpackage.e10
    public final k31 j() {
        return this.u;
    }

    @Override // defpackage.ac0
    public final String r0() {
        if (!this.w) {
            return "idle";
        }
        xk xkVar = this.J;
        return xkVar instanceof c00 ? ((c00) xkVar).e ? "waiting" : "idle" : ((xkVar instanceof e00) || (xkVar instanceof d00)) ? "waiting" : xkVar instanceof f00 ? "recognized" : "idle";
    }
}
