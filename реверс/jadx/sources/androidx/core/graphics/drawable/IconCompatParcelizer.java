package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p077m0.AbstractC1004a;
import p077m0.C1005b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1004a abstractC1004a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1466a;
        if (abstractC1004a.mo2452e(1)) {
            i2 = ((C1005b) abstractC1004a).f3989e.readInt();
        }
        iconCompat.f1466a = i2;
        byte[] bArr = iconCompat.f1468c;
        if (abstractC1004a.mo2452e(2)) {
            Parcel parcel = ((C1005b) abstractC1004a).f3989e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1468c = bArr;
        iconCompat.f1469d = abstractC1004a.m2453f(iconCompat.f1469d, 3);
        int i4 = iconCompat.f1470e;
        if (abstractC1004a.mo2452e(4)) {
            i4 = ((C1005b) abstractC1004a).f3989e.readInt();
        }
        iconCompat.f1470e = i4;
        int i5 = iconCompat.f1471f;
        if (abstractC1004a.mo2452e(5)) {
            i5 = ((C1005b) abstractC1004a).f3989e.readInt();
        }
        iconCompat.f1471f = i5;
        iconCompat.f1472g = (ColorStateList) abstractC1004a.m2453f(iconCompat.f1472g, 6);
        String string = iconCompat.f1474i;
        if (abstractC1004a.mo2452e(7)) {
            string = ((C1005b) abstractC1004a).f3989e.readString();
        }
        iconCompat.f1474i = string;
        String string2 = iconCompat.f1475j;
        if (abstractC1004a.mo2452e(8)) {
            string2 = ((C1005b) abstractC1004a).f3989e.readString();
        }
        iconCompat.f1475j = string2;
        iconCompat.f1473h = PorterDuff.Mode.valueOf(iconCompat.f1474i);
        switch (iconCompat.f1466a) {
            case -1:
                Parcelable parcelable = iconCompat.f1469d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1467b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1469d;
                if (parcelable2 != null) {
                    iconCompat.f1467b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1468c;
                iconCompat.f1467b = bArr3;
                iconCompat.f1466a = 3;
                iconCompat.f1470e = 0;
                iconCompat.f1471f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1468c, Charset.forName("UTF-16"));
                iconCompat.f1467b = str;
                if (iconCompat.f1466a == 2 && iconCompat.f1475j == null) {
                    iconCompat.f1475j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1467b = iconCompat.f1468c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1004a abstractC1004a) {
        abstractC1004a.getClass();
        iconCompat.f1474i = iconCompat.f1473h.name();
        switch (iconCompat.f1466a) {
            case -1:
                iconCompat.f1469d = (Parcelable) iconCompat.f1467b;
                break;
            case 1:
            case 5:
                iconCompat.f1469d = (Parcelable) iconCompat.f1467b;
                break;
            case 2:
                iconCompat.f1468c = ((String) iconCompat.f1467b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1468c = (byte[]) iconCompat.f1467b;
                break;
            case 4:
            case 6:
                iconCompat.f1468c = iconCompat.f1467b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1466a;
        if (-1 != i2) {
            abstractC1004a.mo2455h(1);
            ((C1005b) abstractC1004a).f3989e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1468c;
        if (bArr != null) {
            abstractC1004a.mo2455h(2);
            int length = bArr.length;
            Parcel parcel = ((C1005b) abstractC1004a).f3989e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1469d;
        if (parcelable != null) {
            abstractC1004a.mo2455h(3);
            ((C1005b) abstractC1004a).f3989e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1470e;
        if (i3 != 0) {
            abstractC1004a.mo2455h(4);
            ((C1005b) abstractC1004a).f3989e.writeInt(i3);
        }
        int i4 = iconCompat.f1471f;
        if (i4 != 0) {
            abstractC1004a.mo2455h(5);
            ((C1005b) abstractC1004a).f3989e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1472g;
        if (colorStateList != null) {
            abstractC1004a.mo2455h(6);
            ((C1005b) abstractC1004a).f3989e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1474i;
        if (str != null) {
            abstractC1004a.mo2455h(7);
            ((C1005b) abstractC1004a).f3989e.writeString(str);
        }
        String str2 = iconCompat.f1475j;
        if (str2 != null) {
            abstractC1004a.mo2455h(8);
            ((C1005b) abstractC1004a).f3989e.writeString(str2);
        }
    }
}
