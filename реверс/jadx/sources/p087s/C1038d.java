package p087s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1038d extends AbstractC0383m {

    /* JADX INFO: renamed from: p */
    public final AtomicReferenceFieldUpdater f4118p;

    /* JADX INFO: renamed from: q */
    public final AtomicReferenceFieldUpdater f4119q;

    /* JADX INFO: renamed from: r */
    public final AtomicReferenceFieldUpdater f4120r;

    /* JADX INFO: renamed from: s */
    public final AtomicReferenceFieldUpdater f4121s;

    /* JADX INFO: renamed from: t */
    public final AtomicReferenceFieldUpdater f4122t;

    public C1038d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4118p = atomicReferenceFieldUpdater;
        this.f4119q = atomicReferenceFieldUpdater2;
        this.f4120r = atomicReferenceFieldUpdater3;
        this.f4121s = atomicReferenceFieldUpdater4;
        this.f4122t = atomicReferenceFieldUpdater5;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: V */
    public final void mo1068V(C1040f c1040f, C1040f c1040f2) {
        this.f4119q.lazySet(c1040f, c1040f2);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: W */
    public final void mo1069W(C1040f c1040f, Thread thread) {
        this.f4118p.lazySet(c1040f, thread);
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: i */
    public final boolean mo1074i(AbstractFutureC1041g abstractFutureC1041g, C1037c c1037c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1037c c1037c2 = C1037c.f4116b;
        do {
            atomicReferenceFieldUpdater = this.f4121s;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1041g, c1037c, c1037c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1041g) == c1037c);
        return false;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: j */
    public final boolean mo1076j(AbstractFutureC1041g abstractFutureC1041g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4122t;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1041g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1041g) == obj);
        return false;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: k */
    public final boolean mo1078k(AbstractFutureC1041g abstractFutureC1041g, C1040f c1040f, C1040f c1040f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4120r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1041g, c1040f, c1040f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1041g) == c1040f);
        return false;
    }
}
