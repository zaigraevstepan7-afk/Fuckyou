package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zf extends s {
    public final Thread j;
    public final b50 k;

    public zf(lt ltVar, Thread thread, b50 b50Var) {
        super(ltVar, true);
        this.j = thread;
        this.k = b50Var;
    }

    @Override // defpackage.vj0
    public final void y(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.j;
        if (xi0.o(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
