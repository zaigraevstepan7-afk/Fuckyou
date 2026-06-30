package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 extends sv0 implements jk0 {
    public sa0 s;
    public sa0 t;

    @Override // defpackage.jk0
    public final boolean P(KeyEvent keyEvent) {
        sa0 sa0Var = this.s;
        if (sa0Var != null) {
            return ((Boolean) sa0Var.i(new gk0(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.jk0
    public final boolean k(KeyEvent keyEvent) {
        sa0 sa0Var = this.t;
        if (sa0Var != null) {
            return ((Boolean) sa0Var.i(new gk0(keyEvent))).booleanValue();
        }
        return false;
    }
}
