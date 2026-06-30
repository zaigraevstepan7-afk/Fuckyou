package defpackage;

import android.view.C0024;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0044;
import androidx.lifecycle.C0058;
import androidx.versionedparcelable.C0074;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.carousel.C0108;
import com.google.android.material.sidesheet.C0134;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z91 extends zu1 implements xa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f225short = {2556, 2558, 2547, 2547, 2495, 2539, 2544, 2495, 2488, 2541, 2554, 2540, 2538, 2546, 2554, 2488, 2495, 2557, 2554, 2553, 2544, 2541, 2554, 2495, 2488, 2550, 2545, 2537, 2544, 2548, 2554, 2488, 2495, 2536, 2550, 2539, 2551, 2495, 2556, 2544, 2541, 2544, 2538, 2539, 2550, 2545, 2554};
    public int i;
    public /* synthetic */ g70 j;
    public /* synthetic */ Throwable k;

    /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1973() {
        if (C0095.m1228() >= 0) {
            return f225short;
        }
        return null;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        z91 z91Var = new z91(3, (ks) obj3);
        z91Var.j = (g70) obj;
        z91Var.k = (Throwable) obj2;
        return C0024.m331(z91Var, C0074.m956());
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws Throwable {
        g70 g70VarM1375 = C0108.m1375(this);
        Throwable thM765 = C0058.m765(this);
        int iM1205 = C0093.m1205(this);
        boolean z = true;
        if (iM1205 == 0) {
            C0029.m378(obj);
            if (!(thM765 instanceof IOException)) {
                throw thM765;
            }
            wx0 wx0Var = new wx0(z);
            this.j = null;
            this.k = null;
            this.i = 1;
            Object objM1689 = C0134.m1689(g70VarM1375, wx0Var, this);
            wt wtVarM1005 = C0078.m1005();
            if (objM1689 == wtVarM1005) {
                return wtVarM1005;
            }
        } else {
            if (iM1205 != 1) {
                C0087.m1132(C0044.m587(m1973(), 0, 47, 2463));
                return null;
            }
            C0029.m378(obj);
        }
        return C0074.m956();
    }
}
