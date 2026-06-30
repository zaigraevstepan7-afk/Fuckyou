package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f11 implements OnBackAnimationCallback {
    public final /* synthetic */ g11 a;

    public f11(g11 g11Var) {
        this.a = g11Var;
    }

    public final void onBackCancelled() {
        g11 g11Var = this.a;
        wy0 wy0Var = g11Var.a;
        if (wy0Var == null) {
            yc.l("This input is not added to any dispatcher.");
            return;
        }
        if (!g11Var.b) {
            wy0Var.e(g11Var, null);
        }
        wy0Var.d();
        if (wy0Var.c) {
            cz0 cz0Var = wy0Var.d;
            cz0Var.getClass();
            if (g11Var.equals(cz0Var.h) && -1 == cz0Var.g) {
                yy0 yy0VarC = cz0Var.f;
                if (yy0VarC == null) {
                    yy0VarC = cz0Var.c(-1);
                }
                cz0Var.f = null;
                cz0Var.g = 0;
                cz0Var.h = null;
                if (yy0VarC != null) {
                    yy0VarC.b();
                }
                qs1 qs1Var = cz0Var.a;
                qs1Var.getClass();
                qs1Var.k(null, dz0.d);
            }
        }
        g11Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        vy0 vy0VarS = al.S(backEvent);
        g11 g11Var = this.a;
        wy0 wy0Var = g11Var.a;
        if (wy0Var == null) {
            yc.l("This input is not added to any dispatcher.");
            return;
        }
        if (g11Var.b) {
            wy0Var.d();
            if (wy0Var.c) {
                cz0 cz0Var = wy0Var.d;
                cz0Var.getClass();
                if (g11Var.equals(cz0Var.h) && -1 == cz0Var.g) {
                    yy0 yy0VarC = cz0Var.f;
                    if (yy0VarC == null) {
                        yy0VarC = cz0Var.c(-1);
                    }
                    if (yy0VarC != null) {
                        yy0VarC.d(vy0VarS);
                    }
                    qs1 qs1Var = cz0Var.a;
                    ez0 ez0Var = new ez0(vy0VarS);
                    qs1Var.getClass();
                    qs1Var.k(null, ez0Var);
                }
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        vy0 vy0VarS = al.S(backEvent);
        g11 g11Var = this.a;
        wy0 wy0Var = g11Var.a;
        if (wy0Var == null) {
            yc.l("This input is not added to any dispatcher.");
        } else {
            if (g11Var.b) {
                return;
            }
            wy0Var.e(g11Var, vy0VarS);
            g11Var.b = true;
        }
    }
}
