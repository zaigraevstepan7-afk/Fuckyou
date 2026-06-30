package p000A;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.constraintlayout.helper.widget.C1146;
import p004C.C1122;
import p023M0.C1127;
import p040V.AbstractC0397b;
import p058d0.C0643;
import p075l0.C1168;

/* JADX INFO: renamed from: A.i */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0008i extends AbstractC0397b {
    public static final Parcelable.Creator<C0008i> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public SparseArray f20c;

    static {
        ZLoader.registerNativesForClass(8, C0008i.class);
        Hidden0.special_clinit_8_00(C0008i.class);
    }

    public C0008i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int iM4786 = C1168.m4786(parcel);
        int[] iArr = new int[iM4786];
        C1127.m3040(parcel, iArr);
        Parcelable[] parcelableArrM4318 = C0643.m4318(parcel, classLoader);
        this.f20c = new SparseArray(iM4786);
        for (int i2 = 0; i2 < iM4786; i2++) {
            C1122.m2822(C1146.m3838(this), iArr[i2], parcelableArrM4318[i2]);
        }
    }

    @Override // p040V.AbstractC0397b, android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i2);
}
