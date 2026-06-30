package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.reddit.secondpage.R;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final n81 C;
    public static final n81 D;
    public static final n81 E;
    public static final n81 F;
    public static final n81 G;
    public static final s30 I;
    public static final s30 J;
    public static final r22 S;
    public static final r22 T;
    public static final r22 U;
    public static final r22 V;
    public static ye0 Y;
    public static final jo h;
    public static final jo i;
    public static ue1 s;
    public static final s30 t;
    public final /* synthetic */ int a;
    public static final float[] b = new float[91];
    public static final en1 c = en1.g;
    public static final float d = 16.0f;
    public static final en1 e = en1.j;
    public static final float f = 16.0f;
    public static final Object[] g = new Object[0];
    public static final Object j = new Object();
    public static final Class[] k = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final cm l = cm.m;
    public static final cm m = cm.i;
    public static final float n = 0.1f;
    public static final cm o = cm.j;
    public static final float p = 0.38f;
    public static final float q = 1.0f;
    public static final cm r = cm.f;
    public static final StackTraceElement[] u = new StackTraceElement[0];
    public static final byte[] v = {48, 49, 53, 0};
    public static final byte[] w = {48, 49, 48, 0};
    public static final byte[] x = {48, 48, 57, 0};
    public static final byte[] y = {48, 48, 53, 0};
    public static final byte[] z = {48, 48, 49, 0};
    public static final byte[] A = {48, 48, 49, 0};
    public static final byte[] B = {48, 48, 50, 0};
    public static final long[] H = new long[0];
    public static final Object K = new Object();
    public static final Object L = new Object();
    public static final Object M = new Object();
    public static final Object N = new Object();
    public static final Object O = new Object();
    public static final r22 P = new r22(new fi1(22), new x42(9));
    public static final r22 Q = new r22(new fi1(23), new fi1(24));
    public static final r22 R = new r22(new fi1(25), new fi1(26));
    public static final r22 W = new r22(new x42(5), new x42(6));
    public static final r22 X = new r22(new x42(7), new x42(8));

    static {
        int i2 = 0;
        h = new jo(636288403, false, new oo(i2));
        int i3 = 1;
        i = new jo(-1357803046, false, new oo(i3));
        t = new s30("NULL", i3);
        int i4 = 4;
        int i5 = 28;
        int i6 = 29;
        C = new n81(i4, new ai1(i5), new zh1(i6));
        D = new n81(i4, new ai1(i6), new fi1(i2));
        E = new n81(i4, new gi1(i2), new fi1(i3));
        int i7 = 2;
        F = new n81(i4, new gi1(i3), new fi1(i7));
        int i8 = 3;
        G = new n81(i4, new gi1(i7), new fi1(i8));
        I = new s30("NONE", i3);
        J = new s30("PENDING", i3);
        S = new r22(new fi1(27), new fi1(i5));
        T = new r22(new fi1(i6), new x42(i2));
        U = new r22(new x42(i3), new x42(i7));
        V = new r22(new x42(i8), new x42(i4));
    }

    public /* synthetic */ c2(int i2) {
        this.a = i2;
    }

    public static final void a(tv0 tv0Var, boolean z2, ob0 ob0Var, int i2) {
        tv0 tv0Var2;
        ob0Var.X(1023338612);
        int i3 = i2 | 54;
        int i4 = 0;
        boolean z3 = true;
        if (ob0Var.N(i3 & 1, (i3 & 19) != 18)) {
            ob0Var.W(602833477);
            ys1 ys1Var = mu0.b;
            e(((ju0) ob0Var.j(ys1Var)).a.c, ((ju0) ob0Var.j(ys1Var)).a.d, null, null, ob0Var, 6);
            ob0Var.p(false);
            tv0Var2 = qv0.a;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            z3 = z2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new tc(tv0Var2, z3, i2, i4);
        }
    }

    public static final void b(boolean z2, ha0 ha0Var, ob0 ob0Var, int i2) {
        ob0Var.X(-361453782);
        int i3 = 2;
        int i4 = (ob0Var.g(z2) ? 4 : 2) | i2 | (ob0Var.h(ha0Var) ? 32 : 16);
        if (ob0Var.N(i4 & 1, (i4 & 19) != 18)) {
            Object obj = (xy0) ob0Var.j(ur0.a);
            if (obj == null) {
                ob0Var.W(535274673);
                obj = (o11) ob0Var.j(vr0.a);
                if (obj == null) {
                    ob0Var.W(1208426157);
                    View view = (View) ob0Var.j(w4.f);
                    view.getClass();
                    while (true) {
                        if (view == null) {
                            obj = null;
                            break;
                        }
                        Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj2 = tag instanceof o11 ? (o11) tag : null;
                        if (obj2 != null) {
                            obj = obj2;
                            break;
                        } else {
                            Object objS = af1.s(view);
                            view = objS instanceof View ? (View) objS : null;
                        }
                    }
                } else {
                    ob0Var.W(1208423708);
                }
                ob0Var.p(false);
                if (obj == null) {
                    ob0Var.W(1208428160);
                    Object baseContext = (Context) ob0Var.j(w4.b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof o11) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    obj = (o11) baseContext;
                } else {
                    ob0Var.W(1208423789);
                }
                ob0Var.p(false);
            } else {
                ob0Var.W(535271790);
            }
            ob0Var.p(false);
            if (obj == null) {
                yc.l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = ob0Var.f(obj);
            Object objK = ob0Var.K();
            Object obj3 = kp.a;
            if (zF || objK == obj3) {
                xy0 xy0Var = obj instanceof xy0 ? (xy0) obj : null;
                wy0 navigationEventDispatcher = xy0Var != null ? xy0Var.getNavigationEventDispatcher() : null;
                o11 o11Var = obj instanceof o11 ? (o11) obj : null;
                objK = new qe(navigationEventDispatcher, o11Var != null ? o11Var.b() : null);
                ob0Var.f0(objK);
            }
            Object obj4 = (qe) objK;
            long j2 = ob0Var.T;
            boolean zF2 = ob0Var.f(obj4) | ob0Var.e(j2);
            Object objK2 = ob0Var.K();
            Object obj5 = objK2;
            if (zF2 || objK2 == obj3) {
                ro roVar = new ro(new re(j2, obj));
                roVar.c = new e2(7);
                ob0Var.f0(roVar);
                obj5 = roVar;
            }
            ro roVar2 = (ro) obj5;
            ob0Var.W(-585307852);
            boolean zH = ob0Var.h(roVar2) | ((i4 & 112) == 32);
            Object objK3 = ob0Var.K();
            if (zH || objK3 == obj3) {
                objK3 = new f8(i3, roVar2, ha0Var);
                ob0Var.f0(objK3);
            }
            wi0.m((ha0) objK3, ob0Var);
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i5 = i4 & 14;
            boolean zH2 = (i5 == 4) | ob0Var.h(roVar2);
            Object objK4 = ob0Var.K();
            if (zH2 || objK4 == obj3) {
                objK4 = new se(roVar2, z2);
                ob0Var.f0(objK4);
            }
            el.c(boolValueOf, roVar2, null, (sa0) objK4, ob0Var, i5);
            boolean zH3 = ob0Var.h(obj4) | ob0Var.h(roVar2);
            Object objK5 = ob0Var.K();
            if (zH3 || objK5 == obj3) {
                objK5 = new d(i3, obj4, roVar2);
                ob0Var.f0(objK5);
            }
            wi0.d(obj4, roVar2, (sa0) objK5, ob0Var);
            ob0Var.p(false);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new tc(z2, ha0Var, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final ha0 ha0Var, final gi giVar, tv0 tv0Var, boolean z2, xh xhVar, ci ciVar, c41 c41Var, jo joVar, ob0 ob0Var, final int i2, final int i3) {
        int i4;
        tv0 tv0Var2;
        int i5;
        boolean z3;
        xh xhVar2;
        ci ciVar2;
        int i6;
        final c41 c41Var2;
        final ci ciVar3;
        final tv0 tv0Var3;
        final boolean z4;
        final xh xhVar3;
        dc1 dc1VarR;
        int i7;
        xh xhVar4;
        int i8;
        ci ciVar4;
        c41 c41VarA;
        int i9;
        tv0 tv0Var4;
        boolean z5;
        int i10;
        c41 c41Var3;
        long j2;
        tv0 tv0Var5;
        jx0 jx0Var;
        ci ciVar5;
        boolean z6;
        xa xaVar;
        boolean z7;
        ym1 ym1Var;
        final jo joVar2 = joVar;
        ym1 ym1Var2 = giVar.a;
        ym1 ym1Var3 = giVar.b;
        ob0Var.X(-311513973);
        if ((i2 & 6) == 0) {
            i4 = (ob0Var.h(ha0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ob0Var.f(giVar) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                tv0Var2 = tv0Var;
                i4 |= ob0Var.f(tv0Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i4 |= ob0Var.g(z3) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        xhVar2 = xhVar;
                        int i12 = ob0Var.f(xhVar2) ? 16384 : 8192;
                        i4 |= i12;
                    } else {
                        xhVar2 = xhVar;
                    }
                    i4 |= i12;
                } else {
                    xhVar2 = xhVar;
                }
                if ((i2 & 196608) == 0) {
                    ciVar2 = ciVar;
                    i4 |= ((i3 & 32) == 0 && ob0Var.f(ciVar2)) ? 131072 : 65536;
                } else {
                    ciVar2 = ciVar;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= ob0Var.f(null) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    i4 |= ((i3 & 128) == 0 && ob0Var.f(c41Var)) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= ob0Var.f(null) ? 67108864 : 33554432;
                }
                if ((i2 & 805306368) == 0) {
                    i4 |= ob0Var.h(joVar2) ? 536870912 : 268435456;
                }
                i6 = i4;
                boolean z8 = true;
                if (ob0Var.N(i6 & 1, (306783379 & i4) != 306783378)) {
                    ob0Var.S();
                    if ((i2 & 1) == 0 || ob0Var.x()) {
                        if (i11 != 0) {
                            tv0Var2 = qv0.a;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 16) != 0) {
                            float f2 = yh.a;
                            bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
                            xh xhVar5 = bmVar.W;
                            if (xhVar5 == null) {
                                i7 = -29360129;
                                xhVar4 = new xh(dm.b(bmVar, l), dm.b(bmVar, r), vl.b(n, dm.b(bmVar, m)), vl.b(p, dm.b(bmVar, o)));
                                bmVar.W = xhVar4;
                            } else {
                                i7 = -29360129;
                                xhVar4 = xhVar5;
                            }
                            i8 = i6 & (-57345);
                        } else {
                            i7 = -29360129;
                            xhVar4 = xhVar2;
                            i8 = i6;
                        }
                        if ((i3 & 32) != 0) {
                            float f3 = yh.a;
                            ciVar4 = new ci(q);
                            i8 &= -458753;
                        } else {
                            ciVar4 = ciVar2;
                        }
                        if ((i3 & 128) != 0) {
                            float f4 = yh.a;
                            c41VarA = yh.a(yh.b());
                            i8 &= i7;
                        } else {
                            c41VarA = c41Var;
                        }
                        tv0 tv0Var6 = tv0Var2;
                        i9 = i8;
                        tv0Var4 = tv0Var6;
                        z5 = z3;
                    } else {
                        ob0Var.Q();
                        int i13 = (i3 & 16) != 0 ? i6 & (-57345) : i6;
                        if ((i3 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i13 &= -29360129;
                        }
                        tv0 tv0Var7 = tv0Var2;
                        i9 = i13;
                        tv0Var4 = tv0Var7;
                        c41VarA = c41Var;
                        ciVar4 = ciVar2;
                        z5 = z3;
                        xhVar4 = xhVar2;
                    }
                    ob0Var.q();
                    ob0Var.W(1112124656);
                    Object objK = ob0Var.K();
                    Object obj = kp.a;
                    if (objK == obj) {
                        objK = new jx0();
                        ob0Var.f0(objK);
                    }
                    jx0 jx0Var2 = (jx0) objK;
                    ob0Var.p(false);
                    p60 p60VarW = bl.W(jw0.f, ob0Var);
                    fy0 fy0VarD = lk.D(jx0Var2, ob0Var, 0);
                    long j3 = z5 ? xhVar4.a : xhVar4.c;
                    long j4 = z5 ? xhVar4.b : xhVar4.d;
                    xh xhVar6 = xhVar4;
                    if (ciVar4 == null) {
                        ob0Var.W(1112635659);
                        ob0Var.p(false);
                        jx0Var = jx0Var2;
                        tv0Var5 = tv0Var4;
                        ciVar5 = ciVar4;
                        c41Var3 = c41VarA;
                        z6 = z5;
                        i10 = i9;
                        j2 = j4;
                        xaVar = null;
                    } else {
                        ob0Var.W(1282817462);
                        int i14 = i9 >> 9;
                        Object objK2 = ob0Var.K();
                        if (objK2 == obj) {
                            objK2 = new mq1();
                            ob0Var.f0(objK2);
                        }
                        mq1 mq1Var = (mq1) objK2;
                        i10 = i9;
                        boolean zF = ob0Var.f(jx0Var2);
                        Object objK3 = ob0Var.K();
                        if (zF || objK3 == obj) {
                            c41Var3 = c41VarA;
                            j2 = j4;
                            objK3 = new ai(jx0Var2, mq1Var, null, 0);
                            ob0Var.f0(objK3);
                        } else {
                            c41Var3 = c41VarA;
                            j2 = j4;
                        }
                        wi0.i((wa0) objK3, ob0Var, jx0Var2);
                        yh0 yh0Var = (yh0) pl.j0(mq1Var);
                        float f5 = (z5 && !(yh0Var instanceof oa1) && (yh0Var instanceof ce0)) ? ciVar4.a : 0.0f;
                        Object objK4 = ob0Var.K();
                        if (objK4 == obj) {
                            jx0Var = jx0Var2;
                            tv0Var5 = tv0Var4;
                            objK4 = new h9(new tz(f5), R, null, 12);
                            ob0Var.f0(objK4);
                        } else {
                            tv0Var5 = tv0Var4;
                            jx0Var = jx0Var2;
                        }
                        h9 h9Var = (h9) objK4;
                        tz tzVar = new tz(f5);
                        boolean zH = ob0Var.h(h9Var) | ob0Var.c(f5) | ((((i14 & 14) ^ 6) > 4 && ob0Var.g(z5)) || (i14 & 6) == 4);
                        if ((((i14 & 896) ^ 384) <= 256 || !ob0Var.f(ciVar4)) && (i14 & 384) != 256) {
                            z8 = false;
                        }
                        boolean zH2 = zH | z8 | ob0Var.h(yh0Var);
                        Object objK5 = ob0Var.K();
                        if (zH2 || objK5 == obj) {
                            ciVar5 = ciVar4;
                            z6 = z5;
                            objK5 = new bi(h9Var, f5, z6, ciVar5, yh0Var, null);
                            ob0Var.f0(objK5);
                        } else {
                            ciVar5 = ciVar4;
                            z6 = z5;
                        }
                        wi0.i((wa0) objK5, ob0Var, tzVar);
                        xaVar = h9Var.c;
                        ob0Var.p(false);
                    }
                    float f6 = xaVar != null ? ((tz) xaVar.f.getValue()).e : 0.0f;
                    boolean zBooleanValue = ((Boolean) fy0VarD.getValue()).booleanValue();
                    int i15 = i10 >> 3;
                    ob0Var.W(802092292);
                    ym1 ym1VarR = zBooleanValue ? ym1Var3 : ym1Var2;
                    if ((ym1Var2 instanceof kg1) && (ym1Var3 instanceof kg1)) {
                        ob0Var.W(-2066263642);
                        ob0Var.U(2011556533, giVar);
                        ym1VarR.getClass();
                        ha haVarQ = u4.q((kg1) ym1VarR, p60VarW, ob0Var, 0);
                        ob0Var.p(false);
                        ob0Var.p(false);
                        ob0Var.p(false);
                        ym1Var = haVarQ;
                        z7 = false;
                    } else {
                        if ((ym1Var2 instanceof kg1) && (ym1Var3 instanceof kg1)) {
                            ob0Var.W(-2066125816);
                            ob0Var.U(2011560979, giVar);
                            ym1VarR.getClass();
                            z7 = false;
                            ym1VarR = u4.r((kg1) ym1VarR, p60VarW, ob0Var, 0);
                            ob0Var.p(false);
                        } else {
                            z7 = false;
                            ob0Var.W(-2066043170);
                        }
                        ob0Var.p(z7);
                        ob0Var.p(z7);
                        ym1Var = ym1VarR;
                    }
                    Object objK6 = ob0Var.K();
                    if (objK6 == obj) {
                        objK6 = new p1(5);
                        ob0Var.f0(objK6);
                    }
                    tv0Var3 = tv0Var5;
                    tv0 tv0VarA = ol1.a(tv0Var3, z7, (sa0) objK6);
                    long j5 = j2;
                    joVar2 = joVar;
                    vu1.b(ha0Var, tv0VarA, z6, ym1Var, j3, j5, f6, jx0Var, lk.d0(1669820704, new e5(j5, c41Var3, joVar2), ob0Var), ob0Var, (i10 & 14) | (i15 & 896) | (234881024 & (i10 << 6)), 64);
                    z4 = z6;
                    ciVar3 = ciVar5;
                    xhVar3 = xhVar6;
                    c41Var2 = c41Var3;
                } else {
                    ob0Var.Q();
                    c41Var2 = c41Var;
                    ciVar3 = ciVar2;
                    tv0Var3 = tv0Var2;
                    z4 = z3;
                    xhVar3 = xhVar2;
                }
                dc1VarR = ob0Var.r();
                if (dc1VarR != null) {
                    dc1VarR.d = new wa0() { // from class: di
                        @Override // defpackage.wa0
                        public final Object h(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            c2.c(ha0Var, giVar, tv0Var3, z4, xhVar3, ciVar3, c41Var2, joVar2, (ob0) obj2, al.V(i2 | 1), i3);
                            return t32.a;
                        }
                    };
                    return;
                }
                return;
            }
            i4 |= 3072;
            z3 = z2;
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            i6 = i4;
            boolean z82 = true;
            if (ob0Var.N(i6 & 1, (306783379 & i4) != 306783378)) {
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR != null) {
            }
        }
        tv0Var2 = tv0Var;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i6 = i4;
        boolean z822 = true;
        if (ob0Var.N(i6 & 1, (306783379 & i4) != 306783378)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
        }
    }

    public static final n3 d(f6 f6Var) {
        Canvas canvas = o3.a;
        n3 n3Var = new n3();
        n3Var.a = new Canvas(j(f6Var));
        return n3Var;
    }

    public static final void e(long j2, long j3, ym1 ym1Var, List list, ob0 ob0Var, int i2) {
        int i3;
        ym1 ym1Var2;
        List list2;
        ob0Var.X(663218740);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(qv0.a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.e(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if (ob0Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                float f2 = mr0.a;
                ym1Var = qn1.b(u4.c0, ob0Var);
                list = mr0.c;
            } else {
                ob0Var.Q();
            }
            int i4 = i3 & (-64513);
            ym1 ym1Var3 = ym1Var;
            List list3 = list;
            ob0Var.q();
            f(j2, j3, ym1Var3, list3, ob0Var, i4 & 65534);
            list2 = list3;
            ym1Var2 = ym1Var3;
        } else {
            ob0Var.Q();
            ym1Var2 = ym1Var;
            list2 = list;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new or0(j2, j3, ym1Var2, list2, i2, 1);
        }
    }

    public static final void f(long j2, final long j3, ym1 ym1Var, List list, ob0 ob0Var, int i2) {
        int i3;
        float f2;
        ob0Var.X(-1776169461);
        int i4 = i2 & 6;
        qv0 qv0Var = qv0.a;
        if (i4 == 0) {
            i3 = (ob0Var.f(qv0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.e(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var.f(ym1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var.h(list) ? 16384 : 8192;
        }
        if (!ob0Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ob0Var.Q();
        } else {
            if (list.size() <= 1) {
                yc.p("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
            boolean zF = ob0Var.f(list);
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (zF || objK == obj) {
                aq0 aq0VarN = hk.n();
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    if (i6 < list.size()) {
                        aq0VarN.add(new zv0(((pg1) list.get(i5)).b(), ((pg1) list.get(i6)).b()));
                    } else {
                        aq0VarN.add(new zv0(((pg1) list.get(i5)).b(), ((pg1) list.get(0)).b()));
                    }
                    i5 = i6;
                }
                objK = hk.k(aq0VarN);
                ob0Var.f0(objK);
            }
            final List list2 = (List) objK;
            boolean zF2 = ob0Var.f(list);
            Object objK2 = ob0Var.K();
            if (zF2 || objK2 == obj) {
                float[] fArr = new float[4];
                int size2 = list.size();
                float fMin = 1.0f;
                int i7 = 0;
                while (i7 < size2) {
                    pg1 pg1Var = (pg1) list.get(i7);
                    int i8 = size2;
                    pg1.a(pg1Var, fArr, 2);
                    aq0 aq0Var = pg1Var.c;
                    float[] fArr2 = fArr;
                    long j4 = pg1Var.b;
                    int iA = aq0Var.a();
                    float fMax = 0.0f;
                    int i9 = 0;
                    while (i9 < iA) {
                        fu fuVar = (fu) aq0Var.get(i9);
                        aq0 aq0Var2 = aq0Var;
                        float fD = fuVar.a[0] - hk.D(j4);
                        float fE = fuVar.a[1] - hk.E(j4);
                        float f3 = q42.b;
                        int i10 = iA;
                        long jC = fuVar.c(0.5f);
                        float fD2 = hk.D(jC) - hk.D(j4);
                        float fE2 = hk.E(jC) - hk.E(j4);
                        fMax = Math.max(fMax, Math.max((fE * fE) + (fD * fD), (fE2 * fE2) + (fD2 * fD2)));
                        i9++;
                        aq0Var = aq0Var2;
                        iA = i10;
                    }
                    float fSqrt = (float) Math.sqrt(fMax);
                    float[] fArr3 = {hk.D(j4) - fSqrt, hk.E(j4) - fSqrt, hk.D(j4) + fSqrt, hk.E(j4) + fSqrt};
                    fMin = Math.min(fMin, Math.max((fArr2[2] - fArr2[0]) / (fArr3[2] - fArr3[0]), (fArr2[3] - fArr2[1]) / (fArr3[3] - fArr3[1])));
                    i7++;
                    size2 = i8;
                    fArr = fArr2;
                }
                f2 = 0.0f;
                objK2 = Float.valueOf(fMin * mr0.d);
                ob0Var.f0(objK2);
            } else {
                f2 = 0.0f;
            }
            final float fFloatValue = ((Number) objK2).floatValue();
            Object objK3 = ob0Var.K();
            if (objK3 == obj) {
                objK3 = xi0.a(f2);
                ob0Var.f0(objK3);
            }
            final h9 h9Var = (h9) objK3;
            Object objK4 = ob0Var.K();
            if (objK4 == obj) {
                objK4 = new r41(90.0f);
                ob0Var.f0(objK4);
            }
            final r41 r41Var = (r41) objK4;
            Object objK5 = ob0Var.K();
            if (objK5 == obj) {
                objK5 = xi0.a(f2);
                ob0Var.f0(objK5);
            }
            final h9 h9Var2 = (h9) objK5;
            boolean zF3 = ob0Var.f(list);
            Object objK6 = ob0Var.K();
            if (zF3 || objK6 == obj) {
                objK6 = new s41(0);
                ob0Var.f0(objK6);
            }
            final s41 s41Var = (s41) objK6;
            boolean zH = ob0Var.h(h9Var) | ob0Var.f(s41Var) | ob0Var.h(list2) | ob0Var.h(h9Var2);
            Object objK7 = ob0Var.K();
            if (zH || objK7 == obj) {
                objK7 = new qr0(h9Var, list2, s41Var, r41Var, h9Var2, null);
                ob0Var.f0(objK7);
            }
            wi0.i((wa0) objK7, ob0Var, list);
            Object objK8 = ob0Var.K();
            if (objK8 == obj) {
                objK8 = y6.a();
                ob0Var.f0(objK8);
            }
            final w6 w6Var = (w6) objK8;
            Object objK9 = ob0Var.K();
            if (objK9 == obj) {
                Object ou0Var = new ou0(ou0.a());
                ob0Var.f0(ou0Var);
                objK9 = ou0Var;
            }
            final float[] fArr4 = ((ou0) objK9).a;
            tv0 tv0VarP = xi0.p(xk.h(ko1.f(ol1.a(qv0Var, true, new mt(24)), mr0.a, mr0.b).c(ko1.c), ym1Var), j2, pv.w);
            uu0 uu0VarD = sg.d(v20.j, false);
            int iHashCode = Long.hashCode(ob0Var.T);
            b61 b61VarL = ob0Var.l();
            tv0 tv0VarP2 = bk.P(ob0Var, tv0VarP);
            ep.c.getClass();
            ha0 ha0Var = dp.b;
            ob0Var.Z();
            if (ob0Var.S) {
                ob0Var.k(ha0Var);
            } else {
                ob0Var.i0();
            }
            xc.E(dp.f, ob0Var, uu0VarD);
            xc.E(dp.e, ob0Var, b61VarL);
            xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
            xc.C(ob0Var, dp.h);
            xc.E(dp.d, ob0Var, tv0VarP2);
            od odVar = new od();
            boolean zH2 = ob0Var.h(h9Var) | ob0Var.h(h9Var2) | ob0Var.h(list2) | ob0Var.f(s41Var) | ob0Var.h(w6Var) | ob0Var.c(fFloatValue) | ob0Var.h(fArr4) | ((i3 & 896) == 256);
            Object objK10 = ob0Var.K();
            if (zH2 || objK10 == obj) {
                Object obj2 = new sa0() { // from class: nr0
                    @Override // defpackage.sa0
                    public final Object i(Object obj3) {
                        List list3 = list2;
                        w6 w6Var2 = w6Var;
                        float f4 = fFloatValue;
                        float[] fArr5 = fArr4;
                        long j5 = j3;
                        s41 s41Var2 = s41Var;
                        sl0 sl0Var = (sl0) obj3;
                        float fFloatValue2 = ((Number) h9Var.d()).floatValue();
                        float fG = r41Var.g();
                        float fFloatValue3 = ((Number) h9Var2.d()).floatValue() + fG + (90.0f * fFloatValue2);
                        long jS = sl0Var.e.S();
                        ej ejVar = sl0Var.e;
                        oc ocVar = ejVar.f;
                        long jQ = ocVar.q();
                        ocVar.i().l();
                        try {
                            ((qt0) ocVar.a).w(fFloatValue3, jS);
                            pd1.s((zv0) list3.get(s41Var2.g()), fFloatValue2, w6Var2);
                            long jD = ejVar.d();
                            ou0.d(fArr5);
                            ou0.g(fArr5, Float.intBitsToFloat((int) (jD >> 32)) * f4, Float.intBitsToFloat((int) (4294967295L & jD)) * f4, 4);
                            w6Var2.i(fArr5);
                            w6Var2.j(w01.d(ef1.j(jD), w6Var2.d().b()));
                            p10.l0(sl0Var, w6Var2, j5, i60.a, 52);
                            s91.r(ocVar, jQ);
                            return t32.a;
                        } catch (Throwable th) {
                            s91.r(ocVar, jQ);
                            throw th;
                        }
                    }
                };
                ob0Var.f0(obj2);
                objK10 = obj2;
            }
            qc1.b(ob0Var, pv.l(odVar, (sa0) objK10));
            ob0Var.p(true);
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new or0(j2, j3, ym1Var, list, i2, 0);
        }
    }

    public static final qs1 g(Object obj) {
        if (obj == null) {
            obj = t;
        }
        return new qs1(obj);
    }

    public static final void h(final ha0 ha0Var, final gi giVar, tv0 tv0Var, boolean z2, xh xhVar, c41 c41Var, final jo joVar, ob0 ob0Var, final int i2) {
        final tv0 tv0Var2;
        final boolean z3;
        final xh xhVar2;
        final c41 c41Var2;
        xh xhVar3;
        int i3;
        c41 c41VarA;
        tv0 tv0Var3;
        boolean z4;
        xh xhVar4;
        ob0Var.X(-1700001512);
        int i4 = i2 | (ob0Var.h(ha0Var) ? 4 : 2) | (ob0Var.f(giVar) ? 32 : 16) | 106638720;
        if (ob0Var.N(i4 & 1, (306783379 & i4) != 306783378)) {
            ob0Var.S();
            if ((i2 & 1) == 0 || ob0Var.x()) {
                float f2 = yh.a;
                bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
                xh xhVar5 = bmVar.X;
                if (xhVar5 == null) {
                    long j2 = vl.f;
                    xhVar3 = new xh(j2, dm.b(bmVar, cm.m), j2, vl.b(nu0.t, dm.b(bmVar, nu0.s)));
                    bmVar.X = xhVar3;
                } else {
                    xhVar3 = xhVar5;
                }
                float f3 = yh.a;
                i3 = i4 & (-29417473);
                c41VarA = yh.a(yh.b());
                tv0Var3 = qv0.a;
                z4 = true;
                xhVar4 = xhVar3;
            } else {
                ob0Var.Q();
                i3 = i4 & (-29417473);
                tv0Var3 = tv0Var;
                z4 = z2;
                xhVar4 = xhVar;
                c41VarA = c41Var;
            }
            ob0Var.q();
            c(ha0Var, giVar, tv0Var3, z4, xhVar4, null, c41VarA, joVar, ob0Var, i3 & 2147483646, 0);
            z3 = z4;
            c41Var2 = c41VarA;
            xhVar2 = xhVar4;
            tv0Var2 = tv0Var3;
        } else {
            ob0Var.Q();
            tv0Var2 = tv0Var;
            z3 = z2;
            xhVar2 = xhVar;
            c41Var2 = c41Var;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(giVar, tv0Var2, z3, xhVar2, c41Var2, joVar, i2) { // from class: ei
                public final /* synthetic */ gi f;
                public final /* synthetic */ tv0 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ xh i;
                public final /* synthetic */ c41 j;
                public final /* synthetic */ jo k;

                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(805306369);
                    c2.h(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ob0) obj, iV);
                    return t32.a;
                }
            };
        }
    }

    public static final void i(m1 m1Var, rl1 rl1Var) {
        if (pv.e(rl1Var)) {
            nl1 nl1Var = rl1Var.d;
            Object objG = nl1Var.e.g(ml1.i);
            if (objG == null) {
                objG = null;
            }
            r0 r0Var = (r0) objG;
            if (r0Var != null) {
                m1Var.a(new g1(r0Var.a, android.R.id.accessibilityActionSetProgress));
            }
        }
    }

    public static final Bitmap j(f6 f6Var) {
        if (f6Var instanceof f6) {
            return f6Var.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final boolean k(Object obj) {
        if (obj instanceof fq1) {
            fq1 fq1Var = (fq1) obj;
            if (fq1Var.d() == v20.S || fq1Var.d() == l91.p || fq1Var.d() == l91.f) {
                Object value = fq1Var.getValue();
                if (value == null) {
                    return true;
                }
                return k(value);
            }
        } else if (!(obj instanceof eb0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (k[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ye0 l() {
        ye0 ye0Var = Y;
        if (ye0Var != null) {
            return ye0Var;
        }
        xe0 xe0Var = new xe0("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = a52.a;
        uq1 uq1Var = new uq1(vl.b);
        y41 y41Var = new y41(0);
        y41Var.y(9.0f, 16.17f);
        y41Var.w(5.53f, 12.7f);
        y41Var.r(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        y41Var.r(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        y41Var.x(4.18f, 4.18f);
        y41Var.r(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        y41Var.w(20.29f, 7.71f);
        y41Var.r(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        y41Var.r(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        y41Var.w(9.0f, 16.17f);
        y41Var.m();
        xe0.a(xe0Var, (ArrayList) y41Var.f, uq1Var);
        ye0 ye0VarB = xe0Var.b();
        Y = ye0VarB;
        return ye0VarB;
    }

    public static final tv0 m(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new xf(sa0Var));
    }

    public static tv0 n(tv0 tv0Var, float f2, float f3, ym1 ym1Var, boolean z2, int i2) {
        float f4 = (i2 & 1) != 0 ? 1.0f : 0.0f;
        float f5 = (i2 & 2) != 0 ? 1.0f : 0.0f;
        float f6 = (i2 & 4) != 0 ? 1.0f : f2;
        float f7 = (i2 & 32) != 0 ? 0.0f : f3;
        long j2 = u12.b;
        ym1 ym1Var2 = (i2 & 2048) != 0 ? pv.w : ym1Var;
        boolean z3 = (i2 & 4096) != 0 ? false : z2;
        long j3 = rc0.a;
        return tv0Var.c(new oc0(f4, f5, f6, f7, j2, ym1Var2, z3, j3, j3, vk0.a));
    }

    public static final tv0 o(in0 in0Var, wg wgVar, k31 k31Var) {
        return new lm0(in0Var, wgVar, k31Var);
    }

    public static final tv0 p(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new ik0(sa0Var, null));
    }

    public static final tv0 q(tv0 tv0Var, sa0 sa0Var) {
        return tv0Var.c(new ik0(null, sa0Var));
    }

    public static final Object[] s(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = g;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] t(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final Bitmap.Config u(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static String v(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void w(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public final Uri r(Intent intent, int i2) {
        switch (this.a) {
            case 0:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            default:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
        }
    }
}
