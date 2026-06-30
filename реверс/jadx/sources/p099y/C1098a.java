package p099y;

import p093v.C1060a;
import p093v.C1063d;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1098a extends AbstractC1100c {

    /* JADX INFO: renamed from: h */
    public int f4581h;

    /* JADX INFO: renamed from: i */
    public int f4582i;

    /* JADX INFO: renamed from: j */
    public C1060a f4583j;

    public boolean getAllowsGoneWidget() {
        return this.f4583j.f4244t0;
    }

    public int getMargin() {
        return this.f4583j.f4245u0;
    }

    public int getType() {
        return this.f4581h;
    }

    @Override // p099y.AbstractC1100c
    /* JADX INFO: renamed from: h */
    public final void mo1241h(C1063d c1063d, boolean z2) {
        int i2 = this.f4581h;
        this.f4582i = i2;
        if (z2) {
            if (i2 == 5) {
                this.f4582i = 1;
            } else if (i2 == 6) {
                this.f4582i = 0;
            }
        } else if (i2 == 5) {
            this.f4582i = 0;
        } else if (i2 == 6) {
            this.f4582i = 1;
        }
        if (c1063d instanceof C1060a) {
            ((C1060a) c1063d).f4243s0 = this.f4582i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4583j.f4244t0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f4583j.f4245u0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f4583j.f4245u0 = i2;
    }

    public void setType(int i2) {
        this.f4581h = i2;
    }
}
