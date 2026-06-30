package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b61 extends c61 implements xp, up {
    public static final b61 h = new b61(m22.e, 0);

    @Override // defpackage.up
    public final Object B(nb1 nb1Var) {
        return xk.I(this, nb1Var);
    }

    @Override // defpackage.c61
    public final e61 a() {
        a61 a61Var = new a61(this);
        a61Var.k = this;
        return a61Var;
    }

    @Override // defpackage.c61
    public final e61 b() {
        a61 a61Var = new a61(this);
        a61Var.k = this;
        return a61Var;
    }

    @Override // defpackage.c61, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof nb1) {
            return super.containsKey((nb1) obj);
        }
        return false;
    }

    @Override // defpackage.c61, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof s42) {
            return super.containsValue((s42) obj);
        }
        return false;
    }

    public final b61 d(nb1 nb1Var, s42 s42Var) {
        qn qnVarU = this.e.u(nb1Var.hashCode(), 0, nb1Var, s42Var);
        return qnVarU == null ? this : new b61((m22) qnVarU.b, this.f + qnVarU.a);
    }

    @Override // defpackage.c61, java.util.Map
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
}
