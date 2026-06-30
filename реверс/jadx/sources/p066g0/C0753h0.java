package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p019K0.C0163e;

/* JADX INFO: renamed from: g0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0753h0 implements Parcelable {
    public static final Parcelable.Creator<C0753h0> CREATOR = new C0163e(13);

    /* JADX INFO: renamed from: a */
    public int f2994a;

    /* JADX INFO: renamed from: b */
    public int f2995b;

    /* JADX INFO: renamed from: c */
    public int[] f2996c;

    /* JADX INFO: renamed from: d */
    public boolean f2997d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2994a + ", mGapDir=" + this.f2995b + ", mHasUnwantedGapAfter=" + this.f2997d + ", mGapPerSpan=" + Arrays.toString(this.f2996c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2994a);
        parcel.writeInt(this.f2995b);
        parcel.writeInt(this.f2997d ? 1 : 0);
        int[] iArr = this.f2996c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2996c);
        }
    }
}
