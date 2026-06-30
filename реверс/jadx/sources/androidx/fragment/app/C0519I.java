package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p019K0.C0163e;

/* JADX INFO: renamed from: androidx.fragment.app.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0519I implements Parcelable {
    public static final Parcelable.Creator<C0519I> CREATOR = new C0163e(7);

    /* JADX INFO: renamed from: a */
    public ArrayList f1617a;

    /* JADX INFO: renamed from: b */
    public ArrayList f1618b;

    /* JADX INFO: renamed from: c */
    public C0532b[] f1619c;

    /* JADX INFO: renamed from: d */
    public int f1620d;

    /* JADX INFO: renamed from: e */
    public String f1621e;

    /* JADX INFO: renamed from: f */
    public ArrayList f1622f;

    /* JADX INFO: renamed from: g */
    public ArrayList f1623g;

    /* JADX INFO: renamed from: h */
    public ArrayList f1624h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f1617a);
        parcel.writeStringList(this.f1618b);
        parcel.writeTypedArray(this.f1619c, i2);
        parcel.writeInt(this.f1620d);
        parcel.writeString(this.f1621e);
        parcel.writeStringList(this.f1622f);
        parcel.writeTypedList(this.f1623g);
        parcel.writeTypedList(this.f1624h);
    }
}
