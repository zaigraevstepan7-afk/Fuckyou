package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0569a {

    /* JADX INFO: renamed from: a */
    public final HashMap f1857a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1858b;

    public C0569a(HashMap map) {
        this.f1858b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0580l enumC0580l = (EnumC0580l) entry.getValue();
            List arrayList = (List) this.f1857a.get(enumC0580l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1857a.put(enumC0580l, arrayList);
            }
            arrayList.add((C0570b) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1476a(List list, InterfaceC0586r interfaceC0586r, EnumC0580l enumC0580l, InterfaceC0585q interfaceC0585q) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0570b c0570b = (C0570b) list.get(size);
                c0570b.getClass();
                try {
                    int i2 = c0570b.f1859a;
                    Method method = c0570b.f1860b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0585q, new Object[0]);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0585q, interfaceC0586r);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0585q, interfaceC0586r, enumC0580l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
