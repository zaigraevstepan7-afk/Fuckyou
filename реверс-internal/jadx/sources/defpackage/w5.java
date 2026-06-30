package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w5 {
    public final Context a;
    public final hx b;
    public final long c;
    public final c41 d;

    public w5(Context context, hx hxVar, long j, c41 c41Var) {
        this.a = context;
        this.b = hxVar;
        this.c = j;
        this.d = c41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        w5 w5Var = (w5) obj;
        return xi0.o(this.a, w5Var.a) && xi0.o(this.b, w5Var.b) && vl.c(this.c, w5Var.c) && xi0.o(this.d, w5Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = vl.h;
        return this.d.hashCode() + s91.c(iHashCode, 31, this.c);
    }
}
