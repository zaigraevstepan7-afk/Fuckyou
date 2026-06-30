package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e80 implements g70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ fy0 g;

    public /* synthetic */ e80(ArrayList arrayList, fy0 fy0Var, int i) {
        this.e = i;
        this.f = arrayList;
        this.g = fy0Var;
    }

    @Override // defpackage.g70
    public final Object l(Object obj, ks ksVar) {
        int i = this.e;
        t32 t32Var = t32.a;
        fy0 fy0Var = this.g;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                yh0 yh0Var = (yh0) obj;
                if (yh0Var instanceof c80) {
                    arrayList.add(yh0Var);
                } else if (yh0Var instanceof d80) {
                    arrayList.remove(((d80) yh0Var).a);
                }
                fy0Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                yh0 yh0Var2 = (yh0) obj;
                if (yh0Var2 instanceof oa1) {
                    arrayList.add(yh0Var2);
                } else if (yh0Var2 instanceof pa1) {
                    arrayList.remove(((pa1) yh0Var2).a);
                } else if (yh0Var2 instanceof na1) {
                    arrayList.remove(((na1) yh0Var2).a);
                }
                fy0Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return t32Var;
    }
}
