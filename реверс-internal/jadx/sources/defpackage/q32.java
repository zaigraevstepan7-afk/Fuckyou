package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q32 {
    public n81 a;
    public n81 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(az1 az1Var) {
        n81 n81Var;
        hb hbVar = az1Var.a;
        this.e = false;
        n81 n81Var2 = this.a;
        if (az1Var.equals(n81Var2 != null ? (az1) n81Var2.c : null)) {
            return;
        }
        String str = hbVar.f;
        n81 n81Var3 = this.a;
        boolean zO = xi0.o(str, n81Var3 != null ? ((az1) n81Var3.c).a.f : null);
        n81 n81Var4 = this.a;
        if (zO) {
            if (n81Var4 != null) {
                n81Var4.c = az1Var;
                return;
            }
            return;
        }
        this.a = new n81(9, n81Var4, az1Var);
        this.b = null;
        int length = hbVar.f.length() + this.c;
        this.c = length;
        if (length > 100000) {
            n81 n81Var5 = this.a;
            if ((n81Var5 != null ? (n81) n81Var5.b : null) == null) {
                return;
            }
            while (true) {
                if (n81Var5 == null) {
                    n81Var = null;
                } else {
                    n81 n81Var6 = (n81) n81Var5.b;
                    if (n81Var6 != null) {
                        n81Var = (n81) n81Var6.b;
                    }
                }
                if (n81Var == null) {
                    break;
                } else {
                    n81Var5 = (n81) n81Var5.b;
                }
            }
            if (n81Var5 != null) {
                n81Var5.b = null;
            }
        }
    }
}
