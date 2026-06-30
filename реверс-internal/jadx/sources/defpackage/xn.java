package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.reddit.frontpage.MainActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xn implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long e = SystemClock.uptimeMillis() + 10000;
    public Runnable f;
    public boolean g;
    public final /* synthetic */ MainActivity h;

    public xn(MainActivity mainActivity) {
        this.h = mainActivity;
    }

    public final void a(View view) {
        if (this.g) {
            return;
        }
        this.g = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f = runnable;
        View decorView = this.h.getWindow().getDecorView();
        decorView.getClass();
        if (!this.g) {
            decorView.postOnAnimation(new p(4, this));
        } else if (xi0.o(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.e) {
                this.g = false;
                this.h.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f = null;
        ga0 ga0Var = (ga0) this.h.k.getValue();
        synchronized (ga0Var.a) {
            z = ga0Var.b;
        }
        if (z) {
            this.g = false;
            this.h.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
