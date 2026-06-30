package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 {
    public boolean A;
    public final q32 a;
    public jo0 d;
    public ha0 f;
    public yk g;
    public vt h;
    public s71 i;
    public id0 j;
    public o80 k;
    public final v41 l;
    public final v41 m;
    public long n;
    public wz1 o;
    public long p;
    public final v41 q;
    public final v41 r;
    public int s;
    public az1 t;
    public go1 u;
    public wz1 v;
    public final v41 w;
    public final n81 x;
    public final py1 y;
    public final go1 z;
    public z01 b = s22.m0;
    public sa0 c = new mt(12);
    public final v41 e = xc.B(new az1((String) null, 0, 7));

    public ry1(q32 q32Var) {
        this.a = q32Var;
        Boolean bool = Boolean.TRUE;
        this.l = xc.B(bool);
        this.m = xc.B(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = xc.B(null);
        this.r = xc.B(null);
        this.s = -1;
        this.t = new az1((String) null, 0L, 7);
        this.w = xc.B(Boolean.FALSE);
        n81 n81Var = new n81(7);
        n81Var.c = k12.e;
        this.x = n81Var;
        this.y = new py1(this);
        this.z = new go1(this);
    }

    public static final j41 a(ry1 ry1Var) {
        String str;
        wz1 wz1Var;
        hb hbVarM = ry1Var.m();
        if (hbVarM == null || (str = hbVarM.f) == null || (wz1Var = ry1Var.v) == null) {
            return null;
        }
        long j = wz1Var.a;
        return new j41(str, new wz1(af1.g(ry1Var.b.g((int) (j >> 32)), ry1Var.b.g((int) (j & 4294967295L)))));
    }

    public static final void b(ry1 ry1Var, wz1 wz1Var) {
        hb hbVarM;
        String str;
        vt vtVar;
        if (wz1Var == null) {
            return;
        }
        long j = wz1Var.a;
        s71 s71Var = ry1Var.i;
        if (s71Var == null || (hbVarM = ry1Var.m()) == null || (str = hbVarM.f) == null) {
            return;
        }
        z01 z01Var = ry1Var.b;
        long jG = af1.g(z01Var.g((int) (j >> 32)), z01Var.g((int) (j & 4294967295L)));
        if (str.length() <= 0 || wz1.c(jG) || (vtVar = ry1Var.h) == null) {
            return;
        }
        nu0.A(vtVar, null, null, new tr(s71Var, str, jG, wz1Var, ry1Var, z01Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(ry1 ry1Var, az1 az1Var, long j, boolean z, boolean z2, yc ycVar, boolean z3, jd0 jd0Var) {
        qz1 qz1VarD;
        long j2;
        int i;
        long j3;
        wk1 wk1Var;
        long j4;
        hb hbVar;
        wk1 wk1Var2;
        boolean z4;
        id0 id0Var;
        vk1 vk1VarJ;
        vk1 vk1Var;
        vk1 vk1Var2;
        jo0 jo0Var = ry1Var.d;
        if (jo0Var == null || (qz1VarD = jo0Var.d()) == null) {
            return wz1.b;
        }
        z01 z01Var = ry1Var.b;
        long j5 = az1Var.b;
        hb hbVar2 = az1Var.a;
        int i2 = wz1.c;
        long jG = af1.g(z01Var.g((int) (j5 >> 32)), ry1Var.b.g((int) (j5 & 4294967295L)));
        int iB = qz1VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jG >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jG & 4294967295L);
        }
        go1 go1Var = ry1Var.u;
        int i4 = -1;
        if (z || go1Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = ry1Var.s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        pz1 pz1Var = qz1VarD.a;
        if (z) {
            hbVar = hbVar2;
            j4 = j5;
            wk1Var = null;
        } else {
            j4 = j5;
            int i6 = (int) (jG >> 32);
            hbVar = hbVar2;
            int i7 = (int) (jG & j3);
            wk1Var = new wk1(new vk1(ef1.l(pz1Var, i6), i6, 1L), new vk1(ef1.l(pz1Var, i7), i7, 1L), wz1.g(jG));
        }
        go1 go1Var2 = new go1(z2, wk1Var, new ll(i3, i, i4, pz1Var));
        if (wk1Var != null && go1Var != null && z2 == go1Var.b) {
            ll llVar = (ll) go1Var.d;
            if (i3 == llVar.b && i == llVar.c) {
                return j4;
            }
        }
        ry1Var.u = go1Var2;
        ry1Var.s = iB;
        int i8 = ycVar.e;
        du duVar = du.e;
        Object obj = go1Var2.d;
        switch (i8) {
            case 25:
                ll llVar2 = (ll) obj;
                wk1Var2 = new wk1(llVar2.a(llVar2.b), llVar2.a(llVar2.c), go1Var2.a() == duVar);
                break;
            case 26:
                wk1Var2 = xc.f(go1Var2, l91.k);
                break;
            case 27:
                wk1Var2 = xc.f(go1Var2, l91.j);
                break;
            default:
                wk1Var2 = (wk1) go1Var2.c;
                ll llVar3 = (ll) obj;
                if (wk1Var2 == null) {
                    wk1Var2 = xc.f(go1Var2, l91.k);
                    break;
                } else {
                    vk1 vk1Var3 = wk1Var2.b;
                    vk1 vk1Var4 = wk1Var2.a;
                    if (go1Var2.b) {
                        vk1VarJ = xc.j(go1Var2, llVar3, vk1Var4);
                        vk1Var2 = vk1Var3;
                        vk1Var3 = vk1Var4;
                        vk1Var = vk1VarJ;
                    } else {
                        vk1VarJ = xc.j(go1Var2, llVar3, vk1Var3);
                        vk1Var = vk1Var4;
                        vk1Var2 = vk1VarJ;
                    }
                    if (!xi0.o(vk1VarJ, vk1Var3)) {
                        wk1 wk1Var3 = new wk1(vk1Var, vk1Var2, go1Var2.a() == duVar || (go1Var2.a() == du.g && vk1Var.b > vk1Var2.b));
                        ll llVar4 = (ll) obj;
                        vk1 vk1Var5 = wk1Var3.a;
                        long j6 = vk1Var5.c;
                        vk1 vk1Var6 = wk1Var3.b;
                        if (j6 != vk1Var6.c) {
                            boolean z5 = wk1Var3.c;
                            if ((z5 ? vk1Var5 : vk1Var6).b == 0) {
                                if (((pz1) llVar4.e).a.a.f.length() != (z5 ? vk1Var6 : vk1Var5).b) {
                                }
                            }
                            wk1Var2 = wk1Var3;
                            break;
                        } else if (vk1Var5.b == vk1Var6.b) {
                            wk1 wk1Var4 = (wk1) go1Var2.c;
                            String str = ((pz1) llVar4.e).a.a.f;
                            if (wk1Var4 == null || str.length() == 0) {
                                wk1Var2 = wk1Var3;
                            } else {
                                boolean z6 = go1Var2.b;
                                String str2 = ((pz1) llVar4.e).a.a.f;
                                int i9 = llVar4.b;
                                int length = str2.length();
                                if (i9 == 0) {
                                    int iL = qc1.l(str2, 0);
                                    wk1Var2 = !z6 ? wk1.a(wk1Var3, null, xc.l(vk1Var6, llVar4, iL), false, 1) : wk1.a(wk1Var3, xc.l(vk1Var5, llVar4, iL), null, true, 2);
                                } else if (i9 != length) {
                                    boolean z7 = wk1Var4.c;
                                    int iM = z6 ^ z7 ? qc1.m(str2, i9) : qc1.l(str2, i9);
                                    wk1Var2 = !z6 ? wk1.a(wk1Var3, null, xc.l(vk1Var6, llVar4, iM), z7, 1) : wk1.a(wk1Var3, xc.l(vk1Var5, llVar4, iM), null, z7, 2);
                                } else {
                                    int iM2 = qc1.m(str2, length);
                                    wk1Var2 = !z6 ? wk1.a(wk1Var3, null, xc.l(vk1Var6, llVar4, iM2), true, 1) : wk1.a(wk1Var3, xc.l(vk1Var5, llVar4, iM2), null, false, 2);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
        long jG2 = af1.g(ry1Var.b.e(wk1Var2.a.b), ry1Var.b.e(wk1Var2.b.b));
        long j7 = j4;
        if (wz1.b(jG2, j7)) {
            return j7;
        }
        boolean z8 = wz1.g(jG2) != wz1.g(j7) && wz1.b(af1.g((int) (jG2 & j3), (int) (jG2 >> 32)), j7);
        boolean z9 = wz1.c(jG2) && wz1.c(j7);
        if (z3 && hbVar.f.length() > 0 && !z8 && !z9 && jd0Var != null && (id0Var = ry1Var.j) != null) {
            ((d71) id0Var).a(jd0Var.a);
        }
        ry1Var.c.i(e(hbVar, jG2));
        ry1Var.v = new wz1(jG2);
        if (!z3) {
            ry1Var.t(!wz1.c(jG2));
        }
        jo0 jo0Var2 = ry1Var.d;
        if (jo0Var2 != null) {
            jo0Var2.q.setValue(Boolean.valueOf(z3));
        }
        jo0 jo0Var3 = ry1Var.d;
        if (jo0Var3 != null) {
            jo0Var3.m.setValue(Boolean.valueOf(!wz1.c(jG2) && uc1.s(ry1Var, true)));
        }
        jo0 jo0Var4 = ry1Var.d;
        if (jo0Var4 != null) {
            z4 = false;
            jo0Var4.n.setValue(Boolean.valueOf(!wz1.c(jG2) && uc1.s(ry1Var, false)));
        } else {
            z4 = false;
        }
        jo0 jo0Var5 = ry1Var.d;
        if (jo0Var5 != null) {
            jo0Var5.o.setValue(Boolean.valueOf((wz1.c(jG2) && uc1.s(ry1Var, true)) ? true : z4));
        }
        return jG2;
    }

    public static az1 e(hb hbVar, long j) {
        return new az1(hbVar, j, (wz1) null);
    }

    public final jr1 d(boolean z) {
        vt vtVar = this.h;
        ks ksVar = null;
        if (vtVar == null) {
            return null;
        }
        return nu0.A(vtVar, null, yt.h, new gr0(this, z, ksVar, 2), 1);
    }

    public final void f() {
        vt vtVar = this.h;
        if (vtVar != null) {
            nu0.A(vtVar, null, yt.h, new ly1(this, null, 1), 1);
        }
    }

    public final void g(w01 w01Var) {
        if (!wz1.c(n().b)) {
            jo0 jo0Var = this.d;
            qz1 qz1VarD = jo0Var != null ? jo0Var.d() : null;
            int iE = (w01Var == null || qz1VarD == null) ? wz1.e(n().b) : this.b.e(qz1VarD.b(w01Var.a, true));
            az1 az1VarA = az1.a(n(), null, af1.g(iE, iE), 5);
            this.c.i(az1VarA);
            this.v = new wz1(az1VarA.b);
        }
        q((w01Var == null || n().a.f.length() <= 0) ? cd0.e : cd0.g);
        t(false);
    }

    public final void h(boolean z) {
        o80 o80Var;
        jo0 jo0Var = this.d;
        if (jo0Var != null && !jo0Var.b() && (o80Var = this.k) != null) {
            o80.a(o80Var);
        }
        this.t = n();
        t(z);
        q(cd0.f);
    }

    public final w01 i() {
        return (w01) this.r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        qz1 qz1VarD;
        long j;
        jo0 jo0Var = this.d;
        if (jo0Var == null || (qz1VarD = jo0Var.d()) == null) {
            return 9205357640488583168L;
        }
        pz1 pz1Var = qz1VarD.a;
        vw0 vw0Var = pz1Var.b;
        hb hbVarM = m();
        if (hbVarM == null) {
            return 9205357640488583168L;
        }
        if (!xi0.o(hbVarM.f, pz1Var.a.a.f)) {
            return 9205357640488583168L;
        }
        az1 az1VarN = n();
        if (z) {
            long j2 = az1VarN.b;
            int i = wz1.c;
            j = j2 >> 32;
        } else {
            long j3 = az1VarN.b;
            int i2 = wz1.c;
            j = j3 & 4294967295L;
        }
        int iG = this.b.g((int) j);
        boolean zG = wz1.g(n().b);
        long j4 = pz1Var.c;
        int iD = vw0Var.d(iG);
        if (iD >= vw0Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = pz1Var.a(((!z || zG) && (z || !zG)) ? Math.max(iG + (-1), 0) : iG) == pz1Var.g(iG);
        vw0Var.k(iG);
        int length = ((hb) vw0Var.a.a).f.length();
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(iG == length ? hk.B(arrayList) : bk.u(iG, arrayList));
        r6 r6Var = l41Var.a;
        int iD2 = l41Var.d(iG);
        nz1 nz1Var = r6Var.d;
        return (((long) Float.floatToRawIntBits(lk.z(vw0Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(lk.z(z2 ? nz1Var.j(iD2, false) : nz1Var.k(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final hb m() {
        jo0 jo0Var = this.d;
        if (jo0Var != null) {
            return jo0Var.a.a;
        }
        return null;
    }

    public final az1 n() {
        return (az1) this.e.getValue();
    }

    public final void o() {
        jr1 jr1Var;
        zw1 zw1Var = (zw1) this.x.b;
        if (zw1Var == null || (jr1Var = zw1Var.y) == null) {
            return;
        }
        jr1Var.a(null);
        zw1Var.y = null;
    }

    public final void p() {
        vt vtVar = this.h;
        if (vtVar != null) {
            nu0.A(vtVar, null, yt.h, new ly1(this, null, 2), 1);
        }
    }

    public final void q(cd0 cd0Var) {
        jo0 jo0Var = this.d;
        if (jo0Var != null) {
            if (jo0Var.a() == cd0Var) {
                jo0Var = null;
            }
            if (jo0Var != null) {
                jo0Var.k.setValue(cd0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        tw1 tw1Var;
        sp1 sp1VarL = uc1.l();
        ks ksVar = null;
        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
        sp1 sp1VarU = uc1.u(sp1VarL);
        try {
            if (k()) {
                jo0 jo0Var = this.d;
                if (jo0Var != null) {
                }
                uc1.B(sp1VarL, sp1VarU, sa0VarE);
                n81 n81Var = this.x;
                if (((k12) n81Var.c) == k12.e) {
                    qg0.c("ToolbarRequester is not initialized.");
                }
                zw1 zw1Var = (zw1) n81Var.b;
                if (zw1Var == null || !zw1Var.r) {
                    return;
                }
                jr1 jr1Var = zw1Var.y;
                if ((jr1Var == null || !jr1Var.b()) && (tw1Var = (tw1) hk.o(zw1Var, uw1.b)) != null) {
                    zw1Var.y = nu0.A(zw1Var.z0(), null, yt.h, new g(zw1Var, tw1Var, ksVar, 20), 1);
                }
            }
        } finally {
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ls lsVar) {
        qy1 qy1Var;
        if (lsVar instanceof qy1) {
            qy1Var = (qy1) lsVar;
            int i = qy1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy1Var.k = i - Integer.MIN_VALUE;
            } else {
                qy1Var = new qy1(this, lsVar);
            }
        }
        Object objValueOf = qy1Var.i;
        int i2 = qy1Var.k;
        if (i2 == 0) {
            xc.G(objValueOf);
            yk ykVar = this.g;
            if (ykVar != null) {
                qy1Var.h = this;
                qy1Var.k = 1;
                ClipDescription primaryClipDescription = ((p3) ykVar).a.t().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = wt.e;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return t32.a;
        }
        if (i2 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = qy1Var.h;
        xc.G(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.w.setValue(bool);
        return t32.a;
    }

    public final void t(boolean z) {
        jo0 jo0Var = this.d;
        if (jo0Var != null) {
            jo0Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
