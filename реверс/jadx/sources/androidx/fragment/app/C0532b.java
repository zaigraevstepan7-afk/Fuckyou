package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p019K0.C0163e;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0532b implements Parcelable {
    public static final Parcelable.Creator<C0532b> CREATOR = new C0163e(4);

    /* JADX INFO: renamed from: a */
    public final int[] f1693a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1694b;

    /* JADX INFO: renamed from: c */
    public final int[] f1695c;

    /* JADX INFO: renamed from: d */
    public final int[] f1696d;

    /* JADX INFO: renamed from: e */
    public final int f1697e;

    /* JADX INFO: renamed from: f */
    public final String f1698f;

    /* JADX INFO: renamed from: g */
    public final int f1699g;

    /* JADX INFO: renamed from: h */
    public final int f1700h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f1701i;

    /* JADX INFO: renamed from: j */
    public final int f1702j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f1703k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f1704l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f1705m;

    /* JADX INFO: renamed from: n */
    public final boolean f1706n;

    public C0532b(C0531a c0531a) {
        int size = c0531a.f1675a.size();
        this.f1693a = new int[size * 6];
        if (!c0531a.f1681g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1694b = new ArrayList(size);
        this.f1695c = new int[size];
        this.f1696d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0524N c0524n = (C0524N) c0531a.f1675a.get(i3);
            int i4 = i2 + 1;
            this.f1693a[i2] = c0524n.f1649a;
            ArrayList arrayList = this.f1694b;
            AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r = c0524n.f1650b;
            arrayList.add(abstractComponentCallbacksC0548r != null ? abstractComponentCallbacksC0548r.f1781e : null);
            int[] iArr = this.f1693a;
            iArr[i4] = c0524n.f1651c ? 1 : 0;
            iArr[i2 + 2] = c0524n.f1652d;
            iArr[i2 + 3] = c0524n.f1653e;
            int i5 = i2 + 5;
            iArr[i2 + 4] = c0524n.f1654f;
            i2 += 6;
            iArr[i5] = c0524n.f1655g;
            this.f1695c[i3] = c0524n.f1656h.ordinal();
            this.f1696d[i3] = c0524n.f1657i.ordinal();
        }
        this.f1697e = c0531a.f1680f;
        this.f1698f = c0531a.f1682h;
        this.f1699g = c0531a.f1692r;
        this.f1700h = c0531a.f1683i;
        this.f1701i = c0531a.f1684j;
        this.f1702j = c0531a.f1685k;
        this.f1703k = c0531a.f1686l;
        this.f1704l = c0531a.f1687m;
        this.f1705m = c0531a.f1688n;
        this.f1706n = c0531a.f1689o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1693a);
        parcel.writeStringList(this.f1694b);
        parcel.writeIntArray(this.f1695c);
        parcel.writeIntArray(this.f1696d);
        parcel.writeInt(this.f1697e);
        parcel.writeString(this.f1698f);
        parcel.writeInt(this.f1699g);
        parcel.writeInt(this.f1700h);
        TextUtils.writeToParcel(this.f1701i, parcel, 0);
        parcel.writeInt(this.f1702j);
        TextUtils.writeToParcel(this.f1703k, parcel, 0);
        parcel.writeStringList(this.f1704l);
        parcel.writeStringList(this.f1705m);
        parcel.writeInt(this.f1706n ? 1 : 0);
    }

    public C0532b(Parcel parcel) {
        this.f1693a = parcel.createIntArray();
        this.f1694b = parcel.createStringArrayList();
        this.f1695c = parcel.createIntArray();
        this.f1696d = parcel.createIntArray();
        this.f1697e = parcel.readInt();
        this.f1698f = parcel.readString();
        this.f1699g = parcel.readInt();
        this.f1700h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1701i = (CharSequence) creator.createFromParcel(parcel);
        this.f1702j = parcel.readInt();
        this.f1703k = (CharSequence) creator.createFromParcel(parcel);
        this.f1704l = parcel.createStringArrayList();
        this.f1705m = parcel.createStringArrayList();
        this.f1706n = parcel.readInt() != 0;
    }
}
