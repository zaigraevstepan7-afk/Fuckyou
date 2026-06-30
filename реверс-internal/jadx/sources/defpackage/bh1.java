package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements ks, xt {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(bh1.class, Object.class, "result");
    public final ks e;
    private volatile Object result;

    public bh1(ks ksVar) {
        wt wtVar = wt.e;
        this.e = ksVar;
        this.result = wtVar;
    }

    @Override // defpackage.xt
    public final xt d() {
        ks ksVar = this.e;
        if (ksVar instanceof xt) {
            return (xt) ksVar;
        }
        return null;
    }

    @Override // defpackage.ks
    public final lt e() {
        return this.e.e();
    }

    @Override // defpackage.ks
    public final void g(Object obj) {
        while (true) {
            Object obj2 = this.result;
            wt wtVar = wt.f;
            if (obj2 == wtVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, wtVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != wtVar) {
                        break;
                    }
                }
                return;
            }
            wt wtVar2 = wt.e;
            if (obj2 != wtVar2) {
                yc.l("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
            wt wtVar3 = wt.g;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, wtVar2, wtVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != wtVar2) {
                    break;
                }
            }
            this.e.g(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.e;
    }
}
