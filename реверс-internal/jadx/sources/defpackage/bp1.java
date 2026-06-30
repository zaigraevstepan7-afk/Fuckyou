package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements uu0 {
    public final /* synthetic */ hp1 a;

    public bp1(hp1 hp1Var, fy0 fy0Var) {
        this.a = hp1Var;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        int iMax;
        int i;
        int i2;
        int iMax2;
        hp1 hp1Var = this.a;
        float[] fArr = hp1Var.f;
        k31 k31Var = hp1Var.m;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                vq0.b("Collection contains no element matching the predicate.");
                yc.j();
                return null;
            }
            pu0 pu0Var = (pu0) list.get(i3);
            if (xi0.z(pu0Var) == oo1.e) {
                z61 z61VarE = pu0Var.e(j);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    pu0 pu0Var2 = (pu0) list.get(i4);
                    if (xi0.z(pu0Var2) == oo1.f) {
                        k31 k31Var2 = k31.e;
                        z61 z61VarE2 = k31Var == k31Var2 ? pu0Var2.e(kr.a(lr.j(0, -z61VarE.f, 1, j), 0, 0, 0, 0, 14)) : pu0Var2.e(kr.a(lr.j(-z61VarE.e, 0, 2, j), 0, 0, 0, 0, 11));
                        xc1 xc1Var = new xc1();
                        xc1 xc1Var2 = new xc1();
                        float fB = hp1Var.b();
                        fArr.getClass();
                        if (!xi0.n(fB, fArr.length != 0 ? Float.valueOf(fArr[0]) : null)) {
                            xi0.n(fB, nd.Y(fArr));
                        }
                        z61VarE2.b0(fp1.f);
                        int i5 = z61VarE.e;
                        int i6 = z61VarE.f;
                        int i7 = z61VarE2.e;
                        if (k31Var == k31Var2) {
                            iMax2 = Math.max(i7, i5);
                            int i8 = z61VarE2.f;
                            iMax = i6 + i8;
                            i = (iMax2 - z61VarE2.e) / 2;
                            i2 = i6 / 2;
                            xc1Var.e = (iMax2 - z61VarE.e) / 2;
                            xc1Var2.e = (i2 - (z61VarE.f / 2)) + nu0.I(i8 * fB);
                        } else {
                            int i9 = i5 + i7;
                            iMax = Math.max(z61VarE2.f, i6);
                            i = i5 / 2;
                            i2 = (iMax - z61VarE2.f) / 2;
                            xc1Var.e = (nu0.I(z61VarE2.e * fB) + i) - (z61VarE.e / 2);
                            xc1Var2.e = (iMax - z61VarE.f) / 2;
                            iMax2 = i9;
                        }
                        int i10 = i2;
                        int i11 = i;
                        hp1Var.g.h(iMax2);
                        hp1Var.h.h(iMax);
                        return xu0Var.f0(iMax2, iMax, g40.e, new tg(z61VarE2, i11, i10, z61VarE, xc1Var, xc1Var2));
                    }
                }
                vq0.b("Collection contains no element matching the predicate.");
                yc.j();
                return null;
            }
            i3++;
        }
    }
}
