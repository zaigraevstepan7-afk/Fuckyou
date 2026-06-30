package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj0 extends es0 implements az, if0 {
    public vj0 k;

    @Override // defpackage.az
    public final void a() {
        q().e0(this);
    }

    @Override // defpackage.if0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.if0
    public final e01 d() {
        return null;
    }

    public oj0 getParent() {
        return q();
    }

    public final vj0 q() {
        vj0 vj0Var = this.k;
        if (vj0Var != null) {
            return vj0Var;
        }
        xi0.K("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.es0
    public final String toString() {
        return getClass().getSimpleName() + '@' + pv.n(this) + "[job@" + pv.n(q()) + ']';
    }
}
