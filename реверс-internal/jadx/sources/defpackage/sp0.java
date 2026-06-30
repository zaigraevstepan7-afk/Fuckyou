package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 implements Iterator, yj0 {
    public final String e;
    public int f;
    public int g;
    public int h;
    public int i;

    public sp0(String str) {
        this.e = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.i < 0) {
            this.f = 2;
            return false;
        }
        String str = this.e;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.g; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f = 1;
                this.i = i;
                this.h = length;
                return true;
            }
        }
        i = -1;
        this.f = 1;
        this.i = i;
        this.h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yc.m();
            return null;
        }
        this.f = 0;
        int i = this.h;
        int i2 = this.g;
        this.g = this.i + i;
        return this.e.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
