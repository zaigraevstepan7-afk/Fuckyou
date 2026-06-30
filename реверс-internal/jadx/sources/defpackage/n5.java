package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n5 implements uu0 {
    public static final n5 b = new n5(0);
    public static final n5 c = new n5(1);
    public static final n5 d = new n5(2);
    public static final n5 e = new n5(3);
    public static final mt f = new mt(9);
    public static final n5 g = new n5(4);
    public static final n5 h = new n5(5);
    public static final n5 i = new n5(6);
    public final /* synthetic */ int a;

    public /* synthetic */ n5(int i2) {
        this.a = i2;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        int i2 = this.a;
        g40 g40Var = g40.e;
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    z61 z61VarE = ((pu0) list.get(i4)).e(j);
                    iJ = Math.max(iJ, z61VarE.e);
                    i3 = Math.max(i3, z61VarE.f);
                    arrayList.add(z61VarE);
                }
                if (list.isEmpty()) {
                    iJ = kr.j(j);
                    i3 = kr.i(j);
                }
                return xu0Var.f0(iJ, i3, g40Var, new m5(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return xu0Var.f0(0, 0, g40Var, a4.o);
                }
                if (size2 == 1) {
                    z61 z61VarE2 = ((pu0) list.get(0)).e(j);
                    return xu0Var.f0(z61VarE2.e, z61VarE2.f, g40Var, new u3(z61VarE2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size3) {
                    z61 z61VarE3 = ((pu0) list.get(i)).e(j);
                    iMax = Math.max(iMax, z61VarE3.e);
                    iMax2 = Math.max(iMax2, z61VarE3.f);
                    arrayList2.add(z61VarE3);
                    i++;
                }
                return xu0Var.f0(iMax, iMax2, g40Var, new m5(1, arrayList2));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return xu0Var.f0(kr.j(j), kr.i(j), g40Var, new mt(9));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return xu0Var.f0(kr.h(j), kr.g(j), g40Var, f);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return xu0Var.f0(kr.j(j), kr.i(j), g40Var, new mt(9));
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                while (i < size4) {
                    z61 z61VarE4 = ((pu0) list.get(i)).e(j);
                    iMax3 = Math.max(iMax3, z61VarE4.e);
                    iMax4 = Math.max(iMax4, z61VarE4.f);
                    arrayList3.add(z61VarE4);
                    i++;
                }
                return xu0Var.f0(iMax3, iMax4, g40Var, new n(27, arrayList3));
            default:
                return xu0Var.f0(kr.f(j) ? kr.h(j) : 0, kr.e(j) ? kr.g(j) : 0, g40Var, new mt(9));
        }
    }
}
