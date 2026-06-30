package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0622q implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f2264a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0624s f2265b;

    public C0622q(C0624s c0624s, MaterialCalendarGridView materialCalendarGridView) {
        this.f2265b = c0624s;
        this.f2264a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2264a;
        C0621p c0621pM1731a = materialCalendarGridView.m1731a();
        if (i2 < c0621pM1731a.m1744a() || i2 > c0621pM1731a.m1746c()) {
            return;
        }
        if (materialCalendarGridView.m1731a().getItem(i2).longValue() >= ((C0616k) this.f2265b.f2269e.f1b).f2213V.f2189c.f2196a) {
            throw null;
        }
    }
}
