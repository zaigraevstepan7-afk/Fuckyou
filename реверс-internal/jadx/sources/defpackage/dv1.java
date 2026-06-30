package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends ls {
    public /* synthetic */ Object h;
    public final /* synthetic */ ev1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv1(ev1 ev1Var, ls lsVar) {
        super(lsVar);
        this.i = ev1Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.i(0L, null, this);
    }
}
