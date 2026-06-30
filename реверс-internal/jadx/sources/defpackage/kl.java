package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class kl {
    public int e;
    public Object f;

    public kl(int i) {
        this.e = i;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() throws fj0 {
        int iZ;
        do {
            iZ = z();
            if (iZ == 0) {
                return;
            }
            int i = this.e;
            if (i >= 100) {
                throw new fj0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.e = i + 1;
            this.e--;
        } while (C(iZ));
    }

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract p82 g(p82 p82Var, List list);

    public abstract n81 h(t72 t72Var, n81 n81Var);

    public abstract void i(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract ji l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void e(t72 t72Var) {
    }

    public void f(t72 t72Var) {
    }
}
