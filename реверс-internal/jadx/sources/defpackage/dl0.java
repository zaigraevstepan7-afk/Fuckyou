package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class dl0 extends xv0 {
    public final Object a;

    public dl0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        el0 el0Var = new el0();
        el0Var.s = this.a;
        return el0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl0) && this.a.equals(((dl0) obj).a);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ((el0) sv0Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ")";
    }
}
