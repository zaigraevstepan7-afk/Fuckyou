package p077m0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p084q.C1027f;

/* JADX INFO: renamed from: m0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1005b extends AbstractC1004a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f3988d;

    /* JADX INFO: renamed from: e */
    public final Parcel f3989e;

    /* JADX INFO: renamed from: f */
    public final int f3990f;

    /* JADX INFO: renamed from: g */
    public final int f3991g;

    /* JADX INFO: renamed from: h */
    public final String f3992h;

    /* JADX INFO: renamed from: i */
    public int f3993i;

    /* JADX INFO: renamed from: j */
    public int f3994j;

    /* JADX INFO: renamed from: k */
    public int f3995k;

    public C1005b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1027f(0), new C1027f(0), new C1027f(0));
    }

    @Override // p077m0.AbstractC1004a
    /* JADX INFO: renamed from: a */
    public final C1005b mo2448a() {
        Parcel parcel = this.f3989e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f3994j;
        if (i2 == this.f3990f) {
            i2 = this.f3991g;
        }
        return new C1005b(parcel, iDataPosition, i2, this.f3992h + "  ", this.f3985a, this.f3986b, this.f3987c);
    }

    @Override // p077m0.AbstractC1004a
    /* JADX INFO: renamed from: e */
    public final boolean mo2452e(int i2) {
        while (this.f3994j < this.f3991g) {
            int i3 = this.f3995k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f3994j;
            Parcel parcel = this.f3989e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f3995k = parcel.readInt();
            this.f3994j += i5;
        }
        return this.f3995k == i2;
    }

    @Override // p077m0.AbstractC1004a
    /* JADX INFO: renamed from: h */
    public final void mo2455h(int i2) {
        int i3 = this.f3993i;
        SparseIntArray sparseIntArray = this.f3988d;
        Parcel parcel = this.f3989e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f3993i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C1005b(Parcel parcel, int i2, int i3, String str, C1027f c1027f, C1027f c1027f2, C1027f c1027f3) {
        super(c1027f, c1027f2, c1027f3);
        this.f3988d = new SparseIntArray();
        this.f3993i = -1;
        this.f3995k = -1;
        this.f3989e = parcel;
        this.f3990f = i2;
        this.f3991g = i3;
        this.f3994j = i2;
        this.f3992h = str;
    }
}
