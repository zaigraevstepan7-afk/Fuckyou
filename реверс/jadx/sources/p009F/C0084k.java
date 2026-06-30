package p009F;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: F.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0084k extends C0083j {
    @Override // p009F.C0083j
    /* JADX INFO: renamed from: G0 */
    public final Typeface mo374G0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f256p, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f262v.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p009F.C0083j
    /* JADX INFO: renamed from: K0 */
    public final Method mo377K0(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
