package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cs {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public cs(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return vl.c(this.a, csVar.a) && vl.c(this.b, csVar.b) && vl.c(this.c, csVar.c) && vl.c(this.d, csVar.d) && vl.c(this.e, csVar.e);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.e) + s91.c(s91.c(s91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = vl.i(this.a);
        String strI2 = vl.i(this.b);
        String strI3 = vl.i(this.c);
        String strI4 = vl.i(this.d);
        String strI5 = vl.i(this.e);
        StringBuilder sbO = s91.o("ContextMenuColors(backgroundColor=", strI, ", textColor=", strI2, ", iconColor=");
        s91.u(sbO, strI3, ", disabledTextColor=", strI4, ", disabledIconColor=");
        sbO.append(strI5);
        sbO.append(")");
        return sbO.toString();
    }
}
