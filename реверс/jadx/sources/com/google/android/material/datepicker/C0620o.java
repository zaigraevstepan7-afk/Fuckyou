package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p019K0.C0163e;

/* JADX INFO: renamed from: com.google.android.material.datepicker.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0620o implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0620o> CREATOR = new C0163e(11);

    /* JADX INFO: renamed from: a */
    public final Calendar f2252a;

    /* JADX INFO: renamed from: b */
    public final int f2253b;

    /* JADX INFO: renamed from: c */
    public final int f2254c;

    /* JADX INFO: renamed from: d */
    public final int f2255d;

    /* JADX INFO: renamed from: e */
    public final int f2256e;

    /* JADX INFO: renamed from: f */
    public final long f2257f;

    /* JADX INFO: renamed from: g */
    public String f2258g;

    public C0620o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM1749a = AbstractC0628w.m1749a(calendar);
        this.f2252a = calendarM1749a;
        this.f2253b = calendarM1749a.get(2);
        this.f2254c = calendarM1749a.get(1);
        this.f2255d = calendarM1749a.getMaximum(7);
        this.f2256e = calendarM1749a.getActualMaximum(5);
        this.f2257f = calendarM1749a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static C0620o m1740a(int i2, int i3) {
        Calendar calendarM1751c = AbstractC0628w.m1751c(null);
        calendarM1751c.set(1, i2);
        calendarM1751c.set(2, i3);
        return new C0620o(calendarM1751c);
    }

    /* JADX INFO: renamed from: b */
    public static C0620o m1741b(long j2) {
        Calendar calendarM1751c = AbstractC0628w.m1751c(null);
        calendarM1751c.setTimeInMillis(j2);
        return new C0620o(calendarM1751c);
    }

    /* JADX INFO: renamed from: c */
    public final String m1742c() {
        String dateTime;
        if (this.f2258g == null) {
            long timeInMillis = this.f2252a.getTimeInMillis();
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
            this.f2258g = dateTime;
        }
        return this.f2258g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2252a.compareTo(((C0620o) obj).f2252a);
    }

    /* JADX INFO: renamed from: d */
    public final int m1743d(C0620o c0620o) {
        if (!(this.f2252a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0620o.f2253b - this.f2253b) + ((c0620o.f2254c - this.f2254c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0620o)) {
            return false;
        }
        C0620o c0620o = (C0620o) obj;
        return this.f2253b == c0620o.f2253b && this.f2254c == c0620o.f2254c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2253b), Integer.valueOf(this.f2254c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2254c);
        parcel.writeInt(this.f2253b);
    }
}
