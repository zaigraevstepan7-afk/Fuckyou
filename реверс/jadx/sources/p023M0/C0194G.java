package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C1156;
import p040V.AbstractC0397b;
import p068h0.C1162;
import p075l0.C1168;

/* JADX INFO: renamed from: M0.G */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0194G extends AbstractC0397b {
    public static final Parcelable.Creator<C0194G> CREATOR = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4837short = null;

    /* JADX INFO: renamed from: c */
    public CharSequence f635c;

    /* JADX INFO: renamed from: d */
    public boolean f636d;

    static {
        ZLoader.registerNativesForClass(26, C0194G.class);
        Hidden0.special_clinit_26_00(C0194G.class);
    }

    public C0194G(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f635c = (CharSequence) C1162.m4552(C1156.m4224(), parcel);
        this.f636d = C1168.m4786(parcel) == 1;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static native short[] m3003();

    public final native String toString();

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i2);
}
