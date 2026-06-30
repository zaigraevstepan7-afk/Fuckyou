package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 extends nl0 {
    public static final gg1 c = new gg1("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg1(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                g40 g40Var = g40.e;
                if (size == 0) {
                    return xu0Var.f0(kr.j(j), kr.i(j), g40Var, zz0.s);
                }
                if (size == 1) {
                    z61 z61VarE = ((pu0) list.get(0)).e(j);
                    return xu0Var.f0(lr.g(z61VarE.e, j), lr.f(z61VarE.f, j), g40Var, new u3(z61VarE, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    z61 z61VarE2 = ((pu0) list.get(i)).e(j);
                    iMax = Math.max(z61VarE2.e, iMax);
                    iMax2 = Math.max(z61VarE2.f, iMax2);
                    arrayList.add(z61VarE2);
                }
                return xu0Var.f0(lr.g(iMax, j), lr.f(iMax2, j), g40Var, new m5(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
