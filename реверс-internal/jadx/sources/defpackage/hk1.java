package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk1 implements sa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ hk1(u92 u92Var, int i, z61 z61Var, int i2, xu0 xu0Var) {
        this.h = u92Var;
        this.f = i;
        this.i = z61Var;
        this.g = i2;
        this.j = xu0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.j;
        int i2 = this.g;
        Object obj3 = this.i;
        int iIntValue = this.f;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                jk1 jk1Var = (jk1) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                y61 y61Var = (y61) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    z61 z61Var = (z61) arrayList.get(i3);
                    y61Var.g(z61Var, 0, (i2 - z61Var.f) / 2, 0.0f);
                }
                int iN = y61Var.N(8.0f) + y61Var.N(lk1.c);
                h9 h9Var = jk1Var.c;
                if (h9Var != null) {
                    iIntValue = ((Number) h9Var.d()).intValue();
                }
                int i4 = iN + iIntValue;
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    z61 z61Var2 = (z61) arrayList2.get(i5);
                    y61Var.g(z61Var2, i4, (i2 - z61Var2.f) / 2, 0.0f);
                }
                break;
            default:
                z61 z61Var3 = (z61) obj3;
                y61.i((y61) obj, z61Var3, ((oh0) ((u92) obj4).t.h(new vh0((((long) (iIntValue - z61Var3.e)) << 32) | (((long) (i2 - z61Var3.f)) & 4294967295L)), ((xu0) obj2).getLayoutDirection())).a);
                break;
        }
        return t32Var;
    }

    public /* synthetic */ hk1(ArrayList arrayList, jk1 jk1Var, int i, ArrayList arrayList2, int i2) {
        this.h = arrayList;
        this.j = jk1Var;
        this.f = i;
        this.i = arrayList2;
        this.g = i2;
    }
}
