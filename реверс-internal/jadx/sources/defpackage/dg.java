package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Serializable i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ dg(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = serializable;
        this.j = obj4;
        this.k = obj5;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Serializable serializable = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                hg1 hg1Var = (hg1) obj5;
                wc1 wc1Var = (wc1) obj4;
                zc1 zc1Var = (zc1) serializable;
                w6 w6Var = (w6) obj3;
                lh lhVar = (lh) obj2;
                p10 p10Var = (p10) obj;
                tt1 tt1Var = (tt1) ((me) obj6).b;
                tt1Var.getClass();
                float fFloatValue = Float.valueOf(tt1Var.e).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                boolean z = 2.0f * fFloatValue > Math.min(Math.abs(hg1Var.b()), Math.abs(hg1Var.a()));
                if (wc1Var.e != fFloatValue) {
                    w6Var.g();
                    w6.c(w6Var, hg1Var);
                    if (!z) {
                        w6 w6VarA = y6.a();
                        w6.c(w6VarA, new hg1(hg1Var.a + fFloatValue, hg1Var.b + fFloatValue, hg1Var.c - fFloatValue, hg1Var.d - fFloatValue, pv.C(fFloatValue, hg1Var.e), pv.C(fFloatValue, hg1Var.f), pv.C(fFloatValue, hg1Var.g), pv.C(fFloatValue, hg1Var.h)));
                        w6Var.f(w6Var, w6VarA, 0);
                    }
                    zc1Var.e = w6Var;
                    wc1Var.e = fFloatValue;
                }
                Object obj7 = zc1Var.e;
                obj7.getClass();
                p10.y0(p10Var, (w6) obj7, lhVar, 0.0f, null, null, 60);
                break;
            default:
                z61[] z61VarArr = (z61[]) obj6;
                List list = (List) obj5;
                xu0 xu0Var = (xu0) obj4;
                xc1 xc1Var = (xc1) serializable;
                xc1 xc1Var2 = (xc1) obj3;
                ug ugVar = (ug) obj2;
                y61 y61Var = (y61) obj;
                int length = z61VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    z61 z61Var = z61VarArr[i2];
                    z61Var.getClass();
                    sg.b(y61Var, z61Var, (pu0) list.get(i3), xu0Var.getLayoutDirection(), xc1Var.e, xc1Var2.e, ugVar.a);
                    i2++;
                    i3++;
                }
                break;
        }
        return t32Var;
    }
}
