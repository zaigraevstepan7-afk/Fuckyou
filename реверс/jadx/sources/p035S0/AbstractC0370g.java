package p035S0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p001A0.AbstractC0016e;
import p033R0.C0353a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: S0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0370g extends AbstractC0016e {
    /* JADX INFO: renamed from: C0 */
    public static int m1000C0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: D0 */
    public static Map m1001D0(ArrayList arrayList) {
        C0368e c0368e = C0368e.f1011a;
        int size = arrayList.size();
        if (size == 0) {
            return c0368e;
        }
        if (size == 1) {
            C0353a c0353a = (C0353a) arrayList.get(0);
            AbstractC0451c.m1146e(c0353a, "pair");
            Map mapSingletonMap = Collections.singletonMap(c0353a.f992a, c0353a.f993b);
            AbstractC0451c.m1145d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1000C0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0353a c0353a2 = (C0353a) it.next();
            linkedHashMap.put(c0353a2.f992a, c0353a2.f993b);
        }
        return linkedHashMap;
    }
}
