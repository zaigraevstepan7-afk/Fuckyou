package p017J0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p000A.C0007h;
import p040V.AbstractC0397b;

/* JADX INFO: renamed from: J0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0143d extends AbstractC0397b {
    public static final Parcelable.Creator<C0143d> CREATOR = new C0007h(2);

    /* JADX INFO: renamed from: c */
    public final int f452c;

    public C0143d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f452c = parcel.readInt();
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f452c);
    }

    public C0143d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f452c = sideSheetBehavior.f2314h;
    }
}
