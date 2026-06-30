package defpackage;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0006;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0010;
import android.view.translation.C0017;
import androidx.appcompat.widget.C0033;
import androidx.core.app.C0039;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0066;
import androidx.startup.C0069;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0076;
import androidx.window.reflection.C0079;
import androidx.window.reflection.C0080;
import androidx.window.reflection.C0083;
import com.google.android.material.appbar.C0087;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.carousel.C0108;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.floatingactionbutton.C0115;
import com.google.android.material.focus.C0119;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dr implements ya0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ rd g;
    public final /* synthetic */ sa0 h;
    public final /* synthetic */ nt0 i;
    public final /* synthetic */ sa0 j;
    public final /* synthetic */ fy0 k;
    public final /* synthetic */ fy0 l;
    public final /* synthetic */ fy0 m;
    public final /* synthetic */ wa0 n;
    public final /* synthetic */ String o;

    @Override // defpackage.ya0
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        jm0 jm0Var = (jm0) obj;
        int iM1013 = C0079.m1013((Number) obj2);
        ob0 ob0Var = (ob0) obj3;
        int iM10132 = C0079.m1013((Number) obj4);
        if ((iM10132 & 6) == 0) {
            i = (C0105.m1346(ob0Var, jm0Var) ? 4 : 2) | iM10132;
        } else {
            i = iM10132;
        }
        if ((iM10132 & 48) == 0) {
            i |= C0010.m133(ob0Var, iM1013) ? 32 : 16;
        }
        int i2 = 0;
        if (C0008.m117(ob0Var, i & 1, (i & 147) != 146)) {
            iq iqVar = (iq) C0039.m521(C0076.m984(this), iM1013);
            C0096.m1240(ob0Var, -1456997504);
            int iM93 = C0006.m93(C0017.m227(this));
            rd rdVarM438 = C0033.m438(this);
            boolean zM1449 = C0114.m1449(ob0Var, rdVarM438) | C0105.m1346(ob0Var, iqVar) | C0105.m1346(ob0Var, C0069.m909(this));
            Object objM1131 = C0087.m1131(ob0Var);
            l91 l91VarM36 = C0002.m36();
            if (zM1449 || objM1131 == l91VarM36) {
                xq xqVar = new xq(rdVarM438, iqVar, C0069.m909(this), C0074.m960(this), C0080.m1034(this));
                C0079.m1012(ob0Var, xqVar);
                objM1131 = xqVar;
            }
            ha0 ha0Var = (ha0) objM1131;
            boolean zM1346 = C0105.m1346(ob0Var, iqVar);
            Object objM11312 = C0087.m1131(ob0Var);
            if (zM1346 || objM11312 == l91VarM36) {
                objM11312 = new zq(iqVar, C0074.m960(this));
                C0079.m1012(ob0Var, objM11312);
            }
            ha0 ha0Var2 = (ha0) objM11312;
            boolean zM13462 = C0105.m1346(ob0Var, iqVar);
            nt0 nt0VarM1503 = C0119.m1503(this);
            boolean zM14492 = zM13462 | C0114.m1449(ob0Var, nt0VarM1503);
            Object objM11313 = C0087.m1131(ob0Var);
            if (zM14492 || objM11313 == l91VarM36) {
                objM11313 = new yq(iqVar, nt0VarM1503, C0108.m1376(this));
                C0079.m1012(ob0Var, objM11313);
            }
            ha0 ha0Var3 = (ha0) objM11313;
            sa0 sa0VarM526 = C0039.m526(this);
            boolean zM13463 = C0105.m1346(ob0Var, sa0VarM526) | C0105.m1346(ob0Var, iqVar);
            Object objM11314 = C0087.m1131(ob0Var);
            if (zM13463 || objM11314 == l91VarM36) {
                objM11314 = new zq(sa0VarM526, iqVar, i2);
                C0079.m1012(ob0Var, objM11314);
            }
            C0115.m1461(iqVar, iM1013, iM93, ha0Var, ha0Var2, ha0Var3, (ha0) objM11314, C0083.m1064(1919874052, new br(rdVarM438, iqVar, C0006.m97(this), C0119.m1501(this), C0069.m909(this)), ob0Var), null, ob0Var, (i & 112) | 12582912);
            C0062.m815(ob0Var, false);
        } else {
            C0066.m868(ob0Var);
        }
        return C0074.m956();
    }

    public dr(List list, List list2, rd rdVar, sa0 sa0Var, nt0 nt0Var, sa0 sa0Var2, fy0 fy0Var, fy0 fy0Var2, fy0 fy0Var3, wa0 wa0Var, String str) {
        this.e = list;
        this.f = list2;
        this.g = rdVar;
        this.h = sa0Var;
        this.i = nt0Var;
        this.j = sa0Var2;
        this.k = fy0Var;
        this.l = fy0Var2;
        this.m = fy0Var3;
        this.n = wa0Var;
        this.o = str;
    }
}
