package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.u52;
import defpackage.v52;
import defpackage.w52;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(u52 u52Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        w52 w52VarG = remoteActionCompat.a;
        boolean z = true;
        if (u52Var.e(1)) {
            w52VarG = u52Var.g();
        }
        remoteActionCompat.a = (IconCompat) w52VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (u52Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((v52) u52Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (u52Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((v52) u52Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) u52Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (u52Var.e(5)) {
            z2 = ((v52) u52Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!u52Var.e(6)) {
            z = z3;
        } else if (((v52) u52Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, u52 u52Var) {
        u52Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        u52Var.h(1);
        u52Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        u52Var.h(2);
        Parcel parcel = ((v52) u52Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        u52Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        u52Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        u52Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        u52Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
