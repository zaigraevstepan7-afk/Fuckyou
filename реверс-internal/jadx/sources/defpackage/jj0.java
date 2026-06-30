package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 extends rj0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(jj0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final f l;

    public jj0(f fVar) {
        this.l = fVar;
    }

    @Override // defpackage.rj0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.rj0
    public final void s(Throwable th) {
        if (m.compareAndSet(this, 0, 1)) {
            this.l.i(th);
        }
    }
}
