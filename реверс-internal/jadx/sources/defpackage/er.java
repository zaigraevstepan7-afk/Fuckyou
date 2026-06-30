package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class er extends rh {
    public final ph t;

    public er(int i, ph phVar) {
        super(i);
        this.t = phVar;
        if (phVar == ph.e) {
            yc.f(ad1.a(rh.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        yc.e(s91.h(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(Object obj, boolean z) throws IllegalAccessException, ly, InvocationTargetException {
        ph phVar = this.t;
        ph phVar2 = ph.g;
        t32 t32Var = t32.a;
        if (phVar == phVar2) {
            Object objT = super.t(obj);
            return (!(objT instanceof xj) || (objT instanceof wj)) ? objT : t32Var;
        }
        Object obj2 = th.d;
        yj yjVar = (yj) rh.j.get(this);
        while (true) {
            long andIncrement = rh.f.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zX = x(andIncrement, false);
            int i = th.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (yjVar.e != j3) {
                yj yjVarM = m(j3, yjVar);
                if (yjVarM != null) {
                    yjVar = yjVarM;
                } else if (zX) {
                    return new wj(q());
                }
            }
            int iD = rh.d(this, yjVar, i2, obj, j, obj2, zX);
            if (iD == 0) {
                yjVar.a();
                return t32Var;
            }
            if (iD == 1) {
                break;
            }
            if (iD != 2) {
                if (iD == 3) {
                    yc.l("unexpected");
                    return null;
                }
                if (iD == 4) {
                    if (j < rh.g.get(this)) {
                        yjVar.a();
                    }
                    return new wj(q());
                }
                if (iD == 5) {
                    yjVar.a();
                }
            } else {
                if (zX) {
                    yjVar.m();
                    return new wj(q());
                }
                a72 a72Var = obj2 instanceof a72 ? (a72) obj2 : null;
                if (a72Var != null) {
                    a72Var.a(yjVar, i2 + i);
                }
                i((yjVar.e * j2) + ((long) i2));
            }
        }
    }

    @Override // defpackage.rh, defpackage.im1
    public final Object c(ks ksVar, Object obj) throws Throwable {
        if (L(obj, true) instanceof wj) {
            throw q();
        }
        return t32.a;
    }

    @Override // defpackage.rh, defpackage.im1
    public final Object t(Object obj) {
        return L(obj, false);
    }

    @Override // defpackage.rh
    public final boolean z() {
        return this.t == ph.f;
    }
}
