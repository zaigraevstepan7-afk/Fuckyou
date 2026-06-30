package p005C0;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p040V.AbstractC0397b;

/* JADX INFO: renamed from: C0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0036b extends AbstractC0397b {
    public static final Parcelable.Creator<C0036b> CREATOR = new C0007h(1);

    /* JADX INFO: renamed from: c */
    public boolean f80c;

    public C0036b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f80c = parcel.readInt() == 1;
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f80c ? 1 : 0);
    }
}
