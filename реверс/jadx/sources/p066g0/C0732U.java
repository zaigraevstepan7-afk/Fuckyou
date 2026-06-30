package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p040V.AbstractC0397b;

/* JADX INFO: renamed from: g0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0732U extends AbstractC0397b {
    public static final Parcelable.Creator<C0732U> CREATOR = new C0007h(5);

    /* JADX INFO: renamed from: c */
    public Parcelable f2896c;

    public C0732U(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2896c = parcel.readParcelable(classLoader == null ? AbstractC0723K.class.getClassLoader() : classLoader);
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f2896c, 0);
    }
}
