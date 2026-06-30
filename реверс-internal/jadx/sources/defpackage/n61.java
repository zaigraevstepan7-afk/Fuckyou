package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n61 extends o0 implements gf0, Collection, yj0 {
    public static final n61 h;
    public final Object e;
    public final Object f;
    public final c61 g;

    static {
        v20 v20Var = v20.J;
        h = new n61(v20Var, v20Var, c61.g);
    }

    public n61(Object obj, Object obj2, c61 c61Var) {
        this.e = obj;
        this.f = obj2;
        this.g = c61Var;
    }

    @Override // defpackage.o
    public final int a() {
        return this.g.f;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new yb0(this.e, this.g);
    }
}
