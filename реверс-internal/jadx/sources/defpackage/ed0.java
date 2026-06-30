package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ed0 extends ot implements vw {
    public final Handler g;
    public final String h;
    public final boolean i;
    public final ed0 j;

    public ed0(Handler handler, String str, boolean z) {
        this.g = handler;
        this.h = str;
        this.i = z;
        this.j = z ? this : new ed0(handler, str, true);
    }

    @Override // defpackage.vw
    public final az c(long j, final x02 x02Var, lt ltVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(x02Var, j)) {
            return new az() { // from class: dd0
                @Override // defpackage.az
                public final void a() {
                    this.e.g.removeCallbacks(x02Var);
                }
            };
        }
        k(ltVar, x02Var);
        return j01.e;
    }

    @Override // defpackage.vw
    public final void d(long j, xi xiVar) {
        y4 y4Var = new y4(2, xiVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(y4Var, j)) {
            xiVar.x(new d(9, this, y4Var));
        } else {
            k(xiVar.i, y4Var);
        }
    }

    @Override // defpackage.ot
    public final void e(lt ltVar, Runnable runnable) {
        if (this.g.post(runnable)) {
            return;
        }
        k(ltVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ed0)) {
            return false;
        }
        ed0 ed0Var = (ed0) obj;
        return ed0Var.g == this.g && ed0Var.i == this.i;
    }

    @Override // defpackage.ot
    public final boolean f(lt ltVar) {
        return (this.i && xi0.o(Looper.myLooper(), this.g.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.g);
    }

    public final void k(lt ltVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        oj0 oj0Var = (oj0) ltVar.l(v20.O);
        if (oj0Var != null) {
            oj0Var.a(cancellationException);
        }
        lw lwVar = qy.a;
        fw.g.e(ltVar, runnable);
    }

    @Override // defpackage.ot
    public final String toString() {
        ed0 ed0Var;
        String str;
        lw lwVar = qy.a;
        ed0 ed0Var2 = kt0.a;
        if (this == ed0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ed0Var = ed0Var2.j;
            } catch (UnsupportedOperationException unused) {
                ed0Var = null;
            }
            str = this == ed0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.h;
        if (string == null) {
            string = this.g.toString();
        }
        if (!this.i) {
            return string;
        }
        return string + ".immediate";
    }

    public ed0(Handler handler) {
        this(handler, null, false);
    }
}
