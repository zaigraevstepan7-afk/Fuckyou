package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ h4 f;

    public /* synthetic */ q3(h4 h4Var, int i) {
        this.e = i;
        this.f = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        h4 h4Var = this.f;
        switch (i) {
            case 0:
                fd fdVar = h4Var.l;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!fdVar.isEmpty()) {
                    try {
                        ((ha0) fdVar.removeLast()).a();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                h4Var.y0 = false;
                MotionEvent motionEvent = h4Var.o0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    h4Var.F(motionEvent);
                    return;
                } else {
                    yc.l("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h4.j(h4Var.getRoot());
                return;
            default:
                h4.j(h4Var.getRoot());
                return;
        }
    }
}
