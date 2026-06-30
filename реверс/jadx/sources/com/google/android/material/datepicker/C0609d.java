package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p019K0.C0163e;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0609d implements Parcelable {
    public static final Parcelable.Creator<C0609d> CREATOR = new C0163e(10);

    /* JADX INFO: renamed from: a */
    public final long f2196a;

    public C0609d(long j2) {
        this.f2196a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0609d) && this.f2196a == ((C0609d) obj).f2196a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2196a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f2196a);
    }
}
