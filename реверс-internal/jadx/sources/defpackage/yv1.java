package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 implements sa {
    public final e52 a;
    public final r22 b;
    public final Object c;
    public final Object d;
    public final cb e;
    public final cb f;
    public final cb g;
    public long h;
    public cb i;

    public yv1(wa waVar, r22 r22Var, Object obj, Object obj2, cb cbVar) {
        this.a = waVar.a(r22Var);
        this.b = r22Var;
        this.c = obj2;
        this.d = obj;
        this.e = (cb) r22Var.a.i(obj);
        sa0 sa0Var = r22Var.a;
        this.f = (cb) sa0Var.i(obj2);
        this.g = cbVar != null ? xi0.v(cbVar) : ((cb) sa0Var.i(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.sa
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.sa
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        cb cbVarO = this.a.o(j, this.e, this.f, this.g);
        int iB = cbVarO.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(cbVarO.a(i))) {
                g91.b("AnimationVector cannot contain a NaN. " + cbVarO + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.i(cbVarO);
    }

    @Override // defpackage.sa
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.sa
    public final r22 d() {
        return this.b;
    }

    @Override // defpackage.sa
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.sa
    public final cb f(long j) {
        if (!g(j)) {
            return this.a.l(j, this.e, this.f, this.g);
        }
        cb cbVar = this.i;
        if (cbVar != null) {
            return cbVar;
        }
        cb cbVarP = this.a.p(this.e, this.f, this.g);
        this.i = cbVarP;
        return cbVarP;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
