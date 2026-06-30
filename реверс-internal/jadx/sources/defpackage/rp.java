package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rp implements e31, jt {
    public static final l91 f = new l91(29);
    public final ob0 e;

    public rp(ob0 ob0Var) {
        this.e = ob0Var;
    }

    @Override // defpackage.e31
    public final List d(Integer num) {
        return this.e.D();
    }

    @Override // defpackage.e31
    public final boolean g() {
        return this.e.C;
    }

    @Override // defpackage.jt
    public final kt getKey() {
        return f;
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
