package defpackage;

import android.view.C0023;
import androidx.core.app.C0041;
import com.google.android.material.snackbar.C0138;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rq extends ls {
    public String h;
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xg0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(xg0 xg0Var, ls lsVar) {
        super(lsVar);
        this.k = xg0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.j = obj;
        this.l = C0023.m306(this) | Integer.MIN_VALUE;
        return C0138.m1733(C0041.m553(this), null, null, this);
    }
}
