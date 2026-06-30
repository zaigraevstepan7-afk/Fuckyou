package p096w0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p019K0.C0163e;

/* JADX INFO: renamed from: w0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1091b extends View.BaseSavedState {
    public static final Parcelable.Creator<C1091b> CREATOR = new C0163e(17);

    /* JADX INFO: renamed from: a */
    public int f4491a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i2 = this.f4491a;
        sb.append(i2 != 1 ? i2 != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Integer.valueOf(this.f4491a));
    }
}
