package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tp0 implements Iterator, yj0 {
    public String e;
    public boolean f;
    public final /* synthetic */ up0 g;

    public tp0(up0 up0Var) {
        this.g = up0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.e == null && !this.f) {
            String line = ((BufferedReader) this.g.b).readLine();
            this.e = line;
            if (line == null) {
                this.f = true;
            }
        }
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yc.m();
            return null;
        }
        String str = this.e;
        this.e = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
