package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jz {
    public final ex0 a;
    public final ex0 b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        j41 j41Var = new j41(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        new jz(j41Var, new j41(fValueOf2, fValueOf2));
    }

    public jz(j41... j41VarArr) {
        this.a = new ex0(j41VarArr.length);
        this.b = new ex0(j41VarArr.length);
        int length = j41VarArr.length;
        int i = 0;
        while (true) {
            ex0 ex0Var = this.a;
            if (i >= length) {
                lk.r0(ex0Var);
                lk.r0(this.b);
                return;
            } else {
                ex0Var.a(((Number) j41VarArr[i].e).floatValue());
                this.b.a(((Number) j41VarArr[i].f).floatValue());
                i++;
            }
        }
    }
}
