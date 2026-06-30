package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new b2(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new gw(parcel.readInt());
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                parcel.getClass();
                return new xh0(parcel);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                pz0 pz0Var = new pz0(parcel);
                pz0Var.e = parcel.readInt();
                return pz0Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new ParcelImpl(parcel);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new r41(parcel.readFloat());
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return new s41(parcel.readInt());
            default:
                return new t41(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b2[i];
            case 1:
                return new gw[i];
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new xh0[i];
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new pz0[i];
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new ParcelImpl[i];
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new r41[i];
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return new s41[i];
            default:
                return new t41[i];
        }
    }
}
