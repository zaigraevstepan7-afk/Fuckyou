package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a2;
import defpackage.v52;
import defpackage.w52;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a2(4);
    public final w52 e;

    public ParcelImpl(Parcel parcel) {
        this.e = new v52(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new v52(parcel).i(this.e);
    }
}
