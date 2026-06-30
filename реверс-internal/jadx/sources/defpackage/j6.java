package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j6 implements g70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j6(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.g70
    public final Object l(Object obj, ks ksVar) {
        Object objE;
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                xg0 xg0Var = (xg0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    xg0Var.u().startStylusHandwriting((View) xg0Var.f);
                }
                return t32Var;
            case 1:
                mv mvVar = (mv) obj2;
                return ((mvVar.k.q() instanceof n60) || (objE = mv.e(mvVar, true, ksVar)) != wt.e) ? t32Var : objE;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((zc1) obj2).e = obj;
                throw new a(this);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((bw0) obj2).g.h(((Number) obj).floatValue());
                return t32Var;
            default:
                yh0 yh0Var = (yh0) obj;
                s41 s41Var = (s41) obj2;
                if ((yh0Var instanceof oa1) || (yh0Var instanceof c80)) {
                    s41Var.h(s41Var.g() + 1);
                } else if ((yh0Var instanceof pa1) || (yh0Var instanceof d80) || (yh0Var instanceof na1)) {
                    s41Var.h(s41Var.g() - 1);
                }
                return t32Var;
        }
    }
}
