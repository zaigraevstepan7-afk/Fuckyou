package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends nu0 {
    public final AtomicReferenceFieldUpdater u;
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater w;
    public final AtomicReferenceFieldUpdater x;
    public final AtomicReferenceFieldUpdater y;

    public k0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.u = atomicReferenceFieldUpdater;
        this.v = atomicReferenceFieldUpdater2;
        this.w = atomicReferenceFieldUpdater3;
        this.x = atomicReferenceFieldUpdater4;
        this.y = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.nu0
    public final void G(m0 m0Var, m0 m0Var2) {
        this.v.lazySet(m0Var, m0Var2);
    }

    @Override // defpackage.nu0
    public final void H(m0 m0Var, Thread thread) {
        this.u.lazySet(m0Var, thread);
    }

    @Override // defpackage.nu0
    public final boolean k(n0 n0Var, j0 j0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.x;
            if (atomicReferenceFieldUpdater.compareAndSet(n0Var, j0Var, j0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n0Var) == j0Var);
        return false;
    }

    @Override // defpackage.nu0
    public final boolean l(n0 n0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.y;
            if (atomicReferenceFieldUpdater.compareAndSet(n0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n0Var) == obj);
        return false;
    }

    @Override // defpackage.nu0
    public final boolean m(n0 n0Var, m0 m0Var, m0 m0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.w;
            if (atomicReferenceFieldUpdater.compareAndSet(n0Var, m0Var, m0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n0Var) == m0Var);
        return false;
    }
}
