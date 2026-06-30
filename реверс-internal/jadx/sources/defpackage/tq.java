package defpackage;

import android.net.Uri;
import android.text.C0011;
import android.view.translation.C0019;
import android.view.translation.C0020;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0038;
import androidx.versionedparcelable.C0074;
import com.google.android.material.appbar.C0086;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.carousel.C0110;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.snackbar.C0138;
import com.reddit.frontpage.C0148;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tq implements sa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f202short = {595, 626, 633, 632, 573, 628, 622, 573, 627, 626, 617, 573, 636, 573, 602, 632, 622, 617, 616, 623, 632, 595, 626, 633, 632, 573, 628, 627, 622, 617, 636, 627, 638, 632};
    public final /* synthetic */ int e;
    public final /* synthetic */ sa0 f;

    /* JADX INFO: renamed from: ۣۦۣ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1949() {
        if (C0011.m150() < 0) {
            return f202short;
        }
        return null;
    }

    public /* synthetic */ tq(sa0 sa0Var, int i) {
        this.e = i;
        this.f = sa0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        f20 f20Var;
        int iM1671 = C0133.m1671(this);
        sa0 sa0VarM260 = C0020.m260(this);
        switch (iM1671) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    C0110.m1395(sa0VarM260, uri);
                }
                return C0074.m956();
            case 1:
                h20 h20Var = (h20) obj;
                return C0148.m1853((h20Var == null || (f20Var = (f20) C0110.m1395(sa0VarM260, h20Var)) == null) ? 50.0d : C0103.m1317(f20Var, h20Var));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                i22 i22Var = (i22) obj;
                if (!(i22Var instanceof bc0)) {
                    C0087.m1132(C0088.m1148(m1949(), 0, 34, 541));
                    return null;
                }
                ac0 ac0VarM505 = C0038.m505((bc0) i22Var);
                ac0 ac0Var = ac0VarM505 != null ? ac0VarM505 : null;
                return C0035.m467(ac0Var == null ? true : C0138.m1736((Boolean) C0110.m1395(sa0VarM260, ac0Var)));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                sp1 sp1Var = (sp1) C0110.m1395(sa0VarM260, (yp1) obj);
                synchronized (C0105.m1347()) {
                    aq1.d = C0019.m252(C0086.m1118(), C0132.m1670(sp1Var));
                }
                return sp1Var;
            default:
                Long l = (Long) obj;
                C0090.m1170(l);
                return C0110.m1395(sa0VarM260, l);
        }
    }
}
