package p040V;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;

/* JADX INFO: renamed from: V.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0397b implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f1069a;

    /* JADX INFO: renamed from: b */
    public static final C0396a f1068b = new C0396a();
    public static final Parcelable.Creator<AbstractC0397b> CREATOR = new C0007h(4);

    public AbstractC0397b() {
        this.f1069a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1069a, i2);
    }

    public AbstractC0397b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1069a = parcelable == f1068b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0397b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1069a = parcelable == null ? f1068b : parcelable;
    }
}
