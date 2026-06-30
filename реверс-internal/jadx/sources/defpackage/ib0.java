package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface ib0 extends f70 {
    static /* synthetic */ f70 i(ib0 ib0Var, lt ltVar, int i, ph phVar, int i2) {
        if ((i2 & 1) != 0) {
            ltVar = d40.e;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            phVar = ph.e;
        }
        return ib0Var.e(ltVar, i, phVar);
    }

    f70 e(lt ltVar, int i, ph phVar);
}
