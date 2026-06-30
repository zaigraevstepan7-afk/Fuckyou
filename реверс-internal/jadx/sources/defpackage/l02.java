package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l02 {
    public static final ThreadLocal a = new ThreadLocal();

    public static b50 a() {
        ThreadLocal threadLocal = a;
        b50 b50Var = (b50) threadLocal.get();
        if (b50Var != null) {
            return b50Var;
        }
        ag agVar = new ag(Thread.currentThread());
        threadLocal.set(agVar);
        return agVar;
    }
}
