package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p084q.C1031j;

/* JADX INFO: renamed from: androidx.fragment.app.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0512B {

    /* JADX INFO: renamed from: b */
    public static final C1031j f1565b = new C1031j(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0518H f1566a;

    public C0512B(C0518H c0518h) {
        this.f1566a = c0518h;
    }

    /* JADX INFO: renamed from: b */
    public static Class m1324b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1031j c1031j = f1565b;
        C1031j c1031j2 = (C1031j) c1031j.get(classLoader);
        if (c1031j2 == null) {
            c1031j2 = new C1031j(0);
            c1031j.put(classLoader, c1031j2);
        }
        Class cls = (Class) c1031j2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1031j2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m1325c(ClassLoader classLoader, String str) {
        try {
            return m1324b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new C0547q("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new C0547q("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0548r m1326a(String str) {
        try {
            return (AbstractComponentCallbacksC0548r) m1325c(this.f1566a.f1610t.f1806q.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new C0547q("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0547q("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0547q("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0547q("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
