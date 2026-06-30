package defpackage;

import com.google.android.material.behavior.C0088;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0106;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 extends ls {
    public /* synthetic */ Object h;
    public final /* synthetic */ lr0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(lr0 lr0Var, ls lsVar) {
        super(lsVar);
        this.i = lr0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.h = obj;
        this.j = C0088.m1139(this) | Integer.MIN_VALUE;
        return C0102.m1314(C0106.m1354(this), this);
    }
}
