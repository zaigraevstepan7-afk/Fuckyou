package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk0 implements gb0, Serializable {
    public final int e;

    public sk0(int i) {
        this.e = i;
    }

    @Override // defpackage.gb0
    public final int c() {
        return this.e;
    }

    public final String toString() {
        ad1.a.getClass();
        return bd1.a(this);
    }
}
