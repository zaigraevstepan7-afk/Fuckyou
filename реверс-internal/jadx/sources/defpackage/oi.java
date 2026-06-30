package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class oi implements xj0, Serializable {
    public transient xj0 e;
    public final Object f;
    public final Class g;
    public final String h;
    public final String i;
    public final boolean j;

    public oi(Object obj, Class cls, String str, String str2, boolean z) {
        this.f = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    public abstract xj0 d();

    public final kk e() {
        boolean z = this.j;
        Class cls = this.g;
        if (!z) {
            return ad1.a(cls);
        }
        ad1.a.getClass();
        return new z31(cls);
    }
}
