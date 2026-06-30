package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p077m0.AbstractC1004a;
import p077m0.C1005b;
import p077m0.InterfaceC1006c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1004a abstractC1004a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1006c interfaceC1006cM2454g = remoteActionCompat.f1459a;
        boolean z2 = true;
        if (abstractC1004a.mo2452e(1)) {
            interfaceC1006cM2454g = abstractC1004a.m2454g();
        }
        remoteActionCompat.f1459a = (IconCompat) interfaceC1006cM2454g;
        CharSequence charSequence = remoteActionCompat.f1460b;
        if (abstractC1004a.mo2452e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1005b) abstractC1004a).f3989e);
        }
        remoteActionCompat.f1460b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1461c;
        if (abstractC1004a.mo2452e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1005b) abstractC1004a).f3989e);
        }
        remoteActionCompat.f1461c = charSequence2;
        remoteActionCompat.f1462d = (PendingIntent) abstractC1004a.m2453f(remoteActionCompat.f1462d, 4);
        boolean z3 = remoteActionCompat.f1463e;
        if (abstractC1004a.mo2452e(5)) {
            z3 = ((C1005b) abstractC1004a).f3989e.readInt() != 0;
        }
        remoteActionCompat.f1463e = z3;
        boolean z4 = remoteActionCompat.f1464f;
        if (!abstractC1004a.mo2452e(6)) {
            z2 = z4;
        } else if (((C1005b) abstractC1004a).f3989e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f1464f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1004a abstractC1004a) {
        abstractC1004a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1459a;
        abstractC1004a.mo2455h(1);
        abstractC1004a.m2456i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1460b;
        abstractC1004a.mo2455h(2);
        Parcel parcel = ((C1005b) abstractC1004a).f3989e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1461c;
        abstractC1004a.mo2455h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1462d;
        abstractC1004a.mo2455h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1463e;
        abstractC1004a.mo2455h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1464f;
        abstractC1004a.mo2455h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
