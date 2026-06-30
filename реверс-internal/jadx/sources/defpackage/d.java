package defpackage;

import android.net.Uri;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(fy0 fy0Var, jx0 jx0Var) {
        this.e = 21;
        this.g = fy0Var;
        this.f = jx0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i = 2;
        int i2 = 0;
        char c = 1;
        switch (this.e) {
            case 0:
                ((jx0) this.f).b((na1) this.g);
                return t32.a;
            case 1:
                ie ieVar = (ie) this.f;
                je jeVar = (je) this.g;
                t32 t32Var = t32.a;
                q02 q02Var = ieVar.s;
                if (q02Var != null) {
                    q02Var.b();
                }
                ieVar.s = null;
                ln lnVar = jeVar.b;
                if (lnVar != null) {
                    lnVar.V(t32Var);
                }
                jeVar.b = null;
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                qe qeVar = (qe) this.f;
                ro roVar = (ro) this.g;
                wy0 wy0Var = qeVar.a;
                if (wy0Var != null) {
                    wy0.a(wy0Var, roVar.b);
                } else {
                    n11 n11Var = qeVar.b;
                    if (n11Var == null) {
                        yc.l("Unreachable");
                        return null;
                    }
                    pe peVar = roVar.a;
                    peVar.getClass();
                    i11 i11Var = new i11(peVar, new j11(peVar, null));
                    peVar.a.add(i11Var);
                    wy0.a(n11Var.a(), i11Var);
                }
                return new ue(i2, qeVar, roVar);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                w6 w6Var = (w6) this.f;
                lh lhVar = (lh) this.g;
                sl0 sl0Var = (sl0) obj;
                sl0Var.a();
                p10.y0(sl0Var, w6Var, lhVar, 0.0f, null, null, 60);
                return t32.a;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                n31 n31Var = (n31) this.f;
                lh lhVar2 = (lh) this.g;
                sl0 sl0Var2 = (sl0) obj;
                sl0Var2.a();
                p10.y0(sl0Var2, n31Var.b, lhVar2, 0.0f, null, null, 60);
                return t32.a;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((wg) this.f).a.j((sr) this.g);
                return t32.a;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                wa0 wa0Var = (wa0) this.f;
                fy0 fy0Var = (fy0) this.g;
                Uri uri = (Uri) obj;
                iq iqVar = (iq) fy0Var.getValue();
                fy0Var.setValue(null);
                if (uri != null && iqVar != null) {
                    wa0Var.h(iqVar, uri);
                }
                return t32.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                jo0 jo0Var = (jo0) this.f;
                lh lhVar3 = (lh) this.g;
                sl0 sl0Var3 = (sl0) obj;
                sl0Var3.a();
                if (((Boolean) jo0Var.s.getValue()).booleanValue() || ((Boolean) jo0Var.t.getValue()).booleanValue()) {
                    p10.x(sl0Var3, lhVar3, 0L, 0L, 0.0f, null, null, 126);
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((jx0) this.f).b((yh0) this.g);
                return t32.a;
            case el.a /* 9 */:
                ((ed0) this.f).g.removeCallbacks((y4) this.g);
                return t32.a;
            case el.b /* 10 */:
                w6 w6Var2 = (w6) this.f;
                sf0 sf0Var = (sf0) this.g;
                sl0 sl0Var4 = (sl0) obj;
                sl0Var4.a();
                h9 h9Var = sf0Var.B;
                h9Var.getClass();
                p10.y0(sl0Var4, w6Var2, new uq1(((vl) h9Var.d()).a), 0.0f, null, null, 60);
                return t32.a;
            case 11:
                ig0 ig0Var = (ig0) this.f;
                gg0 gg0Var = (gg0) this.g;
                ig0Var.a.b(gg0Var);
                ig0Var.b.setValue(Boolean.TRUE);
                return new ue(c == true ? 1 : 0, ig0Var, gg0Var);
            case el.c /* 12 */:
                xn0 xn0Var = (xn0) this.f;
                Object obj2 = this.g;
                xn0Var.g.i(obj2);
                return new ue(i, xn0Var, obj2);
            case 13:
                return new xn0((jh1) this.f, (Map) obj, (ih1) this.g);
            case 14:
                ((y61) obj).g((z61) this.f, 0, 0, ((a70) this.g).a());
                return t32.a;
            case 15:
                ((ax0) this.f).c.add(new xw0(obj, (im1) this.g));
                return t32.a;
            case 16:
                b41 b41Var = (b41) this.f;
                z61 z61Var = (z61) this.g;
                y61 y61Var = (y61) obj;
                boolean z = b41Var.w;
                float f = b41Var.s;
                if (z) {
                    y61.j(y61Var, z61Var, y61Var.N(f), y61Var.N(b41Var.t));
                } else {
                    y61Var.g(z61Var, y61Var.N(f), y61Var.N(b41Var.t), 0.0f);
                }
                return t32.a;
            case 17:
                tp tpVar = (tp) this.f;
                ay0 ay0Var = (ay0) this.g;
                tpVar.A(obj);
                if (ay0Var != null) {
                    ay0Var.a(obj);
                }
                return t32.a;
            case 18:
                jc1 jc1Var = (jc1) this.f;
                Throwable th = (Throwable) this.g;
                Throwable th2 = (Throwable) obj;
                synchronized (jc1Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                al.h(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    jc1Var.e = th;
                    qs1 qs1Var = jc1Var.u;
                    gc1 gc1Var = gc1.e;
                    qs1Var.getClass();
                    qs1Var.k(null, gc1Var);
                }
                return t32.a;
            case 19:
                ((ky0) this.f).a.setValue(new h50((k72) this.g, (k72) obj));
                return t32.a;
            case 20:
                zj1 zj1Var = (zj1) this.f;
                bk1 bk1Var = (bk1) this.g;
                h00 h00Var = (h00) obj;
                float f2 = h00Var.b ? -1.0f : 1.0f;
                long j = h00Var.a;
                zj1Var.a(1, w01.f(f2, bk1Var.d == k31.f ? w01.a(j, 0.0f, 1) : w01.a(j, 0.0f, 2)));
                return t32.a;
            case 21:
                return new ue(3, (fy0) this.g, (jx0) this.f);
            case 22:
                ha0 ha0Var = (ha0) this.f;
                ha0 ha0Var2 = (ha0) this.g;
                ww1 ww1Var = (ww1) obj;
                ha0Var.a();
                if (ha0Var2 != null ? ((Boolean) ha0Var2.a()).booleanValue() : true) {
                    ww1Var.close();
                }
                return t32.a;
            case 23:
                nu0.A((vt) this.f, null, yt.h, new lf1((d22) this.g, null), 1);
                return new g7(2);
            case 24:
                d22 d22Var = (d22) this.f;
                c22 c22Var = (c22) this.g;
                d22Var.j.add(c22Var);
                return new ue(6, d22Var, c22Var);
            case 25:
                d22 d22Var2 = (d22) this.f;
                d22 d22Var3 = (d22) this.g;
                d22Var2.k.add(d22Var3);
                return new ue(4, d22Var2, d22Var3);
            case 26:
                return new ue(5, (d22) this.f, (z12) this.g);
            case 27:
                k42 k42Var = (k42) this.f;
                sa0 sa0Var = (sa0) this.g;
                ((Long) obj).getClass();
                float f3 = k42Var.e;
                k42Var.e = 0.0f;
                sa0Var.i(Float.valueOf(f3));
                return t32.a;
            default:
                t82 t82Var = (t82) this.f;
                View view = (View) this.g;
                gh0 gh0Var = t82Var.u;
                if (t82Var.t == 0) {
                    gh0Var.h = false;
                    gh0Var.i = false;
                    gh0Var.j = null;
                    Field field = h62.a;
                    b62.b(view, gh0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(gh0Var);
                    h62.c(view, gh0Var);
                }
                t82Var.t++;
                return new ue(7, t82Var, view);
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
