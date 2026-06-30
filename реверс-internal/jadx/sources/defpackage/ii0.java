package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 implements tw0 {
    public final a3 a;

    public ii0(a3 a3Var) {
        this.a = a3Var;
    }

    public static int f(ArrayList arrayList, int i, wa0 wa0Var) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        pu0 pu0Var = (pu0) pl.d0(list);
        if (pu0Var != null) {
            iIntValue = ((Number) wa0Var.h(pu0Var, Integer.valueOf(i))).intValue();
            i = hk.U(i, pu0Var.U(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        pu0 pu0Var2 = (pu0) pl.d0(list2);
        if (pu0Var2 != null) {
            iIntValue2 = ((Number) wa0Var.h(pu0Var2, Integer.valueOf(i))).intValue();
            i = hk.U(i, pu0Var2.U(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (pu0) pl.d0(list3);
        int iIntValue3 = obj != null ? ((Number) wa0Var.h(obj, Integer.valueOf(i))).intValue() : 0;
        Object obj2 = (pu0) pl.d0(list4);
        int iIntValue4 = obj2 != null ? ((Number) wa0Var.h(obj2, Integer.valueOf(i))).intValue() : 0;
        Object obj3 = (pu0) pl.d0(list5);
        return lr.f(Math.max(iIntValue, Math.max((obj3 != null ? ((Number) wa0Var.h(obj3, Integer.valueOf(i))).intValue() : 0) + iIntValue3 + iIntValue4, iIntValue2)), lr.b(0, 0, 0, 0, 15));
    }

    public static int g(ArrayList arrayList, int i, wa0 wa0Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        pu0 pu0Var = (pu0) pl.d0(list);
        int iIntValue = pu0Var != null ? ((Number) wa0Var.h(pu0Var, Integer.valueOf(i))).intValue() : 0;
        pu0 pu0Var2 = (pu0) pl.d0(list2);
        int iIntValue2 = pu0Var2 != null ? ((Number) wa0Var.h(pu0Var2, Integer.valueOf(i))).intValue() : 0;
        pu0 pu0Var3 = (pu0) pl.d0(list3);
        int iIntValue3 = pu0Var3 != null ? ((Number) wa0Var.h(pu0Var3, Integer.valueOf(i))).intValue() : 0;
        pu0 pu0Var4 = (pu0) pl.d0(list4);
        int iIntValue4 = pu0Var4 != null ? ((Number) wa0Var.h(pu0Var4, Integer.valueOf(i))).intValue() : 0;
        pu0 pu0Var5 = (pu0) pl.d0(list5);
        int iIntValue5 = pu0Var5 != null ? ((Number) wa0Var.h(pu0Var5, Integer.valueOf(i))).intValue() : 0;
        long jB = lr.b(0, 0, 0, 0, 15);
        return kr.d(jB) ? kr.h(jB) : Math.max(iIntValue5, Math.max(iIntValue3, iIntValue4)) + iIntValue + iIntValue2;
    }

    @Override // defpackage.tw0
    public final vu0 a(xu0 xu0Var, ArrayList arrayList, long j) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        long jA = kr.a(j, 0, 0, 0, 0, 10);
        pu0 pu0Var = (pu0) pl.d0(list);
        final z61 z61VarE = pu0Var != null ? pu0Var.e(jA) : null;
        int i = z61VarE != null ? z61VarE.e : 0;
        pu0 pu0Var2 = (pu0) pl.d0(list2);
        z61 z61VarE2 = pu0Var2 != null ? pu0Var2.e(lr.j(-i, 0, 2, jA)) : null;
        int i2 = i + (z61VarE2 != null ? z61VarE2.e : 0);
        pu0 pu0Var3 = (pu0) pl.d0(list3);
        z61 z61VarE3 = pu0Var3 != null ? pu0Var3.e(lr.j(-i2, 0, 2, jA)) : null;
        int i3 = z61VarE3 != null ? z61VarE3.f : 0;
        pu0 pu0Var4 = (pu0) pl.d0(list5);
        final z61 z61VarE4 = pu0Var4 != null ? pu0Var4.e(lr.i(-i2, -i3, jA)) : null;
        int i4 = i3 + (z61VarE4 != null ? z61VarE4.f : 0);
        pu0 pu0Var5 = (pu0) pl.d0(list4);
        z61 z61VarE5 = pu0Var5 != null ? pu0Var5.e(lr.i(-i2, -i4, jA)) : null;
        int i5 = z61VarE != null ? z61VarE.e : 0;
        final int iH = kr.d(j) ? kr.h(j) : Math.max(z61VarE4 != null ? z61VarE4.e : 0, Math.max(z61VarE3 != null ? z61VarE3.e : 0, z61VarE5 != null ? z61VarE5.e : 0)) + i5 + (z61VarE2 != null ? z61VarE2.e : 0);
        final int iF = lr.f(Math.max(z61VarE != null ? z61VarE.f : 0, Math.max((z61VarE4 != null ? z61VarE4.f : 0) + (z61VarE3 != null ? z61VarE3.f : 0) + (z61VarE5 != null ? z61VarE5.f : 0), z61VarE2 != null ? z61VarE2.f : 0)), j);
        final z61 z61Var = z61VarE2;
        final z61 z61Var2 = z61VarE3;
        final z61 z61Var3 = z61VarE5;
        return xu0Var.f0(iH, iF, g40.e, new sa0() { // from class: di0
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                a3 a3Var = this.a;
                y61 y61Var = (y61) obj;
                z61 z61Var4 = z61VarE;
                int i6 = iF;
                if (z61Var4 != null) {
                    y61.j(y61Var, z61Var4, 0, a3Var.a(z61Var4.f, i6));
                }
                int i7 = z61Var4 != null ? z61Var4.e : 0;
                z61 z61Var5 = z61VarE4;
                int i8 = z61Var5 != null ? z61Var5.f : 0;
                z61 z61Var6 = z61Var2;
                int i9 = i8 + (z61Var6 != null ? z61Var6.f : 0);
                z61 z61Var7 = z61Var3;
                int iA = a3Var.a(i9 + (z61Var7 != null ? z61Var7.f : 0), i6);
                if (z61Var6 != null) {
                    y61.j(y61Var, z61Var6, i7, iA);
                }
                int i10 = iA + (z61Var6 != null ? z61Var6.f : 0);
                if (z61Var5 != null) {
                    y61.j(y61Var, z61Var5, i7, i10);
                }
                int i11 = i10 + (z61Var5 != null ? z61Var5.f : 0);
                if (z61Var7 != null) {
                    y61.j(y61Var, z61Var7, i7, i11);
                }
                z61 z61Var8 = z61Var;
                if (z61Var8 != null) {
                    y61.j(y61Var, z61Var8, iH - z61Var8.e, a3Var.a(z61Var8.f, i6));
                }
                return t32.a;
            }
        });
    }

    @Override // defpackage.tw0
    public final int b(pi0 pi0Var, ArrayList arrayList, int i) {
        return g(arrayList, i, fi0.l);
    }

    @Override // defpackage.tw0
    public final int c(pi0 pi0Var, ArrayList arrayList, int i) {
        return g(arrayList, i, hi0.l);
    }

    @Override // defpackage.tw0
    public final int d(pi0 pi0Var, ArrayList arrayList, int i) {
        return f(arrayList, i, gi0.l);
    }

    @Override // defpackage.tw0
    public final int e(pi0 pi0Var, ArrayList arrayList, int i) {
        return f(arrayList, i, ei0.l);
    }
}
