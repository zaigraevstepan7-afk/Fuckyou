package p074l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p019K0.C0163e;

/* JADX INFO: renamed from: l.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0895Q extends View.BaseSavedState {
    public static final Parcelable.Creator<C0895Q> CREATOR = new C0163e(15);

    /* JADX INFO: renamed from: a */
    public boolean f3597a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f3597a ? (byte) 1 : (byte) 0);
    }
}
