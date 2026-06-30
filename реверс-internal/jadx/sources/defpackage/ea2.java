package defpackage;

import android.support.v4.graphics.drawable.C0007;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0016;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0040;
import androidx.core.app.C0042;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0066;
import androidx.recyclerview.widget.C0067;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0083;
import com.google.android.material.appbar.C0085;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0094;
import com.google.android.material.carousel.C0109;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.floatingactionbutton.C0115;
import com.google.android.material.search.C0123;
import com.google.android.material.search.C0124;
import com.google.android.material.sidesheet.C0133;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea2 implements wa0 {
    public final /* synthetic */ ye0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ ha0 j;
    public final /* synthetic */ ha0 k;
    public final /* synthetic */ String l;

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ob0 ob0Var = (ob0) obj;
        int iM1214 = C0094.m1214((Integer) obj2);
        if (C0008.m117(ob0Var, iM1214 & 1, (iM1214 & 3) != 2)) {
            ys1 ys1VarM1108 = C0086.m1108();
            kg1 kg1VarM563 = C0042.m563(C0035.m468((ju0) C0065.m844(ob0Var, ys1VarM1108)));
            long jM1459 = C0115.m1459(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)));
            C0007.m101();
            C0032.m424(null, kg1VarM563, jM1459, 0L, C0083.m1064(-1378949716, new ba2(C0123.m1553(this), C0109.m1390(this), C0113.m1437(this), C0067.m875(this), C0040.m539(this), C0085.m1100(this), C0124.m1572(this), C0016.m211(this)), ob0Var), ob0Var, 12582912, 105);
        } else {
            C0066.m868(ob0Var);
        }
        return C0074.m956();
    }

    public /* synthetic */ ea2(ye0 ye0Var, long j, long j2, String str, String str2, ha0 ha0Var, ha0 ha0Var2, String str3) {
        this.e = ye0Var;
        this.f = j;
        this.g = j2;
        this.h = str;
        this.i = str2;
        this.j = ha0Var;
        this.k = ha0Var2;
        this.l = str3;
    }
}
