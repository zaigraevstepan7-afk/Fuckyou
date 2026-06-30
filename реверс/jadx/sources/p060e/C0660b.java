package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0660b implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final View f2635a;

    /* JADX INFO: renamed from: b */
    public final View f2636b;

    static {
        ZLoader.registerNativesForClass(99, C0660b.class);
        Hidden0.special_clinit_99_00(C0660b.class);
    }

    public C0660b(View view, View view2) {
        this.f2635a = view;
        this.f2636b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final native void onScroll(AbsListView absListView, int i2, int i3, int i4);

    @Override // android.widget.AbsListView.OnScrollListener
    public final native void onScrollStateChanged(AbsListView absListView, int i2);
}
