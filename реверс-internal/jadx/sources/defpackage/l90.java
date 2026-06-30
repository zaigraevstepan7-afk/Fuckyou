package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l90 implements f30 {
    public final Context e;
    public final k90 f;
    public final wr g;
    public final Object h = new Object();
    public Handler i;
    public ThreadPoolExecutor j;
    public ThreadPoolExecutor k;
    public bk l;

    public l90(Context context, k90 k90Var) {
        bk.n(context, "Context cannot be null");
        this.e = context.getApplicationContext();
        this.f = k90Var;
        this.g = m90.d;
    }

    public final void a() {
        synchronized (this.h) {
            try {
                this.l = null;
                Handler handler = this.i;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.i = null;
                ThreadPoolExecutor threadPoolExecutor = this.k;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.j = null;
                this.k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ca0 b() {
        try {
            wr wrVar = this.g;
            Context context = this.e;
            k90 k90Var = this.f;
            wrVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{k90Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            qn qnVarA = j90.a(context, Collections.unmodifiableList(arrayList));
            int i = qnVarA.a;
            if (i != 0) {
                throw new RuntimeException(s91.h(i, "fetchFonts failed (", ")"));
            }
            ca0[] ca0VarArr = (ca0[]) ((List) qnVarA.b).get(0);
            if (ca0VarArr == null || ca0VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return ca0VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.f30
    public final void d(bk bkVar) {
        synchronized (this.h) {
            this.l = bkVar;
        }
        synchronized (this.h) {
            try {
                if (this.l == null) {
                    return;
                }
                if (this.j == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new dq("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.k = threadPoolExecutor;
                    this.j = threadPoolExecutor;
                }
                this.j.execute(new p(6, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
