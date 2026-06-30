package p078n;

import java.util.Iterator;

/* JADX INFO: renamed from: n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1008b extends AbstractC1011e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C1009c f3997a;

    /* JADX INFO: renamed from: b */
    public C1009c f3998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3999c;

    public C1008b(C1009c c1009c, C1009c c1009c2, int i2) {
        this.f3999c = i2;
        this.f3997a = c1009c2;
        this.f3998b = c1009c;
    }

    @Override // p078n.AbstractC1011e
    /* JADX INFO: renamed from: a */
    public final void mo2459a(C1009c c1009c) {
        C1009c c1009c2;
        C1009c c1009cM2460b = null;
        if (this.f3997a == c1009c && c1009c == this.f3998b) {
            this.f3998b = null;
            this.f3997a = null;
        }
        C1009c c1009c3 = this.f3997a;
        if (c1009c3 == c1009c) {
            switch (this.f3999c) {
                case 0:
                    c1009c2 = c1009c3.f4003d;
                    break;
                default:
                    c1009c2 = c1009c3.f4002c;
                    break;
            }
            this.f3997a = c1009c2;
        }
        C1009c c1009c4 = this.f3998b;
        if (c1009c4 == c1009c) {
            C1009c c1009c5 = this.f3997a;
            if (c1009c4 != c1009c5 && c1009c5 != null) {
                c1009cM2460b = m2460b(c1009c4);
            }
            this.f3998b = c1009cM2460b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1009c m2460b(C1009c c1009c) {
        switch (this.f3999c) {
            case 0:
                return c1009c.f4002c;
            default:
                return c1009c.f4003d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3998b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1009c c1009c = this.f3998b;
        C1009c c1009c2 = this.f3997a;
        this.f3998b = (c1009c == c1009c2 || c1009c2 == null) ? null : m2460b(c1009c);
        return c1009c;
    }
}
