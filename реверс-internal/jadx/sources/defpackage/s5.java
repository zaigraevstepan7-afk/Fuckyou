package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s5 extends ls {
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v5 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(v5 v5Var, ls lsVar) {
        super(lsVar);
        this.j = v5Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, null, this);
    }
}
