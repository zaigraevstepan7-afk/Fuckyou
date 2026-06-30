package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zc1 f;

    public /* synthetic */ rk(int i, zc1 zc1Var) {
        this.e = i;
        this.f = zc1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        boolean z;
        int i = this.e;
        zc1 zc1Var = this.f;
        switch (i) {
            case 0:
                ac0 ac0Var = (ac0) obj;
                if (xi0.o(ac0Var.r0(), "waiting")) {
                    zc1Var.e = ac0Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                i22 i22Var = (i22) obj;
                i22Var.getClass();
                bn0 bn0Var = ((k22) i22Var).s;
                List listK = (List) zc1Var.e;
                if (listK != null) {
                    listK.add(bn0Var);
                } else {
                    listK = hk.K(bn0Var);
                }
                zc1Var.e = listK;
                return h22.f;
        }
    }
}
