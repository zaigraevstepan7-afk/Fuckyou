package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends nu0 {
    @Override // defpackage.nu0
    public final void G(m0 m0Var, m0 m0Var2) {
        m0Var.b = m0Var2;
    }

    @Override // defpackage.nu0
    public final void H(m0 m0Var, Thread thread) {
        m0Var.a = thread;
    }

    @Override // defpackage.nu0
    public final boolean k(n0 n0Var, j0 j0Var) {
        j0 j0Var2 = j0.b;
        synchronized (n0Var) {
            try {
                if (n0Var.f != j0Var) {
                    return false;
                }
                n0Var.f = j0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nu0
    public final boolean l(n0 n0Var, Object obj, Object obj2) {
        synchronized (n0Var) {
            try {
                if (n0Var.e != obj) {
                    return false;
                }
                n0Var.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nu0
    public final boolean m(n0 n0Var, m0 m0Var, m0 m0Var2) {
        synchronized (n0Var) {
            try {
                if (n0Var.g != m0Var) {
                    return false;
                }
                n0Var.g = m0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
