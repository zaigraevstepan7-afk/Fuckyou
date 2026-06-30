package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 {
    public final hh1 a;
    public final n8 b;
    public final zx0 c;

    public sm0(hh1 hh1Var, n8 n8Var) {
        this.a = hh1Var;
        this.b = n8Var;
        long[] jArr = pi1.a;
        this.c = new zx0();
    }

    public final wa0 a(int i, Object obj, Object obj2) {
        zx0 zx0Var = this.c;
        rm0 rm0Var = (rm0) zx0Var.g(obj);
        int i2 = 7;
        if (rm0Var != null && rm0Var.c == i && xi0.o(rm0Var.b, obj2)) {
            jo joVar = rm0Var.d;
            if (joVar != null) {
                return joVar;
            }
            jo joVar2 = new jo(818252804, true, new fi(i2, rm0Var.e, rm0Var));
            rm0Var.d = joVar2;
            return joVar2;
        }
        rm0 rm0Var2 = new rm0(this, i, obj, obj2);
        zx0Var.m(obj, rm0Var2);
        jo joVar3 = rm0Var2.d;
        if (joVar3 != null) {
            return joVar3;
        }
        jo joVar4 = new jo(818252804, true, new fi(i2, this, rm0Var2));
        rm0Var2.d = joVar4;
        return joVar4;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            rm0 rm0Var = (rm0) this.c.g(obj);
            if (rm0Var != null) {
                return rm0Var.b;
            }
            kn0 kn0Var = (kn0) this.b.a();
            int iB = kn0Var.d.b(obj);
            if (iB != -1) {
                kn0Var.b(iB);
            }
        }
        return null;
    }
}
