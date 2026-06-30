package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 implements Map.Entry, zj0 {
    public final Object e;
    public Object f;
    public final /* synthetic */ us1 g;

    public ts1(us1 us1Var) {
        this.g = us1Var;
        Map.Entry entry = us1Var.h;
        entry.getClass();
        this.e = entry.getKey();
        Map.Entry entry2 = us1Var.h;
        entry2.getClass();
        this.f = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        us1 us1Var = this.g;
        oq1 oq1Var = us1Var.e;
        if (oq1Var.e().d != us1Var.g) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f;
        oq1Var.put(this.e, obj);
        this.f = obj;
        return obj2;
    }
}
