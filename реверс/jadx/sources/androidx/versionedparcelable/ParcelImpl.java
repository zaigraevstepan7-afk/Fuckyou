package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p019K0.C0163e;
import p077m0.C1005b;
import p077m0.InterfaceC1006c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0163e(16);

    /* JADX INFO: renamed from: a */
    public final InterfaceC1006c f2032a;

    public ParcelImpl(Parcel parcel) {
        this.f2032a = new C1005b(parcel).m2454g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new C1005b(parcel).m2456i(this.f2032a);
    }
}
