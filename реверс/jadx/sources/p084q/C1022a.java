package p084q;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1022a extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1027f f4078a;

    public C1022a(C1027f c1027f) {
        this.f4078a = c1027f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1025d(this.f4078a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4078a.f4104c;
    }
}
