package p066g0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: g0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0715C extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m1974a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m1975b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0731T) ((Observable) this).mObservers.get(size)).f2895a;
            recyclerView.m1632k(null);
            recyclerView.f1967e0.f2909f = true;
            recyclerView.m1616X(true);
            if (!recyclerView.f1966e.m562f()) {
                recyclerView.requestLayout();
            }
        }
    }
}
