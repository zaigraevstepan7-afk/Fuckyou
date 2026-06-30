package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 implements ListIterator, yj0 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public rd0(mq1 mq1Var, int i) {
        this.e = 3;
        this.i = mq1Var;
        this.f = i - 1;
        this.g = -1;
        this.h = wi0.z(mq1Var);
    }

    public void a() {
        if (((AbstractList) ((zp0) this.i).i).modCount != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                zp0 zp0Var = (zp0) obj2;
                int i2 = this.f;
                this.f = i2 + 1;
                zp0Var.add(i2, obj);
                this.g = -1;
                this.h = ((AbstractList) zp0Var).modCount;
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                aq0 aq0Var = (aq0) obj2;
                int i3 = this.f;
                this.f = i3 + 1;
                aq0Var.add(i3, obj);
                this.g = -1;
                this.h = ((AbstractList) aq0Var).modCount;
                return;
            default:
                c();
                mq1 mq1Var = (mq1) obj2;
                mq1Var.add(this.f + 1, obj);
                this.g = -1;
                this.f++;
                this.h = wi0.z(mq1Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((aq0) this.i)).modCount != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (wi0.z((mq1) this.i) != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (this.f < this.h) {
                }
                break;
            case 1:
                if (this.f < ((zp0) obj).g) {
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f < ((aq0) obj).f) {
                }
                break;
            default:
                if (this.f < ((mq1) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                if (this.f > this.g) {
                }
                break;
            case 1:
                if (this.f > 0) {
                }
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f > 0) {
                }
                break;
            default:
                if (this.f >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                sx0 sx0Var = ((td0) obj).e;
                int i2 = this.f;
                this.f = i2 + 1;
                Object objF = sx0Var.f(i2);
                objF.getClass();
                return (sv0) objF;
            case 1:
                a();
                int i3 = this.f;
                zp0 zp0Var = (zp0) obj;
                if (i3 >= zp0Var.g) {
                    yc.m();
                    return null;
                }
                this.f = i3 + 1;
                this.g = i3;
                return zp0Var.e[zp0Var.f + i3];
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i4 = this.f;
                aq0 aq0Var = (aq0) obj;
                if (i4 >= aq0Var.f) {
                    yc.m();
                    return null;
                }
                this.f = i4 + 1;
                this.g = i4;
                return aq0Var.e[i4];
            default:
                c();
                int i5 = this.f + 1;
                this.g = i5;
                mq1 mq1Var = (mq1) obj;
                wi0.p(i5, mq1Var.size());
                Object obj2 = mq1Var.get(i5);
                this.f = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.f - this.g;
            case 1:
                return this.f;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f;
            default:
                return this.f + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                sx0 sx0Var = ((td0) obj).e;
                int i2 = this.f - 1;
                this.f = i2;
                Object objF = sx0Var.f(i2);
                objF.getClass();
                return (sv0) objF;
            case 1:
                a();
                int i3 = this.f;
                if (i3 <= 0) {
                    yc.m();
                    return null;
                }
                int i4 = i3 - 1;
                this.f = i4;
                this.g = i4;
                zp0 zp0Var = (zp0) obj;
                return zp0Var.e[zp0Var.f + i4];
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i5 = this.f;
                if (i5 <= 0) {
                    yc.m();
                    return null;
                }
                int i6 = i5 - 1;
                this.f = i6;
                this.g = i6;
                return ((aq0) obj).e[i6];
            default:
                c();
                mq1 mq1Var = (mq1) obj;
                wi0.p(this.f, mq1Var.size());
                int i7 = this.f;
                this.g = i7;
                this.f--;
                return mq1Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.e) {
            case 0:
                return (this.f - this.g) - 1;
            case 1:
                i = this.f;
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                i = this.f;
                break;
            default:
                return this.f;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                zp0 zp0Var = (zp0) obj;
                a();
                int i2 = this.g;
                if (i2 == -1) {
                    yc.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                zp0Var.b(i2);
                this.f = this.g;
                this.g = -1;
                this.h = ((AbstractList) zp0Var).modCount;
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                aq0 aq0Var = (aq0) obj;
                b();
                int i3 = this.g;
                if (i3 == -1) {
                    yc.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                aq0Var.b(i3);
                this.f = this.g;
                this.g = -1;
                this.h = ((AbstractList) aq0Var).modCount;
                return;
            default:
                c();
                mq1 mq1Var = (mq1) obj;
                mq1Var.remove(this.g);
                this.f--;
                this.g = -1;
                this.h = wi0.z(mq1Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.g;
                if (i2 != -1) {
                    ((zp0) obj2).set(i2, obj);
                    return;
                } else {
                    yc.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i3 = this.g;
                if (i3 != -1) {
                    ((aq0) obj2).set(i3, obj);
                    return;
                } else {
                    yc.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                mq1 mq1Var = (mq1) obj2;
                c();
                int i4 = this.g;
                if (i4 < 0) {
                    yc.l("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    mq1Var.set(i4, obj);
                    this.h = wi0.z(mq1Var);
                    return;
                }
        }
    }

    public rd0(aq0 aq0Var, int i) {
        this.e = 2;
        this.i = aq0Var;
        this.f = i;
        this.g = -1;
        this.h = ((AbstractList) aq0Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rd0(td0 td0Var, int i, int i2) {
        this(td0Var, (i2 & 1) != 0 ? 0 : i, 0, td0Var.e.b);
        this.e = 0;
    }

    public rd0(td0 td0Var, int i, int i2, int i3) {
        this.e = 0;
        this.i = td0Var;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public rd0(zp0 zp0Var, int i) {
        this.e = 1;
        this.i = zp0Var;
        this.f = i;
        this.g = -1;
        this.h = ((AbstractList) zp0Var).modCount;
    }
}
