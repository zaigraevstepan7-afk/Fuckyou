package p071j;

import p001A0.AbstractC0016e;
import p074l.C0946k1;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0794i extends AbstractC0016e {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f3220k;

    /* JADX INFO: renamed from: l */
    public boolean f3221l;

    /* JADX INFO: renamed from: m */
    public int f3222m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f3223n;

    public C0794i(C0795j c0795j) {
        this.f3220k = 0;
        this.f3223n = c0795j;
        this.f3221l = false;
        this.f3222m = 0;
    }

    @Override // p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: a */
    public final void mo816a() {
        switch (this.f3220k) {
            case 0:
                int i2 = this.f3222m + 1;
                this.f3222m = i2;
                C0795j c0795j = (C0795j) this.f3223n;
                if (i2 == c0795j.f3224a.size()) {
                    AbstractC0016e abstractC0016e = c0795j.f3227d;
                    if (abstractC0016e != null) {
                        abstractC0016e.mo816a();
                    }
                    this.f3222m = 0;
                    this.f3221l = false;
                    c0795j.f3228e = false;
                }
                break;
            default:
                if (!this.f3221l) {
                    ((C0946k1) this.f3223n).f3769a.setVisibility(this.f3222m);
                }
                break;
        }
    }

    @Override // p001A0.AbstractC0016e, p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: b */
    public void mo215b() {
        switch (this.f3220k) {
            case 1:
                this.f3221l = true;
                break;
        }
    }

    @Override // p001A0.AbstractC0016e, p024N.InterfaceC0251b0
    /* JADX INFO: renamed from: c */
    public final void mo216c() {
        switch (this.f3220k) {
            case 0:
                if (!this.f3221l) {
                    this.f3221l = true;
                    AbstractC0016e abstractC0016e = ((C0795j) this.f3223n).f3227d;
                    if (abstractC0016e != null) {
                        abstractC0016e.mo216c();
                    }
                    break;
                }
                break;
            default:
                ((C0946k1) this.f3223n).f3769a.setVisibility(0);
                break;
        }
    }

    public C0794i(C0946k1 c0946k1, int i2) {
        this.f3220k = 1;
        this.f3223n = c0946k1;
        this.f3222m = i2;
        this.f3221l = false;
    }
}
