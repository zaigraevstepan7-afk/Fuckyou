package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nh implements cz1 {
    public final mh a;
    public final float b;

    public nh(mh mhVar, float f) {
        this.a = mhVar;
        this.b = f;
    }

    @Override // defpackage.cz1
    public final float a() {
        return this.b;
    }

    @Override // defpackage.cz1
    public final long b() {
        int i = vl.h;
        return vl.g;
    }

    @Override // defpackage.cz1
    public final lh c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        return xi0.o(this.a, nhVar.a) && Float.compare(this.b, nhVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
