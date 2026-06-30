package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j50 {
    public static final j50 b = new j50(new e22((p50) null, (wi0) null, (mi1) null, (LinkedHashMap) null, 127));
    public static final j50 c = new j50(new e22((p50) null, (wi0) null, (mi1) null, (LinkedHashMap) null, 95));
    public final e22 a;

    public j50(e22 e22Var) {
        this.a = e22Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j50) && ((j50) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        e22 e22Var = this.a;
        p50 p50Var = e22Var.a;
        String string = p50Var != null ? p50Var.toString() : null;
        mi1 mi1Var = e22Var.b;
        String string2 = mi1Var != null ? mi1Var.toString() : null;
        boolean z = e22Var.c;
        StringBuilder sbO = s91.o("ExitTransition: \nFade - ", string, ",\nSlide - null,\nShrink - ", null, ",\nScale - ");
        sbO.append(string2);
        sbO.append(",\nKeepUntilTransitionsFinished - ");
        sbO.append(z);
        return sbO.toString();
    }
}
