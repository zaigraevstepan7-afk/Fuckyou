package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a40 implements if0 {
    public final boolean e;

    public a40(boolean z) {
        this.e = z;
    }

    @Override // defpackage.if0
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.if0
    public final e01 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
