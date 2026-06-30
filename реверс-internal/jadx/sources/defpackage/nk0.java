package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 {
    public static final nk0 c = new nk0(127);
    public final int a;
    public final int b;

    public nk0(int i) {
        int i2 = (i & 1) != 0 ? -1 : 1;
        int i3 = (i & 8) == 0 ? 7 : -1;
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        return this.a == nk0Var.a && this.b == nk0Var.b;
    }

    public final int hashCode() {
        return s91.b(this.b, s91.b(0, Integer.hashCode(this.a) * 961, 31), 29791);
    }

    public final String toString() {
        String strA = mk0.a(this.a);
        String strN0 = lk.n0(0);
        String strA2 = cf0.a(this.b);
        StringBuilder sbO = s91.o("KeyboardOptions(capitalization=", strA, ", autoCorrectEnabled=null, keyboardType=", strN0, ", imeAction=");
        sbO.append(strA2);
        sbO.append(", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
        return sbO.toString();
    }
}
