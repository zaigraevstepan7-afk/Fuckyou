package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rq0 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rq0(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [hk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [sx0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sx0] */
    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((d22) obj).f();
            case 1:
                return ((d22) obj).d.getValue();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((d22) obj).f();
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((d22) obj).d.getValue();
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((d22) obj).f();
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((d22) obj).d.getValue();
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((d22) obj).f();
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((d22) obj).d.getValue();
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ((d22) obj).f();
            case el.a /* 9 */:
                return ((d22) obj).d.getValue();
            case el.b /* 10 */:
                return ((d22) obj).f();
            case 11:
                return ((d22) obj).d.getValue();
            case el.c /* 12 */:
                return ((d22) obj).d.getValue();
            case 13:
                return ((d22) obj).f();
            case 14:
                return ((d22) obj).d.getValue();
            case 15:
                return ((d22) obj).f();
            case 16:
                return ((d22) obj).d.getValue();
            case 17:
                return ((d22) obj).f();
            case 18:
                return ((d22) obj).d.getValue();
            case 19:
                return ((d22) obj).f();
            case 20:
                return ((d22) obj).d.getValue();
            case 21:
                return ((d22) obj).f();
            default:
                ArrayList arrayList = ((rb0) obj).a;
                zx0 zx0Var = new zx0(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r4 = (hk0) arrayList.get(i2);
                    Object obj2 = r4.b;
                    int i3 = r4.a;
                    Object wj0Var = obj2 != null ? new wj0(Integer.valueOf(i3), r4.b) : Integer.valueOf(i3);
                    int iF = zx0Var.f(wj0Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : zx0Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof sx0) {
                            ?? r8 = (sx0) obj3;
                            r8.a(r4);
                            r4 = r8;
                        } else {
                            Object[] objArr = s01.a;
                            ?? sx0Var = new sx0(2);
                            sx0Var.a(obj3);
                            sx0Var.a(r4);
                            r4 = sx0Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        zx0Var.b[i4] = wj0Var;
                        zx0Var.c[i4] = r4;
                    } else {
                        zx0Var.c[iF] = r4;
                    }
                }
                return new bx0(zx0Var);
        }
    }
}
