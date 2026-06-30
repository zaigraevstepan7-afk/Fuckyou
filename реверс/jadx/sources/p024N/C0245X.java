package p024N;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: N.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0245X implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f786b;

    public C0245X(ViewGroup viewGroup) {
        this.f786b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f785a < this.f786b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f785a;
        this.f785a = i2 + 1;
        View childAt = this.f786b.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f785a - 1;
        this.f785a = i2;
        this.f786b.removeViewAt(i2);
    }
}
