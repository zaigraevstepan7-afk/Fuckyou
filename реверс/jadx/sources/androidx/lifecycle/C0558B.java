package androidx.lifecycle;

import android.os.Handler;
import p000A.C0001b;
import p004C.RunnableC0020a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0558B implements InterfaceC0586r {

    /* JADX INFO: renamed from: i */
    public static final C0558B f1826i = new C0558B();

    /* JADX INFO: renamed from: a */
    public int f1827a;

    /* JADX INFO: renamed from: b */
    public int f1828b;

    /* JADX INFO: renamed from: e */
    public Handler f1831e;

    /* JADX INFO: renamed from: c */
    public boolean f1829c = true;

    /* JADX INFO: renamed from: d */
    public boolean f1830d = true;

    /* JADX INFO: renamed from: f */
    public final C0588t f1832f = new C0588t(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC0020a f1833g = new RunnableC0020a(10, this);

    /* JADX INFO: renamed from: h */
    public final C0001b f1834h = new C0001b(18, this);

    /* JADX INFO: renamed from: a */
    public final void m1468a() {
        int i2 = this.f1828b + 1;
        this.f1828b = i2;
        if (i2 == 1) {
            if (this.f1829c) {
                this.f1832f.m1484d(EnumC0580l.ON_RESUME);
                this.f1829c = false;
            } else {
                Handler handler = this.f1831e;
                AbstractC0451c.m1143b(handler);
                handler.removeCallbacks(this.f1833g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0586r
    /* JADX INFO: renamed from: d */
    public final C0588t mo1164d() {
        return this.f1832f;
    }
}
