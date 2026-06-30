package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lq1 implements Parcelable.ClassLoaderCreator {
    public static mq1 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = lq1.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new mq1();
        }
        p61 p61VarF = np1.f.f();
        for (int i2 = 0; i2 < i; i2++) {
            p61VarF.add(parcel.readValue(classLoader));
        }
        return new mq1(p61VarF.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new mq1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
