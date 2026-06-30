package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class az1 {
    public final hb a;
    public final long b;
    public final wz1 c;

    public az1(hb hbVar, long j, wz1 wz1Var) {
        wz1 wz1Var2;
        this.a = hbVar;
        this.b = af1.n(hbVar.f.length(), j);
        if (wz1Var != null) {
            wz1Var2 = new wz1(af1.n(hbVar.f.length(), wz1Var.a));
        } else {
            wz1Var2 = null;
        }
        this.c = wz1Var2;
    }

    public static az1 a(az1 az1Var, hb hbVar, long j, int i) {
        if ((i & 1) != 0) {
            hbVar = az1Var.a;
        }
        if ((i & 2) != 0) {
            j = az1Var.b;
        }
        wz1 wz1Var = (i & 4) != 0 ? az1Var.c : null;
        az1Var.getClass();
        return new az1(hbVar, j, wz1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az1)) {
            return false;
        }
        az1 az1Var = (az1) obj;
        return wz1.b(this.b, az1Var.b) && xi0.o(this.c, az1Var.c) && xi0.o(this.a, az1Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = wz1.c;
        int iC = s91.c(iHashCode, 31, this.b);
        wz1 wz1Var = this.c;
        return iC + (wz1Var != null ? Long.hashCode(wz1Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + wz1.h(this.b) + ", composition=" + this.c + ")";
    }

    public az1(String str, long j, int i) {
        this(new hb((i & 1) != 0 ? "" : str), (i & 2) != 0 ? wz1.b : j, (wz1) null);
    }
}
