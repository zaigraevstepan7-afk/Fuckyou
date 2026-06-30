package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h7 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v81 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(v81 v81Var, int i) {
        super(1);
        this.f = i;
        this.g = v81Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        t32 t32Var = t32.a;
        v81 v81Var = this.g;
        switch (i) {
            case 0:
                zk0 zk0VarJ = ((zk0) obj).j();
                zk0VarJ.getClass();
                v81Var.r(zk0VarJ);
                break;
            case 1:
                v81Var.m1960setPopupContentSizefhxjrPA(new vh0(((vh0) obj).a));
                v81Var.s();
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                v81Var.E = (h11) obj;
                break;
            default:
                ha0 ha0Var = (ha0) obj;
                Handler handler = v81Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = v81Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new r3(ha0Var, 3));
                    }
                } else {
                    ha0Var.a();
                }
                break;
        }
        return t32Var;
    }
}
