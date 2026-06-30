package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pk {
    public static final pk c = new pk();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, ok okVar, po0 po0Var, Class cls) {
        po0 po0Var2 = (po0) map.get(okVar);
        if (po0Var2 == null || po0Var == po0Var2) {
            if (po0Var2 == null) {
                map.put(okVar, po0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + okVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + po0Var2 + ", new value " + po0Var);
    }

    public final nk a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            nk nkVarA = (nk) map2.get(superclass);
            if (nkVarA == null) {
                nkVarA = a(superclass, null);
            }
            map.putAll(nkVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            nk nkVarA2 = (nk) map2.get(cls2);
            if (nkVarA2 == null) {
                nkVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : nkVarA2.b.entrySet()) {
                b(map, (ok) entry.getKey(), (po0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            r11 r11Var = (r11) method.getAnnotation(r11.class);
            if (r11Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!xo0.class.isAssignableFrom(parameterTypes[0])) {
                        yc.p("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                po0 po0VarValue = r11Var.value();
                if (parameterTypes.length > 1) {
                    if (!po0.class.isAssignableFrom(parameterTypes[1])) {
                        yc.p("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (po0VarValue != po0.ON_ANY) {
                        yc.p("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    yc.p("cannot have more than 2 params");
                    return null;
                }
                b(map, new ok(i, method), po0VarValue, cls);
                z = true;
            }
        }
        nk nkVar = new nk(map);
        map2.put(cls, nkVar);
        this.b.put(cls, Boolean.valueOf(z));
        return nkVar;
    }
}
