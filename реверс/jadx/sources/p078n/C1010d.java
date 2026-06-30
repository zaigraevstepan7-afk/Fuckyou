package p078n;

import java.util.Iterator;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1010d extends AbstractC1011e implements Iterator {

    /* JADX INFO: renamed from: a */
    public C1009c f4004a;

    /* JADX INFO: renamed from: b */
    public boolean f4005b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1012f f4006c;

    public C1010d(C1012f c1012f) {
        this.f4006c = c1012f;
    }

    @Override // p078n.AbstractC1011e
    /* JADX INFO: renamed from: a */
    public final void mo2459a(C1009c c1009c) {
        C1009c c1009c2 = this.f4004a;
        if (c1009c == c1009c2) {
            C1009c c1009c3 = c1009c2.f4003d;
            this.f4004a = c1009c3;
            this.f4005b = c1009c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4005b) {
            return this.f4006c.f4007a != null;
        }
        C1009c c1009c = this.f4004a;
        return (c1009c == null || c1009c.f4002c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4005b) {
            this.f4005b = false;
            this.f4004a = this.f4006c.f4007a;
        } else {
            C1009c c1009c = this.f4004a;
            this.f4004a = c1009c != null ? c1009c.f4002c : null;
        }
        return this.f4004a;
    }
}
