package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v41 extends ws1 implements Parcelable, fq1 {
    public static final Parcelable.Creator<v41> CREATOR = new u41();
    public final hq1 f;
    public gq1 g;

    public v41(Object obj, hq1 hq1Var) {
        this.f = hq1Var;
        sp1 sp1VarJ = aq1.j();
        gq1 gq1Var = new gq1(sp1VarJ.g(), obj);
        if (!(sp1VarJ instanceof gc0)) {
            gq1Var.b = new gq1(1L, obj);
        }
        this.g = gq1Var;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.g;
    }

    @Override // defpackage.vs1
    public final xs1 b(xs1 xs1Var, xs1 xs1Var2, xs1 xs1Var3) {
        if (this.f.c(((gq1) xs1Var2).c, ((gq1) xs1Var3).c)) {
            return xs1Var2;
        }
        return null;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.getClass();
        this.g = (gq1) xs1Var;
    }

    @Override // defpackage.fq1
    public final hq1 d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return ((gq1) aq1.t(this.g, this)).c;
    }

    @Override // defpackage.fy0
    public final void setValue(Object obj) {
        sp1 sp1VarJ;
        gq1 gq1Var = (gq1) aq1.h(this.g);
        if (this.f.c(gq1Var.c, obj)) {
            return;
        }
        gq1 gq1Var2 = this.g;
        synchronized (aq1.c) {
            sp1VarJ = aq1.j();
            ((gq1) aq1.o(gq1Var2, this, sp1VarJ, gq1Var)).c = obj;
        }
        aq1.n(sp1VarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((gq1) aq1.h(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        v20 v20Var = v20.S;
        hq1 hq1Var = this.f;
        if (xi0.o(hq1Var, v20Var)) {
            i2 = 0;
        } else if (xi0.o(hq1Var, l91.p)) {
            i2 = 1;
        } else {
            if (!xi0.o(hq1Var, l91.f)) {
                yc.l("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
