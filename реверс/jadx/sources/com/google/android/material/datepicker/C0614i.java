package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p066g0.AbstractC0723K;
import p066g0.AbstractC0726N;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0614i extends AbstractC0726N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0624s f2207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f2208b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0616k f2209c;

    public C0614i(C0616k c0616k, C0624s c0624s, MaterialButton materialButton) {
        this.f2209c = c0616k;
        this.f2207a = c0624s;
        this.f2208b = materialButton;
    }

    @Override // p066g0.AbstractC0726N
    /* JADX INFO: renamed from: a */
    public final void mo1733a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f2208b.getText());
        }
    }

    @Override // p066g0.AbstractC0726N
    /* JADX INFO: renamed from: b */
    public final void mo1734b(RecyclerView recyclerView, int i2, int i3) {
        int iM1554N0;
        String dateTime;
        C0616k c0616k = this.f2209c;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0616k.f2218a0.getLayoutManager();
            View viewM1556P0 = linearLayoutManager.m1556P0(0, linearLayoutManager.m2014v(), false);
            iM1554N0 = viewM1556P0 == null ? -1 : AbstractC0723K.m1989G(viewM1556P0);
        } else {
            iM1554N0 = ((LinearLayoutManager) c0616k.f2218a0.getLayoutManager()).m1554N0();
        }
        C0607b c0607b = this.f2207a.f2268d;
        Calendar calendarM1749a = AbstractC0628w.m1749a(c0607b.f2187a.f2252a);
        calendarM1749a.add(2, iM1554N0);
        c0616k.f2214W = new C0620o(calendarM1749a);
        Calendar calendarM1749a2 = AbstractC0628w.m1749a(c0607b.f2187a.f2252a);
        calendarM1749a2.add(2, iM1554N0);
        calendarM1749a2.set(5, 1);
        Calendar calendarM1749a3 = AbstractC0628w.m1749a(calendarM1749a2);
        calendarM1749a3.get(2);
        calendarM1749a3.get(1);
        calendarM1749a3.getMaximum(7);
        calendarM1749a3.getActualMaximum(5);
        calendarM1749a3.getTimeInMillis();
        long timeInMillis = calendarM1749a3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0628w.f2272a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            dateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f2208b.setText(dateTime);
    }
}
