package p087s;

import p036T.AbstractC0383m;

/* JADX INFO: renamed from: s.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1039e extends AbstractC0383m {
    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: V */
    public final void mo1068V(C1040f c1040f, C1040f c1040f2) {
        c1040f.f4125b = c1040f2;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: W */
    public final void mo1069W(C1040f c1040f, Thread thread) {
        c1040f.f4124a = thread;
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: i */
    public final boolean mo1074i(AbstractFutureC1041g abstractFutureC1041g, C1037c c1037c) {
        C1037c c1037c2 = C1037c.f4116b;
        synchronized (abstractFutureC1041g) {
            try {
                if (abstractFutureC1041g.f4131b != c1037c) {
                    return false;
                }
                abstractFutureC1041g.f4131b = c1037c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: j */
    public final boolean mo1076j(AbstractFutureC1041g abstractFutureC1041g, Object obj, Object obj2) {
        synchronized (abstractFutureC1041g) {
            try {
                if (abstractFutureC1041g.f4130a != obj) {
                    return false;
                }
                abstractFutureC1041g.f4130a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p036T.AbstractC0383m
    /* JADX INFO: renamed from: k */
    public final boolean mo1078k(AbstractFutureC1041g abstractFutureC1041g, C1040f c1040f, C1040f c1040f2) {
        synchronized (abstractFutureC1041g) {
            try {
                if (abstractFutureC1041g.f4132c != c1040f) {
                    return false;
                }
                abstractFutureC1041g.f4132c = c1040f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
