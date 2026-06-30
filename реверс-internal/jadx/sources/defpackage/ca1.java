package defpackage;

import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.snackbar.C0136;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ca1 extends ls {
    public /* synthetic */ Object h;
    public final /* synthetic */ xg0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(xg0 xg0Var, ls lsVar) {
        super(lsVar);
        this.i = xg0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.h = obj;
        this.j = C0101.m1292(this) | Integer.MIN_VALUE;
        return C0129.m1636(C0136.m1707(this), false, this);
    }
}
