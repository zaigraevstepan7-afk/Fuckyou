package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.t91;
import defpackage.u52;
import defpackage.v52;
import defpackage.yc;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(u52 u52Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !u52Var.e(1) ? -1 : ((v52) u52Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (u52Var.e(2)) {
            Parcel parcel = ((v52) u52Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = u52Var.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (u52Var.e(4)) {
            i2 = ((v52) u52Var).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (u52Var.e(5)) {
            i3 = ((v52) u52Var).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) u52Var.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (u52Var.e(7)) {
            string = ((v52) u52Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (u52Var.e(8)) {
            string2 = ((v52) u52Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                yc.p("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case t91.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
            case t91.LONG_FIELD_NUMBER /* 4 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, u52 u52Var) {
        u52Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case t91.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            u52Var.h(1);
            ((v52) u52Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            u52Var.h(2);
            Parcel parcel = ((v52) u52Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            u52Var.h(3);
            ((v52) u52Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            u52Var.h(4);
            ((v52) u52Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            u52Var.h(5);
            ((v52) u52Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            u52Var.h(6);
            ((v52) u52Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            u52Var.h(7);
            ((v52) u52Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            u52Var.h(8);
            ((v52) u52Var).e.writeString(str2);
        }
    }
}
