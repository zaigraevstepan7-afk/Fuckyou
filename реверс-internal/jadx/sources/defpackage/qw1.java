package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qw1 implements xa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qw1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                long j = ((vl) obj).a;
                ob0 ob0Var = (ob0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ob0Var.Q();
                } else {
                    l91.q.h((Drawable) obj4, ob0Var, 48);
                }
                break;
            case 1:
                long j2 = ((vl) obj).a;
                ob0 ob0Var2 = (ob0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!ob0Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ob0Var2.Q();
                } else {
                    l91.q.h((Drawable) obj4, ob0Var2, 48);
                }
                break;
            default:
                long j3 = ((vl) obj).a;
                ob0 ob0Var3 = (ob0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ob0Var3.e(j3) ? 4 : 2;
                }
                if (!ob0Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ob0Var3.Q();
                } else {
                    qw.b(((rw1) obj4).c, j3, ob0Var3, (iIntValue3 << 3) & 112);
                }
                break;
        }
        return t32Var;
    }
}
