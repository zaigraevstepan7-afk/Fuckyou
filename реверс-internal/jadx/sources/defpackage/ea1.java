package defpackage;

import android.view.C0025;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.focus.C0118;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 extends ls {
    public /* synthetic */ Object h;
    public final /* synthetic */ xg0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea1(xg0 xg0Var, ls lsVar) {
        super(lsVar);
        this.i = xg0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.h = obj;
        this.j = C0025.m333(this) | Integer.MIN_VALUE;
        return C0107.m1361(C0118.m1487(this), false, this);
    }
}
