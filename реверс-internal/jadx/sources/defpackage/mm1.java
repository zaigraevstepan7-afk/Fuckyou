package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mm1 extends nm1 {
    public static List H(km1 km1Var) {
        Iterator it = km1Var.iterator();
        if (!it.hasNext()) {
            return f40.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return hk.G(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
