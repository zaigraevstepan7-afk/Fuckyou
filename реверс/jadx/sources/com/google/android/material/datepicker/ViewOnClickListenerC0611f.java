package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import p066g0.AbstractC0723K;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0611f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0624s f2202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0616k f2203c;

    public /* synthetic */ ViewOnClickListenerC0611f(C0616k c0616k, C0624s c0624s, int i2) {
        this.f2201a = i2;
        this.f2203c = c0616k;
        this.f2202b = c0624s;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2201a) {
            case 0:
                C0616k c0616k = this.f2203c;
                int iM1554N0 = ((LinearLayoutManager) c0616k.f2218a0.getLayoutManager()).m1554N0() - 1;
                if (iM1554N0 >= 0) {
                    Calendar calendarM1749a = AbstractC0628w.m1749a(this.f2202b.f2268d.f2187a.f2252a);
                    calendarM1749a.add(2, iM1554N0);
                    c0616k.m1735F(new C0620o(calendarM1749a));
                }
                break;
            default:
                C0616k c0616k2 = this.f2203c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0616k2.f2218a0.getLayoutManager();
                View viewM1556P0 = linearLayoutManager.m1556P0(0, linearLayoutManager.m2014v(), false);
                int iM1989G = (viewM1556P0 == null ? -1 : AbstractC0723K.m1989G(viewM1556P0)) + 1;
                if (iM1989G < c0616k2.f2218a0.getAdapter().mo985a()) {
                    Calendar calendarM1749a2 = AbstractC0628w.m1749a(this.f2202b.f2268d.f2187a.f2252a);
                    calendarM1749a2.add(2, iM1989G);
                    c0616k2.m1735F(new C0620o(calendarM1749a2));
                }
                break;
        }
    }
}
