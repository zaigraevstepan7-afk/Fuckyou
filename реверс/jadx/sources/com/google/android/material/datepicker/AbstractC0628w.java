package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0628w {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f2272a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m1749a(Calendar calendar) {
        Calendar calendarM1751c = m1751c(calendar);
        Calendar calendarM1751c2 = m1751c(null);
        calendarM1751c2.set(calendarM1751c.get(1), calendarM1751c.get(2), calendarM1751c.get(5));
        return calendarM1751c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m1750b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m1751c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
