package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c50 extends e50 {
    public final xi g;
    public final /* synthetic */ g50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c50(g50 g50Var, long j, xi xiVar) {
        super(j);
        this.h = g50Var;
        this.g = xiVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, ly, InvocationTargetException {
        this.g.H(this.h);
    }

    @Override // defpackage.e50
    public final String toString() {
        return super.toString() + this.g;
    }
}
