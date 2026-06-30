package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class tt0 {
    public int e;
    public int f;
    public int g;
    public Object h;

    public tt0() {
        if (i32.e == null) {
            i32.e = new i32();
        }
    }

    public int a(int i) {
        if (i < this.g) {
            return ((ByteBuffer) this.h).getShort(this.f + i);
        }
        return 0;
    }

    public void b() {
        if (((ut0) this.h).l != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.e;
            ut0 ut0Var = (ut0) this.h;
            if (i >= ut0Var.j || ut0Var.g[i] >= 0) {
                return;
            } else {
                this.e = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.e < ((ut0) this.h).j;
    }

    public void remove() {
        ut0 ut0Var = (ut0) this.h;
        b();
        if (this.f == -1) {
            yc.l("Call next() before removing element from the iterator.");
            return;
        }
        ut0Var.b();
        ut0Var.j(this.f);
        this.f = -1;
        this.g = ut0Var.l;
    }
}
