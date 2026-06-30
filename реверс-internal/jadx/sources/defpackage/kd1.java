package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class kd1 {
    public static ye0 a;
    public static ye0 b;

    public static void A(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ry.j(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void C(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final Object D(ui1 ui1Var, boolean z, ui1 ui1Var2, wa0 wa0Var) {
        Object onVar;
        Object objW;
        try {
            if (wa0Var instanceof ye) {
                s22.i(2, wa0Var);
                onVar = wa0Var.h(ui1Var2, ui1Var);
            } else {
                onVar = bl.X(wa0Var, ui1Var2, ui1Var);
            }
        } catch (ly e) {
            Throwable th = e.e;
            ui1Var.V(new on(th, false));
            throw th;
        } catch (Throwable th2) {
            onVar = new on(th2, false);
        }
        wt wtVar = wt.e;
        if (onVar == wtVar || (objW = ui1Var.W(onVar)) == s22.j) {
            return wtVar;
        }
        ui1Var.p0();
        if (!(objW instanceof on)) {
            return s22.S(objW);
        }
        if (!z) {
            Throwable th3 = ((on) objW).a;
            if ((th3 instanceof w02) && ((w02) th3).e == ui1Var) {
                if (onVar instanceof on) {
                    throw ((on) onVar).a;
                }
                return onVar;
            }
        }
        throw ((on) objW).a;
    }

    public static final void E(va vaVar, xa xaVar) {
        xaVar.f.setValue(vaVar.e.getValue());
        cb cbVar = xaVar.g;
        cb cbVar2 = vaVar.f;
        int iB = cbVar.b();
        for (int i = 0; i < iB; i++) {
            cbVar.e(i, cbVar2.a(i));
        }
        xaVar.i = vaVar.h;
        xaVar.h = vaVar.g;
        xaVar.j = ((Boolean) vaVar.i.getValue()).booleanValue();
    }

    public static final d22 F(Object obj, String str, ob0 ob0Var, int i) {
        Object objK = ob0Var.K();
        l91 l91Var = kp.a;
        if (objK == l91Var) {
            objK = new d22(new xg0(obj), null, str);
            ob0Var.f0(objK);
        }
        d22 d22Var = (d22) objK;
        d22Var.a(obj, ob0Var, (i & 8) | 48 | (i & 14));
        Object objK2 = ob0Var.K();
        if (objK2 == l91Var) {
            objK2 = new wt1(7, d22Var);
            ob0Var.f0(objK2);
        }
        wi0.c(d22Var, (sa0) objK2, ob0Var);
        return d22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ye0 ye0Var, tv0 tv0Var, long j, long j2, float f, float f2, ob0 ob0Var, int i, int i2) {
        float f3;
        int i3;
        float f4;
        tv0 tv0Var2;
        float f5;
        float f6;
        dc1 dc1VarR;
        float f7;
        tv0 tv0Var3;
        ob0Var.X(549790214);
        int i4 = (ob0Var.f(ye0Var) ? 4 : 2) | i | 48 | (ob0Var.e(j) ? 256 : 128) | (ob0Var.e(j2) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                f3 = f;
                i4 |= ob0Var.c(f3) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    f4 = f2;
                    i4 |= ob0Var.c(f4) ? 131072 : 65536;
                }
                if (ob0Var.N(i4 & 1, (74899 & i4) != 74898)) {
                    ob0Var.S();
                    int i6 = i & 1;
                    qv0 qv0Var = qv0.a;
                    if (i6 == 0 || ob0Var.x()) {
                        if (i5 != 0) {
                            f3 = 96.0f;
                        }
                        f7 = i3 != 0 ? 44.0f : f4;
                        tv0Var3 = qv0Var;
                    } else {
                        ob0Var.Q();
                        tv0Var3 = tv0Var;
                        f7 = f4;
                    }
                    ob0Var.q();
                    uu0 uu0VarD = sg.d(v20.j, false);
                    int iHashCode = Long.hashCode(ob0Var.T);
                    b61 b61VarL = ob0Var.l();
                    tv0 tv0VarP = bk.P(ob0Var, tv0Var3);
                    ep.c.getClass();
                    zp zpVar = dp.b;
                    ob0Var.Z();
                    tv0 tv0Var4 = tv0Var3;
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
                    tv0 tv0VarE = ko1.e(qv0Var, f3);
                    wr wrVar = hu0.a;
                    qc1.b(ob0Var, xi0.p(tv0VarE, j, lk.m0(wr.m(), ob0Var)));
                    float f8 = f7;
                    ue0.a(ye0Var, null, ko1.e(qv0Var, f7), j2, ob0Var, (i4 & 14) | 48 | (i4 & 7168), 0);
                    ob0Var.p(true);
                    f5 = f3;
                    f6 = f8;
                    tv0Var2 = tv0Var4;
                } else {
                    ob0Var.Q();
                    tv0Var2 = tv0Var;
                    f5 = f3;
                    f6 = f4;
                }
                dc1VarR = ob0Var.r();
                if (dc1VarR != null) {
                    dc1VarR.d = new dn1(ye0Var, tv0Var2, j, j2, f5, f6, i, i2);
                    return;
                }
                return;
            }
            i4 |= 196608;
            f4 = f2;
            if (ob0Var.N(i4 & 1, (74899 & i4) != 74898)) {
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR != null) {
            }
        }
        f3 = f;
        i3 = i2 & 32;
        if (i3 != 0) {
        }
        f4 = f2;
        if (ob0Var.N(i4 & 1, (74899 & i4) != 74898)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
        }
    }

    public static final void b(d22 d22Var, c22 c22Var, Object obj, Object obj2, p60 p60Var, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(867041821);
        if ((i & 6) == 0) {
            i2 = (ob0Var.f(d22Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(c22Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ob0Var.f(obj) : ob0Var.h(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? ob0Var.f(obj2) : ob0Var.h(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? ob0Var.f(p60Var) : ob0Var.h(p60Var) ? 16384 : 8192;
        }
        if (!ob0Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ob0Var.Q();
        } else if (d22Var.g()) {
            c22Var.g(obj, obj2, p60Var);
        } else {
            c22Var.h(obj2, p60Var, null, null);
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new lu0(d22Var, c22Var, obj, obj2, p60Var, i, 1);
        }
    }

    public static final long c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(xa xaVar, sa saVar, long j, final sa0 sa0Var, ks ksVar) {
        yu1 yu1Var;
        final zc1 zc1Var;
        final xa xaVar2;
        xa xaVar3;
        zc1 zc1Var2;
        Object objC;
        sa0 sa0Var2;
        va vaVar;
        va vaVar2;
        Object objC2;
        final sa saVar2 = saVar;
        v20 v20Var = v20.N;
        if (ksVar instanceof yu1) {
            yu1Var = (yu1) ksVar;
            int i = yu1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                yu1Var.m = i - Integer.MIN_VALUE;
            } else {
                yu1Var = new yu1(ksVar);
            }
        }
        yu1 yu1Var2 = yu1Var;
        lt ltVar = yu1Var2.f;
        Object obj = yu1Var2.l;
        int i2 = yu1Var2.m;
        int i3 = 4;
        int i4 = 1;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(obj);
            final Object objB = saVar2.b(0L);
            final cb cbVarF = saVar2.f(0L);
            zc1Var = new zc1();
            if (j == Long.MIN_VALUE) {
                try {
                    ltVar.getClass();
                    final float fL = l(ltVar);
                    xaVar2 = xaVar;
                    try {
                        sa0 sa0Var3 = new sa0() { // from class: xu1
                            @Override // defpackage.sa0
                            public final Object i(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                sa saVar3 = saVar2;
                                r22 r22VarD = saVar3.d();
                                Object objE = saVar3.e();
                                xa xaVar4 = xaVar2;
                                va vaVar3 = new va(objB, r22VarD, cbVarF, jLongValue, objE, jLongValue, new wu1(xaVar4, 0));
                                kd1.i(vaVar3, jLongValue, fL, saVar3, xaVar4, sa0Var);
                                zc1Var.e = vaVar3;
                                return t32.a;
                            }
                        };
                        zc1Var2 = zc1Var;
                        try {
                            yu1Var2.h = xaVar2;
                            yu1Var2.i = saVar2;
                            yu1Var2.j = sa0Var;
                            yu1Var2.k = zc1Var2;
                            yu1Var2.m = 1;
                            if (!saVar2.a()) {
                                tq tqVar = new tq(sa0Var3, i3);
                                ltVar.getClass();
                                objC = al.z(ltVar).c(tqVar, yu1Var2);
                            } else {
                                if (yu1Var2.e().l(v20Var) != null) {
                                    throw new ClassCastException();
                                }
                                objC = al.z(yu1Var2.e()).c(sa0Var3, yu1Var2);
                            }
                            if (objC != wtVar) {
                                xaVar3 = xaVar2;
                                sa0Var2 = sa0Var;
                                zc1Var = zc1Var2;
                            }
                            return wtVar;
                        } catch (CancellationException e) {
                            e = e;
                            xaVar3 = xaVar2;
                            zc1Var = zc1Var2;
                            vaVar = (va) zc1Var.e;
                            if (vaVar != null) {
                                vaVar.i.setValue(Boolean.FALSE);
                            }
                            vaVar2 = (va) zc1Var.e;
                            if (vaVar2 != null && vaVar2.g == xaVar3.h) {
                                xaVar3.j = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        xaVar3 = xaVar2;
                        vaVar = (va) zc1Var.e;
                        if (vaVar != null) {
                        }
                        vaVar2 = (va) zc1Var.e;
                        if (vaVar2 != null) {
                            xaVar3.j = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    xaVar2 = xaVar;
                }
            } else {
                zc1Var2 = zc1Var;
                try {
                    va vaVar3 = new va(objB, saVar2.d(), cbVarF, j, saVar2.e(), j, new wu1(xaVar, i4));
                    ltVar.getClass();
                    i(vaVar3, j, l(ltVar), saVar2, xaVar, sa0Var);
                    zc1Var2.e = vaVar3;
                    xaVar3 = xaVar;
                    saVar2 = saVar;
                    sa0Var2 = sa0Var;
                    zc1Var = zc1Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    xaVar3 = xaVar;
                    zc1Var = zc1Var2;
                    vaVar = (va) zc1Var.e;
                    if (vaVar != null) {
                    }
                    vaVar2 = (va) zc1Var.e;
                    if (vaVar2 != null) {
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zc1Var = yu1Var2.k;
            sa0Var2 = yu1Var2.j;
            saVar2 = yu1Var2.i;
            xaVar3 = yu1Var2.h;
            try {
                xc.G(obj);
            } catch (CancellationException e5) {
                e = e5;
                vaVar = (va) zc1Var.e;
                if (vaVar != null) {
                }
                vaVar2 = (va) zc1Var.e;
                if (vaVar2 != null) {
                }
                throw e;
            }
        }
        do {
            lt ltVar2 = yu1Var2.f;
            Object obj2 = zc1Var.e;
            obj2.getClass();
            if (!((Boolean) ((va) obj2).i.getValue()).booleanValue()) {
                return t32.a;
            }
            ltVar2.getClass();
            zc1 zc1Var3 = zc1Var;
            sa0 sa0Var4 = sa0Var2;
            sa saVar3 = saVar2;
            xa xaVar4 = xaVar3;
            try {
                fg fgVar = new fg(zc1Var3, l(ltVar2), saVar3, xaVar4, sa0Var4);
                zc1Var = zc1Var3;
                saVar2 = saVar3;
                xaVar3 = xaVar4;
                sa0Var2 = sa0Var4;
                yu1Var2.h = xaVar3;
                yu1Var2.i = saVar2;
                yu1Var2.j = sa0Var2;
                yu1Var2.k = zc1Var;
                yu1Var2.m = 2;
                if (!saVar2.a()) {
                    tq tqVar2 = new tq(fgVar, i3);
                    ltVar2.getClass();
                    objC2 = al.z(ltVar2).c(tqVar2, yu1Var2);
                } else {
                    if (yu1Var2.e().l(v20Var) != null) {
                        throw new ClassCastException();
                    }
                    objC2 = al.z(yu1Var2.e()).c(fgVar, yu1Var2);
                }
            } catch (CancellationException e6) {
                e = e6;
                zc1Var = zc1Var3;
                xaVar3 = xaVar4;
                vaVar = (va) zc1Var.e;
                if (vaVar != null) {
                }
                vaVar2 = (va) zc1Var.e;
                if (vaVar2 != null) {
                }
                throw e;
            }
        } while (objC2 != wtVar);
        return wtVar;
    }

    public static final Object e(xa xaVar, Float f, p60 p60Var, sa0 sa0Var, zu1 zu1Var) {
        Object objD = d(xaVar, new yv1(p60Var, xaVar.e, xaVar.f.getValue(), f, xaVar.g), xaVar.h, sa0Var, zu1Var);
        return objD == wt.e ? objD : t32.a;
    }

    public static final z12 g(d22 d22Var, r22 r22Var, String str, ob0 ob0Var, int i, int i2) {
        y12 y12Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ob0Var.f(d22Var);
        Object objK = ob0Var.K();
        Object obj = kp.a;
        if (zF || objK == obj) {
            objK = new z12(d22Var, r22Var, str);
            ob0Var.f0(objK);
        }
        z12 z12Var = (z12) objK;
        boolean zF2 = ob0Var.f(d22Var) | ob0Var.h(z12Var);
        Object objK2 = ob0Var.K();
        if (zF2 || objK2 == obj) {
            objK2 = new d(26, d22Var, z12Var);
            ob0Var.f0(objK2);
        }
        wi0.c(z12Var, (sa0) objK2, ob0Var);
        if (d22Var.g() && (y12Var = (y12) z12Var.b.getValue()) != null) {
            d22 d22Var2 = z12Var.c;
            y12Var.e.g(y12Var.g.i(d22Var2.f().b()), y12Var.g.i(d22Var2.f().c()), (p60) y12Var.f.i(d22Var2.f()));
        }
        return z12Var;
    }

    public static final c22 h(d22 d22Var, Object obj, Object obj2, p60 p60Var, r22 r22Var, ob0 ob0Var, int i) {
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ob0Var.f(d22Var)) || (i & 6) == 4;
        Object objK = ob0Var.K();
        Object obj5 = kp.a;
        if (z2 || objK == obj5) {
            sp1 sp1VarL = uc1.l();
            sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
            sp1 sp1VarU = uc1.u(sp1VarL);
            try {
                obj3 = obj2;
                cb cbVar = (cb) r22Var.a.i(obj3);
                cbVar.d();
                obj4 = obj;
                Object c22Var = new c22(d22Var, obj4, cbVar, r22Var);
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                ob0Var.f0(c22Var);
                objK = c22Var;
            } catch (Throwable th) {
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        c22 c22Var2 = (c22) objK;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        b(d22Var, c22Var2, obj4, obj3, p60Var, ob0Var, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !ob0Var.f(d22Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zF = ob0Var.f(c22Var2) | z;
        Object objK2 = ob0Var.K();
        if (zF || objK2 == obj5) {
            objK2 = new d(24, d22Var, c22Var2);
            ob0Var.f0(objK2);
        }
        wi0.c(c22Var2, (sa0) objK2, ob0Var);
        return c22Var2;
    }

    public static final void i(va vaVar, long j, float f, sa saVar, xa xaVar, sa0 sa0Var) {
        long jC = f == 0.0f ? saVar.c() : (long) ((j - vaVar.c) / f);
        vaVar.g = j;
        vaVar.e.setValue(saVar.b(jC));
        vaVar.f = saVar.f(jC);
        if (saVar.g(jC)) {
            vaVar.h = vaVar.g;
            vaVar.i.setValue(Boolean.FALSE);
        }
        E(vaVar, xaVar);
        sa0Var.i(vaVar);
    }

    public static final pc1 j(sv0 sv0Var, boolean z, boolean z2) {
        if (!sv0Var.e.r) {
            return pc1.e;
        }
        if (z) {
            return bl.N(sv0Var, 8).s1();
        }
        c01 c01VarN = bl.N(sv0Var, 8);
        return al.w(c01VarN).I(c01VarN, z2);
    }

    public static final String k(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final float l(lt ltVar) {
        aw0 aw0Var = (aw0) ltVar.l(v20.Q);
        float fV = aw0Var != null ? aw0Var.v() : 1.0f;
        if (fV >= 0.0f) {
            return fV;
        }
        g91.b("negative scale factor");
        return fV;
    }

    public static eq0 m(ob0 ob0Var) {
        long j;
        e41 e41Var = gq0.a;
        ys1 ys1Var = mu0.b;
        long j2 = ((ju0) ob0Var.j(ys1Var)).a.G;
        long j3 = ((ju0) ob0Var.j(ys1Var)).a.G;
        long j4 = vl.g;
        bm bmVar = ((ju0) ob0Var.j(ys1Var)).a;
        eq0 eq0Var = bmVar.a0;
        if (eq0Var == null) {
            cm cmVar = s22.P;
            j = j2;
            eq0 eq0Var2 = new eq0(dm.b(bmVar, cmVar), dm.b(bmVar, s22.G), dm.b(bmVar, s22.J), dm.b(bmVar, s22.b0), dm.b(bmVar, s22.M), dm.b(bmVar, s22.X), dm.b(bmVar, cmVar), vl.b(s22.u, dm.b(bmVar, s22.t)), vl.b(s22.w, dm.b(bmVar, s22.v)), vl.b(s22.C, dm.b(bmVar, s22.B)), vl.b(s22.y, dm.b(bmVar, s22.x)), vl.b(s22.A, dm.b(bmVar, s22.z)), dm.b(bmVar, s22.Q), dm.b(bmVar, s22.S), dm.b(bmVar, s22.T), dm.b(bmVar, s22.W), dm.b(bmVar, s22.U), dm.b(bmVar, s22.V), dm.b(bmVar, wi0.z), dm.b(bmVar, wi0.A), dm.b(bmVar, wi0.B), dm.b(bmVar, wi0.F), dm.b(bmVar, wi0.C), dm.b(bmVar, wi0.E));
            bmVar.a0 = eq0Var2;
            eq0Var = eq0Var2;
        } else {
            j = j2;
        }
        long j5 = j != 16 ? j : eq0Var.a;
        long j6 = j4 != 16 ? j4 : eq0Var.b;
        long j7 = j4 != 16 ? j4 : eq0Var.c;
        long j8 = j4 != 16 ? j4 : eq0Var.d;
        long j9 = j4 != 16 ? j4 : eq0Var.e;
        long j10 = j4 != 16 ? j4 : eq0Var.f;
        if (j3 == 16) {
            j3 = eq0Var.g;
        }
        long j11 = j3;
        long j12 = j4 != 16 ? j4 : eq0Var.h;
        long j13 = j4 != 16 ? j4 : eq0Var.i;
        long j14 = j4 != 16 ? j4 : eq0Var.j;
        long j15 = j4 != 16 ? j4 : eq0Var.k;
        long j16 = j4 != 16 ? j4 : eq0Var.l;
        long j17 = j4 != 16 ? j4 : eq0Var.m;
        long j18 = j4 != 16 ? j4 : eq0Var.n;
        long j19 = j4 != 16 ? j4 : eq0Var.o;
        long j20 = j4 != 16 ? j4 : eq0Var.p;
        long j21 = j4 != 16 ? j4 : eq0Var.q;
        long j22 = j4 != 16 ? j4 : eq0Var.r;
        long j23 = j4 != 16 ? j4 : eq0Var.s;
        long j24 = j4 != 16 ? j4 : eq0Var.t;
        long j25 = j4 != 16 ? j4 : eq0Var.u;
        long j26 = j4 != 16 ? j4 : eq0Var.v;
        long j27 = j4 != 16 ? j4 : eq0Var.w;
        if (j4 == 16) {
            j4 = eq0Var.x;
        }
        return new eq0(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j4);
    }

    public static final ek1 n(Object obj) {
        if (obj != u4.i) {
            return (ek1) obj;
        }
        yc.l("Does not contain segment");
        return null;
    }

    public static final hb o(az1 az1Var) {
        hb hbVar = az1Var.a;
        long j = az1Var.b;
        hbVar.getClass();
        return hbVar.subSequence(wz1.f(j), wz1.e(j));
    }

    public static final hb p(az1 az1Var, int i) {
        hb hbVar = az1Var.a;
        hb hbVar2 = az1Var.a;
        long j = az1Var.b;
        int iE = wz1.e(j);
        int iE2 = wz1.e(j);
        int length = iE2 + i;
        if (((i ^ length) & (iE2 ^ length)) < 0) {
            length = hbVar2.f.length();
        }
        return hbVar.subSequence(iE, Math.min(length, hbVar2.f.length()));
    }

    public static final hb q(az1 az1Var, int i) {
        hb hbVar = az1Var.a;
        long j = az1Var.b;
        int iF = wz1.f(j);
        int i2 = iF - i;
        if (((iF ^ i2) & (i ^ iF)) < 0) {
            i2 = 0;
        }
        return hbVar.subSequence(Math.max(0, i2), wz1.f(j));
    }

    public static c91 r(ic icVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new c91(ry.i(icVar));
        }
        TextPaint textPaint = new TextPaint(icVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = icVar.getBreakStrategy();
        int hyphenationFrequency = icVar.getHyphenationFrequency();
        if (icVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (icVar.getInputType() & 15) != 3) {
            boolean z = icVar.getLayoutDirection() == 1;
            switch (icVar.getTextDirection()) {
                case t91.FLOAT_FIELD_NUMBER /* 2 */:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case t91.INTEGER_FIELD_NUMBER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case t91.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case t91.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ry.c(DecimalFormatSymbols.getInstance(icVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new c91(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final boolean s(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final void t(pl1 pl1Var) {
        bl.P(pl1Var).H();
    }

    public static final boolean u(Object obj) {
        return obj == u4.i;
    }

    public static void v(az1 az1Var, cx1 cx1Var, pz1 pz1Var, zk0 zk0Var, kz1 kz1Var, boolean z, z01 z01Var) {
        if (z) {
            int iG = z01Var.g(wz1.e(az1Var.b));
            String str = jx1.a;
            pc1 pc1VarB = iG < pz1Var.a.a.f.length() ? pz1Var.b(iG) : iG != 0 ? pz1Var.b(iG - 1) : new pc1(0.0f, 0.0f, 1.0f, (int) (jx1.a(cx1Var.b, cx1Var.g, cx1Var.h) & 4294967295L));
            float f = pc1VarB.b;
            float f2 = pc1VarB.a;
            long jM = zk0Var.M((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            pc1 pc1VarA = qc1.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM >> 32)))) << 32), (((long) Float.floatToRawIntBits(pc1VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(pc1VarB.d - f)) & 4294967295L));
            if (xi0.o((kz1) kz1Var.a.b.get(), kz1Var)) {
                kz1Var.b.h(pc1VarA);
            }
        }
    }

    public static final Object w(Object[] objArr, ha0 ha0Var, ob0 ob0Var) {
        return x(Arrays.copyOf(objArr, objArr.length), s22.j0, ha0Var, ob0Var, 3456);
    }

    public static final Object x(Object[] objArr, yh1 yh1Var, ha0 ha0Var, ob0 ob0Var, int i) {
        Object[] objArr2;
        yh1 yh1Var2;
        final Object obj;
        Object objF;
        long j = ob0Var.T;
        s22.k(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        yh1Var.getClass();
        final jh1 jh1Var = (jh1) ob0Var.j(mh1.a);
        Object objK = ob0Var.K();
        Object obj2 = kp.a;
        if (objK == obj2) {
            Object objC = (jh1Var == null || (objF = jh1Var.f(string)) == null) ? null : yh1Var.c(objF);
            if (objC == null) {
                objC = ha0Var.a();
            }
            objArr2 = objArr;
            yh1Var2 = yh1Var;
            Object gh1Var = new gh1(yh1Var2, jh1Var, string, objC, objArr2);
            ob0Var.f0(gh1Var);
            objK = gh1Var;
        } else {
            objArr2 = objArr;
            yh1Var2 = yh1Var;
        }
        final gh1 gh1Var2 = (gh1) objK;
        Object objA = Arrays.equals(objArr2, gh1Var2.i) ? gh1Var2.h : null;
        if (objA == null) {
            objA = ha0Var.a();
        }
        boolean zH = ob0Var.h(gh1Var2) | ((((i & 112) ^ 48) > 32 && ob0Var.h(yh1Var2)) || (i & 48) == 32) | ob0Var.h(jh1Var) | ob0Var.f(string) | ob0Var.h(objA) | ob0Var.h(objArr2);
        Object objK2 = ob0Var.K();
        if (zH || objK2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objA;
            final yh1 yh1Var3 = yh1Var2;
            Object obj3 = new ha0() { // from class: jd1
                @Override // defpackage.ha0
                public final Object a() throws Throwable {
                    boolean z;
                    gh1 gh1Var3 = gh1Var2;
                    jh1 jh1Var2 = gh1Var3.f;
                    jh1 jh1Var3 = jh1Var;
                    boolean z2 = true;
                    if (jh1Var2 != jh1Var3) {
                        gh1Var3.f = jh1Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = gh1Var3.g;
                    String str2 = string;
                    if (xi0.o(str, str2)) {
                        z2 = z;
                    } else {
                        gh1Var3.g = str2;
                    }
                    gh1Var3.e = yh1Var3;
                    gh1Var3.h = obj;
                    gh1Var3.i = objArr3;
                    oc ocVar = gh1Var3.j;
                    if (ocVar != null && z2) {
                        ocVar.C();
                        gh1Var3.j = null;
                        gh1Var3.a();
                    }
                    return t32.a;
                }
            };
            ob0Var.f0(obj3);
            objK2 = obj3;
        } else {
            obj = objA;
        }
        wi0.m((ha0) objK2, ob0Var);
        return obj;
    }

    public static final Object y(Object[] objArr, yh1 yh1Var, ha0 ha0Var, ob0 ob0Var, int i) {
        return x(Arrays.copyOf(objArr, objArr.length), yh1Var, ha0Var, ob0Var, ((i << 3) & 7168) | 384);
    }

    public static tq0 z(int i, int i2, ob0 ob0Var, int i3) {
        tq0 tq0Var;
        nb1 nb1Var = mu0.b;
        pn1 pn1Var = ((ju0) ob0Var.j(nb1Var)).c;
        boolean z = i2 == 1;
        e41 e41Var = gq0.a;
        kg1 kg1Var = z ? pn1Var.d : pn1Var.a;
        kg1 kg1Var2 = pn1Var.g;
        kg1 kg1Var3 = pn1Var.d;
        kg1 kg1Var4 = pn1Var.e;
        pn1 pn1Var2 = ((ju0) ob0Var.j(nb1Var)).c;
        tq0 tq0Var2 = pn1Var2.k;
        if (tq0Var2 == null) {
            tq0 tq0Var3 = new tq0(qn1.a(pn1Var2, s22.s), qn1.a(pn1Var2, s22.R), qn1.a(pn1Var2, s22.O), qn1.a(pn1Var2, s22.E), qn1.a(pn1Var2, s22.F), qn1.a(pn1Var2, wi0.D));
            pn1Var2.k = tq0Var3;
            tq0Var = tq0Var3;
        } else {
            tq0Var = tq0Var2;
        }
        tq0 tq0VarA = tq0Var.a(kg1Var, kg1Var2, kg1Var2, kg1Var3, kg1Var4, kg1Var2);
        ym1 ym1Var = tq0VarA.a;
        Object objB = qn1.b(s22.p, ob0Var);
        boolean zF = ((((i3 & 112) ^ 48) > 32 && ob0Var.d(i2)) || (i3 & 48) == 32) | ((((i3 & 14) ^ 6) > 4 && ob0Var.d(i)) || (i3 & 6) == 4) | ob0Var.f(tq0VarA) | ob0Var.f(objB);
        Object objK = ob0Var.K();
        if (zF || objK == kp.a) {
            if (i2 != 1) {
                if (i == 0) {
                    if ((ym1Var instanceof kg1) && (objB instanceof kg1)) {
                        kg1 kg1Var5 = (kg1) objB;
                        tq0VarA = tq0VarA.a(kg1.c((kg1) ym1Var, kg1Var5.a, kg1Var5.b, null, null, 12), tq0VarA.b, tq0VarA.c, tq0VarA.d, tq0VarA.e, tq0VarA.f);
                    }
                } else if (i == i2 - 1 && (ym1Var instanceof kg1) && (objB instanceof kg1)) {
                    kg1 kg1Var6 = (kg1) objB;
                    tq0VarA = tq0VarA.a(kg1.c((kg1) ym1Var, null, null, kg1Var6.c, kg1Var6.d, 3), tq0VarA.b, tq0VarA.c, tq0VarA.d, tq0VarA.e, tq0VarA.f);
                }
            }
            ob0Var.f0(tq0VarA);
            objK = tq0VarA;
        }
        return (tq0) objK;
    }

    public abstract void f();
}
