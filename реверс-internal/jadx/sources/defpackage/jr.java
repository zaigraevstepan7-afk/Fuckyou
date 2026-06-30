package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jr implements km1 {
    public final AtomicReference a;

    public jr(km1 km1Var) {
        this.a = new AtomicReference(km1Var);
    }

    @Override // defpackage.km1
    public final Iterator iterator() {
        km1 km1Var = (km1) this.a.getAndSet(null);
        if (km1Var != null) {
            return km1Var.iterator();
        }
        yc.l("This sequence can be consumed only once.");
        return null;
    }
}
