package defpackage;

import com.reddit.frontpage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fp extends r {
    public final v41 n;
    public boolean o;

    public fp(MainActivity mainActivity) {
        super(mainActivity);
        this.n = xc.B(null);
    }

    @Override // defpackage.r
    public final void b(ob0 ob0Var, int i) {
        ob0Var.X(420213850);
        int i2 = 4;
        int i3 = (ob0Var.h(this) ? 4 : 2) | i;
        if (ob0Var.N(i3 & 1, (i3 & 3) != 2)) {
            wa0 wa0Var = (wa0) this.n.getValue();
            if (wa0Var == null) {
                ob0Var.W(-1238823553);
            } else {
                ob0Var.W(98585282);
                wa0Var.h(ob0Var, 0);
            }
            ob0Var.p(false);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new q(this, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return fp.class.getName();
    }

    @Override // defpackage.r
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o;
    }

    public final void setContent(wa0 wa0Var) {
        this.o = true;
        this.n.setValue(wa0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
