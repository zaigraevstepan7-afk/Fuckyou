package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a61 extends e61 {
    public b61 k;

    @Override // defpackage.e61, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof nb1) {
            return super.containsKey((nb1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof s42) {
            return super.containsValue((s42) obj);
        }
        return false;
    }

    @Override // defpackage.e61
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final b61 b() {
        m22 m22Var = this.g;
        b61 b61Var = this.k;
        if (m22Var != b61Var.e) {
            this.f = new wr(25);
            b61Var = new b61(this.g, this.j);
        }
        this.k = b61Var;
        return b61Var;
    }

    @Override // defpackage.e61, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof nb1) {
            return (s42) super.get((nb1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof nb1) ? obj2 : (s42) super.getOrDefault((nb1) obj, (s42) obj2);
    }

    @Override // defpackage.e61, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof nb1) {
            return (s42) super.remove((nb1) obj);
        }
        return null;
    }
}
