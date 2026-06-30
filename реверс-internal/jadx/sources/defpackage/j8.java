package defpackage;

import android.content.Context;
import android.view.ActionMode;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j8(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                l8 l8Var = (l8) this.f;
                h8 h8Var = (h8) this.g;
                i8 i8Var = (i8) this.h;
                ActionMode actionModeStartActionMode = l8Var.a.startActionMode(new e70(h8Var), 1);
                xi0.o(l8Var.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    i8Var.close();
                    return;
                }
                return;
            default:
                qt0 qt0Var = (qt0) this.f;
                bk bkVar = (bk) this.g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.h;
                try {
                    m90 m90VarK = xk.k((Context) qt0Var.f);
                    if (m90VarK == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    l90 l90Var = (l90) m90VarK.a;
                    synchronized (l90Var.h) {
                        l90Var.j = threadPoolExecutor;
                        break;
                    }
                    m90VarK.a.d(new i30(bkVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bkVar.S(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
