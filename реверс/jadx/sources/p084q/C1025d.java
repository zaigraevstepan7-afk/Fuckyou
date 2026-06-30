package p084q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1025d implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f4085a;

    /* JADX INFO: renamed from: b */
    public int f4086b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f4087c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1027f f4088d;

    public C1025d(C1027f c1027f) {
        this.f4088d = c1027f;
        this.f4085a = c1027f.f4104c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4087c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f4086b;
        C1027f c1027f = this.f4088d;
        return AbstractC0451c.m1142a(key, c1027f.m2490f(i2)) && AbstractC0451c.m1142a(entry.getValue(), c1027f.m2493i(this.f4086b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f4087c) {
            return this.f4088d.m2490f(this.f4086b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4087c) {
            return this.f4088d.m2493i(this.f4086b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4086b < this.f4085a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4087c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f4086b;
        C1027f c1027f = this.f4088d;
        Object objM2490f = c1027f.m2490f(i2);
        Object objM2493i = c1027f.m2493i(this.f4086b);
        return (objM2490f == null ? 0 : objM2490f.hashCode()) ^ (objM2493i != null ? objM2493i.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4086b++;
        this.f4087c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4087c) {
            throw new IllegalStateException();
        }
        this.f4088d.m2491g(this.f4086b);
        this.f4086b--;
        this.f4085a--;
        this.f4087c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f4087c) {
            return this.f4088d.m2492h(this.f4086b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
