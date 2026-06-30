package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nk {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public nk(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            po0 po0Var = (po0) entry.getValue();
            List arrayList = (List) this.a.get(po0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(po0Var, arrayList);
            }
            arrayList.add((ok) entry.getKey());
        }
    }

    public static void a(List list, xo0 xo0Var, po0 po0Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ok okVar = (ok) list.get(size);
                Method method = okVar.b;
                try {
                    int i = okVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, xo0Var);
                    } else if (i == 2) {
                        method.invoke(obj, xo0Var, po0Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
