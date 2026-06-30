package defpackage;

import android.support.v4.app.C0002;
import android.support.v4.app.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.support.v4.graphics.drawable.C0008;
import android.view.C0025;
import android.view.translation.C0020;
import androidx.core.app.C0040;
import androidx.core.app.C0041;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0047;
import androidx.core.widget.C0050;
import androidx.core.widget.C0053;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0061;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0066;
import androidx.recyclerview.widget.C0068;
import androidx.startup.C0069;
import androidx.versionedparcelable.C0074;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.focus.C0119;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0127;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.transformation.C0141;
import com.google.android.material.transformation.C0142;
import com.google.android.material.transformation.C0143;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class td implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f201short = {2343};
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ td(String str, int i) {
        this.e = 1;
        this.f = str;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m1948() {
        if (C0143.m1796() > 0) {
            return f201short;
        }
        return null;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM1783 = C0142.m1783(this);
        String strM1806 = C0143.m1806(this);
        t32 t32VarM956 = C0074.m956();
        switch (iM1783) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iM1214 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var, iM1214 & 1, (iM1214 & 3) != 2)) {
                    C0066.m868(ob0Var);
                } else {
                    tv0 tv0VarM1544 = C0122.m1544(C0086.m1121(), 10.0f, 4.0f);
                    uu0 uu0VarM1603 = C0127.m1603(C0133.m1674(), false);
                    int iM780 = C0060.m780(C0061.m804(ob0Var));
                    b61 b61VarM341 = C0025.m341(ob0Var);
                    tv0 tv0VarM656 = C0050.m656(ob0Var, tv0VarM1544);
                    C0090.m1170(C0069.m903());
                    zp zpVarM74 = C0005.m74();
                    C0006.m95(ob0Var);
                    if (C0047.m618(ob0Var)) {
                        C0111.m1411(ob0Var, zpVarM74);
                    } else {
                        C0047.m624(ob0Var);
                    }
                    C0045.m601(C0102.m1303(), ob0Var, uu0VarM1603);
                    C0045.m601(C0106.m1353(), ob0Var, b61VarM341);
                    C0045.m601(C0041.m545(), ob0Var, C0066.m867(iM780));
                    C0008.m107(ob0Var, C0040.m534());
                    C0045.m601(C0020.m259(), ob0Var, tv0VarM656);
                    ys1 ys1VarM1108 = C0086.m1108();
                    C0068.m887(C0143.m1806(this), null, C0119.m1502(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108))), 0L, null, 0L, null, 0L, 0, false, 0, 0, C0132.m1661(C0113.m1434((ju0) C0065.m844(ob0Var, ys1VarM1108))), ob0Var, 0, 0, 131066);
                    C0062.m815(ob0Var, true);
                }
                break;
            case 1:
                C0090.m1170((Integer) obj2);
                C0112.m1423(strM1806, (ob0) obj, C0002.m29(1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ob0 ob0Var2 = (ob0) obj;
                int iM12142 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var2, iM12142 & 1, (iM12142 & 3) != 2)) {
                    C0066.m868(ob0Var2);
                } else {
                    C0068.m887(C0143.m1806(this), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var2, 0, 0, 262142);
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ob0 ob0Var3 = (ob0) obj;
                int iM12143 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var3, iM12143 & 1, (iM12143 & 3) != 2)) {
                    C0066.m868(ob0Var3);
                } else {
                    C0068.m887(C0143.m1806(this), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var3, 0, 0, 262142);
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ob0 ob0Var4 = (ob0) obj;
                int iM12144 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var4, iM12144 & 1, (iM12144 & 3) != 2)) {
                    C0066.m868(ob0Var4);
                } else {
                    C0068.m887(C0143.m1806(this), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var4, 0, 0, 262142);
                }
                break;
            default:
                ob0 ob0Var5 = (ob0) obj;
                int iM12145 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var5, iM12145 & 1, (iM12145 & 3) != 2)) {
                    C0066.m868(ob0Var5);
                } else {
                    StringBuilder sb = new StringBuilder(C0141.m1780(m1948(), 0, 1, 2313));
                    C0062.m817(sb, strM1806);
                    C0068.m887(C0053.m699(sb), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ob0Var5, 0, 0, 262142);
                }
                break;
        }
        return t32VarM956;
    }

    public /* synthetic */ td(String str, int i, byte b) {
        this.e = i;
        this.f = str;
    }
}
