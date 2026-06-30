package defpackage;

import android.app.C0000;
import androidx.compose.ui.input.pointer.C0036;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.carousel.C0110;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zq implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ iq g;

    public zq(iq iqVar, fy0 fy0Var) {
        this.e = 2;
        this.g = iqVar;
        this.f = fy0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int iM475 = C0036.m475(this);
        t32 t32VarM956 = C0074.m956();
        iq iqVarM13 = C0000.m13(this);
        Object objM1222 = C0094.m1222(this);
        switch (iM475) {
            case 0:
                C0110.m1395((sa0) objM1222, iqVarM13);
                break;
            case 1:
                C0110.m1395((sa0) objM1222, iqVarM13);
                break;
            default:
                C0098.m1251((fy0) objM1222, iqVarM13);
                break;
        }
        return t32VarM956;
    }

    public /* synthetic */ zq(sa0 sa0Var, iq iqVar, int i) {
        this.e = i;
        this.f = sa0Var;
        this.g = iqVar;
    }
}
