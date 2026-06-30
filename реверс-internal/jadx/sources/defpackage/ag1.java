package defpackage;

import androidx.profileinstaller.C0061;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.transformation.C0142;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ag1 extends ls {
    public Iterator h;
    public Object i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l91 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag1(l91 l91Var, ls lsVar) {
        super(lsVar);
        this.l = l91Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.k = obj;
        this.m = C0061.m807(this) | Integer.MIN_VALUE;
        return C0136.m1718(C0142.m1781(this), null, this);
    }
}
