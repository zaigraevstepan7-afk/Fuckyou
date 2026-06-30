package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f12 {
    public final double a;
    public final double b;
    public final HashMap c = new HashMap();

    public f12(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(hk.u(this.a, 200.0d, i).c);
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }
}
