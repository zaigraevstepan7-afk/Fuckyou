package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class v implements Iterator, yj0 {
    public final /* synthetic */ int e;
    public int f;
    public final Object g;

    public /* synthetic */ v(int i, Object obj) {
        this.e = i;
        this.g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (this.f < ((y) obj).a()) {
                }
                break;
            default:
                if (this.f < ((Object[]) obj).length) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    yc.m();
                } else {
                    int i2 = this.f;
                    this.f = i2 + 1;
                }
                break;
            default:
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f--;
                    yc.h(e.getMessage());
                    return null;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
