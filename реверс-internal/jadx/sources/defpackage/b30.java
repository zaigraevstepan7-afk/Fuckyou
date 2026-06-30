package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends bk {
    public final /* synthetic */ c30 d;

    public b30(c30 c30Var) {
        this.d = c30Var;
    }

    @Override // defpackage.bk
    public final void S(Throwable th) {
        this.d.a.f(th);
    }

    @Override // defpackage.bk
    public final void T(vu vuVar) {
        c30 c30Var = this.d;
        c30Var.c = vuVar;
        vu vuVar2 = c30Var.c;
        g30 g30Var = c30Var.a;
        wr wrVar = g30Var.g;
        cw cwVar = g30Var.i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? l30.a() : hk.A();
        oc ocVar = new oc();
        ocVar.a = wrVar;
        ocVar.b = vuVar2;
        ocVar.c = cwVar;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                ocVar.u(str, 0, str.length(), 1, true, new s30(str, 0));
            }
        }
        c30Var.b = ocVar;
        g30 g30Var2 = c30Var.a;
        ArrayList arrayList = new ArrayList();
        g30Var2.a.writeLock().lock();
        try {
            g30Var2.c = 1;
            arrayList.addAll(g30Var2.b);
            g30Var2.b.clear();
            g30Var2.a.writeLock().unlock();
            g30Var2.d.post(new e30(arrayList, g30Var2.c, null));
        } catch (Throwable th) {
            g30Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
