package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l01 {
    public final bk1 a;
    public final wa0 b;
    public hx c;
    public boolean d;
    public final xg0 e = new xg0(8);

    public l01(bk1 bk1Var, wa0 wa0Var, hx hxVar) {
        this.a = bk1Var;
        this.b = wa0Var;
        this.c = hxVar;
    }

    public static void a(e81 e81Var) {
        List list = e81Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((l81) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wa0 wa0Var, ls lsVar) {
        k01 k01Var;
        if (lsVar instanceof k01) {
            k01Var = (k01) lsVar;
            int i = k01Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                k01Var.j = i - Integer.MIN_VALUE;
            } else {
                k01Var = new k01(this, lsVar);
            }
        }
        Object obj = k01Var.h;
        int i2 = k01Var.j;
        ks ksVar = null;
        if (i2 == 0) {
            xc.G(obj);
            this.d = true;
            e eVar = new e(this, wa0Var, ksVar, 24);
            k01Var.j = 1;
            lt ltVar = k01Var.f;
            ltVar.getClass();
            pu1 pu1Var = new pu1(k01Var, ltVar);
            Object objD = kd1.D(pu1Var, true, pu1Var, eVar);
            wt wtVar = wt.e;
            if (objD == wtVar) {
                return wtVar;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
        }
        this.d = false;
        return t32.a;
    }
}
