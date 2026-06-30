package defpackage;

import android.support.v4.app.C0004;
import android.support.v4.app.C0005;
import android.text.C0016;
import android.view.C0025;
import android.view.C0027;
import android.view.translation.C0019;
import androidx.appcompat.app.C0029;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0042;
import androidx.core.graphics.drawable.C0045;
import androidx.core.widget.C0053;
import androidx.lifecycle.C0059;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0066;
import androidx.startup.C0073;
import androidx.versionedparcelable.C0074;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.appbar.C0084;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.focus.C0120;
import com.google.android.material.search.C0123;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.sidesheet.C0134;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0142;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bg1 extends zu1 implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f87short = {546, 544, 557, 557, 609, 565, 558, 609, 614, 563, 548, 562, 564, 556, 548, 614, 609, 547, 548, 551, 558, 563, 548, 609, 614, 552, 559, 567, 558, 554, 548, 614, 609, 566, 552, 565, 553, 609, 546, 558, 563, 558, 564, 565, 552, 559, 548, 2757, 2750, 2739, 2811, 2750, 1534, 1411, 2102, 2168, 1690, 1683, 1688, 1693, 1695, 1684, 1744, 1735, 1735, 1735, 1744, 1746, 860, 802, 2440, 2435, 2438, 2436, 2447, 850, 850, 850};
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ String l;

    /* JADX INFO: renamed from: ۟ۦۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m1076() {
        if (C0066.m857() >= 0) {
            return f87short;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bg1(String str, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = str;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM220 = C0016.m220(this);
        t32 t32VarM956 = C0074.m956();
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (iM220) {
        }
        return C0025.m342((bg1) C0032.m423(this, ksVar, vtVar), t32VarM956);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int iM220 = C0016.m220(this);
        String strM1686 = C0134.m1686(this);
        switch (iM220) {
            case 0:
                bg1 bg1Var = new bg1(strM1686, ksVar, 0);
                bg1Var.k = obj;
                return bg1Var;
            default:
                bg1 bg1Var2 = new bg1(strM1686, ksVar, 1);
                bg1Var2.k = obj;
                return bg1Var2;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        Object oe1Var;
        Object oe1Var2;
        Object oe1Var3;
        Object objM565 = obj;
        int iM220 = C0016.m220(this);
        String strM1658 = C0131.m1658(m1076(), 0, 47, 577);
        int i = 1;
        ks ksVar = null;
        switch (iM220) {
            case 0:
                String strM1791 = C0142.m1791(m1076(), 56, 1, 1720);
                String strM1686 = C0134.m1686(this);
                String strM249 = C0019.m249(m1076(), 57, 11, 1776);
                vt vtVar = (vt) C0059.m774(this);
                wt wtVarM1005 = C0078.m1005();
                int iM793 = C0060.m793(this);
                try {
                    if (iM793 == 0) {
                        C0029.m378(objM565);
                        File file = new File(strM1686);
                        C0045.m598(file, true, false);
                        C0132.m1664(file, true, false);
                        C0078.m1006(file, true, false);
                        String strM1740 = C0138.m1740(strM1686, strM1791, C0027.m363(m1076(), 68, 2, 768));
                        StringBuilder sb = new StringBuilder(strM249);
                        C0062.m817(sb, strM1740);
                        C0062.m817(sb, strM1791);
                        String[] strArr = {C0053.m699(sb)};
                        this.k = vtVar;
                        this.j = 1;
                        C0098.m1253();
                        if (C0042.m565(C0065.m846(), new q71(strArr, ksVar, i), this) == wtVarM1005) {
                            return wtVarM1005;
                        }
                    } else {
                        if (iM793 != 1) {
                            C0087.m1132(strM1658);
                            return null;
                        }
                        C0029.m378(objM565);
                    }
                    oe1Var = C0100.m1276();
                    break;
                } catch (Throwable th) {
                    oe1Var = new oe1(th);
                }
                if (C0084.m1080(oe1Var) != null) {
                    try {
                        oe1Var2 = new Integer(C0154.m2005(C0004.m58(new ProcessBuilder(C0133.m1675(m1076(), 70, 5, 2539), C0120.m1523(m1076(), 75, 3, 869), strM1686))));
                    } catch (Throwable th2) {
                        oe1Var2 = new oe1(th2);
                    }
                    oe1Var = C0035.m467(!(oe1Var2 instanceof oe1));
                    break;
                }
                return oe1Var;
            default:
                String strM16862 = C0134.m1686(this);
                String strM1980 = C0152.m1980(m1076(), 47, 5, 2718);
                wt wtVarM10052 = C0078.m1005();
                int iM7932 = C0060.m793(this);
                try {
                    if (iM7932 == 0) {
                        C0029.m378(objM565);
                        if (C0084.m1085(new File(strM16862))) {
                            return C0100.m1276();
                        }
                        String strM947 = C0073.m947(strM16862);
                        StringBuilder sb2 = new StringBuilder(strM1980);
                        C0062.m817(sb2, strM947);
                        C0062.m817(sb2, C0123.m1551(m1076(), 52, 2, 1502));
                        String strM699 = C0053.m699(sb2);
                        this.k = null;
                        this.j = 1;
                        String[] strArr2 = {C0128.m1612(), C0073.m945(m1076(), 54, 2, 2075), strM699};
                        C0098.m1253();
                        objM565 = C0042.m565(C0065.m846(), new cg1(strArr2, 1500L, null), this);
                        if (objM565 == wtVarM10052) {
                            return wtVarM10052;
                        }
                    } else {
                        if (iM7932 != 1) {
                            C0087.m1132(strM1658);
                            return null;
                        }
                        C0029.m378(objM565);
                    }
                    oe1Var3 = C0035.m467(C0135.m1706((zf1) objM565));
                    break;
                } catch (Throwable th3) {
                    oe1Var3 = new oe1(th3);
                }
                return oe1Var3 instanceof oe1 ? C0005.m70() : oe1Var3;
        }
    }
}
