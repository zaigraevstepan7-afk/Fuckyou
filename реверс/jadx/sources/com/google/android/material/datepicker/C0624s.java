package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.reddit.frontpage.R;
import java.util.Calendar;
import p000A.C0001b;
import p066g0.AbstractC0714B;
import p066g0.AbstractC0741b0;
import p066g0.C0724L;

/* JADX INFO: renamed from: com.google.android.material.datepicker.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0624s extends AbstractC0714B {

    /* JADX INFO: renamed from: d */
    public final C0607b f2268d;

    /* JADX INFO: renamed from: e */
    public final C0001b f2269e;

    /* JADX INFO: renamed from: f */
    public final int f2270f;

    public C0624s(ContextThemeWrapper contextThemeWrapper, C0607b c0607b, C0001b c0001b) {
        C0620o c0620o = c0607b.f2187a;
        C0620o c0620o2 = c0607b.f2190d;
        if (c0620o.f2252a.compareTo(c0620o2.f2252a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0620o2.f2252a.compareTo(c0607b.f2188b.f2252a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2270f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.resc) * C0621p.f2259d) + (C0618m.m1738I(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.resc) : 0);
        this.f2268d = c0607b;
        this.f2269e = c0001b;
        if (this.f2846a.m1974a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2847b = true;
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: a */
    public final int mo985a() {
        return this.f2268d.f2193g;
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: b */
    public final long mo1747b(int i2) {
        Calendar calendarM1749a = AbstractC0628w.m1749a(this.f2268d.f2187a.f2252a);
        calendarM1749a.add(2, i2);
        calendarM1749a.set(5, 1);
        Calendar calendarM1749a2 = AbstractC0628w.m1749a(calendarM1749a);
        calendarM1749a2.get(2);
        calendarM1749a2.get(1);
        calendarM1749a2.getMaximum(7);
        calendarM1749a2.getActualMaximum(5);
        calendarM1749a2.getTimeInMillis();
        return calendarM1749a2.getTimeInMillis();
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: c */
    public final void mo986c(AbstractC0741b0 abstractC0741b0, int i2) {
        C0623r c0623r = (C0623r) abstractC0741b0;
        C0607b c0607b = this.f2268d;
        Calendar calendarM1749a = AbstractC0628w.m1749a(c0607b.f2187a.f2252a);
        calendarM1749a.add(2, i2);
        C0620o c0620o = new C0620o(calendarM1749a);
        c0623r.f2266u.setText(c0620o.m1742c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0623r.f2267v.findViewById(R.id.resc);
        if (materialCalendarGridView.m1731a() == null || !c0620o.equals(materialCalendarGridView.m1731a().f2261a)) {
            new C0621p(c0620o, c0607b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m1731a().getClass();
        throw null;
    }

    @Override // p066g0.AbstractC0714B
    /* JADX INFO: renamed from: d */
    public final AbstractC0741b0 mo987d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resc, viewGroup, false);
        if (!C0618m.m1738I(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0623r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0724L(-1, this.f2270f));
        return new C0623r(linearLayout, true);
    }
}
