package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p024N.C0270l;
import p072k.C0818o;
import p072k.InterfaceC0799A;
import p072k.InterfaceC0815l;
import p072k.MenuC0816m;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0815l, InterfaceC0799A, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f1266b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuC0816m f1267a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, f1266b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0270lM838m.m845h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0270lM838m.m845h(1));
        }
        c0270lM838m.m851o();
    }

    @Override // p072k.InterfaceC0815l
    /* JADX INFO: renamed from: b */
    public final boolean mo1195b(C0818o c0818o) {
        return this.f1267a.m2192q(c0818o, null, 0);
    }

    @Override // p072k.InterfaceC0799A
    /* JADX INFO: renamed from: c */
    public final void mo1196c(MenuC0816m menuC0816m) {
        this.f1267a = menuC0816m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo1195b((C0818o) getAdapter().getItem(i2));
    }
}
