package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 implements List, yj0 {
    public final /* synthetic */ int e;
    public final List f;
    public final int g;
    public int h;

    public /* synthetic */ rx0(List list, int i, int i2, int i3) {
        this.e = i3;
        this.f = list;
        this.g = i;
        this.h = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.h++;
                break;
            default:
                list.add(i + i3, obj);
                this.h++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.h = collection.size() + this.h;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.h += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.h = i2;
                break;
            default:
                int i4 = this.h - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.h = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h;
                while (i2 < i3) {
                    if (!xi0.o(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.h;
                while (i2 < i4) {
                    if (!xi0.o(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                s01.a(i, this);
                break;
            default:
                jy0.a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (xi0.o(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.h;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (xi0.o(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                if (this.h == this.g) {
                }
                break;
            default:
                if (this.h == this.g) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new px0(this, 0, 0);
            default:
                return new px0(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h - 1;
                if (i2 <= i3) {
                    while (!xi0.o(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.h - 1;
                if (i2 <= i4) {
                    while (!xi0.o(list.get(i4), obj)) {
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new px0(this, 0, 0);
            default:
                return new px0(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.e;
        int i2 = this.g;
        List list = this.f;
        switch (i) {
            case 0:
                int i3 = this.h;
                while (i2 < i3) {
                    if (xi0.o(list.get(i2), obj)) {
                        list.remove(i2);
                        this.h--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.h;
                while (i2 < i4) {
                    if (xi0.o(list.get(i2), obj)) {
                        list.remove(i2);
                        this.h--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                int i = this.h;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.h) {
                }
                break;
            default:
                int i2 = this.h;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.h) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        int i2 = this.g;
        List list = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.h;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.h--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.h) {
                }
                break;
            default:
                int i5 = this.h;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.h--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.h) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                s01.a(i, this);
                break;
            default:
                jy0.a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                i = this.h;
                i2 = this.g;
                break;
            default:
                i = this.h;
                i2 = this.g;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.e) {
            case 0:
                s01.b(this, i, i2);
                return new rx0(this, i, i2, 0);
            default:
                jy0.b(this, i, i2);
                return new rx0(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                break;
        }
        return c2.t(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
        }
        return c2.s(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new px0(this, i, 0);
            default:
                return new px0(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                int i2 = this.h;
                this.h = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.h;
                this.h = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.h, collection);
                this.h = collection.size() + this.h;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.h, collection);
                int size = collection.size();
                this.h += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                s01.a(i, this);
                this.h--;
                return list.remove(i + i3);
            default:
                jy0.a(i, this);
                this.h--;
                return list.remove(i + i3);
        }
    }
}
