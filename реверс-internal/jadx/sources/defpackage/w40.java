package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w40 {
    public static final w40 b = new w40(new e22((p50) null, (wi0) null, (mi1) null, (LinkedHashMap) null, 127));
    public final e22 a;

    public w40(e22 e22Var) {
        this.a = e22Var;
    }

    public final w40 a(w40 w40Var) {
        e22 e22Var = w40Var.a;
        p50 p50Var = e22Var.a;
        e22 e22Var2 = this.a;
        if (p50Var == null) {
            p50Var = e22Var2.a;
        }
        mi1 mi1Var = e22Var.b;
        if (mi1Var == null) {
            mi1Var = e22Var2.b;
        }
        Map map = e22Var2.d;
        Map map2 = e22Var.d;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new w40(new e22(p50Var, (wi0) null, mi1Var, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w40) && ((w40) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        e22 e22Var = this.a;
        p50 p50Var = e22Var.a;
        String string = p50Var != null ? p50Var.toString() : null;
        mi1 mi1Var = e22Var.b;
        String string2 = mi1Var != null ? mi1Var.toString() : null;
        StringBuilder sbO = s91.o("EnterTransition: \nFade - ", string, ",\nSlide - null,\nShrink - ", null, ",\nScale - ");
        sbO.append(string2);
        return sbO.toString();
    }
}
