package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0589u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1883a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f1884b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m1489a(Constructor constructor, InterfaceC0585q interfaceC0585q) {
        try {
            AbstractC0451c.m1145d(constructor.newInstance(interfaceC0585q), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m1490b(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int iIndexOf = str.indexOf(".", 0);
        if (iIndexOf >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i2, iIndexOf);
                sb2.append("_");
                i2 = iIndexOf + 1;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = str.indexOf(".", i2);
            } while (iIndexOf > 0);
            sb2.append((CharSequence) str, i2, str.length());
            str = sb2.toString();
            AbstractC0451c.m1145d(str, "stringBuilder.append(this, i, length).toString()");
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1491c(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i2;
        int i3 = 1;
        HashMap map = f1883a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                AbstractC0451c.m1145d(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC0451c.m1145d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC0451c.m1145d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC0451c.m1145d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strM1490b = m1490b(canonicalName);
                if (name.length() != 0) {
                    strM1490b = name + '.' + strM1490b;
                }
                declaredConstructor = Class.forName(strM1490b).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap map2 = f1884b;
            if (declaredConstructor != null) {
                List listSingletonList = Collections.singletonList(declaredConstructor);
                AbstractC0451c.m1145d(listSingletonList, "singletonList(element)");
                map2.put(cls, listSingletonList);
            } else {
                C0571c c0571c = C0571c.f1861c;
                HashMap map3 = c0571c.f1863b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0593y) declaredMethods[i4].getAnnotation(InterfaceC0593y.class)) != null) {
                                c0571c.m1478a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0585q.class.isAssignableFrom(superclass)) {
                        AbstractC0451c.m1145d(superclass, "superclass");
                        if (m1491c(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC0451c.m1143b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC0451c.m1145d(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    Class<?> cls2 = interfaces[i2];
                                    if (cls2 != null && InterfaceC0585q.class.isAssignableFrom(cls2)) {
                                        AbstractC0451c.m1145d(cls2, "intrface");
                                        if (m1491c(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC0451c.m1143b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i2++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        AbstractC0451c.m1145d(interfaces2, "klass.interfaces");
                        length = interfaces2.length;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                            }
                            i2++;
                        }
                    }
                }
            }
            i3 = 2;
        }
        map.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
