package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j70 extends ls {
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ xg0 j;
    public g70 k;
    public Serializable l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(xg0 xg0Var, ks ksVar) {
        super(ksVar);
        this.j = xg0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
