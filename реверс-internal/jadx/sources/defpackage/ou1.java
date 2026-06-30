package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 extends tn1 implements os1 {
    @Override // defpackage.os1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.m + ((long) ((int) ((p() + ((long) this.o)) - this.m)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            r(Integer.valueOf(((Number) objArr[((int) ((this.m + ((long) ((int) ((p() + ((long) this.o)) - this.m)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
