package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m5 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(int i, ArrayList arrayList) {
        super(1);
        this.f = i;
        this.g = arrayList;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.f;
        t32 t32Var = t32.a;
        ArrayList arrayList = this.g;
        switch (i) {
            case 0:
                y61 y61Var = (y61) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y61.j(y61Var, (z61) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                y61 y61Var2 = (y61) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        y61.j(y61Var2, (z61) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                y61 y61Var3 = (y61) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    y61Var3.g((z61) arrayList.get(i4), 0, 0, 0.0f);
                }
                break;
            default:
                y61 y61Var4 = (y61) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    y61.k(y61Var4, (z61) arrayList.get(i5), 0, 0, null, 12);
                }
                break;
        }
        return t32Var;
    }
}
