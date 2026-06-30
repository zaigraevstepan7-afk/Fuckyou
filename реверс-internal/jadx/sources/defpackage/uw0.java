package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 implements uu0 {
    public final tw0 a;

    public uw0(tw0 tw0Var) {
        this.a = tw0Var;
    }

    @Override // defpackage.uu0
    public final int b(pi0 pi0Var, List list, int i) {
        return this.a.e(pi0Var, el.z(pi0Var), i);
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
        return this.a.b(pi0Var, el.z(pi0Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw0) && xi0.o(this.a, ((uw0) obj).a);
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        return this.a.a(xu0Var, el.z(xu0Var), j);
    }

    @Override // defpackage.uu0
    public final int h(pi0 pi0Var, List list, int i) {
        return this.a.d(pi0Var, el.z(pi0Var), i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.uu0
    public final int j(pi0 pi0Var, List list, int i) {
        return this.a.c(pi0Var, el.z(pi0Var), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
