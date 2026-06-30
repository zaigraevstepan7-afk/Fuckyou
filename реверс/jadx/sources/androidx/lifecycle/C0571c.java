package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0571c {

    /* JADX INFO: renamed from: c */
    public static final C0571c f1861c = new C0571c();

    /* JADX INFO: renamed from: a */
    public final HashMap f1862a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1863b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m1477b(HashMap map, C0570b c0570b, EnumC0580l enumC0580l, Class cls) {
        EnumC0580l enumC0580l2 = (EnumC0580l) map.get(c0570b);
        if (enumC0580l2 == null || enumC0580l == enumC0580l2) {
            if (enumC0580l2 == null) {
                map.put(c0570b, enumC0580l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0570b.f1860b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0580l2 + ", new value " + enumC0580l);
    }

    /* JADX INFO: renamed from: a */
    public final C0569a m1478a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1862a;
        if (superclass != null) {
            C0569a c0569aM1478a = (C0569a) map2.get(superclass);
            if (c0569aM1478a == null) {
                c0569aM1478a = m1478a(superclass, null);
            }
            map.putAll(c0569aM1478a.f1858b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0569a c0569aM1478a2 = (C0569a) map2.get(cls2);
            if (c0569aM1478a2 == null) {
                c0569aM1478a2 = m1478a(cls2, null);
            }
            for (Map.Entry entry : c0569aM1478a2.f1858b.entrySet()) {
                m1477b(map, (C0570b) entry.getKey(), (EnumC0580l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0593y interfaceC0593y = (InterfaceC0593y) method.getAnnotation(InterfaceC0593y.class);
            if (interfaceC0593y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0586r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0580l enumC0580lValue = interfaceC0593y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0580l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0580lValue != EnumC0580l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1477b(map, new C0570b(i2, method), enumC0580lValue, cls);
                z2 = true;
            }
        }
        C0569a c0569a = new C0569a(map);
        map2.put(cls, c0569a);
        this.f1863b.put(cls, Boolean.valueOf(z2));
        return c0569a;
    }
}
