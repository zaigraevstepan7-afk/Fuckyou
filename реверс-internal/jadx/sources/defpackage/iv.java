package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class iv extends ls {
    public boolean h;
    public Object i;
    public zc1 j;
    public Serializable k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mv n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(mv mvVar, ls lsVar) {
        super(lsVar);
        this.n = mvVar;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return mv.f(this.n, false, this);
    }
}
