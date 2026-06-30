package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6 implements ya0 {
    public final /* synthetic */ v6 e;

    public /* synthetic */ u6(v6 v6Var) {
        this.e = v6Var;
    }

    @Override // defpackage.ya0
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        v6 v6Var = this.e;
        d32 d32VarB = ((d90) v6Var.e).b((lv1) obj, (aa0) obj2, ((y90) obj3).a, ((z90) obj4).a);
        if (d32VarB instanceof d32) {
            Object obj5 = d32VarB.e;
            obj5.getClass();
            return (Typeface) obj5;
        }
        oc ocVar = new oc(d32VarB, v6Var.j);
        v6Var.j = ocVar;
        Object obj6 = ocVar.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
