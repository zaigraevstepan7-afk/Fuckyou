package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p019K0.C0163e;

/* JADX INFO: renamed from: androidx.fragment.app.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0522L implements Parcelable {
    public static final Parcelable.Creator<C0522L> CREATOR = new C0163e(8);

    /* JADX INFO: renamed from: a */
    public final String f1631a;

    /* JADX INFO: renamed from: b */
    public final String f1632b;

    /* JADX INFO: renamed from: c */
    public final boolean f1633c;

    /* JADX INFO: renamed from: d */
    public final int f1634d;

    /* JADX INFO: renamed from: e */
    public final int f1635e;

    /* JADX INFO: renamed from: f */
    public final String f1636f;

    /* JADX INFO: renamed from: g */
    public final boolean f1637g;

    /* JADX INFO: renamed from: h */
    public final boolean f1638h;

    /* JADX INFO: renamed from: i */
    public final boolean f1639i;

    /* JADX INFO: renamed from: j */
    public final Bundle f1640j;

    /* JADX INFO: renamed from: k */
    public final boolean f1641k;

    /* JADX INFO: renamed from: l */
    public final int f1642l;

    /* JADX INFO: renamed from: m */
    public Bundle f1643m;

    public C0522L(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        this.f1631a = abstractComponentCallbacksC0548r.getClass().getName();
        this.f1632b = abstractComponentCallbacksC0548r.f1781e;
        this.f1633c = abstractComponentCallbacksC0548r.f1789m;
        this.f1634d = abstractComponentCallbacksC0548r.f1798v;
        this.f1635e = abstractComponentCallbacksC0548r.f1799w;
        this.f1636f = abstractComponentCallbacksC0548r.f1800x;
        this.f1637g = abstractComponentCallbacksC0548r.f1759A;
        this.f1638h = abstractComponentCallbacksC0548r.f1788l;
        this.f1639i = abstractComponentCallbacksC0548r.f1802z;
        this.f1640j = abstractComponentCallbacksC0548r.f1782f;
        this.f1641k = abstractComponentCallbacksC0548r.f1801y;
        this.f1642l = abstractComponentCallbacksC0548r.f1770L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1631a);
        sb.append(" (");
        sb.append(this.f1632b);
        sb.append(")}:");
        if (this.f1633c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f1635e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f1636f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1637g) {
            sb.append(" retainInstance");
        }
        if (this.f1638h) {
            sb.append(" removing");
        }
        if (this.f1639i) {
            sb.append(" detached");
        }
        if (this.f1641k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1631a);
        parcel.writeString(this.f1632b);
        parcel.writeInt(this.f1633c ? 1 : 0);
        parcel.writeInt(this.f1634d);
        parcel.writeInt(this.f1635e);
        parcel.writeString(this.f1636f);
        parcel.writeInt(this.f1637g ? 1 : 0);
        parcel.writeInt(this.f1638h ? 1 : 0);
        parcel.writeInt(this.f1639i ? 1 : 0);
        parcel.writeBundle(this.f1640j);
        parcel.writeInt(this.f1641k ? 1 : 0);
        parcel.writeBundle(this.f1643m);
        parcel.writeInt(this.f1642l);
    }

    public C0522L(Parcel parcel) {
        this.f1631a = parcel.readString();
        this.f1632b = parcel.readString();
        this.f1633c = parcel.readInt() != 0;
        this.f1634d = parcel.readInt();
        this.f1635e = parcel.readInt();
        this.f1636f = parcel.readString();
        this.f1637g = parcel.readInt() != 0;
        this.f1638h = parcel.readInt() != 0;
        this.f1639i = parcel.readInt() != 0;
        this.f1640j = parcel.readBundle();
        this.f1641k = parcel.readInt() != 0;
        this.f1643m = parcel.readBundle();
        this.f1642l = parcel.readInt();
    }
}
