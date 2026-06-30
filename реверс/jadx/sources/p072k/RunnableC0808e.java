package p072k;

import p000A.C0001b;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0808e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0809f f3272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0818o f3273b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuC0816m f3274c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0001b f3275d;

    public RunnableC0808e(C0001b c0001b, C0809f c0809f, C0818o c0818o, MenuC0816m menuC0816m) {
        this.f3275d = c0001b;
        this.f3272a = c0809f;
        this.f3273b = c0818o;
        this.f3274c = menuC0816m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0809f c0809f = this.f3272a;
        if (c0809f != null) {
            C0001b c0001b = this.f3275d;
            ((ViewOnKeyListenerC0810g) c0001b.f1b).f3303z = true;
            c0809f.f3277b.m2186c(false);
            ((ViewOnKeyListenerC0810g) c0001b.f1b).f3303z = false;
        }
        C0818o c0818o = this.f3273b;
        if (c0818o.isEnabled() && c0818o.hasSubMenu()) {
            this.f3274c.m2192q(c0818o, null, 4);
        }
    }
}
