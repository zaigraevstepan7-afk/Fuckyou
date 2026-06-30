package defpackage;

import android.text.C0015;
import androidx.core.app.C0037;
import androidx.profileinstaller.C0062;
import androidx.versionedparcelable.C0074;
import com.google.android.material.appbar.C0085;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.behavior.C0092;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.snackbar.C0135;
import com.reddit.frontpage.C0148;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq implements sa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f176short = {945};
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX INFO: renamed from: ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m1922() {
        if (C0148.m1860() >= 0) {
            return f176short;
        }
        return null;
    }

    public /* synthetic */ kq(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int iM1191 = C0092.m1191(this);
        t32 t32VarM956 = C0074.m956();
        String strM1316 = C0103.m1316(this);
        switch (iM1191) {
            case 0:
                String str = (String) obj;
                C0090.m1170(str);
                StringBuilder sb = new StringBuilder();
                C0062.m817(sb, strM1316);
                C0062.m817(sb, C0096.m1238(m1922(), 0, 1, 926));
                C0062.m817(sb, str);
                break;
            case 1:
                C0098.m1262();
                zl1 zl1VarM491 = C0037.m491();
                ck0 ck0Var = C0098.m1262()[2];
                C0091.m1187((am1) obj, zl1VarM491, strM1316);
                break;
            default:
                am1 am1Var = (am1) obj;
                C0098.m1262();
                C0091.m1187(am1Var, C0015.m200(), C0085.m1102(strM1316));
                C0135.m1698(am1Var, 5);
                break;
        }
        return t32VarM956;
    }
}
