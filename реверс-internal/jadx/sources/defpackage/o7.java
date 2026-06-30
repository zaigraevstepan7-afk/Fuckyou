package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o7 implements x91, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long l;
    public final View e;
    public boolean g;
    public boolean j;
    public long k;
    public final PriorityQueue f = new PriorityQueue(11, new m7(0));
    public final Choreographer h = Choreographer.getInstance();
    public final n7 i = new n7();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o7(View view) {
        float refreshRate;
        this.e = view;
        if (l == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                l = (long) (1.0E9f / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                l = (long) (1.0E9f / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.j = true;
        }
    }

    @Override // defpackage.x91
    public final void a(w91 w91Var) {
        this.f.add(new sa1(1, w91Var));
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.post(this);
    }

    public final boolean b() {
        n7 n7Var = this.i;
        long jA = n7Var.a();
        c2.w("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((sa1) objPeek).b.c(n7Var)) {
                priorityQueue.poll();
                z = false;
            }
            n7Var.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.j) {
            this.k = j;
            this.e.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.j = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.e.removeCallbacks(this);
        this.h.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f;
        if (!priorityQueue.isEmpty() && this.g && this.j) {
            View view = this.e;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * l) + nanos;
                n7 n7Var = this.i;
                n7Var.a = z;
                n7Var.b = Math.max(this.k, nanos) + l;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (n7Var.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.h.postFrameCallback(this);
                } else {
                    this.g = false;
                }
                c2.w("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.g = false;
    }
}
