package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p3 implements yk {
    public final xg0 a;

    public p3(xg0 xg0Var) {
        this.a = xg0Var;
    }

    public final void a(wk wkVar) {
        xg0 xg0Var = this.a;
        if (wkVar != null) {
            xg0Var.t().setPrimaryClip(wkVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            xg0Var.t().clearPrimaryClip();
        } else {
            xg0Var.t().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
