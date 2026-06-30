package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb0 implements Cloneable {
    public final xb0 e;
    public xb0 f;

    public vb0(xb0 xb0Var) {
        this.e = xb0Var;
        if (xb0Var.g()) {
            yc.p("Default instance must be immutable.");
            throw null;
        }
        this.f = xb0Var.i();
    }

    public final xb0 a() {
        xb0 xb0VarB = b();
        xb0VarB.getClass();
        if (xb0.f(xb0VarB, true)) {
            return xb0VarB;
        }
        throw new r32();
    }

    public final xb0 b() {
        boolean zG = this.f.g();
        xb0 xb0Var = this.f;
        if (!zG) {
            return xb0Var;
        }
        xb0Var.getClass();
        lb1 lb1Var = lb1.c;
        lb1Var.getClass();
        lb1Var.a(xb0Var.getClass()).c(xb0Var);
        xb0Var.h();
        return this.f;
    }

    public final void c() {
        if (this.f.g()) {
            return;
        }
        xb0 xb0VarI = this.e.i();
        xb0 xb0Var = this.f;
        lb1 lb1Var = lb1.c;
        lb1Var.getClass();
        lb1Var.a(xb0VarI.getClass()).b(xb0VarI, xb0Var);
        this.f = xb0VarI;
    }

    public final Object clone() {
        vb0 vb0Var = (vb0) this.e.c(5);
        vb0Var.f = b();
        return vb0Var;
    }
}
