package p051a1;

/* JADX INFO: renamed from: a1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0454f {

    /* JADX INFO: renamed from: a */
    public static final C0455g f1148a;

    static {
        C0455g c0455g = null;
        try {
            c0455g = (C0455g) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0455g == null) {
            c0455g = new C0455g();
        }
        f1148a = c0455g;
    }
}
