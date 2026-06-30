package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mn {
    public final Object a;
    public final si b;
    public final xa0 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ mn(Object obj, si siVar, xa0 xa0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : siVar, (i & 4) != 0 ? null : xa0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static mn a(mn mnVar, si siVar, Throwable th, int i) {
        Object obj = mnVar.a;
        if ((i & 2) != 0) {
            siVar = mnVar.b;
        }
        si siVar2 = siVar;
        xa0 xa0Var = mnVar.c;
        Object obj2 = mnVar.d;
        if ((i & 16) != 0) {
            th = mnVar.e;
        }
        return new mn(obj, siVar2, xa0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return xi0.o(this.a, mnVar.a) && xi0.o(this.b, mnVar.b) && xi0.o(this.c, mnVar.c) && xi0.o(this.d, mnVar.d) && xi0.o(this.e, mnVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        si siVar = this.b;
        int iHashCode2 = (iHashCode + (siVar == null ? 0 : siVar.hashCode())) * 31;
        xa0 xa0Var = this.c;
        int iHashCode3 = (iHashCode2 + (xa0Var == null ? 0 : xa0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public mn(Object obj, si siVar, xa0 xa0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = siVar;
        this.c = xa0Var;
        this.d = obj2;
        this.e = th;
    }
}
