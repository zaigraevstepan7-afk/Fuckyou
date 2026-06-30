package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rh0 extends ph0 {
    public static final rh0 h = new rh0(1, 0, 1);

    @Override // defpackage.ph0
    public final boolean equals(Object obj) {
        if (!(obj instanceof rh0)) {
            return false;
        }
        if (isEmpty() && ((rh0) obj).isEmpty()) {
            return true;
        }
        rh0 rh0Var = (rh0) obj;
        return this.e == rh0Var.e && this.f == rh0Var.f;
    }

    @Override // defpackage.ph0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f;
    }

    @Override // defpackage.ph0
    public final boolean isEmpty() {
        return this.e > this.f;
    }

    @Override // defpackage.ph0
    public final String toString() {
        return this.e + ".." + this.f;
    }
}
