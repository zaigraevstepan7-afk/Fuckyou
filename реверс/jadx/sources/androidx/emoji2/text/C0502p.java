package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.AbstractC0016e;
import p004C.RunnableC0020a;
import p015I0.C0109e;
import p018K.AbstractC0148d;
import p018K.C0149e;
import p018K.C0154j;
import p018K.C0155k;
import p036T.AbstractC0383m;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0502p implements InterfaceC0495i {

    /* JADX INFO: renamed from: a */
    public final Context f1538a;

    /* JADX INFO: renamed from: b */
    public final C0149e f1539b;

    /* JADX INFO: renamed from: c */
    public final C0109e f1540c;

    /* JADX INFO: renamed from: d */
    public final Object f1541d;

    /* JADX INFO: renamed from: e */
    public Handler f1542e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f1543f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f1544g;

    /* JADX INFO: renamed from: h */
    public AbstractC0383m f1545h;

    public C0502p(Context context, C0149e c0149e) {
        C0109e c0109e = C0503q.f1546d;
        this.f1541d = new Object();
        AbstractC0016e.m180j(context, "Context cannot be null");
        this.f1538a = context.getApplicationContext();
        this.f1539b = c0149e;
        this.f1540c = c0109e;
    }

    /* JADX INFO: renamed from: a */
    public final void m1312a() {
        synchronized (this.f1541d) {
            try {
                this.f1545h = null;
                Handler handler = this.f1542e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1542e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1544g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1543f = null;
                this.f1544g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1313b() {
        synchronized (this.f1541d) {
            try {
                if (this.f1545h == null) {
                    return;
                }
                if (this.f1543f == null) {
                    final String str = "emojiCompat";
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            Thread thread = new Thread(runnable, str);
                            thread.setPriority(10);
                            return thread;
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1544g = threadPoolExecutor;
                    this.f1543f = threadPoolExecutor;
                }
                this.f1543f.execute(new RunnableC0020a(9, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0155k m1314c() throws Throwable {
        try {
            C0109e c0109e = this.f1540c;
            Context context = this.f1538a;
            C0149e c0149e = this.f1539b;
            c0109e.getClass();
            C0154j c0154jM556a = AbstractC0148d.m556a(context, c0149e);
            int i2 = c0154jM556a.f484a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            C0155k[] c0155kArr = (C0155k[]) c0154jM556a.f485b;
            if (c0155kArr == null || c0155kArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0155kArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0495i
    /* JADX INFO: renamed from: j */
    public final void mo45j(AbstractC0383m abstractC0383m) {
        synchronized (this.f1541d) {
            this.f1545h = abstractC0383m;
        }
        m1313b();
    }
}
