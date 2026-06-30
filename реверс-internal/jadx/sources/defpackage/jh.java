package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jh extends le {
    public xi a;
    public sa0 b;

    @Override // defpackage.le
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.le
    public final void b(Throwable th) throws IllegalAccessException, ly, InvocationTargetException {
        xi xiVar = this.a;
        if (xiVar != null) {
            xiVar.g(xc.p(th));
        }
    }
}
