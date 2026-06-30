package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p019K0.C0163e;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0607b implements Parcelable {
    public static final Parcelable.Creator<C0607b> CREATOR = new C0163e(9);

    /* JADX INFO: renamed from: a */
    public final C0620o f2187a;

    /* JADX INFO: renamed from: b */
    public final C0620o f2188b;

    /* JADX INFO: renamed from: c */
    public final C0609d f2189c;

    /* JADX INFO: renamed from: d */
    public final C0620o f2190d;

    /* JADX INFO: renamed from: e */
    public final int f2191e;

    /* JADX INFO: renamed from: f */
    public final int f2192f;

    /* JADX INFO: renamed from: g */
    public final int f2193g;

    public C0607b(C0620o c0620o, C0620o c0620o2, C0609d c0609d, C0620o c0620o3, int i2) {
        Objects.requireNonNull(c0620o, "start cannot be null");
        Objects.requireNonNull(c0620o2, "end cannot be null");
        Objects.requireNonNull(c0609d, "validator cannot be null");
        this.f2187a = c0620o;
        this.f2188b = c0620o2;
        this.f2190d = c0620o3;
        this.f2191e = i2;
        this.f2189c = c0609d;
        if (c0620o3 != null && c0620o.f2252a.compareTo(c0620o3.f2252a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0620o3 != null && c0620o3.f2252a.compareTo(c0620o2.f2252a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > AbstractC0628w.m1751c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2193g = c0620o.m1743d(c0620o2) + 1;
        this.f2192f = (c0620o2.f2254c - c0620o.f2254c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0607b)) {
            return false;
        }
        C0607b c0607b = (C0607b) obj;
        return this.f2187a.equals(c0607b.f2187a) && this.f2188b.equals(c0607b.f2188b) && Objects.equals(this.f2190d, c0607b.f2190d) && this.f2191e == c0607b.f2191e && this.f2189c.equals(c0607b.f2189c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2187a, this.f2188b, this.f2190d, Integer.valueOf(this.f2191e), this.f2189c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2187a, 0);
        parcel.writeParcelable(this.f2188b, 0);
        parcel.writeParcelable(this.f2190d, 0);
        parcel.writeParcelable(this.f2189c, 0);
        parcel.writeInt(this.f2191e);
    }
}
