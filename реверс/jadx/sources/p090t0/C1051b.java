package p090t0;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p040V.AbstractC0397b;

/* JADX INFO: renamed from: t0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1051b extends AbstractC0397b {
    public static final Parcelable.Creator<C1051b> CREATOR = new C0007h(8);

    /* JADX INFO: renamed from: c */
    public boolean f4186c;

    public C1051b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1051b.class.getClassLoader();
        }
        this.f4186c = parcel.readInt() == 1;
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4186c ? 1 : 0);
    }
}
