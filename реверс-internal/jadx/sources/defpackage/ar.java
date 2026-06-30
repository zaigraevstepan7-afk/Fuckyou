package defpackage;

import android.app.C0001;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0008;
import android.view.translation.C0018;
import androidx.appcompat.widget.C0031;
import androidx.graphics.path.C0055;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0063;
import androidx.recyclerview.widget.C0066;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0075;
import androidx.versionedparcelable.C0077;
import androidx.window.reflection.C0079;
import com.google.android.material.appbar.C0085;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0091;
import com.google.android.material.focus.C0118;
import com.google.android.material.focus.C0119;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0145;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ar implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f84short = {605, 608, 634, 609, 619, 618, 619, 545, 604, 635, 608, 639, 2644, 2675, 2664, 2679, 2890, 2934, 2939, 2915};
    public final /* synthetic */ boolean e;

    /* JADX INFO: renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m1073() {
        if (C0118.m1484() > 0) {
            return f84short;
        }
        return null;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ye0 ye0VarM1705;
        ob0 ob0Var = (ob0) obj;
        int iM1013 = C0079.m1013((Number) obj2);
        if (C0008.m117(ob0Var, iM1013 & 1, (iM1013 & 3) != 2)) {
            boolean zM989 = C0077.m989(this);
            if (zM989) {
                ye0VarM1705 = C0060.m794();
                if (ye0VarM1705 == null) {
                    xe0 xe0Var = new xe0(C0091.m1184(m1073(), 0, 12, 527), 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    C0055.m724();
                    uq1 uq1Var = new uq1(C0004.m57());
                    y41 y41Var = new y41(0);
                    C0063.m830(y41Var, 8.0f, 6.0f);
                    C0001.m14(y41Var, 8.0f);
                    C0086.m1110(y41Var, 1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                    C0072.m931(y41Var, 8.0f);
                    C0086.m1110(y41Var, 0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                    C0145.m1820(y41Var, 8.0f);
                    C0086.m1110(y41Var, -1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                    C0154.m2009(y41Var, 8.0f);
                    C0086.m1110(y41Var, 0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                    C0018.m239(y41Var);
                    C0075.m966(xe0Var, (ArrayList) C0085.m1096(y41Var), uq1Var);
                    ye0VarM1705 = C0138.m1739(xe0Var);
                    af1.a = ye0VarM1705;
                }
            } else {
                ye0VarM1705 = C0135.m1705();
            }
            C0031.m415(ye0VarM1705, zM989 ? C0131.m1658(m1073(), 12, 4, 2567) : C0119.m1508(m1073(), 16, 4, 2842), null, 0L, ob0Var, 0, 12);
        } else {
            C0066.m868(ob0Var);
        }
        return C0074.m956();
    }

    public ar(boolean z) {
        this.e = z;
    }
}
