package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e22 {
    public final p50 a;
    public final mi1 b;
    public final boolean c;
    public final Map d;

    public /* synthetic */ e22(p50 p50Var, wi0 wi0Var, mi1 mi1Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : p50Var, (i & 4) != 0 ? null : wi0Var, (i & 8) != 0 ? null : mi1Var, (i & 32) == 0, (i & 64) != 0 ? g40.e : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e22)) {
            return false;
        }
        e22 e22Var = (e22) obj;
        return xi0.o(this.a, e22Var.a) && xi0.o(null, null) && xi0.o(this.b, e22Var.b) && this.c == e22Var.c && xi0.o(this.d, e22Var.d);
    }

    public final int hashCode() {
        p50 p50Var = this.a;
        int iHashCode = (((p50Var == null ? 0 : p50Var.hashCode()) * 961) + 0) * 31;
        mi1 mi1Var = this.b;
        return this.d.hashCode() + s91.d((iHashCode + (mi1Var != null ? mi1Var.hashCode() : 0)) * 961, 31, this.c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=" + ((Object) null) + ", scale=" + this.b + ", veil=null, hold=" + this.c + ", effectsMap=" + this.d + ")";
    }

    public e22(p50 p50Var, wi0 wi0Var, mi1 mi1Var, boolean z, Map map) {
        this.a = p50Var;
        this.b = mi1Var;
        this.c = z;
        this.d = map;
    }
}
