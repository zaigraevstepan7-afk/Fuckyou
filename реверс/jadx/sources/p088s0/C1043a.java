package p088s0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000A.C0007h;
import p040V.AbstractC0397b;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1043a extends AbstractC0397b {
    public static final Parcelable.Creator<C1043a> CREATOR = new C0007h(7);

    /* JADX INFO: renamed from: c */
    public final int f4133c;

    /* JADX INFO: renamed from: d */
    public final int f4134d;

    /* JADX INFO: renamed from: e */
    public final boolean f4135e;

    /* JADX INFO: renamed from: f */
    public final boolean f4136f;

    /* JADX INFO: renamed from: g */
    public final boolean f4137g;

    public C1043a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4133c = parcel.readInt();
        this.f4134d = parcel.readInt();
        this.f4135e = parcel.readInt() == 1;
        this.f4136f = parcel.readInt() == 1;
        this.f4137g = parcel.readInt() == 1;
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4133c);
        parcel.writeInt(this.f4134d);
        parcel.writeInt(this.f4135e ? 1 : 0);
        parcel.writeInt(this.f4136f ? 1 : 0);
        parcel.writeInt(this.f4137g ? 1 : 0);
    }

    public C1043a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f4133c = bottomSheetBehavior.f2081L;
        this.f4134d = bottomSheetBehavior.f2104e;
        this.f4135e = bottomSheetBehavior.f2098b;
        this.f4136f = bottomSheetBehavior.f2078I;
        this.f4137g = bottomSheetBehavior.f2079J;
    }
}
