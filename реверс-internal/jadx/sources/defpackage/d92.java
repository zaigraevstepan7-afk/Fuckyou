package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d92 implements c92 {
    public final ix b;

    public d92() {
        this.b = Build.VERSION.SDK_INT >= 34 ? jx.e : v20.B;
        hk.j(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
