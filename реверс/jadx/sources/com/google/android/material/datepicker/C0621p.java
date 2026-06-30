package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0621p extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f2259d = AbstractC0628w.m1751c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f2260e = (AbstractC0628w.m1751c(null).getMaximum(7) + AbstractC0628w.m1751c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final C0620o f2261a;

    /* JADX INFO: renamed from: b */
    public C0608c f2262b;

    /* JADX INFO: renamed from: c */
    public final C0607b f2263c;

    public C0621p(C0620o c0620o, C0607b c0607b) {
        this.f2261a = c0620o;
        this.f2263c = c0607b;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m1744a() {
        int firstDayOfWeek = this.f2263c.f2191e;
        C0620o c0620o = this.f2261a;
        Calendar calendar = c0620o.f2252a;
        int i2 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - firstDayOfWeek;
        return i3 < 0 ? i3 + c0620o.f2255d : i3;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < m1744a() || i2 > m1746c()) {
            return null;
        }
        int iM1744a = (i2 - m1744a()) + 1;
        Calendar calendarM1749a = AbstractC0628w.m1749a(this.f2261a.f2252a);
        calendarM1749a.set(5, iM1744a);
        return Long.valueOf(calendarM1749a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public final int m1746c() {
        return (m1744a() + this.f2261a.f2256e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f2260e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f2261a.f2255d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f2262b == null) {
            this.f2262b = new C0608c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resc, viewGroup, false);
        }
        int iM1744a = i2 - m1744a();
        if (iM1744a >= 0) {
            C0620o c0620o = this.f2261a;
            if (iM1744a >= c0620o.f2256e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c0620o);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM1744a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        if (getItem(i2) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        AbstractC0628w.m1750b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
