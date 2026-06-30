package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 implements Parcelable, vs1, List, RandomAccess, yj0 {
    public static final Parcelable.Creator<mq1> CREATOR = new lq1();
    public ss1 e;

    public mq1(f0 f0Var) {
        sp1 sp1VarJ = aq1.j();
        ss1 ss1Var = new ss1(sp1VarJ.g(), f0Var);
        if (!(sp1VarJ instanceof gc0)) {
            ss1Var.b = new ss1(1L, f0Var);
        }
        this.e = ss1Var;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            f0 f0VarC = f0Var.c(obj);
            if (f0VarC.equals(f0Var)) {
                return false;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i, f0VarC, true);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            f0 f0VarE = f0Var.e(collection);
            if (xi0.o(f0VarE, f0Var)) {
                return false;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i, f0VarE, true);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
        return true;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.b = this.e;
        this.e = (ss1) xs1Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        sp1 sp1VarJ;
        ss1 ss1Var = this.e;
        ss1Var.getClass();
        synchronized (aq1.c) {
            sp1VarJ = aq1.j();
            ss1 ss1Var2 = (ss1) aq1.w(ss1Var, this, sp1VarJ);
            synchronized (wi0.G) {
                ss1Var2.c = np1.f;
                ss1Var2.d++;
                ss1Var2.e++;
            }
        }
        aq1.n(sp1VarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return wi0.y(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return wi0.y(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return wi0.y(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return wi0.y(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return wi0.y(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return wi0.y(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new rd0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            int iIndexOf = f0Var.indexOf(obj);
            f0 f0VarH = iIndexOf != -1 ? f0Var.h(iIndexOf) : f0Var;
            if (f0VarH.equals(f0Var)) {
                return false;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i, f0VarH, true);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            f0 f0VarG = f0Var.g(new e0(0, collection));
            if (xi0.o(f0VarG, f0Var)) {
                return false;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i, f0VarG, true);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return wi0.C(this, new e0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        Object obj2 = get(i);
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i2 = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            f0 f0VarI = f0Var.i(i, obj);
            if (f0VarI.equals(f0Var)) {
                break;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i2, f0VarI, false);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return wi0.y(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            e91.a("fromIndex or toIndex are out of bounds");
        }
        return new gu1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return c2.s(this);
    }

    public final String toString() {
        ss1 ss1Var = this.e;
        ss1Var.getClass();
        return "SnapshotStateList(value=" + ((ss1) aq1.h(ss1Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f0 f0Var = wi0.y(this).c;
        int iA = f0Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(f0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return c2.t(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new rd0(this, i);
    }

    public mq1() {
        this(np1.f);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i2 = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            f0 f0VarB = f0Var.b(i, obj);
            if (f0VarB.equals(f0Var)) {
                return;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i2, f0VarB, true);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return wi0.C(this, new o1(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        f0 f0Var;
        sp1 sp1VarJ;
        boolean zQ;
        Object obj = get(i);
        do {
            synchronized (wi0.G) {
                ss1 ss1Var = this.e;
                ss1Var.getClass();
                ss1 ss1Var2 = (ss1) aq1.h(ss1Var);
                i2 = ss1Var2.d;
                f0Var = ss1Var2.c;
            }
            f0Var.getClass();
            f0 f0VarH = f0Var.h(i);
            if (f0VarH.equals(f0Var)) {
                break;
            }
            ss1 ss1Var3 = this.e;
            ss1Var3.getClass();
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                zQ = wi0.q((ss1) aq1.w(ss1Var3, this, sp1VarJ), i2, f0VarH, true);
            }
            aq1.n(sp1VarJ, this);
        } while (!zQ);
        return obj;
    }
}
