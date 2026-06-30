package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class me1 extends ye {
    public me1(ks ksVar) {
        super(ksVar);
        if (ksVar == null || ksVar.e() == d40.e) {
            return;
        }
        yc.p("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.ks
    public final lt e() {
        return d40.e;
    }
}
