package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t41 extends ws1 implements Parcelable, fq1, ns1, fy0 {
    public static final Parcelable.Creator<t41> CREATOR = new a2(7);
    public eq1 f;

    public t41(long j) {
        sp1 sp1VarJ = aq1.j();
        eq1 eq1Var = new eq1(sp1VarJ.g(), j);
        if (!(sp1VarJ instanceof gc0)) {
            eq1Var.b = new eq1(1L, j);
        }
        this.f = eq1Var;
    }

    @Override // defpackage.vs1
    public final xs1 a() {
        return this.f;
    }

    @Override // defpackage.vs1
    public final xs1 b(xs1 xs1Var, xs1 xs1Var2, xs1 xs1Var3) {
        if (((eq1) xs1Var2).c == ((eq1) xs1Var3).c) {
            return xs1Var2;
        }
        return null;
    }

    @Override // defpackage.vs1
    public final void c(xs1 xs1Var) {
        xs1Var.getClass();
        this.f = (eq1) xs1Var;
    }

    @Override // defpackage.fq1
    public final hq1 d() {
        return l91.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((eq1) aq1.t(this.f, this)).c;
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        sp1 sp1VarJ;
        eq1 eq1Var = (eq1) aq1.h(this.f);
        if (eq1Var.c != j) {
            eq1 eq1Var2 = this.f;
            synchronized (aq1.c) {
                sp1VarJ = aq1.j();
                ((eq1) aq1.o(eq1Var2, this, sp1VarJ, eq1Var)).c = j;
            }
            aq1.n(sp1VarJ, this);
        }
    }

    @Override // defpackage.fy0
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((eq1) aq1.h(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
