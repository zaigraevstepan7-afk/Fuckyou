package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pj0 extends CancellationException {
    public final transient vj0 e;

    public pj0(String str, Throwable th, vj0 vj0Var) {
        super(str);
        this.e = vj0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        if (!xi0.o(pj0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = pj0Var.e;
        if (obj2 == null) {
            obj2 = i01.f;
        }
        Object obj3 = this.e;
        if (obj3 == null) {
            obj3 = i01.f;
        }
        return xi0.o(obj2, obj3) && xi0.o(pj0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.e;
        if (obj == null) {
            obj = i01.f;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.e;
        if (obj == null) {
            obj = i01.f;
        }
        sb.append(obj);
        return sb.toString();
    }
}
