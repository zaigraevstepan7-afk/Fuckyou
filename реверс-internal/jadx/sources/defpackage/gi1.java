package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gi1 implements wa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ gi1(int i) {
        this.e = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return Integer.valueOf(((hp0) obj2).a);
            case 1:
                uz1 uz1Var = (uz1) obj2;
                return hk.j(ei1.a(new tz1(uz1Var.a), c2.G, (gh1) obj), Boolean.valueOf(uz1Var.b));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(((tz1) obj2).a);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((hj1) obj2).a.g());
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return Integer.valueOf(((pu0) obj).O(((Integer) obj2).intValue()));
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((pu0) obj).U(((Integer) obj2).intValue()));
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(((pu0) obj).a0(((Integer) obj2).intValue()));
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((pu0) obj).f(((Integer) obj2).intValue()));
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ky1 ky1Var = (ky1) obj2;
                return hk.H(Float.valueOf(ky1Var.a.g()), Boolean.valueOf(((k31) ky1Var.f.getValue()) == k31.e));
            case el.a /* 9 */:
                jt jtVar = (jt) obj2;
                if (!(jtVar instanceof p12)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? jtVar : Integer.valueOf(iIntValue + 1);
            case el.b /* 10 */:
                jt jtVar2 = (jt) obj2;
                if (jtVar2 instanceof p12) {
                    return (p12) jtVar2;
                }
                return null;
            default:
                o02 o02Var = (o02) obj;
                jt jtVar3 = (jt) obj2;
                if (jtVar3 instanceof p12) {
                    lt ltVar = o02Var.a;
                    Trace.beginSection(null);
                    Object[] objArr = o02Var.b;
                    int i = o02Var.d;
                    objArr[i] = t32.a;
                    p12[] p12VarArr = o02Var.c;
                    o02Var.d = i + 1;
                    p12VarArr[i] = (p12) jtVar3;
                }
                return o02Var;
        }
    }
}
