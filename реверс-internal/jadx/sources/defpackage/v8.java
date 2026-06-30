package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v8 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ w8 e;

    public v8(w8 w8Var) {
        this.e = w8Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.h.removeCallbacks(this);
        w8.k(this.e);
        w8 w8Var = this.e;
        synchronized (w8Var.i) {
            if (w8Var.n) {
                w8Var.n = false;
                ArrayList arrayList = w8Var.k;
                w8Var.k = w8Var.l;
                w8Var.l = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w8.k(this.e);
        w8 w8Var = this.e;
        synchronized (w8Var.i) {
            if (w8Var.k.isEmpty()) {
                w8Var.g.removeFrameCallback(this);
                w8Var.n = false;
            }
        }
    }
}
