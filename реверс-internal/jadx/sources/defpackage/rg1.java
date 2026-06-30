package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg1)) {
            return false;
        }
        rg1 rg1Var = (rg1) obj;
        return Float.compare(this.a, rg1Var.a) == 0 && this.b == rg1Var.b;
    }

    public final int hashCode() {
        return s91.d(Float.hashCode(this.a) * 31, 961, this.b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
