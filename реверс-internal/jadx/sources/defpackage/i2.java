package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ i2(Object obj) {
        this.a = obj;
    }

    public void a() {
        wa0 wa0Var = (wa0) this.a;
        synchronized (aq1.c) {
            List list = aq1.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(ql.Y(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && xi0.o(obj, wa0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            aq1.h = arrayList;
        }
    }
}
