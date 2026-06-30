package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hd implements Iterator, yj0 {
    public int e;
    public int f;
    public boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hd(ld ldVar, int i) {
        this(ldVar.g);
        this.h = i;
        switch (i) {
            case 1:
                this.i = ldVar;
                this(ldVar.g);
                break;
            default:
                this.i = ldVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            yc.m();
            return null;
        }
        int i = this.f;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                objE = ((ld) obj).e(i);
                break;
            case 1:
                objE = ((ld) obj).h(i);
                break;
            default:
                objE = ((md) obj).f[i];
                break;
        }
        this.f++;
        this.g = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            yc.l("Call next() before removing an element.");
            return;
        }
        int i = this.f - 1;
        this.f = i;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((ld) obj).f(i);
                break;
            case 1:
                ((ld) obj).f(i);
                break;
            default:
                ((md) obj).a(i);
                break;
        }
        this.e--;
        this.g = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hd(md mdVar) {
        this(mdVar.g);
        this.h = 2;
        this.i = mdVar;
    }

    public hd(int i) {
        this.e = i;
    }
}
