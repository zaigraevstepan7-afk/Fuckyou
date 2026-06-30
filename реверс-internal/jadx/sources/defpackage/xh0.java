package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 implements Parcelable {
    public static final Parcelable.Creator<xh0> CREATOR = new a2(2);
    public final IntentSender e;
    public final Intent f;
    public final int g;
    public final int h;

    public xh0(Parcel parcel) {
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        parcelable.getClass();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        this.e = (IntentSender) parcelable;
        this.f = intent;
        this.g = i;
        this.h = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
