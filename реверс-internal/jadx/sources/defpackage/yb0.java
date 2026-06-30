package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yb0 implements Iterator, yj0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final Object h;

    public yb0(cy0 cy0Var) {
        this.e = 2;
        this.h = cy0Var;
        this.f = -1;
        this.g = af1.x(new by0(cy0Var, this, null));
    }

    public void a() {
        Object objI;
        int i = this.f;
        m60 m60Var = (m60) this.h;
        if (i == -2) {
            objI = ((ha0) m60Var.b).a();
        } else {
            sa0 sa0Var = m60Var.c;
            Object obj = this.g;
            obj.getClass();
            objI = sa0Var.i(obj);
        }
        this.g = objI;
        this.f = objI == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                return this.f == 1;
            case 1:
                return ((lm1) this.g).hasNext();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((lm1) this.g).hasNext();
            default:
                return this.f < ((Map) this.h).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                if (this.f == 0) {
                    yc.m();
                    return null;
                }
                Object obj2 = this.g;
                obj2.getClass();
                this.f = -1;
                return obj2;
            case 1:
                return ((lm1) this.g).next();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((lm1) this.g).next();
            default:
                if (hasNext()) {
                    obj = this.g;
                    this.f++;
                    Object obj3 = ((Map) this.h).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.g = ((yp0) obj3).b;
                } else {
                    yc.m();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f;
                if (i2 != -1) {
                    ((vx0) obj).f.i(i2);
                    this.f = -1;
                    return;
                }
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = this.f;
                if (i3 != -1) {
                    ((cy0) obj).f.m(i3);
                    this.f = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yb0(m60 m60Var) {
        this.e = 0;
        this.h = m60Var;
        this.f = -2;
    }

    public yb0(Object obj, Map map) {
        this.e = 3;
        this.g = obj;
        this.h = map;
    }

    public yb0(vx0 vx0Var) {
        this.e = 1;
        this.h = vx0Var;
        this.f = -1;
        this.g = af1.x(new ux0(vx0Var, this, null));
    }
}
