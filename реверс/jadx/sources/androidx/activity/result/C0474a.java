package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p019K0.C0163e;

/* JADX INFO: renamed from: androidx.activity.result.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0474a implements Parcelable {
    public static final Parcelable.Creator<C0474a> CREATOR = new C0163e(2);

    /* JADX INFO: renamed from: a */
    public final int f1216a;

    /* JADX INFO: renamed from: b */
    public final Intent f1217b;

    public C0474a(int i2, Intent intent) {
        this.f1216a = i2;
        this.f1217b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f1216a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1217b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1216a);
        Intent intent = this.f1217b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public C0474a(Parcel parcel) {
        this.f1216a = parcel.readInt();
        this.f1217b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
