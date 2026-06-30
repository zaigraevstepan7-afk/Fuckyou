package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d31 {
    public final int a;
    public final int b;

    public /* synthetic */ d31(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var);

    public jb0 b(ll llVar) {
        return null;
    }

    public final String toString() {
        String strC = ad1.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public d31(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
