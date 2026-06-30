package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 extends sv0 implements vp, il0 {
    public LinkedHashMap s;

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        float f = ((tz) hk.o(this, bi0.c)).e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        z61 z61VarE = pu0Var.e(j);
        boolean z = this.r && !Float.isNaN(f) && tz.a(f, 0.0f) > 0;
        int iN = !Float.isNaN(f) ? xu0Var.N(f) : 0;
        int iMax = z61VarE.e;
        if (z) {
            iMax = Math.max(iMax, iN);
        }
        int iMax2 = z61VarE.f;
        if (z) {
            iMax2 = Math.max(iMax2, iN);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.s = linkedHashMap;
            }
            x52 x52Var = bi0.b;
            int iRound = Math.round((iN - z61VarE.e) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(x52Var, Integer.valueOf(iRound));
            ud0 ud0Var = bi0.a;
            int iRound2 = Math.round((iN - z61VarE.f) / 2.0f);
            linkedHashMap.put(ud0Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.s;
        if (map == null) {
            map = g40.e;
        }
        return xu0Var.f0(iMax, iMax2, map, new ov0(iMax, iMax2, z61VarE));
    }
}
