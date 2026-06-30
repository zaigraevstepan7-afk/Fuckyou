package p074l;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p040V.AbstractC0397b;

/* JADX INFO: renamed from: l.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940i1 extends AbstractC0397b {
    public static final Parcelable.Creator<C0940i1> CREATOR = new C0007h(6);

    /* JADX INFO: renamed from: c */
    public int f3728c;

    /* JADX INFO: renamed from: d */
    public boolean f3729d;

    public C0940i1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3728c = parcel.readInt();
        this.f3729d = parcel.readInt() != 0;
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3728c);
        parcel.writeInt(this.f3729d ? 1 : 0);
    }
}
