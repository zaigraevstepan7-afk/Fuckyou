package defpackage;

import androidx.compose.ui.input.pointer.C0036;
import androidx.core.app.C0039;
import com.google.android.material.snackbar.C0136;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yq0 extends ls {
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ oc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(oc ocVar, ls lsVar) {
        super(lsVar);
        this.j = ocVar;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        this.i = obj;
        this.k = C0039.m519(this) | Integer.MIN_VALUE;
        return C0136.m1713(C0036.m474(this), this);
    }
}
