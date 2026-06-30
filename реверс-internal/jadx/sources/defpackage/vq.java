package defpackage;

import android.support.v4.graphics.drawable.C0006;
import android.support.v4.graphics.drawable.C0008;
import android.support.v4.graphics.drawable.C0009;
import android.text.C0012;
import android.view.C0023;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.graphics.drawable.C0046;
import androidx.lifecycle.C0060;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0076;
import com.google.android.material.appbar.C0087;
import com.google.android.material.behavior.C0090;
import com.google.android.material.carousel.C0109;
import com.google.android.material.carousel.C0110;
import com.google.android.material.search.C0124;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0145;
import com.reddit.frontpage.C0149;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq implements sa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f213short = {2398, 2372, 2391, 2376, 2317, 2398, 2373, 2370, 2392, 2369, 2377, 2317, 2383, 2376, 2317, 2323, 2320, 2333};
    public final /* synthetic */ List e;
    public final /* synthetic */ rd f;
    public final /* synthetic */ sa0 g;
    public final /* synthetic */ nt0 h;
    public final /* synthetic */ sa0 i;
    public final /* synthetic */ fy0 j;
    public final /* synthetic */ fy0 k;
    public final /* synthetic */ fy0 l;
    public final /* synthetic */ wa0 m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1962() {
        if (C0109.m1383() > 0) {
            return f213short;
        }
        return null;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        jn0 jn0Var = (jn0) obj;
        C0090.m1170(jn0Var);
        byte b = 0;
        pc pcVar = new pc(15, b);
        List listM1871 = C0149.m1871(this);
        int iM93 = C0006.m93(listM1871);
        cr crVar = new cr(b, pcVar, listM1871);
        kh khVar = new kh(1, listM1871);
        jo joVar = new jo(2039820996, true, new dr(listM1871, listM1871, C0087.m1125(this), C0046.m617(this), C0060.m782(this), C0008.m112(this), C0110.m1400(this), C0012.m159(this), C0145.m1819(this), C0006.m83(this), C0132.m1667(this)));
        g6 g6VarM976 = C0076.m976(jn0Var);
        oc ocVar = new oc(crVar, khVar, joVar);
        C0090.m1170(g6VarM976);
        if (iM93 < 0) {
            C0138.m1741(C0009.m120(m1962(), 0, 18, 2349));
        }
        if (iM93 != 0) {
            mi0 mi0Var = new mi0(C0023.m311(g6VarM976), iM93, ocVar);
            g6VarM976.a = C0023.m311(g6VarM976) + iM93;
            C0035.m460((iy0) C0124.m1570(g6VarM976), mi0Var);
        }
        return C0074.m956();
    }

    public /* synthetic */ vq(List list, rd rdVar, sa0 sa0Var, nt0 nt0Var, sa0 sa0Var2, fy0 fy0Var, fy0 fy0Var2, fy0 fy0Var3, wa0 wa0Var, String str) {
        this.e = list;
        this.f = rdVar;
        this.g = sa0Var;
        this.h = nt0Var;
        this.i = sa0Var2;
        this.j = fy0Var;
        this.k = fy0Var2;
        this.l = fy0Var3;
        this.m = wa0Var;
        this.n = str;
    }
}
