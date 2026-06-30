package p062e1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p024N.C0246Y;
import p033R0.C0354b;
import p033R0.C0356d;
import p037T0.EnumC0392a;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0696a implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f2774a;

    /* JADX INFO: renamed from: b */
    public Object f2775b;

    /* JADX INFO: renamed from: c */
    public Iterator f2776c;

    /* JADX INFO: renamed from: d */
    public C0246Y f2777d;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m1950a() {
        int i2 = this.f2774a;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f2774a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        Object c0354b;
        while (true) {
            int i2 = this.f2774a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw m1950a();
                }
                Iterator it = this.f2776c;
                AbstractC0451c.m1143b(it);
                if (it.hasNext()) {
                    this.f2774a = 2;
                    return true;
                }
                this.f2776c = null;
            }
            this.f2774a = 5;
            C0246Y c0246y = this.f2777d;
            AbstractC0451c.m1143b(c0246y);
            this.f2777d = null;
            C0356d c0356d = C0356d.f999c;
            c0246y.getClass();
            C0696a c0696a = c0246y.f787a;
            AbstractC0451c.m1143b(c0696a);
            try {
                c0354b = c0246y.m796a(c0356d);
            } catch (Throwable th) {
                c0354b = new C0354b(th);
            }
            if (c0354b == EnumC0392a.f1063a) {
                continue;
            } else {
                c0696a.getClass();
                if (c0354b instanceof C0354b) {
                    throw ((C0354b) c0354b).f994a;
                }
                c0696a.f2774a = 4;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f2774a;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f2774a = 1;
            Iterator it = this.f2776c;
            AbstractC0451c.m1143b(it);
            return it.next();
        }
        if (i2 != 3) {
            throw m1950a();
        }
        this.f2774a = 0;
        Object obj = this.f2775b;
        this.f2775b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
