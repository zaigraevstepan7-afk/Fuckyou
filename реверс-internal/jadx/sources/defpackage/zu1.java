package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class zu1 extends ls implements gb0 {
    public final int h;

    public zu1(int i, ks ksVar) {
        super(ksVar);
        this.h = i;
    }

    @Override // defpackage.gb0
    public final int c() {
        return this.h;
    }

    @Override // defpackage.ye
    public final String toString() {
        if (this.e != null) {
            return super.toString();
        }
        ad1.a.getClass();
        return bd1.a(this);
    }
}
