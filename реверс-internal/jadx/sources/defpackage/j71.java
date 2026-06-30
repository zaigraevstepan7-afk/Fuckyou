package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j71 implements h71 {
    public static final j71 b = new j71(0);
    public static final j71 c = new j71(1);
    public final /* synthetic */ int a;

    public /* synthetic */ j71(int i) {
        this.a = i;
    }

    @Override // defpackage.h71
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.h71
    public final g71 b(View view, hx hxVar) {
        switch (this.a) {
            case 0:
                return new i71(new Magnifier(view));
            default:
                return new k71(new Magnifier(view));
        }
    }
}
