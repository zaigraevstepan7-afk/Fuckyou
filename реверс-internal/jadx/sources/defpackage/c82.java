package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c82 {
    public final p82 a;
    public eh0[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public c82(p82 p82Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = p82Var;
        c(p82Var);
    }

    public final void a() {
        eh0[] eh0VarArr = this.b;
        if (eh0VarArr != null) {
            eh0 eh0VarH = eh0VarArr[0];
            eh0 eh0VarH2 = eh0VarArr[1];
            p82 p82Var = this.a;
            if (eh0VarH2 == null) {
                eh0VarH2 = p82Var.a.h(2);
            }
            if (eh0VarH == null) {
                eh0VarH = p82Var.a.h(1);
            }
            h(eh0.a(eh0VarH, eh0VarH2));
            eh0 eh0Var = this.b[xc.x(16)];
            if (eh0Var != null) {
                g(eh0Var);
            }
            eh0 eh0Var2 = this.b[xc.x(32)];
            if (eh0Var2 != null) {
                e(eh0Var2);
            }
            eh0 eh0Var3 = this.b[xc.x(64)];
            if (eh0Var3 != null) {
                i(eh0Var3);
            }
        }
    }

    public abstract p82 b();

    public void c(p82 p82Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listE = p82Var.a.e(i);
            int iX = xc.x(i);
            this.c[iX] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i != 8) {
                List<Rect> listF = p82Var.a.f(i);
                this.d[iX] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i, eh0 eh0Var) {
        if (this.b == null) {
            this.b = new eh0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[xc.x(i2)] = eh0Var;
            }
        }
    }

    public abstract void f(eh0 eh0Var);

    public abstract void h(eh0 eh0Var);

    public c82() {
        this(new p82());
    }

    public void e(eh0 eh0Var) {
    }

    public void g(eh0 eh0Var) {
    }

    public void i(eh0 eh0Var) {
    }
}
