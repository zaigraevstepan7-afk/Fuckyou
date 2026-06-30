package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ue implements yy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ue(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yy
    public final void a() throws Exception {
        boolean zIsTerminated;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qe qeVar = (qe) obj2;
                ro roVar = (ro) obj;
                if (qeVar.a != null) {
                    roVar.b.f();
                    return;
                }
                if (qeVar.b == null) {
                    yc.l("Unreachable");
                    return;
                }
                pe peVar = roVar.a;
                ArrayList arrayList = peVar.a;
                CopyOnWriteArrayList copyOnWriteArrayList = peVar.c;
                Iterator it = copyOnWriteArrayList.iterator();
                it.getClass();
                while (true) {
                    int i2 = 0;
                    if (!it.hasNext()) {
                        copyOnWriteArrayList.clear();
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            ((i11) obj3).f();
                        }
                        arrayList.clear();
                        return;
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) it.next();
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (i2 == 0) {
                                        executorService.shutdownNow();
                                        i2 = 1;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            throw new IllegalArgumentException();
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
                break;
            case 1:
                ((ig0) obj2).a.j((gg0) obj);
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((xn0) obj2).g.k(obj);
                return;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                fy0 fy0Var = (fy0) obj2;
                oa1 oa1Var = (oa1) fy0Var.getValue();
                if (oa1Var != null) {
                    na1 na1Var = new na1(oa1Var);
                    jx0 jx0Var = (jx0) obj;
                    if (jx0Var != null) {
                        jx0Var.b(na1Var);
                    }
                    fy0Var.setValue(null);
                    return;
                }
                return;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((d22) obj2).k.remove((d22) obj);
                return;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                d22 d22Var = (d22) obj2;
                y12 y12Var = (y12) ((z12) obj).b.getValue();
                if (y12Var != null) {
                    d22Var.j.remove(y12Var.e);
                    return;
                }
                return;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((d22) obj2).j.remove((c22) obj);
                return;
            default:
                t82 t82Var = (t82) obj2;
                View view = (View) obj;
                int i3 = t82Var.t - 1;
                t82Var.t = i3;
                if (i3 == 0) {
                    Field field = h62.a;
                    b62.b(view, null);
                    h62.c(view, null);
                    view.removeOnAttachStateChangeListener(t82Var.u);
                    return;
                }
                return;
        }
    }
}
