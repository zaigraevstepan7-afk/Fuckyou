package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 {
    public static ji0 a(long j, Object obj) {
        ji0 ji0Var = (ji0) f42.c.h(j, obj);
        if (((mb1) ji0Var).e) {
            return ji0Var;
        }
        mb1 mb1Var = (mb1) ji0Var;
        int i = mb1Var.g;
        mb1 mb1VarC = mb1Var.c(i == 0 ? 10 : i * 2);
        f42.o(obj, j, mb1VarC);
        return mb1VarC;
    }
}
