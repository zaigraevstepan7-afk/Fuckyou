package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qy0 {
    public final AtomicReference a = new AtomicReference(null);
    public final uy0 b = new uy0();

    public static final void a(qy0 qy0Var, ny0 ny0Var) {
        AtomicReference atomicReference = qy0Var.a;
        while (true) {
            ny0 ny0Var2 = (ny0) atomicReference.get();
            if (ny0Var2 != null && ny0Var.a.compareTo(ny0Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(ny0Var2, ny0Var)) {
                if (atomicReference.get() != ny0Var2) {
                    break;
                }
            }
            if (ny0Var2 != null) {
                ny0Var2.b.a(new w60("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
