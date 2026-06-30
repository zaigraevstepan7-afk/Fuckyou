package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kh implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kh(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((zi) obj2).cancel();
                return t32Var;
            case 1:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            default:
                float[] fArr = ((ou0) obj).a;
                zk0 zk0Var = (zk0) obj2;
                if (zk0Var.B()) {
                    al.w(zk0Var).F(zk0Var, fArr);
                }
                return t32Var;
        }
    }
}
