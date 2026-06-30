package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 {
    public tp a;
    public int b;
    public jb0 c;
    public wa0 d;
    public int e;
    public ox0 f;
    public zx0 g;

    public dc1(tp tpVar) {
        this.a = tpVar;
    }

    public final boolean a() {
        if (this.a != null) {
            jb0 jb0Var = this.c;
            if (jb0Var != null ? jb0Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final ij0 b(Object obj) {
        ij0 ij0VarS;
        tp tpVar = this.a;
        return (tpVar == null || (ij0VarS = tpVar.s(this, obj)) == null) ? ij0.e : ij0VarS;
    }

    public final void c() {
        tp tpVar = this.a;
        if (tpVar != null) {
            tpVar.s = true;
            tpVar.x.l();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
