package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class ad1 {
    public static final bd1 a;

    static {
        bd1 bd1Var = null;
        try {
            bd1Var = (bd1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (bd1Var == null) {
            bd1Var = new bd1();
        }
        a = bd1Var;
    }

    public static mk a(Class cls) {
        a.getClass();
        return new mk(cls);
    }
}
