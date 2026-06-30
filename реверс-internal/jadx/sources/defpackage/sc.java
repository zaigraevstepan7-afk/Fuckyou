package defpackage;

import android.net.Uri;
import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0007;
import android.text.C0010;
import android.view.C0021;
import android.view.C0022;
import android.view.C0026;
import android.view.C0027;
import android.view.translation.C0020;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0035;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.graphics.drawable.C0048;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0057;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0067;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0080;
import androidx.window.reflection.C0082;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0115;
import com.google.android.material.transformation.C0144;
import com.google.android.material.transformation.C0146;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc extends hb0 implements wa0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        boolean zM839;
        int iM356 = C0026.m356(this);
        ks ksVar = null;
        t32 t32VarM956 = C0074.m956();
        Object objM635 = C0048.m635(this);
        switch (iM356) {
            case 0:
                iq iqVar = (iq) obj;
                Uri uri = (Uri) obj2;
                C0090.m1170(iqVar);
                C0090.m1170(uri);
                lr0 lr0Var = (lr0) objM635;
                C0090.m1170(lr0Var);
                C0067.m883(C0007.m106(lr0Var), null, null, new m6(lr0Var, iqVar, uri, null, 11), 3);
                break;
            case 1:
                xg0 xg0VarM1028 = C0080.m1028((lr0) objM635);
                C0090.m1170(xg0VarM1028);
                C0098.m1253();
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                iq iqVar2 = (iq) obj;
                String str = (String) obj2;
                C0090.m1170(iqVar2);
                C0090.m1170(str);
                lr0 lr0Var2 = (lr0) objM635;
                C0090.m1170(lr0Var2);
                C0067.m883(C0007.m106(lr0Var2), null, null, new m6(lr0Var2, iqVar2, str, null, 12), 3);
                break;
            default:
                v80 v80Var = (v80) obj;
                v80 v80Var2 = (v80) obj2;
                z80 z80Var = (z80) objM635;
                if (C0021.m286(z80Var) && (zM839 = C0064.m839(v80Var2)) != C0064.m839(v80Var)) {
                    sa0 sa0VarM1837 = C0146.m1837(z80Var);
                    if (sa0VarM1837 != null) {
                        C0110.m1395(sa0VarM1837, C0035.m467(zM839));
                    }
                    wr wrVarM263 = C0020.m263();
                    if (zM839) {
                        C0067.m883(C0027.m366(z80Var), null, null, new tv(z80Var, ksVar, 1), 3);
                        zc1 zc1Var = new zc1();
                        C0022.m294(z80Var, new f8(9, zc1Var, z80Var));
                        xm0 xm0Var = (xm0) C0144.m1808(zc1Var);
                        if (xm0Var != null) {
                            C0115.m1453(xm0Var);
                        } else {
                            xm0Var = null;
                        }
                        z80Var.x = xm0Var;
                        c01 c01VarM1340 = C0105.m1340(z80Var);
                        if (c01VarM1340 != null && C0021.m286(C0010.m126(c01VarM1340)) && C0021.m286(z80Var)) {
                            C0057.m746(z80Var, wrVarM263);
                        }
                    } else {
                        xm0 xm0VarM700 = C0053.m700(z80Var);
                        if (xm0VarM700 != null) {
                            C0036.m480(xm0VarM700);
                        }
                        z80Var.x = null;
                        if (C0021.m286(z80Var)) {
                            C0057.m746(z80Var, wrVarM263);
                        }
                    }
                    C0036.m472(z80Var);
                    jx0 jx0VarM431 = C0032.m431(z80Var);
                    if (jx0VarM431 != null) {
                        c80 c80VarM35 = C0002.m35(z80Var);
                        if (zM839) {
                            if (c80VarM35 != null) {
                                C0082.m1055(z80Var, jx0VarM431, new d80(c80VarM35));
                                z80Var.w = null;
                            }
                            c80 c80Var = new c80();
                            C0082.m1055(z80Var, jx0VarM431, c80Var);
                            z80Var.w = c80Var;
                        } else if (c80VarM35 != null) {
                            C0082.m1055(z80Var, jx0VarM431, new d80(c80VarM35));
                            z80Var.w = null;
                        }
                    }
                }
                break;
        }
        return t32VarM956;
    }
}
