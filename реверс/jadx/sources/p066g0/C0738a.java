package p066g0;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0738a {

    /* JADX INFO: renamed from: a */
    public int f2918a;

    /* JADX INFO: renamed from: b */
    public int f2919b;

    /* JADX INFO: renamed from: c */
    public int f2920c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0738a)) {
                return false;
            }
            C0738a c0738a = (C0738a) obj;
            int i2 = this.f2918a;
            if (i2 != c0738a.f2918a) {
                return false;
            }
            if (i2 != 8 || Math.abs(this.f2920c - this.f2919b) != 1 || this.f2920c != c0738a.f2919b || this.f2919b != c0738a.f2920c) {
                return this.f2920c == c0738a.f2920c && this.f2919b == c0738a.f2919b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2918a * 31) + this.f2919b) * 31) + this.f2920c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f2918a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2919b);
        sb.append("c:");
        sb.append(this.f2920c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
