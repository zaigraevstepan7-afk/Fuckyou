package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.reddit.frontpage.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0610e extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f2197d;

    /* JADX INFO: renamed from: a */
    public final Calendar f2198a;

    /* JADX INFO: renamed from: b */
    public final int f2199b;

    /* JADX INFO: renamed from: c */
    public final int f2200c;

    static {
        f2197d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0610e() {
        Calendar calendarM1751c = AbstractC0628w.m1751c(null);
        this.f2198a = calendarM1751c;
        this.f2199b = calendarM1751c.getMaximum(7);
        this.f2200c = calendarM1751c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2199b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        int i3 = this.f2199b;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f2200c;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resc, viewGroup, false);
        }
        int i3 = i2 + this.f2200c;
        int i4 = this.f2199b;
        if (i3 > i4) {
            i3 -= i4;
        }
        Calendar calendar = this.f2198a;
        calendar.set(7, i3);
        textView.setText(calendar.getDisplayName(7, f2197d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.resc), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0610e(int i2) {
        Calendar calendarM1751c = AbstractC0628w.m1751c(null);
        this.f2198a = calendarM1751c;
        this.f2199b = calendarM1751c.getMaximum(7);
        this.f2200c = i2;
    }
}
