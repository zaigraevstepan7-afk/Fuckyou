package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w8 extends ot {
    public static final jv1 q = new jv1(v4.p);
    public static final u8 r = new u8(0);
    public final Choreographer g;
    public final Handler h;
    public boolean m;
    public boolean n;
    public final y8 p;
    public final Object i = new Object();
    public final fd j = new fd();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public final v8 o = new v8(this);

    public w8(Choreographer choreographer, Handler handler) {
        this.g = choreographer;
        this.h = handler;
        this.p = new y8(choreographer, this);
    }

    public static final void k(w8 w8Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (w8Var.i) {
                fd fdVar = w8Var.j;
                runnable = (Runnable) (fdVar.isEmpty() ? null : fdVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (w8Var.i) {
                    fd fdVar2 = w8Var.j;
                    runnable = (Runnable) (fdVar2.isEmpty() ? null : fdVar2.removeFirst());
                }
            }
            synchronized (w8Var.i) {
                if (w8Var.j.isEmpty()) {
                    z = false;
                    w8Var.m = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.ot
    public final void e(lt ltVar, Runnable runnable) {
        synchronized (this.i) {
            this.j.addLast(runnable);
            if (!this.m) {
                this.m = true;
                this.h.post(this.o);
                if (!this.n) {
                    this.n = true;
                    this.g.postFrameCallback(this.o);
                }
            }
        }
    }
}
