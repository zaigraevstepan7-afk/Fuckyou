package defpackage;

import android.text.InputFilter;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w30 extends lk {
    public final v30 b;

    public w30(ic icVar) {
        this.b = new v30(icVar);
    }

    @Override // defpackage.lk
    public final InputFilter[] O(InputFilter[] inputFilterArr) {
        return !g30.d() ? inputFilterArr : this.b.O(inputFilterArr);
    }

    @Override // defpackage.lk
    public final void g0(boolean z) {
        if (g30.d()) {
            this.b.g0(z);
        }
    }

    @Override // defpackage.lk
    public final void h0(boolean z) {
        boolean zD = g30.d();
        v30 v30Var = this.b;
        if (zD) {
            v30Var.h0(z);
        } else {
            v30Var.d = z;
        }
    }
}
