package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e50 implements Runnable, Comparable, az {
    private volatile Object _heap;
    public long e;
    public int f = -1;

    public e50(long j) {
        this.e = j;
    }

    @Override // defpackage.az
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                s30 s30Var = nu0.h;
                if (obj == s30Var) {
                    return;
                }
                f50 f50Var = obj instanceof f50 ? (f50) obj : null;
                if (f50Var != null) {
                    synchronized (f50Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof n02 ? (n02) obj2 : null) != null) {
                            f50Var.b(this.f);
                        }
                    }
                }
                this._heap = s30Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, f50 f50Var, g50 g50Var) {
        synchronized (this) {
            if (this._heap == nu0.h) {
                return 2;
            }
            synchronized (f50Var) {
                try {
                    e50[] e50VarArr = f50Var.a;
                    e50 e50Var = e50VarArr != null ? e50VarArr[0] : null;
                    if (g50.m.get(g50Var) == 1) {
                        return 1;
                    }
                    if (e50Var == null) {
                        f50Var.c = j;
                    } else {
                        long j2 = e50Var.e;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - f50Var.c > 0) {
                            f50Var.c = j;
                        }
                    }
                    long j3 = this.e;
                    long j4 = f50Var.c;
                    if (j3 - j4 < 0) {
                        this.e = j4;
                    }
                    f50Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.e - ((e50) obj).e;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(f50 f50Var) {
        if (this._heap != nu0.h) {
            this._heap = f50Var;
        } else {
            yc.p("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.e + ']';
    }
}
