package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pi implements Runnable {
    public final /* synthetic */ int e;
    public Object f;
    public final /* synthetic */ Object g;

    public pi(gp0 gp0Var, Runnable runnable) {
        this.e = 1;
        this.g = gp0Var;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                y41 y41Var = (y41) this.f;
                Typeface typeface = (Typeface) this.g;
                zb zbVar = (zb) y41Var.f;
                if (zbVar != null) {
                    zbVar.k(typeface);
                    return;
                }
                return;
            case 1:
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f).run();
                    } catch (Throwable th) {
                        al.B(d40.e, th);
                    }
                    Runnable runnableK = ((gp0) this.g).k();
                    if (runnableK == null) {
                        return;
                    }
                    try {
                        this.f = runnableK;
                        i++;
                        if (i >= 16) {
                            gp0 gp0Var = (gp0) this.g;
                            if (s22.J(gp0Var.h, gp0Var)) {
                                gp0 gp0Var2 = (gp0) this.g;
                                s22.I(gp0Var2.h, gp0Var2, this);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        gp0 gp0Var3 = (gp0) this.g;
                        synchronized (gp0Var3.k) {
                            gp0.l.decrementAndGet(gp0Var3);
                            throw th2;
                        }
                    }
                    break;
                }
                break;
            default:
                ((o90) this.f).a(this.g);
                return;
        }
    }

    public /* synthetic */ pi(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
