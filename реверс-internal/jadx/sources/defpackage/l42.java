package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l42 implements jt {
    public final l42 e;
    public final mv f;

    public l42(l42 l42Var, mv mvVar) {
        this.e = l42Var;
        this.f = mvVar;
    }

    public final void c(mv mvVar) {
        if (this.f == mvVar) {
            yc.l("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        l42 l42Var = this.e;
        if (l42Var != null) {
            l42Var.c(mvVar);
        }
    }

    @Override // defpackage.jt
    public final kt getKey() {
        return l91.v;
    }

    @Override // defpackage.lt
    public final /* bridge */ lt j(lt ltVar) {
        return hk.L(this, ltVar);
    }

    @Override // defpackage.lt
    public final /* bridge */ jt l(kt ktVar) {
        return hk.v(this, ktVar);
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.lt
    public final /* bridge */ lt u(kt ktVar) {
        return hk.J(this, ktVar);
    }
}
