package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends ef1 {
    public final int a;

    public i3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i3) && ((i3) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
