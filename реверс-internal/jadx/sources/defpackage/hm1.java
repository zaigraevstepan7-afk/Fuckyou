package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends ek1 {
    public final /* synthetic */ AtomicReferenceArray g;

    public hm1(long j, hm1 hm1Var, int i) {
        super(j, hm1Var, i);
        this.g = new AtomicReferenceArray(gm1.f);
    }

    @Override // defpackage.ek1
    public final int k() {
        return gm1.f;
    }

    @Override // defpackage.ek1
    public final void l(int i, lt ltVar) {
        this.g.set(i, gm1.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
