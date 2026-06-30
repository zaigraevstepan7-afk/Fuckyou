package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yj extends ek1 {
    public final rh g;
    public final /* synthetic */ AtomicReferenceArray h;

    public yj(long j, yj yjVar, rh rhVar, int i) {
        super(j, yjVar, i);
        this.g = rhVar;
        this.h = new AtomicReferenceArray(th.b * 2);
    }

    @Override // defpackage.ek1
    public final int k() {
        return th.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        r(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.ek1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, lt ltVar) {
        int i2 = th.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objP = p(i);
            boolean z2 = objP instanceof a72;
            rh rhVar = this.g;
            if (z2 || (objP instanceof b72)) {
                if (o(i, objP, z ? th.j : th.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        rhVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objP == th.j || objP == th.k) {
                    break;
                }
                if (objP != th.g && objP != th.f) {
                    if (objP == th.i || objP == th.d || objP == th.l) {
                        return;
                    }
                    yc.g(objP, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean o(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            rh rhVar = this.g;
            rhVar.getClass();
            rhVar.K((this.e * ((long) th.b)) + ((long) i));
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
