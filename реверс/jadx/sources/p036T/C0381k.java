package p036T;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p019K0.C0163e;

/* JADX INFO: renamed from: T.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0381k extends View.BaseSavedState {
    public static final Parcelable.Creator<C0381k> CREATOR = new C0163e(1);

    /* JADX INFO: renamed from: a */
    public int f1041a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1041a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1041a);
    }
}
