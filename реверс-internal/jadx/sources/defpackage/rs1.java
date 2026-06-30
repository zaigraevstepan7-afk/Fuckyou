package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 extends q0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.q0
    public final boolean a(p0 p0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(c2.I);
        return true;
    }

    @Override // defpackage.q0
    public final ks[] b(p0 p0Var) {
        this.a.set(null);
        return pv.a;
    }
}
