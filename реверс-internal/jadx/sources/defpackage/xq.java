package defpackage;

import android.view.C0023;
import androidx.core.app.C0039;
import androidx.core.graphics.drawable.C0046;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0077;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.carousel.C0110;
import com.google.android.material.transformation.C0141;
import com.google.android.material.transformation.C0146;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xq implements ha0 {
    public final /* synthetic */ rd e;
    public final /* synthetic */ iq f;
    public final /* synthetic */ sa0 g;
    public final /* synthetic */ fy0 h;
    public final /* synthetic */ fy0 i;

    @Override // defpackage.ha0
    public final Object a() {
        int iM1836 = C0146.m1836(C0046.m606(C0039.m518(this)));
        iq iqVarM1981 = C0152.m1981(this);
        if (iM1836 == 0) {
            C0098.m1251(C0077.m991(this), iqVarM1981);
        } else if (iM1836 == 1) {
            C0098.m1251(C0023.m305(this), iqVarM1981);
        } else {
            if (iM1836 != 2) {
                C0141.m1779();
                return null;
            }
            C0110.m1395(C0146.m1834(this), iqVarM1981);
        }
        return C0074.m956();
    }

    public xq(rd rdVar, iq iqVar, sa0 sa0Var, fy0 fy0Var, fy0 fy0Var2) {
        this.e = rdVar;
        this.f = iqVar;
        this.g = sa0Var;
        this.h = fy0Var;
        this.i = fy0Var2;
    }
}
