package defpackage;

import android.support.v4.app.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0011;
import android.text.C0015;
import android.view.C0023;
import android.view.C0025;
import android.view.translation.C0018;
import android.view.translation.C0020;
import androidx.core.app.C0040;
import androidx.core.app.C0041;
import androidx.core.app.C0043;
import androidx.core.graphics.drawable.C0045;
import androidx.core.graphics.drawable.C0047;
import androidx.core.widget.C0050;
import androidx.core.widget.C0052;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0061;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0066;
import androidx.recyclerview.widget.C0068;
import androidx.startup.C0069;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0083;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.carousel.C0109;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.search.C0127;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.transformation.C0143;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc implements xa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f191short = {2355, 2339, 2354, 2341, 2341, 2350};
    public final /* synthetic */ fy0 e;
    public final /* synthetic */ lr0 f;
    public final /* synthetic */ ns1 g;
    public final /* synthetic */ ns1 h;
    public final /* synthetic */ ns1 i;
    public final /* synthetic */ ns1 j;
    public final /* synthetic */ ns1 k;

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1937() {
        if (C0079.m1016() <= 0) {
            return f191short;
        }
        return null;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        c41 c41Var = (c41) obj;
        ob0 ob0Var = (ob0) obj2;
        int iM1214 = C0094.m1214((Integer) obj3);
        C0090.m1170(c41Var);
        if ((iM1214 & 6) == 0) {
            iM1214 |= C0105.m1346(ob0Var, c41Var) ? 4 : 2;
        }
        if (C0008.m117(ob0Var, iM1214 & 1, (iM1214 & 19) != 18)) {
            tv0 tv0VarM576 = C0043.m576(C0023.m320(), c41Var);
            uu0 uu0VarM1603 = C0127.m1603(C0133.m1674(), false);
            int iM780 = C0060.m780(C0061.m804(ob0Var));
            b61 b61VarM341 = C0025.m341(ob0Var);
            tv0 tv0VarM656 = C0050.m656(ob0Var, tv0VarM576);
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
            fy0 fy0VarM199 = C0015.m199(this);
            C0094.m1220((vi1) C0068.m885(fy0VarM199), null, null, null, C0109.m1379(m1937(), 0, 6, 2368), null, C0083.m1064(1520215118, new rc(C0023.m307(this), fy0VarM199, C0011.m138(this), C0052.m684(this), C0143.m1798(this), C0018.m238(this), C0112.m1425(this)), ob0Var), ob0Var, 1597440);
            C0062.m815(ob0Var, true);
        } else {
            C0066.m868(ob0Var);
        }
        return C0074.m956();
    }

    public /* synthetic */ qc(fy0 fy0Var, lr0 lr0Var, fy0 fy0Var2, fy0 fy0Var3, fy0 fy0Var4, fy0 fy0Var5, fy0 fy0Var6) {
        this.e = fy0Var;
        this.f = lr0Var;
        this.g = fy0Var2;
        this.h = fy0Var3;
        this.i = fy0Var4;
        this.j = fy0Var5;
        this.k = fy0Var6;
    }
}
