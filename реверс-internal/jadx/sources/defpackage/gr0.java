package defpackage;

import android.app.C0000;
import android.view.C0026;
import android.view.translation.C0020;
import androidx.appcompat.app.C0029;
import androidx.appcompat.widget.C0031;
import androidx.appcompat.widget.C0032;
import androidx.core.app.C0037;
import androidx.core.app.C0038;
import androidx.recyclerview.widget.C0067;
import androidx.startup.C0069;
import androidx.versionedparcelable.C0074;
import androidx.window.area.reflectionguard.C0078;
import androidx.window.reflection.C0081;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0089;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0112;
import com.google.android.material.focus.C0119;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.snackbar.C0137;
import com.google.android.material.transformation.C0146;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends zu1 implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f167short = {1063, 1061, 1064, 1064, 1124, 1072, 1067, 1124, 1123, 1078, 1057, 1079, 1073, 1065, 1057, 1123, 1124, 1062, 1057, 1058, 1067, 1078, 1057, 1124, 1123, 1069, 1066, 1074, 1067, 1071, 1057, 1123, 1124, 1075, 1069, 1072, 1068, 1124, 1063, 1067, 1078, 1067, 1073, 1072, 1069, 1066, 1057};
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: ۤۨۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1905() {
        if (C0112.m1424() < 0) {
            return f167short;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr0(Object obj, boolean z, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
        this.l = z;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM4 = C0000.m4(this);
        t32 t32VarM956 = C0074.m956();
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (iM4) {
        }
        return C0119.m1504((gr0) C0087.m1124(this, ksVar, vtVar), t32VarM956);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int iM4 = C0000.m4(this);
        boolean zM884 = C0067.m884(this);
        Object objM404 = C0031.m404(this);
        switch (iM4) {
            case 0:
                return new gr0((lr0) objM404, zM884, ksVar, 0);
            case 1:
                return new gr0((lr0) objM404, zM884, ksVar, 1);
            default:
                return new gr0((ry1) objM404, zM884, ksVar, 2);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        yk ykVarM427;
        int iM4 = C0000.m4(this);
        boolean zM884 = C0067.m884(this);
        String strM1230 = C0095.m1230(m1905(), 0, 47, 1092);
        wt wtVarM1005 = C0078.m1005();
        t32 t32VarM956 = C0074.m956();
        Object objM404 = C0031.m404(this);
        hb hbVarM1730 = null;
        switch (iM4) {
            case 0:
                int iM1657 = C0131.m1657(this);
                if (iM1657 != 0) {
                    if (iM1657 != 1) {
                        C0087.m1132(strM1230);
                    } else {
                        C0029.m378(obj);
                    }
                    break;
                } else {
                    C0029.m378(obj);
                    xg0 xg0VarM2016 = C0155.m2016((lr0) objM404);
                    this.j = 1;
                    if (C0129.m1636(xg0VarM2016, zM884, this) == wtVarM1005) {
                    }
                }
                break;
            case 1:
                int iM16572 = C0131.m1657(this);
                if (iM16572 != 0) {
                    if (iM16572 != 1) {
                        C0087.m1132(strM1230);
                    } else {
                        C0029.m378(obj);
                    }
                    break;
                } else {
                    C0029.m378(obj);
                    xg0 xg0VarM20162 = C0155.m2016((lr0) objM404);
                    this.j = 1;
                    if (C0107.m1361(xg0VarM20162, zM884, this) == wtVarM1005) {
                    }
                }
                break;
            default:
                ry1 ry1Var = (ry1) objM404;
                int iM16573 = C0131.m1657(this);
                if (iM16573 != 0) {
                    if (iM16573 != 1) {
                        C0087.m1132(strM1230);
                    } else {
                        C0029.m378(obj);
                    }
                    break;
                } else {
                    C0029.m378(obj);
                    if (!C0081.m1043(C0037.m494(C0038.m511(ry1Var)))) {
                        hbVarM1730 = C0137.m1730(C0038.m511(ry1Var));
                        if (zM884) {
                            int iM1180 = C0091.m1180(C0037.m494(C0038.m511(ry1Var)));
                            C0110.m1395(C0146.m1839(ry1Var), C0026.m348(C0069.m907(C0038.m511(ry1Var)), C0031.m412(iM1180, iM1180)));
                            C0089.m1149(ry1Var, C0020.m258());
                        }
                    }
                    if (hbVarM1730 != null && (ykVarM427 = C0032.m427(ry1Var)) != null) {
                        wk wkVarM1323 = C0103.m1323(hbVarM1730);
                        this.j = 1;
                        C0137.m1722((p3) ykVarM427, wkVarM1323);
                        if (t32VarM956 == wtVarM1005) {
                        }
                    }
                }
                break;
        }
        return t32VarM956;
    }
}
