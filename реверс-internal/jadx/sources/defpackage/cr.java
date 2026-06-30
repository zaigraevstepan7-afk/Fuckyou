package defpackage;

import android.view.C0023;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.translation.C0017;
import android.view.translation.C0020;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0038;
import androidx.core.app.C0039;
import androidx.core.graphics.drawable.C0046;
import androidx.core.widget.C0052;
import androidx.graphics.path.C0055;
import androidx.recyclerview.widget.C0066;
import androidx.versionedparcelable.C0074;
import androidx.window.area.reflectionguard.C0078;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0081;
import com.google.android.material.appbar.C0084;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomappbar.C0095;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.carousel.C0110;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.search.C0125;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0139;
import com.reddit.frontpage.C0149;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cr implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ cr(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long jM1746;
        boolean zM1428 = false;
        switch (C0107.m1356(this)) {
            case 0:
                int iM1013 = C0079.m1013((Number) obj);
                return C0023.m309((pc) C0125.m1581(this), C0066.m867(iM1013), C0039.m521((List) C0052.m687(this), iM1013));
            case 1:
                KeyEvent keyEventM1990 = C0153.m1990((gk0) obj);
                if (C0090.m1176((jo0) C0125.m1581(this)) == C0038.m506() && C0103.m1325(keyEventM1990) == 4 && C0149.m1874(keyEventM1990) == 1) {
                    C0081.m1042((ry1) C0052.m687(this), null);
                    zM1428 = true;
                }
                return C0035.m467(zM1428);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                yp1 yp1Var = (yp1) obj;
                synchronized (C0105.m1347()) {
                    jM1746 = C0138.m1746();
                    aq1.e = 1 + jM1746;
                }
                return new ey0(jM1746, yp1Var, (sa0) C0125.m1581(this), (sa0) C0052.m687(this));
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                tk0 tk0Var = (tk0) C0125.m1581(this);
                Object objM1758 = C0139.m1758(tk0Var);
                xi xiVar = (xi) C0052.m687(this);
                synchronized (objM1758) {
                    C0110.m1402((ArrayList) C0078.m1003(tk0Var), xiVar);
                }
                return C0074.m956();
            default:
                KeyEvent keyEventM19902 = C0153.m1990((gk0) obj);
                j80 j80Var = (j80) C0125.m1581(this);
                InputDevice inputDeviceM604 = C0046.m604(keyEventM19902);
                if (inputDeviceM604 != null && C0095.m1231(inputDeviceM604, 513) && ((!C0094.m1221(inputDeviceM604) || C0017.m224(keyEventM19902) == 33554433) && C0149.m1874(keyEventM19902) == 2 && C0017.m224(keyEventM19902) != 257)) {
                    if (C0055.m713(19, keyEventM19902)) {
                        zM1428 = C0113.m1428((m80) j80Var, 5, true);
                    } else if (C0055.m713(20, keyEventM19902)) {
                        zM1428 = C0113.m1428((m80) j80Var, 6, true);
                    } else if (C0055.m713(21, keyEventM19902)) {
                        zM1428 = C0113.m1428((m80) j80Var, 3, true);
                    } else if (C0055.m713(22, keyEventM19902)) {
                        zM1428 = C0113.m1428((m80) j80Var, 4, true);
                    } else if (C0055.m713(23, keyEventM19902)) {
                        rq1 rq1VarM1082 = C0084.m1082((jo0) C0052.m687(this));
                        if (rq1VarM1082 != null) {
                            C0020.m266((zw) rq1VarM1082);
                        }
                        zM1428 = true;
                    }
                }
                return C0035.m467(zM1428);
        }
    }
}
