package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zo implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((jr1) obj).a(null);
                break;
            default:
                ry1 ry1Var = (ry1) obj;
                if (ry1Var != null) {
                    jo0 jo0Var = ry1Var.d;
                    if (jo0Var != null) {
                        jo0Var.e(wz1.b);
                    }
                    jo0 jo0Var2 = ry1Var.d;
                    if (jo0Var2 != null) {
                        jo0Var2.f(wz1.b);
                    }
                }
                break;
        }
    }
}
