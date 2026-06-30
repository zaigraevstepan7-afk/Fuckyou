package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class e61 extends AbstractMap implements Map, ak0 {
    public c61 e;
    public wr f = new wr(25);
    public m22 g;
    public Object h;
    public int i;
    public int j;

    public e61(c61 c61Var) {
        this.e = c61Var;
        this.g = c61Var.e;
        this.j = c61Var.f;
    }

    /* JADX INFO: renamed from: a */
    public c61 b() {
        m22 m22Var = this.g;
        c61 c61Var = this.e;
        if (m22Var != c61Var.e) {
            this.f = new wr(25);
            c61Var = new c61(this.g, this.j);
        }
        this.e = c61Var;
        return c61Var;
    }

    public /* bridge */ c61 b() {
        return b();
    }

    public final void c(int i) {
        this.j = i;
        this.i++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g = m22.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.g.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g61(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.g.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g61(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.h = null;
        this.g = this.g.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c61 c61VarA = null;
        c61 c61Var = map instanceof c61 ? (c61) map : null;
        if (c61Var == null) {
            e61 e61Var = map instanceof e61 ? (e61) map : null;
            if (e61Var != null) {
                c61VarA = e61Var.b();
            }
        } else {
            c61VarA = c61Var;
        }
        if (c61VarA == null) {
            super.putAll(map);
            return;
        }
        gx gxVar = new gx();
        gxVar.a = 0;
        int i = this.j;
        m22 m22Var = this.g;
        m22 m22Var2 = c61VarA.e;
        m22Var2.getClass();
        this.g = m22Var.m(m22Var2, 0, gxVar, this);
        int i2 = (c61VarA.f + i) - gxVar.a;
        if (i != i2) {
            c(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.j;
        m22 m22VarO = this.g.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (m22VarO == null) {
            m22VarO = m22.e;
        }
        this.g = m22VarO;
        return i != this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j61(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.h = null;
        m22 m22VarN = this.g.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (m22VarN == null) {
            m22VarN = m22.e;
        }
        this.g = m22VarN;
        return this.h;
    }
}
