package defpackage;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0007;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0010;
import androidx.appcompat.app.C0028;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.widget.C0053;
import androidx.recyclerview.widget.C0066;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0083;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.search.C0125;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.transformation.C0143;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj implements xa0 {
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ int f;
    public final /* synthetic */ sa0 g;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        boolean z;
        Object objM2013;
        co1 co1Var = (co1) obj;
        ob0 ob0Var = (ob0) obj2;
        int iM1214 = C0094.m1214((Integer) obj3);
        C0090.m1170(co1Var);
        int i = 2;
        if ((iM1214 & 6) == 0) {
            iM1214 |= C0105.m1346(ob0Var, co1Var) ? 4 : 2;
        }
        int i2 = iM1214;
        byte b = 0;
        int i3 = 1;
        if (C0008.m117(ob0Var, i2 & 1, (i2 & 19) != 18)) {
            ArrayList arrayListM1302 = C0102.m1302(this);
            int iM452 = C0034.m452(arrayListM1302);
            int i4 = 0;
            int i5 = 0;
            while (i5 < iM452) {
                Object objM1640 = C0130.m1640(arrayListM1302, i5);
                int i6 = i5 + 1;
                int i7 = i4 + 1;
                if (i4 < 0) {
                    C0157.m2035();
                    throw null;
                }
                String str = (String) objM1640;
                if (i4 == C0130.m1643(this)) {
                    arrayList = arrayListM1302;
                    z = i3;
                } else {
                    arrayList = arrayListM1302;
                    z = b;
                }
                sa0 sa0VarM486 = C0036.m486(this);
                boolean zM1346 = C0105.m1346(ob0Var, sa0VarM486) | C0010.m133(ob0Var, i4);
                Object objM1131 = C0087.m1131(ob0Var);
                if (zM1346 || objM1131 == C0002.m36()) {
                    objM1131 = new jj(i4, b, sa0VarM486);
                    C0079.m1012(ob0Var, objM1131);
                }
                ha0 ha0Var = (ha0) objM1131;
                C0008.m113();
                int iM4522 = C0034.m452(arrayList);
                ym1 ym1VarM1579 = C0125.m1579(C0028.m373(), ob0Var);
                C0090.m1170(ym1VarM1579);
                Object obj4 = (kg1) ym1VarM1579;
                if (iM4522 != i3) {
                    if (i4 == 0) {
                        uz uzVarM1795 = C0143.m1795();
                        objM2013 = C0007.m102(obj4, null, uzVarM1795, uzVarM1795, null, 9);
                    } else if (i4 == iM4522 - 1) {
                        uz uzVarM17952 = C0143.m1795();
                        objM2013 = C0007.m102(obj4, uzVarM17952, null, null, uzVarM17952, 6);
                    } else {
                        objM2013 = C0155.m2013();
                    }
                    obj4 = objM2013;
                }
                ArrayList arrayList2 = arrayList;
                C0053.m692(co1Var, z, ha0Var, obj4, null, false, null, null, null, null, C0083.m1064(-154663133, new td(str, i, b), ob0Var), ob0Var, i2 & 14);
                i5 = i6;
                i4 = i7;
                b = b;
                i3 = i3;
                iM452 = iM452;
                arrayListM1302 = arrayList2;
            }
        } else {
            C0066.m868(ob0Var);
        }
        return C0074.m956();
    }

    public /* synthetic */ hj(ArrayList arrayList, int i, sa0 sa0Var) {
        this.e = arrayList;
        this.f = i;
        this.g = sa0Var;
    }
}
