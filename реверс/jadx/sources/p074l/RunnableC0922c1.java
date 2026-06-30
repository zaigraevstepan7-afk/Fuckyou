package p074l;

import androidx.appcompat.widget.Toolbar;
import p072k.C0818o;

/* JADX INFO: renamed from: l.c1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0922c1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f3708b;

    public /* synthetic */ RunnableC0922c1(Toolbar toolbar, int i2) {
        this.f3707a = i2;
        this.f3708b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3707a) {
            case 0:
                C0931f1 c0931f1 = this.f3708b.f1382L;
                C0818o c0818o = c0931f1 == null ? null : c0931f1.f3719b;
                if (c0818o != null) {
                    c0818o.collapseActionView();
                }
                break;
            default:
                this.f3708b.m1232n();
                break;
        }
    }
}
