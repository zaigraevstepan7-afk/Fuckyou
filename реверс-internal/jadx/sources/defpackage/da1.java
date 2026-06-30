package defpackage;

import android.text.C0015;
import androidx.appcompat.app.C0029;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.graphics.drawable.C0046;
import androidx.graphics.path.C0055;
import androidx.versionedparcelable.C0074;
import com.google.android.material.appbar.C0086;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.carousel.C0109;
import com.google.android.material.floatingactionbutton.C0117;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class da1 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da1(boolean z, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = z;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM2001 = C0154.m2001(this);
        t32 t32VarM956 = C0074.m956();
        wx0 wx0Var = (wx0) obj;
        ks ksVar = (ks) obj2;
        switch (iM2001) {
            case 0:
                C0109.m1381((da1) C0046.m611(this, ksVar, wx0Var), t32VarM956);
                break;
            default:
                C0109.m1381((da1) C0046.m611(this, ksVar, wx0Var), t32VarM956);
                break;
        }
        return t32VarM956;
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (C0154.m2001(this)) {
            case 0:
                da1 da1Var = new da1(C0086.m1115(this), ksVar, 0);
                da1Var.j = obj;
                return da1Var;
            default:
                da1 da1Var2 = new da1(C0086.m1115(this), ksVar, 1);
                da1Var2.j = obj;
                return da1Var2;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int iM2001 = C0154.m2001(this);
        t32 t32VarM956 = C0074.m956();
        boolean zM1115 = C0086.m1115(this);
        wx0 wx0Var = (wx0) C0055.m718(this);
        switch (iM2001) {
            case 0:
                C0029.m378(obj);
                C0117.m1473(wx0Var, C0101.m1298(), C0035.m467(zM1115));
                break;
            default:
                C0029.m378(obj);
                C0117.m1473(wx0Var, C0015.m207(), C0035.m467(zM1115));
                break;
        }
        return t32VarM956;
    }
}
