package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ws1 implements vs1 {
    public final xd e = new xd(0);

    public final boolean e(int i) {
        return (this.e.get() & i) != 0;
    }

    public final void f(int i) {
        xd xdVar;
        int i2;
        do {
            xdVar = this.e;
            i2 = xdVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!xdVar.compareAndSet(i2, i2 | i));
    }
}
