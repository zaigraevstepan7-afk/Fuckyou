package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r41 extends ws1 implements Parcelable, fq1, ns1, fy0 {
    public static final Parcelable.Creator<r41> CREATOR = new a2(5);
    public cq1 f;

    public r41(float f) {
        sp1 sp1VarJ = aq1.j();
        cq1 cq1Var = new cq1(f, sp1VarJ.g());
        if (!(sp1VarJ instanceof gc0)) {
            cq1Var.b = new cq1(f, 1L);
        }
        this.f = cq1Var;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.f;
    }

    @Override // defpackage.vs1
    public final xs1 b(xs1 xs1Var, xs1 xs1Var2, xs1 xs1Var3) {
        if (((cq1) xs1Var2).c == ((cq1) xs1Var3).c) {
            return xs1Var2;
        }
        return null;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.getClass();
        this.f = (cq1) xs1Var;
    }

    @Override // defpackage.fq1
    public final hq1 d() {
        return l91.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((cq1) aq1.t(this.f, this)).c;
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        sp1 sp1VarJ;
        cq1 cq1Var = (cq1) aq1.h(this.f);
        if (cq1Var.c == f) {
            return;
        }
        cq1 cq1Var2 = this.f;
        synchronized (aq1.c) {
            sp1VarJ = aq1.j();
            ((cq1) aq1.o(cq1Var2, this, sp1VarJ, cq1Var)).c = f;
        }
        aq1.n(sp1VarJ, this);
    }

    @Override // defpackage.fy0
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((cq1) aq1.h(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
