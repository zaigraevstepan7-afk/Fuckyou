package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class xr0 {
    public static final nb1 a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r1 instanceof defpackage.nb1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = (defpackage.nb1) r1;
     */
    static {
        Object oe1Var;
        try {
            ClassLoader classLoader = vh1.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof mx) {
                    break;
                } else {
                    i++;
                }
            }
            oe1Var = null;
        } catch (Throwable th) {
            oe1Var = new oe1(th);
        }
        nb1 ys1Var = (nb1) (oe1Var instanceof oe1 ? null : oe1Var);
        if (ys1Var == null) {
            ys1Var = new ys1(new e2(21));
        }
        a = ys1Var;
    }
}
