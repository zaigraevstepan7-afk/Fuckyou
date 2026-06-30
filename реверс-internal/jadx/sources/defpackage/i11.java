package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i11 extends yy0 {
    public final pe d;
    public boolean e;

    public i11(pe peVar, j11 j11Var) {
        boolean z = peVar.b;
        this.a = j11Var;
        this.b = z;
        this.d = peVar;
        this.e = true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    @Override // defpackage.yy0
    public final void b() {
        switch (this.d.d) {
        }
    }

    @Override // defpackage.yy0
    public final void c() {
        pe peVar = this.d;
        switch (peVar.d) {
            case 0:
                ((ro) peVar.e).c.a();
                break;
            default:
                ((j5) peVar.e).i(peVar);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    @Override // defpackage.yy0
    public final void d(vy0 vy0Var) {
        new ne(vy0Var);
        switch (this.d.d) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    @Override // defpackage.yy0
    public final void e(vy0 vy0Var) {
        vy0Var.getClass();
        new ne(vy0Var);
        switch (this.d.d) {
        }
    }

    public final void h(boolean z) {
        this.e = z;
        g(z && this.d.b);
    }
}
