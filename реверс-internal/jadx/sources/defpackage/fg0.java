package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 implements wa {
    public final a20 a;
    public final sd1 b;

    public fg0(a20 a20Var, sd1 sd1Var) {
        this.a = a20Var;
        this.b = sd1Var;
        if (a20Var instanceof q22) {
            q22 q22Var = (q22) a20Var;
            if (q22Var.a != 0 || q22Var.b != 0) {
                return;
            }
        } else if (!(a20Var instanceof rp1)) {
            return;
        }
        yc.p("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.wa
    public final e52 a(r22 r22Var) {
        return new i52(this.a.a(r22Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fg0)) {
            return false;
        }
        fg0 fg0Var = (fg0) obj;
        return fg0Var.a.equals(this.a) && fg0Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
