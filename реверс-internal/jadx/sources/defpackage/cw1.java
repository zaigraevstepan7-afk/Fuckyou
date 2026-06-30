package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 {
    public final ld0 a;
    public ld0 b;
    public ArrayList c;
    public ArrayList d;
    public HashMap e;

    public cw1(ld0 ld0Var) {
        this.a = ld0Var;
    }

    public final ld0 a() {
        return (ld0) c().get(0);
    }

    public final List b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            ld0 ld0Var = this.a;
            arrayList2.add(hk.u(d, ld0Var.c, ld0Var.d));
        }
        List listG = hk.G(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            ul.a0(arrayList3, (Iterable) it.next());
        }
        this.d = arrayList3;
        return arrayList3;
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b());
        arrayList2.add(this.a);
        tl.Z(arrayList2, new bm1(2, this));
        this.c = arrayList2;
        return arrayList2;
    }

    public final double d(ld0 ld0Var) {
        ld0Var.getClass();
        Object obj = ((HashMap) e()).get(f());
        obj.getClass();
        double dDoubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) e()).get(a());
        obj2.getClass();
        double dDoubleValue2 = dDoubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) e()).get(ld0Var);
        obj3.getClass();
        double dDoubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) e()).get(a());
        obj4.getClass();
        double dDoubleValue4 = dDoubleValue3 - ((Number) obj4).doubleValue();
        if (dDoubleValue2 == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue4 / dDoubleValue2;
    }

    public final Map e() {
        HashMap map = this.e;
        if (map != null) {
            return map;
        }
        ArrayList arrayList = new ArrayList(b());
        arrayList.add(this.a);
        HashMap map2 = new HashMap();
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            int i2 = i + 1;
            ld0 ld0Var = (ld0) obj;
            ld0Var.getClass();
            int i3 = ld0Var.a;
            double dV = pv.v((i3 >> 16) & 255);
            double dV2 = pv.v((i3 >> 8) & 255);
            double dV3 = pv.v(i3 & 255);
            double[][] dArr = pv.j;
            double[] dArr2 = dArr[c];
            double d = (dArr2[2] * dV3) + (dArr2[1] * dV2) + (dArr2[c] * dV);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * dV3) + (dArr3[1] * dV2) + (dArr3[c] * dV);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * dV3) + (dArr4[1] * dV2) + (dArr4[c] * dV);
            double[] dArr5 = pv.k;
            double d4 = d / dArr5[c];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double dU = pv.u(d4);
            double dU2 = pv.u(d5);
            double d7 = (116.0d * dU2) - 16.0d;
            double d8 = (dU - dU2) * 500.0d;
            double dU3 = (dU2 - pv.u(d6)) * 200.0d;
            double[] dArr6 = new double[3];
            dArr6[c] = d7;
            dArr6[1] = d8;
            dArr6[2] = dU3;
            double dAtan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (dAtan2 < 0.0d) {
                dAtan2 += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d9 = (dAtan2 - 50.0d) % 360.0d;
            if (d9 < 0.0d) {
                d9 += 360.0d;
            }
            map2.put(ld0Var, Double.valueOf((Math.cos(d9 * 0.017453292519943295d) * dPow) - 0.5d));
            i = i2;
            c = 0;
        }
        this.e = map2;
        return map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw1) && this.a.equals(((cw1) obj).a);
    }

    public final ld0 f() {
        return (ld0) c().get(c().size() - 1);
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.a + ")";
    }
}
