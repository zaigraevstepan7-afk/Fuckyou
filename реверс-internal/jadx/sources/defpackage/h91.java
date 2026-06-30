package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h91 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wa0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h91(wa0 wa0Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = wa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        wx0 wx0Var = (wx0) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((h91) o(ksVar, wx0Var)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        wa0 wa0Var = this.l;
        switch (i) {
            case 0:
                h91 h91Var = new h91(wa0Var, ksVar, 0);
                h91Var.k = obj;
                return h91Var;
            default:
                h91 h91Var2 = new h91(wa0Var, ksVar, 1);
                h91Var2.k = obj;
                return h91Var2;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        wa0 wa0Var = this.l;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    wx0 wx0Var = (wx0) this.k;
                    this.j = 1;
                    obj = wa0Var.h(wx0Var, this);
                    if (obj == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i2 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                wx0 wx0Var2 = (wx0) obj;
                wx0Var2.getClass();
                ((AtomicBoolean) wx0Var2.b.f).set(true);
                return wx0Var2;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    wx0 wx0Var3 = new wx0(new LinkedHashMap(((wx0) this.k).a()), false);
                    this.k = wx0Var3;
                    this.j = 1;
                    return wa0Var.h(wx0Var3, this) == wtVar ? wtVar : wx0Var3;
                }
                if (i3 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wx0 wx0Var4 = (wx0) this.k;
                xc.G(obj);
                return wx0Var4;
        }
    }
}
