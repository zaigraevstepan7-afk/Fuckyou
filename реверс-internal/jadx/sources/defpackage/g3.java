package defpackage;

import android.content.res.Resources;
import android.os.CancellationSignal;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(int i, Object obj) {
        super(1);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02fd A[PHI: r9
      0x02fd: PHI (r9v7 boolean) = (r9v6 boolean), (r9v8 boolean) binds: [B:133:0x0290, B:161:0x02fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ug0 ug0Var;
        ug0 ug0Var2;
        int i = this.f;
        int i2 = -1;
        int i3 = 0;
        t32 t32Var = t32.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                h3 h3Var = (h3) obj;
                rl0 rl0Var = (rl0) obj2;
                if (h3Var.P() != Integer.MAX_VALUE) {
                    if (h3Var.a().b) {
                        h3Var.p();
                    }
                    for (Map.Entry entry : h3Var.a().i.entrySet()) {
                        rl0.a(rl0Var, (c3) entry.getKey(), ((Number) entry.getValue()).intValue(), h3Var.n());
                    }
                    c01 c01Var = h3Var.n().y;
                    c01Var.getClass();
                    while (!c01Var.equals(rl0Var.a.n())) {
                        for (c3 c3Var : rl0Var.b(c01Var).keySet()) {
                            rl0.a(rl0Var, c3Var, rl0Var.c(c01Var, c3Var), c01Var);
                        }
                        c01Var = c01Var.y;
                        c01Var.getClass();
                    }
                }
                return t32Var;
            case 1:
                xd0 xd0Var = (xd0) obj;
                v3 v3Var = (v3) obj2;
                if (v3Var.s == null) {
                    v3Var.s = new x82(v3Var.v.getInsetsWatcher());
                }
                hx0 hx0Var = x82.e;
                int[] iArr = hx0Var.b;
                Object[] objArr = hx0Var.c;
                long[] jArr = hx0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    z = false;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = i3; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    int i8 = iArr[i7];
                                    v82 v82Var = (v82) objArr[i7];
                                    if (x82.a(xd0Var, ((w82) v82Var).c) || x82.a(xd0Var, ((w82) v82Var).d) || !(i8 == -1 || (ug0Var = (ug0) x82.c.b(i8)) == null || (!x82.a(xd0Var, ug0Var) && ((ug0Var2 = (ug0) x82.d.b(i8)) == null || !x82.a(xd0Var, ug0Var2))))) {
                                        z4 = true;
                                        z = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                    }
                                }
                                j >>= 8;
                            }
                            if (i5 == 8) {
                                if (i4 != length) {
                                    i4++;
                                    i3 = 0;
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    }
                }
                z = false;
                v82.a.getClass();
                w82 w82Var = u82.j;
                if (x82.a(xd0Var, w82Var.c) || x82.a(xd0Var, w82Var.d)) {
                    z2 = true;
                    z = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = z;
                } else {
                    for (ug0 ug0Var3 : x82.b) {
                        if (x82.a(xd0Var, ug0Var3)) {
                            z3 = true;
                        }
                    }
                    z3 = z;
                }
                return Boolean.valueOf(z3);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.valueOf(((w80) obj).S0(((a80) obj2).a));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(((mh0) obj2).a(((rl1) obj).f));
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.valueOf(pv.f((rl1) obj, (Resources) obj2));
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(xi0.o(obj, obj2));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                bb bbVar = (bb) obj;
                float f = bbVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = bbVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = bbVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = bbVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new vl(vl.a(lk.c(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, gm.x), (em) obj2));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return new j2(5, (bz) obj2);
            case el.a /* 9 */:
                a00 a00Var = (a00) obj;
                if (!a00Var.e.r) {
                    return h22.f;
                }
                a00 a00Var2 = a00Var.t;
                h22 h22Var = h22.e;
                if (a00Var2 != null) {
                    g3 g3Var = new g3(9, (qt0) obj2);
                    if (g3Var.i(a00Var2) == h22Var) {
                        pd1.w(a00Var2, g3Var);
                    }
                }
                a00Var.t = null;
                a00Var.s = null;
                return h22Var;
            case el.b /* 10 */:
                if (hc0.b.compareAndSet(false, true)) {
                    ((rh) obj2).t(t32Var);
                }
                return t32Var;
            case 11:
                p10 p10Var = (p10) obj;
                nc0 nc0Var = (nc0) obj2;
                w6 w6Var = nc0Var.l;
                if (nc0Var.n && nc0Var.A && w6Var != null) {
                    oc ocVarE = p10Var.E();
                    long jQ = ocVarE.q();
                    ocVarE.i().l();
                    try {
                        ((oc) ((qt0) ocVarE.a).f).i().s(w6Var);
                        nc0Var.c(p10Var);
                    } finally {
                        s91.r(ocVarE, jQ);
                    }
                } else {
                    nc0Var.c(p10Var);
                }
                return t32Var;
            case el.c /* 12 */:
                p10 p10Var2 = (p10) obj;
                cj cjVarI = p10Var2.E().i();
                wa0 wa0Var = ((qc0) obj2).h;
                if (wa0Var != null) {
                    wa0Var.h(cjVarI, (nc0) p10Var2.E().b);
                }
                return t32Var;
            case 13:
                r42 r42Var = (r42) obj;
                xc0 xc0Var = (xc0) obj2;
                xc0Var.g(r42Var);
                sa0 sa0Var = xc0Var.i;
                if (sa0Var != null) {
                    sa0Var.i(r42Var);
                }
                return t32Var;
            case 14:
                p01 p01Var = (p01) obj;
                mc1 mc1Var = p01Var.b;
                if (mc1Var != null) {
                    mc1Var.closeConnection();
                    p01Var.b = null;
                }
                yg0 yg0Var = (yg0) obj2;
                iy0 iy0Var = yg0Var.d;
                Object[] objArr2 = iy0Var.e;
                int i9 = iy0Var.g;
                while (true) {
                    if (i3 < i9) {
                        if (xi0.o((f72) objArr2[i3], p01Var)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i2 >= 0) {
                    iy0Var.k(i2);
                }
                if (iy0Var.g == 0) {
                    yg0Var.b.a();
                }
                return t32Var;
            case 15:
                ((iy0) obj2).b((rv0) obj);
                return Boolean.TRUE;
            case 16:
                yl1.b((am1) obj, ((yf1) obj2).a);
                return t32Var;
            case 17:
                ck0[] ck0VarArr = yl1.a;
                ((am1) obj).a(vl1.a, hk.G((String) obj2));
                return t32Var;
            case 18:
                ((List) obj).add((Float) ((gn0) obj2).a());
                return true;
            case 19:
                ue1 ue1Var = (ue1) obj;
                vm1 vm1Var = (vm1) obj2;
                ue1Var.n(ue1Var.w.b() * 3.0f);
                ue1Var.o(vm1Var.a);
                ue1Var.f(vm1Var.b);
                ue1Var.e(vm1Var.c);
                ue1Var.p(vm1Var.d);
                return t32Var;
            case 20:
                ue1 ue1Var2 = (ue1) obj;
                ao1 ao1Var = (ao1) obj2;
                ue1Var2.k(ao1Var.s);
                ue1Var2.m(ao1Var.t);
                ue1Var2.c(ao1Var.u);
                ue1Var2.t(0.0f);
                ue1Var2.z(0.0f);
                ue1Var2.n(ao1Var.v);
                ue1Var2.h(0.0f);
                ue1Var2.i(0.0f);
                ue1Var2.j(0.0f);
                float f8 = ao1Var.w;
                if (ue1Var2.q != f8) {
                    ue1Var2.e |= 2048;
                    ue1Var2.q = f8;
                }
                ue1Var2.r(ao1Var.x);
                ue1Var2.o(ao1Var.y);
                ue1Var2.f(ao1Var.z);
                ue1Var2.e(ao1Var.A);
                ue1Var2.p(ao1Var.B);
                int i10 = ao1Var.C;
                if (ue1Var2.z != i10) {
                    ue1Var2.e |= 524288;
                    ue1Var2.z = i10;
                }
                ue1Var2.g(null);
                vk0 vk0Var = ao1Var.D;
                if (!xi0.o(ue1Var2.v, vk0Var)) {
                    ue1Var2.e |= 1048576;
                    ue1Var2.v = vk0Var;
                }
                return t32Var;
            default:
                Throwable th = (Throwable) obj;
                ev1 ev1Var = (ev1) obj2;
                xi xiVar = ev1Var.g;
                if (xiVar != null) {
                    xiVar.m(th);
                }
                ev1Var.g = null;
                return t32Var;
        }
    }
}
