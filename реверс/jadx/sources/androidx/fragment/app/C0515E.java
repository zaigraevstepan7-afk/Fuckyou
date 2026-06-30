package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p019K0.C0163e;

/* JADX INFO: renamed from: androidx.fragment.app.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0515E implements Parcelable {
    public static final Parcelable.Creator<C0515E> CREATOR = new C0163e(6);

    /* JADX INFO: renamed from: a */
    public String f1569a;

    /* JADX INFO: renamed from: b */
    public int f1570b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1569a);
        parcel.writeInt(this.f1570b);
    }
}
