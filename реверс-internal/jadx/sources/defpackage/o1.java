package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;

    public /* synthetic */ o1(int i, Collection collection) {
        this.e = 2;
        this.g = i;
        this.f = collection;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                ((y61) obj).g((z61) obj2, -i2, 0, 0.0f);
                return t32Var;
            case 1:
                ((y61) obj).g((z61) obj2, 0, -i2, 0.0f);
                return t32Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ o1(int i, int i2, z61 z61Var) {
        this.e = i2;
        this.f = z61Var;
        this.g = i;
    }
}
