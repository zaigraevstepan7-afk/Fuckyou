package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 {
    public final xk a;
    public final List b;
    public final List c;
    public final int d;
    public aq0 e;

    public zy0(xk xkVar, List list, List list2, int i) {
        this.a = xkVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        if (this.e == null) {
            aq0 aq0VarN = hk.n();
            aq0VarN.addAll(this.b);
            xk xkVar = this.a;
            if (xkVar != null) {
                aq0VarN.add(xkVar);
            }
            aq0VarN.addAll(this.c);
            this.e = hk.k(aq0VarN);
        }
        aq0 aq0Var = this.e;
        aq0Var.getClass();
        return aq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy0.class != obj.getClass()) {
            return false;
        }
        zy0 zy0Var = (zy0) obj;
        return this.d == zy0Var.d && a().equals(zy0Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zy0() {
        f40 f40Var = f40.e;
        this(null, f40Var, f40Var, -1);
    }
}
