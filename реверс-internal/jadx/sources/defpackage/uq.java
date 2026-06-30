package defpackage;

import androidx.appcompat.widget.C0031;
import androidx.core.graphics.drawable.C0047;
import androidx.profileinstaller.C0064;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.snackbar.C0135;
import com.google.android.material.transformation.C0143;
import com.reddit.frontpage.C0147;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uq implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ha0 f;

    public /* synthetic */ uq(ha0 ha0Var, int i) {
        this.e = i;
        this.f = ha0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int iM1803 = C0143.m1803(this);
        ha0 ha0VarM842 = C0064.m842(this);
        switch (iM1803) {
            case 0:
                C0090.m1170((zy) obj);
                return new j2(6, ha0VarM842);
            case 1:
                return (w01) C0031.m405(ha0VarM842);
            default:
                am1 am1Var = (am1) obj;
                Object objM405 = C0031.m405(ha0VarM842);
                if (C0147.m1848(C0072.m941((Number) objM405))) {
                    objM405 = null;
                }
                Float f = (Float) objM405;
                float fM1702 = f != null ? C0135.m1702(f) : 0.0f;
                if (fM1702 < 0.0f) {
                    fM1702 = 0.0f;
                }
                if (fM1702 > 1.0f) {
                    fM1702 = 1.0f;
                }
                fb1 fb1Var = new fb1(fM1702, new fl(0.0f, 1.0f));
                C0098.m1262();
                zl1 zl1VarM627 = C0047.m627();
                ck0 ck0Var = C0098.m1262()[1];
                C0091.m1187(am1Var, zl1VarM627, fb1Var);
                return C0074.m956();
        }
    }
}
