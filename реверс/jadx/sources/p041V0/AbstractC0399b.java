package p041V0;

import p043W0.C0405a;
import p045X0.C0409b;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: V0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399b {

    /* JADX INFO: renamed from: a */
    public static final C0398a f1070a;

    static {
        C0398a c0398a;
        try {
            Object objNewInstance = C0409b.class.newInstance();
            AbstractC0451c.m1145d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c0398a = (C0398a) objNewInstance;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C0398a.class.getClassLoader();
                    if (AbstractC0451c.m1142a(classLoader, classLoader2)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
                }
            } catch (ClassNotFoundException unused) {
                Object objNewInstance2 = C0405a.class.newInstance();
                AbstractC0451c.m1145d(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c0398a = (C0398a) objNewInstance2;
                    } catch (ClassNotFoundException unused2) {
                        c0398a = new C0398a();
                    }
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C0398a.class.getClassLoader();
                    if (AbstractC0451c.m1142a(classLoader3, classLoader4)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object objNewInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            AbstractC0451c.m1145d(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c0398a = (C0398a) objNewInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    AbstractC0451c.m1145d(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        c0398a = (C0398a) objNewInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C0398a.class.getClassLoader();
                        if (AbstractC0451c.m1142a(classLoader5, classLoader6)) {
                            throw e4;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e4);
                    }
                }
            } catch (ClassCastException e5) {
                ClassLoader classLoader7 = objNewInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C0398a.class.getClassLoader();
                if (AbstractC0451c.m1142a(classLoader7, classLoader8)) {
                    throw e5;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e5);
            }
        }
        f1070a = c0398a;
    }
}
