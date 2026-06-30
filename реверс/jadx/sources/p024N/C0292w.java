package p024N;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: N.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0292w implements Iterator {

    /* JADX INFO: renamed from: a */
    public final ArrayList f879a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Iterator f880b;

    public C0292w(C0245X c0245x) {
        this.f880b = c0245x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f880b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f880b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C0245X c0245x = viewGroup != null ? new C0245X(viewGroup) : null;
        ArrayList arrayList = this.f879a;
        if (c0245x != null && c0245x.hasNext()) {
            arrayList.add(this.f880b);
            this.f880b = c0245x;
            return next;
        }
        while (!this.f880b.hasNext() && !arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            this.f880b = (Iterator) arrayList.get(AbstractC0016e.m166R(arrayList));
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(AbstractC0016e.m166R(arrayList));
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
