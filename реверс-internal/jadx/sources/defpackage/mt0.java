package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements y81 {
    public final qt0 e;
    public vh0 f;
    public al0 g;
    public vh0 h;
    public oh0 i;

    public mt0(qt0 qt0Var) {
        this.e = qt0Var;
    }

    @Override // defpackage.y81
    public final long a(sh0 sh0Var, long j, al0 al0Var, long j2) {
        oh0 oh0Var = this.i;
        if (oh0Var != null) {
            vh0 vh0Var = this.f;
            if ((vh0Var == null ? false : vh0.a(vh0Var.a, j)) && this.g == al0Var) {
                vh0 vh0Var2 = this.h;
                if (vh0Var2 != null ? vh0.a(vh0Var2.a, j2) : false) {
                    return oh0Var.a;
                }
            }
        }
        long jA = this.e.a(sh0Var, j, al0Var, j2);
        this.f = new vh0(j);
        this.g = al0Var;
        this.h = new vh0(j2);
        this.i = new oh0(jA);
        return jA;
    }
}
