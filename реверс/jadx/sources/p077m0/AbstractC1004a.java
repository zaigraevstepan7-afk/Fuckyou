package p077m0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p084q.C1027f;

/* JADX INFO: renamed from: m0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1004a {

    /* JADX INFO: renamed from: a */
    public final C1027f f3985a;

    /* JADX INFO: renamed from: b */
    public final C1027f f3986b;

    /* JADX INFO: renamed from: c */
    public final C1027f f3987c;

    public AbstractC1004a(C1027f c1027f, C1027f c1027f2, C1027f c1027f3) {
        this.f3985a = c1027f;
        this.f3986b = c1027f2;
        this.f3987c = c1027f3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C1005b mo2448a();

    /* JADX INFO: renamed from: b */
    public final Class m2449b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1027f c1027f = this.f3987c;
        Class cls2 = (Class) c1027f.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1027f.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m2450c(String str) throws NoSuchMethodException {
        C1027f c1027f = this.f3985a;
        Method method = (Method) c1027f.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1004a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1004a.class);
        c1027f.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Method m2451d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C1027f c1027f = this.f3986b;
        Method method = (Method) c1027f.get(name);
        if (method != null) {
            return method;
        }
        Class clsM2449b = m2449b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2449b.getDeclaredMethod("write", cls, AbstractC1004a.class);
        c1027f.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2452e(int i2);

    /* JADX INFO: renamed from: f */
    public final Parcelable m2453f(Parcelable parcelable, int i2) {
        if (!mo2452e(i2)) {
            return parcelable;
        }
        return ((C1005b) this).f3989e.readParcelable(C1005b.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC1006c m2454g() {
        String string = ((C1005b) this).f3989e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC1006c) m2450c(string).invoke(null, mo2448a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo2455h(int i2);

    /* JADX INFO: renamed from: i */
    public final void m2456i(InterfaceC1006c interfaceC1006c) {
        if (interfaceC1006c == null) {
            ((C1005b) this).f3989e.writeString(null);
            return;
        }
        try {
            ((C1005b) this).f3989e.writeString(m2449b(interfaceC1006c.getClass()).getName());
            C1005b c1005bMo2448a = mo2448a();
            try {
                m2451d(interfaceC1006c.getClass()).invoke(null, interfaceC1006c, c1005bMo2448a);
                int i2 = c1005bMo2448a.f3993i;
                if (i2 >= 0) {
                    int i3 = c1005bMo2448a.f3988d.get(i2);
                    Parcel parcel = c1005bMo2448a.f3989e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(iDataPosition - i3);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC1006c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
