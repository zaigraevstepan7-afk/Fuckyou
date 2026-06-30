package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p000A.C0001b;
import p005C0.C0035a;
import p018K.RunnableC0145a;
import p024N.AbstractC0240S;
import p036T.C0378h;
import p066g0.C0747e0;
import p066g0.C0775z;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0616k<S> extends AbstractC0625t {

    /* JADX INFO: renamed from: U */
    public int f2212U;

    /* JADX INFO: renamed from: V */
    public C0607b f2213V;

    /* JADX INFO: renamed from: W */
    public C0620o f2214W;

    /* JADX INFO: renamed from: X */
    public int f2215X;

    /* JADX INFO: renamed from: Y */
    public C0608c f2216Y;

    /* JADX INFO: renamed from: Z */
    public RecyclerView f2217Z;

    /* JADX INFO: renamed from: a0 */
    public RecyclerView f2218a0;

    /* JADX INFO: renamed from: b0 */
    public View f2219b0;

    /* JADX INFO: renamed from: c0 */
    public View f2220c0;

    /* JADX INFO: renamed from: d0 */
    public View f2221d0;

    /* JADX INFO: renamed from: e0 */
    public View f2222e0;

    /* JADX INFO: renamed from: F */
    public final void m1735F(C0620o c0620o) {
        C0624s c0624s = (C0624s) this.f2218a0.getAdapter();
        int iM1743d = c0624s.f2268d.f2187a.m1743d(c0620o);
        int iM1743d2 = iM1743d - c0624s.f2268d.f2187a.m1743d(this.f2214W);
        boolean z2 = Math.abs(iM1743d2) > 3;
        boolean z3 = iM1743d2 > 0;
        this.f2214W = c0620o;
        if (z2 && z3) {
            this.f2218a0.m1624f0(iM1743d - 3);
            this.f2218a0.post(new RunnableC0145a(this, iM1743d, 3));
        } else if (!z2) {
            this.f2218a0.post(new RunnableC0145a(this, iM1743d, 3));
        } else {
            this.f2218a0.m1624f0(iM1743d + 3);
            this.f2218a0.post(new RunnableC0145a(this, iM1743d, 3));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1736G(int i2) {
        this.f2215X = i2;
        if (i2 == 2) {
            this.f2217Z.getLayoutManager().mo1583q0(this.f2214W.f2254c - ((C0630y) this.f2217Z.getAdapter()).f2274d.f2213V.f2187a.f2254c);
            this.f2221d0.setVisibility(0);
            this.f2222e0.setVisibility(8);
            this.f2219b0.setVisibility(8);
            this.f2220c0.setVisibility(8);
            return;
        }
        if (i2 == 1) {
            this.f2221d0.setVisibility(8);
            this.f2222e0.setVisibility(0);
            this.f2219b0.setVisibility(0);
            this.f2220c0.setVisibility(0);
            m1735F(this.f2214W);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: r */
    public final void mo1445r(Bundle bundle) {
        super.mo1445r(bundle);
        if (bundle == null) {
            bundle = this.f1782f;
        }
        this.f2212U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2213V = (C0607b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2214W = (C0620o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: s */
    public final View mo1467s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        int i3;
        C0775z c0775z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1459h(), this.f2212U);
        this.f2216Y = new C0608c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0620o c0620o = this.f2213V.f2187a;
        if (C0618m.m1738I(contextThemeWrapper, R.attr.windowFullscreen)) {
            i2 = com.reddit.frontpage.R.layout.resc;
            i3 = 1;
        } else {
            i2 = com.reddit.frontpage.R.layout.resc;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        Resources resources = m1453B().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc) + resources.getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc) + resources.getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc);
        int i4 = C0621p.f2259d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc) * (i4 - 1)) + (resources.getDimensionPixelSize(com.reddit.frontpage.R.dimen.resc) * i4) + resources.getDimensionPixelOffset(com.reddit.frontpage.R.dimen.resc));
        GridView gridView = (GridView) viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
        AbstractC0240S.m785p(gridView, new C0378h(1));
        int i5 = this.f2213V.f2191e;
        gridView.setAdapter((ListAdapter) (i5 > 0 ? new C0610e(i5) : new C0610e()));
        gridView.setNumColumns(c0620o.f2255d);
        gridView.setEnabled(false);
        this.f2218a0 = (RecyclerView) viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
        this.f2218a0.setLayoutManager(new C0612g(this, i3, i3));
        this.f2218a0.setTag("MONTHS_VIEW_GROUP_TAG");
        C0624s c0624s = new C0624s(contextThemeWrapper, this.f2213V, new C0001b(19, this));
        this.f2218a0.setAdapter(c0624s);
        int integer = contextThemeWrapper.getResources().getInteger(com.reddit.frontpage.R.integer.resc);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
        this.f2217Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2217Z.setLayoutManager(new GridLayoutManager(integer));
            this.f2217Z.setAdapter(new C0630y(this));
            this.f2217Z.m1628i(new C0613h(this));
        }
        if (viewInflate.findViewById(com.reddit.frontpage.R.id.resc) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0240S.m785p(materialButton, new C0035a(2, this));
            View viewFindViewById = viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
            this.f2219b0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
            this.f2220c0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2221d0 = viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
            this.f2222e0 = viewInflate.findViewById(com.reddit.frontpage.R.id.resc);
            m1736G(1);
            materialButton.setText(this.f2214W.m1742c());
            this.f2218a0.m1630j(new C0614i(this, c0624s, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0615j(0, this));
            this.f2220c0.setOnClickListener(new ViewOnClickListenerC0611f(this, c0624s, 1));
            this.f2219b0.setOnClickListener(new ViewOnClickListenerC0611f(this, c0624s, 0));
        }
        if (!C0618m.m1738I(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0775z = new C0775z()).f3144a) != (recyclerView = this.f2218a0)) {
            C0747e0 c0747e0 = c0775z.f3145b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1971g0;
                if (arrayList != null) {
                    arrayList.remove(c0747e0);
                }
                c0775z.f3144a.setOnFlingListener(null);
            }
            c0775z.f3144a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0775z.f3144a.m1630j(c0747e0);
                c0775z.f3144a.setOnFlingListener(c0775z);
                new Scroller(c0775z.f3144a.getContext(), new DecelerateInterpolator());
                c0775z.m2122f();
            }
        }
        this.f2218a0.m1624f0(c0624s.f2268d.f2187a.m1743d(this.f2214W));
        AbstractC0240S.m785p(this.f2218a0, new C0378h(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0548r
    /* JADX INFO: renamed from: w */
    public final void mo1449w(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2212U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2213V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2214W);
    }
}
