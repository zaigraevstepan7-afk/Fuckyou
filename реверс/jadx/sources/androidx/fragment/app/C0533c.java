package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p019K0.C0163e;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0533c implements Parcelable {
    public static final Parcelable.Creator<C0533c> CREATOR = new C0163e(5);

    /* JADX INFO: renamed from: a */
    public final ArrayList f1707a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1708b;

    public C0533c(Parcel parcel) {
        this.f1707a = parcel.createStringArrayList();
        this.f1708b = parcel.createTypedArrayList(C0532b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f1707a);
        parcel.writeTypedList(this.f1708b);
    }
}
