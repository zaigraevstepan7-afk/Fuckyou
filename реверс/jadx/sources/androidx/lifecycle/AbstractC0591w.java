package androidx.lifecycle;

import p000A.C0001b;

/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0591w {

    /* JADX INFO: renamed from: a */
    public final C0001b f1885a;

    /* JADX INFO: renamed from: b */
    public boolean f1886b;

    /* JADX INFO: renamed from: c */
    public int f1887c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0592x f1888d;

    public AbstractC0591w(C0592x c0592x, C0001b c0001b) {
        this.f1888d = c0592x;
        this.f1885a = c0001b;
    }

    /* JADX INFO: renamed from: c */
    public final void m1492c(boolean z2) {
        if (z2 == this.f1886b) {
            return;
        }
        this.f1886b = z2;
        int i2 = z2 ? 1 : -1;
        C0592x c0592x = this.f1888d;
        int i3 = c0592x.f1892c;
        c0592x.f1892c = i2 + i3;
        if (!c0592x.f1893d) {
            c0592x.f1893d = true;
            while (true) {
                try {
                    int i4 = c0592x.f1892c;
                    if (i3 == i4) {
                        break;
                    } else {
                        i3 = i4;
                    }
                } finally {
                    c0592x.f1893d = false;
                }
            }
        }
        if (this.f1886b) {
            c0592x.m1495c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo1474d() {
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1475e();
}
