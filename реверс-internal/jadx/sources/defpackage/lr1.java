package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 implements e52 {
    public final e52 e;
    public final long f;

    public lr1(e52 e52Var, long j) {
        this.e = e52Var;
        this.f = j;
    }

    @Override // defpackage.e52
    public final boolean a() {
        return this.e.a();
    }

    @Override // defpackage.e52
    public final long b(cb cbVar, cb cbVar2, cb cbVar3) {
        return this.e.b(cbVar, cbVar2, cbVar3) + this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lr1)) {
            return false;
        }
        lr1 lr1Var = (lr1) obj;
        return lr1Var.f == this.f && xi0.o(lr1Var.e, this.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    @Override // defpackage.e52
    public final cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        long j2 = this.f;
        return j < j2 ? cbVar3 : this.e.l(j - j2, cbVar, cbVar2, cbVar3);
    }

    @Override // defpackage.e52
    public final cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        long j2 = this.f;
        return j < j2 ? cbVar : this.e.o(j - j2, cbVar, cbVar2, cbVar3);
    }
}
