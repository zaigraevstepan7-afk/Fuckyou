package defpackage;

import android.support.v4.graphics.drawable.C0008;
import android.view.translation.C0018;
import androidx.core.app.C0044;
import androidx.recyclerview.widget.C0066;
import androidx.recyclerview.widget.C0068;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.behavior.C0094;
import com.google.android.material.focus.C0120;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gq implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ iq f;

    public /* synthetic */ gq(iq iqVar, int i) {
        this.e = i;
        this.f = iqVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM236 = C0018.m236(this);
        t32 t32VarM956 = C0074.m956();
        iq iqVarM1997 = C0153.m1997(this);
        switch (iM236) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iM1214 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var, iM1214 & 1, (iM1214 & 3) != 2)) {
                    C0066.m868(ob0Var);
                } else {
                    C0090.m1170(iqVarM1997);
                    String strM589 = C0044.m589(C0068.m891(), new Date(C0120.m1515(iqVarM1997)));
                    C0090.m1170(strM589);
                    C0068.m887(strM589, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var, 0, 0, 262142);
                }
                break;
            default:
                ob0 ob0Var2 = (ob0) obj;
                int iM12142 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var2, iM12142 & 1, (iM12142 & 3) != 2)) {
                    C0066.m868(ob0Var2);
                } else {
                    C0068.m887(C0091.m1189(iqVarM1997), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ob0Var2, 0, 24960, 241662);
                }
                break;
        }
        return t32VarM956;
    }
}
