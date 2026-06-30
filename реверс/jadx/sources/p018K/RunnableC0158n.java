package p018K;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.AbstractC0529T;
import androidx.fragment.app.C0528S;
import androidx.fragment.app.C0539i;
import java.util.ArrayList;
import p004C.RunnableC0024e;
import p005C0.C0048n;
import p024N.C0261g0;
import p024N.C0269k0;

/* JADX INFO: renamed from: K.n */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0158n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f492a = 0;

    /* JADX INFO: renamed from: b */
    public Object f493b;

    /* JADX INFO: renamed from: c */
    public Object f494c;

    /* JADX INFO: renamed from: d */
    public Object f495d;

    public /* synthetic */ RunnableC0158n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f492a) {
            case 0:
                try {
                    objCall = ((CallableC0150f) this.f493b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f495d).post(new RunnableC0024e((C0151g) this.f494c, 4, objCall));
                break;
            case 1:
                C0261g0.m823h((View) this.f493b, (C0048n) this.f494c);
                ((ValueAnimator) this.f495d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f493b;
                C0528S c0528s = (C0528S) this.f494c;
                if (arrayList.contains(c0528s)) {
                    arrayList.remove(c0528s);
                    ((C0539i) this.f495d).getClass();
                    AbstractC0529T.m1412a(c0528s.f1669c.f1763E, c0528s.f1667a);
                }
                break;
        }
    }

    public RunnableC0158n(C0539i c0539i, ArrayList arrayList, C0528S c0528s) {
        this.f495d = c0539i;
        this.f493b = arrayList;
        this.f494c = c0528s;
    }

    public RunnableC0158n(View view, C0269k0 c0269k0, C0048n c0048n, ValueAnimator valueAnimator) {
        this.f493b = view;
        this.f494c = c0048n;
        this.f495d = valueAnimator;
    }
}
