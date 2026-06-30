package p016J;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0130b {

    /* JADX INFO: renamed from: a */
    public boolean f434a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0129a f435b;

    /* JADX INFO: renamed from: c */
    public boolean f436c;

    /* JADX INFO: renamed from: a */
    public final void m505a(InterfaceC0129a interfaceC0129a) {
        synchronized (this) {
            while (this.f436c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f435b == interfaceC0129a) {
                return;
            }
            this.f435b = interfaceC0129a;
            if (this.f434a) {
                interfaceC0129a.mo53r();
            }
        }
    }
}
