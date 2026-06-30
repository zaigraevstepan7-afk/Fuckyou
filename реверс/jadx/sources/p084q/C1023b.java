package p084q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1023b implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f4079a;

    /* JADX INFO: renamed from: b */
    public int f4080b;

    /* JADX INFO: renamed from: c */
    public boolean f4081c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4082d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4083e;

    public C1023b(int i2) {
        this.f4079a = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4080b < this.f4079a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM2490f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f4080b;
        switch (this.f4082d) {
            case 0:
                objM2490f = ((C1027f) this.f4083e).m2490f(i2);
                break;
            case 1:
                objM2490f = ((C1027f) this.f4083e).m2493i(i2);
                break;
            default:
                objM2490f = ((C1028g) this.f4083e).f4094b[i2];
                break;
        }
        this.f4080b++;
        this.f4081c = true;
        return objM2490f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4081c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f4080b - 1;
        this.f4080b = i2;
        switch (this.f4082d) {
            case 0:
                ((C1027f) this.f4083e).m2491g(i2);
                break;
            case 1:
                ((C1027f) this.f4083e).m2491g(i2);
                break;
            default:
                ((C1028g) this.f4083e).m2474a(i2);
                break;
        }
        this.f4079a--;
        this.f4081c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1023b(C1028g c1028g) {
        this(c1028g.f4095c);
        this.f4082d = 2;
        this.f4083e = c1028g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1023b(C1027f c1027f, int i2) {
        this(c1027f.f4104c);
        this.f4082d = i2;
        switch (i2) {
            case 1:
                this.f4083e = c1027f;
                this(c1027f.f4104c);
                break;
            default:
                this.f4083e = c1027f;
                break;
        }
    }
}
