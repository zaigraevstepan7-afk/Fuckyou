package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u8 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ u8(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    w8 w8Var = new w8(choreographer, bl.s(looperMyLooper));
                    return hk.L(w8Var, w8Var.p);
                }
                yc.l("no Looper on this thread");
                return null;
            default:
                return new Random();
        }
    }
}
