package defpackage;

import com.google.android.material.appbar.C0086;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.transformation.C0143;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vx extends ls {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(v20 v20Var, ls lsVar) {
        super(lsVar);
        this.j = v20Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.i = obj;
        this.k = C0143.m1805(this) | Integer.MIN_VALUE;
        return C0102.m1301(C0086.m1106(this), null, this);
    }
}
