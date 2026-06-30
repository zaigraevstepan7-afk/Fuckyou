package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zl1 {
    public final String a;
    public final wa0 b;
    public final boolean c;

    public zl1(String str, wa0 wa0Var) {
        this.a = str;
        this.b = wa0Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ zl1(String str) {
        this(str, xl1.h);
    }

    public zl1(String str, int i) {
        this(str);
        this.c = true;
    }

    public zl1(String str, boolean z, wa0 wa0Var) {
        this(str, wa0Var);
        this.c = z;
    }
}
