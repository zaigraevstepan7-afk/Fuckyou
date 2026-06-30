package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p019K0.C0163e;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.activity.result.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0481h implements Parcelable {
    public static final Parcelable.Creator<C0481h> CREATOR = new C0163e(3);

    /* JADX INFO: renamed from: a */
    public final IntentSender f1234a;

    /* JADX INFO: renamed from: b */
    public final Intent f1235b;

    /* JADX INFO: renamed from: c */
    public final int f1236c;

    /* JADX INFO: renamed from: d */
    public final int f1237d;

    public C0481h(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f1234a = intentSender;
        this.f1235b = intent;
        this.f1236c = i2;
        this.f1237d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        AbstractC0451c.m1146e(parcel, "dest");
        parcel.writeParcelable(this.f1234a, i2);
        parcel.writeParcelable(this.f1235b, i2);
        parcel.writeInt(this.f1236c);
        parcel.writeInt(this.f1237d);
    }
}
