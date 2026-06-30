package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g61 extends d0 {
    public final /* synthetic */ int e;
    public final e61 f;

    public /* synthetic */ g61(int i, e61 e61Var) {
        this.e = i;
        this.f = e61Var;
    }

    @Override // defpackage.d0
    public final int a() {
        switch (this.e) {
        }
        return this.f.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.f.clear();
                break;
            default:
                this.f.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e61 e61Var = this.f;
                Object obj2 = e61Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && e61Var.containsKey(entry.getKey());
            default:
                return this.f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new h61(this.f);
            default:
                n22[] n22VarArr = new n22[8];
                for (int i = 0; i < 8; i++) {
                    n22VarArr[i] = new o22(1);
                }
                return new i61(this.f, n22VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f.remove(entry.getKey(), entry.getValue());
            default:
                e61 e61Var = this.f;
                if (!e61Var.containsKey(obj)) {
                    return false;
                }
                e61Var.remove(obj);
                return true;
        }
    }
}
