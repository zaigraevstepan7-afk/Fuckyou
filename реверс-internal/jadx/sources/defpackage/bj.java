package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bj implements jt, kt {
    public static final l91 f = new l91(25);
    public static final bj g = new bj(1);
    public final /* synthetic */ int e;

    public /* synthetic */ bj(int i) {
        this.e = i;
    }

    @Override // defpackage.jt
    public final kt getKey() {
        switch (this.e) {
            case 0:
                return f;
            default:
                return this;
        }
    }

    @Override // defpackage.lt
    public final /* bridge */ lt j(lt ltVar) {
        switch (this.e) {
        }
        return hk.L(this, ltVar);
    }

    @Override // defpackage.lt
    public final /* bridge */ jt l(kt ktVar) {
        switch (this.e) {
        }
        return hk.v(this, ktVar);
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        switch (this.e) {
        }
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.lt
    public final /* bridge */ lt u(kt ktVar) {
        switch (this.e) {
        }
        return hk.J(this, ktVar);
    }
}
