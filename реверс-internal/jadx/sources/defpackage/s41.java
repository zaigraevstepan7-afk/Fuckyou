package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s41 extends ws1 implements Parcelable, fq1, ns1, fy0 {
    public static final Parcelable.Creator<s41> CREATOR = new a2(6);
    public dq1 f;

    public s41(int i) {
        sp1 sp1VarJ = aq1.j();
        dq1 dq1Var = new dq1(i, sp1VarJ.g());
        if (!(sp1VarJ instanceof gc0)) {
            dq1Var.b = new dq1(i, 1L);
        }
        this.f = dq1Var;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.f;
    }

    @Override // defpackage.vs1
    public final xs1 b(xs1 xs1Var, xs1 xs1Var2, xs1 xs1Var3) {
        if (((dq1) xs1Var2).c == ((dq1) xs1Var3).c) {
            return xs1Var2;
        }
        return null;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.getClass();
        this.f = (dq1) xs1Var;
    }

    @Override // defpackage.fq1
    public final hq1 d() {
        return l91.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((dq1) aq1.t(this.f, this)).c;
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        sp1 sp1VarJ;
        dq1 dq1Var = (dq1) aq1.h(this.f);
        if (dq1Var.c != i) {
            dq1 dq1Var2 = this.f;
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                ((dq1) aq1.o(dq1Var2, this, sp1VarJ, dq1Var)).c = i;
            }
            aq1.n(sp1VarJ, this);
        }
    }

    @Override // defpackage.fy0
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return s91.j("MutableIntState(value=", ((dq1) aq1.h(this.f)).c, ")@", hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
