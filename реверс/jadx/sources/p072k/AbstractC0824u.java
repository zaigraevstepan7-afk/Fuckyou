package p072k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0824u implements InterfaceC0801C, InterfaceC0828y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f3385a;

    /* JADX INFO: renamed from: m */
    public static int m2203m(ListAdapter listAdapter, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2204u(MenuC0816m menuC0816m) {
        int size = menuC0816m.f3324f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuC0816m.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: d */
    public final boolean mo2179d(C0818o c0818o) {
        return false;
    }

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: h */
    public final boolean mo2180h(C0818o c0818o) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo2156l(MenuC0816m menuC0816m);

    /* JADX INFO: renamed from: n */
    public abstract void mo2157n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo2158o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0813j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0813j) listAdapter).f3312a.m2192q((MenuItem) listAdapter.getItem(i2), this, !(this instanceof ViewOnKeyListenerC0810g) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo2159p(int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo2160q(int i2);

    /* JADX INFO: renamed from: r */
    public abstract void mo2161r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo2162s(boolean z2);

    /* JADX INFO: renamed from: t */
    public abstract void mo2163t(int i2);

    @Override // p072k.InterfaceC0828y
    /* JADX INFO: renamed from: j */
    public final void mo2181j(Context context, MenuC0816m menuC0816m) {
    }
}
