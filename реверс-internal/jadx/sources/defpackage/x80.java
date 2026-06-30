package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x80 implements Comparator {
    public static final x80 b = new x80(0);
    public static final x80 c = new x80(1);
    public static final x80 d = new x80(2);
    public static final x80 e = new x80(3);
    public static final x80 f = new x80(4);
    public final /* synthetic */ int a;

    public /* synthetic */ x80(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                w80 w80Var = (w80) obj;
                w80 w80Var2 = (w80) obj2;
                if (!hk.F(w80Var) || !hk.F(w80Var2)) {
                    if (hk.F(w80Var)) {
                        return -1;
                    }
                    return hk.F(w80Var2) ? 1 : 0;
                }
                ql0 ql0VarP = bl.P(w80Var);
                ql0 ql0VarP2 = bl.P(w80Var2);
                if (xi0.o(ql0VarP, ql0VarP2)) {
                    return 0;
                }
                Object[] objArr = new ql0[16];
                int i = 0;
                while (ql0VarP != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = ql0VarP;
                    i++;
                    ql0VarP = ql0VarP.u();
                }
                Object[] objArr3 = new ql0[16];
                int i3 = 0;
                while (ql0VarP2 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = ql0VarP2;
                    i3++;
                    ql0VarP2 = ql0VarP2.u();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (xi0.o(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return xi0.t(((ql0) objArr[i5]).v(), ((ql0) objArr3[i5]).v());
                }
                yc.l("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                pc1 pc1VarH = ((rl1) obj).h();
                pc1 pc1VarH2 = ((rl1) obj2).h();
                int iCompare = Float.compare(pc1VarH.a, pc1VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(pc1VarH.b, pc1VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(pc1VarH.d, pc1VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(pc1VarH.c, pc1VarH2.c);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ql0 ql0Var = (ql0) obj;
                ql0 ql0Var2 = (ql0) obj2;
                int iT = xi0.t(ql0Var2.s, ql0Var.s);
                return iT != 0 ? iT : xi0.t(ql0Var.hashCode(), ql0Var2.hashCode());
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                pc1 pc1VarH3 = ((rl1) obj).h();
                pc1 pc1VarH4 = ((rl1) obj2).h();
                int iCompare4 = Float.compare(pc1VarH4.c, pc1VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(pc1VarH3.b, pc1VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(pc1VarH3.d, pc1VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(pc1VarH4.a, pc1VarH3.a);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                j41 j41Var = (j41) obj;
                j41 j41Var2 = (j41) obj2;
                int iCompare7 = Float.compare(((pc1) j41Var.e).b, ((pc1) j41Var2.e).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((pc1) j41Var.e).d, ((pc1) j41Var2.e).d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return el.s(Integer.valueOf(((gb) obj).b), Integer.valueOf(((gb) obj2).b));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return el.s(Integer.valueOf(((gb) obj).b), Integer.valueOf(((gb) obj2).b));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return el.s(Long.valueOf(((iq) obj2).c), Long.valueOf(((iq) obj).c));
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return el.s(Long.valueOf(((iq) obj2).c), Long.valueOf(((iq) obj).c));
            case el.a /* 9 */:
                ql0 ql0Var3 = (ql0) obj;
                ql0 ql0Var4 = (ql0) obj2;
                int iT2 = xi0.t(ql0Var3.s, ql0Var4.s);
                return iT2 != 0 ? iT2 : xi0.t(ql0Var3.hashCode(), ql0Var4.hashCode());
            default:
                return el.s(Float.valueOf(((ez) obj).a), Float.valueOf(((ez) obj2).a));
        }
    }
}
