package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p019K0.C0163e;

/* JADX INFO: renamed from: g0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0755i0 implements Parcelable {
    public static final Parcelable.Creator<C0755i0> CREATOR = new C0163e(14);

    /* JADX INFO: renamed from: a */
    public int f3003a;

    /* JADX INFO: renamed from: b */
    public int f3004b;

    /* JADX INFO: renamed from: c */
    public int f3005c;

    /* JADX INFO: renamed from: d */
    public int[] f3006d;

    /* JADX INFO: renamed from: e */
    public int f3007e;

    /* JADX INFO: renamed from: f */
    public int[] f3008f;

    /* JADX INFO: renamed from: g */
    public ArrayList f3009g;

    /* JADX INFO: renamed from: h */
    public boolean f3010h;

    /* JADX INFO: renamed from: i */
    public boolean f3011i;

    /* JADX INFO: renamed from: j */
    public boolean f3012j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3003a);
        parcel.writeInt(this.f3004b);
        parcel.writeInt(this.f3005c);
        if (this.f3005c > 0) {
            parcel.writeIntArray(this.f3006d);
        }
        parcel.writeInt(this.f3007e);
        if (this.f3007e > 0) {
            parcel.writeIntArray(this.f3008f);
        }
        parcel.writeInt(this.f3010h ? 1 : 0);
        parcel.writeInt(this.f3011i ? 1 : 0);
        parcel.writeInt(this.f3012j ? 1 : 0);
        parcel.writeList(this.f3009g);
    }
}
