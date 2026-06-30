package defpackage;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xc implements i62 {
    public static volatile xc b;
    public final Object a;

    public xc(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                Executors.newFixedThreadPool(4, new ow());
                break;
            default:
                this.a = new xc(1);
                break;
        }
    }

    public static final boolean A(hg1 hg1Var) {
        long j = hg1Var.e;
        return (j >>> 32) == (4294967295L & j) && j == hg1Var.f && j == hg1Var.g && j == hg1Var.h;
    }

    public static v41 B(Object obj) {
        return new v41(obj, l91.p);
    }

    public static final void C(ob0 ob0Var, sa0 sa0Var) {
        ob0Var.b(new ud(21, sa0Var), t32.a);
    }

    public static final fy0 D(Object obj, ob0 ob0Var) {
        Object objK = ob0Var.K();
        if (objK == kp.a) {
            objK = B(obj);
            ob0Var.f0(objK);
        }
        fy0 fy0Var = (fy0) objK;
        fy0Var.setValue(obj);
        return fy0Var;
    }

    public static final void E(wa0 wa0Var, ob0 ob0Var, Object obj) {
        if (ob0Var.S || !xi0.o(ob0Var.K(), obj)) {
            ob0Var.f0(obj);
            ob0Var.b(wa0Var, obj);
        }
    }

    public static pg1 F(int i, ft ftVar) {
        ftVar.getClass();
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = q42.b / i;
            long jD = q42.d(1.0f, 2.0f * f * i3);
            fArr[i2] = hk.D(jD) + 0.0f;
            fArr[i2 + 1] = hk.E(jD) + 0.0f;
            long jD2 = q42.d(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = hk.D(jD2) + 0.0f;
            i2 += 4;
            fArr[i4] = hk.E(jD2) + 0.0f;
        }
        return af1.a(fArr, ftVar, null, 0.0f, 0.0f);
    }

    public static final void G(Object obj) {
        if (obj instanceof oe1) {
            throw ((oe1) obj).e;
        }
    }

    public static final String H(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x02b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x051c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0565 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0567  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final CharSequence charSequence, final wa0 wa0Var, final zx1 zx1Var, final xa0 xa0Var, final wa0 wa0Var2, final wa0 wa0Var3, final wa0 wa0Var4, final wa0 wa0Var5, final boolean z, final boolean z2, final jx0 jx0Var, final c41 c41Var, fx1 fx1Var, wa0 wa0Var6, ob0 ob0Var, final int i, final int i2) {
        int i3;
        int i4;
        fx1 fx1Var2;
        ob0 ob0Var2;
        boolean z3;
        boolean z4;
        d22 d22Var;
        ob0 ob0Var3;
        c22 c22VarH;
        c22 c22Var;
        c22 c22Var2;
        ob0 ob0Var4;
        d22 d22Var2;
        boolean z5;
        c22 c22VarH2;
        ob0 ob0Var5;
        c22 c22Var3;
        l91 l91Var;
        boolean z6;
        l91 l91Var2;
        d02 d02Var;
        final d02 d02Var2;
        c22 c22Var4;
        jo joVar;
        jo joVar2;
        int i5;
        jo joVar3;
        jo joVar4;
        jo joVar5;
        Object objC;
        boolean zF;
        Object objK;
        int iOrdinal;
        float f;
        boolean z7;
        boolean zF2;
        Object objK2;
        sp1 sp1VarL;
        sa0 sa0VarE;
        sp1 sp1VarU;
        p60 p60Var;
        p60 p60Var2;
        Object objC2;
        float f2;
        boolean zF3;
        Object objK3;
        int iOrdinal2;
        float f3;
        boolean zF4;
        Object objK4;
        Object objC3;
        boolean zF5;
        Object objK5;
        int iOrdinal3;
        boolean zF6;
        Object objK6;
        wa0 wa0Var7 = wa0Var6;
        l91 l91Var3 = l91.p;
        r22 r22Var = c2.P;
        ob0Var.X(546805032);
        if ((i & 6) == 0) {
            i3 = (ob0Var.d(0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ob0Var.h(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ob0Var.h(wa0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ob0Var.f(zx1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ob0Var.h(xa0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ob0Var.h(wa0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ob0Var.h(wa0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ob0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ob0Var.h(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ob0Var.h(wa0Var4) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = (ob0Var.h(wa0Var5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ob0Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ob0Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ob0Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ob0Var.f(jx0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ob0Var.f(c41Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ob0Var.f(fx1Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ob0Var.h(wa0Var7) ? 8388608 : 4194304;
        }
        int i7 = i4;
        if (ob0Var.N(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) el.q(jx0Var, ob0Var, (i7 >> 12) & 14).getValue()).booleanValue();
            ch0 ch0Var = ch0.g;
            ch0 ch0Var2 = ch0.f;
            ch0 ch0Var3 = ch0.e;
            ch0 ch0Var4 = zBooleanValue ? ch0Var3 : charSequence.length() == 0 ? ch0Var2 : ch0Var;
            f32 f32Var = ((ju0) ob0Var.j(mu0.b)).b;
            d02 d02Var3 = f32Var.j;
            d02 d02Var4 = f32Var.l;
            long jB = d02Var3.b();
            long j = vl.g;
            boolean z8 = (vl.c(jB, j) && !vl.c(d02Var4.b(), j)) || (!vl.c(d02Var3.b(), j) && vl.c(d02Var4.b(), j));
            d22 d22VarF = kd1.F(ch0Var4, "TextFieldInputState", ob0Var, 48);
            boolean z9 = xa0Var != null;
            l91 l91Var4 = kp.a;
            if (xa0Var != null) {
                ob0Var.W(-940723593);
                p60 p60VarW = bl.W(jw0.e, ob0Var);
                if (d22VarF.g()) {
                    z3 = z9;
                    z4 = z8;
                    ob0Var.W(1666827533);
                    ob0Var.p(false);
                    objC3 = d22VarF.c();
                } else {
                    ob0Var.W(1666573488);
                    boolean zF7 = ob0Var.f(d22VarF);
                    objC3 = ob0Var.K();
                    if (zF7 || objC3 == l91Var4) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        z3 = z9;
                        sp1VarU = uc1.u(sp1VarL);
                        z4 = z8;
                        try {
                            Object objC4 = d22VarF.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var.f0(objC4);
                            objC3 = objC4;
                        } finally {
                        }
                    } else {
                        z3 = z9;
                        z4 = z8;
                    }
                    ob0Var.p(false);
                }
                ob0Var.W(1071902915);
                int iOrdinal4 = ((ch0) objC3).ordinal();
                if (iOrdinal4 == 0) {
                    ob0Var.p(false);
                    Float fValueOf = Float.valueOf(f);
                    zF5 = ob0Var.f(d22VarF);
                    objK5 = ob0Var.K();
                    if (zF5 || objK5 == l91Var4) {
                        objK5 = s(new rq0(16, d22VarF));
                        ob0Var.f0(objK5);
                    }
                    ch0 ch0Var5 = (ch0) ((ns1) objK5).getValue();
                    ob0Var.W(1071902915);
                    iOrdinal3 = ch0Var5.ordinal();
                    if (iOrdinal3 == 0) {
                        ob0Var.p(false);
                        Float fValueOf2 = Float.valueOf(f);
                        zF6 = ob0Var.f(d22VarF);
                        objK6 = ob0Var.K();
                        if (zF6 || objK6 == l91Var4) {
                            objK6 = s(new rq0(17, d22VarF));
                            ob0Var.f0(objK6);
                        }
                        ob0Var.W(1806589607);
                        ob0Var.p(false);
                        c22VarH = kd1.h(d22VarF, fValueOf, fValueOf2, p60VarW, r22Var, ob0Var, 196608);
                        d22Var = d22VarF;
                        ob0Var3 = ob0Var;
                        ob0Var3.p(false);
                    } else {
                        if (iOrdinal3 == 1) {
                            float f4 = z3 ? 0.0f : 1.0f;
                            ob0Var.p(false);
                            Float fValueOf22 = Float.valueOf(f4);
                            zF6 = ob0Var.f(d22VarF);
                            objK6 = ob0Var.K();
                            if (zF6) {
                                objK6 = s(new rq0(17, d22VarF));
                                ob0Var.f0(objK6);
                                ob0Var.W(1806589607);
                                ob0Var.p(false);
                                c22VarH = kd1.h(d22VarF, fValueOf, fValueOf22, p60VarW, r22Var, ob0Var, 196608);
                                d22Var = d22VarF;
                                ob0Var3 = ob0Var;
                                ob0Var3.p(false);
                            }
                        } else if (iOrdinal3 != 2) {
                            ez1.a();
                            return;
                        }
                        ob0Var.p(false);
                        Float fValueOf222 = Float.valueOf(f4);
                        zF6 = ob0Var.f(d22VarF);
                        objK6 = ob0Var.K();
                        if (zF6) {
                        }
                    }
                } else {
                    if (iOrdinal4 == 1) {
                        float f5 = z3 ? 0.0f : 1.0f;
                        ob0Var.p(false);
                        Float fValueOf3 = Float.valueOf(f5);
                        zF5 = ob0Var.f(d22VarF);
                        objK5 = ob0Var.K();
                        if (zF5) {
                            objK5 = s(new rq0(16, d22VarF));
                            ob0Var.f0(objK5);
                            ch0 ch0Var52 = (ch0) ((ns1) objK5).getValue();
                            ob0Var.W(1071902915);
                            iOrdinal3 = ch0Var52.ordinal();
                            if (iOrdinal3 == 0) {
                            }
                        }
                    } else if (iOrdinal4 != 2) {
                        ez1.a();
                        return;
                    }
                    ob0Var.p(false);
                    Float fValueOf32 = Float.valueOf(f5);
                    zF5 = ob0Var.f(d22VarF);
                    objK5 = ob0Var.K();
                    if (zF5) {
                    }
                }
            } else {
                z3 = z9;
                z4 = z8;
                d22Var = d22VarF;
                ob0Var3 = ob0Var;
                ob0Var3.W(-940652386);
                ob0Var3.p(false);
                c22VarH = null;
            }
            jw0 jw0Var = jw0.g;
            if (wa0Var2 != null) {
                ob0Var3.W(-940561742);
                p60 p60VarW2 = bl.W(jw0Var, ob0Var3);
                p60 p60VarW3 = bl.W(jw0.h, ob0Var3);
                if (d22Var.g()) {
                    c22Var = c22VarH;
                    p60Var = p60VarW2;
                    p60Var2 = p60VarW3;
                    ob0Var3.W(1666827533);
                    ob0Var3.p(false);
                    objC2 = d22Var.c();
                } else {
                    c22Var = c22VarH;
                    ob0Var3.W(1666573488);
                    boolean zF8 = ob0Var3.f(d22Var);
                    objC2 = ob0Var3.K();
                    if (zF8 || objC2 == l91Var4) {
                        sp1VarL = uc1.l();
                        if (sp1VarL != null) {
                            p60Var2 = p60VarW3;
                            sa0VarE = sp1VarL.e();
                        } else {
                            p60Var2 = p60VarW3;
                            sa0VarE = null;
                        }
                        sp1VarU = uc1.u(sp1VarL);
                        p60Var = p60VarW2;
                        try {
                            objC2 = d22Var.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var3.f0(objC2);
                        } finally {
                        }
                    } else {
                        p60Var = p60VarW2;
                        p60Var2 = p60VarW3;
                    }
                    ob0Var3.p(false);
                }
                ob0Var3.W(-2037958114);
                int iOrdinal5 = ((ch0) objC2).ordinal();
                if (iOrdinal5 == 0) {
                    f2 = 1.0f;
                    ob0Var3.p(false);
                    Float fValueOf4 = Float.valueOf(f2);
                    zF3 = ob0Var3.f(d22Var);
                    objK3 = ob0Var3.K();
                    if (zF3 || objK3 == l91Var4) {
                        objK3 = s(new rq0(20, d22Var));
                        ob0Var3.f0(objK3);
                    }
                    ch0 ch0Var6 = (ch0) ((ns1) objK3).getValue();
                    ob0Var3.W(-2037958114);
                    iOrdinal2 = ch0Var6.ordinal();
                    if (iOrdinal2 == 0) {
                        f3 = 1.0f;
                        ob0Var3.p(false);
                        Float fValueOf5 = Float.valueOf(f3);
                        zF4 = ob0Var3.f(d22Var);
                        objK4 = ob0Var3.K();
                        if (zF4 || objK4 == l91Var4) {
                            objK4 = s(new rq0(21, d22Var));
                            ob0Var3.f0(objK4);
                        }
                        a22 a22Var = (a22) ((ns1) objK4).getValue();
                        ob0Var3.W(-1370891590);
                        p60 p60Var3 = (!a22Var.a(ch0Var3, ch0Var2) && (a22Var.a(ch0Var2, ch0Var3) || a22Var.a(ch0Var, ch0Var2))) ? p60Var2 : p60Var;
                        ob0Var3.p(false);
                        c22 c22VarH3 = kd1.h(d22Var, fValueOf4, fValueOf5, p60Var3, r22Var, ob0Var3, 196608);
                        ob0Var3.p(false);
                        c22Var2 = c22VarH3;
                    } else {
                        if (iOrdinal2 == 1) {
                            if (z3) {
                            }
                            ob0Var3.p(false);
                            Float fValueOf52 = Float.valueOf(f3);
                            zF4 = ob0Var3.f(d22Var);
                            objK4 = ob0Var3.K();
                            if (zF4) {
                                objK4 = s(new rq0(21, d22Var));
                                ob0Var3.f0(objK4);
                                a22 a22Var2 = (a22) ((ns1) objK4).getValue();
                                ob0Var3.W(-1370891590);
                                if (a22Var2.a(ch0Var3, ch0Var2)) {
                                    ob0Var3.p(false);
                                    c22 c22VarH32 = kd1.h(d22Var, fValueOf4, fValueOf52, p60Var3, r22Var, ob0Var3, 196608);
                                    ob0Var3.p(false);
                                    c22Var2 = c22VarH32;
                                }
                            }
                        } else if (iOrdinal2 != 2) {
                            ez1.a();
                            return;
                        }
                        f3 = 0.0f;
                        ob0Var3.p(false);
                        Float fValueOf522 = Float.valueOf(f3);
                        zF4 = ob0Var3.f(d22Var);
                        objK4 = ob0Var3.K();
                        if (zF4) {
                        }
                    }
                } else {
                    if (iOrdinal5 == 1) {
                        if (z3) {
                        }
                        ob0Var3.p(false);
                        Float fValueOf42 = Float.valueOf(f2);
                        zF3 = ob0Var3.f(d22Var);
                        objK3 = ob0Var3.K();
                        if (zF3) {
                            objK3 = s(new rq0(20, d22Var));
                            ob0Var3.f0(objK3);
                            ch0 ch0Var62 = (ch0) ((ns1) objK3).getValue();
                            ob0Var3.W(-2037958114);
                            iOrdinal2 = ch0Var62.ordinal();
                            if (iOrdinal2 == 0) {
                            }
                        }
                    } else if (iOrdinal5 != 2) {
                        ez1.a();
                        return;
                    }
                    f2 = 0.0f;
                    ob0Var3.p(false);
                    Float fValueOf422 = Float.valueOf(f2);
                    zF3 = ob0Var3.f(d22Var);
                    objK3 = ob0Var3.K();
                    if (zF3) {
                    }
                }
            } else {
                c22Var = c22VarH;
                ob0Var3.W(-940485730);
                ob0Var3.p(false);
                c22Var2 = null;
            }
            if (wa0Var4 != null) {
                ob0Var3.W(-940388328);
                p60 p60VarW4 = bl.W(jw0Var, ob0Var3);
                if (d22Var.g()) {
                    ob0Var3.W(1666827533);
                    ob0Var3.p(false);
                    objC = d22Var.c();
                } else {
                    ob0Var3.W(1666573488);
                    boolean zF9 = ob0Var3.f(d22Var);
                    objC = ob0Var3.K();
                    if (zF9 || objC == l91Var4) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC5 = d22Var.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var3.f0(objC5);
                            objC = objC5;
                        } finally {
                        }
                    }
                    ob0Var3.p(false);
                }
                ob0Var3.W(-2144425951);
                int iOrdinal6 = ((ch0) objC).ordinal();
                if (iOrdinal6 == 0) {
                    ob0Var3.p(false);
                    Float fValueOf6 = Float.valueOf(f);
                    zF = ob0Var3.f(d22Var);
                    objK = ob0Var3.K();
                    if (zF || objK == l91Var4) {
                        objK = s(new rq0(12, d22Var));
                        ob0Var3.f0(objK);
                    }
                    ch0 ch0Var7 = (ch0) ((ns1) objK).getValue();
                    ob0Var3.W(-2144425951);
                    iOrdinal = ch0Var7.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            if (z3) {
                                f = 0.0f;
                                z7 = false;
                            }
                            ob0Var3.p(z7);
                            Float fValueOf7 = Float.valueOf(f);
                            zF2 = ob0Var3.f(d22Var);
                            objK2 = ob0Var3.K();
                            if (zF2 || objK2 == l91Var4) {
                                objK2 = s(new rq0(13, d22Var));
                                ob0Var3.f0(objK2);
                            }
                            ob0Var3.W(-735253059);
                            z5 = false;
                            ob0Var3.p(false);
                            ob0 ob0Var6 = ob0Var3;
                            d22Var2 = d22Var;
                            c22VarH2 = kd1.h(d22Var2, fValueOf6, fValueOf7, p60VarW4, r22Var, ob0Var6, 196608);
                            ob0Var4 = ob0Var6;
                            ob0Var4.p(false);
                        } else if (iOrdinal != 2) {
                            ez1.a();
                            return;
                        }
                    }
                    z7 = false;
                    f = 1.0f;
                    ob0Var3.p(z7);
                    Float fValueOf72 = Float.valueOf(f);
                    zF2 = ob0Var3.f(d22Var);
                    objK2 = ob0Var3.K();
                    if (zF2) {
                        objK2 = s(new rq0(13, d22Var));
                        ob0Var3.f0(objK2);
                        ob0Var3.W(-735253059);
                        z5 = false;
                        ob0Var3.p(false);
                        ob0 ob0Var62 = ob0Var3;
                        d22Var2 = d22Var;
                        c22VarH2 = kd1.h(d22Var2, fValueOf6, fValueOf72, p60VarW4, r22Var, ob0Var62, 196608);
                        ob0Var4 = ob0Var62;
                        ob0Var4.p(false);
                    }
                } else {
                    if (iOrdinal6 == 1) {
                        float f6 = z3 ? 0.0f : 1.0f;
                        ob0Var3.p(false);
                        Float fValueOf62 = Float.valueOf(f6);
                        zF = ob0Var3.f(d22Var);
                        objK = ob0Var3.K();
                        if (zF) {
                            objK = s(new rq0(12, d22Var));
                            ob0Var3.f0(objK);
                            ch0 ch0Var72 = (ch0) ((ns1) objK).getValue();
                            ob0Var3.W(-2144425951);
                            iOrdinal = ch0Var72.ordinal();
                            if (iOrdinal != 0) {
                            }
                            z7 = false;
                            f = 1.0f;
                            ob0Var3.p(z7);
                            Float fValueOf722 = Float.valueOf(f);
                            zF2 = ob0Var3.f(d22Var);
                            objK2 = ob0Var3.K();
                            if (zF2) {
                            }
                        }
                    } else if (iOrdinal6 != 2) {
                        ez1.a();
                        return;
                    }
                    ob0Var3.p(false);
                    Float fValueOf622 = Float.valueOf(f6);
                    zF = ob0Var3.f(d22Var);
                    objK = ob0Var3.K();
                    if (zF) {
                    }
                }
            } else {
                ob0Var4 = ob0Var3;
                d22Var2 = d22Var;
                z5 = false;
                ob0Var4.W(-940318082);
                ob0Var4.p(false);
                c22VarH2 = null;
            }
            if (xa0Var == null) {
                ob0Var4.W(-940231841);
                ob0Var4.p(z5);
                fx1Var2 = fx1Var;
                c22Var3 = c22VarH2;
                ob0Var5 = ob0Var4;
                l91Var = l91Var4;
                z6 = z5;
                l91Var2 = l91Var3;
                d02Var = d02Var4;
                d02Var2 = d02Var3;
                joVar = null;
                c22Var4 = c22Var;
            } else {
                ob0Var4.W(-940231840);
                ob0Var5 = ob0Var4;
                c22Var3 = c22VarH2;
                l91Var = l91Var4;
                z6 = z5;
                l91Var2 = l91Var3;
                d02Var = d02Var4;
                c22 c22Var5 = c22Var;
                kx1 kx1Var = new kx1(c22Var5, fx1Var, z2, zBooleanValue, z4, d22Var2, d02Var, d02Var3, xa0Var);
                fx1Var2 = fx1Var;
                d02Var2 = d02Var3;
                c22Var4 = c22Var5;
                jo joVarD0 = lk.d0(1632654811, kx1Var, ob0Var5);
                ob0Var5.p(z6);
                joVar = joVarD0;
            }
            final long j2 = !z2 ? fx1Var2.D : zBooleanValue ? fx1Var2.B : fx1Var2.C;
            Object objK7 = ob0Var5.K();
            l91 l91Var5 = l91Var;
            if (objK7 == l91Var5) {
                il1 il1Var = new il1(c22Var2, 5);
                oc ocVar = iq1.a;
                qx qxVar = new qx(il1Var, l91Var2);
                ob0Var5.f0(qxVar);
                objK7 = qxVar;
            }
            ns1 ns1Var = (ns1) objK7;
            if (wa0Var2 != null && charSequence.length() == 0 && ((Boolean) ns1Var.getValue()).booleanValue()) {
                ob0Var5.W(-939160356);
                jo joVarD02 = lk.d0(-720601610, new xa0() { // from class: ox1
                    @Override // defpackage.xa0
                    public final Object f(Object obj, Object obj2, Object obj3) {
                        tv0 tv0Var = (tv0) obj;
                        ob0 ob0Var7 = (ob0) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ob0Var7.f(tv0Var) ? 4 : 2;
                        }
                        if (ob0Var7.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                            uu0 uu0VarD = sg.d(v20.f, false);
                            int iHashCode = Long.hashCode(ob0Var7.T);
                            b61 b61VarL = ob0Var7.l();
                            tv0 tv0VarP = bk.P(ob0Var7, tv0Var);
                            ep.c.getClass();
                            zp zpVar = dp.b;
                            ob0Var7.Z();
                            if (ob0Var7.S) {
                                ob0Var7.k(zpVar);
                            } else {
                                ob0Var7.i0();
                            }
                            xc.E(dp.f, ob0Var7, uu0VarD);
                            xc.E(dp.e, ob0Var7, b61VarL);
                            xc.E(dp.g, ob0Var7, Integer.valueOf(iHashCode));
                            xc.C(ob0Var7, dp.h);
                            xc.E(dp.d, ob0Var7, tv0VarP);
                            xc.c(j2, d02Var2, wa0Var2, ob0Var7, 0);
                            ob0Var7.p(true);
                        } else {
                            ob0Var7.Q();
                        }
                        return t32.a;
                    }
                }, ob0Var5);
                ob0Var5.p(z6);
                joVar2 = joVarD02;
            } else {
                ob0Var5.W(-938848683);
                ob0Var5.p(z6);
                joVar2 = null;
            }
            Object objK8 = ob0Var5.K();
            int i8 = 6;
            if (objK8 == l91Var5) {
                il1 il1Var2 = new il1(c22Var3, i8);
                oc ocVar2 = iq1.a;
                qx qxVar2 = new qx(il1Var2, l91Var2);
                ob0Var5.f0(qxVar2);
                objK8 = qxVar2;
            }
            ns1 ns1Var2 = (ns1) objK8;
            ob0Var5.W(-938405259);
            ob0Var5.p(z6);
            long j3 = !z2 ? fx1Var2.P : zBooleanValue ? fx1Var2.N : fx1Var2.O;
            if (wa0Var4 == null || !((Boolean) ns1Var2.getValue()).booleanValue()) {
                i5 = 6;
                ob0Var5.W(-938084843);
                ob0Var5.p(z6);
                joVar3 = null;
            } else {
                ob0Var5.W(-938232185);
                final long j4 = j3;
                final int i9 = 1;
                i5 = 6;
                jo joVarD03 = lk.d0(123777469, new wa0() { // from class: lx1
                    @Override // defpackage.wa0
                    public final Object h(Object obj, Object obj2) {
                        int i10 = i9;
                        t32 t32Var = t32.a;
                        switch (i10) {
                            case 0:
                                ob0 ob0Var7 = (ob0) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ob0Var7.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ob0Var7.Q();
                                } else {
                                    xc.c(j4, d02Var2, wa0Var4, ob0Var7, 0);
                                }
                                break;
                            default:
                                ob0 ob0Var8 = (ob0) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ob0Var8.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ob0Var8.Q();
                                } else {
                                    xc.c(j4, d02Var2, wa0Var4, ob0Var8, 0);
                                }
                                break;
                        }
                        return t32Var;
                    }
                }, ob0Var5);
                ob0Var5.p(z6);
                joVar3 = joVarD03;
            }
            long j5 = !z2 ? fx1Var2.r : zBooleanValue ? fx1Var2.p : fx1Var2.q;
            if (wa0Var3 == null) {
                ob0Var5.W(-937922124);
                ob0Var5.p(z6);
                joVar4 = null;
            } else {
                ob0Var5.W(-937922123);
                jo joVarD04 = lk.d0(-906968406, new mx1(j5, wa0Var3), ob0Var5);
                ob0Var5.p(z6);
                joVar4 = joVarD04;
            }
            ob0Var5.W(-937662189);
            ob0Var5.p(z6);
            final long j6 = !z2 ? fx1Var2.H : zBooleanValue ? fx1Var2.F : fx1Var2.G;
            if (wa0Var5 == null) {
                ob0Var5.W(-937391714);
                ob0Var5.p(z6);
                joVar5 = null;
            } else {
                ob0Var5.W(-937391713);
                final int i10 = 0;
                final d02 d02Var5 = d02Var;
                jo joVarD05 = lk.d0(-1612592437, new wa0() { // from class: lx1
                    @Override // defpackage.wa0
                    public final Object h(Object obj, Object obj2) {
                        int i102 = i10;
                        t32 t32Var = t32.a;
                        switch (i102) {
                            case 0:
                                ob0 ob0Var7 = (ob0) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ob0Var7.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ob0Var7.Q();
                                } else {
                                    xc.c(j6, d02Var5, wa0Var5, ob0Var7, 0);
                                }
                                break;
                            default:
                                ob0 ob0Var8 = (ob0) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ob0Var8.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ob0Var8.Q();
                                } else {
                                    xc.c(j6, d02Var5, wa0Var5, ob0Var8, 0);
                                }
                                break;
                        }
                        return t32Var;
                    }
                }, ob0Var5);
                ob0Var5.p(z6);
                joVar5 = joVarD05;
            }
            boolean zF10 = ob0Var5.f(c22Var4);
            Object objK9 = ob0Var5.K();
            if (zF10 || objK9 == l91Var5) {
                objK9 = new il1(c22Var4, 2);
                ob0Var5.f0(objK9);
            }
            ha0 ha0Var = (ha0) objK9;
            boolean zF11 = ob0Var5.f(c22Var2);
            Object objK10 = ob0Var5.K();
            if (zF11 || objK10 == l91Var5) {
                objK10 = new il1(c22Var2, 3);
                ob0Var5.f0(objK10);
            }
            ha0 ha0Var2 = (ha0) objK10;
            boolean zF12 = ob0Var5.f(c22Var3);
            Object objK11 = ob0Var5.K();
            if (zF12 || objK11 == l91Var5) {
                objK11 = new il1(c22Var3, 4);
                ob0Var5.f0(objK11);
            }
            ob0Var5.W(-936973554);
            wa0Var7 = wa0Var6;
            ob0 ob0Var7 = ob0Var5;
            af1.f(wa0Var, joVar, joVar2, joVar4, null, null, joVar3, z, zx1Var, new rx1(ha0Var), new rx1(ha0Var2), new rx1((ha0) objK11), lk.d0(-358432442, new uq0(1, wa0Var7), ob0Var5), joVar5, c41Var, ob0Var7, ((i6 >> 3) & 112) | i5 | ((i7 << 21) & 234881024) | ((i6 << 18) & 1879048192), (i7 & 458752) | 3072);
            ob0Var2 = ob0Var7;
            ob0Var2.p(z6);
        } else {
            fx1Var2 = fx1Var;
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            final fx1 fx1Var3 = fx1Var2;
            final wa0 wa0Var8 = wa0Var7;
            dc1VarR.d = new wa0() { // from class: nx1
                @Override // defpackage.wa0
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = al.V(i | 1);
                    int iV2 = al.V(i2);
                    xc.a(charSequence, wa0Var, zx1Var, xa0Var, wa0Var2, wa0Var3, wa0Var4, wa0Var5, z, z2, jx0Var, c41Var, fx1Var3, wa0Var8, (ob0) obj, iV, iV2);
                    return t32.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x039b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ns1 ns1Var, fx1 fx1Var, boolean z, boolean z2, boolean z3, d22 d22Var, d02 d02Var, d02 d02Var2, xa0 xa0Var, ob0 ob0Var, int i) {
        a4 a4Var;
        px1 px1Var;
        long j;
        l91 l91Var;
        boolean z4;
        c22 c22VarH;
        Object objC;
        d22 d22Var2;
        int i2;
        c22 c22Var;
        boolean z5;
        Object objK;
        boolean z6;
        Object objK2;
        float fFloatValue;
        cz1 cz1Var;
        cz1 cz1Var2;
        boolean z7;
        cz1 nhVar;
        aa0 aa0Var;
        aa0 aa0Var2;
        dz1 dz1Var;
        dz1 dz1Var2;
        um1 um1Var;
        um1 um1VarS;
        um1 um1Var2;
        v71 v71Var;
        v71 v71Var2;
        fz1 fz1Var;
        fz1 fz1Var2;
        m71 m71Var;
        m71 m71Var2;
        m71 m71Var3;
        d02 d02VarA;
        sp1 sp1VarL;
        sa0 sa0VarE;
        sp1 sp1VarU;
        int i3;
        boolean z8;
        Object objC2;
        int i4;
        boolean z9;
        Object objK3;
        boolean z10;
        Object objK4;
        d22 d22Var3 = d22Var;
        xa0 xa0Var2 = xa0Var;
        v41 v41Var = d22Var3.d;
        a4 a4Var2 = a4.t;
        ob0Var.X(376119213);
        int i5 = i | (ob0Var.f(ns1Var) ? 4 : 2) | (ob0Var.f(fx1Var) ? 32 : 16) | (ob0Var.g(z) ? 256 : 128) | (ob0Var.g(false) ? 2048 : 1024) | (ob0Var.g(z2) ? 16384 : 8192) | (ob0Var.g(z3) ? 131072 : 65536) | (ob0Var.f(d22Var3) ? 1048576 : 524288) | (ob0Var.f(d02Var) ? 8388608 : 4194304) | (ob0Var.f(d02Var2) ? 67108864 : 33554432) | (ob0Var.h(xa0Var2) ? 536870912 : 268435456);
        if (ob0Var.N(i5 & 1, (i5 & 306783379) != 306783378)) {
            Object objK5 = ob0Var.K();
            l91 l91Var2 = kp.a;
            if (objK5 == l91Var2) {
                objK5 = new px1();
                ob0Var.f0(objK5);
            }
            px1 px1Var2 = (px1) objK5;
            long j2 = !z ? fx1Var.z : z2 ? fx1Var.x : fx1Var.y;
            jw0 jw0Var = jw0.g;
            int i6 = 14;
            if (z3) {
                ob0Var.W(-601510006);
                long jB = d02Var.b();
                if (z3 && jB == 16) {
                    jB = j2;
                }
                long jB2 = d02Var2.b();
                if (z3 && jB2 == 16) {
                    jB2 = j2;
                }
                j = j2;
                p60 p60VarW = bl.W(jw0Var, ob0Var);
                int i7 = ((i5 >> 18) & 14) | 384;
                ch0 ch0Var = (ch0) v41Var.getValue();
                ob0Var.W(-759924327);
                int[] iArr = qx1.a;
                long j3 = iArr[ch0Var.ordinal()] == 1 ? jB : jB2;
                ob0Var.p(false);
                em emVarF = vl.f(j3);
                boolean zF = ob0Var.f(emVarF);
                Object objK6 = ob0Var.K();
                if (zF || objK6 == l91Var2) {
                    r22 r22Var = new r22(a4Var2, new g3(6, emVarF));
                    ob0Var.f0(r22Var);
                    objK6 = r22Var;
                }
                r22 r22Var2 = (r22) objK6;
                int i8 = (i7 & 14) | 3072;
                if (d22Var3.g()) {
                    i3 = i8;
                    z8 = false;
                    ob0Var.W(1666827533);
                    ob0Var.p(false);
                    objC2 = d22Var3.c();
                } else {
                    ob0Var.W(1666573488);
                    i3 = i8;
                    boolean z11 = (((i8 & 14) ^ 6) > 4 && ob0Var.f(d22Var3)) || (i3 & 6) == 4;
                    objC2 = ob0Var.K();
                    if (z11 || objC2 == l91Var2) {
                        sp1VarL = uc1.l();
                        sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                        sp1VarU = uc1.u(sp1VarL);
                        try {
                            Object objC3 = d22Var3.c();
                            uc1.B(sp1VarL, sp1VarU, sa0VarE);
                            ob0Var.f0(objC3);
                            objC2 = objC3;
                        } finally {
                        }
                    }
                    z8 = false;
                    ob0Var.p(false);
                }
                ob0Var.W(-759924327);
                long j4 = iArr[((ch0) objC2).ordinal()] == 1 ? jB : jB2;
                ob0Var.p(z8);
                a4Var = a4Var2;
                vl vlVar = new vl(j4);
                int i9 = i3 & 14;
                int i10 = i9 ^ 6;
                if (i10 <= 4 || !ob0Var.f(d22Var3)) {
                    i4 = i9;
                    if ((i3 & 6) != 4) {
                        z9 = false;
                    }
                    objK3 = ob0Var.K();
                    if (!z9 || objK3 == l91Var2) {
                        objK3 = s(new rq0(18, d22Var3));
                        ob0Var.f0(objK3);
                    }
                    ch0 ch0Var2 = (ch0) ((ns1) objK3).getValue();
                    ob0Var.W(-759924327);
                    long j5 = iArr[ch0Var2.ordinal()] != 1 ? jB : jB2;
                    ob0Var.p(false);
                    px1Var = px1Var2;
                    vl vlVar2 = new vl(j5);
                    d22Var3 = d22Var;
                    z10 = (i10 <= 4 && ob0Var.f(d22Var3)) || (i3 & 6) == 4;
                    objK4 = ob0Var.K();
                    if (z10 || objK4 == l91Var2) {
                        objK4 = s(new rq0(19, d22Var3));
                        ob0Var.f0(objK4);
                    }
                    ob0Var.W(1730286052);
                    z4 = false;
                    ob0Var.p(false);
                    l91Var = l91Var2;
                    c22VarH = kd1.h(d22Var3, vlVar, vlVar2, p60VarW, r22Var2, ob0Var, i4 | 196608);
                    ob0Var.p(false);
                } else {
                    i4 = i9;
                }
                z9 = true;
                objK3 = ob0Var.K();
                if (!z9) {
                    objK3 = s(new rq0(18, d22Var3));
                    ob0Var.f0(objK3);
                    ch0 ch0Var22 = (ch0) ((ns1) objK3).getValue();
                    ob0Var.W(-759924327);
                    if (iArr[ch0Var22.ordinal()] != 1) {
                    }
                    ob0Var.p(false);
                    px1Var = px1Var2;
                    vl vlVar22 = new vl(j5);
                    d22Var3 = d22Var;
                    if (i10 <= 4) {
                        objK4 = ob0Var.K();
                        if (z10) {
                            objK4 = s(new rq0(19, d22Var3));
                            ob0Var.f0(objK4);
                            ob0Var.W(1730286052);
                            z4 = false;
                            ob0Var.p(false);
                            l91Var = l91Var2;
                            c22VarH = kd1.h(d22Var3, vlVar, vlVar22, p60VarW, r22Var2, ob0Var, i4 | 196608);
                            ob0Var.p(false);
                        }
                    } else {
                        objK4 = ob0Var.K();
                        if (z10) {
                        }
                    }
                }
            } else {
                a4Var = a4Var2;
                px1Var = px1Var2;
                j = j2;
                l91Var = l91Var2;
                z4 = false;
                ob0Var.W(-601031335);
                ob0Var.p(false);
                c22VarH = null;
            }
            p60 p60VarW2 = bl.W(jw0Var, ob0Var);
            int i11 = ((i5 >> 18) & 14) | 384;
            ob0Var.W(1139343725);
            ob0Var.p(z4);
            em emVarF2 = vl.f(j);
            boolean zF2 = ob0Var.f(emVarF2);
            Object objK7 = ob0Var.K();
            if (zF2 || objK7 == l91Var) {
                objK7 = new r22(a4Var, new g3(6, emVarF2));
                ob0Var.f0(objK7);
            }
            r22 r22Var3 = (r22) objK7;
            int i12 = (i11 & 14) | 3072;
            if (d22Var3.g()) {
                ob0Var.W(1666827533);
                ob0Var.p(z4);
                objC = d22Var3.c();
            } else {
                ob0Var.W(1666573488);
                boolean z12 = ((((i12 & 14) ^ 6) <= 4 || !ob0Var.f(d22Var3)) && (i12 & 6) != 4) ? z4 : true;
                objC = ob0Var.K();
                if (z12 || objC == l91Var) {
                    sp1VarL = uc1.l();
                    sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
                    sp1VarU = uc1.u(sp1VarL);
                    try {
                        Object objC4 = d22Var3.c();
                        uc1.B(sp1VarL, sp1VarU, sa0VarE);
                        ob0Var.f0(objC4);
                        objC = objC4;
                    } finally {
                    }
                }
                ob0Var.p(z4);
            }
            ob0Var.W(1139343725);
            ob0Var.p(z4);
            c22 c22Var2 = c22VarH;
            long j6 = j;
            vl vlVar3 = new vl(j6);
            int i13 = i12 & 14;
            int i14 = i13 ^ 6;
            if (i14 > 4) {
                d22Var2 = d22Var;
                if (ob0Var.f(d22Var2)) {
                    i2 = i12;
                    c22Var = c22Var2;
                }
                objK = ob0Var.K();
                if (!z5 || objK == l91Var) {
                    objK = s(new rq0(i6, d22Var2));
                    ob0Var.f0(objK);
                }
                ob0Var.W(1139343725);
                ob0Var.p(false);
                vl vlVar4 = new vl(j6);
                z6 = (i14 <= 4 && ob0Var.f(d22Var2)) || (i2 & 6) == 4;
                objK2 = ob0Var.K();
                if (z6 || objK2 == l91Var) {
                    objK2 = s(new rq0(15, d22Var2));
                    ob0Var.f0(objK2);
                }
                ob0Var.W(-1207102280);
                ob0Var.p(false);
                c22 c22Var3 = c22Var;
                c22 c22VarH2 = kd1.h(d22Var2, vlVar3, vlVar4, p60VarW2, r22Var3, ob0Var, i13 | 196608);
                fFloatValue = ns1Var == null ? ((Number) ns1Var.getValue()).floatValue() : 1.0f;
                zq1 zq1Var = d02Var2.a;
                zq1 zq1Var2 = d02Var.a;
                cz1 cz1Var3 = ar1.d;
                cz1Var = zq1Var.a;
                cz1Var2 = zq1Var2.a;
                z7 = cz1Var instanceof nh;
                nhVar = bz1.a;
                if (z7 && !(cz1Var2 instanceof nh)) {
                    long jU = lk.U(fFloatValue, cz1Var.b(), cz1Var2.b());
                    if (jU != 16) {
                        nhVar = new xm(jU);
                    }
                } else if (z7 || !(cz1Var2 instanceof nh)) {
                    nhVar = (cz1) ar1.b(cz1Var, cz1Var2, fFloatValue);
                } else {
                    nh nhVar2 = (nh) cz1Var;
                    nh nhVar3 = (nh) cz1Var2;
                    lh lhVar = (lh) ar1.b(nhVar2.a, nhVar3.a, fFloatValue);
                    float fA = xk.A(nhVar2.b, nhVar3.b, fFloatValue);
                    if (lhVar != null) {
                        if (lhVar instanceof uq1) {
                            long jW = uc1.w(fA, ((uq1) lhVar).a);
                            if (jW != 16) {
                                nhVar = new xm(jW);
                            }
                        } else {
                            if (!(lhVar instanceof mh)) {
                                ez1.a();
                                return;
                            }
                            nhVar = new nh((mh) lhVar, fA);
                        }
                    }
                }
                cz1 cz1Var4 = nhVar;
                lv1 lv1Var = (lv1) ar1.b(zq1Var.f, zq1Var2.f, fFloatValue);
                long jC = ar1.c(fFloatValue, zq1Var.b, zq1Var2.b);
                aa0Var = zq1Var.c;
                if (aa0Var == null) {
                    aa0Var = aa0.g;
                }
                aa0Var2 = zq1Var2.c;
                if (aa0Var2 == null) {
                    aa0Var2 = aa0.g;
                }
                aa0 aa0Var3 = new aa0(lk.A(xk.B(fFloatValue, aa0Var.e, aa0Var2.e), 1, 1000));
                y90 y90Var = (y90) ar1.b(zq1Var.d, zq1Var2.d, fFloatValue);
                z90 z90Var = (z90) ar1.b(zq1Var.e, zq1Var2.e, fFloatValue);
                String str = (String) ar1.b(zq1Var.g, zq1Var2.g, fFloatValue);
                long jC2 = ar1.c(fFloatValue, zq1Var.h, zq1Var2.h);
                df dfVar = zq1Var.i;
                float f = dfVar == null ? dfVar.a : 0.0f;
                df dfVar2 = zq1Var2.i;
                float fA2 = xk.A(f, dfVar2 == null ? dfVar2.a : 0.0f, fFloatValue);
                dz1Var = zq1Var.j;
                dz1 dz1Var3 = dz1.c;
                if (dz1Var == null) {
                    dz1Var = dz1Var3;
                }
                dz1Var2 = zq1Var2.j;
                if (dz1Var2 != null) {
                    dz1Var3 = dz1Var2;
                }
                dz1 dz1Var4 = new dz1(xk.A(dz1Var.a, dz1Var3.a, fFloatValue), xk.A(dz1Var.b, dz1Var3.b, fFloatValue));
                as0 as0Var = (as0) ar1.b(zq1Var.k, zq1Var2.k, fFloatValue);
                long jU2 = lk.U(fFloatValue, zq1Var.l, zq1Var2.l);
                ax1 ax1Var = (ax1) ar1.b(zq1Var.m, zq1Var2.m, fFloatValue);
                um1Var = zq1Var.n;
                um1 um1Var3 = zq1Var2.n;
                if (um1Var == null || um1Var3 != null) {
                    if (um1Var != null) {
                        um1Var3.getClass();
                        um1VarS = qc1.s(new um1(um1Var3.c, vl.b(0.0f, um1Var3.a), um1Var3.b), um1Var3, fFloatValue);
                    } else {
                        um1VarS = um1Var3 == null ? qc1.s(um1Var, new um1(um1Var.c, vl.b(0.0f, um1Var.a), um1Var.b), fFloatValue) : qc1.s(um1Var, um1Var3, fFloatValue);
                    }
                    um1Var2 = um1VarS;
                } else {
                    um1Var2 = null;
                }
                v71Var = zq1Var.o;
                v71 v71Var3 = zq1Var2.o;
                if (v71Var == null || v71Var3 != null) {
                    if (v71Var == null) {
                        v71Var = v71.a;
                    }
                    v71Var2 = v71Var;
                } else {
                    v71Var2 = null;
                }
                zq1 zq1Var3 = new zq1(cz1Var4, jC, aa0Var3, y90Var, z90Var, lv1Var, str, jC2, new df(fA2), dz1Var4, as0Var, jU2, ax1Var, um1Var2, v71Var2, (q10) ar1.b(zq1Var.p, zq1Var2.p, fFloatValue));
                p41 p41Var = d02Var2.b;
                p41 p41Var2 = d02Var.b;
                int i15 = q41.b;
                int i16 = ((dw1) ar1.b(new dw1(p41Var.a), new dw1(p41Var2.a), fFloatValue)).a;
                int i17 = ((dx1) ar1.b(new dx1(p41Var.b), new dx1(p41Var2.b), fFloatValue)).a;
                long jC3 = ar1.c(fFloatValue, p41Var.c, p41Var2.c);
                fz1Var = p41Var.d;
                if (fz1Var == null) {
                    fz1Var = fz1.c;
                }
                fz1Var2 = p41Var2.d;
                if (fz1Var2 == null) {
                    fz1Var2 = fz1.c;
                }
                fz1 fz1Var3 = new fz1(ar1.c(fFloatValue, fz1Var.a, fz1Var2.a), ar1.c(fFloatValue, fz1Var.b, fz1Var2.b));
                m71Var = p41Var.e;
                m71Var2 = p41Var2.e;
                if (m71Var == null || m71Var2 != null) {
                    m71 m71Var4 = m71.c;
                    if (m71Var == null) {
                        m71Var = m71Var4;
                    }
                    boolean z13 = m71Var.a;
                    if (m71Var2 == null) {
                        m71Var2 = m71Var4;
                    }
                    boolean z14 = m71Var2.a;
                    m71Var3 = z13 != z14 ? m71Var : new m71(((u30) ar1.b(new u30(m71Var.b), new u30(m71Var2.b), fFloatValue)).a, ((Boolean) ar1.b(Boolean.valueOf(z13), Boolean.valueOf(z14), fFloatValue)).booleanValue());
                } else {
                    m71Var3 = null;
                }
                d02 d02Var3 = new d02(zq1Var3, new p41(i16, i17, jC3, fz1Var3, m71Var3, (mp0) ar1.b(p41Var.f, p41Var2.f, fFloatValue), ((hp0) ar1.b(new hp0(p41Var.g), new hp0(p41Var2.g), fFloatValue)).a, ((le0) ar1.b(new le0(p41Var.h), new le0(p41Var2.h), fFloatValue)).a, (uz1) ar1.b(p41Var.i, p41Var2.i, fFloatValue)));
                if (z3) {
                    d02VarA = d02Var3;
                } else {
                    c22Var3.getClass();
                    d02VarA = d02.a(d02Var3, ((vl) c22Var3.l.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                }
                xa0Var2 = xa0Var;
                c(((vl) c22VarH2.l.getValue()).a, d02VarA, lk.d0(57043598, new fi(14, xa0Var2, px1Var), ob0Var), ob0Var, 384);
            } else {
                d22Var2 = d22Var;
            }
            i2 = i12;
            c22Var = c22Var2;
            z5 = (i2 & 6) == 4;
            objK = ob0Var.K();
            if (!z5) {
                objK = s(new rq0(i6, d22Var2));
                ob0Var.f0(objK);
                ob0Var.W(1139343725);
                ob0Var.p(false);
                vl vlVar42 = new vl(j6);
                if (i14 <= 4) {
                    objK2 = ob0Var.K();
                    if (z6) {
                        objK2 = s(new rq0(15, d22Var2));
                        ob0Var.f0(objK2);
                        ob0Var.W(-1207102280);
                        ob0Var.p(false);
                        c22 c22Var32 = c22Var;
                        c22 c22VarH22 = kd1.h(d22Var2, vlVar3, vlVar42, p60VarW2, r22Var3, ob0Var, i13 | 196608);
                        if (ns1Var == null) {
                        }
                        zq1 zq1Var4 = d02Var2.a;
                        zq1 zq1Var22 = d02Var.a;
                        cz1 cz1Var32 = ar1.d;
                        cz1Var = zq1Var4.a;
                        cz1Var2 = zq1Var22.a;
                        z7 = cz1Var instanceof nh;
                        nhVar = bz1.a;
                        if (z7) {
                            if (z7) {
                                nhVar = (cz1) ar1.b(cz1Var, cz1Var2, fFloatValue);
                                cz1 cz1Var42 = nhVar;
                                lv1 lv1Var2 = (lv1) ar1.b(zq1Var4.f, zq1Var22.f, fFloatValue);
                                long jC4 = ar1.c(fFloatValue, zq1Var4.b, zq1Var22.b);
                                aa0Var = zq1Var4.c;
                                if (aa0Var == null) {
                                }
                                aa0Var2 = zq1Var22.c;
                                if (aa0Var2 == null) {
                                }
                                aa0 aa0Var32 = new aa0(lk.A(xk.B(fFloatValue, aa0Var.e, aa0Var2.e), 1, 1000));
                                y90 y90Var2 = (y90) ar1.b(zq1Var4.d, zq1Var22.d, fFloatValue);
                                z90 z90Var2 = (z90) ar1.b(zq1Var4.e, zq1Var22.e, fFloatValue);
                                String str2 = (String) ar1.b(zq1Var4.g, zq1Var22.g, fFloatValue);
                                long jC22 = ar1.c(fFloatValue, zq1Var4.h, zq1Var22.h);
                                df dfVar3 = zq1Var4.i;
                                if (dfVar3 == null) {
                                }
                                df dfVar22 = zq1Var22.i;
                                float fA22 = xk.A(f, dfVar22 == null ? dfVar22.a : 0.0f, fFloatValue);
                                dz1Var = zq1Var4.j;
                                dz1 dz1Var32 = dz1.c;
                                if (dz1Var == null) {
                                }
                                dz1Var2 = zq1Var22.j;
                                if (dz1Var2 != null) {
                                }
                                dz1 dz1Var42 = new dz1(xk.A(dz1Var.a, dz1Var32.a, fFloatValue), xk.A(dz1Var.b, dz1Var32.b, fFloatValue));
                                as0 as0Var2 = (as0) ar1.b(zq1Var4.k, zq1Var22.k, fFloatValue);
                                long jU22 = lk.U(fFloatValue, zq1Var4.l, zq1Var22.l);
                                ax1 ax1Var2 = (ax1) ar1.b(zq1Var4.m, zq1Var22.m, fFloatValue);
                                um1Var = zq1Var4.n;
                                um1 um1Var32 = zq1Var22.n;
                                if (um1Var == null) {
                                    if (um1Var != null) {
                                    }
                                    um1Var2 = um1VarS;
                                    v71Var = zq1Var4.o;
                                    v71 v71Var32 = zq1Var22.o;
                                    if (v71Var == null) {
                                        if (v71Var == null) {
                                        }
                                        v71Var2 = v71Var;
                                        zq1 zq1Var32 = new zq1(cz1Var42, jC4, aa0Var32, y90Var2, z90Var2, lv1Var2, str2, jC22, new df(fA22), dz1Var42, as0Var2, jU22, ax1Var2, um1Var2, v71Var2, (q10) ar1.b(zq1Var4.p, zq1Var22.p, fFloatValue));
                                        p41 p41Var3 = d02Var2.b;
                                        p41 p41Var22 = d02Var.b;
                                        int i152 = q41.b;
                                        int i162 = ((dw1) ar1.b(new dw1(p41Var3.a), new dw1(p41Var22.a), fFloatValue)).a;
                                        int i172 = ((dx1) ar1.b(new dx1(p41Var3.b), new dx1(p41Var22.b), fFloatValue)).a;
                                        long jC32 = ar1.c(fFloatValue, p41Var3.c, p41Var22.c);
                                        fz1Var = p41Var3.d;
                                        if (fz1Var == null) {
                                        }
                                        fz1Var2 = p41Var22.d;
                                        if (fz1Var2 == null) {
                                        }
                                        fz1 fz1Var32 = new fz1(ar1.c(fFloatValue, fz1Var.a, fz1Var2.a), ar1.c(fFloatValue, fz1Var.b, fz1Var2.b));
                                        m71Var = p41Var3.e;
                                        m71Var2 = p41Var22.e;
                                        if (m71Var == null) {
                                            m71 m71Var42 = m71.c;
                                            if (m71Var == null) {
                                            }
                                            boolean z132 = m71Var.a;
                                            if (m71Var2 == null) {
                                            }
                                            boolean z142 = m71Var2.a;
                                            if (z132 != z142) {
                                            }
                                            d02 d02Var32 = new d02(zq1Var32, new p41(i162, i172, jC32, fz1Var32, m71Var3, (mp0) ar1.b(p41Var3.f, p41Var22.f, fFloatValue), ((hp0) ar1.b(new hp0(p41Var3.g), new hp0(p41Var22.g), fFloatValue)).a, ((le0) ar1.b(new le0(p41Var3.h), new le0(p41Var22.h), fFloatValue)).a, (uz1) ar1.b(p41Var3.i, p41Var22.i, fFloatValue)));
                                            if (z3) {
                                            }
                                            xa0Var2 = xa0Var;
                                            c(((vl) c22VarH22.l.getValue()).a, d02VarA, lk.d0(57043598, new fi(14, xa0Var2, px1Var), ob0Var), ob0Var, 384);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    objK2 = ob0Var.K();
                    if (z6) {
                    }
                }
            }
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new kx1(ns1Var, fx1Var, z, z2, z3, d22Var, d02Var, d02Var2, xa0Var2, i);
        }
    }

    public static final void c(long j, d02 d02Var, wa0 wa0Var, ob0 ob0Var, int i) {
        long j2;
        d02 d02Var2;
        wa0 wa0Var2;
        ob0 ob0Var2;
        ob0Var.X(396611577);
        int i2 = (ob0Var.e(j) ? 4 : 2) | i | (ob0Var.f(d02Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(wa0Var) ? 256 : 128;
        }
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            ob0Var2 = ob0Var;
            bk.e(j, d02Var, wa0Var, ob0Var2, i2 & 1022);
            j2 = j;
            d02Var2 = d02Var;
            wa0Var2 = wa0Var;
        } else {
            j2 = j;
            d02Var2 = d02Var;
            wa0Var2 = wa0Var;
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new ob1(j2, d02Var2, wa0Var2, i, 1);
        }
    }

    public static final void d(long j, wa0 wa0Var, ob0 ob0Var, int i) {
        ob0Var.X(590397809);
        int i2 = (ob0Var.e(j) ? 4 : 2) | i | (ob0Var.h(wa0Var) ? 32 : 16);
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            lk.i(rr.a.a(new vl(j)), wa0Var, ob0Var, (i2 & 112) | 8);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new mx1(j, wa0Var, i);
        }
    }

    public static final hg1 e(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new hg1(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final wk1 f(go1 go1Var, l91 l91Var) {
        du duVarA = go1Var.a();
        ll llVar = (ll) go1Var.d;
        boolean z = duVarA == du.e;
        return new wk1(k(llVar, z, true, l91Var), k(llVar, z, false, l91Var), z);
    }

    public static final Object[] g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        nd.P(objArr, objArr2, 0, i, 6);
        nd.M(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        nd.P(objArr, objArr2, 0, i, 6);
        nd.M(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        nd.P(objArr, objArr2, 0, i, 6);
        nd.M(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final vk1 j(final go1 go1Var, final ll llVar, vk1 vk1Var) {
        int i = llVar.c;
        int i2 = llVar.b;
        boolean z = go1Var.b;
        final int i3 = z ? i2 : i;
        pz1 pz1Var = (pz1) llVar.e;
        int i4 = llVar.d;
        final hm0 hm0VarE = al.E(new jj(i3, 1, llVar));
        final int i5 = z ? i : i2;
        hm0 hm0VarE2 = al.E(new ha0() { // from class: xk1
            @Override // defpackage.ha0
            public final Object a() {
                ll llVar2 = llVar;
                pz1 pz1Var2 = (pz1) llVar2.e;
                int iIntValue = ((Number) hm0VarE.getValue()).intValue();
                go1 go1Var2 = go1Var;
                boolean z2 = go1Var2.b;
                boolean z3 = go1Var2.a() == du.e;
                int i6 = i3;
                long jI = pz1Var2.i(i6);
                vw0 vw0Var = pz1Var2.b;
                int i7 = wz1.c;
                int iF = (int) (jI >> 32);
                int iD = vw0Var.d(iF);
                int i8 = vw0Var.f;
                if (iD != iIntValue) {
                    iF = iIntValue >= i8 ? pz1Var2.f(i8 - 1) : pz1Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (vw0Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? vw0Var.c(i8 - 1, false) : vw0Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iF == i9) {
                    return llVar2.a(iC);
                }
                if (iC == i9) {
                    return llVar2.a(iF);
                }
                if (!(z2 ^ z3) ? i6 >= iF : i6 > iC) {
                    iF = iC;
                }
                return llVar2.a(iF);
            }
        });
        if (1 != vk1Var.c) {
            return (vk1) ((a42) hm0VarE2).getValue();
        }
        if (i3 == i4) {
            return vk1Var;
        }
        if (((Number) ((a42) hm0VarE).getValue()).intValue() != pz1Var.b.d(i4)) {
            return (vk1) ((a42) hm0VarE2).getValue();
        }
        int i6 = vk1Var.b;
        long jI = pz1Var.i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                du duVar = du.e;
                if (((z ? 1 : 0) ^ ((i2 < i ? du.f : i2 > i ? duVar : du.g) != duVar ? 0 : 1)) == 0) {
                }
            }
            return llVar.a(i3);
        }
        int i7 = wz1.c;
        return (i6 == ((int) (jI >> 32)) || i6 == ((int) (jI & 4294967295L))) ? (vk1) ((a42) hm0VarE2).getValue() : llVar.a(i3);
    }

    public static final vk1 k(ll llVar, boolean z, boolean z2, l91 l91Var) {
        long jG;
        long j;
        int i = z2 ? llVar.b : llVar.c;
        switch (l91Var.e) {
            case t91.LONG_FIELD_NUMBER /* 4 */:
                String str = ((pz1) llVar.e).a.a.f;
                jG = af1.g(ef1.g(str, i), ef1.f(str, i));
                break;
            default:
                jG = ((pz1) llVar.e).i(i);
                break;
        }
        if (z ^ z2) {
            int i2 = wz1.c;
            j = jG >> 32;
        } else {
            int i3 = wz1.c;
            j = 4294967295L & jG;
        }
        return llVar.a((int) j);
    }

    public static final vk1 l(vk1 vk1Var, ll llVar, int i) {
        return new vk1(((pz1) llVar.e).a(i), i, vk1Var.c);
    }

    public static pg1 m(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float fCos = 1.0f / ((float) Math.cos(q42.b / f));
        ft ftVar = new ft(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long jN = hk.N(q42.d(fCos, (q42.b / f) * 2.0f * i4), z60.a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = hk.D(jN);
            i3 += 2;
            fArr[i5] = hk.E(jN);
        }
        return af1.a(fArr, ftVar, null, 0.0f, 0.0f);
    }

    public static final fy0 n(os1 os1Var, ob0 ob0Var) {
        Object value = os1Var.getValue();
        Object obj = d40.e;
        boolean zH = ob0Var.h(obj) | ob0Var.h(os1Var);
        Object objK = ob0Var.K();
        ks ksVar = null;
        Object obj2 = kp.a;
        if (zH || objK == obj2) {
            objK = new g(obj, os1Var, ksVar, 17);
            ob0Var.f0(objK);
        }
        wa0 wa0Var = (wa0) objK;
        Object objK2 = ob0Var.K();
        if (objK2 == obj2) {
            objK2 = B(value);
            ob0Var.f0(objK2);
        }
        fy0 fy0Var = (fy0) objK2;
        boolean zH2 = ob0Var.h(wa0Var);
        Object objK3 = ob0Var.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new jq1(wa0Var, fy0Var, ksVar, 1);
            ob0Var.f0(objK3);
        }
        wi0.j(os1Var, obj, (wa0) objK3, ob0Var);
        return fy0Var;
    }

    public static StaticLayout o(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            og0.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            og0.a("invalid end value");
        }
        if (i3 < 0) {
            og0.a("invalid maxLines value");
        }
        if (i < 0) {
            og0.a("invalid width value");
        }
        if (i4 < 0) {
            og0.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(e1.a().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final oe1 p(Throwable th) {
        th.getClass();
        return new oe1(th);
    }

    public static final long q() {
        return Thread.currentThread().getId();
    }

    public static final iy0 r() {
        oc ocVar = iq1.b;
        iy0 iy0Var = (iy0) ocVar.h();
        if (iy0Var != null) {
            return iy0Var;
        }
        iy0 iy0Var2 = new iy0(new nb0[0]);
        ocVar.x(iy0Var2);
        return iy0Var2;
    }

    public static final qx s(ha0 ha0Var) {
        oc ocVar = iq1.a;
        return new qx(ha0Var, null);
    }

    public static final float t(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final Bundle u(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        yc.p(s91.l("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int v(nz1 nz1Var, Layout layout, me meVar, int i, RectF rectF, fk1 fk1Var, ud udVar, boolean z) {
        cl0[] cl0VarArr;
        cl0[] cl0VarArr2;
        int i2;
        int iB;
        int i3;
        int i4;
        int iA;
        Bidi bidiCreateLineBidi;
        boolean z2;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = nz1Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = nz1Var.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            og0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        vd0 vd0Var = new vd0(nz1Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !zIsRtlCharAt) {
                fA = vd0Var.a(lineStart2, z3, z3, true);
                fA3 = vd0Var.a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && zIsRtlCharAt) {
                z2 = z4;
                fA3 = vd0Var.a(lineStart2, false, false, false);
                fA = vd0Var.a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (zIsRtlCharAt) {
                    fA2 = vd0Var.a(lineStart2, false, false, true);
                    fA = vd0Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = vd0Var.a(lineStart2, false, false, false);
                    fA2 = vd0Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) meVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int i7 = meVar.i(lineStart3, false);
        int iJ = meVar.j(i7);
        int i8 = lineStart3 - iJ;
        int i9 = lineEnd2 - iJ;
        Bidi bidiE = meVar.e(i7);
        if (bidiE == null || (bidiCreateLineBidi = bidiE.createLineBidi(i8, i9)) == null) {
            cl0VarArr = new cl0[]{new cl0(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            cl0VarArr = new cl0[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                cl0VarArr[i10] = new cl0(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        ph0 rh0Var = z ? new rh0(0, cl0VarArr.length - 1, 1) : new ph0(cl0VarArr.length - 1, 0, -1);
        int i12 = rh0Var.e;
        int i13 = rh0Var.f;
        int i14 = rh0Var.g;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            cl0 cl0Var = cl0VarArr[i12];
            boolean z5 = cl0Var.c;
            int iD = cl0Var.a;
            int iE = cl0Var.b;
            float f = z5 ? fArr[((iE - 1) - lineStart) * 2] : fArr[(iD - lineStart) * 2];
            float fT = z5 ? t(iD, lineStart, fArr) : t(iE - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i15 = i14;
            if (!z) {
                cl0VarArr2 = cl0VarArr;
                if (fT >= f2) {
                    float f3 = rectF.right;
                    if (f > f3) {
                        iE = -1;
                        iD = iE;
                    } else {
                        if ((z5 || f3 < fT) && (!z5 || f2 > f)) {
                            int i16 = iE;
                            int i17 = iD;
                            while (i16 - i17 > 1) {
                                int i18 = (i16 + i17) / 2;
                                float f4 = fArr[(i18 - lineStart) * 2];
                                int i19 = i16;
                                if ((z5 || f4 <= rectF.right) && (!z5 || f4 >= rectF.left)) {
                                    i16 = i19;
                                    i17 = i18;
                                } else {
                                    i16 = i18;
                                }
                            }
                            i2 = z5 ? i16 : i17;
                        } else {
                            i2 = iE - 1;
                        }
                        int iA2 = fk1Var.a(i2 + 1);
                        if (iA2 != -1 && (iB = fk1Var.b(iA2)) > iD) {
                            if (iA2 < iD) {
                                iA2 = iD;
                            }
                            if (iB <= iE) {
                                iE = iB;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iA3 = iA2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((iE - 1) - lineStart) * 2] : fArr[(iA3 - lineStart) * 2];
                                rectF2.right = z5 ? t(iA3, lineStart, fArr) : t(iE - 1, lineStart, fArr);
                                if (((Boolean) udVar.h(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iE = fk1Var.e(iE);
                                if (iE == -1 || iE <= iD) {
                                    break;
                                }
                                iA3 = fk1Var.a(iE);
                                if (iA3 < iD) {
                                    iA3 = iD;
                                }
                            }
                            iE = -1;
                            iD = iE;
                        }
                    }
                }
            } else if (fT >= f2) {
                float f5 = rectF.right;
                if (f > f5) {
                    cl0VarArr2 = cl0VarArr;
                    iD = -1;
                } else {
                    if ((z5 || f2 > f) && (!z5 || f5 < fT)) {
                        int i20 = iE;
                        int i21 = iD;
                        while (true) {
                            i3 = i20;
                            if (i20 - i21 <= 1) {
                                break;
                            }
                            int i22 = (i3 + i21) / 2;
                            float f6 = fArr[(i22 - lineStart) * 2];
                            if ((z5 || f6 <= rectF.left) && (!z5 || f6 >= rectF.right)) {
                                i20 = i3;
                                i21 = i22;
                            } else {
                                i20 = i22;
                            }
                        }
                        i4 = z5 ? i3 : i21;
                    } else {
                        i4 = iD;
                    }
                    int iB2 = fk1Var.b(i4);
                    if (iB2 != -1 && (iA = fk1Var.a(iB2)) < iE) {
                        if (iA >= iD) {
                            iD = iA;
                        }
                        if (iB2 > iE) {
                            iB2 = iE;
                        }
                        cl0VarArr2 = cl0VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iB3 = iB2;
                        while (true) {
                            rectF3.left = z5 ? fArr[((iB3 - 1) - lineStart) * 2] : fArr[(iD - lineStart) * 2];
                            rectF3.right = z5 ? t(iD, lineStart, fArr) : t(iB3 - 1, lineStart, fArr);
                            if (((Boolean) udVar.h(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iD = fk1Var.d(iD);
                            if (iD == -1 || iD >= iE) {
                                break;
                            }
                            iB3 = fk1Var.b(iD);
                            if (iB3 > iE) {
                                iB3 = iE;
                            }
                        }
                    }
                    iD = -1;
                }
            }
            if (iD >= 0) {
                return iD;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i15;
            i14 = i15;
            cl0VarArr = cl0VarArr2;
        }
    }

    public static final pz1 w(nl1 nl1Var) {
        sa0 sa0Var;
        ArrayList arrayList = new ArrayList();
        Object objG = nl1Var.e.g(ml1.a);
        if (objG == null) {
            objG = null;
        }
        r0 r0Var = (r0) objG;
        if (r0Var == null || (sa0Var = (sa0) r0Var.b) == null || !((Boolean) sa0Var.i(arrayList)).booleanValue()) {
            return null;
        }
        return (pz1) arrayList.get(0);
    }

    public static int x(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        yc.p(s91.i("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final int y(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void z(ob0 ob0Var, Integer num, wa0 wa0Var) {
        if (ob0Var.S) {
            ob0Var.b(wa0Var, num);
        }
    }
}
