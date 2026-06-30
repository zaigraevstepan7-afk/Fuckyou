package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import p019K0.C0163e;

/* JADX INFO: renamed from: g0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0771v implements Parcelable {
    public static final Parcelable.Creator<C0771v> CREATOR = new C0163e(12);

    /* JADX INFO: renamed from: a */
    public int f3122a;

    /* JADX INFO: renamed from: b */
    public int f3123b;

    /* JADX INFO: renamed from: c */
    public boolean f3124c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3122a);
        parcel.writeInt(this.f3123b);
        parcel.writeInt(this.f3124c ? 1 : 0);
    }
}
