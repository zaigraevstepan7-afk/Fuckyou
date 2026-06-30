package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e30 implements Runnable {
    public final ArrayList e;
    public final int f;

    public e30(List list, int i, Throwable th) {
        bk.n(list, "initCallbacks cannot be null");
        this.e = new ArrayList(list);
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        if (this.f != 1) {
            while (i < size) {
                ((d30) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((d30) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
