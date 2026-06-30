package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u41 implements Parcelable.ClassLoaderCreator {
    public static v41 a(Parcel parcel, ClassLoader classLoader) {
        hq1 hq1Var;
        if (classLoader == null) {
            classLoader = u41.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            hq1Var = v20.S;
        } else if (i == 1) {
            hq1Var = l91.p;
        } else {
            if (i != 2) {
                yc.l(s91.h(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            hq1Var = l91.f;
        }
        return new v41(value, hq1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new v41[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
