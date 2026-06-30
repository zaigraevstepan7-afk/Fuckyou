package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: A.h */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0007h implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4823short = null;

    /* JADX INFO: renamed from: a */
    public final int f19a;

    static {
        ZLoader.registerNativesForClass(7, C0007h.class);
        Hidden0.special_clinit_7_00(C0007h.class);
    }

    /* JADX INFO: renamed from: ۨۡۢۥ, reason: not valid java name and contains not printable characters */
    public static native short[] m2761();

    @Override // android.os.Parcelable.Creator
    public final native Object createFromParcel(Parcel parcel);

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final native Object createFromParcel(Parcel parcel, ClassLoader classLoader);

    @Override // android.os.Parcelable.Creator
    public final native Object[] newArray(int i2);
}
