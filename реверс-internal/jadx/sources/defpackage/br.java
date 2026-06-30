package defpackage;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0008;
import android.view.C0022;
import androidx.core.app.C0037;
import androidx.core.app.C0040;
import androidx.core.graphics.drawable.C0046;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0066;
import androidx.versionedparcelable.C0074;
import androidx.window.area.reflectionguard.C0078;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0083;
import com.google.android.material.appbar.C0084;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.search.C0125;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.transformation.C0141;
import com.google.android.material.transformation.C0146;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class br implements wa0 {
    public final /* synthetic */ rd e;
    public final /* synthetic */ iq f;
    public final /* synthetic */ wa0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ sa0 i;

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ob0 ob0Var = (ob0) obj;
        int iM1013 = C0079.m1013((Number) obj2);
        int i = 1;
        if (C0008.m117(ob0Var, iM1013 & 1, (iM1013 & 3) != 2)) {
            rd rdVarM1062 = C0083.m1062(this);
            int iM1836 = C0146.m1836(C0046.m606(rdVarM1062));
            if (iM1836 != 0) {
                iq iqVarM540 = C0040.m540(this);
                if (iM1836 == 1) {
                    C0096.m1240(ob0Var, -1836967068);
                    C0134.m1691(iqVarM540, C0078.m1001(this), null, ob0Var, 0);
                    C0062.m815(ob0Var, false);
                } else {
                    if (iM1836 != 2) {
                        C0096.m1240(ob0Var, -1836971203);
                        C0062.m815(ob0Var, false);
                        C0141.m1779();
                        return null;
                    }
                    C0096.m1240(ob0Var, -1111295169);
                    boolean zM1079 = C0084.m1079(C0098.m1254(this), C0037.m490(iqVarM540));
                    sa0 sa0VarM1582 = C0125.m1582(this);
                    boolean zM1346 = C0105.m1346(ob0Var, sa0VarM1582) | C0105.m1346(ob0Var, iqVarM540);
                    Object objM1131 = C0087.m1131(ob0Var);
                    if (zM1346 || objM1131 == C0002.m36()) {
                        objM1131 = new zq(sa0VarM1582, iqVarM540, i);
                        C0079.m1012(ob0Var, objM1131);
                    }
                    C0113.m1435((ha0) objM1131, C0084.m1084(ob0Var), null, false, null, C0083.m1064(-1880354950, new ar(zM1079), ob0Var), ob0Var, 1572864, 60);
                    C0062.m815(ob0Var, false);
                }
            } else {
                C0096.m1240(ob0Var, -1836969699);
                C0112.m1423(C0022.m292(rdVarM1062), ob0Var, 0);
                C0062.m815(ob0Var, false);
            }
        } else {
            C0066.m868(ob0Var);
        }
        return C0074.m956();
    }

    public br(rd rdVar, iq iqVar, wa0 wa0Var, String str, sa0 sa0Var) {
        this.e = rdVar;
        this.f = iqVar;
        this.g = wa0Var;
        this.h = str;
        this.i = sa0Var;
    }
}
