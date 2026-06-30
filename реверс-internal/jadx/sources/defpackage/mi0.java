package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mi0 {
    public final int a;
    public final int b;
    public final oc c;

    public mi0(int i, int i2, oc ocVar) {
        this.a = i;
        this.b = i2;
        this.c = ocVar;
        if (i < 0) {
            qg0.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        qg0.a("size should be > 0");
    }
}
