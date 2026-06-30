package defpackage;

import android.media.MediaPlayer;
import android.support.v4.app.C0002;
import android.support.v4.app.C0003;
import android.support.v4.app.C0004;
import android.view.translation.C0017;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0037;
import androidx.core.app.C0039;
import androidx.core.app.C0040;
import androidx.core.app.C0042;
import androidx.core.graphics.drawable.C0046;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0056;
import androidx.lifecycle.C0059;
import androidx.profileinstaller.C0062;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0068;
import androidx.versionedparcelable.C0074;
import androidx.window.area.reflectionguard.C0078;
import androidx.window.reflection.C0080;
import com.google.android.material.appbar.C0084;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.carousel.C0108;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.focus.C0120;
import com.google.android.material.search.C0123;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.transformation.C0142;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class er0 extends zu1 implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f162short = {2320, 2322, 2335, 2335, 2387, 2311, 2332, 2387, 2388, 2305, 2326, 2304, 2310, 2334, 2326, 2388, 2387, 2321, 2326, 2325, 2332, 2305, 2326, 2387, 2388, 2330, 2333, 2309, 2332, 2328, 2326, 2388, 2387, 2308, 2330, 2311, 2331, 2387, 2320, 2332, 2305, 2332, 2310, 2311, 2330, 2333, 2326, 2320, 2359, 2367, 2362, 2355, 2354, 2422, 2338, 2361, 2422, 2340, 2355, 2359, 2354, 2422, 1963, 1943, 1946, 1922, 1945, 1946, 1944, 1936, 2011, 1949, 1946, 1938, 1943, 1950, 1951};
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public final /* synthetic */ lr0 l;
    public final /* synthetic */ iq m;

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m1900() {
        if (C0130.m1641() >= 0) {
            return f162short;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er0(lr0 lr0Var, iq iqVar, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = lr0Var;
        this.m = iqVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM1372 = C0108.m1372(this);
        t32 t32VarM956 = C0074.m956();
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (iM1372) {
        }
        return C0113.m1440((er0) C0003.m47(this, ksVar, vtVar), t32VarM956);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (C0108.m1372(this)) {
            case 0:
                return new er0(C0142.m1784(this), C0155.m2017(this), ksVar, 0);
            default:
                er0 er0Var = new er0(C0142.m1784(this), C0155.m2017(this), ksVar, 1);
                er0Var.k = obj;
                return er0Var;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        lr0 lr0Var;
        qs1 qs1Var;
        Object objM565 = obj;
        int iM1372 = C0108.m1372(this);
        int i = 2;
        String strM2004 = C0154.m2004(m1900(), 0, 47, 2419);
        wt wtVarM1005 = C0078.m1005();
        lr0 lr0VarM1784 = C0142.m1784(this);
        iq iqVarM2017 = C0155.m2017(this);
        t32 t32VarM956 = C0074.m956();
        ks ksVar = null;
        switch (iM1372) {
            case 0:
                int iM605 = C0046.m605(this);
                if (iM605 == 0) {
                    C0029.m378(objM565);
                    xg0 xg0VarM1028 = C0080.m1028(lr0VarM1784);
                    this.k = lr0VarM1784;
                    this.j = 1;
                    C0090.m1170(xg0VarM1028);
                    C0098.m1253();
                    objM565 = C0042.m565(C0065.m846(), new e(iqVarM2017, ksVar, 9), this);
                    if (objM565 == wtVarM1005) {
                        return wtVarM1005;
                    }
                    lr0Var = lr0VarM1784;
                } else {
                    if (iM605 != 1) {
                        if (iM605 != 2) {
                            C0087.m1132(strM2004);
                            return null;
                        }
                        qs1Var = (qs1) C0004.m55(this);
                        C0029.m378(objM565);
                        C0098.m1265(qs1Var, objM565);
                        return t32VarM956;
                    }
                    lr0Var = (lr0) C0004.m55(this);
                    C0029.m378(objM565);
                }
                C0129.m1628(lr0Var, (nq) objM565);
                qs1 qs1VarM232 = C0017.m232(lr0VarM1784);
                xg0 xg0VarM10282 = C0080.m1028(lr0VarM1784);
                rd rdVarM841 = C0064.m841(lr0VarM1784);
                this.k = qs1VarM232;
                this.j = 2;
                Object objM1447 = C0114.m1447(xg0VarM10282, rdVarM841, this);
                if (objM1447 == wtVarM1005) {
                    return wtVarM1005;
                }
                objM565 = objM1447;
                qs1Var = qs1VarM232;
                C0098.m1265(qs1Var, objM565);
                return t32VarM956;
            default:
                vt vtVar = (vt) C0004.m55(this);
                int iM6052 = C0046.m605(this);
                if (iM6052 == 0) {
                    C0029.m378(objM565);
                    xg0 xg0VarM10283 = C0080.m1028(lr0VarM1784);
                    this.k = vtVar;
                    this.j = 1;
                    C0090.m1170(xg0VarM10283);
                    C0098.m1253();
                    objM565 = C0042.m565(C0065.m846(), new l6(iqVarM2017, xg0VarM10283, ksVar, i), this);
                    if (objM565 == wtVarM1005) {
                        return wtVarM1005;
                    }
                } else {
                    if (iM6052 != 1) {
                        C0087.m1132(strM2004);
                        return null;
                    }
                    C0029.m378(objM565);
                }
                File file = (File) objM565;
                qs1 qs1VarM43 = C0002.m43(lr0VarM1784);
                qs1 qs1VarM512 = C0039.m512(lr0VarM1784);
                qs1 qs1VarM432 = C0002.m43(lr0VarM1784);
                if (C0084.m1079(C0123.m1561(qs1VarM43), C0037.m490(iqVarM2017))) {
                    if (file == null) {
                        C0098.m1265(qs1VarM432, null);
                        String strM1189 = C0091.m1189(iqVarM2017);
                        StringBuilder sb = new StringBuilder(C0068.m886(m1900(), 47, 15, 2390));
                        C0062.m817(sb, strM1189);
                        u2 u2Var = new u2(13, null, C0053.m699(sb));
                        C0090.m1170(qs1VarM512);
                        C0120.m1520(qs1VarM512, null, u2Var);
                    } else {
                        try {
                            MediaPlayer mediaPlayer = new MediaPlayer();
                            C0059.m768(mediaPlayer, C0053.m691(file));
                            C0084.m1081(mediaPlayer, new ir0(lr0VarM1784, mediaPlayer));
                            C0064.m831(mediaPlayer, new jr0(lr0VarM1784, mediaPlayer));
                            C0056.m740(mediaPlayer, new kr0(lr0VarM1784, mediaPlayer, vtVar));
                            lr0VarM1784.p = mediaPlayer;
                            C0056.m733(mediaPlayer);
                        } catch (Exception e) {
                            if (C0084.m1079(C0123.m1561(qs1VarM432), C0037.m490(iqVarM2017))) {
                                C0098.m1265(qs1VarM432, null);
                            }
                            C0131.m1650(lr0VarM1784);
                            String strM532 = C0040.m532(e);
                            if (strM532 == null) {
                                strM532 = C0068.m886(m1900(), 62, 15, 2043);
                            }
                            u2 u2Var2 = new u2(13, null, strM532);
                            C0090.m1170(qs1VarM512);
                            C0120.m1520(qs1VarM512, null, u2Var2);
                        }
                    }
                    break;
                }
                return t32VarM956;
        }
    }
}
