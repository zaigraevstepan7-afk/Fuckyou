package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends t implements oj0 {
    public static final i01 f = new i01(v20.O);

    @Override // defpackage.oj0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.oj0
    public final ek i(vj0 vj0Var) {
        return j01.e;
    }

    @Override // defpackage.oj0
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.oj0
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.oj0
    public final az s(sa0 sa0Var) {
        return j01.e;
    }

    @Override // defpackage.oj0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.oj0
    public final Object w(ls lsVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.oj0
    public final az x(boolean z, boolean z2, f fVar) {
        return j01.e;
    }

    @Override // defpackage.oj0
    public final void a(CancellationException cancellationException) {
    }
}
